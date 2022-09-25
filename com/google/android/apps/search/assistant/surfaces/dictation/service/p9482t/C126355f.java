package com.google.android.apps.search.assistant.surfaces.dictation.service.p9482t;

import com.google.android.apps.gsa.nga.engine.p6262y.p6265b.p6266a.C79895b;
import com.google.android.apps.gsa.nga.engine.p6262y.p6265b.p6266a.C79897d;
import com.google.android.apps.gsa.nga.engine.p6262y.p6265b.p6266a.C79899f;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126323bd;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58486gv;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.t.f */
/* compiled from: PG */
public final /* synthetic */ class C126355f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Locale f348044a;

    public /* synthetic */ C126355f(Locale locale) {
        this.f348044a = locale;
    }

    public final Object apply(Object obj) {
        Locale locale = this.f348044a;
        C58486gv gvVar = new C58486gv();
        C126323bd bdVar = new C126323bd(locale);
        for (C79899f fVar : ((C79897d) obj).f218994a) {
            for (C79895b bVar : fVar.f218998b) {
                gvVar.mo55419c(bdVar.mo107533a(fVar.f218997a), bVar.f218990a);
            }
        }
        return new C126350a(bdVar, gvVar.mo55417a());
    }
}
