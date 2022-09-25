package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147116m;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64095m;
import com.google.protos.p4895aw.p4902b.C64098p;
import com.google.protos.p4895aw.p4902b.C64104v;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.b.o */
/* compiled from: PG */
public final class C146886o extends C68247h {

    /* renamed from: a */
    private final C68283d f396493a;

    /* renamed from: c */
    private final C68283d f396494c;

    /* renamed from: d */
    private final C68283d f396495d;

    public C146886o(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C146886o.class), aVar);
        this.f396493a = C68236af.m98549d(dVar);
        this.f396494c = C68236af.m98549d(dVar2);
        this.f396495d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C147116m mVar = (C147116m) list.get(2);
        ArrayList arrayList = new ArrayList();
        for (C147112i e : mVar.mo123935c((Account) list.get(0), (C64098p) list.get(1))) {
            C64095m e2 = e.mo123926e();
            if (e2 != null && e2.f173285a == 3) {
                arrayList.add((C64104v) e2.f173286b);
            }
        }
        return C60856cj.m92900i(C58485gu.m89842j(arrayList));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396493a.mo60297gq(), this.f396494c.mo60297gq(), this.f396495d.mo60297gq());
    }
}
