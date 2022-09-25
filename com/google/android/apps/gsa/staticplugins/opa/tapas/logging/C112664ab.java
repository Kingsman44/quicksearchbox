package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54807a;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54827at;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54828au;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54844bj;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54845bk;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54914e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.List;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ab */
/* compiled from: PG */
public final /* synthetic */ class C112664ab implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C113408es f312266a;

    /* renamed from: b */
    public final /* synthetic */ OptionalInt f312267b;

    /* renamed from: c */
    public final /* synthetic */ String f312268c;

    /* renamed from: d */
    public final /* synthetic */ C59743a f312269d;

    /* renamed from: e */
    public final /* synthetic */ boolean f312270e;

    /* renamed from: f */
    public final /* synthetic */ int f312271f;

    /* renamed from: g */
    public final /* synthetic */ int f312272g;

    public /* synthetic */ C112664ab(C113408es esVar, OptionalInt optionalInt, String str, C59743a aVar, int i, boolean z, int i2) {
        this.f312266a = esVar;
        this.f312267b = optionalInt;
        this.f312268c = str;
        this.f312269d = aVar;
        this.f312271f = i;
        this.f312270e = z;
        this.f312272g = i2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C113408es esVar = this.f312266a;
        OptionalInt optionalInt = this.f312267b;
        String str = this.f312268c;
        C59743a aVar = this.f312269d;
        int i = this.f312271f;
        boolean z = this.f312270e;
        int i2 = this.f312272g;
        C59071e eVar = C112665ac.f312273a;
        C54807a aVar2 = (C54807a) ((C54914e) obj).toBuilder();
        aVar2.copyOnWrite();
        C54914e eVar2 = (C54914e) aVar2.instance;
        str.getClass();
        eVar2.f144342a |= 1;
        eVar2.f144343b = str;
        C62961ch chVar = esVar.mo100122e().f157901b;
        aVar2.copyOnWrite();
        C54914e eVar3 = (C54914e) aVar2.instance;
        C62961ch chVar2 = eVar3.f144344c;
        if (!chVar2.mo58948c()) {
            eVar3.f144344c = C62942bv.mutableCopy(chVar2);
        }
        C62947c.addAll((Iterable) chVar, (List) eVar3.f144344c);
        aVar2.copyOnWrite();
        C54914e eVar4 = (C54914e) aVar2.instance;
        eVar4.f144346e = i - 1;
        eVar4.f144342a |= 4;
        aVar2.copyOnWrite();
        C54914e eVar5 = (C54914e) aVar2.instance;
        eVar5.f144351j = i2 - 1;
        eVar5.f144342a |= 64;
        C59743a aVar3 = C59743a.AADC_CONSENT_CHANGED;
        switch (aVar.ordinal()) {
            case 748:
                aVar2.copyOnWrite();
                C54914e eVar6 = (C54914e) aVar2.instance;
                eVar6.f144345d = 3;
                eVar6.f144342a = 2 | eVar6.f144342a;
                break;
            case 749:
                aVar2.copyOnWrite();
                C54914e eVar7 = (C54914e) aVar2.instance;
                eVar7.f144345d = 2;
                eVar7.f144342a = 2 | eVar7.f144342a;
                break;
            case 750:
                aVar2.copyOnWrite();
                C54914e eVar8 = (C54914e) aVar2.instance;
                eVar8.f144345d = 1;
                eVar8.f144342a = 2 | eVar8.f144342a;
                break;
            default:
                throw new IllegalArgumentException("Unexpected event name used.");
        }
        C54828au auVar = ((C54914e) aVar2.instance).f144347f;
        if (auVar == null) {
            auVar = C54828au.f143868g;
        }
        C54827at atVar = (C54827at) auVar.toBuilder();
        if (optionalInt.isPresent()) {
            int asInt = optionalInt.getAsInt();
            C54828au auVar2 = ((C54914e) aVar2.instance).f144347f;
            if (auVar2 == null) {
                auVar2 = C54828au.f143868g;
            }
            if (asInt < auVar2.f143872c.size()) {
                C54844bj bjVar = (C54844bj) atVar.mo54159a(optionalInt.getAsInt()).toBuilder();
                bjVar.copyOnWrite();
                C54845bk bkVar = (C54845bk) bjVar.instance;
                bkVar.f143990a |= 1048576;
                bkVar.f144011v = true;
                atVar.mo54160b(optionalInt.getAsInt(), (C54845bk) bjVar.build());
            }
        }
        C112665ac.f312274b.mo105239h("number_of_suggestions", (long) esVar.mo100053o().size());
        aVar2.copyOnWrite();
        C54914e eVar9 = (C54914e) aVar2.instance;
        eVar9.f144342a |= 32;
        eVar9.f144350i = z;
        C58485gu o = esVar.mo100053o();
        int size = o.size();
        for (int i3 = 0; i3 < size; i3++) {
            OptionalInt K = ((C113415ez) o.get(i3)).mo100198K();
            if (K.isPresent()) {
                int asInt2 = K.getAsInt();
                C54828au auVar3 = ((C54914e) aVar2.instance).f144347f;
                if (auVar3 == null) {
                    auVar3 = C54828au.f143868g;
                }
                if (asInt2 < auVar3.f143872c.size()) {
                    int asInt3 = K.getAsInt();
                    C54844bj bjVar2 = (C54844bj) atVar.mo54159a(asInt3).toBuilder();
                    bjVar2.copyOnWrite();
                    C54845bk bkVar2 = (C54845bk) bjVar2.instance;
                    bkVar2.f143990a |= C89885b.NOW_VALUE;
                    bkVar2.f144012w = true;
                    atVar.mo54160b(asInt3, (C54845bk) bjVar2.build());
                }
            }
        }
        aVar2.copyOnWrite();
        C54914e eVar10 = (C54914e) aVar2.instance;
        C54828au auVar4 = (C54828au) atVar.build();
        auVar4.getClass();
        eVar10.f144347f = auVar4;
        eVar10.f144342a |= 8;
        return (C54914e) aVar2.build();
    }
}
