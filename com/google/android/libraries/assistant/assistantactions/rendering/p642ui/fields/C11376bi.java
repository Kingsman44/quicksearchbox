package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.content.pm.PackageManager;
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
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bi */
/* compiled from: PG */
public final class C11376bi extends ArrayAdapter {
    public C11376bi(Context context, C51027dr[] drVarArr) {
        super(context, R.layout.vertical_view_list_item, drVarArr);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C51027dr drVar = (C51027dr) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.vertical_view_list_item, (ViewGroup) null);
        }
        ImageComponent imageComponent = (ImageComponent) view.findViewById(R.id.icon);
        TextView textView = (TextView) view.findViewById(R.id.title);
        TextView textView2 = (TextView) view.findViewById(R.id.description);
        TextView textView3 = (TextView) view.findViewById(R.id.sub_description);
        TextView textView4 = (TextView) view.findViewById(R.id.status);
        imageComponent.setVisibility(8);
        textView.setVisibility(8);
        textView2.setVisibility(8);
        textView3.setVisibility(8);
        textView4.setVisibility(8);
        if ((drVar.f132854a & 128) != 0) {
            imageComponent.f36858e = true;
            C51012dc dcVar = drVar.f132864k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            imageComponent.mo19786b(dcVar, (Drawable) null);
            imageComponent.setVisibility(0);
        }
        if (drVar.f132855b == 2) {
            textView.setText((String) drVar.f132856c);
            textView.setVisibility(0);
        } else {
            C51012dc dcVar2 = drVar.f132864k;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            if ((dcVar2.f132815a & 32) != 0) {
                try {
                    PackageManager packageManager = getContext().getPackageManager();
                    C51012dc dcVar3 = drVar.f132864k;
                    if (dcVar3 == null) {
                        dcVar3 = C51012dc.f132813k;
                    }
                    textView.setText((String) getContext().getPackageManager().getApplicationLabel(packageManager.getApplicationInfo(dcVar3.f132821g, 128)));
                    textView.setVisibility(0);
                } catch (PackageManager.NameNotFoundException e) {
                    C59052c cVar = (C59052c) ((C59052c) ((C59052c) ListField.f37003a.mo56225c()).mo56382g(e)).mo56372aa(43266);
                    C51012dc dcVar4 = drVar.f132864k;
                    if (dcVar4 == null) {
                        dcVar4 = C51012dc.f132813k;
                    }
                    cVar.mo56389s("Invalid package name: %s", dcVar4.f132821g);
                }
            }
        }
        if ((drVar.f132854a & 16) != 0) {
            textView2.setText(drVar.f132861h);
            textView2.setVisibility(0);
        }
        if ((drVar.f132854a & 32) != 0) {
            textView3.setText(drVar.f132862i);
            textView3.setVisibility(0);
        }
        if ((drVar.f132854a & 64) != 0) {
            textView4.setText(drVar.f132863j);
            textView4.setVisibility(0);
        }
        return view;
    }
}
