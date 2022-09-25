package com.google.android.apps.gsa.staticplugins.opa.worker.p8610e;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.contacts.C74491y;
import com.google.android.apps.gsa.contacts.ap;
import com.google.android.apps.gsa.contacts.bz;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85001d;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.speech.p7270c.C92220c;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11210e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3912f.C51206a;
import com.google.assistant.p3897e.p3912f.C51207b;
import com.google.assistant.p3897e.p3912f.C51221p;
import com.google.assistant.p3897e.p3912f.C51222q;
import com.google.assistant.p3897e.p3917i.p3918a.C51254ax;
import com.google.assistant.p3897e.p3917i.p3918a.C51390fy;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3917i.p3918a.C51406gn;
import com.google.assistant.p3897e.p3917i.p3918a.C51460in;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52357ot;
import com.google.assistant.p3897e.p3921j.C52358ou;
import com.google.assistant.p3897e.p3921j.C52362oy;
import com.google.assistant.p3897e.p3921j.C52363oz;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.assistant.p3897e.p3921j.C52378pn;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4184bj.p4193c.p4200e.C55998f;
import com.google.protos.p4985f.p4986a.C64652af;
import com.google.protos.p4985f.p4986a.C64653ag;
import com.google.protos.p4985f.p4986a.C64668av;
import com.google.protos.p4985f.p4986a.C64669aw;
import com.google.protos.p4985f.p4986a.C64696f;
import com.google.protos.p4985f.p4986a.C64698h;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.e.l */
/* compiled from: PG */
public final class C114294l extends C86734a implements C85001d {

    /* renamed from: a */
    public static final C59071e f316923a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.e.l");

    /* renamed from: b */
    public final C86124t f316924b;

    /* renamed from: c */
    public final C118561t f316925c;

    /* renamed from: f */
    private final C22871g f316926f;

    /* renamed from: g */
    private final C21370a f316927g;

    /* renamed from: h */
    private final C86054o f316928h;

    /* renamed from: i */
    private final C86106b f316929i;

    /* renamed from: j */
    private final u f316930j;

    /* renamed from: k */
    private final C85664bo f316931k;

    /* renamed from: l */
    private final C74491y f316932l;

    /* renamed from: m */
    private final bz f316933m;

    /* renamed from: n */
    private final C92220c f316934n;

    public C114294l(C22871g gVar, C118561t tVar, C86124t tVar2, C21370a aVar, C86054o oVar, C86106b bVar, u uVar, C85664bo boVar, C74491y yVar, C92220c cVar, bz bzVar) {
        super(C118575h.WORKER_OPA_COMMUNICATIONS, "opacommunications");
        this.f316926f = gVar;
        this.f316924b = tVar2;
        this.f316927g = aVar;
        this.f316928h = oVar;
        this.f316929i = bVar;
        this.f316930j = uVar;
        this.f316925c = tVar;
        this.f316931k = boVar;
        this.f316932l = yVar;
        this.f316934n = cVar;
        this.f316933m = bzVar;
    }

    /* renamed from: c */
    private static C51406gn m189567c(C51406gn gnVar, C51401gi giVar) {
        C51390fy fyVar = (C51390fy) gnVar.toBuilder();
        fyVar.copyOnWrite();
        C51406gn gnVar2 = (C51406gn) fyVar.instance;
        gnVar2.f133894f = giVar.f133877t;
        gnVar2.f133889a |= 16;
        return (C51406gn) fyVar.build();
    }

    /* renamed from: e */
    private static C55421x m189568e(C51936ep epVar) {
        C51936ep epVar2 = C51936ep.DEFAULT;
        int ordinal = epVar.ordinal();
        if (ordinal == 1) {
            return C55421x.PHONE_CALL_CONTACT;
        }
        if (ordinal == 2) {
            return C55421x.GENERIC_SEND_MESSAGE;
        }
        ((C59052c) ((C59052c) f316923a.mo56225c()).mo56372aa(28920)).mo56387q("Invalid FeatureType %d provided", epVar.f136236u);
        return C55421x.UNKNOWN_ACTION;
    }

