package com.google.android.apps.search.fedora.p10094c;

import com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicReference;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.fedora.c.n */
/* compiled from: PG */
public final class C132739n {

    /* renamed from: a */
    public static final C59071e f362174a = C59071e.m91332i("com.google.android.apps.search.fedora.c.n");

    /* renamed from: b */
    public final C69464a f362175b;

    /* renamed from: c */
    public final C69464a f362176c;

    /* renamed from: d */
    public final AtomicReference f362177d = new AtomicReference();

    /* renamed from: e */
    public final C132728c f362178e;

    /* renamed from: f */
    public final C132732g f362179f;

    public C132739n(C132728c cVar, C69464a aVar, C69464a aVar2, C132732g gVar) {
        this.f362178e = cVar;
        this.f362175b = aVar;
        this.f362176c = aVar2;
        this.f362179f = gVar;
    }

    /* renamed from: a */
    public final void mo110898a() {
        EkhoWriter ekhoWriter = (EkhoWriter) this.f362177d.getAndSet((Object) null);
        if (ekhoWriter != null) {
            ekhoWriter.close();
        }
    }

    /* renamed from: b */
    public final void mo110899b() {
        EkhoWriter ekhoWriter = (EkhoWriter) this.f362177d.get();
        if (ekhoWriter != null) {
            EkhoWriter.nativeFlushAndWait(ekhoWriter.f54364a.get());
        }
    }
}
