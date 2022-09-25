package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Intent;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80499b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80501d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80502e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87984kw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87985kx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87986ky;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90025cd;
import com.google.android.apps.gsa.shared.p7066m.C90032ck;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108230ba;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107462aa;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107496v;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.android.libraries.gsa.conversation.p1855h.C22694ag;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.assistant.p3897e.p3921j.p3926e.C52056o;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hp */
/* compiled from: PG */
final class C109209hp implements C11301i {

    /* renamed from: a */
    final /* synthetic */ C109258hw f304066a;

    /* renamed from: b */
    private final C58833ax f304067b;

    public C109209hp(C109258hw hwVar, C58833ax axVar) {
        this.f304066a = hwVar;
        this.f304067b = axVar;
    }

    /* renamed from: a */
    public final void mo19718a(Intent intent, C22694ag agVar) {
        C108230ba baVar = this.f304066a.f304280c;
        Objects.requireNonNull(agVar);
        baVar.mo95437z(intent, new C109208ho(agVar));
    }

    /* renamed from: b */
    public final void mo19719b(C58485gu guVar, boolean z) {
        if (z) {
            int size = guVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    C58480gp e = C58485gu.m89837e();
                    e.mo55396h(guVar);
                    C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
                    dxVar.copyOnWrite();
                    C51809dy dyVar = (C51809dy) dxVar.instance;
                    dyVar.f135935a |= 1;
                    dyVar.f135936b = "ui.EXIT_NATIVE_FORM";
                    C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
                    C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
                    kbVar.copyOnWrite();
                    C52232kc kcVar = (C52232kc) kbVar.instance;
                    kcVar.f137064a |= 1;
                    kcVar.f137065b = "exit_native_form_args";
                    C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
                    jzVar.copyOnWrite();
                    C52230ka kaVar = (C52230ka) jzVar.instance;
                    kaVar.f137059a |= 1;
                    kaVar.f137060b = "assistant.api.client_op.ui.ExitNativeFormArgs";
                    C63088z byteString = C52056o.f136624a.toByteString();
                    jzVar.copyOnWrite();
                    C52230ka kaVar2 = (C52230ka) jzVar.instance;
                    byteString.getClass();
                    kaVar2.f137059a |= 2;
                    kaVar2.f137061c = byteString;
                    kbVar.copyOnWrite();
                    C52232kc kcVar2 = (C52232kc) kbVar.instance;
                    C52230ka kaVar3 = (C52230ka) jzVar.build();
                    kaVar3.getClass();
                    kcVar2.f137066c = kaVar3;
                    kcVar2.f137064a |= 2;
                    dvVar.mo53733c((C52232kc) kbVar.build());
                    C51807dw dwVar = (C51807dw) dvVar.build();
                    dxVar.copyOnWrite();
                    C51809dy dyVar2 = (C51809dy) dxVar.instance;
                    dwVar.getClass();
                    dyVar2.f135938d = dwVar;
                    dyVar2.f135935a |= 4;
                    e.mo55395g((C51809dy) dxVar.build());
                    guVar = e.mo55394f();
                    break;
                }
                int i2 = i + 1;
                if (((C51809dy) guVar.get(i)).f135936b.equals("ui.EXIT_NATIVE_FORM")) {
                    break;
                }
                i = i2;
            }
        }
        C107496v vVar = (C107496v) C107462aa.f299031h.createBuilder();
        vVar.copyOnWrite();
        C107462aa aaVar = (C107462aa) vVar.instance;
        C62971cq cqVar = aaVar.f299036d;
        if (!cqVar.mo58948c()) {
            aaVar.f299036d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) aaVar.f299036d);
        vVar.copyOnWrite();
        C107462aa aaVar2 = (C107462aa) vVar.instance;
        aaVar2.f299038f = 1;
        aaVar2.f299033a |= 8;
        C58833ax axVar = this.f304067b;
        if (axVar.mo56113h()) {
            if (((Query) axVar.mo56107c()).mo84363bw("android.opa.extra.QUERY_RESPONSE_GENERATED_BY_NGA")) {
                vVar.copyOnWrite();
                C107462aa aaVar3 = (C107462aa) vVar.instance;
                aaVar3.f299037e = 1;
                aaVar3.f299033a |= 4;
            }
            long j = ((Query) this.f304067b.mo56107c()).f252749G;
            vVar.copyOnWrite();
            C107462aa aaVar4 = (C107462aa) vVar.instance;
            aaVar4.f299033a |= 16;
            aaVar4.f299039g = j;
        }
        this.f304066a.mo97719i((C107462aa) vVar.build());
    }

    /* renamed from: c */
    public final void mo19720c(C11298f fVar) {
        C107496v vVar = (C107496v) C107462aa.f299031h.createBuilder();
        C51953ff b = fVar.mo19713b();
        vVar.copyOnWrite();
        C107462aa aaVar = (C107462aa) vVar.instance;
        b.getClass();
        aaVar.f299034b = b;
        aaVar.f299033a |= 1;
        C52507uh a = fVar.mo19712a();
        vVar.copyOnWrite();
        C107462aa aaVar2 = (C107462aa) vVar.instance;
        a.getClass();
        aaVar2.f299035c = a;
        aaVar2.f299033a |= 2;
        C58833ax axVar = this.f304067b;
        if (axVar.mo56113h()) {
            if (((Query) axVar.mo56107c()).mo84363bw("android.opa.extra.QUERY_RESPONSE_GENERATED_BY_NGA")) {
                vVar.copyOnWrite();
                C107462aa aaVar3 = (C107462aa) vVar.instance;
                aaVar3.f299037e = 1;
                aaVar3.f299033a |= 4;
            }
            long j = ((Query) this.f304067b.mo56107c()).f252749G;
            vVar.copyOnWrite();
            C107462aa aaVar4 = (C107462aa) vVar.instance;
            aaVar4.f299033a |= 16;
            aaVar4.f299039g = j;
        }
        if (((C86124t) this.f304066a.f304283f.mo27525b()).mo79746e(C90025cd.f248137A) && C109258hw.m181890n(this.f304066a.f304280c)) {
            this.f304066a.f304280c.mo95367I();
        }
        if (fVar.mo19712a().f137840a.size() > 0) {
            ((C59052c) ((C59052c) C109258hw.f304227a.mo56224b()).mo56372aa(22736)).mo56389s("#onFormDataUpdated [%s]", ((C52490tr) fVar.mo19712a().f137840a.get(0)).f137800d);
        } else {
            ((C59052c) ((C59052c) C109258hw.f304227a.mo56224b()).mo56372aa(22735)).mo56386p("#onFormDataUpdated, no form field content");
        }
        this.f304066a.mo97719i((C107462aa) vVar.build());
    }

    /* renamed from: d */
    public final void mo19721d(String str) {
        if (str != null) {
            C87985kx kxVar = (C87985kx) C87986ky.f237947d.createBuilder();
            kxVar.copyOnWrite();
            C87986ky kyVar = (C87986ky) kxVar.instance;
            kyVar.f237949a |= 1;
            kyVar.f237950b = 5;
            kxVar.copyOnWrite();
            C87986ky kyVar2 = (C87986ky) kxVar.instance;
            kyVar2.f237949a |= 2;
            kyVar2.f237951c = str;
            C88489j jVar = new C88489j(C87739bu.EXECUTE_MEDIA);
            jVar.mo82014b(C87984kw.f237946a, (C87986ky) kxVar.build());
            this.f304066a.f304285h.mo96219b(jVar.mo82013a());
        }
    }

    /* renamed from: e */
    public final void mo19722e(C52078ek ekVar) {
        C51805du duVar;
        C51805du duVar2;
        C51805du duVar3;
        C51805du duVar4;
        C51805du duVar5;
        if (((C86124t) this.f304066a.f304283f.mo27525b()).mo79746e(C90032ck.f248331p)) {
            C58833ax axVar = this.f304067b;
            if (axVar.mo56113h() && ((Query) axVar.mo56107c()).mo84363bw("android.opa.extra.QUERY_RESPONSE_GENERATED_BY_NGA")) {
                if (ekVar.f136674b == 5) {
                    duVar3 = (C51805du) ekVar.f136675c;
                } else {
                    duVar3 = C51805du.f135924e;
                }
                if (!duVar3.f135927b.equals("ui.FORM_INPUT")) {
                    C59052c cVar = (C59052c) ((C59052c) C109258hw.f304227a.mo56224b()).mo56372aa(22738);
                    if (ekVar.f136674b == 5) {
                        duVar4 = (C51805du) ekVar.f136675c;
                    } else {
                        duVar4 = C51805du.f135924e;
                    }
                    cVar.mo56389s("#sendClientInteraction, send back to NGA [%s]", duVar4.f135927b);
                    C107759j jVar = (C107759j) this.f304066a.f304296s.mo27525b();
                    if (ekVar.f136674b == 5) {
                        duVar5 = (C51805du) ekVar.f136675c;
                    } else {
                        duVar5 = C51805du.f135924e;
                    }
                    C80499b bVar = (C80499b) C80502e.f220990d.createBuilder();
                    C80501d dVar = C80501d.FLUID_ACTION;
                    bVar.copyOnWrite();
                    C80502e eVar = (C80502e) bVar.instance;
                    eVar.f220994c = dVar.f220989h;
                    eVar.f220992a |= 4;
                    jVar.mo96268d(duVar5, (C80502e) bVar.build());
                    return;
                }
            }
        }
        if (((C86124t) this.f304066a.f304283f.mo27525b()).mo79746e(C90025cd.f248137A) && C109258hw.m181890n(this.f304066a.f304280c)) {
            if (ekVar.f136674b == 5) {
                duVar2 = (C51805du) ekVar.f136675c;
            } else {
                duVar2 = C51805du.f135924e;
            }
            if (duVar2.f135927b.equals("ui.FORM_INPUT")) {
                this.f304066a.f304280c.mo95367I();
            }
        }
        C59052c cVar2 = (C59052c) ((C59052c) C109258hw.f304227a.mo56224b()).mo56372aa(22737);
        if (ekVar.f136674b == 5) {
            duVar = (C51805du) ekVar.f136675c;
        } else {
            duVar = C51805du.f135924e;
        }
        cVar2.mo56389s("#sendClientInteraction, send to FluidActions [%s]", duVar.f135927b);
        this.f304066a.mo97717g(ekVar);
    }

    /* renamed from: f */
    public final void mo19723f(String str) {
        this.f304066a.f304281d.mo98092x(str);
    }

    /* renamed from: g */
    public final void mo19724g() {
        this.f304066a.f304280c.mo95403an(new C108262cf(3, 4));
    }

    /* renamed from: h */
    public final void mo19725h(Intent intent) {
        this.f304066a.f304282e.mo65089a(intent);
    }

    /* renamed from: i */
    public final void mo19726i(Intent intent, C22694ag agVar) {
        this.f304066a.f304282e.mo65090b(intent, new C109207hn(agVar));
    }

    /* renamed from: j */
    public final void mo19727j() {
        this.f304066a.f304286i.mo96117P();
    }

    /* renamed from: k */
    public final void mo19728k(String str) {
        if (str != null) {
            C87985kx kxVar = (C87985kx) C87986ky.f237947d.createBuilder();
            kxVar.copyOnWrite();
            C87986ky kyVar = (C87986ky) kxVar.instance;
            kyVar.f237949a |= 1;
            kyVar.f237950b = 8;
            kxVar.copyOnWrite();
            C87986ky kyVar2 = (C87986ky) kxVar.instance;
            kyVar2.f237949a |= 2;
            kyVar2.f237951c = str;
            C88489j jVar = new C88489j(C87739bu.EXECUTE_MEDIA);
            jVar.mo82014b(C87984kw.f237946a, (C87986ky) kxVar.build());
            this.f304066a.f304285h.mo96219b(jVar.mo82013a());
        }
    }

    /* renamed from: l */
    public final void mo19729l() {
        if (this.f304066a.f304286i.mo96128aA()) {
            C109258hw hwVar = this.f304066a;
            hwVar.f304285h.mo96218a(hwVar.f304295r.mo84259V().mo84244G(true));
            this.f304066a.f304285h.mo96219b(new C88489j(C87739bu.OPA_CANCEL_CONVERSATION).mo82013a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r0 != 5) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo19730m(long r10, int r12) {
        /*
            r9 = this;
            int r0 = r12 + -1
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247087aY
            com.google.android.apps.gsa.search.shared.service.b.um r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
            if (r12 == 0) goto L_0x0102
            r12 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 == r2) goto L_0x0020
            if (r0 == r12) goto L_0x0023
            r3 = 3
            if (r0 == r3) goto L_0x001d
            r3 = 4
            if (r0 == r3) goto L_0x001a
            r3 = 5
            if (r0 == r3) goto L_0x0020
            goto L_0x0025
        L_0x001a:
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249684g
            goto L_0x0025
        L_0x001d:
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249682e
            goto L_0x0025
        L_0x0020:
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90066dr.f249683f
            goto L_0x0025
        L_0x0023:
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247087aY
        L_0x0025:
            com.google.android.apps.gsa.staticplugins.opa.hw r0 = r9.f304066a
            dagger.a r0 = r0.f304283f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r0 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r0
            com.google.common.b.hd r0 = r0.mo79752r(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0040:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00f2
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0040
            java.lang.Object r4 = r3.getValue()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0040
            com.google.common.base.m r4 = new com.google.common.base.m
            r5 = 124(0x7c, float:1.74E-43)
            r4.<init>(r5)
            com.google.common.base.cf r4 = com.google.common.base.C58869cf.m90936b(r4)
            java.lang.Object r5 = r3.getValue()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.util.List r4 = r4.mo56155i(r5)
            int r5 = r4.size()
            if (r5 != r12) goto L_0x0040
            r5 = 0
            java.lang.Object r6 = r4.get(r5)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0040
            java.lang.Object r6 = r4.get(r2)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0040
            com.google.assistant.e.c.c.ev r6 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.c.c.es r6 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r6
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.c.c.ev r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r7
            r3.getClass()
            int r8 = r7.f132943a
            r8 = r8 | r2
            r7.f132943a = r8
            r7.f132944b = r3
            java.lang.Object r3 = r4.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.assistant.e.c.c.ev r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r5
            r3.getClass()
            int r7 = r5.f132943a
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r5.f132943a = r7
            r5.f132953k = r3
            java.lang.Object r3 = r4.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            r3.getClass()
            int r5 = r4.f132943a
            r5 = r5 | 256(0x100, float:3.59E-43)
            r4.f132943a = r5
            r4.f132951i = r3
            com.google.protobuf.bv r3 = r6.build()
            com.google.assistant.e.c.c.ev r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r3
            r1.add(r3)
            goto L_0x0040
        L_0x00f2:
            com.google.android.apps.gsa.staticplugins.opa.hw r12 = r9.f304066a
            com.google.android.libraries.gsa.k.g r12 = r12.f304289l
            com.google.android.apps.gsa.staticplugins.opa.hm r0 = new com.google.android.apps.gsa.staticplugins.opa.hm
            r0.<init>(r9, r10, r1)
            java.lang.String r10 = "fetchContactInfoWithAndroidAppInfo"
            com.google.common.util.concurrent.cx r10 = r12.mo28201a(r10, r0)
            return r10
        L_0x0102:
            r10 = 0
            goto L_0x0105
        L_0x0104:
            throw r10
        L_0x0105:
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.C109209hp.mo19730m(long, int):com.google.common.util.concurrent.cx");
    }

    /* renamed from: n */
    public final void mo19731n(int i) {
        this.f304066a.f304286i.mo96144aQ(i);
    }

    /* renamed from: o */
    public final void mo19732o(C28292j jVar) {
        C60321oe j = C28285c.m52883j(jVar, 5, (Integer) null);
        if (j != null) {
            C89949q.m146521e(j, false);
        }
    }
}
