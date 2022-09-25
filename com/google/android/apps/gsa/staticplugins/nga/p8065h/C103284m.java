package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87877gx;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.gms.appdatasearch.C142787ac;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.Section;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.m */
/* compiled from: PG */
public final class C103284m {

    /* renamed from: a */
    private static final C58974d f288078a = C58974d.m91136j();

    /* renamed from: b */
    private final C103274cm f288079b;

    /* renamed from: c */
    private final C85664bo f288080c;

    /* renamed from: d */
    private final C86124t f288081d;

    /* renamed from: e */
    private final C103218ak f288082e;

    /* renamed from: f */
    private final C103296y f288083f;

    /* renamed from: g */
    private final C103236bb f288084g;

    /* renamed from: h */
    private final C103262ca f288085h;

    public C103284m(C103274cm cmVar, C103262ca caVar, C103218ak akVar, C103296y yVar, C103236bb bbVar, C85664bo boVar, C86124t tVar) {
        this.f288079b = cmVar;
        this.f288081d = tVar;
        this.f288080c = boVar;
        this.f288082e = akVar;
        this.f288083f = yVar;
        this.f288084g = bbVar;
        this.f288085h = caVar;
    }

    /* renamed from: a */
    public final C60870cx mo93746a(C87877gx gxVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        C60870cx cxVar4;
        if (!gxVar.f237734b) {
            cxVar = C60856cj.m92900i(C80465m.f220842e);
        } else if (!this.f288081d.mo79746e(C90126fx.f251212eZ) && !this.f288081d.mo79746e(C90126fx.f251267fb)) {
            cxVar = C60856cj.m92900i(C80465m.f220842e);
        } else if (!this.f288080c.mo79197l(C85662bm.WEB_AND_APP_HISTORY)) {
            ((C58970a) ((C58970a) f288078a.mo56225c()).mo56372aa(21481)).mo56386p("Supplemental Web And App Activity bit is not enabled, we should not use this data.");
            cxVar = C60856cj.m92900i(C80465m.f220842e);
        } else {
            C103274cm cmVar = this.f288079b;
            C103210ac e = C103211ad.m171108e();
            C103234b bVar = (C103234b) e;
            bVar.f288004a = "com.android.chrome";
            bVar.f288005b = "internal.3p:WebPage";
            C142787ac acVar = new C142787ac();
            acVar.f387579c = false;
            acVar.f387577a = true;
            acVar.mo117690b(new Section("name", false, 0));
            acVar.mo117690b(new Section("thing_proto", false, 0));
            acVar.f387580d = 5;
            acVar.f387582f = new STSortSpec("(GET_NUM _USAGE_COUNT)");
            bVar.f288006c = acVar.mo117689a();
            C60838bs i = C60838bs.m92859i(cmVar.mo93733a(e.mo93710a()));
            C103262ca caVar = this.f288085h;
            Objects.requireNonNull(caVar);
            cxVar = C60922j.m93045h(i, new C103283l(caVar), C60826bg.f164896a);
        }
        if (!gxVar.f237737e) {
            cxVar2 = C60856cj.m92900i(C80465m.f220842e);
        } else if (!this.f288081d.mo79746e(C90126fx.f251211eY)) {
            cxVar2 = C60856cj.m92900i(C80465m.f220842e);
        } else {
            C60838bs i2 = C60838bs.m92859i(this.f288079b.mo93733a(C103211ad.m171110g()));
            C103236bb bbVar = this.f288084g;
            Objects.requireNonNull(bbVar);
            cxVar2 = C60922j.m93045h(i2, new C103282k(bbVar), C60826bg.f164896a);
        }
        if (!gxVar.f237735c) {
            cxVar3 = C60856cj.m92900i(C80465m.f220842e);
        } else if (!this.f288081d.mo79746e(C90126fx.f251209eW)) {
            cxVar3 = C60856cj.m92900i(C80465m.f220842e);
        } else {
            C103274cm cmVar2 = this.f288079b;
            C103210ac e2 = C103211ad.m171108e();
            C103234b bVar2 = (C103234b) e2;
            bVar2.f288004a = "com.google.android.gms";
            bVar2.f288005b = "internal.3p:MobileApplication";
            C142787ac acVar2 = new C142787ac();
            acVar2.f387579c = false;
            acVar2.f387577a = true;
            acVar2.f387580d = 5;
            acVar2.f387582f = new STSortSpec("(GET_NUM _USAGE_COUNT)");
            acVar2.mo117690b(new Section("name", false, 0));
            acVar2.mo117690b(new Section("thing_proto", false, 0));
            bVar2.f288006c = acVar2.mo117689a();
            C60838bs i3 = C60838bs.m92859i(cmVar2.mo93733a(e2.mo93710a()));
            Objects.requireNonNull(this.f288083f);
            cxVar3 = C60922j.m93045h(i3, new C103279h(), C60826bg.f164896a);
        }
        if (!gxVar.f237736d) {
            cxVar4 = C60856cj.m92900i(C80465m.f220842e);
        } else if (!this.f288081d.mo79746e(C90126fx.f251210eX)) {
            cxVar4 = C60856cj.m92900i(C80465m.f220842e);
        } else {
            C103274cm cmVar3 = this.f288079b;
            C103210ac e3 = C103211ad.m171108e();
            C103234b bVar3 = (C103234b) e3;
            bVar3.f288004a = "com.google.android.googlequicksearchbox";
            bVar3.f288005b = "internal.3p:Person";
            C142787ac acVar3 = new C142787ac();
            acVar3.f387579c = false;
            acVar3.f387577a = true;
            acVar3.mo117690b(new Section("name", false, 0));
            acVar3.mo117690b(new Section("thing_proto", false, 0));
            bVar3.f288006c = acVar3.mo117689a();
            C60838bs i4 = C60838bs.m92859i(cmVar3.mo93733a(e3.mo93710a()));
            C103218ak akVar = this.f288082e;
            Objects.requireNonNull(akVar);
            cxVar4 = C60922j.m93045h(i4, new C103281j(akVar), C60826bg.f164896a);
        }
        return C60922j.m93045h(C60856cj.m92907p(cxVar, cxVar2, cxVar3, cxVar4), C103280i.f288074a, C60826bg.f164896a);
    }
}
