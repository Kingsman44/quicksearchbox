package com.google.android.libraries.componentview.components.elements;

import com.google.android.libraries.componentview.components.elements.p1696a.C20382g;
import com.google.android.libraries.componentview.components.elements.p1696a.C20383h;
import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20483n;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56426e;
import com.google.p4271bq.C56429h;

/* renamed from: com.google.android.libraries.componentview.components.elements.w */
/* compiled from: PG */
public class C20466w extends C20483n {

    /* renamed from: a */
    protected final C20537f f57575a;

    /* renamed from: b */
    public final C20601ca f57576b;

    /* renamed from: c */
    public C20383h f57577c;

    /* renamed from: d */
    public C56426e f57578d;

    /* renamed from: e */
    private final SettableFuture f57579e = new SettableFuture();

    public C20466w(C56425d dVar, C20537f fVar, C20601ca caVar) {
        super(dVar);
        this.f57575a = fVar;
        this.f57576b = caVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C20382g gVar = (C20382g) this.f57577c.toBuilder();
            gVar.copyOnWrite();
            C20383h hVar = (C20383h) gVar.instance;
            hVar.f57316b = dVar;
            hVar.f57315a |= 1;
            this.f57577c = (C20383h) gVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        C56426e eVar = this.f57578d;
        cVar.copyOnWrite();
        C56425d dVar2 = (C56425d) cVar.instance;
        C56429h hVar2 = (C56429h) eVar.build();
        hVar2.getClass();
        dVar2.f150542d = hVar2;
        dVar2.f150539a |= 4;
        cVar.mo58885m(C20383h.f57313d, this.f57577c);
        return (C56425d) cVar.build();
    }

    /* renamed from: kx */
    public final void mo25108kx() {
        C20470a aVar = this.f57601m;
        if (aVar == null) {
            this.f57579e.mo57356n(new C19744c());
            return;
        }
        C60870cx b = aVar.mo25099b();
        if (b == null) {
            this.f57579e.mo57356n(new C19744c());
        } else {
            this.f57579e.mo57358p(b);
        }
    }
}
