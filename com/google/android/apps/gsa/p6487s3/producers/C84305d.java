package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90114fl;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66550ag;
import com.google.speech.p5208h.C66555al;
import com.google.speech.p5208h.C66599by;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66612cj;
import com.google.speech.p5208h.C66613ck;
import com.google.speech.p5208h.C66615cm;
import com.google.speech.p5208h.C66678l;
import java.io.IOException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.s3.producers.d */
/* compiled from: PG */
public class C84305d extends C84311j {

    /* renamed from: a */
    private final Future f229430a;

    /* renamed from: b */
    protected final C84300aa f229431b;

    /* renamed from: c */
    private final Future f229432c;

    /* renamed from: d */
    private final Future f229433d;

    /* renamed from: e */
    private final C66678l f229434e;

    /* renamed from: f */
    private final C66550ag f229435f;

    /* renamed from: g */
    private final long f229436g;

    /* renamed from: h */
    private final String f229437h;

    public C84305d(Future future, Future future2, Future future3, C66678l lVar, C66550ag agVar, long j, String str, C86124t tVar) {
        this.f229430a = future;
        this.f229432c = future2;
        this.f229433d = future3;
        this.f229434e = lVar;
        this.f229435f = agVar;
        this.f229436g = j;
        this.f229437h = str;
        this.f229431b = new C84300aa((long) ((int) tVar.mo79743a(C90114fl.f250731e)));
    }

    /* renamed from: d */
    protected static final void m134491d(C66606cd cdVar, C62917ay ayVar, Object obj) {
        if (obj != null && cdVar != null) {
            cdVar.mo58885m(ayVar, obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C66606cd mo77837a() {
        C66606cd a = C118919a.m197403a();
        String str = this.f229437h;
        a.copyOnWrite();
        C66607ce ceVar = (C66607ce) a.instance;
        C66607ce ceVar2 = C66607ce.f181191f;
        str.getClass();
        ceVar.f181193a |= 1;
        ceVar.f181194b = str;
        try {
            mo77851c(a, C66555al.f181030h, this.f229430a, C89885b.S3REQUEST_BUILD_MOBILE_USER_INFO_FAILED_VALUE);
        } catch (C90523o unused) {
        }
        m134491d(a, C66678l.f181385g, this.f229434e);
        m134491d(a, C66550ag.f180993d, this.f229435f);
        try {
            mo77851c(a, C66615cm.f181221k, this.f229433d, C89885b.S3REQUEST_BUILD_S3_USER_INFO_FAILED_VALUE);
        } catch (C90523o unused2) {
        }
        C62940bt btVar = C66613ck.f181216d;
        C66612cj cjVar = (C66612cj) C66613ck.f181215c.createBuilder();
        String b = C39191a.m68623b(this.f229436g);
        cjVar.copyOnWrite();
        C66613ck ckVar = (C66613ck) cjVar.instance;
        b.getClass();
        ckVar.f181218a |= 1;
        ckVar.f181219b = b;
        m134491d(a, btVar, (C66613ck) cjVar.build());
        mo77851c(a, C66599by.f181160q, this.f229432c, C89885b.S3REQUEST_BUILD_S3_CLIENT_INFO_FAILED_VALUE);
        return a;
    }

    /* renamed from: b */
    public boolean mo77850b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo77851c(C66606cd cdVar, C62917ay ayVar, Future future, int i) {
        if (future != null) {
            try {
                cdVar.mo58885m(ayVar, this.f229431b.mo77841a(future));
            } catch (IOException e) {
                throw new C90523o((Throwable) e, i);
            }
        }
    }
}
