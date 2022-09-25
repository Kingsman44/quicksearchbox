package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7991b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemLayout;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.p7195y.C91210bo;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p2203m.p2204a.C28487a;
import com.google.assistant.p3861at.C49959fi;
import com.google.assistant.p3861at.C49973fw;
import com.google.assistant.p3861at.C49975fy;
import com.google.assistant.p3861at.C49976fz;
import com.google.assistant.p3861at.C49978ga;
import com.google.assistant.p3861at.C49981gd;
import com.google.assistant.p3861at.C49982ge;
import com.google.assistant.p3861at.C49986gi;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.l.b.g */
/* compiled from: PG */
public final class C101890g {

    /* renamed from: a */
    private final C101860a f284200a;

    /* renamed from: b */
    private final C74555u f284201b;

    /* renamed from: c */
    private final C91189au f284202c;

    public C101890g(C101860a aVar, C74555u uVar, C91189au auVar) {
        this.f284200a = aVar;
        this.f284201b = uVar;
        this.f284202c = auVar;
    }

    /* renamed from: a */
    public final LinearLayout mo92670a(Context context) {
        C49973fw fwVar;
        C49973fw fwVar2;
        C49973fw fwVar3;
        C49975fy fyVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        C49959fi fiVar = this.f284200a.mo92637b().f128887N;
        if (fiVar == null) {
            fiVar = C49959fi.f129877f;
        }
        C49986gi giVar = fiVar.f129883e;
        if (giVar == null) {
            giVar = C49986gi.f129937b;
        }
        C49982ge geVar = giVar.f129939a;
        if (geVar == null) {
            geVar = C49982ge.f129927g;
        }
        C49978ga gaVar = geVar.f129930b;
        if (gaVar == null) {
            gaVar = C49978ga.f129919b;
        }
        for (C49976fz fzVar : gaVar.f129921a) {
            int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, applyDimension, 0, applyDimension);
            int i = fzVar.f129917a;
            if (i == 1) {
                TextView textView = new TextView(context);
                textView.setLayoutParams(layoutParams);
                if (fzVar.f129917a == 1) {
                    fyVar = (C49975fy) fzVar.f129918b;
                } else {
                    fyVar = C49975fy.f129911b;
                }
                textView.setText(fyVar.f129913a);
                textView.setTextAppearance(2132150565);
                linearLayout.addView(textView);
            } else if (i == 2) {
                ItemLayout itemLayout = new ItemLayout(context);
                itemLayout.c().setLayoutParams(layoutParams);
                if (fzVar.f129917a == 2) {
                    fwVar = (C49973fw) fzVar.f129918b;
                } else {
                    fwVar = C49973fw.f129906d;
                }
                if ((fwVar.f129908a & 2) != 0) {
                    C91189au auVar = this.f284202c;
                    if (fzVar.f129917a == 2) {
                        fwVar3 = (C49973fw) fzVar.f129918b;
                    } else {
                        fwVar3 = C49973fw.f129906d;
                    }
                    itemLayout.n(auVar, fwVar3.f129910c, C91210bo.f254595b);
                    itemLayout.m(1);
                    if (this.f284201b.mo70886d().mo70847a().d() == 2) {
                        itemLayout.b().setImageTintList(ColorStateList.valueOf(C28487a.m53260a(context, R.attr.sudListItemIconColor)));
                    } else {
                        itemLayout.l(R.color.agsa_color_on_background_variant);
                    }
                } else {
                    itemLayout.h(0);
                }
                if (fzVar.f129917a == 2) {
                    fwVar2 = (C49973fw) fzVar.f129918b;
                } else {
                    fwVar2 = C49973fw.f129906d;
                }
                itemLayout.p(fwVar2.f129909b);
                itemLayout.e().setTextAppearance(2132150564);
                itemLayout.e().setLineSpacing(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()), 1.0f);
                linearLayout.addView(itemLayout);
            }
        }
        return linearLayout;
    }

    /* renamed from: b */
    public final String mo92671b() {
        C49959fi fiVar = this.f284200a.mo92637b().f128887N;
        if (fiVar == null) {
            fiVar = C49959fi.f129877f;
        }
        C49986gi giVar = fiVar.f129883e;
        if (giVar == null) {
            giVar = C49986gi.f129937b;
        }
        C49982ge geVar = giVar.f129939a;
        if (geVar == null) {
            geVar = C49982ge.f129927g;
        }
        C49981gd gdVar = geVar.f129929a;
        if (gdVar == null) {
            gdVar = C49981gd.f129922c;
        }
        return gdVar.f129925b;
    }

    /* renamed from: c */
    public final String mo92672c() {
        C49959fi fiVar = this.f284200a.mo92637b().f128887N;
        if (fiVar == null) {
            fiVar = C49959fi.f129877f;
        }
        C49986gi giVar = fiVar.f129883e;
        if (giVar == null) {
            giVar = C49986gi.f129937b;
        }
        C49982ge geVar = giVar.f129939a;
        if (geVar == null) {
            geVar = C49982ge.f129927g;
        }
        C49981gd gdVar = geVar.f129929a;
        if (gdVar == null) {
            gdVar = C49981gd.f129922c;
        }
        return gdVar.f129924a;
    }

    /* renamed from: d */
    public final String mo92673d() {
        C49959fi fiVar = this.f284200a.mo92637b().f128887N;
        if (fiVar == null) {
            fiVar = C49959fi.f129877f;
        }
        C49986gi giVar = fiVar.f129883e;
        if (giVar == null) {
            giVar = C49986gi.f129937b;
        }
        C49982ge geVar = giVar.f129939a;
        if (geVar == null) {
            geVar = C49982ge.f129927g;
        }
        return geVar.f129931c;
    }
}
