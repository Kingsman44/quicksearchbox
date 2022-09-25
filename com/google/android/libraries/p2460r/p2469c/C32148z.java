package com.google.android.libraries.p2460r.p2469c;

import android.view.View;
import com.google.android.libraries.p2460r.p2461a.p2462a.p2463a.C32049a;
import com.google.android.libraries.p2460r.p2464b.p2466b.C32054a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32058a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32063f;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57349aa;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57351ac;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57357ai;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57358aj;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57359ak;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57407ce;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57408cf;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57411ci;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57413ck;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57414cl;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57416cn;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57444do;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57446dq;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57457ea;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57466ej;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57467ek;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57470en;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57472ep;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57474er;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57501i;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57505m;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57515w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.r.c.z */
/* compiled from: PG */
public final class C32148z {

    /* renamed from: a */
    final C32090au f86334a;

    /* renamed from: b */
    public final List f86335b;

    /* renamed from: c */
    public final C32049a f86336c;

    /* renamed from: d */
    public final C32136n f86337d;

    /* renamed from: e */
    public final C32058a f86338e;

    /* renamed from: f */
    public final Map f86339f;

    /* renamed from: g */
    public final C57438di f86340g;

    /* renamed from: h */
    public final Map f86341h;

    /* renamed from: i */
    private final C32072ac f86342i;

    /* renamed from: j */
    private final Map f86343j;

    /* renamed from: k */
    private final Map f86344k;

    /* renamed from: l */
    private final C57472ep f86345l;

