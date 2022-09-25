package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.p8162a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91654c;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91656e;
import com.google.android.apps.gsa.sidekick.shared.p7232c.C91657f;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105691d;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105700m;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.a.g */
/* compiled from: PG */
public final class C105754g implements C23113i {

    /* renamed from: a */
    private final C105752e f295113a;

    public C105754g(C105752e eVar) {
        this.f295113a = eVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SpinnerEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onSpinnerFeatureDetached")) {
                this.f295113a.mo95015f();
            } else if (str.equals("onSpinnerFeatureHidden")) {
                C105700m mVar = (C105700m) this.f295113a;
                if (!((Boolean) ((C105691d) mVar.f294955a).f294920b.f63720e).booleanValue()) {
                    mVar.f294956b.mo86048m(mVar.f294958d);
                    mVar.f294957c.mo86062e(mVar.f294958d);
                }
                ((C105691d) mVar.f294955a).f294919a.mo28730f(false, false);
            } else if (str.equals("onSpinnerFeatureRendered")) {
                C105700m mVar2 = (C105700m) this.f295113a;
                if (((Boolean) ((C105691d) mVar2.f294955a).f294920b.f63720e).booleanValue()) {
                    C91656e eVar = mVar2.f294956b;
                    String c = C91656e.m149939c(mVar2.f294958d);
                    if (!eVar.f255620g.containsKey(c) || !((AtomicBoolean) eVar.f255620g.get(c)).getAndSet(true)) {
                        eVar.mo86039d(c);
                        eVar.f255621h.put(c, eVar.f255617d.mo28208h("FeedNextPageTimeoutTask", C91656e.f255614b, new C91654c(eVar, c)));
                        C89856f fVar = new C89856f();
                        fVar.f246201a = C89849ae.FEED_NEXT_PAGE_START;
                        fVar.mo83701c("SessionLoggerId", c);
                        eVar.f255616c.mo74236a(fVar.mo83699a());
                    }
                    C91657f fVar2 = mVar2.f294957c;
                    boolean z = mVar2.f294958d;
                    synchronized (fVar2.f255627a) {
                        if (fVar2.mo86067j(z) && fVar2.mo86066i(z, 1)) {
                            fVar2.mo86065h(z, 2);
                            fVar2.mo86058a(C37182a.f98243m.mo40779c(), z);
                        }
                    }
                }
            }
        }
    }
}
