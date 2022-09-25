package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.o.y */
/* compiled from: PG */
public final class C18507y {

    /* renamed from: a */
    private final C18504v f52463a;

    public C18507y(C18504v vVar) {
        this.f52463a = vVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C18505w mo24015a() {
        C62942bv build = this.f52463a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C18505w) build;
    }

    /* renamed from: b */
    public final String mo24016b() {
        String str = ((C18505w) this.f52463a.instance).f52461b;
        C69664n.m101060f(str, "_builder.getValue()");
        return str;
    }

    /* renamed from: c */
    public final void mo24017c(String str) {
        C18504v vVar = this.f52463a;
        vVar.copyOnWrite();
        C18505w wVar = C18505w.f52458d;
        ((C18505w) vVar.instance).f52460a = str;
    }

    /* renamed from: d */
    public final void mo24018d(String str) {
        C69664n.m101061g(str, "value");
        C18504v vVar = this.f52463a;
        vVar.copyOnWrite();
        C18505w wVar = C18505w.f52458d;
        str.getClass();
        ((C18505w) vVar.instance).f52461b = str;
    }
}
