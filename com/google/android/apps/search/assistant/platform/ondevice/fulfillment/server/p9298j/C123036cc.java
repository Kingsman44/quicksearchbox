package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122561k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.C122109a;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.p9262b.C122117b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58827ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62912at;
import com.google.protos.p4985f.p5030q.C65159dt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.cc */
/* compiled from: PG */
final class C123036cc {

    /* renamed from: a */
    public final C122859d f340596a;

    /* renamed from: b */
    public final Function f340597b;

    /* renamed from: c */
    public final ArrayList f340598c = new ArrayList();

    /* renamed from: d */
    public int f340599d = 0;

    /* renamed from: e */
    public final C122561k f340600e;

    /* renamed from: f */
    private final C123028bv f340601f;

    /* renamed from: g */
    private final Executor f340602g;

    public C123036cc(C123028bv bvVar, C122561k kVar, C122859d dVar, Function function, Executor executor) {
        this.f340601f = bvVar;
        this.f340600e = kVar;
        this.f340596a = dVar;
        this.f340597b = function;
        this.f340602g = executor;
    }

    /* renamed from: b */
    public static String m202369b(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C65159dt dtVar = (C65159dt) it.next();
            ArrayList arrayList = new ArrayList();
            if (dtVar.f176341a) {
                arrayList.add("alarm");
            }
            if (dtVar.f176342b) {
                arrayList.add("timer");
            }
            if (dtVar.f176344d) {
                arrayList.add("screen_context");
            }
            if (dtVar.f176343c) {
                arrayList.add("media");
            }
            if (dtVar.f176345e) {
                arrayList.add("call");
            }
            C58827ar.m90818c(',').mo56100g(sb, arrayList);
            sb.append(';');
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final C60870cx mo105842a(C52091ex exVar) {
        ((C59052c) this.f340596a.mo105767f(C59071e.f157037b).mo56372aa(35137)).mo56387q("Running POP iteration %d", this.f340599d + 1);
        C60870cx a = this.f340601f.mo105729a(exVar);
        ((C59052c) this.f340596a.mo105767f(C59071e.f157037b).mo56372aa(35138)).mo56387q("Running POP iteration %d completed", this.f340599d + 1);
        C123034ca caVar = new C123034ca(this);
        return C60922j.m93045h(a, C47810es.m84966f(caVar), this.f340602g);
    }

    /* renamed from: c */
    public final void mo105843c(String str, ArrayList arrayList, C122117b bVar) {
        ((C59052c) this.f340596a.mo105764c().mo56372aa(35139)).mo56389s("Fetching missing context param: %s", str);
        C60870cx a = bVar.mo105538a(new C122109a(str), C62912at.f169862a);
        C123035cb cbVar = new C123035cb(str);
        arrayList.add(C60922j.m93044g(a, C47810es.m84963c(cbVar), C60826bg.f164896a));
    }
}
