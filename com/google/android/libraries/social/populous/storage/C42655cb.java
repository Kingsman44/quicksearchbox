package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.social.populous.storage.cb */
/* compiled from: PG */
final class C42655cb extends C3966s {
    public C42655cb(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        String str;
        C42693n nVar = (C42693n) obj;
        String str2 = nVar.f111908a;
        if (str2 == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, str2);
        }
        String str3 = nVar.f111909b;
        if (str3 == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8206g(2, str3);
        }
        C42675cv cvVar = nVar.f111910c;
        if (cvVar == null) {
            str = null;
        } else {
            str = cvVar.name();
        }
        if (str == null) {
            lVar.mo8205f(3);
        } else {
            lVar.mo8206g(3, str);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR ABORT INTO `ContextualCandidateTokens` (`candidate_id`,`value`,`source_type`) VALUES (?,?,?)";
    }
}
