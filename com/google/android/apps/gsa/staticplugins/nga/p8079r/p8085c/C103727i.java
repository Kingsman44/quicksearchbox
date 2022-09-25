package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80139bq;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80140br;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80447h;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130328c;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130329d;
import com.google.android.apps.search.assistant.verticals.p9880a.p9883b.C130332g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.aaj;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.aax;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.p4552o.ajy;
import com.google.p3717aq.p3718a.p3719a.C47867a;
import com.google.p3717aq.p3718a.p3719a.C47868b;
import com.google.p3717aq.p3718a.p3719a.C47872f;
import com.google.p3717aq.p3718a.p3719a.C47873g;
import com.google.p3717aq.p3718a.p3719a.C47875i;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.i */
/* compiled from: PG */
public final /* synthetic */ class C103727i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103728j f288868a;

    /* renamed from: b */
    public final /* synthetic */ C80136bn f288869b;

    /* renamed from: c */
    public final /* synthetic */ String f288870c;

    public /* synthetic */ C103727i(C103728j jVar, C80136bn bnVar, String str) {
        this.f288868a = jVar;
        this.f288869b = bnVar;
        this.f288870c = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C80447h hVar;
        C103728j jVar = this.f288868a;
        C80136bn bnVar = this.f288869b;
        String str = this.f288870c;
        C130332g gVar = (C130332g) obj;
        if (bnVar.f219917a == 29) {
            hVar = (C80447h) bnVar.f219918b;
        } else {
            hVar = C80447h.f220803d;
        }
        if (hVar.f220807c) {
            C130329d dVar = C130329d.f357224d;
            str.getClass();
            C62995dn dnVar = gVar.f357232a;
            if (dnVar.containsKey(str)) {
                dVar = (C130329d) dnVar.get(str);
            }
            int a = C130328c.m212774a(dVar.f357227b);
            if (a == 0 || a != 3) {
                C85005h hVar2 = jVar.f288871a;
                String concat = "assistant-settings://?feature=app_integrations&feature_action=".concat(String.valueOf(str));
                String string = jVar.f288872b.getString(R.string.app_preferences_notification_title);
                String string2 = jVar.f288872b.getString(R.string.app_preferences_notification_text);
                String string3 = jVar.f288872b.getString(R.string.app_preferences_notification_setting);
                C47872f fVar = (C47872f) C47887u.f123976l.createBuilder();
                fVar.copyOnWrite();
                C47887u uVar = (C47887u) fVar.instance;
                string.getClass();
                uVar.f123978a = 1;
                uVar.f123979b = string;
                fVar.copyOnWrite();
                C47887u uVar2 = (C47887u) fVar.instance;
                string2.getClass();
                uVar2.f123980c = 7;
                uVar2.f123981d = string2;
                C47867a aVar = (C47867a) C47868b.f123936f.createBuilder();
                aVar.mo51701a(concat);
                fVar.copyOnWrite();
                C47868b bVar = (C47868b) aVar.build();
                bVar.getClass();
                ((C47887u) fVar.instance).f123984g = bVar;
                C47873g gVar2 = (C47873g) C47875i.f123945g.createBuilder();
                gVar2.copyOnWrite();
                C47875i iVar = (C47875i) gVar2.instance;
                string3.getClass();
                iVar.f123947a = 1;
                iVar.f123948b = string3;
                C47867a aVar2 = (C47867a) C47868b.f123936f.createBuilder();
                aVar2.mo51701a(concat);
                gVar2.copyOnWrite();
                C47868b bVar2 = (C47868b) aVar2.build();
                bVar2.getClass();
                ((C47875i) gVar2.instance).f123950d = bVar2;
                fVar.mo51702a(gVar2);
                C47887u uVar3 = (C47887u) fVar.build();
                aax aax = (aax) abc.f134691o.createBuilder();
                aax.copyOnWrite();
                abc abc = (abc) aax.instance;
                uVar3.getClass();
                abc.f134698e = uVar3;
                abc.f134694a |= 2;
                aax.copyOnWrite();
                abc abc2 = (abc) aax.instance;
                abc2.f134694a |= 32;
                abc2.f134700g = 2;
                aax.copyOnWrite();
                abc abc3 = (abc) aax.instance;
                abc3.f134699f = 2;
                abc3.f134694a |= 16;
                aaj aaj = (aaj) aas.f134661u.createBuilder();
                aaj.copyOnWrite();
                aas aas = (aas) aaj.instance;
                aas.f134663a |= 16;
                aas.f134668f = "app_integrations_notification_id";
                aaj.copyOnWrite();
                aas aas2 = (aas) aaj.instance;
                aas2.f134663a |= 256;
                aas2.f134670h = "app_integrations_grouping_key";
                aaj.copyOnWrite();
                aas aas3 = (aas) aaj.instance;
                aas3.f134664b = 1;
                aas3.f134663a |= 1;
                aaj.mo58885m(abc.f134692p, (abc) aax.build());
                hVar2.mo78617M(110, 332, (aas) aaj.build(), ajy.CLIENT_GENERATED);
            }
        }
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        C80139bq bqVar = (C80139bq) C80140br.f219924c.createBuilder();
        bqVar.copyOnWrite();
        C80140br brVar = (C80140br) bqVar.instance;
        gVar.getClass();
        brVar.f219927b = gVar;
        brVar.f219926a |= 1;
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        C80140br brVar2 = (C80140br) bqVar.build();
        brVar2.getClass();
        ddVar.f220291b = brVar2;
        ddVar.f220290a = 18;
        return (C80275dd) buVar.build();
    }
}
