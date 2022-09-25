package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108429ij;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.assistant.p3897e.p3921j.p3926e.C51981gg;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.assistant.p3994s.p3995a.C53430np;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.v */
/* compiled from: PG */
public final class C114890v {

    /* renamed from: a */
    private final C108429ij f318759a;

    /* renamed from: b */
    private final C86124t f318760b;

    /* renamed from: c */
    private final C21370a f318761c;

    public C114890v(C108429ij ijVar, C86124t tVar, C21370a aVar) {
        this.f318759a = ijVar;
        this.f318760b = tVar;
        this.f318761c = aVar;
    }

    /* renamed from: b */
    private static C51986gl m190452b(C53430np npVar) {
        C51981gg ggVar = (C51981gg) C51986gl.f136421f.createBuilder();
        C62971cq cqVar = npVar.f140225b;
        ggVar.copyOnWrite();
        C51986gl glVar = (C51986gl) ggVar.instance;
        glVar.mo53773a();
        C62947c.addAll((Iterable) cqVar, (List) glVar.f136424b);
        return (C51986gl) ggVar.build();
    }

    /* renamed from: a */
    public final List mo101687a(C53430np npVar, e eVar) {
        List list;
        C51133hp a = C51133hp.m86035a(npVar.f140226c);
        if (a == null) {
            a = C51133hp.DEFAULT;
        }
        if (a != C51133hp.DEFAULT) {
            C51133hp a2 = C51133hp.m86035a(npVar.f140226c);
            if (a2 == null) {
                a2 = C51133hp.DEFAULT;
            }
            if (a2 != C51133hp.CONVERSATION_STARTERS) {
                return new ArrayList();
            }
        }
        if (this.f318760b.mo79746e(C90069du.f249740r)) {
            list = this.f318759a.mo96872b(m190452b(npVar), eVar, Optional.m71637of(Long.valueOf(this.f318761c.mo26870b() - npVar.f140227d)));
        } else {
            list = this.f318759a.mo96872b(m190452b(npVar), eVar, Optional.empty());
        }
        C58976aa aaVar = C58975e.f156826a;
        list.size();
        return list;
    }
}
