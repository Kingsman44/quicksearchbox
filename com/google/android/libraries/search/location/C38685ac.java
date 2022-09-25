package com.google.android.libraries.search.location;

import android.content.Context;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.location.C144894ay;
import com.google.android.gms.location.C144953n;
import com.google.android.gms.tasks.C146004a;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.location.ac */
/* compiled from: PG */
public final /* synthetic */ class C38685ac implements C38688af {

    /* renamed from: a */
    public final /* synthetic */ C38689ag f102157a;

    public /* synthetic */ C38685ac(C38689ag agVar) {
        this.f102157a = agVar;
    }

    /* renamed from: a */
    public final C60870cx mo41551a(C38726z zVar) {
        Context a = C39239a.m68666a(this.f102157a.f102162a, zVar.mo41552a());
        C144953n nVar = new C144953n();
        nVar.mo120458b();
        long millis = C38717w.m67994c(zVar.mo41554c(), zVar.mo41553b()).toMillis();
        C143919bh.m233960c(millis >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
        nVar.f391906a = millis;
        return C43205e.m76192b(C144894ay.m235496a(a).mo120475a(nVar.mo120457a(), (C146004a) null));
    }
}
