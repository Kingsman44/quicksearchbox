package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.b.s */
/* compiled from: PG */
final class C137959s extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ String f375334a;

    /* renamed from: b */
    final /* synthetic */ long f375335b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137959s(String str, long j) {
        super(1);
        this.f375334a = str;
        this.f375335b = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C137965y yVar = (C137965y) obj;
        C69664n.m101061g(yVar, "data");
        C137964x xVar = (C137964x) yVar.toBuilder();
        String str = this.f375334a;
        xVar.copyOnWrite();
        C137965y yVar2 = (C137965y) xVar.instance;
        str.getClass();
        yVar2.f375354a |= 1;
        yVar2.f375355b = str;
        long j = this.f375335b;
        xVar.copyOnWrite();
        C137965y yVar3 = (C137965y) xVar.instance;
        yVar3.f375354a |= 2;
        yVar3.f375356c = j;
        C62942bv build = xVar.build();
        C69664n.m101060f(build, "data\n          .toBuilde…illis)\n          .build()");
        return (C137965y) build;
    }
}
