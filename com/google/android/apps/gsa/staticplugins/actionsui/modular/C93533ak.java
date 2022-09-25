package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.logger.p7065j.C89941l;
import com.google.android.googlequicksearchbox.R;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55419v;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ak */
/* compiled from: PG */
public final class C93533ak extends ArrayAdapter {

    /* renamed from: a */
    private final C88511e f261172a;

    public C93533ak(Context context, List list, C88511e eVar) {
        super(context, R.layout.action_card_app_choice, list);
        this.f261172a = eVar;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Drawable drawable;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.action_card_app_choice, (ViewGroup) null);
            C89941l.m146512c(view, 8347);
        }
        C55361pn pnVar = (C55361pn) getItem(i);
        if (pnVar != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.app_image_icon);
            TextView textView = (TextView) view.findViewById(R.id.app_name);
            int a = C55419v.m87685a(pnVar.f145872e);
            if (a != 0 && a == 13) {
                drawable = getContext().getResources().getDrawable(R.drawable.ic_sms_black_blue, getContext().getApplicationContext().getTheme());
            } else {
                drawable = this.f261172a.mo82072a(pnVar, getContext());
            }
            imageView.setImageDrawable(drawable);
            textView.setText(pnVar.f145869b);
        }
        return view;
    }
}
