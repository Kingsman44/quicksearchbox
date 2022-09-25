package com.google.android.libraries.search.assistant.proactive.p2775g;

import com.google.assistant.p3803ag.p3809c.C49054et;
import com.google.assistant.p3803ag.p3809c.C49055eu;
import com.google.assistant.p3803ag.p3809c.C49056ev;
import com.google.assistant.p3803ag.p3809c.C49057ew;
import com.google.common.base.C58817ah;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.s */
/* compiled from: PG */
public final /* synthetic */ class C36298s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36300u f94784a;

    /* renamed from: b */
    public final /* synthetic */ Map f94785b;

    /* renamed from: c */
    public final /* synthetic */ Map f94786c;

    /* renamed from: d */
    public final /* synthetic */ Duration f94787d;

    public /* synthetic */ C36298s(C36300u uVar, Map map, Map map2, Duration duration) {
        this.f94784a = uVar;
        this.f94785b = map;
        this.f94786c = map2;
        this.f94787d = duration;
    }

    public final Object apply(Object obj) {
        int a;
        C36300u uVar = this.f94784a;
        Map map = this.f94785b;
        Map map2 = this.f94786c;
        Duration duration = this.f94787d;
        Instant ofEpochMilli = Instant.ofEpochMilli(uVar.f94794a.mo26870b());
        C49056ev evVar = (C49056ev) C49057ew.f126896b.createBuilder();
        for (C49055eu euVar : ((C49057ew) obj).f126898a) {
            Instant ofEpochMilli2 = Instant.ofEpochMilli(euVar.f126890b);
            int i = euVar.f126891c;
            int a2 = C49054et.m85353a(i);
            if ((((a2 != 0 && a2 == 6) || ((a = C49054et.m85353a(i)) != 0 && a == 7)) && ofEpochMilli.minus(duration).isBefore(ofEpochMilli2)) || C36300u.m64779d(ofEpochMilli, map, euVar.f126894f, ofEpochMilli2) || C36300u.m64779d(ofEpochMilli, map2, euVar.f126892d, ofEpochMilli2)) {
                evVar.mo53213a(euVar);
            }
        }
        return (C49057ew) evVar.build();
    }
}
