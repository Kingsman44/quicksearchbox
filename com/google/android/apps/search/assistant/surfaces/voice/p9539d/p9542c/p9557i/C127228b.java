package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9557i;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127352g;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127354b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.i.b */
/* compiled from: PG */
public final class C127228b {

    /* renamed from: a */
    public final C127354b f350319a;

    public C127228b(C127354b bVar) {
        C69664n.m101061g(bVar, "conversationParamsStore");
        this.f350319a = bVar;
    }

    /* renamed from: a */
    public final C127352g mo108000a(String str) {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c(str);
        a.mo38319b(a2.mo38298a());
        return new C127352g(a.mo38318a(), new C127227a(this, str), false);
    }
}
