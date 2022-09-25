package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112557l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48570ad;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48716bx;
import com.google.assistant.p3781ad.p3789d.p3791b.C48718bz;
import com.google.assistant.p3781ad.p3789d.p3791b.C48721cb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.bw */
/* compiled from: PG */
public final /* synthetic */ class C113075bw implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C113083cd f313308a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f313309b;

    /* renamed from: c */
    public final /* synthetic */ String f313310c;

    public /* synthetic */ C113075bw(C113083cd cdVar, C58485gu guVar, String str) {
        this.f313308a = cdVar;
        this.f313309b = guVar;
        this.f313310c = str;
    }

    public final Object get() {
        C113083cd cdVar = this.f313308a;
        C58485gu guVar = this.f313309b;
        String str = this.f313310c;
        Optional o = cdVar.f313322c.mo99544o();
        if (o.isEmpty()) {
            C59104x d = C113083cd.f313321b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TapasUserProfileFeature");
            ((C59052c) ((C59052c) d).mo56372aa(27942)).mo56386p("Profile signal is not available");
            return false;
        }
        cdVar.f313325f = new C113052b();
        cdVar.f313326g.clear();
        cdVar.f313327h.clear();
        cdVar.f313328i.clear();
        cdVar.f313329j.clear();
        cdVar.f313330k.clear();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C113415ez ezVar = (C113415ez) guVar.get(i);
            Map.EL.putIfAbsent(cdVar.f313326g, ezVar.mo100199L(), new C113052b());
            Map.EL.putIfAbsent(cdVar.f313327h, Integer.valueOf(ezVar.mo100204d()), new C113052b());
            Map.EL.putIfAbsent(cdVar.f313328i, ezVar.mo100210j(), new C113052b());
            Map.EL.putIfAbsent(cdVar.f313329j, Integer.valueOf(ezVar.mo100211k().f125915O), new C113052b());
            ezVar.mo100056O().ifPresent(new C113076bx(cdVar));
            C112557l.m186378d(ezVar).ifPresent(new C113077by(cdVar));
            Optional b = C112557l.m186376b(ezVar);
            if (b.isPresent()) {
                Optional e = cdVar.f313334o.mo99348a((C48570ad) b.get()).mo99343e();
                if (e.isPresent()) {
                    Map.EL.putIfAbsent(cdVar.f313332m, (String) e.get(), new C113052b());
                }
            }
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        for (C48716bx bxVar : ((C48718bz) o.get()).f126053a) {
            if (Thread.interrupted()) {
                return false;
            }
            String lowerCase2 = bxVar.f126047c.toLowerCase(Locale.getDefault());
            boolean startsWith = lowerCase2.startsWith(lowerCase);
            boolean equals = lowerCase2.equals(lowerCase);
            for (C48721cb cbVar : bxVar.f126046b) {
                if (Thread.interrupted()) {
                    return false;
                }
                boolean z = cbVar.f126064h;
                cdVar.f313325f.mo99836g(z, startsWith, equals);
                C113052b bVar = (C113052b) cdVar.f313326g.get(cbVar.f126062f);
                if (bVar != null) {
                    bVar.mo99836g(z, startsWith, equals);
                }
                C113052b bVar2 = (C113052b) cdVar.f313327h.get(Integer.valueOf(cbVar.f126058b));
                if (bVar2 != null) {
                    bVar2.mo99836g(z, startsWith, equals);
                }
                java.util.Map map = cdVar.f313328i;
                C48580an b2 = C48580an.m85241b(cbVar.f126061e);
                if (b2 == null) {
                    b2 = C48580an.UNKNOWN;
                }
                C113052b bVar3 = (C113052b) map.get(b2);
                if (bVar3 != null) {
                    bVar3.mo99836g(z, startsWith, equals);
                }
                C113052b bVar4 = (C113052b) cdVar.f313329j.get(Integer.valueOf(cbVar.f126063g));
                if (bVar4 != null) {
                    bVar4.mo99836g(z, startsWith, equals);
                }
                C113052b bVar5 = (C113052b) cdVar.f313330k.get(cbVar.f126067k);
                if (bVar5 != null) {
                    bVar5.mo99836g(z, startsWith, equals);
                }
                C113052b bVar6 = (C113052b) cdVar.f313331l.get(Integer.valueOf(cbVar.f126065i));
                if (bVar6 != null) {
                    bVar6.mo99836g(z, startsWith, equals);
                }
                C113052b bVar7 = (C113052b) cdVar.f313332m.get(cbVar.f126066j);
                if (bVar7 != null) {
                    bVar7.mo99836g(z, startsWith, equals);
                }
            }
            Collection.EL.stream(cdVar.f313327h.values()).forEach(C113074bv.f313307a);
            Collection.EL.stream(cdVar.f313328i.values()).forEach(C113074bv.f313307a);
            Collection.EL.stream(cdVar.f313329j.values()).forEach(C113074bv.f313307a);
            Collection.EL.stream(cdVar.f313330k.values()).forEach(C113074bv.f313307a);
        }
        return true;
    }
}
