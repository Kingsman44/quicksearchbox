package com.google.android.apps.search.googleapp.discover.p10238u;

import java.text.NumberFormat;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.j */
/* compiled from: PG */
final class C135111j extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ NumberFormat f367992a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135111j(NumberFormat numberFormat) {
        super(1);
        this.f367992a = numberFormat;
    }

    /* renamed from: b */
    public final Integer mo5761a(String str) {
        C69664n.m101061g(str, C59002s.f156871a);
        Number parse = this.f367992a.parse(str);
        C69664n.m101058d(parse);
        return Integer.valueOf(parse.intValue());
    }
}
