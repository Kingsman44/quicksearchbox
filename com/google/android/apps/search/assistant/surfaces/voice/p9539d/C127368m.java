package com.google.android.apps.search.assistant.surfaces.voice.p9539d;

import com.google.android.apps.gsa.binaries.satin.app.aoo;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9540a.C127176a;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9541b.C127183c;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;
import p5462h.p5482l.C69735o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.m */
/* compiled from: PG */
public final class C127368m {

    /* renamed from: a */
    public static final C59071e f350735a = C59071e.m91331h();

    /* renamed from: b */
    public final AtomicReference f350736b;

    /* renamed from: c */
    public final C58485gu f350737c;

    /* renamed from: d */
    private final C127176a f350738d;

    /* renamed from: e */
    private final C127183c f350739e;

    public C127368m(C127289i iVar, Iterable iterable, Iterable iterable2, C127176a aVar, aoo aoo) {
        C69664n.m101061g(iVar, "initialQueryContext");
        C69664n.m101061g(iterable, "keysAndSuppliers");
        C69664n.m101061g(iterable2, "rawContextProviders");
        C69664n.m101061g(aVar, "loggingContextProviderFactory");
        C69664n.m101061g(aoo, "contextInvalidatorFactory");
        this.f350738d = aVar;
        this.f350736b = new AtomicReference(iVar);
        C58485gu c = C58479go.m89811c(C69734n.m101143k(new C69735o(new C127365j(iterable, iterable2, this, (C69577g) null)), new C127366k(aVar)));
        this.f350737c = c;
        this.f350739e = aoo.a(c);
    }

    /* renamed from: a */
    public final C127289i mo108035a() {
        Object obj = this.f350736b.get();
        C69664n.m101060f(obj, "_currentContext.get()");
        return (C127289i) obj;
    }

    /* renamed from: b */
    public final void mo108036b() {
        this.f350737c.size();
        this.f350739e.mo107988b();
    }

    /* renamed from: c */
    public final void mo108037c() {
        this.f350737c.size();
        this.f350739e.mo107989c();
    }
}
