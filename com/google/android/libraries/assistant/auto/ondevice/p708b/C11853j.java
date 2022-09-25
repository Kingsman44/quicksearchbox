package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.g.g.c;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11942e;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11943f;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11945h;
import com.google.android.libraries.assistant.auto.ondevice.utils.SemanticsBuilderUtil;
import com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11933a;
import com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11934b;
import com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11935c;
import com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d;
import com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11938f;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.C13248a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52286mc;
import com.google.assistant.p3897e.p3921j.C52289mf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58835az;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p4152bb.p4153a.C55082fe;
import com.google.p4152bb.p4153a.C55084fg;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4850an.p4855d.p4856a.C63442ab;
import com.google.protos.p4850an.p4855d.p4856a.C63446af;
import com.google.protos.p4850an.p4855d.p4856a.C63451d;
import com.google.protos.p4985f.p4988b.p4993d.C64782b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.j */
/* compiled from: PG */
public final class C11853j implements a {

    /* renamed from: a */
    public static final C58974d f38149a = C58974d.m91134h("OfflineCallBuilder");

    /* renamed from: b */
    boolean f38150b = false;

    /* renamed from: c */
    public final b f38151c;

    /* renamed from: d */
    public final C9309a f38152d;

    /* renamed from: e */
    private final SemanticsBuilderUtil f38153e;

    /* renamed from: f */
    private final c f38154f;

    /* renamed from: g */
    private final C11943f f38155g;

    /* renamed from: h */
    private final C11942e f38156h;

    /* renamed from: i */
    private final com.google.android.apps.gsa.g.g.a f38157i;

    /* renamed from: j */
    private final C86124t f38158j;

    /* renamed from: k */
    private final C13248a f38159k;

    /* renamed from: l */
    private final Executor f38160l;

    /* renamed from: m */
    private C64782b f38161m;

    /* renamed from: n */
    private C55093fp f38162n;

    public C11853j(SemanticsBuilderUtil semanticsBuilderUtil, b bVar, c cVar, C11943f fVar, C11942e eVar, com.google.android.apps.gsa.g.g.a aVar, C86124t tVar, C13248a aVar2, C9309a aVar3, Executor executor) {
        this.f38153e = semanticsBuilderUtil;
        this.f38151c = bVar;
        this.f38154f = cVar;
        this.f38155g = fVar;
        this.f38161m = C64782b.f175579d;
        this.f38162n = C55093fp.f144965l;
        this.f38156h = eVar;
        this.f38157i = aVar;
        this.f38158j = tVar;
        this.f38159k = aVar2;
        this.f38152d = aVar3;
        this.f38160l = executor;
    }

    /* renamed from: d */
    public static C51809dy m27575d(String str) {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "call.CALL";
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "call_client_op_args";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.CallArgs";
        C52286mc mcVar = (C52286mc) C52289mf.f137258j.createBuilder();
        mcVar.copyOnWrite();
        ((C52289mf) mcVar.instance).f137263d = "PHONE_NUMBER";
        mcVar.copyOnWrite();
        str.getClass();
        ((C52289mf) mcVar.instance).f137262c = str;
        mcVar.copyOnWrite();
        C52289mf mfVar = (C52289mf) mcVar.instance;
        mfVar.f137260a = 10;
        mfVar.f137261b = true;
        C63088z byteString = ((C52289mf) mcVar.build()).toByteString();
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
        dvVar.mo53732b(kbVar);
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        C51807dw dwVar = (C51807dw) dvVar.build();
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }

