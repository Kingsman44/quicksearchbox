package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.search.assistant.proactive.C36201a;
import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.p3717aq.p3718a.p3719a.C47887u;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ah */
/* compiled from: PG */
public final /* synthetic */ class C114386ah implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C114388aj f317161a;

    /* renamed from: b */
    public final /* synthetic */ aas f317162b;

    /* renamed from: c */
    public final /* synthetic */ C36334o f317163c;

    /* renamed from: d */
    public final /* synthetic */ C47887u f317164d;

    /* renamed from: e */
    public final /* synthetic */ abc f317165e;

    /* renamed from: f */
    public final /* synthetic */ int f317166f;

    /* renamed from: g */
    public final /* synthetic */ C36201a f317167g;

    public /* synthetic */ C114386ah(C114388aj ajVar, aas aas, C36334o oVar, C47887u uVar, abc abc, int i, C36201a aVar) {
        this.f317161a = ajVar;
        this.f317162b = aas;
        this.f317163c = oVar;
        this.f317164d = uVar;
        this.f317165e = abc;
        this.f317166f = i;
        this.f317167g = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012f, code lost:
        if (r14.f123938a == 2) goto L_0x0131;
     */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03f1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r28 = this;
            r0 = r28
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.aj r1 = r0.f317161a
            com.google.assistant.e.j.aas r2 = r0.f317162b
            com.google.android.libraries.search.assistant.proactive.o r3 = r0.f317163c
            com.google.aq.a.a.u r4 = r0.f317164d
            com.google.assistant.e.j.abc r5 = r0.f317165e
            int r6 = r0.f317166f
            com.google.android.libraries.search.assistant.proactive.a r7 = r0.f317167g
            androidx.core.app.z r8 = r1.mo101309b(r2, r3)
            int r9 = r4.f123978a
            java.lang.String r10 = ""
            r11 = 1
            if (r9 != r11) goto L_0x0020
            java.lang.Object r9 = r4.f123979b
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0021
        L_0x0020:
            r9 = r10
        L_0x0021:
            java.lang.CharSequence r9 = androidx.core.app.C1839z.m5037c(r9)
            r8.f5685e = r9
            int r9 = r4.f123980c
            r12 = 7
            if (r9 != r12) goto L_0x0031
            java.lang.Object r9 = r4.f123981d
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0032
        L_0x0031:
            r9 = r10
        L_0x0032:
            java.lang.CharSequence r9 = androidx.core.app.C1839z.m5037c(r9)
            r8.f5686f = r9
            int r9 = r3.f94889c
            r12 = -1
            if (r9 != r11) goto L_0x0040
            r8.mo5019h(r12)
        L_0x0040:
            com.google.aq.a.a.b r9 = r4.f123984g
            if (r9 != 0) goto L_0x0046
            com.google.aq.a.a.b r9 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x0046:
            boolean r9 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114388aj.m189693d(r9, r5)
            r13 = 0
            if (r9 == 0) goto L_0x0052
            r9 = 16
            r8.mo5015d(r9, r13)
        L_0x0052:
            com.google.android.libraries.search.assistant.proactive.aa r9 = r1.f317180f
            boolean r9 = r9.f94592j
            r14 = 2
            if (r9 == 0) goto L_0x0067
            int r9 = r5.f134707n
            int r9 = com.google.assistant.p3897e.p3921j.aaw.m86271a(r9)
            if (r9 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            if (r9 != r14) goto L_0x0067
            r8.mo5015d(r14, r11)
        L_0x0067:
            r9 = 0
        L_0x0068:
            com.google.protobuf.cq r15 = r4.f123986i
            int r15 = r15.size()
            if (r9 >= r15) goto L_0x01d0
            com.google.protobuf.cq r15 = r4.f123986i
            java.lang.Object r15 = r15.get(r9)
            com.google.aq.a.a.i r15 = (com.google.p3717aq.p3718a.p3719a.C47875i) r15
            com.google.android.libraries.search.assistant.proactive.j.c r12 = new com.google.android.libraries.search.assistant.proactive.j.c
            android.content.Context r13 = r1.f317176b
            r12.<init>(r13)
            com.google.protobuf.z r13 = r2.f134669g
            byte[] r13 = r13.mo59174N()
            r12.f94841a = r13
            r12.f94851k = r6
            java.lang.String r13 = r2.f134670h
            r12.f94844d = r13
            java.lang.String r13 = r2.f134671i
            r12.mo40108d(r13)
            r12.f94852l = r9
            com.google.aq.a.a.b r13 = r15.f123950d
            if (r13 != 0) goto L_0x009a
            com.google.aq.a.a.b r13 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x009a:
            boolean r13 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114388aj.m189693d(r13, r5)
            r12.f94849i = r13
            int r13 = r15.f123951e
            int r13 = com.google.p3717aq.p3718a.p3719a.C47874h.m85092b(r13)
            if (r13 != 0) goto L_0x00a9
            r13 = 1
        L_0x00a9:
            r12.f94854n = r13
            r16 = r15
            long r14 = r2.f134666d
            j$.time.Instant r14 = p3186j$.time.Instant.ofEpochMilli(r14)
            r12.f94842b = r14
            com.google.common.o.ajz r14 = r7.f94576c
            com.google.protobuf.bn r14 = r14.toBuilder()
            com.google.common.o.ajw r14 = (com.google.common.p4552o.ajw) r14
            r14.copyOnWrite()
            com.google.protobuf.bv r15 = r14.instance
            com.google.common.o.ajz r15 = (com.google.common.p4552o.ajz) r15
            int r13 = r15.f158932a
            r17 = 2
            r13 = r13 | 2
            r15.f158932a = r13
            r15.f158934c = r9
            com.google.protobuf.bv r13 = r14.build()
            com.google.common.o.ajz r13 = (com.google.common.p4552o.ajz) r13
            r12.f94847g = r13
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 31
            if (r13 < r14) goto L_0x00e4
            com.google.android.libraries.search.assistant.proactive.aa r13 = r1.f317180f
            boolean r13 = r13.f94591i
            if (r13 == 0) goto L_0x00e4
            r13 = 1
            goto L_0x00e5
        L_0x00e4:
            r13 = 0
        L_0x00e5:
            r12.f94853m = r13
            com.google.assistant.e.j.aap r13 = r2.f134676n
            if (r13 != 0) goto L_0x00ed
            com.google.assistant.e.j.aap r13 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x00ed:
            int r13 = r13.f134658g
            int r13 = com.google.assistant.p3897e.p3921j.aao.m86268a(r13)
            if (r13 != 0) goto L_0x00f7
        L_0x00f5:
            r14 = 0
            goto L_0x00fb
        L_0x00f7:
            r14 = 2
            if (r13 != r14) goto L_0x00f5
            r14 = 1
        L_0x00fb:
            r12.f94850j = r14
            com.google.android.libraries.logging.k r14 = r7.f94574a
            if (r14 == 0) goto L_0x010c
            int r15 = r9 + 1
            java.lang.String r14 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64608d(r14, r15)
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.f94845e = r14
            goto L_0x0116
        L_0x010c:
            com.google.android.libraries.logging.ve.synthetic.remote.ParcelableSyntheticTree r14 = r7.f94575b
            if (r14 == 0) goto L_0x0116
            java.lang.String r14 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64609e(r14)
            r12.f94845e = r14
        L_0x0116:
            r15 = r16
            com.google.aq.a.a.b r14 = r15.f123950d
            if (r14 != 0) goto L_0x011e
            com.google.aq.a.a.b r14 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x011e:
            com.google.protobuf.cq r14 = r14.f123940c
            int r14 = r14.size()
            if (r14 > 0) goto L_0x0131
            com.google.aq.a.a.b r14 = r15.f123950d
            if (r14 != 0) goto L_0x012c
            com.google.aq.a.a.b r14 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x012c:
            int r14 = r14.f123938a
            r13 = 2
            if (r14 != r13) goto L_0x0158
        L_0x0131:
            com.google.aq.a.a.b r14 = r15.f123950d
            if (r14 != 0) goto L_0x0137
            com.google.aq.a.a.b r14 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x0137:
            android.content.Intent r14 = r1.mo101308a(r14)
            if (r14 != 0) goto L_0x014c
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114388aj.f317173a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r14 = "Unable to resolve intent for button %d"
            r15 = 28987(0x713b, float:4.062E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r15)).mo56387q(r14, r9)
            goto L_0x01c9
        L_0x014c:
            r12.f94843c = r14
            com.google.aq.a.a.b r14 = r15.f123950d
            if (r14 != 0) goto L_0x0154
            com.google.aq.a.a.b r14 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x0154:
            boolean r14 = r14.f123941d
            r12.f94848h = r14
        L_0x0158:
            int r14 = r15.f123951e
            int r14 = com.google.p3717aq.p3718a.p3719a.C47874h.m85092b(r14)
            if (r14 != 0) goto L_0x0161
            goto L_0x0170
        L_0x0161:
            r13 = 4
            if (r14 != r13) goto L_0x0170
            java.lang.String r13 = r5.f134704k
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L_0x0170
            java.lang.String r13 = r5.f134704k
            r12.f94846f = r13
        L_0x0170:
            int r13 = r15.f123951e
            int r13 = com.google.p3717aq.p3718a.p3719a.C47874h.m85092b(r13)
            if (r13 != 0) goto L_0x0179
            goto L_0x01ae
        L_0x0179:
            r14 = 5
            if (r13 != r14) goto L_0x01ae
            androidx.core.app.r r12 = new androidx.core.app.r
            int r13 = r15.f123947a
            if (r13 != r11) goto L_0x0187
            java.lang.Object r13 = r15.f123948b
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x0188
        L_0x0187:
            r13 = r10
        L_0x0188:
            r14 = 0
            r15 = 0
            r12.<init>(r15, r13, r14)
            java.util.HashSet r19 = new java.util.HashSet
            r19.<init>()
            android.os.Bundle r20 = new android.os.Bundle
            r20.<init>()
            java.lang.String r18 = "remote_input_key"
            r21 = 0
            r22 = 0
            r23 = 1
            androidx.core.app.ba r13 = androidx.core.app.C1809az.m4976a(r18, r19, r20, r21, r22, r23)
            r12.mo5009b(r13)
            androidx.core.app.s r12 = r12.mo5008a()
            r8.mo5017f(r12)
            goto L_0x01c9
        L_0x01ae:
            androidx.core.app.r r13 = new androidx.core.app.r
            int r14 = r15.f123947a
            if (r14 != r11) goto L_0x01b9
            java.lang.Object r14 = r15.f123948b
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x01ba
        L_0x01b9:
            r14 = r10
        L_0x01ba:
            android.app.PendingIntent r12 = r12.mo40105a()
            r15 = 0
            r13.<init>(r15, r14, r12)
            androidx.core.app.s r12 = r13.mo5008a()
            r8.mo5017f(r12)
        L_0x01c9:
            int r9 = r9 + 1
            r12 = -1
            r13 = 0
            r14 = 2
            goto L_0x0068
        L_0x01d0:
            com.google.android.libraries.search.assistant.proactive.j.c r6 = new com.google.android.libraries.search.assistant.proactive.j.c
            android.content.Context r9 = r1.f317176b
            r6.<init>(r9)
            int r9 = r2.f134663a
            r12 = 262144(0x40000, float:3.67342E-40)
            r9 = r9 & r12
            if (r9 == 0) goto L_0x01e9
            com.google.assistant.ag.a.ah r9 = r2.f134680r
            if (r9 != 0) goto L_0x01e4
            com.google.assistant.ag.a.ah r9 = com.google.assistant.p3803ag.p3804a.C48800ah.f126269b
        L_0x01e4:
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r9)
            goto L_0x01eb
        L_0x01e9:
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a
        L_0x01eb:
            com.google.aq.a.a.b r12 = r4.f123984g
            if (r12 != 0) goto L_0x01f1
            com.google.aq.a.a.b r12 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x01f1:
            com.google.protobuf.cq r12 = r12.f123940c
            int r12 = r12.size()
            if (r12 > 0) goto L_0x025d
            com.google.aq.a.a.b r12 = r4.f123984g
            if (r12 != 0) goto L_0x01ff
            com.google.aq.a.a.b r12 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x01ff:
            int r12 = r12.f123938a
            r13 = 2
            if (r12 != r13) goto L_0x0205
            goto L_0x025d
        L_0x0205:
            com.google.protobuf.z r12 = r2.f134669g
            byte[] r12 = r12.mo59174N()
            r6.f94841a = r12
            java.lang.String r12 = r2.f134670h
            r6.f94844d = r12
            com.google.common.o.ajz r12 = r7.f94576c
            r6.f94847g = r12
            r6.mo40107c(r9)
            com.google.aq.a.a.b r4 = r4.f123984g
            if (r4 != 0) goto L_0x021e
            com.google.aq.a.a.b r4 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x021e:
            boolean r4 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114388aj.m189693d(r4, r5)
            r6.f94849i = r4
            long r14 = r2.f134666d
            j$.time.Instant r4 = p3186j$.time.Instant.ofEpochMilli(r14)
            r6.f94842b = r4
            com.google.assistant.e.j.aap r4 = r2.f134676n
            if (r4 != 0) goto L_0x0232
            com.google.assistant.e.j.aap r4 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x0232:
            int r4 = r4.f134658g
            int r4 = com.google.assistant.p3897e.p3921j.aao.m86268a(r4)
            if (r4 != 0) goto L_0x023c
        L_0x023a:
            r4 = 0
            goto L_0x0240
        L_0x023c:
            r12 = 2
            if (r4 != r12) goto L_0x023a
            r4 = 1
        L_0x0240:
            r6.f94850j = r4
            com.google.android.libraries.logging.k r4 = r7.f94574a
            if (r4 == 0) goto L_0x0251
            r12 = 0
            java.lang.String r4 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64608d(r4, r12)
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.f94845e = r4
            goto L_0x02ca
        L_0x0251:
            com.google.android.libraries.logging.ve.synthetic.remote.ParcelableSyntheticTree r4 = r7.f94575b
            if (r4 == 0) goto L_0x02ca
            java.lang.String r4 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64609e(r4)
            r6.f94845e = r4
            goto L_0x02ca
        L_0x025d:
            com.google.aq.a.a.b r12 = r4.f123984g
            if (r12 != 0) goto L_0x0263
            com.google.aq.a.a.b r12 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x0263:
            android.content.Intent r12 = r1.mo101308a(r12)
            if (r12 == 0) goto L_0x03f9
            r6.f94843c = r12
            com.google.protobuf.z r12 = r2.f134669g
            byte[] r12 = r12.mo59174N()
            r6.f94841a = r12
            java.lang.String r12 = r2.f134670h
            r6.f94844d = r12
            com.google.common.o.ajz r12 = r7.f94576c
            r6.f94847g = r12
            r6.mo40107c(r9)
            com.google.aq.a.a.b r4 = r4.f123984g
            if (r4 != 0) goto L_0x0285
            com.google.aq.a.a.b r12 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
            goto L_0x0286
        L_0x0285:
            r12 = r4
        L_0x0286:
            boolean r12 = r12.f123941d
            r6.f94848h = r12
            if (r4 != 0) goto L_0x028e
            com.google.aq.a.a.b r4 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x028e:
            boolean r4 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114388aj.m189693d(r4, r5)
            r6.f94849i = r4
            long r14 = r2.f134666d
            j$.time.Instant r4 = p3186j$.time.Instant.ofEpochMilli(r14)
            r6.f94842b = r4
            com.google.assistant.e.j.aap r4 = r2.f134676n
            if (r4 != 0) goto L_0x02a2
            com.google.assistant.e.j.aap r4 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x02a2:
            int r4 = r4.f134658g
            int r4 = com.google.assistant.p3897e.p3921j.aao.m86268a(r4)
            if (r4 != 0) goto L_0x02ac
        L_0x02aa:
            r4 = 0
            goto L_0x02b0
        L_0x02ac:
            r12 = 2
            if (r4 != r12) goto L_0x02aa
            r4 = 1
        L_0x02b0:
            r6.f94850j = r4
            com.google.android.libraries.logging.k r4 = r7.f94574a
            if (r4 == 0) goto L_0x02c0
            r12 = 0
            java.lang.String r4 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64608d(r4, r12)
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.f94845e = r4
            goto L_0x02ca
        L_0x02c0:
            com.google.android.libraries.logging.ve.synthetic.remote.ParcelableSyntheticTree r4 = r7.f94575b
            if (r4 == 0) goto L_0x02ca
            java.lang.String r4 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64609e(r4)
            r6.f94845e = r4
        L_0x02ca:
            android.content.Intent r4 = r6.mo40106b()
            if (r4 == 0) goto L_0x03f1
            android.content.Context r6 = r1.f317176b
            android.app.PendingIntent r6 = com.google.android.libraries.search.assistant.proactive.p2779j.C36327d.m64818b(r6, r4)
            r8.f5687g = r6
            int r6 = r5.f134697d
            int r6 = com.google.assistant.p3897e.p3921j.aaz.m86272a(r6)
            if (r6 != 0) goto L_0x02e1
            goto L_0x02e8
        L_0x02e1:
            r12 = 2
            if (r6 != r12) goto L_0x02e8
            r6 = -1
            r8.mo5019h(r6)
        L_0x02e8:
            com.google.android.libraries.search.assistant.proactive.aa r6 = r1.f317180f
            boolean r6 = r6.f94587e
            if (r6 == 0) goto L_0x0348
            android.content.Context r6 = r1.f317176b
            java.lang.String r12 = r2.f134670h
            com.google.common.b.gu r19 = com.google.common.p4522b.C58485gu.m89846n(r12)
            com.google.protobuf.z r12 = r2.f134669g
            byte[] r20 = r12.mo59174N()
            com.google.android.libraries.logging.k r12 = r7.f94574a
            if (r12 == 0) goto L_0x030a
            r14 = 0
            java.lang.String r10 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64608d(r12, r14)
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0307:
            r21 = r10
            goto L_0x0313
        L_0x030a:
            com.google.android.libraries.logging.ve.synthetic.remote.ParcelableSyntheticTree r12 = r7.f94575b
            if (r12 == 0) goto L_0x0307
            java.lang.String r10 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64609e(r12)
            goto L_0x0307
        L_0x0313:
            com.google.common.o.ajz r10 = r7.f94576c
            java.lang.String r12 = r2.f134671i
            long r14 = r2.f134666d
            j$.time.Instant r25 = p3186j$.time.Instant.ofEpochMilli(r14)
            int r5 = r5.f134700g
            com.google.assistant.e.j.aap r14 = r2.f134676n
            if (r14 != 0) goto L_0x0325
            com.google.assistant.e.j.aap r14 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x0325:
            int r14 = r14.f134658g
            int r14 = com.google.assistant.p3897e.p3921j.aao.m86268a(r14)
            if (r14 != 0) goto L_0x0330
        L_0x032d:
            r27 = 0
            goto L_0x0335
        L_0x0330:
            r13 = 2
            if (r14 != r13) goto L_0x032d
            r27 = 1
        L_0x0335:
            r18 = r6
            r22 = r10
            r23 = r9
            r24 = r12
            r26 = r5
            android.app.PendingIntent r5 = com.google.android.libraries.search.assistant.proactive.p2779j.C36324a.m64812a(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            android.app.Notification r6 = r8.f5679J
            r6.deleteIntent = r5
            goto L_0x03a2
        L_0x0348:
            android.content.Context r6 = r1.f317176b
            java.lang.String r12 = r2.f134670h
            com.google.common.b.gu r19 = com.google.common.p4522b.C58485gu.m89846n(r12)
            com.google.protobuf.z r12 = r2.f134669g
            byte[] r20 = r12.mo59174N()
            com.google.android.libraries.logging.k r12 = r7.f94574a
            if (r12 == 0) goto L_0x0364
            r14 = 0
            java.lang.String r10 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64608d(r12, r14)
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0361:
            r21 = r10
            goto L_0x036e
        L_0x0364:
            r14 = 0
            com.google.android.libraries.logging.ve.synthetic.remote.ParcelableSyntheticTree r12 = r7.f94575b
            if (r12 == 0) goto L_0x0361
            java.lang.String r10 = com.google.android.libraries.search.assistant.proactive.C36206ab.m64609e(r12)
            goto L_0x0361
        L_0x036e:
            com.google.common.o.ajz r10 = r7.f94576c
            java.lang.String r12 = r2.f134671i
            long r13 = r2.f134666d
            j$.time.Instant r25 = p3186j$.time.Instant.ofEpochMilli(r13)
            int r5 = r5.f134700g
            com.google.assistant.e.j.aap r13 = r2.f134676n
            if (r13 != 0) goto L_0x0380
            com.google.assistant.e.j.aap r13 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x0380:
            int r13 = r13.f134658g
            int r13 = com.google.assistant.p3897e.p3921j.aao.m86268a(r13)
            if (r13 != 0) goto L_0x038b
        L_0x0388:
            r27 = 0
            goto L_0x0390
        L_0x038b:
            r14 = 2
            if (r13 != r14) goto L_0x0388
            r27 = 1
        L_0x0390:
            r18 = r6
            r22 = r10
            r23 = r9
            r24 = r12
            r26 = r5
            android.app.PendingIntent r5 = com.google.android.libraries.search.assistant.proactive.p2779j.C36327d.m64817a(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            android.app.Notification r6 = r8.f5679J
            r6.deleteIntent = r5
        L_0x03a2:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            com.google.protobuf.z r6 = r2.f134669g
            byte[] r6 = r6.mo59174N()
            java.lang.String r9 = "opaque_token"
            r5.putByteArray(r9, r6)
            java.lang.String r6 = "grouping_key"
            java.lang.String r9 = r2.f134670h
            r5.putString(r6, r9)
            r8.mo5018g(r5)
            com.google.android.libraries.search.assistant.proactive.i r5 = new com.google.android.libraries.search.assistant.proactive.i
            java.lang.String r6 = r2.f134671i
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x03c9
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            goto L_0x03ed
        L_0x03c9:
            androidx.core.app.z r3 = r1.mo101309b(r2, r3)
            r6 = 2
            r3.f5678I = r6
            r3.f5700t = r11
            int r2 = r2.f134672j
            int r2 = com.google.assistant.p3897e.p3921j.aal.m86267a(r2)
            if (r2 != 0) goto L_0x03db
            goto L_0x03e5
        L_0x03db:
            if (r2 != r6) goto L_0x03e5
            android.content.Context r1 = r1.f317176b
            android.app.PendingIntent r1 = com.google.android.libraries.search.assistant.proactive.p2779j.C36327d.m64818b(r1, r4)
            r3.f5687g = r1
        L_0x03e5:
            android.app.Notification r1 = r3.mo5013a()
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
        L_0x03ed:
            r5.<init>(r8, r1, r7)
            return r5
        L_0x03f1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to create click intent for notification."
            r1.<init>(r2)
            throw r1
        L_0x03f9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to resolve intent for content."
            r1.<init>(r2)
            goto L_0x0402
        L_0x0401:
            throw r1
        L_0x0402:
            goto L_0x0401
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114386ah.mo17947a():java.lang.Object");
    }
}
