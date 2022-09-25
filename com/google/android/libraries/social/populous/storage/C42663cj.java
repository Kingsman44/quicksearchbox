package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.social.populous.storage.cj */
/* compiled from: PG */
final class C42663cj extends C3966s {
    public C42663cj(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        byte[] bArr;
        C42674cu cuVar = (C42674cu) obj;
        lVar.mo8206g(1, cuVar.f111874a);
        lVar.mo8206g(2, cuVar.f111875b);
        lVar.mo8204e(3, cuVar.f111876c);
        C63088z zVar = cuVar.f111877d;
        if (zVar == null) {
            bArr = null;
        } else {
            bArr = zVar.mo59174N();
        }
        if (bArr == null) {
            lVar.mo8205f(4);
        } else {
            lVar.mo8201c(4, bArr);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `RpcCache` (`type`,`key`,`timestamp`,`proto_bytes`) VALUES (?,?,?,?)";
    }
}
