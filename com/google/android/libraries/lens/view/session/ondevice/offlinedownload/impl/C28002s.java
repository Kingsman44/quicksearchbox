package com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl;

import com.google.android.libraries.lens.view.session.ondevice.p2164a.C27865av;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.C27869az;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.C27877bg;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.offlinedownload.impl.s */
/* compiled from: PG */
final class C28002s implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C27877bg f76203a;

    /* renamed from: b */
    final /* synthetic */ OfflineDownloadManagerImpl f76204b;

    public C28002s(OfflineDownloadManagerImpl offlineDownloadManagerImpl, C27877bg bgVar) {
        this.f76204b = offlineDownloadManagerImpl;
        this.f76203a = bgVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56226d()).mo56382g(th)).mo56372aa(50069)).mo56386p("Can't verify LODE dependencies due to an exception.");
        this.f76204b.f76168o = false;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Boolean bool = (Boolean) obj;
        ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56224b()).mo56372aa(50070)).mo56386p(true != bool.booleanValue() ? "Hybrid translate dependencies are not downloaded." : "Hybrid translate dependencies are downloaded already.");
        if (!bool.booleanValue()) {
            ((C58970a) ((C58970a) OfflineDownloadManagerImpl.f76145a.mo56224b()).mo56372aa(50071)).mo56386p("Now triggering background download of hybrid translate dependencies.");
            C27877bg bgVar = this.f76203a;
            C60856cj.m92911t(C60922j.m93045h(bgVar.f75978d.mo33334d(), C47810es.m84966f(new C27865av(bgVar)), C60826bg.f164896a), C47810es.m84974n(new C27869az()), C60826bg.f164896a);
        }
    }
}
