package com.google.android.apps.gsa.nga.engine.tclib;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl;

/* renamed from: com.google.android.apps.gsa.nga.engine.tclib.k */
/* compiled from: PG */
public final /* synthetic */ class C77993k implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ TcLibWrapper f214794a;

    /* renamed from: b */
    public final /* synthetic */ C29690f f214795b;

    /* renamed from: c */
    public final /* synthetic */ C29690f f214796c;

    /* renamed from: d */
    public final /* synthetic */ C29690f f214797d;

    /* renamed from: e */
    public final /* synthetic */ C29690f f214798e;

    /* renamed from: f */
    public final /* synthetic */ C29690f f214799f;

    /* renamed from: g */
    public final /* synthetic */ C29690f f214800g;

    public /* synthetic */ C77993k(TcLibWrapper tcLibWrapper, C29690f fVar, C29690f fVar2, C29690f fVar3, C29690f fVar4, C29690f fVar5, C29690f fVar6) {
        this.f214794a = tcLibWrapper;
        this.f214795b = fVar;
        this.f214796c = fVar2;
        this.f214797d = fVar3;
        this.f214798e = fVar4;
        this.f214799f = fVar5;
        this.f214800g = fVar6;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        String nativeUpdate;
        C60870cx o;
        TcLibWrapper tcLibWrapper = this.f214794a;
        TextClassifierLibImpl l = TextClassifierLibImpl.m94508l(tcLibWrapper.f214750f.f214822a, tcLibWrapper.mo72951s(this.f214795b, this.f214796c, this.f214797d, this.f214798e, this.f214799f, this.f214800g));
        synchronized (tcLibWrapper) {
            tcLibWrapper.f214755k = l;
            nativeUpdate = TcLibWrapper.nativeUpdate(tcLibWrapper.f214755k);
            o = TcLibWrapper.m125187o(((TextClassifierLibImpl) tcLibWrapper.f214755k).f167272b, tcLibWrapper.f214749e);
        }
        if (nativeUpdate == null) {
            ((C58970a) ((C58970a) TcLibWrapper.f214745a.mo56225c()).mo56372aa(4807)).mo56386p("Native update response is null");
        } else if (!nativeUpdate.isEmpty()) {
            ((C58970a) ((C58970a) TcLibWrapper.f214745a.mo56225c()).mo56372aa(4806)).mo56389s("Native update response is: %s", nativeUpdate);
        }
        return o;
    }
}
