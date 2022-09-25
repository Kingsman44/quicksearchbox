package com.google.android.libraries.web.contrib.errorpage;

import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.android.libraries.web.contrib.errorpage.p3373a.p3374a.C43510b;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43948y;
import com.google.android.libraries.web.p3428m.C43949z;
import com.google.android.libraries.web.p3428m.p3429a.C43914c;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43909d;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.m */
/* compiled from: PG */
public final class C43525m implements C44107h, C43949z {

    /* renamed from: a */
    public Predicate f113645a = C43521i.f113641a;

    /* renamed from: b */
    public Predicate f113646b = C43522j.f113642a;

    /* renamed from: c */
    public C43512b f113647c;

    /* renamed from: d */
    public Consumer f113648d;

    /* renamed from: e */
    private final C43948y f113649e;

    /* renamed from: f */
    private final C43269t f113650f;

    /* renamed from: g */
    private final C43510b f113651g;

    public C43525m(C43948y yVar, C43269t tVar, WebModelProvider webModelProvider) {
        this.f113649e = yVar;
        this.f113650f = tVar;
        C43510b bVar = (C43510b) webModelProvider.mo47072a(C43510b.class);
        this.f113651g = bVar;
        yVar.mo46938e(this);
        bVar.mo46577b(new C43523k(this));
    }

    /* renamed from: a */
    public final void mo44356a() {
        this.f113651g.mo46577b((Consumer) null);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo46529b(C43904a aVar) {
    }

    /* renamed from: c */
    public final void mo46530c(C43904a aVar) {
        if (this.f113650f.mo46385c().equals(C43271v.WEB_LAYER)) {
            C43909d.m77519a(aVar).mo46919m(new C43524l(this));
        }
        ((C43914c) aVar).mo46411d(C43530r.class);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46531d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo46584e() {
        return ((Integer) this.f113649e.mo46937b().map(C43520h.f113640a).orElse(-1)).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo46585f(Consumer consumer) {
        C43512b bVar = this.f113647c;
        if (!(bVar == null || consumer == null)) {
            consumer.accept(bVar);
        }
        this.f113648d = consumer;
    }
}
