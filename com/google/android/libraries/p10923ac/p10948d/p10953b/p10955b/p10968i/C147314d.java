package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10968i;

import com.google.android.libraries.p10923ac.p10925b.p10942i.C147078aw;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147088k;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147173g;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147179m;

/* renamed from: com.google.android.libraries.ac.d.b.b.i.d */
/* compiled from: PG */
public final class C147314d implements C147179m {

    /* renamed from: a */
    final /* synthetic */ C147315e f397603a;

    public C147314d(C147315e eVar) {
        this.f397603a = eVar;
    }

    /* renamed from: b */
    public final Integer mo124004a() {
        C147078aw b;
        C147088k kVar = (C147088k) this.f397603a.f397605b.mo124004a();
        try {
            b = kVar.mo123879j().mo123904b();
            int a = (int) C147173g.m239996a(kVar.mo123869a(b, C147315e.f397604a), 0);
            kVar.mo123875f(b, C147315e.f397604a, C147173g.m239997b(((long) a) + 1));
            b.mo123901j();
            if (b != null) {
                b.close();
            }
            if (kVar != null) {
                kVar.close();
            }
            return Integer.valueOf(a);
        } catch (Throwable th) {
            if (kVar != null) {
                try {
                    kVar.close();
                } catch (Throwable th2) {
                    C147313c.m240205a(th, th2);
                }
            }
            throw th;
        }
        throw th;
    }
}
