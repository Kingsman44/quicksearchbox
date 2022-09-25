package com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9895c;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.appdatasearch.C142796al;
import com.google.android.gms.appdatasearch.C142797am;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.assistant.p3825an.p3830c.p3831a.C49321cm;
import com.google.assistant.p3825an.p3830c.p3831a.C49322cn;
import com.google.assistant.p3825an.p3830c.p3831a.C49334k;
import com.google.assistant.p3825an.p3830c.p3831a.C49335l;
import com.google.assistant.p3825an.p3830c.p3831a.C49336m;
import com.google.assistant.p3825an.p3830c.p3831a.C49337n;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.c.c */
/* compiled from: PG */
public final /* synthetic */ class C130442c implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C130442c f357402a = new C130442c();

    private /* synthetic */ C130442c() {
    }

    public final Object apply(Object obj) {
        Optional optional;
        Optional optional2;
        Optional optional3;
        Optional optional4;
        C49336m mVar = (C49336m) C49337n.f127527b.createBuilder();
        C142797am amVar = new C142797am((SearchResults) obj);
        while (amVar.hasNext()) {
            C142796al a = amVar.next();
            String h = a.mo117712h("text1");
            String g = a.mo117711g();
            String f = a.mo117710f();
            if (C58837ba.m90859h(h) || C58837ba.m90859h(g)) {
                optional = Optional.empty();
            } else {
                C58148f d = a.mo117708d();
                C49334k kVar = (C49334k) C49335l.f127511o.createBuilder();
                kVar.copyOnWrite();
                C49335l lVar = (C49335l) kVar.instance;
                g.getClass();
                lVar.f127513a |= 1;
                lVar.f127514b = g;
                kVar.copyOnWrite();
                C49335l lVar2 = (C49335l) kVar.instance;
                h.getClass();
                lVar2.f127513a |= 2;
                lVar2.f127515c = h;
                String i = a.mo117713i();
                if (i == null) {
                    i = null;
                } else if (d != null) {
                    i = (String) C130440ai.m212874a(d, "shortcutUrl").orElse(i);
                }
                kVar.copyOnWrite();
                C49335l lVar3 = (C49335l) kVar.instance;
                lVar3.f127513a |= 4;
                lVar3.f127516d = C58837ba.m90858g(i);
                String str = (String) Optional.ofNullable(a.mo117709e()).map(C130463x.f357427a).orElse(BuildConfig.FLAVOR);
                kVar.copyOnWrite();
                C49335l lVar4 = (C49335l) kVar.instance;
                str.getClass();
                lVar4.f127513a |= 8;
                lVar4.f127517e = str;
                Optional a2 = C130440ai.m212874a(d, "id");
                String str2 = a2.isPresent() ? (String) a2.get() : BuildConfig.FLAVOR;
                kVar.copyOnWrite();
                C49335l lVar5 = (C49335l) kVar.instance;
                str2.getClass();
                lVar5.f127513a |= 32;
                lVar5.f127519g = str2;
                Optional.empty();
                if (d != null) {
                    Iterator it = d.f155457d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            optional2 = Optional.empty();
                            break;
                        }
                        C58146d dVar = (C58146d) it.next();
                        if (!C58890d.m90990e("isPartOf", dVar.f155446b)) {
                            optional4 = Optional.empty();
                        } else if (dVar.f155450f.size() <= 0) {
                            optional4 = Optional.empty();
                        } else {
                            optional4 = Optional.m71637of((C58148f) dVar.f155450f.get(0));
                        }
                        if (optional4.isPresent()) {
                            optional2 = C130440ai.m212874a((C58148f) optional4.get(), "id");
                            break;
                        }
                    }
                } else {
                    optional2 = Optional.empty();
                }
                String str3 = (String) optional2.orElse(BuildConfig.FLAVOR);
                kVar.copyOnWrite();
                C49335l lVar6 = (C49335l) kVar.instance;
                str3.getClass();
                lVar6.f127513a |= 16;
                lVar6.f127518f = str3;
                if (f == null) {
                    f = "en";
                }
                kVar.copyOnWrite();
                C49335l lVar7 = (C49335l) kVar.instance;
                lVar7.f127513a |= 64;
                lVar7.f127520h = f;
                long b = a.mo117706b();
                kVar.copyOnWrite();
                C49335l lVar8 = (C49335l) kVar.instance;
                lVar8.f127513a |= 512;
                lVar8.f127523k = b;
                long c = a.mo117707c();
                kVar.copyOnWrite();
                C49335l lVar9 = (C49335l) kVar.instance;
                lVar9.f127513a |= 256;
                lVar9.f127522j = c;
                String str4 = (String) C130440ai.m212875b(d, "keywords").flatMap(C130459t.f357423a).filter(C130460u.f357424a).findFirst().orElse(BuildConfig.FLAVOR);
                kVar.copyOnWrite();
                C49335l lVar10 = (C49335l) kVar.instance;
                str4.getClass();
                lVar10.f127513a |= 2048;
                lVar10.f127525m = str4;
                Optional a3 = C130440ai.m212874a(d, "shortcutDescription");
                Optional a4 = C130440ai.m212874a(d, "shortcutLabel");
                Optional a5 = C130440ai.m212874a(d, "image");
                if (!a3.isEmpty() || !a4.isEmpty() || !a5.isEmpty()) {
                    C49321cm cmVar = (C49321cm) C49322cn.f127471e.createBuilder();
                    if (a4.isPresent()) {
                        String str5 = (String) a4.get();
                        cmVar.copyOnWrite();
                        C49322cn cnVar = (C49322cn) cmVar.instance;
                        str5.getClass();
                        cnVar.f127473a |= 2;
                        cnVar.f127475c = str5;
                    }
                    if (a3.isPresent()) {
                        String str6 = (String) a3.get();
                        cmVar.copyOnWrite();
                        C49322cn cnVar2 = (C49322cn) cmVar.instance;
                        str6.getClass();
                        cnVar2.f127473a |= 1;
                        cnVar2.f127474b = str6;
                    }
                    if (a5.isPresent()) {
                        String str7 = (String) a5.get();
                        cmVar.copyOnWrite();
                        C49322cn cnVar3 = (C49322cn) cmVar.instance;
                        str7.getClass();
                        cnVar3.f127473a |= 4;
                        cnVar3.f127476d = str7;
                    }
                    optional3 = Optional.m71637of((C49322cn) cmVar.build());
                } else {
                    optional3 = Optional.empty();
                }
                Objects.requireNonNull(kVar);
                optional3.ifPresent(new C130461v(kVar));
                C130440ai.m212875b(d, "author").filter(C130439ah.f357401a).findFirst().map(C130456q.f357420a).ifPresent(new C130462w(kVar));
                C58485gu guVar = (C58485gu) C130440ai.m212875b(d, "capability").flatMap(C130434ac.f357396a).map(C130435ad.f357397a).collect(C58370cn.f155946a);
                if (!guVar.isEmpty()) {
                    kVar.copyOnWrite();
                    C49335l lVar11 = (C49335l) kVar.instance;
                    C62971cq cqVar = lVar11.f127526n;
                    if (!cqVar.mo58948c()) {
                        lVar11.f127526n = C62942bv.mutableCopy(cqVar);
                    }
                    C62947c.addAll((Iterable) guVar, (List) lVar11.f127526n);
                }
                optional = Optional.m71637of((C49335l) kVar.build());
            }
            if (optional.isPresent()) {
                mVar.mo53233a((C49335l) optional.get());
            }
        }
        return (C49337n) mVar.build();
    }
}
