package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91116o;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.g */
/* compiled from: PG */
public final class C93650g extends C93630e {
    public C93650g(Context context, List list) {
        super(context, list);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C91116o oVar = (C91116o) getItem(i);
        if (view == null) {
            if (oVar.f254418c) {
                view = mo88079a(viewGroup);
            } else {
                view = this.f261381b.inflate(R.layout.location_spinner_element, viewGroup, false);
            }
        }
        if (oVar.f254418c) {
            ((TextView) view).setText(oVar.f254416a);
        } else {
            TextView textView = (TextView) view.findViewById(16908308);
            textView.setSelected(this.f261383d == i);
            textView.setText(oVar.f254416a);
            TextView textView2 = (TextView) view.findViewById(16908309);
            if (!TextUtils.isEmpty(oVar.f254429d)) {
                textView2.setText(oVar.f254429d);
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
        }
        view.setOnClickListener(new C93649f(this, view, i));
        return view;
    }
}
