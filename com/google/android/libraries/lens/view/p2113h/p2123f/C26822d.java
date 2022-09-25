package com.google.android.libraries.lens.view.p2113h.p2123f;

import com.google.android.libraries.lens.ImagingSession;
import com.google.common.base.C58817ah;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;

/* renamed from: com.google.android.libraries.lens.view.h.f.d */
/* compiled from: PG */
public final /* synthetic */ class C26822d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C26827i f73099a;

    /* renamed from: b */
    public final /* synthetic */ C56280cg f73100b;

    public /* synthetic */ C26822d(C26827i iVar, C56280cg cgVar) {
        this.f73099a = iVar;
        this.f73100b = cgVar;
    }

    public final Object apply(Object obj) {
        C56306df dfVar;
        C26827i iVar = this.f73099a;
        C56280cg cgVar = this.f73100b;
        ImagingSession imagingSession = (ImagingSession) obj;
        synchronized (iVar.f73108b) {
            if (cgVar.f149994a.isEmpty()) {
                dfVar = C56306df.AUTO_FILTER;
            } else {
                dfVar = C56306df.m87964a(((C56278ce) cgVar.f149994a.get(0)).f149991d);
                if (dfVar == null) {
                    dfVar = C56306df.UNKNOWN_FILTER_TYPE;
                }
            }
            iVar.f73126t = dfVar;
            C26827i.m49637r(imagingSession, C26832n.m49676c(C26832n.m49674a(iVar.f73122p)));
            iVar.f73114h = true;
            iVar.f73116j = true;
            iVar.mo32201n();
        }
        return null;
    }
}
