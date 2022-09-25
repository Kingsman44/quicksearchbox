package com.google.android.libraries.p10923ac.p10925b.p10944k;

import com.google.android.libraries.p10923ac.p10925b.p10927b.C146772b;
import com.google.android.libraries.p10923ac.p10925b.p10927b.C146790c;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147075at;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147104a;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147115l;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147244a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.p4552o.p4566l.C60192dc;
import com.google.protos.p4895aw.p4902b.C64054dj;
import com.google.protos.p4895aw.p4902b.C64097o;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.ac.b.k.z */
/* compiled from: PG */
final class C147166z implements C147115l {

    /* renamed from: a */
    final /* synthetic */ C147160t f397348a;

    /* renamed from: b */
    final /* synthetic */ C68214a f397349b;

    /* renamed from: c */
    final /* synthetic */ C68214a f397350c;

    public C147166z(C147160t tVar, C68214a aVar, C68214a aVar2) {
        this.f397348a = tVar;
        this.f397349b = aVar;
        this.f397350c = aVar2;
    }

    /* renamed from: d */
    public final void mo123765d(C147112i iVar, C147112i iVar2) {
        if (iVar != null) {
            C147104a aVar = (C147104a) iVar;
            C147104a aVar2 = (C147104a) iVar2;
            if (aVar.f397169e.equals(aVar2.f397169e)) {
                aVar.f397168d.equals(aVar2.f397168d);
            }
        }
        try {
            C147160t tVar = this.f397348a;
            synchronized (tVar.f397318i) {
                C147159s a = tVar.mo123988a(new C146772b(((C147104a) iVar2).f397166b, ((C147104a) iVar2).f397167c));
                C64054dj djVar = ((C147104a) iVar2).f397168d;
                Integer a2 = C147137al.m239934a(djVar, djVar.f173191c, ((C146790c) a.f397306j.f397313d.get(C64097o.m96355a(a.f397299c.f173294a))).mo123634a(a.f397299c, a.f397300d), Integer.valueOf((int) a.f397306j.f397324o.mo124071b()));
                if (a2 != null) {
                    C147160t.m239973j();
                    if (C147266a.m240139j()) {
                        a.mo123979c(C60192dc.SYNC_TRIGGER_SUBSCRIPTION);
                    }
                    a.mo123987k(Math.max(((long) a2.intValue()) * 1000, C147266a.m240145p()));
                }
            }
        } catch (C147075at e) {
            ((C147256m) this.f397349b.mo27525b()).mo124063f("Subscribe notify failed", e, new Object[0]);
            C147244a aVar3 = (C147244a) this.f397350c.mo27525b();
        }
    }

    /* renamed from: e */
    public final void mo123766e(C147112i iVar) {
    }
}