    /* renamed from: e */
    private final C58835az m27576e(C63451d dVar, boolean z) {
        C11938f fVar;
        if (!C11945h.m27788m(this.f38161m, "contact_number")) {
            C11935c cVar = (C11935c) C11936d.f38336i.createBuilder();
            C55093fp fpVar = this.f38162n;
            cVar.copyOnWrite();
            C11936d dVar2 = (C11936d) cVar.instance;
            fpVar.getClass();
            dVar2.f38339b = fpVar;
            dVar2.f38338a |= 1;
            C64782b bVar = this.f38161m;
            cVar.copyOnWrite();
            C11936d dVar3 = (C11936d) cVar.instance;
            bVar.getClass();
            dVar3.f38341d = bVar;
            dVar3.f38338a |= 4;
            if ((dVar.f171477a & 128) != 0) {
                C63442ab abVar = dVar.f171479c;
                if (abVar == null) {
                    abVar = C63442ab.f171454e;
                }
                cVar.copyOnWrite();
                C11936d dVar4 = (C11936d) cVar.instance;
                abVar.getClass();
                dVar4.f38340c = abVar;
                dVar4.f38338a |= 2;
            }
            if (dVar.f171481e.size() > 0) {
                cVar.mo20312a(dVar.f171481e);
            }
            if (dVar.f171478b.size() > 0) {
                cVar.mo20313b(dVar.f171478b);
            }
            if (!z) {
                cVar.copyOnWrite();
                C11936d dVar5 = (C11936d) cVar.instance;
                dVar5.f38338a |= 8;
                dVar5.f38342e = true;
            }
            C11933a aVar = (C11933a) C11934b.f38331c.createBuilder();
            aVar.copyOnWrite();
            C11934b bVar2 = (C11934b) aVar.instance;
            C11936d dVar6 = (C11936d) cVar.build();
            dVar6.getClass();
            bVar2.f38334b = dVar6;
            bVar2.f38333a = 2;
            C11934b a = this.f38156h.mo20315a((C11934b) aVar.build());
            if (a.f38333a == 1) {
                fVar = (C11938f) a.f38334b;
            } else {
                fVar = C11938f.f38347e;
            }
            C62971cq cqVar = fVar.f38352d;
            C64782b bVar3 = fVar.f38350b;
            if (bVar3 == null) {
                bVar3 = C64782b.f175579d;
            }
            this.f38161m = bVar3;
            if (fVar.f38351c) {
                this.f38150b = true;
                return new C58835az(cqVar, C58485gu.m89846n(23188));
            } else if (!C11945h.m27788m(this.f38161m, "contact_number")) {
                return new C58835az(cqVar, C58485gu.m89846n(23188));
            }
        }
        this.f38150b = true;
        C55082fe a2 = C11943f.m27768a(this.f38162n, C11945h.m27783h(this.f38161m, "client_entity_id"));
        String h = C11945h.m27783h(this.f38161m, "contact_number");
        if (h.isEmpty() || a2 == null) {
            return new C58835az(C58485gu.m89845m(), C58485gu.m89845m());
        }
        String h2 = C11945h.m27783h(this.f38161m, "contact_type");
        C51809dy d = m27575d(h);
        C9309a aVar2 = this.f38152d;
        return new C58835az(C58485gu.m89847o(C15669a.m32462a(aVar2.mo17491a(aVar2.f32300b).getString(R.string.confirm_call_contact, new Object[]{a2.f144915b, h2})), d), C58485gu.m89846n(23190));
    }

    /* renamed from: f */
    private final void m27577f(C63451d dVar, Query query) {
        if (this.f38162n.f144969c.size() == 0 && dVar.f171478b.size() > 0) {
            C11943f fVar = this.f38155g;
            C63446af afVar = (C63446af) dVar.f171478b.get(0);
            List asList = Arrays.asList(new C55084fg[]{C55084fg.PHONE_NUMBER});
            C63442ab abVar = dVar.f171479c;
            if (abVar == null) {
                abVar = C63442ab.f171454e;
            }
            C55093fp b = fVar.mo20316b(afVar, asList, abVar.f171457b, this.f38152d.f32299a.mo79344b());
            if (b == null) {
                ((C58970a) ((C58970a) f38149a.mo56226d()).mo56372aa(43573)).mo56386p("#maybeFetchContactsFromDevice: contact query is null");
                return;
            }
            C55093fp a = this.f38154f.a(query, b, C58485gu.m89845m());
            if (a != null) {
                ((C58970a) ((C58970a) f38149a.mo56224b()).mo56372aa(43572)).mo56359L("Fetched %d contacts from device. ContactQuery is %s, ContactReference is %s", Integer.valueOf(a.f144969c.size()), b, a);
                this.f38162n = C11943f.m27769c(a, this.f38152d.f32299a.mo79344b());
            }
        }
    }

    /* renamed from: g */
    private final void m27578g(C58485gu guVar) {
        this.f38161m = C11945h.m27778c("call.CONTACT", guVar);
    }

