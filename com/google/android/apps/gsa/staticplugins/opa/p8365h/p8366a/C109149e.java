package com.google.android.apps.gsa.staticplugins.opa.p8365h.p8366a;

import android.os.Looper;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.staticplugins.opa.p8365h.C109176d;
import com.google.android.apps.gsa.staticplugins.opa.p8365h.C109177e;
import com.google.android.apps.gsa.staticplugins.opa.p8365h.C109178f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60888db;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.h.a.e */
/* compiled from: PG */
public final class C109149e implements C109176d {

    /* renamed from: a */
    public final C58974d f303952a;

    /* renamed from: b */
    public final C58528ij f303953b;

    /* renamed from: c */
    public final C109177e f303954c;

    /* renamed from: d */
    public final C60888db f303955d;

    public C109149e(C60888db dbVar, C109178f fVar, Set set, Optional optional, C83564a aVar) {
        this.f303955d = dbVar;
        C68214a a = C68219e.m98518a(((C68226l) fVar.f303996a).f184585a);
        a.getClass();
        C60888db dbVar2 = (C60888db) fVar.f303997b.mo17428b();
        dbVar2.getClass();
        C47770dh dhVar = (C47770dh) fVar.f303998c.mo17428b();
        dhVar.getClass();
        Looper looper = (Looper) fVar.f303999d.mo17428b();
        looper.getClass();
        C83564a aVar2 = (C83564a) fVar.f304000e.mo17428b();
        aVar2.getClass();
        this.f303954c = new C109177e(a, dbVar2, dhVar, looper, aVar2, this);
        this.f303953b = C58528ij.m90006F(set);
        optional.ifPresent(C109147c.f303949a);
        this.f303952a = aVar.mo76900a("AmbBrdcstRcvrBProvider");
    }
}
