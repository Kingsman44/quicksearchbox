package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.ci */
/* compiled from: PG */
public final class C79786ci extends C79356f {

    /* renamed from: a */
    private final C91022f f218767a;

    /* renamed from: b */
    private final Set f218768b;

    /* renamed from: c */
    private final C76092h f218769c;

    public C79786ci(C91022f fVar, Set set, C76092h hVar, C79359i iVar) {
        super(iVar);
        this.f218767a = fVar;
        this.f218768b = set;
        this.f218769c = hVar;
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f218769c.mo72021b().mo72041f();
    }

    /* renamed from: h */
    public final C60870cx mo71202h() {
        for (C90991b a : this.f218768b) {
            this.f218767a.mo85301a(a);
        }
        return C118826c.f331423b;
    }

    /* renamed from: i */
    public final C60870cx mo71203i() {
        for (C90991b b : this.f218768b) {
            this.f218767a.mo85302b(b);
        }
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "NgaFeedbackDumpInitializer";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 27;
    }
}
