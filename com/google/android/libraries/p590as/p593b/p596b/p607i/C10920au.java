package com.google.android.libraries.p590as.p593b.p596b.p607i;

import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.android.libraries.p590as.p593b.p596b.C10950l;
import com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.as.b.b.i.au */
/* compiled from: PG */
public final /* synthetic */ class C10920au implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C10921av f36021a;

    /* renamed from: b */
    public final /* synthetic */ C10882h f36022b;

    public /* synthetic */ C10920au(C10921av avVar, C10882h hVar) {
        this.f36021a = avVar;
        this.f36022b = hVar;
    }

    public final Object apply(Object obj) {
        C10921av avVar = this.f36021a;
        C10882h hVar = this.f36022b;
        C29690f fVar = (C29690f) obj;
        if (fVar == null) {
            ((C58970a) ((C58970a) C10921av.f36023a.mo56226d()).mo56372aa(54049)).mo56389s("LanguagePack %s is not known by MDD. Caller probably made an error.", hVar);
            return C10950l.m25964e(hVar);
        }
        avVar.f36027e.mo19974a(C37206a.f98767X);
        return avVar.mo19338i(hVar, fVar);
    }
}
