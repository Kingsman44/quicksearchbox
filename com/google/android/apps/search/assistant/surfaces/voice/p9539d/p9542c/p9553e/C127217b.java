package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9553e;

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
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.amd;
import com.google.assistant.p3897e.p3921j.ame;
import com.google.assistant.p3897e.p3921j.amf;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.e.b */
/* compiled from: PG */
public final class C127217b implements C32597b {

    /* renamed from: a */
    public static final C33476a f350274a = new C33476a("assistant.api.DeviceCapabilities", C51715bm.f135662t);

    /* renamed from: b */
    public static final amf f350275b;

    /* renamed from: d */
    private static final C32836cd f350276d;

    /* renamed from: c */
    public final C68214a f350277c;

    /* renamed from: e */
    private final C71422aw f350278e;

    /* renamed from: f */
    private final C32601f f350279f = new C32601f();

    static {
        ame ame = (ame) amf.f135365e.createBuilder();
        C69664n.m101060f(ame, "newBuilder()");
        amd a = C69664n.m101061g(ame, "builder");
        a.mo53704b();
        f350275b = a.mo53703a();
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a2 = C69664n.m101061g(ccVar, "builder");
        a2.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a3 = C69664n.m101061g(ajVar, "builder");
        C32788aj ajVar2 = a3.f87977a;
        ajVar2.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar2.instance;
        arVar.f87975a = 3;
        arVar.f87976b = 436126002;
        a2.mo38319b(a3.mo38298a());
        f350276d = a2.mo38318a();
    }

    public C127217b(C68214a aVar, C71422aw awVar) {
        C69664n.m101061g(aVar, "deviceCapabilitiesFetcher");
        C69664n.m101061g(awVar, "futureScope");
        this.f350277c = aVar;
        this.f350278e = awVar;
    }

    /* renamed from: c */
    public final C32601f mo38173c() {
        return this.f350279f;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f350276d;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350278e, (C71424ay) null, new C127216a(this, (C69577g) null), 3);
    }
}
