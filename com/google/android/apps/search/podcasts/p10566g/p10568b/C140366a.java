package com.google.android.apps.search.podcasts.p10566g.p10568b;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import java.util.Arrays;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.g.b.a */
/* compiled from: PG */
final class C140366a extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C140367b f381304a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140366a(C140367b bVar) {
        super(0);
        this.f381304a = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        Object[] objArr = new Object[2];
        C140646b bVar = this.f381304a.f381305a.f381974a;
        if (bVar == null) {
            bVar = C140646b.f381993r;
        }
        objArr[0] = bVar.f381995a;
        objArr[1] = this.f381304a.f381305a.f381975b;
        String format = String.format("%s %s", Arrays.copyOf(objArr, 2));
        C69664n.m101060f(format, "format(format, *args)");
        return format;
    }
}
