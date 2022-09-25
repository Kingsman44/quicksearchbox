package com.google.android.apps.search.googleapp.discover.p10189g;

import android.content.DialogInterface;
import com.facebook.litho.LithoView;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40025af;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40027ah;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import p5488io.p5490b.p5494b.C69802a;

/* renamed from: com.google.android.apps.search.googleapp.discover.g.m */
/* compiled from: PG */
public final class C134342m implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ LithoView f365926a;

    /* renamed from: b */
    final /* synthetic */ C69802a f365927b;

    /* renamed from: c */
    final /* synthetic */ C57696b f365928c;

    /* renamed from: d */
    final /* synthetic */ C40027ah f365929d;

    public C134342m(LithoView lithoView, C69802a aVar, C57696b bVar, C40027ah ahVar) {
        this.f365926a = lithoView;
        this.f365927b = aVar;
        this.f365928c = bVar;
        this.f365929d = ahVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C134340k.m217959a(this.f365926a);
        this.f365927b.dispose();
        C57696b bVar = this.f365928c;
        if (bVar != null) {
            ((C40025af) this.f365929d).mo42132f(3, bVar);
        }
    }
}
