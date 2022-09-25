package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27979b;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27980c;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.a */
/* compiled from: PG */
public final /* synthetic */ class C27984a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C27980c f76179a;

    /* renamed from: b */
    public final /* synthetic */ Locale f76180b;

    /* renamed from: c */
    public final /* synthetic */ C27979b f76181c;

    public /* synthetic */ C27984a(C27980c cVar, Locale locale, C27979b bVar) {
        this.f76179a = cVar;
        this.f76180b = locale;
        this.f76181c = bVar;
    }

    public final void run() {
        C27980c cVar = this.f76179a;
        Locale locale = this.f76180b;
        C27979b bVar = this.f76181c;
        C58974d dVar = OfflineDownloadManagerImpl.f76145a;
        cVar.mo31247c(locale, bVar);
    }
}
