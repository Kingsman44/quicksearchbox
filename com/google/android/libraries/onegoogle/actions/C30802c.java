package com.google.android.libraries.onegoogle.actions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.p2345a.C30156a;
import com.google.android.libraries.onegoogle.accountmanagement.C30253a;

/* renamed from: com.google.android.libraries.onegoogle.actions.c */
/* compiled from: PG */
public final class C30802c {
    /* renamed from: a */
    public static C30807h m57499a(C30253a aVar, C30156a aVar2, Context context) {
        if (!C30800a.m57498a(context)) {
            return null;
        }
        C30806g g = C30807h.m57523g();
        g.mo36491d(R.id.og_ai_add_another_account);
        Drawable c = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_gm_ic_person_add_vd_theme_24);
        c.getClass();
        C30803d dVar = (C30803d) g;
        dVar.f83113a = c;
        g.mo36492e(context.getString(R.string.og_add_another_account));
        dVar.f83114b = new C30801b(aVar2, aVar);
        g.mo36493f(90141);
        return g.mo36510g();
    }
}
