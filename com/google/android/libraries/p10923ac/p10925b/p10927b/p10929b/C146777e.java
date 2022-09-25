package com.google.android.libraries.p10923ac.p10925b.p10927b.p10929b;

import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10956a.p10957a.C147228a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70286co;

/* renamed from: com.google.android.libraries.ac.b.b.b.e */
/* compiled from: PG */
public final class C146777e implements C58881cr {

    /* renamed from: a */
    private final C68214a f396309a;

    /* renamed from: b */
    private final C58881cr f396310b;

    /* renamed from: c */
    private final C58881cr f396311c;

    /* renamed from: d */
    private final Object f396312d = new Object();

    /* renamed from: e */
    private String f396313e;

    /* renamed from: f */
    private Integer f396314f;

    /* renamed from: g */
    private C60870cx f396315g;

    /* renamed from: h */
    private final C147228a f396316h;

    public C146777e(C68214a aVar, C58881cr crVar, C58881cr crVar2, C147228a aVar2) {
        this.f396309a = aVar;
        this.f396310b = crVar;
        this.f396311c = crVar2;
        this.f396316h = aVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6453a() {
        C60870cx cxVar;
        synchronized (this.f396312d) {
            String str = (String) this.f396310b.mo6453a();
            Integer num = (Integer) this.f396311c.mo6453a();
            str.getClass();
            num.getClass();
            if (!num.equals(this.f396314f) || !str.equals(this.f396313e)) {
                C60870cx cxVar2 = this.f396315g;
                if (cxVar2 != null) {
                    try {
                        if (cxVar2.get() instanceof C70286co) {
                            C70286co coVar = (C70286co) this.f396315g.get();
                            coVar.mo61974f();
                            C58838bb.m90884s(coVar.mo61972d(10, TimeUnit.SECONDS), "The channel has not been closed after timeout");
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        ((C147256m) this.f396309a.mo27525b()).mo124069l(e, new Object[0]);
                    } catch (Exception e2) {
                        ((C147256m) this.f396309a.mo27525b()).mo124069l(e2, new Object[0]);
                    }
                }
                this.f396313e = str;
                this.f396314f = num;
                C147228a aVar = this.f396316h;
                this.f396315g = aVar.f397467a.mo90614a(str, num.intValue());
            }
            cxVar = this.f396315g;
        }
        return cxVar;
    }
}
