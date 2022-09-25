package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.android.libraries.lens.view.p2069am.C25319b;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27980c;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.j */
/* compiled from: PG */
public final /* synthetic */ class C27993j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C27980c f76193a;

    /* renamed from: b */
    public final /* synthetic */ Locale f76194b;

    /* renamed from: c */
    public final /* synthetic */ C25319b f76195c;

    public /* synthetic */ C27993j(C27980c cVar, Locale locale, C25319b bVar) {
        this.f76193a = cVar;
        this.f76194b = locale;
        this.f76195c = bVar;
    }

    public final void run() {
        C27980c cVar = this.f76193a;
        Locale locale = this.f76194b;
        C25319b bVar = this.f76195c;
        C58974d dVar = OfflineDownloadManagerImpl.f76145a;
        cVar.mo31245a(locale, bVar);
    }
}
