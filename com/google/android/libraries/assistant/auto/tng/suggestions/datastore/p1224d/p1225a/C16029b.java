package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.p1225a;

import android.database.SQLException;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16143co;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16166j;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16334ah;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.d.a.b */
/* compiled from: PG */
public final /* synthetic */ class C16029b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16027ax f47467a;

    /* renamed from: b */
    public final /* synthetic */ List f47468b;

    /* renamed from: c */
    public final /* synthetic */ String f47469c;

    /* renamed from: d */
    public final /* synthetic */ C16091aq f47470d;

    public /* synthetic */ C16029b(C16027ax axVar, List list, String str, C16091aq aqVar) {
        this.f47467a = axVar;
        this.f47468b = list;
        this.f47469c = str;
        this.f47470d = aqVar;
    }

    public final C60870cx apply(Object obj) {
        C16027ax axVar = this.f47467a;
        List<C16170n> list = this.f47468b;
        String str = this.f47469c;
        C16091aq aqVar = this.f47470d;
        List list2 = (List) Collection.EL.stream((List) obj).map(C16014ak.f47429a).collect(Collectors.toCollection(C16031d.f47472a));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (C16170n nVar : list) {
            C16166j jVar = new C16166j();
            jVar.f47696a = C16027ax.m32836u(nVar.mo22752f(), axVar.f47453d.f47374o);
            jVar.mo22790c(nVar.mo22752f());
            jVar.mo22791d(str);
            jVar.mo22795h(true);
            jVar.mo22793f(nVar.mo22750e());
            jVar.f47697b = nVar.mo22749d();
            C16335ai aiVar = nVar.mo22747b().f48084i;
            if (aiVar == null) {
                aiVar = C16335ai.f48090k;
            }
            C16334ah ahVar = (C16334ah) aiVar.toBuilder();
            int i2 = i + 1;
            ahVar.copyOnWrite();
            C16335ai aiVar2 = (C16335ai) ahVar.instance;
            aiVar2.f48092a |= 128;
            aiVar2.f48101j = i;
            C16335ai aiVar3 = (C16335ai) ahVar.build();
            C16090ap g = aqVar.mo22733g();
            C16327aa a = C16327aa.m33331a(nVar.mo22747b().f48080e);
            if (a == null) {
                a = C16327aa.UNKNOWN_ACTION_TYPE;
            }
            jVar.mo22792e(axVar.mo22665w(aiVar3, g, a, false, 1));
            jVar.mo22796i(nVar.mo22746a());
            C16330ad adVar = nVar.mo22747b().f48082g;
            if (adVar == null) {
                adVar = C16330ad.f48065f;
            }
            jVar.mo22789b(adVar);
            C16143co a2 = jVar.mo22788a();
            axVar.f47453d.f47376q.put(a2.mo22804h(), nVar);
            arrayList.add(a2);
            i = i2;
        }
        C16090ap g2 = aqVar.mo22733g();
        list2.addAll(arrayList);
        C58976aa aaVar = C58975e.f156826a;
        return C60922j.m93044g(C47633f.m84733g(axVar.f47457h.mo22809d(list2)).mo51513e(SQLException.class, new C16018ao(list2), axVar.f47452c), C47810es.m84963c(new C16023at(axVar, list2, g2, arrayList)), axVar.f47452c);
    }
}
