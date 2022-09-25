package com.google.android.libraries.search.assistant.proactive.p2775g;

import com.google.assistant.p3803ag.p3809c.C49062fa;
import com.google.assistant.p3803ag.p3809c.C49064fc;
import com.google.assistant.p3803ag.p3809c.C49065fd;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60945d;
import com.google.protobuf.C62995dn;
import java.util.Collections;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.h */
/* compiled from: PG */
public final /* synthetic */ class C36287h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f94769a;

    /* renamed from: b */
    public final /* synthetic */ C49062fa f94770b;

    public /* synthetic */ C36287h(String str, C49062fa faVar) {
        this.f94769a = str;
        this.f94770b = faVar;
    }

    public final Object apply(Object obj) {
        String str = this.f94769a;
        C49062fa faVar = this.f94770b;
        C49065fd fdVar = (C49065fd) obj;
        C59071e eVar = C36295p.f94779a;
        Instant d = C60945d.m93099d(faVar.f126912d);
        C49062fa faVar2 = C49062fa.f126907e;
        str.getClass();
        C62995dn dnVar = fdVar.f126916a;
        if (dnVar.containsKey(str)) {
            faVar2 = (C49062fa) dnVar.get(str);
        }
        if (d.isAfter(C60945d.m93099d(faVar2.f126912d))) {
            C49064fc fcVar = (C49064fc) C49065fd.f126914b.createBuilder();
            Map map = (Map) Collection.EL.stream(Collections.unmodifiableMap(fdVar.f126916a).entrySet()).filter(new C36290k(faVar)).collect(Collectors.toMap(C36291l.f94775a, C36292m.f94776a, C36293n.f94777a, C36294o.f94778a));
            if (map.size() >= 1024) {
                map = (Map) Collection.EL.stream(map.entrySet()).sorted(C36284e.f94766a).limit(1023).collect(Collectors.toMap(C36291l.f94775a, C36292m.f94776a, C36285f.f94767a, C36294o.f94778a));
            }
            fcVar.copyOnWrite();
            ((C49065fd) fcVar.instance).mo53217a().putAll(map);
            fcVar.mo53216a(str, faVar);
            return (C49065fd) fcVar.build();
        }
        throw new IllegalStateException("An action for a newer push message exists.");
    }
}
