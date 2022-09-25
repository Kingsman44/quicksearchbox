package com.google.android.libraries.lens.view.main;

import android.app.PendingIntent;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.lens.view.main.ax */
/* compiled from: PG */
final class C27307ax implements C60845bz {
    /* renamed from: c */
    public static final void m50870c(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                ((C59052c) ((C59052c) ((C59052c) C27327bq.f74753a.mo56226d()).mo56382g(e)).mo56372aa(49709)).mo56386p("Failed to send pending intent");
            }
        }
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C27327bq.f74753a.mo56225c()).mo56372aa(49708)).mo56389s("Error caching file: %s", th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        m50870c((PendingIntent) obj);
    }
}
