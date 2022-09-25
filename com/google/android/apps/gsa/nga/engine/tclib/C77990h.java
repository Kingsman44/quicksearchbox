package com.google.android.apps.gsa.nga.engine.tclib;

import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61910bt;
import java.io.FileNotFoundException;

/* renamed from: com.google.android.apps.gsa.nga.engine.tclib.h */
/* compiled from: PG */
public final /* synthetic */ class C77990h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ TcLibWrapper f214781a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f214782b;

    public /* synthetic */ C77990h(TcLibWrapper tcLibWrapper, C58495hd hdVar) {
        this.f214781a = tcLibWrapper;
        this.f214782b = hdVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        TcLibWrapper tcLibWrapper = this.f214781a;
        C58495hd hdVar = this.f214782b;
        C118826c cVar = (C118826c) obj;
        synchronized (tcLibWrapper) {
            C29690f n = TcLibWrapper.m125186n(hdVar, C80627v.TCLIB);
            C29690f n2 = TcLibWrapper.m125186n(hdVar, C80627v.WEBREF);
            C29690f n3 = TcLibWrapper.m125186n(hdVar, C80627v.TCLIB_PERSON_NAME);
            C29690f n4 = TcLibWrapper.m125186n(hdVar, C80627v.CONTACT_NAMES);
            C29690f n5 = TcLibWrapper.m125186n(hdVar, C80627v.NEURAL_MATCHING_ENCODER);
            C29690f n6 = TcLibWrapper.m125186n(hdVar, C80627v.LIGHTWEIGHT_TOKENS);
            tcLibWrapper.mo72952t("tcLibCoreModel", n);
            tcLibWrapper.mo72952t("webrefModel", n2);
            tcLibWrapper.mo72952t("tclibPersonName", n3);
            tcLibWrapper.mo72952t("tclibContactData", n4);
            tcLibWrapper.mo72952t("neuralMatchingEncoder", n5);
            tcLibWrapper.mo72952t("lightweightTokens", n6);
            if (tcLibWrapper.f214755k != null) {
                cxVar = tcLibWrapper.mo72949q(n, n2, n3, (C61910bt) null, n4, n5, n6);
            } else if (n == null) {
                cxVar = C60856cj.m92899h(new FileNotFoundException("tc_model resource not provided"));
            } else {
                cxVar = tcLibWrapper.f214748d.mo28209i(tcLibWrapper.f214756l.mo57305b(new C77996n(tcLibWrapper, n, n2, n3, n4, n5, n6), C60826bg.f164896a), "[NGA] TcLibWrapper.settableTcLibFuture.transform", new C77997o(tcLibWrapper, n, n3));
            }
        }
        return cxVar;
    }
}
