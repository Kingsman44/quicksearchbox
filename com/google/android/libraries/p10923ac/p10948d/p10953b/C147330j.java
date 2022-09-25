package com.google.android.libraries.p10923ac.p10948d.p10953b;

import android.os.Bundle;
import android.util.Base64;
import com.google.android.libraries.p10923ac.p10925b.p10927b.p10928a.C146771a;
import com.google.android.libraries.p10923ac.p10925b.p10934e.p10935a.C146830d;
import com.google.android.libraries.p10923ac.p10925b.p10941h.C147054b;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147111h;
import com.google.android.libraries.p10923ac.p10947c.C147202d;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f.C147270a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f.C147282h;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f.C147292r;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f.p10965a.C147272b;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f.p10965a.C147274d;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64020cc;
import dagger.p5294a.C68225k;
import dagger.p5294a.C68226l;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.d.b.j */
/* compiled from: PG */
public final class C147330j implements C147325e {

    /* renamed from: a */
    private final C147329i f397715a;

    public C147330j(C147329i iVar) {
        this.f397715a = iVar;
    }

    /* renamed from: a */
    public final C147202d mo124095a() {
        C147324d dVar = (C147324d) this.f397715a;
        C146771a aVar = dVar.f397645a.f397480a;
        C68225k.m98532d(aVar);
        C147111h z = dVar.mo124094z();
        C68226l.m98533a(dVar.f397689b);
        C146830d dVar2 = new C146830d(C68226l.m98533a(dVar.f397689b), dVar.f397694g, dVar.f397692e);
        C68226l.m98533a(dVar.f397689b);
        C147282h hVar = new C147282h(aVar, z, dVar2, dVar.mo124092A());
        C146771a aVar2 = dVar.f397645a.f397480a;
        C68225k.m98532d(aVar2);
        C147111h z2 = dVar.mo124094z();
        C68226l.m98533a(dVar.f397689b);
        C68226l.m98533a(dVar.f397689b);
        C68226l.m98533a(dVar.f397689b);
        C69464a aVar3 = dVar.f397693f;
        return new C147270a(hVar, new C147292r(aVar2, z2, new C147272b(aVar3), new C147274d(aVar3), dVar.mo124092A()));
    }

    /* renamed from: b */
    public final C60870cx mo124096b(C64020cc ccVar) {
        Bundle bundle = new Bundle();
        bundle.putString("notifications", Base64.encodeToString(ccVar.toByteArray(), 0));
        return this.f397715a.mo124093y().mo123853a(bundle);
    }

    /* renamed from: c */
    public final Map mo124097c() {
        C58490gz gzVar = new C58490gz(4);
        C147324d dVar = (C147324d) this.f397715a;
        for (Map.Entry entry : C58495hd.m89904r("mdh-subscription-cleanup", (C147054b) dVar.f397697j.mo17428b(), "mdh-wipeout", (C147054b) dVar.f397698k.mo17428b(), "mdh-regularsync", (C147054b) dVar.f397696i.mo17428b(), "mdh-forcedsync", (C147054b) dVar.f397699l.mo17428b(), "mdh-pn", dVar.mo124093y()).entrySet()) {
            gzVar.mo55429h((String) entry.getKey(), new C147326f(entry));
        }
        return gzVar.mo55427f(true);
    }
}
