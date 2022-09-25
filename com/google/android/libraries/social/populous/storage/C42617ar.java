package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57883f;

/* renamed from: com.google.android.libraries.social.populous.storage.ar */
/* compiled from: PG */
final class C42617ar extends C3966s {
    public C42617ar(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        byte[] bArr;
        C42680d dVar = (C42680d) obj;
        lVar.mo8204e(1, dVar.f111892a);
        lVar.mo8204e(2, dVar.f111893b);
        lVar.mo8204e(3, dVar.f111894c);
        C57883f fVar = dVar.f111895d;
        if (fVar == null) {
            bArr = null;
        } else {
            bArr = fVar.toByteArray();
        }
        if (bArr == null) {
            lVar.mo8205f(4);
        } else {
            lVar.mo8201c(4, bArr);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `CacheInfo` (`rowid`,`last_updated`,`num_contacts`,`affinity_response_context`) VALUES (?,?,?,?)";
    }
}
