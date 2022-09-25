package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.apps.gsa.assist.C9386c;
import com.google.android.apps.gsa.assist.C9405d;
import com.google.android.apps.gsa.assist.C9407e;
import com.google.android.apps.gsa.assist.C9410f;
import com.google.android.apps.gsa.assist.C9417g;
import com.google.android.apps.gsa.assist.C9418h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4546c.C59394b;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4985f.p4988b.p4990b.C64736b;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.k */
/* compiled from: PG */
public final /* synthetic */ class C92962k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Map f259316a;

    public /* synthetic */ C92962k(Map map) {
        this.f259316a = map;
    }

    public final Object call() {
        Map map = this.f259316a;
        C59071e eVar = C92970s.f259329a;
        if (!Collection.EL.stream(map.values()).anyMatch(C92959h.f259312a)) {
            C60856cj.m92909r((Future) map.values().iterator().next());
        }
        C9386c cVar = (C9386c) C9405d.f32673k.createBuilder();
        if (map.containsKey(C64736b.WEB_URI) && C59394b.m92295a((Future) map.get(C64736b.WEB_URI))) {
            String str = (String) C60856cj.m92909r((Future) map.get(C64736b.WEB_URI));
            cVar.copyOnWrite();
            C9405d dVar = (C9405d) cVar.instance;
            str.getClass();
            dVar.f32675a |= 8;
            dVar.f32679e = str;
        }
        C9407e eVar2 = (C9407e) C9410f.f32690f.createBuilder();
        eVar2.mo17659b((C9405d) cVar.build());
        if (map.containsKey(C64736b.APP_PACKAGE_METADATA) && C59394b.m92295a((Future) map.get(C64736b.APP_PACKAGE_METADATA))) {
            String str2 = (String) C60856cj.m92909r((Future) map.get(C64736b.APP_PACKAGE_METADATA));
            eVar2.copyOnWrite();
            C9410f fVar = (C9410f) eVar2.instance;
            str2.getClass();
            fVar.f32692a |= 1;
            fVar.f32693b = str2;
        }
        C9417g gVar = (C9417g) C9418h.f32714k.createBuilder();
        gVar.mo17672a((C9410f) eVar2.build());
        return C58833ax.m90834k((C9418h) gVar.build());
    }
}
