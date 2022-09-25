package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15809s;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.C15814a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1240g.C16213a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16348av;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.g */
/* compiled from: PG */
public final /* synthetic */ class C16423g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16416ag f48319a;

    /* renamed from: b */
    public final /* synthetic */ C16348av f48320b;

    /* renamed from: c */
    public final /* synthetic */ Map f48321c;

    /* renamed from: d */
    public final /* synthetic */ C16090ap f48322d;

    public /* synthetic */ C16423g(C16416ag agVar, C16348av avVar, Map map, C16090ap apVar) {
        this.f48319a = agVar;
        this.f48320b = avVar;
        this.f48321c = map;
        this.f48322d = apVar;
    }

    public final C60870cx apply(Object obj) {
        C16416ag agVar = this.f48319a;
        C16348av avVar = this.f48320b;
        Map map = this.f48321c;
        C16090ap apVar = this.f48322d;
        C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).limit((long) ((Integer) Map.EL.getOrDefault(map, 3, 0)).intValue()).collect(C58370cn.f155946a);
        if (agVar.f48290e.mo56113h() && !apVar.equals(C16090ap.SIDE_CARD)) {
            C58976aa aaVar = C58975e.f156826a;
            C46459k.m82829b(((C16213a) agVar.f48290e.mo56107c()).mo22850a(guVar), "Shortcuts impression failed", new Object[0]);
        }
        avVar.mo22890a((C58485gu) Collection.EL.stream(guVar).map(C16434r.f48338a).collect(C58370cn.f155946a));
        C60870cx a = ((C15814a) agVar.f48296k.mo27525b()).mo22573a(C15809s.f47037b);
        C16418b bVar = C16418b.f48309a;
        return C60922j.m93044g(a, C47810es.m84963c(bVar), agVar.f48298m);
    }
}
