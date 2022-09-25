package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.g.g.c;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85713a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11932a;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11942e;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11943f;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11945h;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11948k;
import com.google.android.libraries.assistant.auto.ondevice.utils.CommsNlgUtil;
import com.google.android.libraries.assistant.auto.ondevice.utils.SemanticsBuilderUtil;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.p4242bp.p4243a.p4246c.C56156a;
import com.google.p4242bp.p4243a.p4246c.C56157b;
import com.google.p4242bp.p4243a.p4246c.C56158c;
import com.google.p4242bp.p4243a.p4246c.C56159d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4850an.p4855d.p4856a.C63445ae;
import com.google.protos.p4850an.p4855d.p4856a.C63446af;
import com.google.protos.p4850an.p4855d.p4856a.C63463p;
import com.google.protos.p4850an.p4855d.p4856a.C63473z;
import com.google.protos.p4985f.p4988b.p4993d.C64782b;
import com.google.protos.p4985f.p4988b.p4993d.C64784d;
import com.google.speech.grammar.pumpkin.C66525q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.ac */
/* compiled from: PG */
public final class C11841ac implements a {

    /* renamed from: a */
    public static final C58974d f38040a = C58974d.m91134h("OfflineSendMessage");

    /* renamed from: b */
    boolean f38041b = false;

    /* renamed from: c */
    C55093fp f38042c;

    /* renamed from: d */
    C63463p f38043d;

    /* renamed from: e */
    int f38044e;

    /* renamed from: f */
    public final b f38045f;

    /* renamed from: g */
    public final c f38046g;

    /* renamed from: h */
    public final C11943f f38047h;

    /* renamed from: i */
    public final C85713a f38048i;

    /* renamed from: j */
    public final C56159d f38049j;

    /* renamed from: k */
    public final C58485gu f38050k;

    /* renamed from: l */
    public C51058ev f38051l;

    /* renamed from: m */
    public C64782b f38052m;

    /* renamed from: n */
    public final C9309a f38053n;

    /* renamed from: o */
    private final SemanticsBuilderUtil f38054o;

    /* renamed from: p */
    private final C11942e f38055p;

    /* renamed from: q */
    private final C22871g f38056q;

    /* renamed from: r */
    private final C86124t f38057r;

    /* renamed from: s */
    private final com.google.android.apps.gsa.g.g.a f38058s;

    /* renamed from: t */
    private final CommsNlgUtil f38059t;

    /* renamed from: u */
    private final C86054o f38060u;

    public C11841ac(SemanticsBuilderUtil semanticsBuilderUtil, b bVar, c cVar, C11943f fVar, C11942e eVar, C22871g gVar, C86124t tVar, com.google.android.apps.gsa.g.g.a aVar, CommsNlgUtil commsNlgUtil, C86054o oVar, C85713a aVar2, C9309a aVar3, C56159d dVar) {
        this.f38054o = semanticsBuilderUtil;
        this.f38045f = bVar;
        this.f38046g = cVar;
        this.f38047h = fVar;
        this.f38055p = eVar;
        this.f38056q = gVar;
        this.f38057r = tVar;
        this.f38052m = C64782b.f175579d;
        this.f38058s = aVar;
        this.f38059t = commsNlgUtil;
        this.f38060u = oVar;
        this.f38048i = aVar2;
        C56156a aVar4 = (C56156a) C56157b.f149621g.createBuilder();
        aVar4.copyOnWrite();
        C56157b bVar2 = (C56157b) aVar4.instance;
        bVar2.f149623a |= 1;
        bVar2.f149624b = "hangout";
        aVar4.copyOnWrite();
        C56157b bVar3 = (C56157b) aVar4.instance;
        bVar3.f149623a |= 2;
        bVar3.f149625c = "com.google.android.talk";
        aVar4.copyOnWrite();
        C56157b bVar4 = (C56157b) aVar4.instance;
        bVar4.f149623a |= 32;
        bVar4.f149628f = "com.google.hangouts://";
        C56157b bVar5 = (C56157b) aVar4.build();
        C56158c cVar2 = (C56158c) dVar.toBuilder();
        cVar2.copyOnWrite();
        C56159d dVar2 = (C56159d) cVar2.instance;
        bVar5.getClass();
        C62971cq cqVar = dVar2.f149631a;
        if (!cqVar.mo58948c()) {
            dVar2.f149631a = C62942bv.mutableCopy(cqVar);
        }
        dVar2.f149631a.add(bVar5);
        C56159d dVar3 = (C56159d) cVar2.build();
        this.f38049j = dVar3;
        this.f38042c = C55093fp.f144965l;
        this.f38043d = C63463p.f171507e;
        this.f38051l = C51058ev.f132941o;
        ArrayList arrayList = new ArrayList();
        for (C56157b bVar6 : dVar3.f149631a) {
            String str = bVar6.f149625c;
            String str2 = bVar6.f149626d;
            String str3 = (bVar6.f149623a & 16) != 0 ? bVar6.f149627e : str;
            C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
            esVar.copyOnWrite();
            C51058ev evVar = (C51058ev) esVar.instance;
            str.getClass();
            evVar.f132943a |= 1;
            evVar.f132944b = str;
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            str2.getClass();
            evVar2.f132943a |= 1024;
            evVar2.f132953k = str2;
            esVar.copyOnWrite();
            C51058ev evVar3 = (C51058ev) esVar.instance;
            str3.getClass();
            evVar3.f132943a |= 256;
            evVar3.f132951i = str3;
            arrayList.add((C51058ev) esVar.build());
        }
        this.f38050k = C58485gu.m89842j(arrayList);
        this.f38053n = aVar3;
    }

