package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.content.Context;
import com.google.android.apps.gsa.assistant.settings.features.e.p;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80139bq;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80140br;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80146bx;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80147by;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80447h;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130326a;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130329d;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130331f;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130332g;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130333h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.j */
/* compiled from: PG */
public final class C103728j implements C103651a {

    /* renamed from: a */
    public final C85005h f288871a;

    /* renamed from: b */
    public final Context f288872b;

    /* renamed from: c */
    private final C58833ax f288873c;

    /* renamed from: d */
    private final C22871g f288874d;

    public C103728j(C85005h hVar, C58833ax axVar, Context context, C22871g gVar) {
        this.f288871a = hVar;
        this.f288872b = context;
        this.f288873c = axVar;
        this.f288874d = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        if (bnVar.f219917a == 29) {
            String str = ((C80447h) bnVar.f219918b).f220806b;
            if (str.isEmpty()) {
                C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
                C80146bx bxVar = (C80146bx) C80147by.f219936c.createBuilder();
                bxVar.copyOnWrite();
                C80147by byVar = (C80147by) bxVar.instance;
                byVar.f219938a |= 1;
                byVar.f219939b = "App package name is missing.";
                C80147by byVar2 = (C80147by) bxVar.build();
                buVar.copyOnWrite();
                C80275dd ddVar = (C80275dd) buVar.instance;
                byVar2.getClass();
                ddVar.f220291b = byVar2;
                ddVar.f220290a = 1;
                return C60856cj.m92900i((C80275dd) buVar.build());
            } else if (p.a(str)) {
                return this.f288874d.mo28209i(((C130333h) ((C58847bk) this.f288873c).f156646a).mo109665a(), "[NGA] AppPreferencesDataHandler.handleRequest", new C103727i(this, bnVar, str));
            } else {
                C80143bu buVar2 = (C80143bu) C80275dd.f220288c.createBuilder();
                C80139bq bqVar = (C80139bq) C80140br.f219924c.createBuilder();
                C130331f fVar = (C130331f) C130332g.f357230b.createBuilder();
                C130326a aVar = (C130326a) C130329d.f357224d.createBuilder();
                aVar.copyOnWrite();
                C130329d dVar = (C130329d) aVar.instance;
                dVar.f357227b = 1;
                dVar.f357226a |= 1;
                aVar.copyOnWrite();
                C130329d dVar2 = (C130329d) aVar.instance;
                dVar2.f357228c = 1;
                dVar2.f357226a |= 2;
                fVar.mo109664a(str, (C130329d) aVar.build());
                bqVar.copyOnWrite();
                C80140br brVar = (C80140br) bqVar.instance;
                C130332g gVar = (C130332g) fVar.build();
                gVar.getClass();
                brVar.f219927b = gVar;
                brVar.f219926a = 1 | brVar.f219926a;
                buVar2.copyOnWrite();
                C80275dd ddVar2 = (C80275dd) buVar2.instance;
                C80140br brVar2 = (C80140br) bqVar.build();
                brVar2.getClass();
                ddVar2.f220291b = brVar2;
                ddVar2.f220290a = 18;
                return C60856cj.m92900i((C80275dd) buVar2.build());
            }
        } else {
            C80143bu buVar3 = (C80143bu) C80275dd.f220288c.createBuilder();
            C80146bx bxVar2 = (C80146bx) C80147by.f219936c.createBuilder();
            bxVar2.copyOnWrite();
            C80147by byVar3 = (C80147by) bxVar2.instance;
            byVar3.f219938a |= 1;
            byVar3.f219939b = "Invalid OneOffRequest type found.";
            C80147by byVar4 = (C80147by) bxVar2.build();
            buVar3.copyOnWrite();
            C80275dd ddVar3 = (C80275dd) buVar3.instance;
            byVar4.getClass();
            ddVar3.f220291b = byVar4;
            ddVar3.f220290a = 1;
            return C60856cj.m92900i((C80275dd) buVar3.build());
        }
    }
}
