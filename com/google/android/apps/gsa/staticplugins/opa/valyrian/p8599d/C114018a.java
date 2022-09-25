package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d;

import android.widget.ImageView;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.util.C113883n;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8597b.C113954b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.d.a */
/* compiled from: PG */
public final /* synthetic */ class C114018a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Runnable f315662a;

    /* renamed from: b */
    public final /* synthetic */ C91097g f315663b;

    /* renamed from: c */
    public final /* synthetic */ C113954b f315664c;

    /* renamed from: d */
    public final /* synthetic */ ImageView f315665d;

    public /* synthetic */ C114018a(Runnable runnable, C91097g gVar, C113954b bVar, ImageView imageView) {
        this.f315662a = runnable;
        this.f315663b = gVar;
        this.f315664c = bVar;
        this.f315665d = imageView;
    }

    public final void run() {
        Runnable runnable = this.f315662a;
        C91097g gVar = this.f315663b;
        C113883n.m188525a(gVar, new C114023f(runnable, this.f315664c, this.f315665d, gVar));
    }
}
