package com.google.android.libraries.p10923ac.p10925b.p10942i;

import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a;
import dagger.C68214a;
import java.util.Set;

/* renamed from: com.google.android.libraries.ac.b.i.d */
/* compiled from: PG */
public final class C147081d {

    /* renamed from: a */
    private final C68214a f397119a;

    /* renamed from: b */
    private final C68214a f397120b;

    public C147081d(C68214a aVar, C68214a aVar2) {
        this.f397120b = aVar;
        this.f397119a = aVar2;
    }

    /* renamed from: a */
    public final void mo123906a() {
        for (C147091n nVar : (Set) this.f397120b.mo27525b()) {
            try {
                synchronized (nVar.f397144a) {
                    if (!nVar.f397147d) {
                        nVar.f397149f.close();
                        nVar.f397145b.deleteDatabase(nVar.f397146c);
                        nVar.f397147d = true;
                    }
                }
            } catch (Exception unused) {
                C147244a aVar = (C147244a) this.f397119a.mo27525b();
            }
        }
    }
}
