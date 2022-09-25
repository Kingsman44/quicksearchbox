package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import com.google.android.libraries.search.assistant.p2513e.p2514a.C32574k;
import com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32587l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.io.Closeable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.t */
/* compiled from: PG */
public final class C126404t implements Closeable {

    /* renamed from: a */
    public final C126373aa f348146a;

    /* renamed from: b */
    public final C126377ae f348147b;

    /* renamed from: c */
    public final C32574k f348148c;

    /* renamed from: d */
    public final C32587l f348149d;

    public C126404t(C126373aa aaVar, C126377ae aeVar, C32574k kVar, C32587l lVar) {
        C69664n.m101061g(aaVar, "session");
        C69664n.m101061g(aeVar, "config");
        this.f348146a = aaVar;
        this.f348147b = aeVar;
        this.f348148c = kVar;
        this.f348149d = lVar;
    }

    public final void close() {
        C59052c cVar = (C59052c) C126407w.f348155a.mo56224b();
        cVar.mo56379ah(new C59094n(38889));
        cVar.mo56386p("Session#close");
        this.f348146a.close();
    }
}
