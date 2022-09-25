package com.google.android.apps.search.googleapp.search.p10410f;

import com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.f.ab */
/* compiled from: PG */
public final class C137425ab {

    /* renamed from: a */
    private final C137442r f373794a;

    public C137425ab(C137443s sVar) {
        this.f373794a = sVar.mo113736a(30);
    }

    /* renamed from: a */
    public final void mo113717a(C138788y yVar) {
        C69664n.m101061g(yVar, "voiceSearchState");
        this.f373794a.mo113734a(yVar);
    }

    /* renamed from: b */
    public final void mo113718b(StringBuilder sb) {
        C69664n.m101061g(sb, "stringBuilder");
        sb.append("recent VoiceSearchStates:");
        C69664n.m101060f(sb, "append(value)");
        sb.append(10);
        C69664n.m101060f(sb, "append('\\n')");
        C137433i.m223293a(C69540x.m100840V(this.f373794a), C69540x.m100947e(new C137430f("ui state", C137450z.f373850a), new C137430f("recognized text", new C137424aa()))).mo113724a(sb);
    }
}
