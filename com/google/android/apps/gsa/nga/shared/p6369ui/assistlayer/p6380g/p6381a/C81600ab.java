package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80736dk;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80749dx;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80750dy;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81966ac;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6406c.C82194a;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C81600ab implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81603ae f223216a;

    /* renamed from: b */
    public final /* synthetic */ View f223217b;

    public /* synthetic */ C81600ab(C81603ae aeVar, View view) {
        this.f223216a = aeVar;
        this.f223217b = view;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        int i;
        C81603ae aeVar = this.f223216a;
        View view = this.f223217b;
        C80750dy dyVar = (C80750dy) obj;
        if (dyVar.equals(C80750dy.f221646i)) {
            C82194a.m130506e(view, false);
            C81603ae.m129746j(aeVar.mo75203c(view), 0.0f, aeVar.mo75204f(C81603ae.f223223c));
        } else {
            C82194a.m130506e(view, dyVar.f221652e);
            String str = dyVar.f221653f;
            TextView textView = (TextView) view.findViewById(R.id.nga_input_plate_left_text);
            if (str.isEmpty()) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
                textView.setVisibility(0);
            }
            view.setContentDescription(dyVar.f221654g);
            C81603ae.m129746j(aeVar.mo75203c(view), 1.0f, aeVar.mo75204f(C81603ae.f223222b));
            view.setOnClickListener(new C81623t(aeVar, view, dyVar));
        }
        int a = C80749dx.m128613a(dyVar.f221655h);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 2;
        if (i2 == -1 || i2 == 0) {
            C82194a.m130509h(view);
            view.setBackground((Drawable) null);
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 8388691);
            layoutParams.bottomMargin = view.getContext().getResources().getDimensionPixelOffset(R.dimen.nga_assist_icons_bottom_margin);
            view.setLayoutParams(layoutParams);
            View findViewById = view.findViewById(R.id.nga_input_plate_left_icon);
            int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(R.dimen.nga_assist_vertical_padding);
            findViewById.setPaddingRelative(view.getContext().getResources().getDimensionPixelOffset(R.dimen.nga_assist_horizontal_padding), dimensionPixelOffset, view.getContext().getResources().getDimensionPixelOffset(R.dimen.nga_assist_icon_text_box_end_padding), dimensionPixelOffset);
            view.setBackgroundResource(R.drawable.nga_input_plate_text_box);
        }
        C80736dk dkVar = dyVar.f221650c;
        if (dkVar == null) {
            dkVar = C80736dk.f221621c;
        }
        if (dkVar.f221624b != 0) {
            int a2 = C80749dx.m128613a(dyVar.f221655h);
            if (a2 != 0 && a2 == 3) {
                C82194a.m130510i(view, 2);
            } else {
                C82194a.m130510i(view, 1);
            }
            i = dkVar.f221624b;
        } else {
            ((ImageView) view.findViewById(R.id.nga_input_plate_left_icon)).setImageTintList((ColorStateList) null);
            i = dkVar.f221623a;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.nga_input_plate_left_icon);
        aeVar.f223233m.ifPresent(new C81613j(C81966ac.m130206a(imageView, i), imageView));
        ((TextView) view.findViewById(R.id.nga_input_plate_left_text)).setTextColor(C19391a.m36980a(view.getContext(), R.attr.colorOnSurfaceVariant));
    }
}
