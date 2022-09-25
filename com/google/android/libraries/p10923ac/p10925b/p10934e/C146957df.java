package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10945l.C147177k;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C63979ap;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.df */
/* compiled from: PG */
public final class C146957df extends C68247h {

    /* renamed from: a */
    private final C69464a f396706a;

    /* renamed from: c */
    private final C68283d f396707c;

    /* renamed from: d */
    private final C68283d f396708d;

    /* renamed from: e */
    private final C68283d f396709e;

    /* renamed from: f */
    private final C68283d f396710f;

    public C146957df(C69464a aVar, C69464a aVar2, C69464a aVar3, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C146957df.class), aVar);
        this.f396706a = aVar3;
        this.f396707c = C68236af.m98549d(dVar);
        this.f396708d = C68236af.m98549d(dVar2);
        this.f396709e = C68236af.m98549d(dVar3);
        this.f396710f = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C63979ap apVar;
        List list = (List) obj;
        C68214a a = C68219e.m98518a(this.f396706a);
        C64098p pVar = (C64098p) list.get(0);
        boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
        C68283d dVar = this.f396709e;
        C147177k kVar = (C147177k) list.get(2);
        if (booleanValue) {
            return dVar.mo60297gq();
        }
        if (pVar.f173294a == 2) {
            apVar = (C63979ap) pVar.f173295b;
        } else {
            apVar = C63979ap.f173026e;
        }
        ((C147256m) a.mo27525b()).mo124065h("Changes download skipped for the local %s/%s InternalFootprintsTimeSeriesSyncVariant", Integer.valueOf(apVar.f173029b), Integer.valueOf(apVar.f173030c));
        kVar.mo124001e(0);
        kVar.mo124002f(0, 0);
        return C60866ct.f164955a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396707c.mo60297gq(), this.f396708d.mo60297gq(), this.f396710f.mo60297gq());
    }
}
