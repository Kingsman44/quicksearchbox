package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d;

import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.util.permissions.C91076c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a.C106615m;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106551f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106556g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8214a.C106519a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.p */
/* compiled from: PG */
public final /* synthetic */ class C106542p implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C106544r f297094a;

    /* renamed from: b */
    public final /* synthetic */ C106551f f297095b;

    public /* synthetic */ C106542p(C106544r rVar, C106551f fVar) {
        this.f297094a = rVar;
        this.f297095b = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C106544r rVar = this.f297094a;
        C106551f fVar = this.f297095b;
        if (!rVar.f297099c.mo85405j(C90017bw.f247868J)) {
            return C118826c.f331423b;
        }
        ((C58970a) ((C58970a) rVar.f297097a.mo56224b()).mo56372aa(23108)).mo56386p("HeadsetState: startMonitoring");
        C106519a aVar = rVar.f297105i;
        int i = rVar.f297110n;
        int i2 = true != aVar.f297055b.mo85405j(C90017bw.f248005ce) ? 2 : 1;
        ((C58970a) ((C58970a) aVar.f297054a.mo56224b()).mo56372aa(23103)).mo56359L("%s(%s): shouldRegister: %b", "HeadsetState", C106556g.m177338a(i), Boolean.valueOf(i2 == i));
        if (i2 != i) {
            return C118826c.f331423b;
        }
        rVar.f297107k = fVar;
        ((C58970a) ((C58970a) rVar.f297097a.mo56224b()).mo56372aa(23109)).mo56386p("HeadsetState: Registering headset listener.");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        if (C91076c.m148792a(rVar.f297098b)) {
            intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
            if (rVar.f297106j.mo85405j(C90017bw.f247922ak)) {
                intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            }
        } else {
            ((C58970a) ((C58970a) rVar.f297097a.mo56226d()).mo56372aa(23110)).mo56386p("HeadsetState: Bluetooth permissions denied. Can only detect wired headsets.");
        }
        rVar.f297098b.registerReceiver(rVar.f297101e, intentFilter);
        rVar.f297108l = true;
        ((C58970a) ((C58970a) rVar.f297097a.mo56224b()).mo56372aa(23111)).mo56386p("HeadsetState: Registered headset listener.");
        ((C58970a) ((C58970a) rVar.f297097a.mo56224b()).mo56372aa(23112)).mo56386p("HeadsetState: First trigger, start trigger through profile intents.");
        C106615m mVar = rVar.f297100d;
        if (mVar.mo95600k((Intent) null)) {
            ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23151)).mo56386p("getHeadsetState(): is wired.");
            C106527a a = mVar.mo95594a();
            C106529c cVar = C106529c.CONNECTED;
            a.copyOnWrite();
            C106532f fVar2 = (C106532f) a.instance;
            C106532f fVar3 = C106532f.f297078g;
            fVar2.f297081b = cVar.f297070d;
            fVar2.f297080a |= 1;
            C106531e eVar = C106531e.WIRED;
            a.copyOnWrite();
            C106532f fVar4 = (C106532f) a.instance;
            fVar4.f297082c = eVar.f297077e;
            fVar4.f297080a |= 4;
            cxVar = C60856cj.m92900i(Optional.m71637of((C106532f) a.build()));
        } else {
            cxVar = mVar.mo95595b();
        }
        return C60922j.m93045h(cxVar, C47810es.m84966f(new C106540n(rVar, fVar)), rVar.f297102f);
    }
}
