package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.l */
/* compiled from: PG */
final class C122285l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f339082a;

    /* renamed from: b */
    final /* synthetic */ String f339083b;

    /* renamed from: c */
    final /* synthetic */ C122290q f339084c;

    public C122285l(C122290q qVar, String str, String str2) {
        this.f339084c = qVar;
        this.f339082a = str;
        this.f339083b = str2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C122290q.f339104a.mo56226d()).mo56382g(th)).mo56372aa(34720)).mo56386p("Error in logging the APA Data Download gRPC status.");
        this.f339084c.mo105592b("ERROR_IN_LOGGING_PROCESS", this.f339082a, this.f339083b);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
