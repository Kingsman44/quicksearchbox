package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.social.populous.storage.cq */
/* compiled from: PG */
final class C42670cq extends C3966s {
    public C42670cq(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        C42681da daVar = (C42681da) obj;
        lVar.mo8204e(1, daVar.f111896a);
        String str = daVar.f111897b;
        if (str == null) {
            lVar.mo8205f(2);
        } else {
            lVar.mo8206g(2, str);
        }
        lVar.mo8203d(3, daVar.f111898c);
        String b = C42681da.m75377b(daVar.f111899d);
        if (b == null) {
            lVar.mo8205f(4);
        } else {
            lVar.mo8206g(4, b);
        }
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR ABORT INTO `Tokens` (`contact_id`,`value`,`affinity`,`field_type`) VALUES (?,?,?,?)";
    }
}
