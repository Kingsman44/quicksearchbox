package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f;

import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.media.session.C0315q;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.f.f */
/* compiled from: PG */
public final class C13981f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C0315q f42567a;

    /* renamed from: b */
    final /* synthetic */ Uri f42568b;

    /* renamed from: c */
    final /* synthetic */ Bundle f42569c;

    public C13981f(C0315q qVar, Uri uri, Bundle bundle) {
        this.f42567a = qVar;
        this.f42568b = uri;
        this.f42569c = bundle;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C13982g.f42570a.mo56226d()).mo56382g(th)).mo56372aa(45253)).mo56386p("Failed to fetch media.PREPARE_MEDIA clientOp operation result, default to use playFromUri.");
        this.f42567a.mo1021f(this.f42568b, this.f42569c);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        ((C59052c) ((C59052c) C13982g.f42570a.mo56224b()).mo56372aa(45254)).mo56386p("The media.PREPARE_MEDIA clientOp successfully prepared the media, start to play directly.");
        this.f42567a.mo1018c();
    }
}
