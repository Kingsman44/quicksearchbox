package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6586bf.C84838e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C89995ba;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p10923ac.p10924a.C146764g;
import com.google.android.libraries.p10923ac.p10924a.C146765h;
import com.google.android.libraries.p10923ac.p10924a.C146767j;
import com.google.android.libraries.p10923ac.p10947c.C147199a;
import com.google.android.libraries.p10923ac.p10947c.C147203e;
import com.google.android.libraries.p10923ac.p10947c.C147204f;
import com.google.android.libraries.p10923ac.p10947c.C147205g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.af */
/* compiled from: PG */
public final class C97276af extends C86734a implements C84838e {

    /* renamed from: a */
    public static final C59071e f271682a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bv.af");

    /* renamed from: b */
    public final C68214a f271683b;

    /* renamed from: c */
    public final C68214a f271684c;

    /* renamed from: f */
    public final C86054o f271685f;

    /* renamed from: g */
    public final C21370a f271686g;

    /* renamed from: h */
    private final C22871g f271687h;

    public C97276af(C68214a aVar, C68214a aVar2, C86054o oVar, C22871g gVar, C21370a aVar3) {
        super(C118575h.WORKER_MDH_YOUTUBE, "mdh_youtube");
        this.f271683b = aVar;
        this.f271684c = aVar2;
        this.f271685f = oVar;
        this.f271687h = gVar;
        this.f271686g = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo78522a() {
        C97273ac acVar = new C97273ac(this);
        int a = (int) ((C86124t) this.f271683b.mo27525b()).mo79743a(C89995ba.f246755c);
        if (a > 0) {
            return this.f271687h.mo28203c("Delayed YouTube MDH read", (long) a, acVar);
        }
        return this.f271687h.mo28202b("YouTube MDH read", acVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C60870cx mo90618c(C147205g gVar, byte[] bArr) {
        C147204f fVar;
        C86124t tVar = (C86124t) this.f271683b.mo27525b();
        int a = (int) tVar.mo79743a(C90085ej.f250141aR);
        int a2 = (int) tVar.mo79743a(C90085ej.f250142aS);
        if (bArr == null) {
            fVar = C147204f.f397421b;
        } else {
            C147204f fVar2 = C147204f.f397421b;
            ArrayList arrayList = new ArrayList();
            C147203e.m240051a(bArr, 1, arrayList);
            fVar = new C147199a(arrayList);
        }
        C146764g i = C146765h.m239123i();
        C146767j jVar = new C146767j();
        jVar.mo123622b(a, TimeUnit.SECONDS);
        i.mo123619b(jVar.mo123621a());
        i.mo123620c(Integer.valueOf(a2));
        gVar.mo124032b(i.mo123618a(), fVar);
        C60870cx g = C60922j.m93044g(gVar.mo124031a(fVar), new C97272ab(this), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
