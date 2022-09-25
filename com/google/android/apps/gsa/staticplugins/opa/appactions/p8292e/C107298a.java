package com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e;

import com.google.android.apps.gsa.assistant.shared.appactions.p5807g.C73821h;
import com.google.android.apps.gsa.staticplugins.opa.appactions.C107239ah;
import com.google.android.apps.gsa.staticplugins.opa.appactions.C107307h;
import com.google.android.apps.gsa.staticplugins.opa.appactions.C107308i;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36265d;
import com.google.assistant.p3745ab.C48384r;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49845bc;
import com.google.assistant.p3861at.C49850bh;
import com.google.assistant.p3861at.C49851bi;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.e.a */
/* compiled from: PG */
public final class C107298a {

    /* renamed from: a */
    public static final C59071e f298619a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appactions.e.a");

    /* renamed from: a */
    public final C107308i mo95896a(C36265d dVar) {
        Optional optional;
        Optional optional2;
        Optional optional3;
        Optional optional4;
        Optional optional5;
        C49826ak akVar = dVar.f94716b;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        C107307h a = C107308i.m178129a();
        C107239ah ahVar = (C107239ah) a;
        ahVar.f298466c = Optional.m71637of(akVar.f129471h);
        if (akVar.f129466c.isEmpty()) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(akVar.f129466c);
        }
        if (optional != null) {
            ahVar.f298467d = optional;
            ahVar.f298465b = Optional.m71637of(akVar.f129473j);
            ahVar.f298470g = Optional.m71637of(dVar.f94717c);
            ahVar.f298475l = 4;
            ahVar.f298473j = Optional.m71637of(Boolean.valueOf(akVar.f129477n));
            ahVar.f298474k = Optional.m71637of(Boolean.valueOf(akVar.f129478o));
            if ((dVar.f94715a & 128) != 0) {
                C49845bc bcVar = dVar.f94723i;
                if (bcVar == null) {
                    bcVar = C49845bc.f129538c;
                }
                optional2 = Optional.m71637of(bcVar);
            } else {
                optional2 = Optional.empty();
            }
            a.mo95849e(optional2);
            C49826ak akVar2 = dVar.f94716b;
            if (akVar2 == null) {
                akVar2 = C49826ak.f129462q;
            }
            if (akVar2.f129476m.isEmpty()) {
                optional3 = Optional.empty();
            } else {
                C49826ak akVar3 = dVar.f94716b;
                if (akVar3 == null) {
                    akVar3 = C49826ak.f129462q;
                }
                optional3 = Optional.m71637of(C73821h.m108390a(akVar3));
            }
            a.mo95848d(optional3);
            if ((dVar.f94715a & 64) != 0) {
                C48384r rVar = dVar.f94722h;
                if (rVar == null) {
                    rVar = C48384r.f125066b;
                }
                optional4 = Optional.m71637of(rVar);
            } else {
                optional4 = Optional.empty();
            }
            if (optional4 != null) {
                ahVar.f298471h = optional4;
                if ((dVar.f94715a & 256) != 0) {
                    C49850bh bhVar = (C49850bh) C49851bi.f129552c.createBuilder();
                    String str = dVar.f94724j;
                    bhVar.copyOnWrite();
                    C49851bi biVar = (C49851bi) bhVar.instance;
                    str.getClass();
                    biVar.f129554a |= 1;
                    biVar.f129555b = str;
                    optional5 = Optional.m71637of((C49851bi) bhVar.build());
                } else {
                    optional5 = Optional.empty();
                }
                if (optional5 != null) {
                    ahVar.f298472i = optional5;
                    return a.mo95845a();
                }
                throw new NullPointerException("Null intentCategory");
            }
            throw new NullPointerException("Null clientContext");
        }
        throw new NullPointerException("Null actionQuery");
    }
}