    /* renamed from: a */
    public final C58833ax mo20227a(C61752n nVar, Query query) {
        return C58836b.f156633a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x020d, code lost:
        if (r1 == 0) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0230, code lost:
        if (r1.f175587b.equals("call.CONTACT") != false) goto L_0x020f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x029d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20228b(com.google.speech.grammar.pumpkin.C66525q r12, com.google.android.apps.gsa.shared.search.Query r13) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0009
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            return r12
        L_0x0009:
            com.google.android.apps.gsa.search.core.i.t r0 = r11.f38158j
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250431cx
            boolean r0 = r0.mo79746e(r1)
            r1 = 23202(0x5aa2, float:3.2513E-41)
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0084
            com.google.android.apps.gsa.g.g.a r0 = r11.f38157i
            com.google.android.libraries.search.m.b.b r5 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_ASSISTANT_AUTO
            boolean r0 = r0.a(r5)
            if (r0 != 0) goto L_0x0032
            com.google.android.apps.gsa.a.c.a r0 = r11.f38152d
            android.content.Context r5 = r0.f32300b
            android.content.res.Resources r0 = r0.mo17491a(r5)
            r5 = 2132091720(0x7f152348, float:1.9823816E38)
            java.lang.String r0 = r0.getString(r5)
            goto L_0x0045
        L_0x0032:
            com.google.android.apps.gsa.g.g.a r0 = r11.f38157i
            com.google.common.base.ax r0 = r0.a
            com.google.android.apps.gsa.a.c.a r0 = r11.f38152d
            android.content.Context r5 = r0.f32300b
            android.content.res.Resources r0 = r0.mo17491a(r5)
            r5 = 2132091727(0x7f15234f, float:1.982383E38)
            java.lang.String r0 = r0.getString(r5)
        L_0x0045:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x0084
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r0)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            java.lang.Integer[] r5 = new java.lang.Integer[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r5[r3] = r6
            java.util.List r5 = java.util.Arrays.asList(r5)
            com.google.assistant.e.j.en r0 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32463b(r0, r5)
            com.google.assistant.e.e.a.j r5 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.e.a.e r5 = (com.google.assistant.p3897e.p3910e.p3911a.C51190e) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.assistant.e.e.a.j r6 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r6
            r0.getClass()
            r6.f133275j = r0
            int r0 = r6.f133266a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r6.f133266a = r0
            com.google.protobuf.bv r0 = r5.build()
            com.google.assistant.e.e.a.j r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r0
            goto L_0x0085
        L_0x0084:
            r0 = r2
        L_0x0085:
            if (r0 == 0) goto L_0x0092
            r11.f38150b = r4
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r0)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            return r12
        L_0x0092:
            com.google.android.apps.gsa.g.c.b r0 = r11.f38151c
            com.google.android.speech.embedded.TaggerResult r0 = r0.a
            if (r0 != 0) goto L_0x00a2
            com.google.protos.f.b.d.b r0 = com.google.protos.p4985f.p4988b.p4993d.C64782b.f175579d
            r11.f38161m = r0
            com.google.bb.a.fp r0 = com.google.p4152bb.p4153a.C55093fp.f144965l
            r11.f38162n = r0
            r11.f38150b = r3
        L_0x00a2:
            com.google.android.apps.gsa.g.c.b r0 = r11.f38151c
            r0.d = r2
            com.google.android.libraries.assistant.auto.ondevice.utils.SemanticsBuilderUtil r0 = r11.f38153e
            com.google.protos.f.b.d.b r5 = r11.f38161m
            com.google.bp.a.b.k r5 = com.google.android.libraries.assistant.auto.ondevice.utils.C11948k.m27805a(r5)
            com.google.common.base.ax r0 = r0.mo20311a(r12, r5)
            boolean r5 = r0.mo56113h()
            if (r5 == 0) goto L_0x02cc
            java.lang.Object r0 = r0.mo56107c()
            com.google.protos.an.f r0 = (com.google.protos.p4850an.C63595f) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.google.common.base.az r7 = new com.google.common.base.az
            r7.<init>(r5, r6)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            com.google.protobuf.bt r6 = com.google.protos.p4850an.p4855d.p4856a.C63451d.f171475h
            java.lang.Object r0 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32464c(r0, r6)
            com.google.protos.an.d.a.d r0 = (com.google.protos.p4850an.p4855d.p4856a.C63451d) r0
            if (r0 == 0) goto L_0x02b5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.google.common.base.az r7 = new com.google.common.base.az
            r7.<init>(r5, r6)
            int r5 = r0.f171477a
            r5 = r5 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x0179
            r11.m27577f(r0, r13)
            com.google.protobuf.cq r13 = r0.f171478b
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x00fc
            r3 = 1
        L_0x00fc:
            if (r3 == 0) goto L_0x0103
            com.google.bb.a.fp r13 = r11.f38162n
            com.google.protobuf.cq r13 = r13.f144969c
            goto L_0x0107
        L_0x0103:
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0107:
            r11.f38150b = r4
            com.google.android.libraries.assistant.auto.tng.common.f.a.a r1 = r11.f38159k
            int r5 = r0.f171482f
            int r5 = com.google.protos.p4850an.p4855d.p4856a.C63450c.m96238a(r5)
            if (r5 != 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r4 = r5
        L_0x0115:
            com.google.android.libraries.assistant.auto.tng.common.f.a.a.f r1 = (com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p911a.C13254f) r1
            android.content.Context r5 = r1.f40925e
            java.lang.String r6 = "android.permission.READ_CALL_LOG"
            boolean r5 = com.google.android.libraries.assistant.auto.tng.common.permissions.p932a.C13315a.m29571a(r6, r5)
            if (r5 != 0) goto L_0x013d
            com.google.common.f.e r13 = com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p911a.C13254f.f40921a
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "RedialRetriever"
            r13.mo56378ag(r1, r2)
            java.lang.String r1 = "READ_CALL_LOG permission is missing."
            r2 = 44716(0xaeac, float:6.266E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r2)).mo56386p(r1)
            com.google.common.base.b r13 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            goto L_0x016c
        L_0x013d:
            if (r13 == 0) goto L_0x0143
            java.util.Set r2 = com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p911a.C13254f.m29512d(r13)
        L_0x0143:
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            com.google.apps.tiktok.dataservice.q r5 = r1.f40923c
            android.net.Uri r6 = android.provider.CallLog.Calls.CONTENT_URI
            java.lang.String[] r7 = com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p911a.C13254f.f40922b
            r8 = 0
            r9 = 0
            java.lang.String r10 = "date DESC"
            com.google.apps.tiktok.concurrent.o r5 = r5.mo50872b(r6, r7, r8, r9, r10)
            com.google.common.util.concurrent.ay r5 = r5.f121591a
            com.google.apps.tiktok.tracing.contrib.b.c r6 = new com.google.apps.tiktok.tracing.contrib.b.c
            r6.<init>(r5)
            com.google.android.libraries.assistant.auto.tng.common.f.a.a.c r5 = new com.google.android.libraries.assistant.auto.tng.common.f.a.a.c
            r5.<init>(r1, r13, r4, r2)
            java.util.concurrent.Executor r13 = r1.f40926f
            com.google.apps.tiktok.tracing.contrib.b.c r13 = r6.mo51506d(r5, r13)
            com.google.apps.tiktok.tracing.contrib.b.f r13 = r13.mo51507e()
        L_0x016c:
            com.google.android.libraries.assistant.auto.ondevice.b.i r1 = new com.google.android.libraries.assistant.auto.ondevice.b.i
            r1.<init>(r11, r0, r3)
            java.util.concurrent.Executor r0 = r11.f38160l
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60922j.m93044g(r13, r1, r0)
            goto L_0x02b5
        L_0x0179:
            boolean r2 = r0.f171480d
            if (r2 == 0) goto L_0x01a9
            r11.f38150b = r4
            com.google.android.apps.gsa.a.c.a r13 = r11.f38152d
            android.content.Context r0 = r13.f32300b
            android.content.res.Resources r13 = r13.mo17491a(r0)
            r0 = 2132093603(0x7f152aa3, float:1.9827635E38)
            java.lang.String r13 = r13.getString(r0)
            com.google.assistant.e.j.dy r13 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r13)
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89846n(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            com.google.common.base.az r1 = new com.google.common.base.az
            r1.<init>(r13, r0)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x02b5
        L_0x01a9:
            com.google.protobuf.cq r1 = r0.f171478b
            int r1 = r1.size()
            if (r1 > 0) goto L_0x01f7
            com.google.protobuf.cq r1 = r0.f171481e
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x01ba
            goto L_0x01f7
        L_0x01ba:
            com.google.common.f.a.d r13 = f38149a
            com.google.common.f.x r1 = r13.mo56226d()
            java.lang.String r2 = "Call Action is empty probably due to unmatched semantics context."
            r5 = 43566(0xaa2e, float:6.1049E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r5)).mo56386p(r2)
            com.google.protos.f.b.d.b r1 = r11.f38161m
            int r2 = r1.f175581a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x01ec
            java.lang.String r2 = "contact_number"
            boolean r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27788m(r1, r2)
            if (r1 != 0) goto L_0x01de
            com.google.common.base.az r7 = r11.m27576e(r0, r3)
            goto L_0x02b1
        L_0x01de:
            com.google.common.f.x r13 = r13.mo56225c()
            java.lang.String r0 = "State error:Call actions should have been executed if the endpoint was resolvedin previous query"
            r1 = 43568(0xaa30, float:6.1052E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r13).mo56372aa(r1)).mo56386p(r0)
            goto L_0x02b1
        L_0x01ec:
            com.google.common.b.gu r13 = com.google.android.libraries.assistant.auto.ondevice.utils.C11939b.f38355c
            r11.m27578g(r13)
            com.google.common.base.az r7 = r11.m27576e(r0, r4)
            goto L_0x02b1
        L_0x01f7:
            com.google.protobuf.cq r1 = r0.f171478b
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0211
            com.google.protobuf.cq r1 = r0.f171478b
            java.lang.Object r1 = r1.get(r3)
            com.google.protos.an.d.a.af r1 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r1
            int r1 = r1.f171465c
            int r1 = com.google.protos.p4850an.p4855d.p4856a.C63445ae.m96237a(r1)
            if (r1 != 0) goto L_0x0234
        L_0x020f:
            r1 = 1
            goto L_0x0234
        L_0x0211:
            com.google.protobuf.cq r1 = r0.f171481e
            int r1 = r1.size()
            r2 = 5
            if (r1 <= 0) goto L_0x0233
            com.google.protos.f.b.d.b r1 = r11.f38161m
            int r5 = r1.f175581a
            r5 = r5 & 2
            if (r5 == 0) goto L_0x0233
            com.google.protos.f.b.d.d r1 = r1.f175582b
            if (r1 != 0) goto L_0x0228
            com.google.protos.f.b.d.d r1 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x0228:
            java.lang.String r1 = r1.f175587b
            java.lang.String r5 = "call.CONTACT"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0233
            goto L_0x020f
        L_0x0233:
            r1 = 5
        L_0x0234:
            int r1 = r1 + -1
            if (r1 == 0) goto L_0x029d
            r13 = 3
            if (r1 == r13) goto L_0x024a
            com.google.common.f.a.d r13 = f38149a
            com.google.common.f.x r13 = r13.mo56225c()
            java.lang.String r0 = "Unsupported actions. The action is %s"
            r2 = 43564(0xaa2c, float:6.1046E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r13).mo56372aa(r2)).mo56387q(r0, r1)
            goto L_0x02b1
        L_0x024a:
            com.google.protobuf.cq r13 = r0.f171478b
            java.lang.Object r13 = r13.get(r3)
            com.google.protos.an.d.a.af r13 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r13
            r11.f38150b = r4
            java.lang.String r13 = r13.f171466d
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x026a
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.base.az r7 = new com.google.common.base.az
            r7.<init>(r13, r0)
            goto L_0x02b1
        L_0x026a:
            com.google.assistant.e.j.dy r0 = m27575d(r13)
            com.google.android.apps.gsa.a.c.a r1 = r11.f38152d
            android.content.Context r2 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r2)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r13 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32465d(r13)
            r2[r3] = r13
            r13 = 2132085843(0x7f150c53, float:1.9811896E38)
            java.lang.String r13 = r1.getString(r13, r2)
            com.google.assistant.e.j.dy r13 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r13)
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89847o(r13, r0)
            r0 = 23192(0x5a98, float:3.2499E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r0)
            com.google.common.base.az r7 = new com.google.common.base.az
            r7.<init>(r13, r0)
            goto L_0x02b1
        L_0x029d:
            com.google.protos.f.b.d.b r1 = r11.f38161m
            int r1 = r1.f175581a
            r1 = r1 & 2
            if (r1 != 0) goto L_0x02aa
            com.google.common.b.gu r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11939b.f38355c
            r11.m27578g(r1)
        L_0x02aa:
            r11.m27577f(r0, r13)
            com.google.common.base.az r7 = r11.m27576e(r0, r4)
        L_0x02b1:
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
        L_0x02b5:
            com.google.android.libraries.assistant.auto.ondevice.b.g r13 = new com.google.android.libraries.assistant.auto.ondevice.b.g
            r13.<init>()
            java.util.concurrent.Executor r0 = r11.f38160l
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60922j.m93044g(r5, r13, r0)
            com.google.android.libraries.assistant.auto.ondevice.b.h r0 = new com.google.android.libraries.assistant.auto.ondevice.b.h
            r0.<init>(r11, r12)
            java.util.concurrent.Executor r12 = r11.f38160l
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60922j.m93044g(r13, r0, r12)
            return r12
        L_0x02cc:
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11853j.mo20228b(com.google.speech.grammar.pumpkin.q, com.google.android.apps.gsa.shared.search.Query):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final C60870cx mo20229c(C52081en enVar) {
        if (this.f38150b) {
            return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
