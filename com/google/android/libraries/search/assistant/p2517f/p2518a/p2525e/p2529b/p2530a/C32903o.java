package com.google.android.libraries.search.assistant.p2517f.p2518a.p2525e.p2529b.p2530a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.search.assistant.platform.p9141h.p9142a.C120996f;
import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120988g;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121090b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.e.b.a.o */
/* compiled from: PG */
public final class C32903o implements C32597b {

    /* renamed from: a */
    public static final C59071e f88189a = C59071e.m91331h();

    /* renamed from: b */
    public final C121090b f88190b;

    /* renamed from: c */
    public final C71422aw f88191c;

    /* renamed from: d */
    public final C32601f f88192d = new C32601f();

    /* renamed from: e */
    public C71604be f88193e;

    /* renamed from: f */
    public final C71788b f88194f = new C71799m();

    /* renamed from: g */
    public final C71788b f88195g = new C71799m();

    /* renamed from: h */
    public final AtomicReference f88196h = new AtomicReference((Object) null);

    /* renamed from: i */
    private final C120996f f88197i;

    /* renamed from: j */
    private final Context f88198j;

    /* renamed from: k */
    private final BroadcastReceiver f88199k;

    public C32903o(C121090b bVar, C71422aw awVar, C120996f fVar, Context context) {
        C69664n.m101061g(bVar, "mobileLocaleSettingsReadAccessor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(fVar, "changeNotificationListenerService");
        C69664n.m101061g(context, "context");
        this.f88190b = bVar;
        this.f88191c = awVar;
        this.f88197i = fVar;
        this.f88198j = context;
        C32899k kVar = new C32899k(this);
        this.f88199k = kVar;
        m60887f(C120988g.ASSISTANT_PRIMARY_LOCALE, new C32886a(this, (C69577g) null));
        m60887f(C120988g.ASSISTANT_PREFERRED_LOCALES, new C32890b(this, (C69577g) null));
        context.registerReceiver(kVar, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
    }

    /* renamed from: f */
    private final void m60887f(C120988g gVar, C69626l lVar) {
        this.f88197i.mo105022a(new C32898j(lVar), gVar);
    }

    /* renamed from: a */
    public final Object mo38337a(C69577g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        return C71423ax.m104196a(new C32897i(this, (C69577g) null), gVar);
    }

    /* renamed from: b */
    public final Object mo38338b(C69577g gVar) {
        Object a = C71423ax.m104196a(new C32901m(this, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: c */
    public final C32601f mo38173c() {
        return this.f88192d;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        C32788aj ajVar2 = a2.f87977a;
        ajVar2.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar2.instance;
        arVar.f87975a = 3;
        arVar.f87976b = 456993644;
        a.mo38319b(a2.mo38298a());
        a.mo38320c();
        a.mo38321d();
        return a.mo38318a();
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f88191c, (C71424ay) null, new C32892d(this, (C69577g) null), 3);
    }
}
