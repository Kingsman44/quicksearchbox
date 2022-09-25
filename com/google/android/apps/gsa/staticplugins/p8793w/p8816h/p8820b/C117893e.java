package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8820b;

import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85505a;
import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85515b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60904dr;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.b.e */
/* compiled from: PG */
public final class C117893e {

    /* renamed from: a */
    public static final C59071e f327222a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.h.b.e");

    /* renamed from: b */
    public final C86124t f327223b;

    /* renamed from: c */
    public final C85515b f327224c;

    /* renamed from: d */
    public final C68214a f327225d;

    /* renamed from: e */
    public final Executor f327226e;

    /* renamed from: f */
    public boolean f327227f;

    /* renamed from: g */
    public long f327228g;

    /* renamed from: h */
    public ClientConfig f327229h;

    /* renamed from: i */
    public C85505a f327230i;

    public C117893e(C86124t tVar, C85515b bVar, C68214a aVar, C90851k kVar) {
        this.f327223b = tVar;
        this.f327224c = bVar;
        this.f327225d = aVar;
        this.f327226e = new C60904dr(kVar.mo85210c("AudioFocusHelper"));
    }

    /* renamed from: a */
    public final void mo103479a(long j, ClientConfig clientConfig, C85505a aVar) {
        this.f327226e.execute(new C117891c(this, j, clientConfig, aVar));
    }

    /* renamed from: b */
    public final void mo103480b(long j) {
        this.f327226e.execute(new C117892d(this, j));
    }
}
