package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.mdi.download.C28739bq;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.f */
/* compiled from: PG */
public final /* synthetic */ class C122319f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122165am f339179a;

    /* renamed from: b */
    public final /* synthetic */ C28740br f339180b;

    public /* synthetic */ C122319f(C122165am amVar, C28740br brVar) {
        this.f339179a = amVar;
        this.f339180b = brVar;
    }

    public final C60870cx apply(Object obj) {
        C122165am amVar = this.f339179a;
        C28740br brVar = this.f339180b;
        Optional optional = (Optional) obj;
        if (optional.isEmpty() || brVar.mo34349h().mo56113h()) {
            return ((C29409fd) amVar.f338838c.mo27525b()).mo34715d(brVar);
        }
        C28739bq b = brVar.mo34343b();
        b.mo34341g(C58833ax.m90834k((String) optional.get()));
        return ((C29409fd) amVar.f338838c.mo27525b()).mo34715d(b.mo34335a());
    }
}
