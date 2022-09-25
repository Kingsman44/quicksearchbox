package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b;

import android.content.Context;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2543a.C32976a;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33113a;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51940et;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.d */
/* compiled from: PG */
public final class C33139d implements C32976a {

    /* renamed from: a */
    public final C32951d f88670a;

    /* renamed from: b */
    public final C37215b f88671b;

    /* renamed from: c */
    public final Map f88672c;

    /* renamed from: d */
    private final C71422aw f88673d;

    public C33139d(C32951d dVar, C37215b bVar, Map map, C71422aw awVar) {
        C69664n.m101061g(dVar, "fluidActionsConfig");
        C69664n.m101061g(bVar, "appFlowLogger");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f88670a = dVar;
        this.f88671b = bVar;
        this.f88672c = map;
        this.f88673d = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo38429a(Context context, C52081en enVar) {
        Optional optional;
        C51940et etVar;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(enVar, "conversationDelta");
        Optional a = C33113a.m61437a(enVar, "ui.FORM_INPUT");
        if (!a.isPresent()) {
            optional = Optional.empty();
        } else {
            Optional c = C33113a.m61439c((C51805du) a.get());
            if (!c.isPresent() || (((C52492tt) c.get()).f137805a & 1) == 0 || (((C52492tt) c.get()).f137805a & 2) == 0) {
                optional = Optional.empty();
            } else {
                C51953ff ffVar = ((C52492tt) c.get()).f137806b;
                if (ffVar == null) {
                    ffVar = C51953ff.f136315l;
                }
                C52507uh uhVar = ((C52492tt) c.get()).f137807c;
                if (uhVar == null) {
                    uhVar = C52507uh.f137838b;
                }
                Optional g = C33136x.m61490g(((C52490tr) uhVar.f137840a.get(0)).f137800d, ffVar);
                if (!g.isPresent() || ((C51941eu) g.get()).f136275c != 24) {
                    optional = Optional.empty();
                } else {
                    C51941eu euVar = (C51941eu) g.get();
                    if (euVar.f136275c == 24) {
                        etVar = (C51940et) euVar.f136276d;
                    } else {
                        etVar = C51940et.f136268b;
                    }
                    C62971cq cqVar = etVar.f136270a;
                    C52091ex exVar = enVar.f136685e;
                    if (exVar == null) {
                        exVar = C52091ex.f136710b;
                    }
                    optional = Optional.m71637of(C33118f.m61461b(cqVar, C58733pz.f156496a, exVar));
                }
            }
        }
        if (optional.isPresent()) {
            return C60856cj.m92900i(optional);
        }
        return C71663i.m104692e(this.f88673d, (C71424ay) null, new C33138c(this, context, enVar, (C69577g) null), 3);
    }
}
