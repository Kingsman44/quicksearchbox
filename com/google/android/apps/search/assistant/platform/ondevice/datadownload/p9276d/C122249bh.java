package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.bh */
/* compiled from: PG */
final class C122249bh implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            ((C58970a) ((C58970a) ((C58970a) C122261bt.f339018a.mo56224b()).mo56382g(th)).mo56372aa(34734)).mo56386p("DataDownloadRestrictedServiceServer.downloadFileGroupsWithUpdates cancelled.");
        } else {
            ((C58970a) ((C58970a) ((C58970a) C122261bt.f339018a.mo56225c()).mo56382g(th)).mo56372aa(34733)).mo56386p("DataDownloadRestrictedServiceServer.downloadFileGroupsWithUpdates.onNext.submitAsync failed. This should not happen as the submitted future catches all errors.");
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
