package faculdade.meusapps.tiboy.faculdade;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tiboy on 30/11/16.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    String[]fruts;
    public CustomAdapter(Context context, String[]fruts) {

        super(context, R.layout.custom_row,fruts);
        this.fruts = fruts;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        LayoutInflater frutsInflater = LayoutInflater.from(getContext());
        View customView = frutsInflater.inflate(R.layout.custom_row,parent,false);

        String simpleFrutItem = getItem(position);
       // os dois componentes visuais o nome da fruta e a imagem
        TextView frutText = (TextView) customView.findViewById(R.id.textView_frutname);
        ImageView frutImage = (ImageView)customView.findViewById(R.id.frutpic);


        //esses ifs servem para colocar as imagens em cada posição da lista
        if(fruts[position].equals("apple")){
            frutImage.setImageDrawable(parent.getResources().getDrawable(R.drawable.apple));

        }
        if(fruts[position].equals("banana")){
            frutImage.setImageDrawable(parent.getResources().getDrawable(R.drawable.banana));

        }
        if(fruts[position].equals("strawberry")){
            frutImage.setImageDrawable(parent.getResources().getDrawable(R.drawable.strawberry));

        }

        if(fruts[position].equals("orange")){
            frutImage.setImageDrawable(parent.getResources().getDrawable(R.drawable.orange));

        }


        if(fruts[position].equals("bluebarry")){
            frutImage.setImageDrawable(parent.getResources().getDrawable(R.drawable.blueberry));

        }

        if(fruts[position].equals("kiwi")){
            frutImage.setImageDrawable(parent.getResources().getDrawable(R.drawable.kiwi));

        }
        //



        //
        frutText.setText(simpleFrutItem);
        //frutImage.setImageResource(R.drawable.banana);

        return customView;
    }
}
