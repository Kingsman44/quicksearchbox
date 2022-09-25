package com.google.android.apps.gsa.staticplugins.p7761cz;

import com.google.android.apps.gsa.p6487s3.C84294l;
import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.p6487s3.C84332u;
import com.google.android.apps.gsa.p6487s3.C84333v;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.speech.p7295k.p7296a.C92439c;
import com.google.common.base.C58838bb;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cz.s */
/* compiled from: PG */
final class C99261s implements C84333v {

    /* renamed from: a */
    private final C89012aj f277681a;

    /* renamed from: b */
    private final C89061q f277682b;

    /* renamed from: c */
    private final C84332u f277683c;

    /* renamed from: d */
    private final boolean f277684d;

    /* renamed from: e */
    private final C68214a f277685e;

    /* renamed from: f */
    private C84294l f277686f;

    /* renamed from: g */
    private final C99248f f277687g;

    public C99261s(C99248f fVar, C89012aj ajVar, C89061q qVar, C84332u uVar, boolean z, C68214a aVar) {
        this.f277687g = fVar;
        this.f277681a = ajVar;
        this.f277682b = qVar;
        this.f277683c = uVar;
        this.f277684d = z;
        this.f277685e = aVar;
    }

    /* renamed from: a */
    public final synchronized void mo77826a() {
        C84294l lVar = this.f277686f;
        if (lVar != null) {
            lVar.mo77825b();
            this.f277686f = null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo77827b(C84295m mVar, C92439c cVar) {
        C58838bb.m90869d(this.f277686f == null, "Start has already been called");
        C84294l b = this.f277687g.mo91391b(mVar, this.f277681a, this.f277682b, cVar, this.f277683c, this.f277684d, false, this.f277685e);
        this.f277686f = b;
        b.mo77824a();
    }
}
