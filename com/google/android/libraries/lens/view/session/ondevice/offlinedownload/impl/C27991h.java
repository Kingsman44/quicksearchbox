package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27980c;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.h */
/* compiled from: PG */
public final /* synthetic */ class C27991h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C27980c f76188a;

    /* renamed from: b */
    public final /* synthetic */ Locale f76189b;

    /* renamed from: c */
    public final /* synthetic */ C25327c f76190c;

    public /* synthetic */ C27991h(C27980c cVar, Locale locale, C25327c cVar2) {
        this.f76188a = cVar;
        this.f76189b = locale;
        this.f76190c = cVar2;
    }

    public final void run() {
        C27980c cVar = this.f76188a;
        Locale locale = this.f76189b;
        C25327c cVar2 = this.f76190c;
        C58974d dVar = OfflineDownloadManagerImpl.f76145a;
        cVar.mo31246b(locale, cVar2);
    }
}
