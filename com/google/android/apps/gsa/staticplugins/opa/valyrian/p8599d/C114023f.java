package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.util.C113883n;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b.C113954b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.d.f */
/* compiled from: PG */
final class C114023f implements C91096f {

    /* renamed from: a */
    final /* synthetic */ Runnable f315670a;

    /* renamed from: b */
    final /* synthetic */ C113954b f315671b;

    /* renamed from: c */
    final /* synthetic */ ImageView f315672c;

    /* renamed from: d */
    final /* synthetic */ C91097g f315673d;

    public C114023f(Runnable runnable, C113954b bVar, ImageView imageView, C91097g gVar) {
        this.f315670a = runnable;
        this.f315671b = bVar;
        this.f315672c = imageView;
        this.f315673d = gVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        if (i == 1) {
            this.f315670a.run();
        } else if (i == 2) {
            this.f315671b.mo100815a(this.f315672c);
            C113883n.m188525a(this.f315673d, this);
        }
        return true;
    }
}
