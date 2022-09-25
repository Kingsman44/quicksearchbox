package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130057b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130059d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a.C130065j;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.assistant.p3897e.p3921j.p3922a.C51655m;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.ae */
/* compiled from: PG */
public final class C130084ae implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C130085af f356699a;

    public C130084ae(C130085af afVar) {
        this.f356699a = afVar;
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        C46690ah ahVar = C130085af.f356700a;
        C69664n.m101060f(ahVar, "SUGGEST_CONTENT_KEY");
        return ahVar;
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        Optional optional = (Optional) this.f356699a.f356704e.get();
        if (optional.isPresent()) {
            Object obj = optional.get();
            C69664n.m101060f(obj, "correctionOptional.get()");
            C51655m mVar = (C51655m) obj;
            C130088ai aiVar = (C130088ai) C130089aj.f356708f.createBuilder();
            C69664n.m101060f(aiVar, "newBuilder()");
            C69664n.m101061g(aiVar, "builder");
            C130086ag agVar = (C130086ag) C130087ah.f356705b.createBuilder();
            C69664n.m101060f(agVar, "newBuilder()");
            C69664n.m101061g(agVar, "builder");
            List unmodifiableList = Collections.unmodifiableList(((C130087ah) agVar.instance).f356707a);
            C69664n.m101060f(unmodifiableList, "_builder.getItemsList()");
            new C62883b(unmodifiableList);
            C62971cq cqVar = mVar.f134596f;
            C69664n.m101060f(cqVar, "correction.getAlternativeList()");
            C69664n.m101061g(cqVar, "values");
            agVar.copyOnWrite();
            C130087ah ahVar = (C130087ah) agVar.instance;
            C62971cq cqVar2 = ahVar.f356707a;
            if (!cqVar2.mo58948c()) {
                ahVar.f356707a = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) ahVar.f356707a);
            C62942bv build = agVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C130087ah ahVar2 = (C130087ah) build;
            C69664n.m101061g(ahVar2, "value");
            aiVar.copyOnWrite();
            C130089aj ajVar = (C130089aj) aiVar.instance;
            ahVar2.getClass();
            ajVar.f356712c = ahVar2;
            ajVar.f356711b = 2;
            if ((mVar.f134591a & 1) != 0) {
                int i = mVar.f134592b;
                aiVar.copyOnWrite();
                C130089aj ajVar2 = (C130089aj) aiVar.instance;
                ajVar2.f356710a |= 4;
                ajVar2.f356713d = i;
            }
            if ((2 & mVar.f134591a) != 0) {
                int i2 = mVar.f134593c;
                aiVar.copyOnWrite();
                C130089aj ajVar3 = (C130089aj) aiVar.instance;
                ajVar3.f356710a |= 8;
                ajVar3.f356714e = i2;
            }
            C62942bv build2 = aiVar.build();
            C69664n.m101060f(build2, "_builder.build()");
            return C60856cj.m92900i((C130089aj) build2);
        }
        C130085af afVar = this.f356699a;
        C130057b bVar = afVar.f356701b;
        String str = (String) afVar.f356703d.get();
        C58495hd hdVar = C58729pv.f156485a;
        C69664n.m101061g(str, "query");
        C130065j jVar = (C130065j) bVar;
        return C71663i.m104688a(C71803m.m105042c(jVar.f356662b, (C69585o) null, (C71424ay) null, new C130059d(jVar, str, hdVar, (C69577g) null), 3));
    }
}
