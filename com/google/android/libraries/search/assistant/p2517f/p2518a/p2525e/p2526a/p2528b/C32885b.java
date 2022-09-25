package com.google.android.libraries.search.assistant.p2517f.p2518a.p2525e.p2526a.p2528b;

import com.google.android.apps.gsa.binaries.satin.app.ase;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51239ai;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.e.a.b.b */
/* compiled from: PG */
public final class C32885b implements C32597b {
    @Deprecated

    /* renamed from: a */
    public static final C33476a f88132a = new C33476a("assistant.api.params.AssistantSdkDeviceParams", C51239ai.f133399g);
    @Deprecated

    /* renamed from: b */
    private static final C32836cd f88133b;

    /* renamed from: c */
    private final C71422aw f88134c;

    /* renamed from: d */
    private final C32601f f88135d = new C32601f();

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        a.mo38321d();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.assistant.sdk.device.params");
        a.mo38319b(a2.mo38298a());
        f88133b = a.mo38318a();
    }

    public C32885b(ase ase, C71422aw awVar) {
        C69664n.m101061g(ase, "fetcherFactory");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f88134c = awVar;
    }

    /* renamed from: c */
    public final C32601f mo38173c() {
        return this.f88135d;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f88133b;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f88134c, (C71424ay) null, new C32884a(this, (C69577g) null), 3);
    }
}