    /* renamed from: m */
    private final View f86346m;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C32148z(C57438di diVar, Map map, List list, C32090au auVar, C32049a aVar, C32136n nVar, C32058a aVar2, C32072ac acVar, View view) {
        this(diVar, map, new C32147y(), list, auVar, aVar, nVar, aVar2, acVar, new C32079aj("Template", C57404cb.ERR_DUPLICATE_TEMPLATE), view);
        C57438di diVar2 = diVar;
        this.f86343j.putAll(this.f86334a.f86168b);
        if (diVar2.f153423e.size() > 0) {
            for (C57446dq dqVar : diVar2.f153423e) {
                if (auVar.f86169c.mo37859a(dqVar.f153450d)) {
                    this.f86343j.put(dqVar.f153447a, dqVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C32148z mo37959a(C57446dq dqVar, C57357ai aiVar) {
        C32079aj ajVar = new C32079aj("BindingValue", C57404cb.ERR_DUPLICATE_BINDING_VALUE);
        for (C57359ak akVar : aiVar.f153231a) {
            if (akVar.f153236b == 16) {
                C57359ak akVar2 = (C57359ak) this.f86341h.get((String) akVar.f153237c);
                if (akVar2 != null) {
                    C57358aj ajVar2 = (C57358aj) akVar2.toBuilder();
                    String str = akVar.f153238d;
                    ajVar2.copyOnWrite();
                    C57359ak akVar3 = (C57359ak) ajVar2.instance;
                    str.getClass();
                    akVar3.f153235a |= 1;
                    akVar3.f153238d = str;
                    ajVar.put(akVar.f153238d, (C57359ak) ajVar2.build());
                }
            } else {
                ajVar.put(akVar.f153238d, akVar);
            }
        }
        C32090au auVar = this.f86334a;
        C57444do doVar = dqVar.f153448b;
        if (doVar == null) {
            doVar = C57444do.f153440c;
        }
        return new C32148z(this.f86340g, auVar.mo37869a(doVar, this.f86337d), ajVar, this.f86335b, this.f86334a, this.f86336c, this.f86337d, this.f86338e, this.f86342i, this.f86343j, this.f86346m);
    }

    /* renamed from: b */
    public final C32094ay mo37960b(C57474er erVar) {
        int i;
        C57457ea eaVar;
        C57472ep epVar = this.f86345l;
        Map map = this.f86344k;
        C57470en enVar = (C57470en) epVar.toBuilder();
        Iterator it = erVar.f153545b.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (map.containsKey(str)) {
                enVar.mergeFrom((C57472ep) map.get(str));
            } else {
                String format = String.format("Unable to bind style [%s], style not found in Stylesheet", new Object[]{str});
                mo37967i(1, C57404cb.ERR_MISSING_STYLE, format);
                C32054a.m59731b(5, "PietStylesHelper", (Throwable) null, format, new Object[0]);
            }
        }
        if ((erVar.f153544a & 1) != 0) {
            C57351ac acVar = erVar.f153546c;
            if (acVar == null) {
                acVar = C57351ac.f153216b;
            }
            C57359ak akVar = (C57359ak) this.f86341h.get(acVar.f153218a);
            if (!(akVar == null || (akVar.f153235a & 16384) == 0)) {
                akVar = C32063f.m59746a(akVar);
            }
            if (akVar == null) {
                eaVar = C57457ea.f153482f;
            } else {
                if (akVar.f153236b != 11) {
                    C32054a.m59731b(5, "FrameContext", (Throwable) null, mo37967i(2, C57404cb.ERR_BINDING_VALUE_TYPE_MISMATCH, String.format("No style found for binding %s", new Object[]{acVar.f153218a})), new Object[0]);
                }
                if (akVar.f153236b == 11) {
                    eaVar = (C57457ea) akVar.f153237c;
                } else {
                    eaVar = C57457ea.f153482f;
                }
            }
            if ((eaVar.f153484a & 2) != 0) {
                C57408cf cfVar = ((C57472ep) enVar.instance).f153525i;
                if (cfVar == null) {
                    cfVar = C57408cf.f153369c;
                }
                C57407ce ceVar = (C57407ce) cfVar.toBuilder();
                C57408cf cfVar2 = eaVar.f153486c;
                if (cfVar2 == null) {
                    cfVar2 = C57408cf.f153369c;
                }
                ceVar.mergeFrom(cfVar2);
                enVar.copyOnWrite();
                C57472ep epVar2 = (C57472ep) enVar.instance;
                C57408cf cfVar3 = (C57408cf) ceVar.build();
                cfVar3.getClass();
                epVar2.f153525i = cfVar3;
                epVar2.f153517a |= 4;
            }
            if ((eaVar.f153484a & 1) != 0) {
                int i2 = eaVar.f153485b;
                enVar.copyOnWrite();
                C57472ep epVar3 = (C57472ep) enVar.instance;
                epVar3.f153517a = 2 | epVar3.f153517a;
                epVar3.f153524h = i2;
            }
            if ((eaVar.f153484a & 4) != 0) {
                C57467ek ekVar = ((C57472ep) enVar.instance).f153526j;
                if (ekVar == null) {
                    ekVar = C57467ek.f153507d;
                }
                C57466ej ejVar = (C57466ej) ekVar.toBuilder();
                C57467ek ekVar2 = eaVar.f153487d;
                if (ekVar2 == null) {
                    ekVar2 = C57467ek.f153507d;
                }
                ejVar.mergeFrom(ekVar2);
                enVar.copyOnWrite();
                C57472ep epVar4 = (C57472ep) enVar.instance;
                C57467ek ekVar3 = (C57467ek) ejVar.build();
                ekVar3.getClass();
                epVar4.f153526j = ekVar3;
                epVar4.f153517a |= 8;
            }
            if ((eaVar.f153484a & 8) != 0) {
                int a = C57413ck.m88348a(eaVar.f153488e);
                if (a != 0) {
                    i = a;
                }
                enVar.copyOnWrite();
                C57472ep epVar5 = (C57472ep) enVar.instance;
                epVar5.f153538v = i - 1;
                epVar5.f153517a |= 524288;
            }
        }
        return new C32094ay((C57472ep) enVar.build(), this.f86342i.f86117a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C57501i mo37961c(C57505m mVar) {
        C57359ak akVar = (C57359ak) this.f86341h.get(mVar.f153609a);
        if (!(akVar == null || (akVar.f153235a & 16384) == 0)) {
            akVar = C32063f.m59746a(akVar);
        }
        if (akVar == null) {
            return C57501i.f153593f;
        }
        if (akVar.f153236b != 10) {
            C32054a.m59731b(5, "FrameContext", (Throwable) null, mo37967i(2, C57404cb.ERR_BINDING_VALUE_TYPE_MISMATCH, String.format("No actions found for binding %s", new Object[]{mVar.f153609a})), new Object[0]);
        }
        if (akVar.f153236b == 10) {
            return (C57501i) akVar.f153237c;
        }
        return C57501i.f153593f;
    }

    /* renamed from: d */
    public final C57359ak mo37962d(String str) {
        C57359ak akVar = (C57359ak) this.f86341h.get(str);
        return akVar == null ? C57359ak.f153233f : akVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C57359ak mo37963e(C57515w wVar) {
        C57359ak d = mo37962d(wVar.f153632a);
        if ((d.f153235a & 16384) != 0) {
            d = C32063f.m59746a(d);
        }
        if (d.f153236b == 5 || wVar.f153633b) {
            return d;
        }
        throw new C32083an(C57404cb.ERR_MISSING_BINDING_VALUE, mo37967i(1, C57404cb.ERR_MISSING_BINDING_VALUE, String.format("Image binding not found for %s", new Object[]{wVar.f153632a})));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C57359ak mo37964f(C57349aa aaVar) {
        C57359ak d = mo37962d(aaVar.f153213a);
        if ((d.f153235a & 16384) != 0) {
            d = C32063f.m59746a(d);
        }
        if (d.f153236b == 3 || aaVar.f153214b) {
            return d;
        }
        throw new C32083an(C57404cb.ERR_MISSING_BINDING_VALUE, mo37967i(1, C57404cb.ERR_MISSING_BINDING_VALUE, String.format("Parameterized text binding not found for %s", new Object[]{aaVar.f153213a})));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C57414cl mo37965g(C57414cl clVar) {
        C57411ci ciVar = (C57411ci) clVar.toBuilder();
        ciVar.copyOnWrite();
        ((C57414cl) ciVar.instance).f153382a = C57414cl.emptyProtobufList();
        for (C57416cn cnVar : clVar.f153382a) {
            C32090au auVar = this.f86334a;
            if (auVar.f86169c.mo37859a(cnVar.f153388c)) {
                ciVar.mo54483a(cnVar);
            }
        }
        return (C57414cl) ciVar.build();
    }

    /* renamed from: h */
    public final C57446dq mo37966h(String str) {
        C57446dq dqVar = (C57446dq) this.f86343j.get(str);
        if (dqVar != null) {
            return dqVar;
        }
        throw new C32083an(C57404cb.ERR_MISSING_TEMPLATE, mo37967i(1, C57404cb.ERR_MISSING_TEMPLATE, String.format("Template '%s' not found", new Object[]{str})));
    }

    /* renamed from: i */
    public final String mo37967i(int i, C57404cb cbVar, String str) {
        String format = String.format("[%s] %s", new Object[]{this.f86340g.f153420b, str});
        this.f86337d.mo37936a(i, cbVar, format);
        return format;
    }

    /* renamed from: j */
    public final String mo37968j(String str) {
        String format = String.format("[%s] %s", new Object[]{this.f86340g.f153420b, str});
        this.f86337d.mo37936a(1, C57404cb.ERR_UNSPECIFIED, format);
        return format;
    }

    public C32148z(C57438di diVar, Map map, Map map2, List list, C32090au auVar, C32049a aVar, C32136n nVar, C32058a aVar2, C32072ac acVar, Map map3, View view) {
        this.f86340g = diVar;
        this.f86344k = map;
        this.f86341h = map2;
        this.f86345l = C57472ep.f153516y;
        this.f86334a = auVar;
        this.f86335b = list;
        this.f86336c = aVar;
        this.f86337d = nVar;
        this.f86338e = aVar2;
        this.f86342i = acVar;
        this.f86343j = map3;
        this.f86346m = view;
        this.f86339f = new HashMap();
    }
}