    /* renamed from: f */
    private static C55998f m189569f(C51401gi giVar) {
        return giVar == C51401gi.CANCEL ? C55998f.CANCELED : C55998f.COMPLETED;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p3186j$.util.Optional m189570g(com.google.assistant.p3897e.p3921j.C52378pn r7, boolean r8) {
        /*
            int r0 = r7.f137446a
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x023b
            java.lang.String r0 = r7.f137450e
            if (r8 == 0) goto L_0x000e
            java.lang.String r0 = com.google.android.libraries.assistant.p616a.C10989a.m25986b(r0)
        L_0x000e:
            com.google.assistant.e.f.o r2 = com.google.assistant.p3897e.p3912f.C51220o.f133350m
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.f.m r2 = (com.google.assistant.p3897e.p3912f.C51218m) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.f.o r3 = (com.google.assistant.p3897e.p3912f.C51220o) r3
            r0.getClass()
            int r4 = r3.f133352a
            r4 = r4 | r1
            r3.f133352a = r4
            r3.f133354c = r0
            com.google.assistant.e.j.pj r0 = r7.f137453h
            if (r0 != 0) goto L_0x002d
            com.google.assistant.e.j.pj r0 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x002d:
            int r0 = r0.f137437b
            java.lang.String r3 = ""
            if (r0 != r1) goto L_0x0088
            com.google.assistant.e.j.pj r0 = r7.f137453h
            if (r0 != 0) goto L_0x0039
            com.google.assistant.e.j.pj r0 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x0039:
            int r4 = r0.f137437b
            if (r4 != r1) goto L_0x0042
            java.lang.Object r0 = r0.f137438c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0043
        L_0x0042:
            r0 = r3
        L_0x0043:
            if (r8 == 0) goto L_0x0076
            com.google.assistant.e.j.yv r4 = com.google.assistant.p3897e.p3921j.C52629yv.f138180g
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.yu r4 = (com.google.assistant.p3897e.p3921j.C52628yu) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.yv r5 = (com.google.assistant.p3897e.p3921j.C52629yv) r5
            r0.getClass()
            int r6 = r5.f138182a
            r6 = r6 | r1
            r5.f138182a = r6
            r5.f138184c = r0
            com.google.protobuf.bv r0 = r4.build()
            com.google.assistant.e.j.yv r0 = (com.google.assistant.p3897e.p3921j.C52629yv) r0
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.p616a.C10989a.m25985a(r0)
            boolean r4 = r0.mo56113h()
            if (r4 == 0) goto L_0x0075
            java.lang.Object r0 = r0.mo56107c()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0076
        L_0x0075:
            r0 = r3
        L_0x0076:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.f.o r4 = (com.google.assistant.p3897e.p3912f.C51220o) r4
            r0.getClass()
            int r5 = r4.f133352a
            r5 = r5 | 8
            r4.f133352a = r5
            r4.f133356e = r0
        L_0x0088:
            com.google.assistant.e.j.pj r0 = r7.f137453h
            if (r0 != 0) goto L_0x008f
            com.google.assistant.e.j.pj r4 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            goto L_0x0090
        L_0x008f:
            r4 = r0
        L_0x0090:
            int r4 = r4.f137437b
            r5 = 5
            if (r4 != r5) goto L_0x00b5
            if (r0 != 0) goto L_0x0099
            com.google.assistant.e.j.pj r0 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x0099:
            int r4 = r0.f137437b
            if (r4 != r5) goto L_0x00a2
            java.lang.Object r0 = r0.f137438c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00a3
        L_0x00a2:
            r0 = r3
        L_0x00a3:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.f.o r4 = (com.google.assistant.p3897e.p3912f.C51220o) r4
            r0.getClass()
            int r5 = r4.f133352a
            r5 = r5 | 64
            r4.f133352a = r5
            r4.f133359h = r0
        L_0x00b5:
            com.google.assistant.e.j.pj r0 = r7.f137453h
            if (r0 != 0) goto L_0x00bc
            com.google.assistant.e.j.pj r4 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            goto L_0x00bd
        L_0x00bc:
            r4 = r0
        L_0x00bd:
            int r4 = r4.f137437b
            r5 = 6
            if (r4 != r5) goto L_0x00e8
            if (r0 != 0) goto L_0x00c6
            com.google.assistant.e.j.pj r0 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x00c6:
            int r4 = r0.f137437b
            if (r4 != r5) goto L_0x00cf
            java.lang.Object r0 = r0.f137438c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00d0
        L_0x00cf:
            r0 = r3
        L_0x00d0:
            if (r8 == 0) goto L_0x00d6
            java.lang.String r0 = com.google.android.libraries.assistant.p616a.C10989a.m25986b(r0)
        L_0x00d6:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.e.f.o r4 = (com.google.assistant.p3897e.p3912f.C51220o) r4
            r0.getClass()
            int r5 = r4.f133352a
            r5 = r5 | 128(0x80, float:1.794E-43)
            r4.f133352a = r5
            r4.f133360i = r0
        L_0x00e8:
            com.google.assistant.e.j.pj r0 = r7.f137453h
            if (r0 != 0) goto L_0x00ef
            com.google.assistant.e.j.pj r4 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            goto L_0x00f0
        L_0x00ef:
            r4 = r0
        L_0x00f0:
            int r4 = r4.f137437b
            r5 = 1
            if (r4 != r5) goto L_0x011a
            if (r0 != 0) goto L_0x00f9
            com.google.assistant.e.j.pj r0 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x00f9:
            int r4 = r0.f137437b
            if (r4 != r5) goto L_0x0102
            java.lang.Object r0 = r0.f137438c
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
        L_0x0102:
            if (r8 == 0) goto L_0x0108
            java.lang.String r3 = com.google.android.libraries.assistant.p616a.C10989a.m25986b(r3)
        L_0x0108:
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.f.o r0 = (com.google.assistant.p3897e.p3912f.C51220o) r0
            r3.getClass()
            int r4 = r0.f133352a
            r4 = r4 | 16
            r0.f133352a = r4
            r0.f133357f = r3
        L_0x011a:
            int r0 = r7.f137446a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x013a
            java.lang.String r0 = r7.f137452g
            if (r8 == 0) goto L_0x0128
            java.lang.String r0 = com.google.android.libraries.assistant.p616a.C10989a.m25986b(r0)
        L_0x0128:
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.f.o r8 = (com.google.assistant.p3897e.p3912f.C51220o) r8
            r0.getClass()
            int r3 = r8.f133352a
            r3 = r3 | 4
            r8.f133352a = r3
            r8.f133355d = r0
        L_0x013a:
            com.google.assistant.e.j.ade r8 = r7.f137449d
            if (r8 != 0) goto L_0x0140
            com.google.assistant.e.j.ade r8 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x0140:
            int r8 = r8.f134879a
            r8 = r8 & 4
            if (r8 == 0) goto L_0x0160
            com.google.assistant.e.j.ade r8 = r7.f137449d
            if (r8 != 0) goto L_0x014c
            com.google.assistant.e.j.ade r8 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x014c:
            java.lang.String r8 = r8.f134882d
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.f.o r0 = (com.google.assistant.p3897e.p3912f.C51220o) r0
            r8.getClass()
            int r3 = r0.f133352a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r0.f133352a = r3
            r0.f133361j = r8
        L_0x0160:
            java.lang.String r8 = r7.f137454i
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0230
            com.google.assistant.e.f.k r8 = com.google.assistant.p3897e.p3912f.C51216k.f133340d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.f.j r8 = (com.google.assistant.p3897e.p3912f.C51215j) r8
            java.lang.String r0 = r7.f137454i
            java.lang.String r0 = com.google.android.libraries.assistant.p616a.C10989a.m25986b(r0)
            r8.copyOnWrite()
            com.google.protobuf.bv r3 = r8.instance
            com.google.assistant.e.f.k r3 = (com.google.assistant.p3897e.p3912f.C51216k) r3
            r0.getClass()
            int r4 = r3.f133342a
            r4 = r4 | r5
            r3.f133342a = r4
            r3.f133343b = r0
            com.google.assistant.e.j.ade r0 = r7.f137449d
            if (r0 != 0) goto L_0x018d
            com.google.assistant.e.j.ade r0 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x018d:
            com.google.protobuf.cq r0 = r0.f134885g
            java.util.Iterator r0 = r0.iterator()
        L_0x0193:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01f9
            java.lang.Object r3 = r0.next()
            com.google.assistant.e.j.adm r3 = (com.google.assistant.p3897e.p3921j.adm) r3
            int r4 = r3.f134891a
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0193
            com.google.assistant.e.j.g r4 = r3.f134896f
            if (r4 != 0) goto L_0x01aa
            com.google.assistant.e.j.g r4 = com.google.assistant.p3897e.p3921j.C52121g.f136775b
        L_0x01aa:
            com.google.assistant.e.j.f r4 = r4.f136777a
            if (r4 != 0) goto L_0x01b0
            com.google.assistant.e.j.f r4 = com.google.assistant.p3897e.p3921j.C52094f.f136713c
        L_0x01b0:
            java.lang.String r4 = r4.f136715a
            java.lang.String r6 = r7.f137454i
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0193
            com.google.assistant.e.j.g r7 = r3.f134896f
            if (r7 != 0) goto L_0x01c0
            com.google.assistant.e.j.g r7 = com.google.assistant.p3897e.p3921j.C52121g.f136775b
        L_0x01c0:
            com.google.assistant.e.j.f r7 = r7.f136777a
            if (r7 != 0) goto L_0x01c6
            com.google.assistant.e.j.f r7 = com.google.assistant.p3897e.p3921j.C52094f.f136713c
        L_0x01c6:
            java.lang.String r7 = r7.f136715a
            java.lang.String r7 = com.google.android.libraries.assistant.p616a.C10989a.m25986b(r7)
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.assistant.e.f.k r0 = (com.google.assistant.p3897e.p3912f.C51216k) r0
            r7.getClass()
            int r4 = r0.f133342a
            r4 = r4 | r5
            r0.f133342a = r4
            r0.f133343b = r7
            com.google.assistant.e.j.g r7 = r3.f134896f
            if (r7 != 0) goto L_0x01e3
            com.google.assistant.e.j.g r7 = com.google.assistant.p3897e.p3921j.C52121g.f136775b
        L_0x01e3:
            com.google.assistant.e.j.f r7 = r7.f136777a
            if (r7 != 0) goto L_0x01e9
            com.google.assistant.e.j.f r7 = com.google.assistant.p3897e.p3921j.C52094f.f136713c
        L_0x01e9:
            boolean r7 = r7.f136716b
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.assistant.e.f.k r0 = (com.google.assistant.p3897e.p3912f.C51216k) r0
            int r3 = r0.f133342a
            r1 = r1 | r3
            r0.f133342a = r1
            r0.f133344c = r7
        L_0x01f9:
            com.google.assistant.e.f.l r7 = com.google.assistant.p3897e.p3912f.C51217l.f133345c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.f.i r7 = (com.google.assistant.p3897e.p3912f.C51214i) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r0 = r7.instance
            com.google.assistant.e.f.l r0 = (com.google.assistant.p3897e.p3912f.C51217l) r0
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.f.k r8 = (com.google.assistant.p3897e.p3912f.C51216k) r8
            r8.getClass()
            r0.f133348b = r8
            int r8 = r0.f133347a
            r8 = r8 | r5
            r0.f133347a = r8
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.e.f.o r8 = (com.google.assistant.p3897e.p3912f.C51220o) r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.f.l r7 = (com.google.assistant.p3897e.p3912f.C51217l) r7
            r7.getClass()
            r8.f133363l = r7
            int r7 = r8.f133352a
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r8.f133352a = r7
        L_0x0230:
            com.google.protobuf.bv r7 = r2.build()
            com.google.assistant.e.f.o r7 = (com.google.assistant.p3897e.p3912f.C51220o) r7
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            return r7
        L_0x023b:
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.p8610e.C114294l.m189570g(com.google.assistant.e.j.pn, boolean):j$.util.Optional");
    }

    /* renamed from: h */
    private static Optional m189571h(String str) {
        if (TextUtils.isEmpty(str)) {
            ((C59052c) ((C59052c) f316923a.mo56225c()).mo56372aa(28924)).mo56386p("Empty eventId provided");
            return Optional.empty();
        }
        try {
            C60220t b = C28294l.m52912b(str);
            if ((b.f162933a & 1) != 0) {
                C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
                long j = b.f162934b;
                cVar.copyOnWrite();
                C65139d dVar = (C65139d) cVar.instance;
                dVar.f176309a |= 1;
                dVar.f176310b = j;
                if ((b.f162933a & 2) != 0) {
                    int i = b.f162935c;
                    cVar.copyOnWrite();
                    C65139d dVar2 = (C65139d) cVar.instance;
                    dVar2.f176309a |= 2;
                    dVar2.f176311c = i;
                }
                if ((b.f162933a & 4) != 0) {
                    int i2 = b.f162936d;
                    cVar.copyOnWrite();
                    C65139d dVar3 = (C65139d) cVar.instance;
                    dVar3.f176309a |= 4;
                    dVar3.f176312d = i2;
                }
                return Optional.m71637of((C65139d) cVar.build());
            }
            ((C59052c) ((C59052c) f316923a.mo56225c()).mo56372aa(28922)).mo56389s("Missing time_usec property within eventId: %s", str);
            return Optional.empty();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f316923a.mo56225c()).mo56382g(e)).mo56372aa(28923)).mo56389s("Invalid eventId provided: %s", str);
            return Optional.empty();
        }
    }

    /* renamed from: i */
    private static Optional m189572i(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        C51206a aVar = (C51206a) C51207b.f133303d.createBuilder();
        aVar.copyOnWrite();
        C51207b bVar = (C51207b) aVar.instance;
        str.getClass();
        bVar.f133305a |= 2;
        bVar.f133307c = str;
        String g = C58837ba.m90858g(str2);
        aVar.copyOnWrite();
        C51207b bVar2 = (C51207b) aVar.instance;
        bVar2.f133305a |= 1;
        bVar2.f133306b = g;
        return Optional.m71637of((C51207b) aVar.build());
    }

    /* renamed from: j */
    private static Optional m189573j(String str) {
        C51221p pVar = (C51221p) C51222q.f133364c.createBuilder();
        pVar.copyOnWrite();
        C51222q qVar = (C51222q) pVar.instance;
        qVar.f133366a |= 1;
        qVar.f133367b = str;
        return Optional.m71637of((C51222q) pVar.build());
    }

    /* renamed from: k */
    private final Optional m189574k(C51406gn gnVar, C51936ep epVar) {
        C51058ev evVar;
        C51058ev evVar2;
        C51058ev evVar3;
        C52363oz ozVar;
        C52378pn pnVar = gnVar.f133895g;
        if (pnVar == null) {
            pnVar = C52378pn.f137444j;
        }
        if (epVar == C51936ep.MESSAGE) {
            if (pnVar.f137447b == 4) {
                ozVar = (C52363oz) pnVar.f137448c;
            } else {
                ozVar = C52363oz.f137413c;
            }
            int a = C52362oy.m86594a(ozVar.f137416b);
            if (a != 0 && a == 2) {
                return m189572i("com.google.android.googlequicksearchbox.sms", "SMS");
            }
        }
        if (epVar == C51936ep.CALL) {
            C52374pj pjVar = pnVar.f137453h;
            if (pjVar == null) {
                pjVar = C52374pj.f137434e;
            }
            if (pjVar.f137437b == 2) {
                C52374pj pjVar2 = pnVar.f137453h;
                if (pjVar2 == null) {
                    pjVar2 = C52374pj.f137434e;
                }
                if (pjVar2.f137437b != 6) {
                    C51098gh ghVar = pnVar.f137451f;
                    if (ghVar == null) {
                        ghVar = C51098gh.f133009e;
                    }
                    if (ghVar.f133012b == 1) {
                        evVar3 = (C51058ev) ghVar.f133013c;
                    } else {
                        evVar3 = C51058ev.f132941o;
                    }
                    if (!evVar3.f132944b.equals("com.google.android.apps.tachyon")) {
                        return m189572i("com.android.server.telecom", "Phone");
                    }
                }
            }
        }
        C51098gh ghVar2 = pnVar.f137451f;
        if (ghVar2 == null) {
            ghVar2 = C51098gh.f133009e;
        }
        if (ghVar2.f133012b == 1) {
            evVar = (C51058ev) ghVar2.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if ((evVar.f132943a & 1) == 0) {
            return Optional.empty();
        }
        C51098gh ghVar3 = pnVar.f137451f;
        if (ghVar3 == null) {
            ghVar3 = C51098gh.f133009e;
        }
        if (ghVar3.f133012b == 1) {
            evVar2 = (C51058ev) ghVar3.f133013c;
        } else {
            evVar2 = C51058ev.f132941o;
        }
        String str = evVar2.f132944b;
        return m189572i(str, (String) this.f316924b.mo79752r(C90014bt.f247540jA).getOrDefault(str, BuildConfig.FLAVOR));
    }

    /* renamed from: l */
    private static Optional m189575l(C52378pn pnVar) {
        C52363oz ozVar;
        C52358ou ouVar;
        C52358ou ouVar2;
        C52363oz ozVar2;
        if (pnVar.f137447b == 4) {
            ozVar = (C52363oz) pnVar.f137448c;
        } else {
            ozVar = C52363oz.f137413c;
        }
        if ((ozVar.f137415a & 1) != 0) {
            C51936ep epVar = C51936ep.DEFAULT;
            if (pnVar.f137447b == 4) {
                ozVar2 = (C52363oz) pnVar.f137448c;
            } else {
                ozVar2 = C52363oz.f137413c;
            }
            int a = C52362oy.m86594a(ozVar2.f137416b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                return m189573j("/m/06844");
            }
            if (i == 2) {
                return m189573j("/m/02x5y36");
            }
            if (i != 3) {
                return Optional.empty();
            }
            return m189573j("/m/07z4p");
        }
        if (pnVar.f137447b == 3) {
            ouVar = (C52358ou) pnVar.f137448c;
        } else {
            ouVar = C52358ou.f137407c;
        }
        if ((ouVar.f137409a & 1) == 0) {
            return Optional.empty();
        }
        C51936ep epVar2 = C51936ep.DEFAULT;
        if (pnVar.f137447b == 3) {
            ouVar2 = (C52358ou) pnVar.f137448c;
        } else {
            ouVar2 = C52358ou.f137407c;
        }
        int a2 = C52357ot.m86593a(ouVar2.f137410b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 1;
        if (i2 == 1) {
            return m189573j("/m/02x5y36");
        }
        if (i2 != 2) {
            return Optional.empty();
        }
        return m189573j("/m/07z4p");
    }

    /* renamed from: m */
    private static boolean m189576m(C51406gn gnVar) {
        if ((gnVar.f133889a & 16) == 0) {
            return false;
        }
        C51401gi a = C51401gi.m86175a(gnVar.f133894f);
        if (a == null) {
            a = C51401gi.CONTROLLER_STATE_UNKNOWN;
        }
        return a == C51401gi.FULFILLMENT || a == C51401gi.CANCEL;
    }

    /* renamed from: n */
    private static Optional m189577n(List list, Optional optional, String str, int i) {
        int i2 = i;
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) f316923a.mo56225c()).mo56372aa(28926)).mo56386p("TopContactsInfo calculation timestamp is not available.");
            return Optional.empty();
        }
        Optional empty = Optional.empty();
        Iterator it = list.iterator();
        int i3 = 0;
        double d = -1.0d;
        int i4 = 0;
        int i5 = 1;
        while (it.hasNext()) {
            ap apVar = (ap) it.next();
            int i6 = apVar.a;
            if ((i6 & 4) == 0) {
                break;
            }
            double d2 = apVar.d;
            if (d2 == C59203do.f157270a) {
                break;
            }
            i3++;
            if (d2 == d) {
                i5++;
            } else {
                i4 += i5;
                d = d2;
                i5 = 1;
            }
            if ((i6 & 2) == 0) {
                Optional optional2 = optional;
                String str2 = str;
            } else if (!apVar.c.equals(str)) {
                Optional optional3 = optional;
            } else if (empty.isEmpty()) {
                C64668av avVar = (C64668av) C64669aw.f175288e.createBuilder();
                C64652af afVar = (C64652af) C64653ag.f175248e.createBuilder();
                afVar.copyOnWrite();
                C64653ag agVar = (C64653ag) afVar.instance;
                agVar.f175251b = i2 - 1;
                agVar.f175250a |= 1;
                double d3 = apVar.d;
                afVar.copyOnWrite();
                C64653ag agVar2 = (C64653ag) afVar.instance;
                agVar2.f175250a = 2 | agVar2.f175250a;
                agVar2.f175252c = d3;
                afVar.copyOnWrite();
                C64653ag agVar3 = (C64653ag) afVar.instance;
                agVar3.f175250a |= 4;
                agVar3.f175253d = i4;
                avVar.copyOnWrite();
                C64669aw awVar = (C64669aw) avVar.instance;
                C64653ag agVar4 = (C64653ag) afVar.build();
                agVar4.getClass();
                awVar.f175291b = agVar4;
                awVar.f175290a |= 1;
                empty = Optional.m71637of(avVar);
                C64668av avVar2 = (C64668av) empty.get();
                Objects.requireNonNull(avVar2);
                optional.ifPresent(new C114293k(avVar2));
            } else {
                Optional optional4 = optional;
                ((C59052c) ((C59052c) f316923a.mo56225c()).mo56372aa(28925)).mo56389s("Encountered multiple top contacts with the same display name in TopContactType: %s!", i2 != 2 ? i2 != 3 ? "AGGREGATE" : "MESSAGING" : "CALL");
            }
        }
        if (empty.isPresent()) {
            C64668av avVar3 = (C64668av) empty.get();
            avVar3.copyOnWrite();
            C64669aw awVar2 = (C64669aw) avVar3.instance;
            C64669aw awVar3 = C64669aw.f175288e;
            awVar2.f175290a |= 4;
            awVar2.f175292c = i3;
        }
        return empty.map(C114284b.f316912a);
    }

    /* renamed from: p */
    private final void m189578p(C51936ep epVar, C51406gn gnVar, C64696f fVar) {
        C52378pn pnVar = gnVar.f133895g;
        if (pnVar == null) {
            pnVar = C52378pn.f137444j;
        }
        Optional l = m189575l(pnVar);
        Objects.requireNonNull(fVar);
        l.ifPresent(new C114286d(fVar));
        Optional k = m189574k(gnVar, epVar);
        Objects.requireNonNull(fVar);
        k.ifPresent(new C114287e(fVar));
        fVar.copyOnWrite();
        C64698h hVar = (C64698h) fVar.instance;
        C64698h hVar2 = C64698h.f175368o;
        hVar.f175370a |= 256;
        hVar.f175378i = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05ec, code lost:
        r8 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo78597a(java.lang.String r23, com.google.assistant.p3897e.p3917i.p3918a.C51406gn r24, com.google.assistant.p3897e.p3921j.p3926e.C51936ep r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            r2 = r25
            com.google.android.apps.gsa.search.core.google.gaia.o r3 = r0.f316928h
            java.lang.String r3 = r3.mo79659F()
            if (r3 == 0) goto L_0x0866
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0016
            goto L_0x0866
        L_0x0016:
            int r4 = r1.f133889a
            r4 = r4 & 32
            if (r4 == 0) goto L_0x085f
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f316924b
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90025cd.f248146d
            boolean r4 = r4.mo79746e(r5)
            if (r4 != 0) goto L_0x0038
            com.google.android.apps.gsa.search.core.bo r4 = r0.f316931k
            com.google.android.apps.gsa.search.core.bm r5 = com.google.android.apps.gsa.search.core.C85662bm.WEB_HISTORY
            boolean r4 = r4.mo79197l(r5)
            if (r4 == 0) goto L_0x0031
            goto L_0x0038
        L_0x0031:
            com.google.android.apps.gsa.x.c r1 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r1
        L_0x0038:
            com.google.android.apps.gsa.search.core.i.t r4 = r0.f316924b
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90025cd.f248150h
            boolean r4 = r4.mo79746e(r5)
            r5 = 4
            r6 = 8
            r7 = 0
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L_0x054a
            j$.util.Optional r4 = m189571h(r23)
            com.google.android.apps.gsa.search.core.bo r10 = r0.f316931k
            com.google.android.apps.gsa.search.core.bm r11 = com.google.android.apps.gsa.search.core.C85662bm.DEVICE_CONTACTS
            boolean r10 = r10.mo79197l(r11)
            if (r10 != 0) goto L_0x005a
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x054a
        L_0x005a:
            boolean r10 = r4.isEmpty()
            if (r10 == 0) goto L_0x0071
            com.google.common.f.e r4 = f316923a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r10 = "Unable to log ActionInteractionEvent due to missing parent event ID."
            r11 = 28917(0x70f5, float:4.0521E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r11)).mo56386p(r10)
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x054a
        L_0x0071:
            com.google.protos.f.a.e r10 = com.google.protos.p4985f.p4986a.C64695e.f175359g
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.protos.f.a.d r10 = (com.google.protos.p4985f.p4986a.C64694d) r10
            com.google.bb.a.x r11 = m189568e(r25)
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.protos.f.a.e r12 = (com.google.protos.p4985f.p4986a.C64695e) r12
            int r11 = r11.f146230cP
            r12.f175365e = r11
            int r11 = r12.f175361a
            r11 = r11 | r6
            r12.f175361a = r11
            int r11 = r1.f133894f
            com.google.assistant.e.i.a.gi r11 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r11)
            if (r11 != 0) goto L_0x0097
            com.google.assistant.e.i.a.gi r11 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x0097:
            com.google.bj.c.e.f r11 = m189569f(r11)
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.protos.f.a.e r12 = (com.google.protos.p4985f.p4986a.C64695e) r12
            int r11 = r11.f149132g
            r12.f175364d = r11
            int r11 = r12.f175361a
            r11 = r11 | r5
            r12.f175361a = r11
            com.google.protos.f.a.l r11 = com.google.protos.p4985f.p4986a.C64702l.f175387d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.protos.f.a.k r11 = (com.google.protos.p4985f.p4986a.C64701k) r11
            com.google.android.apps.gsa.search.core.i.b r12 = r0.f316929i
            java.lang.String r12 = r12.mo79727b()
            java.lang.String r12 = com.google.common.base.C58837ba.m90858g(r12)
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.protos.f.a.l r13 = (com.google.protos.p4985f.p4986a.C64702l) r13
            int r14 = r13.f175389a
            r14 = r14 | r9
            r13.f175389a = r14
            r13.f175390b = r12
            com.google.assistant.e.j.rm r12 = com.google.assistant.p3897e.p3921j.C52431rm.OPA_AGSA
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.protos.f.a.l r13 = (com.google.protos.p4985f.p4986a.C64702l) r13
            int r12 = r12.f137633ah
            r13.f175391c = r12
            int r12 = r13.f175389a
            r12 = r12 | r8
            r13.f175389a = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.protos.f.a.e r12 = (com.google.protos.p4985f.p4986a.C64695e) r12
            com.google.protobuf.bv r11 = r11.build()
            com.google.protos.f.a.l r11 = (com.google.protos.p4985f.p4986a.C64702l) r11
            r11.getClass()
            r12.f175363c = r11
            int r11 = r12.f175361a
            r11 = r11 | r8
            r12.f175361a = r11
            com.google.assistant.e.j.pn r11 = r1.f133895g
            if (r11 != 0) goto L_0x00fa
            com.google.assistant.e.j.pn r11 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x00fa:
            com.google.assistant.e.j.ade r12 = r11.f137449d
            if (r12 != 0) goto L_0x0100
            com.google.assistant.e.j.ade r12 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x0100:
            int r12 = r12.f134879a
            r12 = r12 & r5
            if (r12 == 0) goto L_0x013d
            com.google.protos.f.a.n r12 = com.google.protos.p4985f.p4986a.C64704n.f175392c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.protos.f.a.m r12 = (com.google.protos.p4985f.p4986a.C64703m) r12
            com.google.assistant.e.j.ade r13 = r11.f137449d
            if (r13 != 0) goto L_0x0113
            com.google.assistant.e.j.ade r13 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x0113:
            java.lang.String r13 = r13.f134882d
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.protos.f.a.n r14 = (com.google.protos.p4985f.p4986a.C64704n) r14
            r13.getClass()
            int r15 = r14.f175394a
            r15 = r15 | r9
            r14.f175394a = r15
            r14.f175395b = r13
            r10.copyOnWrite()
            com.google.protobuf.bv r13 = r10.instance
            com.google.protos.f.a.e r13 = (com.google.protos.p4985f.p4986a.C64695e) r13
            com.google.protobuf.bv r12 = r12.build()
            com.google.protos.f.a.n r12 = (com.google.protos.p4985f.p4986a.C64704n) r12
            r12.getClass()
            r13.f175362b = r12
            int r12 = r13.f175361a
            r12 = r12 | r9
            r13.f175361a = r12
        L_0x013d:
            com.google.assistant.e.j.pj r12 = r11.f137453h
            if (r12 != 0) goto L_0x0143
            com.google.assistant.e.j.pj r12 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x0143:
            com.google.protos.f.a.j r13 = com.google.protos.p4985f.p4986a.C64700j.f175384b
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.protos.f.a.i r13 = (com.google.protos.p4985f.p4986a.C64699i) r13
            com.google.assistant.e.j.ade r11 = r11.f137449d
            if (r11 != 0) goto L_0x0151
            com.google.assistant.e.j.ade r11 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x0151:
            com.google.protobuf.cq r11 = r11.f134885g
            java.util.Iterator r11 = r11.iterator()
        L_0x0157:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x049f
            java.lang.Object r14 = r11.next()
            com.google.assistant.e.j.adm r14 = (com.google.assistant.p3897e.p3921j.adm) r14
            int r15 = r14.f134891a
            r15 = r15 & r9
            if (r15 == 0) goto L_0x0157
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            j$.util.Optional r16 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.yp r6 = r14.f134892b
            if (r6 != 0) goto L_0x0177
            com.google.assistant.e.j.yp r6 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x0177:
            com.google.protobuf.cq r6 = r6.f138166c
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0254
            com.google.assistant.e.j.yp r6 = r14.f134892b
            if (r6 != 0) goto L_0x0185
            com.google.assistant.e.j.yp r6 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x0185:
            com.google.protobuf.cq r6 = r6.f138166c
            java.lang.Object r6 = r6.get(r7)
            com.google.assistant.e.j.yn r6 = (com.google.assistant.p3897e.p3921j.C52621yn) r6
            int r6 = r6.f138156a
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0254
            com.google.assistant.e.j.yp r6 = r14.f134892b
            if (r6 != 0) goto L_0x0198
            com.google.assistant.e.j.yp r6 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x0198:
            com.google.protobuf.cq r6 = r6.f138166c
            java.lang.Object r6 = r6.get(r7)
            com.google.assistant.e.j.yn r6 = (com.google.assistant.p3897e.p3921j.C52621yn) r6
            java.lang.String r6 = r6.f138158c
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0254
            com.google.assistant.e.j.yp r6 = r14.f134892b
            if (r6 != 0) goto L_0x01ae
            com.google.assistant.e.j.yp r6 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x01ae:
            com.google.protobuf.cq r6 = r6.f138166c
            java.lang.Object r6 = r6.get(r7)
            com.google.assistant.e.j.yn r6 = (com.google.assistant.p3897e.p3921j.C52621yn) r6
            java.lang.String r6 = r6.f138158c
            java.lang.String r6 = com.google.android.libraries.assistant.p616a.C10989a.m25986b(r6)
            j$.util.Optional r16 = p3186j$.util.Optional.m71637of(r6)
            com.google.assistant.e.j.yp r6 = r14.f134892b
            if (r6 != 0) goto L_0x01c6
            com.google.assistant.e.j.yp r6 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x01c6:
            com.google.protobuf.cq r6 = r6.f138166c
            java.lang.Object r6 = r6.get(r7)
            com.google.assistant.e.j.yn r6 = (com.google.assistant.p3897e.p3921j.C52621yn) r6
            java.lang.String r6 = r6.f138158c
            com.google.android.apps.gsa.speech.c.c r15 = r0.f316934n
            boolean r15 = r15.mo86898a()
            if (r15 == 0) goto L_0x0250
            com.google.android.apps.gsa.search.core.i.t r15 = r0.f316924b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90025cd.f248148f
            boolean r7 = r15.mo79746e(r7)
            if (r7 != 0) goto L_0x01e3
            goto L_0x0250
        L_0x01e3:
            com.google.common.b.gp r7 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.android.apps.gsa.contacts.bz r15 = r0.f316933m
            com.google.android.apps.gsa.contacts.ci r9 = com.google.android.apps.gsa.contacts.ci.a
            r8 = 200(0xc8, float:2.8E-43)
            java.util.List r9 = r15.d(r9, r8)
            com.google.android.apps.gsa.contacts.bz r15 = r0.f316933m
            j$.util.Optional r15 = r15.b()
            j$.util.Optional r9 = m189577n(r9, r15, r6, r5)
            p3186j$.util.Objects.requireNonNull(r7)
            com.google.android.apps.gsa.staticplugins.opa.worker.e.c r15 = new com.google.android.apps.gsa.staticplugins.opa.worker.e.c
            r15.<init>(r7)
            r9.ifPresent(r15)
            com.google.assistant.e.j.e.ep r9 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.CALL
            if (r2 != r9) goto L_0x0229
            com.google.android.apps.gsa.contacts.bz r9 = r0.f316933m
            com.google.android.apps.gsa.contacts.ci r15 = com.google.android.apps.gsa.contacts.ci.b
            java.util.List r8 = r9.d(r15, r8)
            com.google.android.apps.gsa.contacts.bz r9 = r0.f316933m
            j$.util.Optional r9 = r9.b()
            r15 = 2
            j$.util.Optional r6 = m189577n(r8, r9, r6, r15)
            p3186j$.util.Objects.requireNonNull(r7)
            com.google.android.apps.gsa.staticplugins.opa.worker.e.c r8 = new com.google.android.apps.gsa.staticplugins.opa.worker.e.c
            r8.<init>(r7)
            r6.ifPresent(r8)
            goto L_0x024b
        L_0x0229:
            com.google.assistant.e.j.e.ep r9 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.MESSAGE
            if (r2 != r9) goto L_0x024b
            com.google.android.apps.gsa.contacts.bz r9 = r0.f316933m
            com.google.android.apps.gsa.contacts.ci r15 = com.google.android.apps.gsa.contacts.ci.c
            java.util.List r8 = r9.d(r15, r8)
            com.google.android.apps.gsa.contacts.bz r9 = r0.f316933m
            j$.util.Optional r9 = r9.b()
            r15 = 3
            j$.util.Optional r6 = m189577n(r8, r9, r6, r15)
            p3186j$.util.Objects.requireNonNull(r7)
            com.google.android.apps.gsa.staticplugins.opa.worker.e.c r8 = new com.google.android.apps.gsa.staticplugins.opa.worker.e.c
            r8.<init>(r7)
            r6.ifPresent(r8)
        L_0x024b:
            com.google.common.b.gu r15 = r7.mo55394f()
            goto L_0x0254
        L_0x0250:
            com.google.common.b.gu r15 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0254:
            r6 = r16
            com.google.assistant.e.j.yp r7 = r14.f134892b
            if (r7 != 0) goto L_0x025c
            com.google.assistant.e.j.yp r7 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x025c:
            com.google.protobuf.cq r7 = r7.f138169f
            java.util.Iterator r7 = r7.iterator()
        L_0x0262:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x03a4
            java.lang.Object r8 = r7.next()
            com.google.assistant.e.j.yv r8 = (com.google.assistant.p3897e.p3921j.C52629yv) r8
            com.google.protos.f.a.h r9 = com.google.protos.p4985f.p4986a.C64698h.f175368o
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.protos.f.a.f r9 = (com.google.protos.p4985f.p4986a.C64696f) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r5 = r9.instance
            com.google.protos.f.a.h r5 = (com.google.protos.p4985f.p4986a.C64698h) r5
            r19 = r7
            r7 = 1
            r5.f175373d = r7
            r20 = r11
            int r11 = r5.f175370a
            r11 = r11 | r7
            r5.f175370a = r11
            java.lang.String r5 = r8.f138185d
            java.lang.String r5 = com.google.android.libraries.assistant.p616a.C10989a.m25986b(r5)
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.protos.f.a.h r7 = (com.google.protos.p4985f.p4986a.C64698h) r7
            r5.getClass()
            int r11 = r7.f175370a
            r11 = r11 | 16
            r7.f175370a = r11
            r7.f175375f = r5
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f316924b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90025cd.f248149g
            boolean r5 = r5.mo79746e(r7)
            if (r5 == 0) goto L_0x031b
            int r5 = r14.f134893c
            int r5 = com.google.assistant.p3897e.p3921j.adl.m86287a(r5)
            if (r5 != 0) goto L_0x02b4
            r5 = 1
        L_0x02b4:
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.protos.f.a.h r7 = (com.google.protos.p4985f.p4986a.C64698h) r7
            r7.f175380k = r5
            int r5 = r7.f175370a
            r5 = r5 | 512(0x200, float:7.175E-43)
            r7.f175370a = r5
            int r5 = r14.f134894d
            int r5 = com.google.assistant.p3897e.p3921j.adh.m86285a(r5)
            if (r5 != 0) goto L_0x02cc
            r5 = 1
        L_0x02cc:
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.protos.f.a.h r7 = (com.google.protos.p4985f.p4986a.C64698h) r7
            int r5 = r5 + -1
            r7.f175381l = r5
            int r5 = r7.f175370a
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r7.f175370a = r5
            int r5 = r14.f134895e
            int r5 = com.google.assistant.p3897e.p3921j.adj.m86286a(r5)
            if (r5 != 0) goto L_0x02e6
            r5 = 1
        L_0x02e6:
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.protos.f.a.h r7 = (com.google.protos.p4985f.p4986a.C64698h) r7
            int r5 = r5 + -1
            r7.f175382m = r5
            int r5 = r7.f175370a
            r5 = r5 | 2048(0x800, float:2.87E-42)
            r7.f175370a = r5
            com.google.protobuf.cq r5 = r14.f134897g
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x031b
            com.google.protobuf.cq r5 = r14.f134897g
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.protos.f.a.h r7 = (com.google.protos.p4985f.p4986a.C64698h) r7
            com.google.protobuf.cq r11 = r7.f175383n
            boolean r21 = r11.mo58948c()
            if (r21 != 0) goto L_0x0316
            com.google.protobuf.cq r11 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r11)
            r7.f175383n = r11
        L_0x0316:
            com.google.protobuf.cq r7 = r7.f175383n
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r5, (java.util.List) r7)
        L_0x031b:
            boolean r5 = r15.isEmpty()
            if (r5 != 0) goto L_0x033b
            r9.copyOnWrite()
            com.google.protobuf.bv r5 = r9.instance
            com.google.protos.f.a.h r5 = (com.google.protos.p4985f.p4986a.C64698h) r5
            com.google.protobuf.cq r7 = r5.f175379j
            boolean r11 = r7.mo58948c()
            if (r11 != 0) goto L_0x0336
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r5.f175379j = r7
        L_0x0336:
            com.google.protobuf.cq r5 = r5.f175379j
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r15, (java.util.List) r5)
        L_0x033b:
            com.google.common.base.ax r5 = com.google.android.libraries.assistant.p616a.C10989a.m25985a(r8)
            p3186j$.util.Objects.requireNonNull(r9)
            com.google.android.apps.gsa.staticplugins.opa.worker.e.a r7 = new com.google.android.apps.gsa.staticplugins.opa.worker.e.a
            r7.<init>(r9)
            r6.ifPresent(r7)
            boolean r7 = r5.mo56113h()
            if (r7 == 0) goto L_0x0366
            java.lang.Object r5 = r5.mo56107c()
            java.lang.String r5 = (java.lang.String) r5
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.protos.f.a.h r7 = (com.google.protos.p4985f.p4986a.C64698h) r7
            r5.getClass()
            r11 = 9
            r7.f175371b = r11
            r7.f175372c = r5
        L_0x0366:
            int r5 = r12.f137437b
            r7 = 2
            if (r5 != r7) goto L_0x039a
            int r5 = r8.f138182a
            r5 = r5 & r7
            if (r5 == 0) goto L_0x037c
            java.lang.Object r5 = r12.f137438c
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r7 = r8.f138184c
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0397
        L_0x037c:
            int r5 = r8.f138182a
            r7 = 8
            r5 = r5 & r7
            if (r5 == 0) goto L_0x039a
            int r5 = r12.f137437b
            r7 = 2
            if (r5 != r7) goto L_0x038d
            java.lang.Object r5 = r12.f137438c
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x038f
        L_0x038d:
            java.lang.String r5 = ""
        L_0x038f:
            java.lang.String r7 = r8.f138186e
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x039a
        L_0x0397:
            r0.m189578p(r2, r1, r9)
        L_0x039a:
            r13.mo59296a(r9)
            r7 = r19
            r11 = r20
            r5 = 4
            goto L_0x0262
        L_0x03a4:
            r20 = r11
            com.google.assistant.e.j.yp r5 = r14.f134892b
            if (r5 != 0) goto L_0x03ac
            com.google.assistant.e.j.yp r5 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x03ac:
            com.google.assistant.e.j.yt r5 = r5.f138165b
            if (r5 != 0) goto L_0x03b2
            com.google.assistant.e.j.yt r5 = com.google.assistant.p3897e.p3921j.C52627yt.f138176c
        L_0x03b2:
            com.google.protobuf.cq r5 = r5.f138179b
            java.util.Iterator r5 = r5.iterator()
        L_0x03b8:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0495
            java.lang.Object r7 = r5.next()
            com.google.assistant.e.j.yj r7 = (com.google.assistant.p3897e.p3921j.C52617yj) r7
            com.google.protobuf.cq r7 = r7.f138148a
            java.util.Iterator r7 = r7.iterator()
        L_0x03ca:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x03b8
            java.lang.Object r8 = r7.next()
            com.google.assistant.e.j.yz r8 = (com.google.assistant.p3897e.p3921j.C52633yz) r8
            com.google.protos.f.a.h r9 = com.google.protos.p4985f.p4986a.C64698h.f175368o
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.protos.f.a.f r9 = (com.google.protos.p4985f.p4986a.C64696f) r9
            com.google.assistant.e.j.yf r11 = r8.f138197d
            if (r11 != 0) goto L_0x03e4
            com.google.assistant.e.j.yf r11 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x03e4:
            java.lang.String r11 = r11.f138141b
            java.lang.String r11 = com.google.android.libraries.assistant.p616a.C10989a.m25986b(r11)
            r9.copyOnWrite()
            com.google.protobuf.bv r14 = r9.instance
            com.google.protos.f.a.h r14 = (com.google.protos.p4985f.p4986a.C64698h) r14
            r11.getClass()
            r15 = 8
            r14.f175371b = r15
            r14.f175372c = r11
            com.google.assistant.e.f.b r11 = com.google.assistant.p3897e.p3912f.C51207b.f133303d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.f.a r11 = (com.google.assistant.p3897e.p3912f.C51206a) r11
            com.google.assistant.e.j.yf r14 = r8.f138197d
            if (r14 != 0) goto L_0x0408
            com.google.assistant.e.j.yf r14 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x0408:
            java.lang.String r14 = r14.f138142c
            r11.copyOnWrite()
            com.google.protobuf.bv r15 = r11.instance
            com.google.assistant.e.f.b r15 = (com.google.assistant.p3897e.p3912f.C51207b) r15
            r14.getClass()
            r19 = r5
            int r5 = r15.f133305a
            r17 = 1
            r5 = r5 | 1
            r15.f133305a = r5
            r15.f133306b = r14
            java.lang.String r5 = r8.f138195b
            r11.copyOnWrite()
            com.google.protobuf.bv r14 = r11.instance
            com.google.assistant.e.f.b r14 = (com.google.assistant.p3897e.p3912f.C51207b) r14
            r5.getClass()
            int r15 = r14.f133305a
            r18 = 2
            r15 = r15 | 2
            r14.f133305a = r15
            r14.f133307c = r5
            r9.copyOnWrite()
            com.google.protobuf.bv r5 = r9.instance
            com.google.protos.f.a.h r5 = (com.google.protos.p4985f.p4986a.C64698h) r5
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.e.f.b r11 = (com.google.assistant.p3897e.p3912f.C51207b) r11
            r11.getClass()
            r5.f175377h = r11
            int r11 = r5.f175370a
            r11 = r11 | 128(0x80, float:1.794E-43)
            r5.f175370a = r11
            r9.copyOnWrite()
            com.google.protobuf.bv r5 = r9.instance
            com.google.protos.f.a.h r5 = (com.google.protos.p4985f.p4986a.C64698h) r5
            r11 = 1
            r5.f175373d = r11
            int r14 = r5.f175370a
            r14 = r14 | r11
            r5.f175370a = r14
            p3186j$.util.Objects.requireNonNull(r9)
            com.google.android.apps.gsa.staticplugins.opa.worker.e.a r5 = new com.google.android.apps.gsa.staticplugins.opa.worker.e.a
            r5.<init>(r9)
            r6.ifPresent(r5)
            com.google.assistant.e.j.yf r5 = r8.f138197d
            if (r5 != 0) goto L_0x046f
            com.google.assistant.e.j.yf r8 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
            goto L_0x0470
        L_0x046f:
            r8 = r5
        L_0x0470:
            int r8 = r8.f138140a
            r11 = 1
            r8 = r8 & r11
            if (r8 == 0) goto L_0x048e
            int r8 = r12.f137437b
            r11 = 6
            if (r8 != r11) goto L_0x048e
            java.lang.Object r8 = r12.f137438c
            java.lang.String r8 = (java.lang.String) r8
            if (r5 != 0) goto L_0x0483
            com.google.assistant.e.j.yf r5 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x0483:
            java.lang.String r5 = r5.f138141b
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x048e
            r0.m189578p(r2, r1, r9)
        L_0x048e:
            r13.mo59296a(r9)
            r5 = r19
            goto L_0x03ca
        L_0x0495:
            r11 = r20
            r5 = 4
            r6 = 8
            r7 = 0
            r8 = 2
            r9 = 1
            goto L_0x0157
        L_0x049f:
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.protos.f.a.e r5 = (com.google.protos.p4985f.p4986a.C64695e) r5
            com.google.protobuf.bv r6 = r13.build()
            com.google.protos.f.a.j r6 = (com.google.protos.p4985f.p4986a.C64700j) r6
            r6.getClass()
            com.google.protobuf.cq r7 = r5.f175366f
            boolean r8 = r7.mo58948c()
            if (r8 != 0) goto L_0x04bd
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r5.f175366f = r7
        L_0x04bd:
            com.google.protobuf.cq r5 = r5.f175366f
            r5.add(r6)
            com.google.protobuf.bv r5 = r10.build()
            com.google.protos.f.a.e r5 = (com.google.protos.p4985f.p4986a.C64695e) r5
            com.google.protos.p.b.az r6 = com.google.protos.p5129p.p5131b.C65768az.f178793f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.protos.p.b.ay r6 = (com.google.protos.p5129p.p5131b.C65767ay) r6
            java.lang.Object r7 = r4.get()
            com.google.protos.f.q.d.a.d r7 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d) r7
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.protos.p.b.az r8 = (com.google.protos.p5129p.p5131b.C65768az) r8
            r7.getClass()
            r8.f178796b = r7
            int r7 = r8.f178795a
            r9 = 1
            r7 = r7 | r9
            r8.f178795a = r7
            java.lang.Object r4 = r4.get()
            com.google.protos.f.q.d.a.d r4 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d) r4
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.protos.p.b.az r7 = (com.google.protos.p5129p.p5131b.C65768az) r7
            r4.getClass()
            r7.f178797c = r4
            int r4 = r7.f178795a
            r8 = 2
            r4 = r4 | r8
            r7.f178795a = r4
            com.google.protobuf.h r4 = com.google.protobuf.C63070h.f170215c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.protobuf.g r4 = (com.google.protobuf.C63062g) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.protobuf.h r7 = (com.google.protobuf.C63070h) r7
            java.lang.String r8 = "type.googleapis.com/assistant.action_user_model.ActionInteractionEvent"
            r7.f170217a = r8
            com.google.protobuf.z r5 = r5.toByteString()
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.protobuf.h r7 = (com.google.protobuf.C63070h) r7
            r5.getClass()
            r7.f170218b = r5
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.protos.p.b.az r5 = (com.google.protos.p5129p.p5131b.C65768az) r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.protobuf.h r4 = (com.google.protobuf.C63070h) r4
            r4.getClass()
            r5.f178799e = r4
            int r4 = r5.f178795a
            r7 = 8
            r4 = r4 | r7
            r5.f178795a = r4
            com.google.protobuf.bv r4 = r6.build()
            com.google.protos.p.b.az r4 = (com.google.protos.p5129p.p5131b.C65768az) r4
            com.google.android.apps.gsa.n.g.u r5 = r0.f316930j
            com.google.protos.p.b.ak r6 = com.google.protos.p5129p.p5131b.C65753ak.ASSISTANT_ACTION_INTERACTION_EVENT
            r7 = 0
            r5.d(r3, r6, r4, r7)
        L_0x054a:
            int r4 = r1.f133894f
            com.google.assistant.e.i.a.gi r4 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r4)
            if (r4 != 0) goto L_0x0554
            com.google.assistant.e.i.a.gi r4 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x0554:
            com.google.assistant.e.i.a.gi r5 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.FULFILLMENT
            if (r4 == r5) goto L_0x0567
            com.google.assistant.e.i.a.gi r5 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CANCEL
            if (r4 != r5) goto L_0x055d
            goto L_0x0567
        L_0x055d:
            r4.name()
            com.google.android.apps.gsa.x.c r1 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r1
        L_0x0567:
            com.google.android.apps.gsa.search.core.i.t r5 = r0.f316924b
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90025cd.f248146d
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x05b5
            com.google.assistant.e.i.a.fx r5 = r1.f133904p
            if (r5 != 0) goto L_0x0577
            com.google.assistant.e.i.a.fx r5 = com.google.assistant.p3897e.p3917i.p3918a.C51389fx.f133834c
        L_0x0577:
            int r6 = r5.f133836a
            r7 = 1
            r6 = r6 & r7
            if (r6 == 0) goto L_0x05a3
            com.google.assistant.e.j.e.ep r6 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.DEFAULT
            int r5 = r5.f133837b
            int r17 = com.google.assistant.p3897e.p3921j.C52275ls.m86561a(r5)
            if (r17 != 0) goto L_0x0589
            r17 = 1
        L_0x0589:
            int r5 = r17 + -1
            if (r5 == r7) goto L_0x059c
            r6 = 2
            if (r5 == r6) goto L_0x0595
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            goto L_0x05bb
        L_0x0595:
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.ACTION_HISTORY_EPHEMERAL
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
            goto L_0x05bb
        L_0x059c:
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.ACTION_HISTORY
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
            goto L_0x05bb
        L_0x05a3:
            com.google.common.f.e r5 = f316923a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r6 = "corpus_type is not found in the ActionUserModelConfig."
            r7 = 28928(0x7100, float:4.0537E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            goto L_0x05bb
        L_0x05b5:
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.ACTION_HISTORY
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
        L_0x05bb:
            r5.isEmpty()
            java.lang.Object r5 = r5.get()
            com.google.protos.p.b.ak r5 = (com.google.protos.p5129p.p5131b.C65753ak) r5
            com.google.android.libraries.gsa.k.g r6 = r0.f316926f
            com.google.android.apps.gsa.n.g.u r7 = r0.f316930j
            com.google.assistant.e.j.pn r8 = r1.f133895g
            if (r8 != 0) goto L_0x05ce
            com.google.assistant.e.j.pn r8 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x05ce:
            com.google.android.apps.gsa.contacts.y r9 = r0.f316932l
            java.util.List r9 = r9.mo70798a()
            java.util.Iterator r9 = r9.iterator()
        L_0x05d8:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x05ee
            java.lang.Object r10 = r9.next()
            android.accounts.Account r10 = (android.accounts.Account) r10
            java.lang.String r10 = r10.name
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L_0x05d8
        L_0x05ec:
            r8 = 1
            goto L_0x063d
        L_0x05ee:
            java.lang.String r9 = r8.f137454i
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x05f8
        L_0x05f6:
            r8 = 0
            goto L_0x063d
        L_0x05f8:
            com.google.assistant.e.j.ade r9 = r8.f137449d
            if (r9 != 0) goto L_0x05fe
            com.google.assistant.e.j.ade r9 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x05fe:
            com.google.protobuf.cq r9 = r9.f134885g
            java.util.Iterator r9 = r9.iterator()
        L_0x0604:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x05f6
            java.lang.Object r10 = r9.next()
            com.google.assistant.e.j.adm r10 = (com.google.assistant.p3897e.p3921j.adm) r10
            int r11 = r10.f134891a
            r12 = 1
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0604
            com.google.assistant.e.j.g r11 = r10.f134896f
            if (r11 != 0) goto L_0x061c
            com.google.assistant.e.j.g r11 = com.google.assistant.p3897e.p3921j.C52121g.f136775b
        L_0x061c:
            com.google.assistant.e.j.f r11 = r11.f136777a
            if (r11 != 0) goto L_0x0622
            com.google.assistant.e.j.f r11 = com.google.assistant.p3897e.p3921j.C52094f.f136713c
        L_0x0622:
            boolean r11 = r11.f136716b
            if (r11 == 0) goto L_0x0604
            com.google.assistant.e.j.g r10 = r10.f134896f
            if (r10 != 0) goto L_0x062c
            com.google.assistant.e.j.g r10 = com.google.assistant.p3897e.p3921j.C52121g.f136775b
        L_0x062c:
            com.google.assistant.e.j.f r10 = r10.f136777a
            if (r10 != 0) goto L_0x0632
            com.google.assistant.e.j.f r10 = com.google.assistant.p3897e.p3921j.C52094f.f136713c
        L_0x0632:
            java.lang.String r10 = r10.f136715a
            java.lang.String r11 = r8.f137454i
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0604
            goto L_0x05ec
        L_0x063d:
            com.google.bj.c.e.d r9 = com.google.p4184bj.p4193c.p4200e.C55996d.f149115h
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.bj.c.e.c r9 = (com.google.p4184bj.p4193c.p4200e.C55995c) r9
            com.google.assistant.e.j.pn r10 = r1.f133895g
            if (r10 != 0) goto L_0x064b
            com.google.assistant.e.j.pn r10 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x064b:
            j$.util.Optional r10 = m189570g(r10, r8)
            p3186j$.util.Objects.requireNonNull(r9)
            com.google.android.apps.gsa.staticplugins.opa.worker.e.f r11 = new com.google.android.apps.gsa.staticplugins.opa.worker.e.f
            r11.<init>(r9)
            r10.ifPresent(r11)
            boolean r11 = r10.isPresent()
            if (r11 == 0) goto L_0x0677
            com.google.android.apps.gsa.search.core.i.t r11 = r0.f316924b
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90025cd.f248147e
            boolean r11 = r11.mo79746e(r12)
            if (r11 == 0) goto L_0x0677
            java.lang.Object r10 = r10.get()
            com.google.assistant.e.f.o r10 = (com.google.assistant.p3897e.p3912f.C51220o) r10
            com.google.assistant.e.f.o r10 = com.google.android.libraries.gsa.actionusermodel.C22063au.m41298a(r10)
            r9.mo54309b(r10)
        L_0x0677:
            j$.util.Optional r10 = r0.m189574k(r1, r2)
            p3186j$.util.Objects.requireNonNull(r9)
            com.google.android.apps.gsa.staticplugins.opa.worker.e.g r11 = new com.google.android.apps.gsa.staticplugins.opa.worker.e.g
            r11.<init>(r9)
            r10.ifPresent(r11)
            com.google.assistant.e.j.pn r1 = r1.f133895g
            if (r1 != 0) goto L_0x068c
            com.google.assistant.e.j.pn r1 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x068c:
            j$.util.Optional r1 = m189575l(r1)
            p3186j$.util.Objects.requireNonNull(r9)
            com.google.android.apps.gsa.staticplugins.opa.worker.e.h r10 = new com.google.android.apps.gsa.staticplugins.opa.worker.e.h
            r10.<init>(r9)
            r1.ifPresent(r10)
            com.google.bj.c.e.b r1 = com.google.p4184bj.p4193c.p4200e.C55994b.f149106h
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.bj.c.e.a r1 = (com.google.p4184bj.p4193c.p4200e.C55993a) r1
            com.google.bb.a.x r2 = m189568e(r25)
            int r2 = r2.f146230cP
            r1.copyOnWrite()
            com.google.protobuf.bv r10 = r1.instance
            com.google.bj.c.e.b r10 = (com.google.p4184bj.p4193c.p4200e.C55994b) r10
            int r11 = r10.f149108a
            r12 = 2
            r11 = r11 | r12
            r10.f149108a = r11
            r10.f149110c = r2
            com.google.bj.c.e.f r2 = m189569f(r4)
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.bj.c.e.b r4 = (com.google.p4184bj.p4193c.p4200e.C55994b) r4
            int r2 = r2.f149132g
            r4.f149111d = r2
            int r2 = r4.f149108a
            r10 = 8
            r2 = r2 | r10
            r4.f149108a = r2
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.c.e.b r2 = (com.google.p4184bj.p4193c.p4200e.C55994b) r2
            com.google.protobuf.bv r4 = r9.build()
            com.google.bj.c.e.d r4 = (com.google.p4184bj.p4193c.p4200e.C55996d) r4
            r4.getClass()
            r2.f149112e = r4
            int r4 = r2.f149108a
            r4 = r4 | 16
            r2.f149108a = r4
            com.google.assistant.e.j.rm r2 = com.google.assistant.p3897e.p3921j.C52431rm.OPA_AGSA
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.bj.c.e.b r4 = (com.google.p4184bj.p4193c.p4200e.C55994b) r4
            int r2 = r2.f137633ah
            r4.f149113f = r2
            int r2 = r4.f149108a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r4.f149108a = r2
            if (r8 == 0) goto L_0x070c
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bj.c.e.b r2 = (com.google.p4184bj.p4193c.p4200e.C55994b) r2
            int r4 = r2.f149108a
            r4 = r4 | 1024(0x400, float:1.435E-42)
            r2.f149108a = r4
            r4 = 1
            r2.f149114g = r4
            goto L_0x070d
        L_0x070c:
            r4 = 1
        L_0x070d:
            com.google.android.apps.gsa.search.core.i.b r2 = r0.f316929i
            if (r2 == 0) goto L_0x0727
            java.lang.String r2 = r2.mo79727b()
            java.lang.String r2 = com.google.common.base.C58837ba.m90858g(r2)
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.bj.c.e.b r8 = (com.google.p4184bj.p4193c.p4200e.C55994b) r8
            int r9 = r8.f149108a
            r9 = r9 | r4
            r8.f149108a = r9
            r8.f149109b = r2
        L_0x0727:
            com.google.android.libraries.f.a r2 = r0.f316927g
            long r8 = r2.mo26870b()
            com.google.protos.f.a.ai r2 = com.google.protos.p4985f.p4986a.C64655ai.f175254d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protos.f.a.ah r2 = (com.google.protos.p4985f.p4986a.C64654ah) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.protos.f.a.ai r4 = (com.google.protos.p4985f.p4986a.C64655ai) r4
            com.google.protobuf.bv r1 = r1.build()
            com.google.bj.c.e.b r1 = (com.google.p4184bj.p4193c.p4200e.C55994b) r1
            r1.getClass()
            r4.f175257b = r1
            int r1 = r4.f175256a
            r10 = 1
            r1 = r1 | r10
            r4.f175256a = r1
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r10 = r1.toMicros(r8)
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.protos.f.a.ai r1 = (com.google.protos.p4985f.p4986a.C64655ai) r1
            int r4 = r1.f175256a
            r12 = 2
            r4 = r4 | r12
            r1.f175256a = r4
            r1.f175258c = r10
            com.google.protobuf.bv r1 = r2.build()
            com.google.protos.f.a.ai r1 = (com.google.protos.p4985f.p4986a.C64655ai) r1
            com.google.protos.p.b.az r2 = com.google.protos.p5129p.p5131b.C65768az.f178793f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protos.p.b.ay r2 = (com.google.protos.p5129p.p5131b.C65767ay) r2
            com.google.protos.f.q.d.a.d r4 = com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d.f176307e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.protos.f.q.d.a.c r4 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c) r4
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r8 = r10.toMicros(r8)
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.protos.f.q.d.a.d r10 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d) r10
            int r11 = r10.f176309a
            r12 = 1
            r11 = r11 | r12
            r10.f176309a = r11
            r10.f176310b = r8
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.protos.f.q.d.a.d r8 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d) r8
            int r9 = r8.f176309a
            r10 = 2
            r9 = r9 | r10
            r8.f176309a = r9
            r9 = 0
            r8.f176311c = r9
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.protos.f.q.d.a.d r8 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d) r8
            int r10 = r8.f176309a
            r11 = 4
            r10 = r10 | r11
            r8.f176309a = r10
            r8.f176312d = r9
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.protos.p.b.az r8 = (com.google.protos.p5129p.p5131b.C65768az) r8
            com.google.protobuf.bv r4 = r4.build()
            com.google.protos.f.q.d.a.d r4 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d) r4
            r4.getClass()
            r8.f178796b = r4
            int r4 = r8.f178795a
            r9 = 1
            r4 = r4 | r9
            r8.f178795a = r4
            com.google.protobuf.h r4 = com.google.protobuf.C63070h.f170215c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.protobuf.g r4 = (com.google.protobuf.C63062g) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.protobuf.h r8 = (com.google.protobuf.C63070h) r8
            java.lang.String r9 = "type.googleapis.com/assistant.action_user_model.AssistantActionHistoryData"
            r8.f170217a = r9
            com.google.protobuf.z r1 = r1.toByteString()
            r4.copyOnWrite()
            com.google.protobuf.bv r8 = r4.instance
            com.google.protobuf.h r8 = (com.google.protobuf.C63070h) r8
            r1.getClass()
            r8.f170218b = r1
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.protos.p.b.az r1 = (com.google.protos.p5129p.p5131b.C65768az) r1
            com.google.protobuf.bv r4 = r4.build()
            com.google.protobuf.h r4 = (com.google.protobuf.C63070h) r4
            r4.getClass()
            r1.f178799e = r4
            int r4 = r1.f178795a
            r8 = 8
            r4 = r4 | r8
            r1.f178795a = r4
            j$.util.Optional r1 = m189571h(r23)
            boolean r4 = r1.isPresent()
            if (r4 == 0) goto L_0x083a
            java.lang.Object r4 = r1.get()
            com.google.protos.f.q.d.a.d r4 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d) r4
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.protos.p.b.az r8 = (com.google.protos.p5129p.p5131b.C65768az) r8
            r4.getClass()
            r8.f178796b = r4
            int r4 = r8.f178795a
            r9 = 1
            r4 = r4 | r9
            r8.f178795a = r4
            java.lang.Object r1 = r1.get()
            com.google.protos.f.q.d.a.d r1 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d) r1
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.protos.p.b.az r4 = (com.google.protos.p5129p.p5131b.C65768az) r4
            r1.getClass()
            r4.f178797c = r1
            int r1 = r4.f178795a
            r8 = 2
            r1 = r1 | r8
            r4.f178795a = r1
        L_0x083a:
            com.google.protobuf.bv r1 = r2.build()
            com.google.protos.p.b.az r1 = (com.google.protos.p5129p.p5131b.C65768az) r1
            r2 = 0
            com.google.common.util.concurrent.cx r1 = r7.d(r3, r5, r1, r2)
            com.google.android.apps.gsa.staticplugins.opa.worker.e.i r2 = new com.google.android.apps.gsa.staticplugins.opa.worker.e.i
            r2.<init>(r0, r5)
            java.lang.String r3 = "logActionCompletion#writeResponse"
            com.google.common.util.concurrent.cx r1 = r6.mo28209i(r1, r3, r2)
            java.lang.Class<java.lang.Exception> r2 = java.lang.Exception.class
            com.google.android.apps.gsa.staticplugins.opa.worker.e.j r3 = com.google.android.apps.gsa.staticplugins.opa.worker.p8610e.C114292j.f316921a
            com.google.common.base.ah r3 = com.google.apps.tiktok.tracing.C47810es.m84963c(r3)
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60846c.m92878g(r1, r2, r3, r4)
            return r1
        L_0x085f:
            com.google.android.apps.gsa.x.c r1 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r1
        L_0x0866:
            com.google.android.apps.gsa.x.c r1 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.p8610e.C114294l.mo78597a(java.lang.String, com.google.assistant.e.i.a.gn, com.google.assistant.e.j.e.ep):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo78598b(C52091ex exVar) {
        Optional optional;
        if (!this.f316924b.mo79746e(C90014bt.f247255dh)) {
            return C60856cj.m92900i(C118826c.f331422a);
        }
        C58833ax d = C11210e.m26592d(exVar);
        C58833ax e = C11210e.m26593e(exVar);
        if (!d.mo56113h() && !e.mo56113h()) {
            return C60856cj.m92900i(C118826c.f331422a);
        }
        C58833ax f = C11210e.m26594f(exVar);
        if (!f.mo56113h()) {
            ((C59052c) ((C59052c) f316923a.mo56225c()).mo56372aa(28927)).mo56386p("#maybeLogFluidActionsEvents: Missing RequestLoggingParams");
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(((C51536li) f.mo56107c()).f134320c);
        }
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) f316923a.mo56225c()).mo56372aa(28919)).mo56386p("#maybeLogFluidActionsEvents: Missing RequestLoggingParams");
            return C60856cj.m92900i(C118826c.f331422a);
        } else if (d.mo56113h() && (((C51254ax) d.mo56107c()).f133436a & 1) != 0) {
            C51406gn gnVar = ((C51254ax) d.mo56107c()).f133437b;
            if (gnVar == null) {
                gnVar = C51406gn.f133887s;
            }
            if (m189576m(gnVar)) {
                return C60856cj.m92900i(C118826c.f331422a);
            }
            return mo78597a((String) optional.get(), m189567c(gnVar, C51401gi.CANCEL), C51936ep.CALL);
        } else if (!e.mo56113h() || (((C51460in) e.mo56107c()).f134054a & 1) == 0) {
            return C60856cj.m92900i(C118826c.f331422a);
        } else {
            C51406gn gnVar2 = ((C51460in) e.mo56107c()).f134055b;
            if (gnVar2 == null) {
                gnVar2 = C51406gn.f133887s;
            }
            if (m189576m(gnVar2)) {
                return C60856cj.m92900i(C118826c.f331422a);
            }
            return mo78597a((String) optional.get(), m189567c(gnVar2, C51401gi.CANCEL), C51936ep.MESSAGE);
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
