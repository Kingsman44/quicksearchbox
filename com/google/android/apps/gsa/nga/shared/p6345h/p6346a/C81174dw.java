package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81277bh;
import com.google.android.apps.gsa.nga.shared.p6345h.C81280bk;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.dw */
/* compiled from: PG */
public final class C81174dw {

    /* renamed from: a */
    public final C22871g f222301a;

    /* renamed from: b */
    public final C42876ab f222302b;

    /* renamed from: c */
    public final C42876ab f222303c;

    /* renamed from: d */
    public final C42876ab f222304d;

    /* renamed from: e */
    public final C42876ab f222305e;

    /* renamed from: f */
    public final C42876ab f222306f;

    /* renamed from: g */
    public final AtomicReference f222307g;

    /* renamed from: h */
    public final AtomicReference f222308h;

    /* renamed from: i */
    public final AtomicReference f222309i;

    /* renamed from: j */
    public final AtomicReference f222310j;

    /* renamed from: k */
    public final AtomicReference f222311k;

    /* renamed from: l */
    private final C60836bq f222312l = new C60836bq();

    public C81174dw(C90821bm bmVar, C81130cf cfVar, C42876ab abVar, C42876ab abVar2, C42876ab abVar3, C42876ab abVar4, C42876ab abVar5) {
        this.f222301a = bmVar.mo85163a(C81173dv.class);
        this.f222302b = abVar;
        this.f222303c = abVar2;
        this.f222304d = abVar3;
        this.f222305e = abVar4;
        this.f222306f = abVar5;
        C81070a aVar = (C81070a) cfVar;
        this.f222307g = new AtomicReference(aVar.f222185a);
        this.f222308h = new AtomicReference(aVar.f222186b);
        this.f222309i = new AtomicReference(aVar.f222187c);
        this.f222310j = new AtomicReference(aVar.f222188d);
        this.f222311k = new AtomicReference(C81172du.f222300a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C81237ab mo74932a() {
        return (C81237ab) ((Supplier) this.f222309i.get()).get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C81277bh mo74933b() {
        return (C81277bh) ((Supplier) this.f222307g.get()).get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C81280bk mo74934c() {
        return (C81280bk) ((Supplier) this.f222308h.get()).get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C60870cx mo74935d() {
        return this.f222312l.mo57305b(new C81166do(this), C60826bg.f164896a);
    }
}
