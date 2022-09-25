package com.google.android.libraries.p10923ac.p10925b.p10937f.p10938a;

import com.google.android.libraries.p10923ac.p10925b.p10943j.C147104a;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147115l;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147182p;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a;
import com.google.protos.p4895aw.p4902b.C64097o;
import dagger.C68214a;
import java.io.IOException;

/* renamed from: com.google.android.libraries.ac.b.f.a.k */
/* compiled from: PG */
public final class C147036k implements C147115l {

    /* renamed from: a */
    private final C147030e f397007a;

    /* renamed from: b */
    private final C68214a f397008b;

    public C147036k(C147030e eVar, C68214a aVar) {
        this.f397007a = eVar;
        this.f397008b = aVar;
    }

    /* renamed from: d */
    public final void mo123765d(C147112i iVar, C147112i iVar2) {
        C147104a aVar = (C147104a) iVar2;
        if (C64097o.m96355a(aVar.f397167c.f173294a) != C64097o.REGISTRATION) {
            if (iVar != null || C147182p.m240014b(aVar.f397168d)) {
                if (iVar != null) {
                    if (((C147104a) iVar).f397168d.f173193e == aVar.f397168d.f173193e) {
                        return;
                    }
                }
                try {
                    this.f397007a.mo123835c(((C147104a) iVar2).f397166b);
                } catch (IOException unused) {
                    C147244a aVar2 = (C147244a) this.f397008b.mo27525b();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo123766e(C147112i iVar) {
        C147104a aVar = (C147104a) iVar;
        if (C64097o.m96355a(aVar.f397167c.f173294a) != C64097o.REGISTRATION && C147182p.m240014b(aVar.f397168d)) {
            try {
                this.f397007a.mo123835c(((C147104a) iVar).f397166b);
            } catch (IOException unused) {
                C147244a aVar2 = (C147244a) this.f397008b.mo27525b();
            }
        }
    }
}
