package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import android.content.res.Resources;
import com.google.android.apps.gsa.assistant.shared.k.a.f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.p8376a.C109369d;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.p8376a.C109370e;
import com.google.assistant.p4008y.p4009a.C53568ba;
import com.google.assistant.p4008y.p4009a.C53569bb;
import com.google.assistant.p4008y.p4009a.C53592by;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.assistant.p4008y.p4009a.C53615x;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.t */
/* compiled from: PG */
public final class C109421t implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C60870cx f304729a;

    /* renamed from: b */
    final /* synthetic */ String f304730b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f304731c;

    /* renamed from: d */
    final /* synthetic */ int f304732d;

    /* renamed from: e */
    final /* synthetic */ Resources f304733e;

    /* renamed from: f */
    final /* synthetic */ C109422u f304734f;

    public C109421t(C109422u uVar, C60870cx cxVar, String str, C60870cx cxVar2, int i, Resources resources) {
        this.f304734f = uVar;
        this.f304729a = cxVar;
        this.f304730b = str;
        this.f304731c = cxVar2;
        this.f304732d = i;
        this.f304733e = resources;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        f fVar = (f) C60856cj.m92909r(this.f304729a);
        if (!fVar.b.equals(this.f304730b) || fVar.c.isEmpty() || !this.f304734f.mo97819d(fVar)) {
            C58833ax axVar = (C58833ax) C60856cj.m92909r(this.f304731c);
            if (!axVar.mo56113h() || !this.f304734f.mo97820e((C53615x) axVar.mo56107c())) {
                ((C89859i) this.f304734f.f304742h.mo27525b()).mo83702b(C89849ae.OPA_CHALKBOARD_SUGGESTIONS_FETCH_EMPTY);
                return this.f304734f.mo97818c(this.f304730b, this.f304732d, this.f304733e);
            }
            ((C89859i) this.f304734f.f304742h.mo27525b()).mo83702b(C89849ae.OPA_CHALKBOARD_SUGGESTIONS_FETCH_SUCCESS);
            C62971cq cqVar = ((C53615x) axVar.mo56107c()).f140724a;
            C109369d dVar = new C109369d();
            dVar.mo97809b(this.f304730b);
            if (this.f304734f.f304736b.mo79746e(C90037cp.f248422aC)) {
                dVar.mo97808a();
            }
            if (this.f304734f.f304736b.mo79746e(C90037cp.f248471az)) {
                dVar.mo97810c();
            }
            List a = new C109370e(dVar).mo97811a(cqVar);
            C109422u uVar = this.f304734f;
            C60870cx h = C60922j.m93045h(((C109398av) uVar.f304739e.mo27525b()).mo97813a(a), new C109414m(uVar, this.f304730b, this.f304732d, this.f304733e), C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
            return h;
        }
        C53592by byVar = (C53592by) C53593bz.f140658j.createBuilder();
        String str = fVar.c;
        byVar.copyOnWrite();
        C53593bz bzVar = (C53593bz) byVar.instance;
        str.getClass();
        bzVar.f140660a |= 1;
        bzVar.f140661b = str;
        C53568ba baVar = (C53568ba) C53569bb.f140594i.createBuilder();
        String str2 = fVar.c;
        baVar.copyOnWrite();
        C53569bb bbVar = (C53569bb) baVar.instance;
        str2.getClass();
        bbVar.f140596a |= 1;
        bbVar.f140597b = str2;
        baVar.copyOnWrite();
        C53569bb bbVar2 = (C53569bb) baVar.instance;
        bbVar2.f140599d = 18;
        bbVar2.f140596a |= 4;
        baVar.copyOnWrite();
        C53569bb bbVar3 = (C53569bb) baVar.instance;
        bbVar3.f140596a |= 8;
        bbVar3.f140600e = 18;
        C53569bb bbVar4 = (C53569bb) baVar.build();
        byVar.copyOnWrite();
        C53593bz bzVar2 = (C53593bz) byVar.instance;
        bbVar4.getClass();
        bzVar2.f140667h = bbVar4;
        bzVar2.f140660a |= 64;
        return C60856cj.m92900i(C58485gu.m89846n((C53593bz) byVar.build()));
    }
}
