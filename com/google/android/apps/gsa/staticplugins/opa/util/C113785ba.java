package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.ba */
/* compiled from: PG */
public final class C113785ba {

    /* renamed from: a */
    public static final C59071e f315123a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.ba");

    /* renamed from: b */
    static final long f315124b = TimeUnit.HOURS.toMillis(4);

    /* renamed from: c */
    public final Optional f315125c;

    /* renamed from: d */
    public final C58881cr f315126d;

    /* renamed from: e */
    public final C60950i f315127e;

    /* renamed from: f */
    public final C86124t f315128f;

    /* renamed from: g */
    public final C68214a f315129g;

    /* renamed from: h */
    public final C84466a f315130h;

    /* renamed from: i */
    private final C22871g f315131i;

    public C113785ba(Optional optional, C58881cr crVar, C60950i iVar, C86124t tVar, C68214a aVar, C22871g gVar, C84466a aVar2) {
        this.f315125c = optional;
        this.f315126d = crVar;
        this.f315127e = iVar;
        this.f315128f = tVar;
        this.f315129g = aVar;
        this.f315131i = gVar;
        this.f315130h = aVar2;
    }

    /* renamed from: a */
    public final void mo100624a(Optional optional) {
        if (this.f315125c.isPresent()) {
            new C90873ag(((C42876ab) ((C68214a) this.f315125c.get()).mo27525b()).mo46039a(new C113781ax(this, optional), C60826bg.f164896a), this.f315131i, "Write to education preferences", new C113782ay(this)).mo85223a(C113783az.f315118a);
        }
    }
}