    /* renamed from: h */
    static final C51809dy m27531h(C52321nk nkVar) {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "chat_message.SEND";
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "chat_args";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.ChatMessageArgs";
        C63088z byteString = nkVar.toByteString();
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.bb.a.en} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.bb.a.es} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.google.bb.a.en} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: com.google.bb.a.es} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.bb.a.en} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: com.google.bb.a.es} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.bb.a.en} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.google.bb.a.es} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.google.bb.a.en} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cb  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.assistant.p3897e.p3921j.C52321nk m27532j(java.lang.String r7, java.lang.String r8, com.google.assistant.p3897e.p3902c.p3907c.C51098gh r9) {
        /*
            r6 = this;
            com.google.assistant.e.j.nk r0 = com.google.assistant.p3897e.p3921j.C52321nk.f137326j
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.my r0 = (com.google.assistant.p3897e.p3921j.C52308my) r0
            com.google.protos.f.b.d.b r1 = r6.f38052m
            java.lang.String r2 = "message"
            java.lang.String r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27783h(r1, r2)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.nk r2 = (com.google.assistant.p3897e.p3921j.C52321nk) r2
            r1.getClass()
            r2.f137334g = r1
            r1 = 0
            if (r7 == 0) goto L_0x0094
            com.google.protos.f.b.d.b r2 = r6.f38052m
            java.lang.String r3 = "client_entity_id"
            java.lang.String r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27783h(r2, r3)
            com.google.bb.a.fp r3 = r6.f38042c
            com.google.bb.a.fe r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11943f.m27768a(r3, r2)
            if (r2 == 0) goto L_0x0086
            com.google.protobuf.cq r3 = r2.f144929p
            java.util.Iterator r3 = r3.iterator()
        L_0x0035:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004a
            java.lang.Object r4 = r3.next()
            com.google.bb.a.en r4 = (com.google.p4152bb.p4153a.C55064en) r4
            java.lang.String r5 = r4.f144863d
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0035
            goto L_0x0059
        L_0x004a:
            com.google.common.f.a.d r3 = f38040a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "#getAppSpecificEndpointIdFromContact: Cannot find a matched App endpoint. "
            r5 = 43665(0xaa91, float:6.1188E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r5)).mo56386p(r4)
            r4 = r1
        L_0x0059:
            com.google.protobuf.cq r2 = r2.f144927n
            java.util.Iterator r2 = r2.iterator()
        L_0x005f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0075
            java.lang.Object r3 = r2.next()
            com.google.bb.a.es r3 = (com.google.p4152bb.p4153a.C55069es) r3
            java.lang.String r5 = r3.f144874c
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x005f
            r1 = r3
            goto L_0x0083
        L_0x0075:
            com.google.common.f.a.d r7 = f38040a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r2 = "#getGoogleAccountFromContact: Cannot find a matched Google account. "
            r3 = 43666(0xaa92, float:6.1189E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r3)).mo56386p(r2)
        L_0x0083:
            r7 = r1
            r1 = r4
            goto L_0x0095
        L_0x0086:
            com.google.common.f.a.d r7 = f38040a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r2 = "#createSendMessageToContactConfirmationClientOps: The contact confirmed in IntentState actually doesn't exist."
            r3 = 43637(0xaa75, float:6.1148E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r3)).mo56386p(r2)
        L_0x0094:
            r7 = r1
        L_0x0095:
            if (r9 == 0) goto L_0x00a0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.nk r2 = (com.google.assistant.p3897e.p3921j.C52321nk) r2
            r2.f137333f = r9
        L_0x00a0:
            com.google.assistant.e.j.pj r9 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.pi r9 = (com.google.assistant.p3897e.p3921j.C52373pi) r9
            if (r1 == 0) goto L_0x00bb
            java.lang.String r1 = r1.f144863d
            r9.copyOnWrite()
            com.google.protobuf.bv r2 = r9.instance
            com.google.assistant.e.j.pj r2 = (com.google.assistant.p3897e.p3921j.C52374pj) r2
            r1.getClass()
            r3 = 6
            r2.f137437b = r3
            r2.f137438c = r1
        L_0x00bb:
            if (r8 == 0) goto L_0x00c9
            r9.copyOnWrite()
            com.google.protobuf.bv r1 = r9.instance
            com.google.assistant.e.j.pj r1 = (com.google.assistant.p3897e.p3921j.C52374pj) r1
            r2 = 2
            r1.f137437b = r2
            r1.f137438c = r8
        L_0x00c9:
            if (r7 == 0) goto L_0x0107
            com.google.assistant.e.j.pj r8 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.pi r8 = (com.google.assistant.p3897e.p3921j.C52373pi) r8
            java.lang.String r1 = r7.f144873b
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.assistant.e.j.pj r2 = (com.google.assistant.p3897e.p3921j.C52374pj) r2
            r1.getClass()
            r3 = 1
            r2.f137437b = r3
            r2.f137438c = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.nk r1 = (com.google.assistant.p3897e.p3921j.C52321nk) r1
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.j.pj r8 = (com.google.assistant.p3897e.p3921j.C52374pj) r8
            r8.getClass()
            r1.f137330c = r8
            java.lang.String r7 = r7.f144874c
            r9.copyOnWrite()
            com.google.protobuf.bv r8 = r9.instance
            com.google.assistant.e.j.pj r8 = (com.google.assistant.p3897e.p3921j.C52374pj) r8
            r7.getClass()
            r1 = 5
            r8.f137437b = r1
            r8.f137438c = r7
        L_0x0107:
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.assistant.e.j.nk r7 = (com.google.assistant.p3897e.p3921j.C52321nk) r7
            com.google.protobuf.bv r8 = r9.build()
            com.google.assistant.e.j.pj r8 = (com.google.assistant.p3897e.p3921j.C52374pj) r8
            r8.getClass()
            r7.f137331d = r8
            com.google.protobuf.bv r7 = r0.build()
            com.google.assistant.e.j.nk r7 = (com.google.assistant.p3897e.p3921j.C52321nk) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.m27532j(java.lang.String, java.lang.String, com.google.assistant.e.c.c.gh):com.google.assistant.e.j.nk");
    }

    /* renamed from: k */
    private static boolean m27533k(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C58837ba.m90859h((String) it.next())) {
                ((C58970a) ((C58970a) f38040a.mo56226d()).mo56372aa(43678)).mo56386p("#areFieldValuesValid: Necessary fields are missing.");
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final C58833ax mo20197a(C61752n nVar, Query query) {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final C60870cx mo20198b(C66525q qVar, Query query) {
        if (qVar == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (this.f38045f.a == null) {
            mo20203g();
        }
        this.f38045f.d = null;
        C58833ax a = this.f38054o.mo20311a(qVar, C11948k.m27807c(this.f38052m));
        if (a.mo56113h()) {
            return this.f38056q.mo28202b("buildConversationDeltaFromAnalyzerResponse", new C11840ab(this, a, query, qVar));
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: c */
    public final C60870cx mo20199c(C52081en enVar) {
        C58485gu m;
        C52078ek ekVar;
        C52070ec ecVar;
        C52078ek ekVar2;
        C52070ec ecVar2;
        if (this.f38041b) {
            return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
        }
        Iterator it = enVar.f136684d.iterator();
        while (true) {
            if (!it.hasNext()) {
                m = C58485gu.m89845m();
                break;
            }
            C52083ep epVar = (C52083ep) it.next();
            if (epVar.f136695e == 1) {
                if (epVar.f136692b == 3) {
                    ekVar = (C52078ek) epVar.f136693c;
                } else {
                    ekVar = C52078ek.f136671f;
                }
                if (ekVar.f136674b == 3) {
                    ecVar = (C52070ec) ekVar.f136675c;
                } else {
                    ecVar = C52070ec.f136651d;
                }
                if ((ecVar.f136653a & 1) != 0) {
                    if (epVar.f136692b == 3) {
                        ekVar2 = (C52078ek) epVar.f136693c;
                    } else {
                        ekVar2 = C52078ek.f136671f;
                    }
                    if (ekVar2.f136674b == 3) {
                        ecVar2 = (C52070ec) ekVar2.f136675c;
                    } else {
                        ecVar2 = C52070ec.f136651d;
                    }
                    C52236kg kgVar = ecVar2.f136654b;
                    if (kgVar == null) {
                        kgVar = C52236kg.f137089d;
                    }
                    C52235kf a = C52235kf.m86549a(kgVar.f137092b);
                    if (a == null) {
                        a = C52235kf.OK;
                    }
                    if (a == C52235kf.OK || a == C52235kf.IGNORE) {
                        C9309a aVar = this.f38053n;
                        m = C58485gu.m89846n(C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.message_sent)));
                    } else {
                        C9309a aVar2 = this.f38053n;
                        m = C58485gu.m89846n(C15669a.m32462a(aVar2.mo17491a(aVar2.f32300b).getString(R.string.message_not_sent)));
                    }
                }
            }
        }
        if (m.isEmpty()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        this.f38041b = true;
        return C60856cj.m92900i(C58833ax.m90834k(C15669a.m32463b(m, Arrays.asList(new Integer[]{60736}))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo20201e() {
        /*
            r5 = this;
            com.google.protos.f.b.d.b r0 = r5.f38052m
            com.google.protos.f.b.d.d r0 = r0.f175582b
            if (r0 != 0) goto L_0x0008
            com.google.protos.f.b.d.d r0 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x0008:
            java.lang.String r0 = r0.f175587b
            int r1 = r0.hashCode()
            r2 = 1669201(0x197851, float:2.339049E-39)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0034
            r2 = 874658008(0x342238d8, float:1.5108105E-7)
            if (r1 == r2) goto L_0x002a
            r2 = 2091144838(0x7ca45686, float:6.826333E36)
            if (r1 == r2) goto L_0x0020
            goto L_0x003e
        L_0x0020:
            java.lang.String r1 = "SendMessage.CONTACT_CHAT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 2
            goto L_0x003f
        L_0x002a:
            java.lang.String r1 = "SendMessage.NUMBER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 0
            goto L_0x003f
        L_0x0034:
            java.lang.String r1 = "SendMessage.CONTACT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = -1
        L_0x003f:
            if (r0 == 0) goto L_0x0051
            if (r0 == r4) goto L_0x004e
            if (r0 != r3) goto L_0x0046
            goto L_0x004e
        L_0x0046:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Encountered unknown intent"
            r0.<init>(r1)
            throw r0
        L_0x004e:
            com.google.common.b.gu r0 = com.google.android.libraries.assistant.auto.ondevice.utils.C11939b.f38356d
            return r0
        L_0x0051:
            com.google.common.b.gu r0 = com.google.android.libraries.assistant.auto.ondevice.utils.C11939b.f38357e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.mo20201e():com.google.common.b.gu");
    }

    /* renamed from: f */
    public final C58485gu mo20202f() {
        String str;
        C51098gh ghVar;
        C51809dy dyVar;
        C58485gu m = C58485gu.m89845m();
        String i = C11945h.m27784i(this.f38052m, mo20201e());
        char c = 65535;
        if (i == null) {
            C58485gu m2 = C58485gu.m89845m();
            C64784d dVar = this.f38052m.f175582b;
            if (dVar == null) {
                dVar = C64784d.f175584d;
            }
            String str2 = dVar.f175587b;
            int hashCode = str2.hashCode();
            if (hashCode != 1669201) {
                if (hashCode != 874658008) {
                    if (hashCode == 2091144838 && str2.equals("SendMessage.CONTACT_CHAT")) {
                        c = 2;
                    }
                } else if (str2.equals("SendMessage.NUMBER")) {
                    c = 0;
                }
            } else if (str2.equals("SendMessage.CONTACT")) {
                c = 1;
            }
            if (c == 0) {
                String h = C11945h.m27783h(this.f38052m, "contact_number");
                if (h.isEmpty()) {
                    m2 = C58485gu.m89845m();
                } else {
                    C51809dy h2 = m27531h(m27532j((String) null, h, (C51098gh) null));
                    C9309a aVar = this.f38053n;
                    m2 = C58485gu.m89847o(C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.confirm_send_number, new Object[]{C15669a.m32465d(h)})), h2);
                }
            } else if (c == 1 || c == 2) {
                ArrayList arrayList = new ArrayList();
                String h3 = C11945h.m27783h(this.f38052m, "contact_number");
                String e = C11943f.m27771e(this.f38042c, this.f38052m);
                String h4 = C11945h.m27783h(this.f38052m, "provider");
                if (!m27533k(Arrays.asList(new String[]{e, h4, h3}))) {
                    m2 = C58485gu.m89842j(arrayList);
                } else {
                    if (!C58890d.m90990e("SMS", h4)) {
                        String h5 = C11945h.m27783h(this.f38052m, "contact_number");
                        C51055es esVar = (C51055es) this.f38051l.toBuilder();
                        esVar.copyOnWrite();
                        C51058ev evVar = (C51058ev) esVar.instance;
                        h5.getClass();
                        evVar.f132943a |= 512;
                        evVar.f132952j = h5;
                        this.f38051l = (C51058ev) esVar.build();
                        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
                        C51058ev evVar2 = this.f38051l;
                        ggVar.copyOnWrite();
                        C51098gh ghVar2 = (C51098gh) ggVar.instance;
                        evVar2.getClass();
                        ghVar2.f133013c = evVar2;
                        ghVar2.f133012b = 1;
                        ghVar = (C51098gh) ggVar.build();
                        str = null;
                    } else {
                        str = h3;
                        ghVar = null;
                    }
                    if (C58890d.m90990e("whatsapp", h4)) {
                        str = C11945h.m27783h(this.f38052m, "contact_number");
                        if (str.endsWith("@s.whatsapp.net")) {
                            str = str.substring(0, str.length() - 15);
                        } else {
                            ((C58970a) ((C58970a) f38040a.mo56226d()).mo56372aa(43671)).mo56386p("Unable to get phone number from Whatsapp contact as the contact has wrong format. Return the original contact.");
                        }
                    }
                    if (C58890d.m90990e("SMS", h4)) {
                        C9309a aVar2 = this.f38053n;
                        dyVar = C15669a.m32462a(aVar2.mo17491a(aVar2.f32300b).getString(R.string.confirm_send_contact, new Object[]{e}));
                    } else {
                        C9309a aVar3 = this.f38053n;
                        dyVar = C15669a.m32462a(aVar3.mo17491a(aVar3.f32300b).getString(R.string.send_3p_message, new Object[]{h4, e}));
                    }
                    m2 = C58485gu.m89847o(dyVar, m27531h(m27532j(h3, str, ghVar)));
                }
            } else {
                ((C58970a) ((C58970a) f38040a.mo56225c()).mo56372aa(43653)).mo56386p("#createMessageConfirmationClientOps: Unknown Intent name.");
            }
            if (!m2.isEmpty() && (str2.equals("SendMessage.NUMBER") || str2.equals("SendMessage.CONTACT"))) {
                return m2;
            }
            this.f38041b = true;
            return m2;
        } else if (!i.equals("message")) {
            ((C58970a) ((C58970a) f38040a.mo56225c()).mo56372aa(43657)).mo56386p("Unexpected field name occurred");
            return m;
        } else if (C11945h.m27786k(this.f38052m, "message")) {
            String h6 = C11945h.m27783h(this.f38052m, "message");
            C58485gu m3 = C58485gu.m89845m();
            C64784d dVar2 = this.f38052m.f175582b;
            if (dVar2 == null) {
                dVar2 = C64784d.f175584d;
            }
            if (dVar2.f175587b.equals("SendMessage.NUMBER")) {
                if (m27533k(Arrays.asList(new String[]{h6}))) {
                    C9309a aVar4 = this.f38053n;
                    return C58485gu.m89842j(C11932a.m27754g(aVar4.mo17491a(aVar4.f32300b).getString(R.string.confirm_reply_message, new Object[]{h6})));
                }
            } else {
                String e2 = C11943f.m27771e(this.f38042c, this.f38052m);
                String h7 = C11945h.m27783h(this.f38052m, "provider");
                if (!m27533k(Arrays.asList(new String[]{e2, h7, h6}))) {
                    ((C58970a) ((C58970a) f38040a.mo56226d()).mo56372aa(43641)).mo56386p("#createAskToConfirmMessageClientOps: some fields are invalid");
                } else {
                    int i2 = this.f38044e;
                    if (i2 == 0) {
                        int hashCode2 = h7.hashCode();
                        if (hashCode2 != 82233) {
                            if (hashCode2 == 692896156 && h7.equals("hangout")) {
                                c = 1;
                            }
                        } else if (h7.equals("SMS")) {
                            c = 0;
                        }
                        if (c == 0) {
                            C9309a aVar5 = this.f38053n;
                            return C58485gu.m89842j(C11932a.m27754g(aVar5.mo17491a(aVar5.f32300b).getString(R.string.ask_to_confirm_sms, new Object[]{e2, h6})));
                        } else if (c != 1) {
                            C9309a aVar6 = this.f38053n;
                            return C58485gu.m89842j(C11932a.m27754g(aVar6.mo17491a(aVar6.f32300b).getString(R.string.ask_to_confirm_3p_chat_message, new Object[]{h7, e2, h6})));
                        } else {
                            String F = this.f38060u.mo79659F();
                            if (C58837ba.m90859h(F)) {
                                ((C58970a) ((C58970a) f38040a.mo56225c()).mo56372aa(43640)).mo56386p("unable to get account information");
                            } else {
                                C9309a aVar7 = this.f38053n;
                                return C58485gu.m89842j(C11932a.m27754g(aVar7.mo17491a(aVar7.f32300b).getString(R.string.ask_to_confirm_hangouts_message, new Object[]{e2, h6, F})));
                            }
                        }
                    } else {
                        int i3 = i2 == 1 ? R.string.sorry_string : R.string.ask_to_confirm_message_reprompt;
                        C9309a aVar8 = this.f38053n;
                        return C58485gu.m89842j(C11932a.m27754g(aVar8.mo17491a(aVar8.f32300b).getString(i3)));
                    }
                }
            }
            return m3;
        } else {
            this.f38052m = C11945h.m27792q(this.f38052m, "message");
            C58485gu m4 = C58485gu.m89845m();
            if (C11945h.m27791p(this.f38052m, "message") == 3) {
                this.f38052m = C11945h.m27790o(this.f38052m, "message", 1);
                C9309a aVar9 = this.f38053n;
                return C58485gu.m89842j(C11932a.m27754g(aVar9.mo17491a(aVar9.f32300b).getString(R.string.get_message_reply_notification)));
            }
            C64784d dVar3 = this.f38052m.f175582b;
            if (dVar3 == null) {
                dVar3 = C64784d.f175584d;
            }
            if (dVar3.f175587b.equals("SendMessage.NUMBER")) {
                C9309a aVar10 = this.f38053n;
                return C58485gu.m89842j(C11932a.m27754g(aVar10.mo17491a(aVar10.f32300b).getString(R.string.ask_for_message_to_number)));
            }
            String e3 = C11943f.m27771e(this.f38042c, this.f38052m);
            if (!m27533k(Arrays.asList(new String[]{e3}))) {
                return m4;
            }
            if (C11945h.m27783h(this.f38052m, "provider").equals("SMS")) {
                C9309a aVar11 = this.f38053n;
                return C58485gu.m89842j(C11932a.m27754g(aVar11.mo17491a(aVar11.f32300b).getString(R.string.ask_for_text_message_contact_first_time, new Object[]{e3})));
            }
            C9309a aVar12 = this.f38053n;
            return C58485gu.m89842j(C11932a.m27754g(aVar12.mo17491a(aVar12.f32300b).getString(R.string.chat_with_contact, new Object[]{e3})));
        }
    }

    /* renamed from: g */
    public final void mo20203g() {
        this.f38044e = 0;
        this.f38052m = C64782b.f175579d;
        this.f38042c = C55093fp.f144965l;
        this.f38043d = C63463p.f171507e;
        this.f38051l = C51058ev.f132941o;
        this.f38041b = false;
    }

    /* renamed from: i */
    public final int mo20204i(C63473z zVar) {
        if (zVar.f171531b.size() > 0) {
            int a = C63445ae.m96237a(((C63446af) zVar.f171531b.get(0)).f171465c);
            if (a == 0) {
                return 1;
            }
            return a;
        }
        if (zVar.f171535f.size() > 0) {
            C64782b bVar = this.f38052m;
            if ((bVar.f175581a & 2) != 0) {
                C64784d dVar = bVar.f175582b;
                if (dVar == null) {
                    dVar = C64784d.f175584d;
                }
                if (!dVar.f175587b.equals("SendMessage.CONTACT")) {
                    C64784d dVar2 = this.f38052m.f175582b;
                    if (dVar2 == null) {
                        dVar2 = C64784d.f175584d;
                    }
                    if (dVar2.f175587b.equals("SendMessage.CONTACT_CHAT")) {
                        return 1;
                    }
                    return 4;
                }
            }
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d4, code lost:
        if (com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27788m(r0.f38052m, "contact_number") == false) goto L_0x01d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0261 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x021b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4522b.C58485gu mo20200d(com.google.protos.p4850an.p4855d.p4856a.C63473z r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.protos.f.b.d.b r2 = r0.f38052m
            int r2 = r2.f175581a
            r3 = 2
            r2 = r2 & r3
            java.lang.String r4 = "SMS"
            java.lang.String r5 = "SendMessage.CONTACT_CHAT"
            java.lang.String r6 = "SendMessage.CONTACT"
            java.lang.String r7 = "SendMessage.NUMBER"
            java.lang.String r8 = "contact_number"
            r9 = 3
            r10 = 0
            java.lang.String r11 = "provider"
            java.lang.String r12 = "message"
            r13 = 4
            r14 = 1
            if (r2 == 0) goto L_0x0020
            goto L_0x00e7
        L_0x0020:
            if (r2 == 0) goto L_0x0024
            goto L_0x009b
        L_0x0024:
            int r2 = r1.f171533d
            int r2 = com.google.protos.p4850an.p4855d.p4856a.C63472y.m96243a(r2)
            if (r2 != 0) goto L_0x002d
            r2 = 3
        L_0x002d:
            int r2 = r2 + -1
            if (r2 == 0) goto L_0x004d
            if (r2 == r3) goto L_0x004d
            if (r2 == r13) goto L_0x0036
            goto L_0x0085
        L_0x0036:
            com.google.common.b.gu r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11939b.f38356d
            com.google.protos.f.b.d.b r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27778c(r5, r2)
            r0.f38052m = r2
            com.google.protos.an.d.a.p r15 = r1.f171536g
            if (r15 != 0) goto L_0x0044
            com.google.protos.an.d.a.p r15 = com.google.protos.p4850an.p4855d.p4856a.C63463p.f171507e
        L_0x0044:
            java.lang.String r15 = r15.f171512d
            com.google.protos.f.b.d.b r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27782g(r2, r11, r15)
            r0.f38052m = r2
            goto L_0x0085
        L_0x004d:
            int r2 = r16.mo20204i(r17)
            if (r2 != r13) goto L_0x0055
            r15 = r7
            goto L_0x0056
        L_0x0055:
            r15 = r6
        L_0x0056:
            if (r2 != r13) goto L_0x005b
            com.google.common.b.gu r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11939b.f38357e
            goto L_0x005d
        L_0x005b:
            com.google.common.b.gu r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11939b.f38356d
        L_0x005d:
            com.google.protos.f.b.d.b r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27778c(r15, r2)
            r0.f38052m = r2
            int r2 = r1.f171533d
            int r2 = com.google.protos.p4850an.p4855d.p4856a.C63472y.m96243a(r2)
            if (r2 == 0) goto L_0x0085
            if (r2 != r14) goto L_0x0085
            com.google.protos.f.b.d.b r2 = r0.f38052m
            com.google.protos.f.b.d.d r2 = r2.f175582b
            if (r2 != 0) goto L_0x0075
            com.google.protos.f.b.d.d r2 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x0075:
            java.lang.String r2 = r2.f175587b
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0085
            com.google.protos.f.b.d.b r2 = r0.f38052m
            com.google.protos.f.b.d.b r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27782g(r2, r11, r4)
            r0.f38052m = r2
        L_0x0085:
            com.google.protos.f.b.d.b r2 = r0.f38052m
            int r2 = r2.f175581a
            r2 = r2 & r3
            if (r2 != 0) goto L_0x009b
            com.google.common.f.a.d r1 = f38040a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "IntentState Initialization failed"
            r3 = 43625(0xaa69, float:6.1132E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            goto L_0x00b1
        L_0x009b:
            int r2 = r16.mo20204i(r17)
            if (r2 != r13) goto L_0x00cc
            com.google.protobuf.cq r2 = r1.f171531b
            java.lang.Object r2 = r2.get(r10)
            com.google.protos.an.d.a.af r2 = (com.google.protos.p4850an.p4855d.p4856a.C63446af) r2
            java.lang.String r2 = r2.f171466d
            boolean r15 = r2.isEmpty()
            if (r15 == 0) goto L_0x00c4
        L_0x00b1:
            com.google.common.f.a.d r1 = f38040a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "#createClientOpsWithSendMessageAction: No phone number provide for send message to phone number actions!"
            r3 = 43652(0xaa84, float:6.117E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            return r1
        L_0x00c4:
            com.google.protos.f.b.d.b r15 = r0.f38052m
            com.google.protos.f.b.d.b r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27782g(r15, r8, r2)
            r0.f38052m = r2
        L_0x00cc:
            int r2 = r1.f171530a
            r2 = r2 & r13
            if (r2 == 0) goto L_0x00e7
            com.google.protos.f.b.d.b r2 = r0.f38052m
            com.google.protos.f.b.d.b r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27790o(r2, r12, r3)
            r0.f38052m = r2
            com.google.protos.an.d.a.r r15 = r1.f171532c
            if (r15 != 0) goto L_0x00df
            com.google.protos.an.d.a.r r15 = com.google.protos.p4850an.p4855d.p4856a.C63465r.f171513c
        L_0x00df:
            java.lang.String r15 = r15.f171516b
            com.google.protos.f.b.d.b r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27781f(r2, r12, r15)
            r0.f38052m = r2
        L_0x00e7:
            com.google.protos.f.b.d.b r2 = r0.f38052m
            boolean r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27788m(r2, r8)
            if (r2 != 0) goto L_0x01d7
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d.f38336i
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.auto.ondevice.utils.a.c r2 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11935c) r2
            com.google.bb.a.fp r10 = r0.f38042c
            r2.copyOnWrite()
            com.google.protobuf.bv r15 = r2.instance
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r15 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d) r15
            r10.getClass()
            r15.f38339b = r10
            int r10 = r15.f38338a
            r10 = r10 | r14
            r15.f38338a = r10
            com.google.protos.f.b.d.b r10 = r0.f38052m
            r2.copyOnWrite()
            com.google.protobuf.bv r15 = r2.instance
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r15 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d) r15
            r10.getClass()
            r15.f38341d = r10
            int r10 = r15.f38338a
            r10 = r10 | r13
            r15.f38338a = r10
            int r10 = r1.f171530a
            r10 = r10 & 16
            if (r10 == 0) goto L_0x0142
            com.google.protos.f.b.d.b r10 = r0.f38052m
            boolean r10 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27788m(r10, r11)
            if (r10 == 0) goto L_0x0142
            com.google.protos.an.d.a.ab r10 = r1.f171534e
            if (r10 != 0) goto L_0x0131
            com.google.protos.an.d.a.ab r10 = com.google.protos.p4850an.p4855d.p4856a.C63442ab.f171454e
        L_0x0131:
            r2.copyOnWrite()
            com.google.protobuf.bv r15 = r2.instance
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r15 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d) r15
            r10.getClass()
            r15.f38340c = r10
            int r10 = r15.f38338a
            r10 = r10 | r3
            r15.f38338a = r10
        L_0x0142:
            com.google.protobuf.cq r10 = r1.f171535f
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x014f
            com.google.protobuf.cq r10 = r1.f171535f
            r2.mo20312a(r10)
        L_0x014f:
            com.google.protobuf.cq r10 = r1.f171531b
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x015c
            com.google.protobuf.cq r10 = r1.f171531b
            r2.mo20313b(r10)
        L_0x015c:
            com.google.protos.an.d.a.p r10 = r0.f38043d
            int r15 = r10.f171509a
            r15 = r15 & r14
            if (r15 == 0) goto L_0x0175
            r2.copyOnWrite()
            com.google.protobuf.bv r15 = r2.instance
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r15 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d) r15
            r10.getClass()
            r15.f38345h = r10
            int r10 = r15.f38338a
            r10 = r10 | 16
            r15.f38338a = r10
        L_0x0175:
            if (r18 != 0) goto L_0x0186
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r10 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d) r10
            int r15 = r10.f38338a
            r15 = r15 | 8
            r10.f38338a = r15
            r10.f38342e = r14
        L_0x0186:
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r10 = com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11934b.f38331c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.ondevice.utils.a.a r10 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11933a) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r15 = r10.instance
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r15 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11934b) r15
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.assistant.auto.ondevice.utils.a.d r2 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11936d) r2
            r2.getClass()
            r15.f38334b = r2
            r15.f38333a = r3
            com.google.protobuf.bv r2 = r10.build()
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r2 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11934b) r2
            com.google.android.libraries.assistant.auto.ondevice.utils.e r10 = r0.f38055p
            com.google.android.libraries.assistant.auto.ondevice.utils.a.b r2 = r10.mo20315a(r2)
            int r10 = r2.f38333a
            if (r10 != r14) goto L_0x01b7
            java.lang.Object r2 = r2.f38334b
            com.google.android.libraries.assistant.auto.ondevice.utils.a.f r2 = (com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11938f) r2
            goto L_0x01b9
        L_0x01b7:
            com.google.android.libraries.assistant.auto.ondevice.utils.a.f r2 = com.google.android.libraries.assistant.auto.ondevice.utils.p715a.C11938f.f38347e
        L_0x01b9:
            com.google.protobuf.cq r10 = r2.f38352d
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89842j(r10)
            com.google.protos.f.b.d.b r15 = r2.f38350b
            if (r15 != 0) goto L_0x01c5
            com.google.protos.f.b.d.b r15 = com.google.protos.p4985f.p4988b.p4993d.C64782b.f175579d
        L_0x01c5:
            r0.f38052m = r15
            boolean r2 = r2.f38351c
            if (r2 == 0) goto L_0x01ce
            r0.f38041b = r14
            goto L_0x01d8
        L_0x01ce:
            com.google.protos.f.b.d.b r2 = r0.f38052m
            boolean r2 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27788m(r2, r8)
            if (r2 != 0) goto L_0x01d7
            goto L_0x01d8
        L_0x01d7:
            r10 = 0
        L_0x01d8:
            com.google.protos.f.b.d.b r2 = r0.f38052m
            com.google.protos.f.b.d.d r2 = r2.f175582b
            if (r2 != 0) goto L_0x01e0
            com.google.protos.f.b.d.d r2 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x01e0:
            java.lang.String r2 = r2.f175587b
            boolean r2 = r2.equals(r7)
            com.google.protos.f.b.d.b r7 = r0.f38052m
            com.google.protos.f.b.d.d r7 = r7.f175582b
            if (r7 != 0) goto L_0x01ee
            com.google.protos.f.b.d.d r7 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x01ee:
            java.lang.String r7 = r7.f175587b
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x020c
            com.google.protos.f.b.d.b r7 = r0.f38052m
            boolean r7 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27788m(r7, r11)
            if (r7 == 0) goto L_0x020c
            com.google.protos.f.b.d.b r7 = r0.f38052m
            java.lang.String r7 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27783h(r7, r11)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x020c
            r4 = 1
            goto L_0x020d
        L_0x020c:
            r4 = 0
        L_0x020d:
            if (r2 != 0) goto L_0x0211
            if (r4 == 0) goto L_0x025f
        L_0x0211:
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f38057r
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250431cx
            boolean r2 = r2.mo79746e(r4)
            if (r2 == 0) goto L_0x0255
            com.google.android.apps.gsa.g.g.a r2 = r0.f38058s
            com.google.android.libraries.search.m.b.b r4 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_ASSISTANT_AUTO
            boolean r2 = r2.a(r4)
            if (r2 != 0) goto L_0x023d
            com.google.android.apps.gsa.a.c.a r2 = r0.f38053n
            android.content.Context r4 = r2.f32300b
            android.content.res.Resources r2 = r2.mo17491a(r4)
            r4 = 2132091721(0x7f152349, float:1.9823818E38)
            java.lang.String r2 = r2.getString(r4)
            com.google.assistant.e.j.dy r2 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r2)
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89846n(r2)
            goto L_0x0259
        L_0x023d:
            com.google.android.apps.gsa.a.c.a r2 = r0.f38053n
            android.content.Context r4 = r2.f32300b
            android.content.res.Resources r2 = r2.mo17491a(r4)
            r4 = 2132091728(0x7f152350, float:1.9823832E38)
            java.lang.String r2 = r2.getString(r4)
            com.google.assistant.e.j.dy r2 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r2)
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89846n(r2)
            goto L_0x0259
        L_0x0255:
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0259:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x038b
        L_0x025f:
            if (r10 == 0) goto L_0x0262
            return r10
        L_0x0262:
            com.google.protobuf.cq r2 = r1.f171535f
            java.util.Iterator r2 = r2.iterator()
            r4 = 4
        L_0x0269:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x02da
            java.lang.Object r7 = r2.next()
            com.google.protos.an.d.a.j r7 = (com.google.protos.p4850an.p4855d.p4856a.C63457j) r7
            int r8 = r7.f171492b
            int r8 = com.google.protos.p4850an.p4855d.p4856a.C63454g.m96239a(r8)
            if (r8 != 0) goto L_0x027e
            r8 = 1
        L_0x027e:
            int r8 = r8 + -1
            if (r8 == 0) goto L_0x02b4
            if (r8 == r3) goto L_0x02ab
            if (r8 == r13) goto L_0x029a
            r7 = 5
            if (r8 == r7) goto L_0x0298
            com.google.common.f.a.d r7 = f38040a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r8 = "Unknown delta type"
            r10 = 43626(0xaa6a, float:6.1133E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r10)).mo56386p(r8)
            goto L_0x02d8
        L_0x0298:
            r4 = 3
            goto L_0x02d8
        L_0x029a:
            com.google.protos.f.b.d.b r7 = r0.f38052m
            int r7 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27791p(r7, r12)
            if (r7 == r13) goto L_0x02d8
            com.google.protos.f.b.d.b r7 = r0.f38052m
            com.google.protos.f.b.d.b r7 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27790o(r7, r12, r13)
            r0.f38052m = r7
            goto L_0x02d8
        L_0x02ab:
            com.google.protos.f.b.d.b r7 = r0.f38052m
            com.google.protos.f.b.d.b r7 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27790o(r7, r12, r9)
            r0.f38052m = r7
            goto L_0x02d8
        L_0x02b4:
            int r7 = r7.f171493c
            int r7 = com.google.protos.p4850an.p4855d.p4856a.C63456i.m96240a(r7)
            if (r7 == 0) goto L_0x02d8
            if (r7 != r3) goto L_0x02d8
            com.google.protos.an.d.a.r r7 = r1.f171532c
            if (r7 != 0) goto L_0x02c4
            com.google.protos.an.d.a.r r7 = com.google.protos.p4850an.p4855d.p4856a.C63465r.f171513c
        L_0x02c4:
            java.lang.String r7 = r7.f171516b
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x02d8
            com.google.protos.f.b.d.b r8 = r0.f38052m
            com.google.protos.f.b.d.b r8 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27790o(r8, r12, r3)
            com.google.protos.f.b.d.b r7 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27781f(r8, r12, r7)
            r0.f38052m = r7
        L_0x02d8:
            if (r4 != r9) goto L_0x0269
        L_0x02da:
            if (r4 != r9) goto L_0x0322
            r0.f38041b = r14
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f38057r
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250298aW
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x030a
            com.google.android.libraries.assistant.auto.ondevice.utils.CommsNlgUtil r1 = r0.f38059t
            java.lang.String r2 = "FLF_CONVENTIONAL_CLOSING_closing_type_cancelled"
            r3 = 0
            com.google.nlp.a.s r2 = com.google.android.libraries.assistant.auto.ondevice.utils.CommsNlgUtil.m27744b(r2, r3)
            com.google.assistant.e.j.dy r1 = r1.mo20309a(r2)
            if (r1 == 0) goto L_0x02fc
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
            goto L_0x0321
        L_0x02fc:
            com.google.common.f.a.d r1 = f38040a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Failed to generate cancel Tts ClientOp."
            r3 = 43642(0xaa7a, float:6.1155E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
        L_0x030a:
            com.google.android.apps.gsa.a.c.a r1 = r0.f38053n
            android.content.Context r2 = r1.f32300b
            android.content.res.Resources r1 = r1.mo17491a(r2)
            r2 = 2132090350(0x7f151dee, float:1.9821038E38)
            java.lang.String r1 = r1.getString(r2)
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32462a(r1)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r1)
        L_0x0321:
            return r1
        L_0x0322:
            r1 = 0
            r0.f38044e = r1
            com.google.protos.f.b.d.b r1 = r0.f38052m
            com.google.protos.f.b.d.d r1 = r1.f175582b
            if (r1 != 0) goto L_0x032d
            com.google.protos.f.b.d.d r1 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x032d:
            java.lang.String r1 = r1.f175587b
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0386
            com.google.protos.f.b.d.b r1 = r0.f38052m
            java.lang.String r1 = com.google.android.libraries.assistant.auto.ondevice.utils.C11945h.m27783h(r1, r11)
            java.lang.String r2 = "hangout"
            boolean r1 = com.google.common.base.C58890d.m90990e(r1, r2)
            if (r1 == 0) goto L_0x0386
            com.google.protos.f.b.d.b r1 = r0.f38052m
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.protos.f.b.d.a r1 = (com.google.protos.p4985f.p4988b.p4993d.C64769a) r1
            com.google.protos.f.b.d.b r2 = r0.f38052m
            com.google.protos.f.b.d.d r2 = r2.f175582b
            if (r2 != 0) goto L_0x0353
            com.google.protos.f.b.d.d r2 = com.google.protos.p4985f.p4988b.p4993d.C64784d.f175584d
        L_0x0353:
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.protos.f.b.d.c r2 = (com.google.protos.p4985f.p4988b.p4993d.C64783c) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.protos.f.b.d.d r4 = (com.google.protos.p4985f.p4988b.p4993d.C64784d) r4
            int r6 = r4.f175586a
            r6 = r6 | r14
            r4.f175586a = r6
            r4.f175587b = r5
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.protos.f.b.d.b r4 = (com.google.protos.p4985f.p4988b.p4993d.C64782b) r4
            com.google.protobuf.bv r2 = r2.build()
            com.google.protos.f.b.d.d r2 = (com.google.protos.p4985f.p4988b.p4993d.C64784d) r2
            r2.getClass()
            r4.f175582b = r2
            int r2 = r4.f175581a
            r2 = r2 | r3
            r4.f175581a = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.protos.f.b.d.b r1 = (com.google.protos.p4985f.p4988b.p4993d.C64782b) r1
            r0.f38052m = r1
        L_0x0386:
            com.google.common.b.gu r1 = r16.mo20202f()
            return r1
        L_0x038b:
            r0.f38041b = r14
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.p708b.C11841ac.mo20200d(com.google.protos.an.d.a.z, boolean):com.google.common.b.gu");
    }
}
