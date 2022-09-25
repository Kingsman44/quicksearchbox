package com.google.android.apps.gsa.staticplugins.searchwidget;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.h */
/* compiled from: PG */
public final class C117277h implements C118549h {

    /* renamed from: a */
    private final C117289t f325558a;

    public C117277h(C117289t tVar) {
        this.f325558a = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C60870cx cxVar;
        C117289t tVar = this.f325558a;
        tVar.mo103237g(C89849ae.WIDGET_DOODLE_DOWNLOAD_START);
        C117275f fVar = tVar.f325577j;
        String x = fVar.f325551b.mo79758x(C89985ax.f246725h);
        if (!x.isEmpty()) {
            cxVar = fVar.mo103229c(x, BuildConfig.FLAVOR);
        } else {
            cxVar = fVar.f325552c.mo28210j(fVar.mo103228b(), "processDoodleData", new C117257c(fVar));
        }
        return tVar.f325575h.mo28205e(tVar.f325575h.mo28209i(cxVar, "clearDoodleDownloadRetries", new C117282m(tVar)), "handleDoodleDownloadFailure", Throwable.class, new C117283n(tVar));
    }
}
