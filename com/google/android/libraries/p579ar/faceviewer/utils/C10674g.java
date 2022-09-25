package com.google.android.libraries.p579ar.faceviewer.utils;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.ar.faceviewer.utils.g */
/* compiled from: PG */
final class C10674g implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C10675h.f35601a.mo56225c()).mo56382g(th)).mo56372aa(42309)).mo56386p("Failed to close future closeable.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        try {
            ((AutoCloseable) obj).close();
        } catch (Exception e) {
            mo17910gl(e);
        }
    }
}
