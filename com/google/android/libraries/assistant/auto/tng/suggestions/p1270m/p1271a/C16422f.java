package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16348av;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.f */
/* compiled from: PG */
public final /* synthetic */ class C16422f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16416ag f48315a;

    /* renamed from: b */
    public final /* synthetic */ C16348av f48316b;

    /* renamed from: c */
    public final /* synthetic */ Map f48317c;

    /* renamed from: d */
    public final /* synthetic */ String f48318d;

    public /* synthetic */ C16422f(C16416ag agVar, C16348av avVar, Map map, String str) {
        this.f48315a = agVar;
        this.f48316b = avVar;
        this.f48317c = map;
        this.f48318d = str;
    }

    public final C60870cx apply(Object obj) {
        C16416ag agVar = this.f48315a;
        C16348av avVar = this.f48316b;
        Map map = this.f48317c;
        String str = this.f48318d;
        List list = (List) obj;
        Collection.EL.removeIf(list, new C16419c(avVar));
        Collections.sort(list, Comparator.CC.comparingInt(C16420d.f48311a));
        avVar.mo22890a((C58485gu) Collection.EL.stream(list).filter(C16425i.f48324a).limit((long) ((Integer) Map.EL.getOrDefault(map, 1, 0)).intValue()).map(C16427k.f48326a).collect(C58370cn.f155946a));
        avVar.mo22890a((C58485gu) Collection.EL.stream(list).filter(C16428l.f48327a).limit((long) ((Integer) Map.EL.getOrDefault(map, 2, 0)).intValue()).map(new C16429m(agVar)).collect(C58370cn.f155946a));
        return ((C16002a) agVar.f48287b.mo27525b()).mo22662s(str);
    }
}
