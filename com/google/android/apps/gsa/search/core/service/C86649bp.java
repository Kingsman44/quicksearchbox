package com.google.android.apps.gsa.search.core.service;

import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88318xf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88319xg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88320xh;
import com.google.android.apps.gsa.shared.util.BitFlags;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.service.bp */
/* compiled from: PG */
public final class C86649bp {

    /* renamed from: a */
    private final C68214a f234091a;

    public C86649bp(C68214a aVar) {
        this.f234091a = aVar;
    }

    /* renamed from: a */
    public final boolean mo80262a(int i, int i2, StartActivityForResultEventCompoundParcelable startActivityForResultEventCompoundParcelable) {
        C86775r rVar = ((C86610af) this.f234091a.mo27525b()).f233977l;
        if (rVar == null || !BitFlags.m148144f(rVar.f234384f.f236949b.f253762b, 281474976710656L)) {
            return false;
        }
        C88319xg xgVar = (C88319xg) C88320xh.f238846d.createBuilder();
        xgVar.copyOnWrite();
        C88320xh xhVar = (C88320xh) xgVar.instance;
        xhVar.f238848a |= 1;
        xhVar.f238849b = i;
        xgVar.copyOnWrite();
        C88320xh xhVar2 = (C88320xh) xgVar.instance;
        xhVar2.f238850c = i2;
        xhVar2.f238848a |= 2;
        C87684al alVar = new C87684al(C88244um.START_ACTIVITY_FOR_RESULT);
        alVar.mo81966c(startActivityForResultEventCompoundParcelable);
        alVar.mo81965b(C88318xf.f238845a, (C88320xh) xgVar.build());
        rVar.f234383e.mo80379b(alVar.mo81964a());
        return true;
    }
}
