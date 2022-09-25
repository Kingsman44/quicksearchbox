package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import androidx.lifecycle.C2333ah;
import androidx.lifecycle.LiveData;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.ae */
/* compiled from: PG */
final class C92930ae implements C2333ah, C2166e {

    /* renamed from: a */
    public final LiveData f259251a;

    /* renamed from: b */
    private final Executor f259252b;

    /* renamed from: c */
    private C2164c f259253c;

    public C92930ae(LiveData liveData, Executor executor) {
        this.f259251a = liveData;
        this.f259252b = executor;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        ((C59052c) ((C59052c) C92931af.f259254a.mo56224b()).mo56372aa(13260)).mo56386p("goBack: waiting for OpaActivity to stop");
        this.f259253c = cVar;
        this.f259252b.execute(new C92929ad(this));
        return "Wait for OpaActivity to stop";
    }

    /* renamed from: hX */
    public final /* bridge */ /* synthetic */ void mo774hX(Object obj) {
        if (((C88079oj) obj) == C88079oj.STOPPED) {
            ((C59052c) ((C59052c) C92931af.f259254a.mo56224b()).mo56372aa(13261)).mo56386p("goBack: OpaActivity stopped");
            C2164c cVar = this.f259253c;
            cVar.getClass();
            cVar.mo5437b((Object) null);
            this.f259251a.mo5679j(this);
        }
    }
}
