package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ab */
/* compiled from: PG */
public final class C11342ab extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ ContactSelectionField f37064a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11342ab(ContactSelectionField contactSelectionField, Context context, C51027dr[] drVarArr) {
        super(context, R.layout.contact_detail_selected_item, drVarArr);
        this.f37064a = contactSelectionField;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C51027dr drVar = (C51027dr) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.contact_detail_selected_item, (ViewGroup) null);
            this.f37064a.mo19832f(view, i);
        }
        TextView textView = (TextView) view.findViewById(R.id.contact_detail_title_value);
        View findViewById = view.findViewById(R.id.contact_detail_divider);
        if (drVar.f132855b == 2) {
            textView.setText((String) drVar.f132856c);
            textView.setVisibility(0);
            if (i != getCount() - 1) {
                findViewById.setVisibility(0);
            }
        }
        TextView textView2 = (TextView) view.findViewById(R.id.contact_detail_description_label);
        if ((drVar.f132854a & 16) != 0) {
            textView2.setText(drVar.f132861h);
            textView2.setVisibility(0);
        }
        ImageComponent imageComponent = (ImageComponent) view.findViewById(R.id.contact_detail_image_component);
        imageComponent.setVisibility(0);
        if ((drVar.f132854a & 128) != 0) {
            imageComponent.f36858e = true;
            C51012dc dcVar = drVar.f132864k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            imageComponent.mo19786b(dcVar, (Drawable) null);
        }
        return view;
    }
}
