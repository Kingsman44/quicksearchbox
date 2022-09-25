package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146793f;
import com.google.android.libraries.p10923ac.p10925b.p10933d.C146822a;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147078aw;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147176j;
import com.google.common.base.C58838bb;
import com.google.protos.p4895aw.p4902b.C63978ao;
import com.google.protos.p4895aw.p4902b.C63979ap;
import com.google.protos.p4895aw.p4902b.C64097o;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.ac.b.e.bg */
/* compiled from: PG */
public final class C146904bg implements C146793f {

    /* renamed from: a */
    private final C68214a f396555a;

    /* renamed from: b */
    private final C146855ay f396556b;

    /* renamed from: c */
    private final C146906bi f396557c;

    public C146904bg(C68214a aVar, C146855ay ayVar, C146906bi biVar) {
        this.f396555a = aVar;
        this.f396556b = ayVar;
        this.f396557c = biVar;
    }

    /* renamed from: a */
    public final void mo123638a(Account account, C64098p pVar) {
        C63979ap apVar;
        C147078aw b;
        C147078aw b2;
        C58838bb.m90868c(C64097o.m96355a(pVar.f173294a) == C64097o.FOOTPRINTS);
        if (pVar.f173294a == 2) {
            apVar = (C63979ap) pVar.f173295b;
        } else {
            apVar = C63979ap.f173026e;
        }
        C63978ao aoVar = C63978ao.UNKNOWN;
        C63978ao a = C63978ao.m96329a(apVar.f173031d);
        if (a == null) {
            a = C63978ao.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            C146907bj a2 = this.f396557c.mo123794a(account, apVar.f173029b, apVar.f173030c);
            try {
                b = a2.mo123808m().mo123904b();
                a2.mo123806k(b);
                b.mo123901j();
                if (b != null) {
                    b.close();
                }
                if (a2 != null) {
                    a2.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Throwable th2) {
                        C146903bf.m239424a(th, th2);
                    }
                }
                throw th;
            }
        } else if (ordinal != 2) {
            ((C146822a) this.f396555a.mo27525b()).mo123718d(10009, C147176j.m240000a(pVar));
            return;
        } else {
            C146856az a3 = this.f396556b.mo123776a(account, apVar.f173029b, apVar.f173030c);
            try {
                b2 = a3.mo123790m().mo123904b();
                a3.mo123788k(b2);
                b2.mo123901j();
                if (b2 != null) {
                    b2.close();
                }
                if (a3 != null) {
                    a3.close();
                    return;
                }
                return;
            } catch (Throwable th3) {
                if (a3 != null) {
                    try {
                        a3.close();
                    } catch (Throwable th4) {
                        C146903bf.m239424a(th3, th4);
                    }
                }
                throw th3;
            }
        }
        throw th;
        throw th;
    }
}
