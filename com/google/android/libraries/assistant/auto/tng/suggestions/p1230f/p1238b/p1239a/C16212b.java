package com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1238b.p1239a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1215a.C15973f;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16169m;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.C16189a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1238b.C16210a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16359bf;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.f.b.a.b */
/* compiled from: PG */
public final class C16212b implements C16210a {

    /* renamed from: a */
    private static final C59071e f47779a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.f.b.a.b");

    /* renamed from: b */
    private final Set f47780b;

    /* renamed from: c */
    private final C16189a f47781c;

    /* renamed from: d */
    private final C16189a f47782d;

    /* renamed from: e */
    private final C16189a f47783e;

    /* renamed from: f */
    private final C15973f f47784f;

    public C16212b(Set set, C16189a aVar, C16189a aVar2, C16189a aVar3, C15973f fVar) {
        this.f47780b = set;
        this.f47781c = aVar;
        this.f47782d = aVar2;
        this.f47783e = aVar3;
        this.f47784f = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo22849a(List list, C15777d dVar) {
        C59104x b = f47779a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SuggestionGenerator");
        ((C59052c) ((C59052c) b).mo56372aa(46642)).mo56386p("Suggestion Generation started.");
        C58480gp e = C58485gu.m89837e();
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C16169m mVar = C16169m.PRELOADED_ON_DEVICE;
            int ordinal = ((C16169m) G.next()).ordinal();
            if (ordinal == 0) {
                e.mo55396h(this.f47783e.mo22848a(C58485gu.m89845m(), dVar));
            } else if (ordinal == 1) {
                C15973f fVar = this.f47784f;
                C16359bf bfVar = dVar.mo22547e().f48165e;
                if (bfVar == null) {
                    bfVar = C16359bf.f48152f;
                }
                C58485gu guVar = (C58485gu) Collection.EL.stream(fVar.mo22634i(bfVar.f48156c)).filter(C16211a.f47778a).collect(C58370cn.f155946a);
                for (C16189a a : this.f47780b) {
                    e.mo55396h(a.mo22848a(guVar, dVar));
                }
            } else if (ordinal == 2) {
                e.mo55396h(this.f47782d.mo22848a(C58485gu.m89845m(), dVar));
            } else if (ordinal == 3) {
                e.mo55396h(this.f47781c.mo22848a(C58485gu.m89845m(), dVar));
            }
        }
        C59104x b2 = f47779a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SuggestionGenerator");
        ((C59052c) ((C59052c) b2).mo56372aa(46643)).mo56386p("Suggestion Generation finished.");
        return C60856cj.m92900i(e.mo55394f());
    }
}
