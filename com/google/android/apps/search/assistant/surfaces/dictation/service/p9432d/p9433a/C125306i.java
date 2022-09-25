package com.google.android.apps.search.assistant.surfaces.dictation.service.p9432d.p9433a;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4543n.p4545b.C59361ab;
import com.google.common.p4543n.p4545b.C59363ad;
import com.google.common.p4543n.p4545b.C59364ae;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.d.a.i */
/* compiled from: PG */
public final /* synthetic */ class C125306i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f345667a;

    /* renamed from: b */
    public final /* synthetic */ Locale f345668b;

    public /* synthetic */ C125306i(C58495hd hdVar, Locale locale) {
        this.f345667a = hdVar;
        this.f345668b = locale;
    }

    public final Object call() {
        C58495hd hdVar = this.f345667a;
        Locale locale = this.f345668b;
        C59364ae l = C59364ae.m92266l(hdVar);
        C59363ad adVar = (C59363ad) l;
        return Boolean.valueOf(adVar.f157565b.allMatch(new C59361ab(adVar, new C125308k(locale))));
    }
}
