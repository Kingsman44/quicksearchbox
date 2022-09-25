package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91109h;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.i */
/* compiled from: PG */
public final class C93652i extends C93630e {
    public C93652i(Context context, List list) {
        super(context, list);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C91109h b = getItem(i);
        boolean z = false;
        if (view == null) {
            if (b.f254418c) {
                view = mo88079a(viewGroup);
            } else {
                view = this.f261381b.inflate(R.layout.action_card_dropdown_content, viewGroup, false);
            }
        }
        if (b.f254418c) {
            ((TextView) view).setText(b.f254416a);
        } else {
            TextView textView = (TextView) view.findViewById(R.id.text1);
            if (this.f261383d == i) {
                z = true;
            }
            textView.setSelected(z);
            textView.setText(b.f254416a);
        }
        view.setOnClickListener(new C93651h(this, view, i));
        return view;
    }
}
