package com.google.android.apps.gsa.staticplugins.p7426ay;

import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57004n;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.HashSet;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ay.e */
/* compiled from: PG */
public final class C94421e extends C68247h {

    /* renamed from: a */
    private final C69464a f263975a;

    /* renamed from: c */
    private final C68283d f263976c;

    public C94421e(C69464a aVar, C69464a aVar2, C69464a aVar3, C68283d dVar) {
        super(aVar2, new C68277d(C94421e.class), aVar);
        this.f263975a = aVar3;
        this.f263976c = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C68214a a = C68219e.m98518a(this.f263975a);
        HashSet hashSet = new HashSet();
        for (Integer intValue : ((C57004n) obj).f152173e) {
            hashSet.add(Integer.valueOf(intValue.intValue()));
        }
        if (hashSet.isEmpty()) {
            ((C89911f) a.mo27525b()).mo83756b(new C90452a(211, C89885b.PUSH_UPDATES_NO_DESTINATION_VALUE)).mo83721a();
        }
        return C60856cj.m92900i(hashSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f263976c.mo60297gq();
    }
}
