package com.google.android.apps.search.googleapp.stampviewer.preview;

import android.os.CountDownTimer;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.p4242bp.p4253e.p4254a.C56190j;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n;
import com.google.protobuf.C62910ar;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.v */
/* compiled from: PG */
public final class C139479v {

    /* renamed from: a */
    public final C56622n f379257a;

    /* renamed from: b */
    public final C28306ab f379258b;

    /* renamed from: c */
    public final C139477t f379259c;

    /* renamed from: d */
    public final C62910ar f379260d;

    /* renamed from: e */
    public final CountDownTimer f379261e;

    public C139479v(C56622n nVar, C28306ab abVar, C139477t tVar, C62910ar arVar) {
        this.f379257a = nVar;
        this.f379258b = abVar;
        this.f379259c = tVar;
        this.f379260d = arVar;
        this.f379261e = new C139478u(Duration.ofSeconds(arVar.f169860a).toMillis(), tVar);
    }

    /* renamed from: a */
    public final boolean mo114999a() {
        C56190j jVar = this.f379257a.f151182d;
        if (jVar == null) {
            jVar = C56190j.f149710d;
        }
        return !jVar.f149712a.isEmpty();
    }
}
