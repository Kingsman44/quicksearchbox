package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113295bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.common.base.C58835az;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.function.Function;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.fw */
/* compiled from: PG */
final class C112450fw {

    /* renamed from: a */
    final HashMap f311956a = new HashMap();

    /* renamed from: b */
    final C58485gu f311957b;

    /* renamed from: c */
    final C58495hd f311958c;

    /* renamed from: d */
    final C58485gu f311959d;

    /* renamed from: e */
    final Map f311960e;

    /* renamed from: f */
    final int f311961f;

    /* renamed from: g */
    final C113415ez f311962g;

    /* renamed from: h */
    double f311963h;

    /* renamed from: i */
    int f311964i = 0;

    /* renamed from: j */
    final /* synthetic */ C112451fx f311965j;

    public C112450fw(C112451fx fxVar, C48674ai aiVar, Map map) {
        this.f311965j = fxVar;
        this.f311960e = map;
        C58485gu a = fxVar.f311968c.mo99517a(aiVar, map);
        this.f311957b = a;
        this.f311958c = (C58495hd) IntStream.CC.range(0, a.size()).boxed().collect(C58370cn.m89403c(new C112442fo(this), new C112443fp(this), C112444fq.f311951a));
        C58485gu guVar = (C58485gu) Collection.EL.stream(map.values()).flatMap(new C112445fr()).sorted(Comparator.EL.thenComparing(Comparator.CC.comparing(C112446fs.f311952a), (Function) new C112447ft(this))).collect(C58370cn.f155946a);
        this.f311959d = guVar;
        this.f311963h = ((Double) Collection.EL.stream(guVar).map(C112448fu.f311954a).reduce(Double.valueOf(1.0d), C112449fv.f311955a)).doubleValue();
        this.f311961f = guVar.size();
        this.f311962g = (C113415ez) ((C58835az) C58557jl.m90131l(guVar)).f156631a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo99525a(C48670ae aeVar, int i) {
        C113295bt btVar = (C113295bt) this.f311960e.get(aeVar);
        btVar.getClass();
        double a = ((C113415ez) btVar.f313760a.get(i)).mo100201a();
        if (a >= 1.0d) {
            C59104x d = C112451fx.f311966a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasLowScore");
            ((C59052c) ((C59052c) d).mo56372aa(27617)).mo56389s("Unexpected suppressed suggestion score %f", Double.valueOf(a));
            return;
        }
        double d2 = this.f311963h / (1.0d - a);
        if (!mo99527c() && !mo99526b(aeVar, i) && 1.0d - d2 >= this.f311965j.f311967b.mo79747m(C90063do.f249473eG)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f311964i++;
            Set set = (Set) this.f311956a.get(aeVar);
            if (set == null) {
                set = new HashSet();
                this.f311956a.put(aeVar, set);
            }
            set.add(Integer.valueOf(i));
            this.f311963h = d2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo99526b(C48670ae aeVar, int i) {
        Set set = (Set) this.f311956a.get(aeVar);
        return set != null && set.contains(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo99527c() {
        return ((long) (this.f311961f - this.f311964i)) <= this.f311965j.f311967b.mo79743a(C90063do.f249478eL) || 1.0d - this.f311963h < this.f311965j.f311967b.mo79747m(C90063do.f249473eG);
    }
}
