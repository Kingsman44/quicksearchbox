package com.google.android.libraries.assistant.auto.ondevice.p714f;

import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87730bl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87731bm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87732bn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.f.a */
/* compiled from: PG */
public final /* synthetic */ class C11907a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C51809dy f38285a;

    public /* synthetic */ C11907a(C51809dy dyVar) {
        this.f38285a = dyVar;
    }

    public final Object apply(Object obj) {
        C51809dy dyVar = this.f38285a;
        Throwable th = (Throwable) obj;
        if (!(th instanceof CancellationException) && (th instanceof TimeoutException)) {
            ((C59052c) ((C59052c) ((C59052c) C11911e.f38289a.mo56226d()).mo56382g(th)).mo56372aa(43792)).mo56386p("Smart Action timed out");
        }
        ((C59052c) ((C59052c) ((C59052c) C11911e.f38289a.mo56226d()).mo56382g(th)).mo56372aa(43791)).mo56386p("Smart Action failed");
        C87684al alVar = new C87684al(C88244um.CAR_ASSISTANT_SMART_ACTIONS);
        C62940bt btVar = C87730bl.f237213a;
        C87731bm bmVar = (C87731bm) C87732bn.f237214d.createBuilder();
        bmVar.copyOnWrite();
        C87732bn bnVar = (C87732bn) bmVar.instance;
        dyVar.getClass();
        bnVar.f237218c = dyVar;
        bnVar.f237216a |= 1;
        alVar.mo81965b(btVar, (C87732bn) bmVar.build());
        return alVar.mo81964a();
    }
}
