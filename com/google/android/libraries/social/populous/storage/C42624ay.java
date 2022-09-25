package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.social.populous.storage.ay */
/* compiled from: PG */
final class C42624ay extends C3966s {
    public C42624ay(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C42685f fVar = (C42685f) obj;
        lVar.mo8204e(1, fVar.f111901a);
        lVar.mo8203d(2, fVar.f111902b);
        String name = fVar.f111903c.name();
        if (name == null) {
            lVar.mo8205f(3);
        } else {
            lVar.mo8206g(3, name);
        }
        byte[] N = fVar.f111904d.mo59174N();
        if (N == null) {
            lVar.mo8205f(4);
        } else {
            lVar.mo8201c(4, N);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR ABORT INTO `Contacts` (`id`,`affinity`,`type`,`proto_bytes`) VALUES (nullif(?, 0),?,?,?)";
    }
}
