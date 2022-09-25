package com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10964f;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146843am;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146851au;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146855ay;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146912bo;
import com.google.android.libraries.p10923ac.p10925b.p10934e.C146914bq;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147116m;
import com.google.common.base.C58838bb;
import com.google.protos.p4895aw.p4902b.C63978ao;
import com.google.protos.p4895aw.p4902b.C63979ap;
import com.google.protos.p4895aw.p4902b.C64097o;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.ac.d.b.b.f.m */
/* compiled from: PG */
public final class C147287m implements C146843am {

    /* renamed from: a */
    public final C146855ay f397545a;

    /* renamed from: b */
    private final C68214a f397546b;

    /* renamed from: c */
    private final C147116m f397547c;

    /* renamed from: d */
    private final C68214a f397548d;

    public C147287m(C68214a aVar, C146855ay ayVar, C147116m mVar, C68214a aVar2) {
        this.f397546b = aVar;
        this.f397545a = ayVar;
        this.f397547c = mVar;
        this.f397548d = aVar2;
    }

    /* renamed from: a */
    public final C146851au mo123743a(Account account, C64098p pVar) {
        C63979ap apVar;
        boolean z = true;
        C58838bb.m90868c(C64097o.m96355a(pVar.f173294a) == C64097o.FOOTPRINTS);
        if (pVar.f173294a == 2) {
            apVar = (C63979ap) pVar.f173295b;
        } else {
            apVar = C63979ap.f173026e;
        }
        C63978ao a = C63978ao.m96329a(apVar.f173031d);
        if (a == null) {
            a = C63978ao.UNKNOWN;
        }
        if (a != C63978ao.SYNC_LATEST_PER_SECONDARY_ID) {
            z = false;
        }
        C58838bb.m90868c(z);
        return new C146851au(this.f397546b, account, pVar, new C147286l(), new C147283i(this, account, pVar), new C146914bq(account, pVar, this.f397547c), new C146912bo(), C147284j.f397542a, this.f397548d);
    }
}
