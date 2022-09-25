package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.search.core.google.p6794d.C85947n;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4682d.C61995f;
import com.google.p395al.p417d.p418a.C8521aa;
import com.google.p395al.p417d.p418a.C8525ae;
import com.google.p395al.p417d.p418a.C8575bc;
import com.google.p395al.p417d.p418a.C8586m;
import com.google.p395al.p417d.p418a.C8598y;
import com.google.p4017at.p4060h.p4068b.p4069a.C54196m;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.p.bg */
/* compiled from: PG */
public abstract class C86224bg implements C85947n {

    /* renamed from: i */
    public static final C59071e f233001i = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.bg");

    /* renamed from: a */
    private C86269x f233002a;

    /* renamed from: b */
    private final C21370a f233003b;

    /* renamed from: c */
    private final C90476a f233004c;

    /* renamed from: d */
    private final C84474e f233005d;

    /* renamed from: e */
    private String f233006e;

    /* renamed from: f */
    private final C90931ca f233007f;

    /* renamed from: g */
    private ActionData f233008g;

    /* renamed from: j */
    protected final C68214a f233009j;

    /* renamed from: k */
    public final C86246cb f233010k;

    public C86224bg(C86246cb cbVar, C21370a aVar, C68214a aVar2, C84474e eVar, C90931ca caVar, C90476a aVar3) {
        this.f233010k = cbVar;
        this.f233003b = aVar;
        this.f233009j = aVar2;
        this.f233005d = eVar;
        this.f233007f = caVar;
        this.f233004c = aVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C86269x mo79841h() {
        if (this.f233002a == null) {
            C86246cb cbVar = this.f233010k;
            cbVar.getClass();
            this.f233002a = new C86269x(cbVar, (Query) C90918bo.m148516c(cbVar.mo79865A(), Query.f252741b), this.f233003b, this.f233009j);
        }
        return this.f233002a;
    }

    /* renamed from: i */
    public final void mo79599i() {
        C86246cb cbVar = this.f233010k;
        ActionData actionData = this.f233008g;
        if (actionData == null) {
            cbVar.mo79912ac(ActionData.f235991b);
        } else {
            cbVar.mo79912ac(actionData);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79600j(com.google.android.apps.gsa.search.shared.actions.ActionData r4) {
        /*
            r3 = this;
            com.google.android.apps.gsa.search.shared.actions.ActionData r0 = r3.f233008g
            if (r0 == 0) goto L_0x0069
            com.google.android.apps.gsa.search.core.p.cb r1 = r3.f233010k
            r2 = 0
            if (r1 == 0) goto L_0x0014
            com.google.common.util.concurrent.cx r1 = r1.mo79887e()
            java.lang.Object r1 = com.google.android.apps.gsa.shared.util.p7159c.C90918bo.m148516c(r1, r2)
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
        L_0x0014:
            java.lang.String r1 = r0.f236000j
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0031
            com.google.common.f.e r1 = f233001i
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 7759(0x1e4f, float:1.0873E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            java.lang.String r2 = "Multiple actions received. Using only the first.  New action=%s Existing actions=%s"
            r1.mo56354G(r2, r4, r0)
        L_0x0031:
            dagger.a r4 = r3.f233009j
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r4 = (com.google.android.apps.gsa.shared.logger.C89911f) r4
            com.google.android.apps.gsa.shared.q.a r0 = new com.google.android.apps.gsa.shared.q.a
            r1 = 29
            r2 = 917507(0xe0003, float:1.285701E-39)
            r0.<init>(r1, r2)
            com.google.android.apps.gsa.shared.logger.e r4 = r4.mo83756b(r0)
            r0 = 24144458(0x1706a4a, float:4.4157297E-38)
            r4.f246282c = r0
            com.google.android.apps.gsa.search.core.p.cb r0 = r3.f233010k
            if (r0 == 0) goto L_0x0065
            com.google.common.util.concurrent.cx r0 = r0.mo79865A()
            boolean r1 = com.google.android.apps.gsa.shared.util.p7159c.C90918bo.m148517d(r0)
            if (r1 == 0) goto L_0x0065
            java.lang.Object r0 = com.google.android.apps.gsa.shared.util.p7159c.C90918bo.m148515b(r0)
            com.google.android.apps.gsa.shared.search.Query r0 = (com.google.android.apps.gsa.shared.search.Query) r0
            long r0 = r0.f252749G
            r4.mo83725d(r0)
        L_0x0065:
            r4.mo83721a()
            return
        L_0x0069:
            r3.f233008g = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6816p.C86224bg.mo79600j(com.google.android.apps.gsa.search.shared.actions.ActionData):void");
    }

    /* renamed from: k */
    public final void mo79601k(int i) {
        this.f233010k.mo79910aa(i);
    }

    /* renamed from: l */
    public final void mo79602l() {
        this.f233010k.mo79908Y();
    }

    /* renamed from: m */
    public final void mo79603m(List list) {
        this.f233010k.mo79916ag(list);
    }

    /* renamed from: n */
    public final void mo79604n(String str) {
        this.f233010k.mo79917ah(str);
    }

    /* renamed from: o */
    public final void mo79605o(C54196m mVar) {
        mo79841h().mo79968a(mVar);
    }

    /* renamed from: p */
    public final void mo79606p(C8586m mVar) {
        this.f233007f.mo85142g(this.f233005d.mo78117f(), new C86222be(this, mVar));
    }

    /* renamed from: q */
    public final void mo79607q(C8598y yVar, String str) {
        if (this.f233006e == null && (yVar.f29753a & 1) != 0) {
            String str2 = yVar.f29754b;
            this.f233006e = str2;
            this.f233010k.mo79922am(str2);
        }
        if (!C58837ba.m90859h(str)) {
            this.f233010k.mo79917ah(str);
        }
        if ((yVar.f29753a & 4) != 0) {
            this.f233010k.mo79925ap(yVar.f29756d);
        }
        C86269x h = mo79841h();
        byte[] N = yVar.f29755c.mo59174N();
        C58976aa aaVar = C58975e.f156826a;
        try {
            h.mo79968a((C54196m) C62942bv.parseFrom((C62942bv) C54196m.f142231f, N, C62921ba.m95368a()));
        } catch (C62974ct e) {
            C59104x d = C86269x.f233206a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "CS.Handler");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7740)).mo56386p("Invalid bytes for GetRenderedCardsResponse");
        }
    }

    /* renamed from: r */
    public final void mo79608r(C8521aa aaVar) {
        this.f233010k.mo79925ap(aaVar.f29562b);
    }

    /* renamed from: s */
    public final void mo79609s(String[] strArr) {
        this.f233010k.mo79924ao(strArr);
    }

    /* renamed from: t */
    public final void mo79610t(C61995f fVar) {
        this.f233010k.mo79926aq(fVar);
    }

    /* renamed from: u */
    public final void mo79611u(C86247cc ccVar) {
        this.f233010k.mo79928as(ccVar);
    }

    /* renamed from: v */
    public final void mo79612v(C8525ae aeVar) {
        this.f233010k.mo79929at(aeVar);
    }

    /* renamed from: w */
    public final void mo79613w(int i) {
        this.f233010k.mo79911ab(i);
    }

    /* renamed from: x */
    public final void mo79614x(C8575bc bcVar) {
        this.f233010k.mo79934ay(bcVar);
    }

    /* renamed from: y */
    public final void mo79615y(C58179b bVar) {
        this.f233010k.mo79935az(bVar);
    }

    /* renamed from: z */
    public boolean mo79842z(C90456c cVar) {
        this.f233010k.mo79840k(cVar);
        return true;
    }
}
