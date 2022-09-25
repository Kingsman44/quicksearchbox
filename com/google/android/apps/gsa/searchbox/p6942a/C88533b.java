package com.google.android.apps.gsa.searchbox.p6942a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6968aa.C89034be;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6990an.C89213d;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60455qr;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60602vz;
import com.google.common.p4552o.amo;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.anh;
import com.google.common.p4552o.anv;
import com.google.common.p4552o.aof;
import com.google.common.p4552o.aov;
import com.google.common.p4552o.aox;
import com.google.common.p4552o.apd;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.searchbox.a.b */
/* compiled from: PG */
public final class C88533b {

    /* renamed from: a */
    private static final C59071e f239270a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.a.b");

    /* renamed from: b */
    private final C88536e f239271b;

    /* renamed from: c */
    private final C68214a f239272c;

    /* renamed from: d */
    private final C21370a f239273d;

    /* renamed from: e */
    private final C90931ca f239274e;

    /* renamed from: f */
    private final Context f239275f;

    public C88533b(C88536e eVar, C68214a aVar, C21370a aVar2, C90931ca caVar, Context context) {
        this.f239271b = eVar;
        this.f239272c = aVar;
        this.f239273d = aVar2;
        this.f239274e = caVar;
        this.f239275f = context;
    }

    /* renamed from: d */
    private final void m143000d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            C59104x c = f239270a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.s.SbLogger");
            ((C59052c) ((C59052c) c).mo56372aa(9901)).mo56359L("Failed to report icing usage because of missing value(s): package=%s, corpus=%s, uri=%s", C58837ba.m90858g(str), C58837ba.m90858g(str2), C58837ba.m90858g(str3));
            return;
        }
        this.f239274e.mo85139d(new C88532a(this.f239275f, new UsageInfo(new DocumentId(str, str2, str3), this.f239273d.mo26870b())));
    }

    /* renamed from: a */
    public final void mo82170a(long j, int i, C60456qs qsVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        String b = C39191a.m68623b(j);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        mo82171b(tzVar, qsVar);
    }

    /* renamed from: b */
    public final void mo82171b(C60548tz tzVar, C60456qs qsVar) {
        String str;
        if (qsVar != null) {
            C88536e eVar = this.f239271b;
            int i = ((C60555uf) tzVar.instance).f164258m;
            apd apd = qsVar.f163607d;
            if (apd == null) {
                apd = apd.f159555aA;
            }
            apd apd2 = apd;
            if (eVar.f239289j.mo79746e(C90085ej.f250151ab)) {
                eVar.f239288i.mo28211k(eVar.f239288i.mo28203c("saveSearchboxStats", (long) ((int) eVar.f239289j.mo79743a(C90085ej.f250217bs)), new C88534c(eVar, eVar.f239290k.mo26870b(), apd2, i)), "saveSearchboxStatsResult", new C88535d());
            }
            apd apd3 = qsVar.f163607d;
            if (apd3 == null) {
                apd3 = apd.f159555aA;
            }
            aov aov = apd3.f159619k;
            if (aov == null) {
                aov = aov.f159510u;
            }
            if ((aov.f159512a & 16384) != 0) {
                aov aov2 = apd3.f159619k;
                if (aov2 == null) {
                    aov2 = aov.f159510u;
                }
                anh anh = aov2.f159527p;
                if (anh == null) {
                    anh = anh.f159362e;
                }
                String str2 = anh.f159365b;
                if (!TextUtils.isEmpty(str2)) {
                    aov aov3 = apd3.f159619k;
                    if (aov3 == null) {
                        aov3 = aov.f159510u;
                    }
                    if ((aov3.f159512a & 16384) != 0) {
                        anh anh2 = aov3.f159527p;
                        if (anh2 == null) {
                            anh2 = anh.f159362e;
                        }
                        int i2 = aov3.f159514c;
                        str = (i2 == 84 || (i2 == 156 && aov3.f159515d.contains(286))) ? C89235z.m145142n(anh2.f159367d, anh2.f159366c) : anh2.f159365b;
                    } else {
                        str = null;
                    }
                    C86337q b = ((C86338r) this.f239272c.mo27525b()).mo80076b();
                    b.mo80072g("last_interaction_ts_".concat(String.valueOf(str)), this.f239273d.mo26870b());
                    b.commit();
                    m143000d(str2, anh.f159366c, anh.f159367d);
                    String str3 = anh.f159366c;
                    if ("com.google.android.gms".equals(str2) && "apps".equals(str3)) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(anh.f159367d);
                        Intent intent = new Intent("android.intent.action.MAIN");
                        intent.setComponent(unflattenFromString);
                        intent.setPackage(unflattenFromString.getPackageName());
                        intent.addCategory("android.intent.category.LAUNCHER");
                        m143000d(str2, "internal.3p:MobileApplication", intent.toUri(1));
                    }
                } else {
                    C59104x d = f239270a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "sb.s.SbLogger");
                    C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(9899);
                    aov aov4 = apd3.f159619k;
                    if (aov4 == null) {
                        aov4 = aov.f159510u;
                    }
                    cVar.mo56389s("Failed to get intent package name for suggestionInfo %s", aov4);
                }
            } else {
                aov aov5 = apd3.f159619k;
                if (aov5 == null) {
                    aov5 = aov.f159510u;
                }
                if (aov5.f159515d.contains(223)) {
                    aov aov6 = apd3.f159619k;
                    if (aov6 == null) {
                        aov6 = aov.f159510u;
                    }
                    anv anv = aov6.f159531t;
                    if (anv == null) {
                        anv = anv.f159412c;
                    }
                    String str4 = anv.f159415b;
                    if (!TextUtils.isEmpty(str4)) {
                        C86337q b2 = ((C86338r) this.f239272c.mo27525b()).mo80076b();
                        b2.mo80072g("last_interaction_ts_".concat(String.valueOf(str4)), this.f239273d.mo26870b());
                        b2.commit();
                    } else {
                        C59104x d2 = f239270a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "sb.s.SbLogger");
                        C59052c cVar2 = (C59052c) ((C59052c) d2).mo56372aa(9898);
                        aov aov7 = apd3.f159619k;
                        if (aov7 == null) {
                            aov7 = aov.f159510u;
                        }
                        cVar2.mo56389s("Failed to get package name for pixel launcher App result click with suggestionInfo %s", aov7);
                    }
                }
            }
            if (apd3.f159602as.size() > 0) {
                C86337q b3 = ((C86338r) this.f239272c.mo27525b()).mo80076b();
                for (aox aox : apd3.f159602as) {
                    if (aox.f159535b == 1) {
                        aof aof = (aof) aox.f159536c;
                        b3.mo80072g("last_interaction_ts_".concat(String.valueOf(aof.f159475b)), this.f239273d.mo26870b());
                        m143000d(aof.f159475b, aof.f159482i, aof.f159481h);
                    }
                }
                b3.commit();
            }
            apd apd4 = qsVar.f163607d;
            if (apd4 == null) {
                apd4 = apd.f159555aA;
            }
            amt amt = (amt) apd4.toBuilder();
            C89213d.m145119a(amt);
            C60455qr qrVar = (C60455qr) qsVar.toBuilder();
            qrVar.copyOnWrite();
            C60456qs qsVar2 = (C60456qs) qrVar.instance;
            apd apd5 = (apd) amt.build();
            apd5.getClass();
            qsVar2.f163607d = apd5;
            qsVar2.f163604a |= 4;
            C60456qs qsVar3 = (C60456qs) qrVar.build();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            qsVar3.getClass();
            ufVar.f164082P = qsVar3;
            ufVar.f164146b |= 4194304;
        }
        C58976aa aaVar = C58975e.f156826a;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: c */
    public final void mo82172c(long j, int i, C60456qs qsVar, C89037bh bhVar, int i2, amo amo, C60602vz vzVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        String b = C39191a.m68623b(j);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        ufVar3.f164177be = i2 - 1;
        ufVar3.f164251f |= 268435456;
        if (bhVar != null) {
            int i3 = C89034be.m144791a(bhVar.mo27377b()).f181028z;
            tzVar.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar.instance;
            ufVar4.f164093a |= 134217728;
            ufVar4.f164271z = i3;
        }
        if (amo != null) {
            tzVar.copyOnWrite();
            C60555uf ufVar5 = (C60555uf) tzVar.instance;
            ufVar5.f164070D = amo.f159234au;
            ufVar5.f164146b |= 8;
        }
        if (vzVar != null) {
            tzVar.copyOnWrite();
            C60555uf ufVar6 = (C60555uf) tzVar.instance;
            ufVar6.f164270y = vzVar;
            ufVar6.f164093a |= 8388608;
        }
        mo82171b(tzVar, qsVar);
    }
}
