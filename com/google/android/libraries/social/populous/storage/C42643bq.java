package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.social.populous.storage.bq */
/* compiled from: PG */
final class C42643bq extends C3966s {
    public C42643bq(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C42689j jVar = (C42689j) obj;
        String str = jVar.f111906a;
        if (str == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, str);
        }
        byte[] N = jVar.f111907b.mo59174N();
        if (N == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8201c(2, N);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `ContextualCandidates` (`id`,`proto_bytes`) VALUES (?,?)";
    }
}
