package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114878j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cq */
/* compiled from: PG */
final class C115040cq implements C91096f {

    /* renamed from: a */
    final /* synthetic */ ImageView f319318a;

    /* renamed from: b */
    final /* synthetic */ C115041cr f319319b;

    public C115040cq(C115041cr crVar, ImageView imageView) {
        this.f319319b = crVar;
        this.f319318a = imageView;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        if (i != 2) {
            return true;
        }
        this.f319319b.f319322j.mo100815a(this.f319318a);
        C114878j.m190423a(this.f319319b.f319150b, "main_menu", this);
        return true;
    }
}
