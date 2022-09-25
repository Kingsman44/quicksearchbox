package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.fn */
/* compiled from: PG */
public final class C104049fn implements C118549h {

    /* renamed from: a */
    public final C104126w f289510a;

    /* renamed from: b */
    private final C104055ft f289511b;

    /* renamed from: c */
    private final C74713bn f289512c;

    /* renamed from: d */
    private final C22871g f289513d;

    public C104049fn(C104055ft ftVar, C74713bn bnVar, C22871g gVar, C104126w wVar) {
        this.f289511b = ftVar;
        this.f289512c = bnVar;
        this.f289513d = gVar;
        this.f289510a = wVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        if (!this.f289512c.mo71078c()) {
            return C118826c.f331423b;
        }
        C104055ft ftVar = this.f289511b;
        C60870cx e = ftVar.f289525f.mo28205e(ftVar.f289525f.mo28210j(ftVar.f289525f.mo28210j(ftVar.f289525f.mo28210j(ftVar.f289521b.mo93891d(ftVar.f289522c), "[NGA] NgaPriorityDownloader.startDownload.downloadSot", new C104051fp(ftVar)), "[NGA] NgaPriorityDownloader.startDownload.refreshSot", new C104052fq(ftVar)), "[NGA] NgaPriorityDownloader.startDownload.download", new C104053fr(ftVar)), "[NGA] NgaPriorityDownloader.catchAndReportError", Exception.class, new C104054fs(ftVar));
        C60870cx j = ftVar.f289525f.mo28210j(e, "[NGA] NgaPriorityDownloader.reportSuccess", new C104050fo(ftVar, e));
        C60870cx f = this.f289513d.mo28206f(j, "[NGA] NgaPriorityDownloadTask.logFailure", Throwable.class, new C104048fm(this, j));
        return this.f289513d.mo28210j(f, "[NGA] NgaPriorityDownloadTask.logSuccess", new C104047fl(f));
    }
}
