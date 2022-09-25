package com.google.android.libraries.lens.view.p2113h.p2123f;

import com.google.android.libraries.lens.ImagingSession;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.lens.view.h.f.e */
/* compiled from: PG */
public final /* synthetic */ class C26823e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C26827i f73101a;

    /* renamed from: b */
    public final /* synthetic */ boolean f73102b;

    public /* synthetic */ C26823e(C26827i iVar, boolean z) {
        this.f73101a = iVar;
        this.f73102b = z;
    }

    public final Object apply(Object obj) {
        C26827i iVar = this.f73101a;
        boolean z = this.f73102b;
        ImagingSession imagingSession = (ImagingSession) obj;
        synchronized (iVar.f73108b) {
            iVar.f73122p = z;
            C26827i.m49637r(imagingSession, C26832n.m49676c(C26832n.m49674a(z)));
            iVar.mo32201n();
        }
        return null;
    }
}
