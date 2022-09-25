package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.google.protobuf.C63042fg;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.w */
/* compiled from: PG */
final class C40299w extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Instant f105868a;

    /* renamed from: b */
    final /* synthetic */ Duration f105869b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40299w(Instant instant, Duration duration) {
        super(1);
        this.f105868a = instant;
        this.f105869b = duration;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C63042fg fgVar = ((C40278b) obj).f105804d;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        C69664n.m101060f(fgVar, "it.lastUsed");
        return Boolean.valueOf(Duration.between(C40265ae.m69884c(fgVar), this.f105868a).compareTo(this.f105869b) >= 0);
    }
}
