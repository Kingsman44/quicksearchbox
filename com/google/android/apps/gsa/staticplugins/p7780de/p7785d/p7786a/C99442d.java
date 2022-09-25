package com.google.android.apps.gsa.staticplugins.p7780de.p7785d.p7786a;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.d.a.d */
/* compiled from: PG */
public final class C99442d {

    /* renamed from: a */
    public static boolean f278262a = false;

    /* renamed from: b */
    public final C91142g f278263b;

    /* renamed from: c */
    public final C28310af f278264c;

    /* renamed from: d */
    public final C28443m f278265d;

    public C99442d(C91142g gVar, C28310af afVar, C28443m mVar) {
        this.f278263b = gVar;
        this.f278264c = afVar;
        this.f278265d = mVar;
    }

    /* renamed from: a */
    public final void mo91457a(Activity activity, View view) {
        ((ViewGroup) activity.findViewById(16908290)).removeView(view);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup.getChildAt(i).setImportantForAccessibility(1);
        }
        C28306ab abVar = this.f278264c.f76997b;
        int i2 = C28485y.f77298f;
        C28306ab.m52929e(activity.findViewById(16908290));
    }
}
