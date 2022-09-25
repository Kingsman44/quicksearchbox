package com.google.android.apps.search.assistant.platform.ondevice.p9263b;

import android.content.Context;
import com.google.android.gms.clearcut.p10777a.C143619a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3989p.C53038a;
import com.google.assistant.p3989p.C53049b;
import com.google.assistant.p3989p.C53051d;
import com.google.assistant.p3989p.C53052e;
import com.google.assistant.p3989p.C53053f;
import com.google.assistant.p3989p.p3990a.C53039a;
import com.google.assistant.p3989p.p3990a.C53040b;
import com.google.assistant.p3989p.p3990a.C53041c;
import com.google.assistant.p3989p.p3990a.C53044f;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.b.f */
/* compiled from: PG */
public final class C122125f implements C122136q {

    /* renamed from: a */
    public static final C59071e f338783a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.b.f");

    /* renamed from: b */
    public final Context f338784b;

    /* renamed from: c */
    public final C60870cx f338785c;

    /* renamed from: d */
    private final C58881cr f338786d;

    /* renamed from: e */
    private final Executor f338787e;

    /* renamed from: f */
    private final C122128i f338788f;

    /* renamed from: g */
    private final boolean f338789g;

    public C122125f(Context context, C47770dh dhVar, C46128f fVar, AccountId accountId, C143619a aVar, Executor executor, C122128i iVar, boolean z) {
        C60870cx cxVar;
        C47538ax c;
        this.f338787e = executor;
        this.f338784b = context;
        this.f338788f = iVar;
        try {
            WeakHashMap weakHashMap = C47831fm.f123851a;
            cxVar = fVar.mo50215b(accountId);
        } catch (IllegalStateException unused) {
            c = dhVar.mo51613c("getAccountName");
            C60870cx b = fVar.mo50215b(accountId);
            if (c != null) {
                c.close();
            }
            cxVar = b;
        } catch (Throwable th) {
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                    } catch (Exception unused2) {
                    }
                }
            }
            throw th;
        }
        this.f338785c = cxVar;
        this.f338789g = z;
        this.f338786d = C58886cw.m90973a(new C122124e(this, context, executor));
    }

    /* renamed from: c */
    private final C60870cx m201663c(C53040b bVar) {
        C122123d dVar = new C122123d(this, bVar, new C53038a());
        return C60922j.m93044g((C60870cx) this.f338786d.mo6453a(), C47810es.m84963c(dVar), this.f338787e);
    }

    /* renamed from: a */
    public final C60870cx mo105540a(String str, String str2) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C53039a aVar = (C53039a) C53040b.f139015e.createBuilder();
        aVar.copyOnWrite();
        C53040b bVar = (C53040b) aVar.instance;
        bVar.f139017a |= 1;
        bVar.f139020d = str2;
        C53049b bVar2 = (C53049b) C53051d.f139040d.createBuilder();
        bVar2.copyOnWrite();
        C53051d dVar = (C53051d) bVar2.instance;
        dVar.f139042a |= 1;
        dVar.f139043b = str;
        bVar2.copyOnWrite();
        C53051d dVar2 = (C53051d) bVar2.instance;
        dVar2.f139044c = 2;
        dVar2.f139042a |= 2;
        aVar.copyOnWrite();
        C53040b bVar3 = (C53040b) aVar.instance;
        C53051d dVar3 = (C53051d) bVar2.build();
        dVar3.getClass();
        bVar3.f139019c = dVar3;
        bVar3.f139018b = 4;
        C60870cx[] cxVarArr = new C60870cx[4];
        C122128i iVar = this.f338788f;
        cxVarArr[0] = C60922j.m93044g(this.f338785c, C47810es.m84963c(new C122126g(iVar)), iVar.f338793b);
        cxVarArr[1] = m201663c((C53040b) aVar.build());
        C60870cx cxVar3 = this.f338785c;
        if (!this.f338789g) {
            cxVar = C60866ct.f164955a;
        } else {
            cxVar = C60922j.m93044g(cxVar3, C47810es.m84963c(new C122121b(str2)), this.f338787e);
        }
        cxVarArr[2] = cxVar;
        if (!this.f338789g) {
            cxVar2 = C60866ct.f164955a;
        } else {
            C53041c cVar = (C53041c) C53044f.f139022f.createBuilder();
            cVar.copyOnWrite();
            C53044f fVar = (C53044f) cVar.instance;
            fVar.f139025b = 1;
            fVar.f139024a |= 1;
            C63088z E = C63088z.m96143E("The flag `ENABLE_DEBUG_LOG_METADATA_IN_LOGCAT` has been enabled on the device. We don't support logging to Sherlog for interactive debugging for now. Please find your logs on DebugAS directly. ");
            cVar.copyOnWrite();
            C53044f fVar2 = (C53044f) cVar.instance;
            fVar2.f139024a = 4 | fVar2.f139024a;
            fVar2.f139027d = E;
            C63088z byteString = ((C53044f) cVar.build()).toByteString();
            C53039a aVar2 = (C53039a) C53040b.f139015e.createBuilder();
            aVar2.copyOnWrite();
            C53040b bVar4 = (C53040b) aVar2.instance;
            bVar4.f139017a |= 1;
            bVar4.f139020d = str2;
            C53052e eVar = (C53052e) C53053f.f139045c.createBuilder();
            eVar.copyOnWrite();
            C53053f fVar3 = (C53053f) eVar.instance;
            byteString.getClass();
            fVar3.f139047a = 1 | fVar3.f139047a;
            fVar3.f139048b = byteString;
            aVar2.copyOnWrite();
            C53040b bVar5 = (C53040b) aVar2.instance;
            C53053f fVar4 = (C53053f) eVar.build();
            fVar4.getClass();
            bVar5.f139019c = fVar4;
            bVar5.f139018b = 3;
            cxVar2 = m201663c((C53040b) aVar2.build());
        }
        cxVarArr[3] = cxVar2;
        return C47638k.m84751b(cxVarArr).mo51520a(C122120a.f338774a, this.f338787e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a0 A[LOOP:4: B:62:0x019a->B:64:0x01a0, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo105541b(com.google.protobuf.C63088z r18, java.lang.String r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            boolean r3 = r1.f338789g
            r4 = 3
            r5 = 1
            if (r3 == 0) goto L_0x01c0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0187 }
            com.google.assistant.p.a.f r7 = com.google.assistant.p3989p.p3990a.C53044f.f139022f     // Catch:{ ct -> 0x0187 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r6)     // Catch:{ ct -> 0x0187 }
            com.google.assistant.p.a.f r0 = (com.google.assistant.p3989p.p3990a.C53044f) r0     // Catch:{ ct -> 0x0187 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.google.protobuf.z r7 = r0.f139027d
            java.nio.charset.Charset r8 = com.google.protobuf.C62972cr.f170009a
            java.lang.String r7 = r7.mo59170I(r8)
            org.a.a.c.a.b r8 = org.p5610a.p5611a.p5621c.C71999a.f191723a
            r9 = 0
            r10 = 0
            if (r7 != 0) goto L_0x0032
            r7 = r9
            goto L_0x007e
        L_0x0032:
            java.io.StringWriter r11 = new java.io.StringWriter     // Catch:{ IOException -> 0x0180 }
            int r12 = r7.length()     // Catch:{ IOException -> 0x0180 }
            int r12 = r12 + r12
            r11.<init>(r12)     // Catch:{ IOException -> 0x0180 }
            int r12 = r7.length()     // Catch:{ IOException -> 0x0180 }
            r13 = 0
        L_0x0041:
            if (r13 >= r12) goto L_0x007a
            int r14 = r8.mo63213a(r7, r13, r11)     // Catch:{ IOException -> 0x0180 }
            if (r14 != 0) goto L_0x006a
            char r14 = r7.charAt(r13)     // Catch:{ IOException -> 0x0180 }
            r11.write(r14)     // Catch:{ IOException -> 0x0180 }
            int r13 = r13 + 1
            boolean r14 = java.lang.Character.isHighSurrogate(r14)     // Catch:{ IOException -> 0x0180 }
            if (r14 == 0) goto L_0x0041
            if (r13 >= r12) goto L_0x0041
            char r14 = r7.charAt(r13)     // Catch:{ IOException -> 0x0180 }
            boolean r15 = java.lang.Character.isLowSurrogate(r14)     // Catch:{ IOException -> 0x0180 }
            if (r15 == 0) goto L_0x0041
            r11.write(r14)     // Catch:{ IOException -> 0x0180 }
            int r13 = r13 + 1
            goto L_0x0041
        L_0x006a:
            r15 = 0
        L_0x006b:
            if (r15 >= r14) goto L_0x0041
            int r16 = java.lang.Character.codePointAt(r7, r13)     // Catch:{ IOException -> 0x0180 }
            int r16 = java.lang.Character.charCount(r16)     // Catch:{ IOException -> 0x0180 }
            int r13 = r13 + r16
            int r15 = r15 + 1
            goto L_0x006b
        L_0x007a:
            java.lang.String r7 = r11.toString()     // Catch:{ IOException -> 0x0180 }
        L_0x007e:
            if (r7 != 0) goto L_0x0081
            goto L_0x00a5
        L_0x0081:
            int r8 = r7.length()
            if (r8 >= 0) goto L_0x008a
            java.lang.String r9 = ""
            goto L_0x00a5
        L_0x008a:
            int r8 = r7.length()
            r9 = 2000(0x7d0, float:2.803E-42)
            if (r8 <= r9) goto L_0x00a1
            int r8 = r7.length()
            if (r8 >= r9) goto L_0x009c
            int r9 = r7.length()
        L_0x009c:
            java.lang.String r9 = r7.substring(r10, r9)
            goto L_0x00a5
        L_0x00a1:
            java.lang.String r9 = r7.substring(r10)
        L_0x00a5:
            r6.append(r9)
            java.lang.String r7 = " [CONTEXT"
            r6.append(r7)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r10] = r2
            java.lang.String r2 = " streamId=\"%s\""
            java.lang.String r2 = java.lang.String.format(r2, r7)
            r6.append(r2)
            j$.util.StringJoiner r2 = new j$.util.StringJoiner
            java.lang.String r7 = ","
            r2.<init>(r7)
            com.google.protobuf.ch r7 = r0.f139026c
            java.util.Iterator r7 = r7.iterator()
        L_0x00c7:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00df
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.String r8 = java.lang.Integer.toString(r8)
            r2.add(r8)
            goto L_0x00c7
        L_0x00df:
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r10] = r2
            java.lang.String r2 = " indexPath=\"%s\""
            java.lang.String r2 = java.lang.String.format(r2, r7)
            r6.append(r2)
            int r2 = r0.f139025b
            int r2 = com.google.assistant.p3989p.p3990a.C53043e.m86774a(r2)
            if (r2 != 0) goto L_0x00f6
            goto L_0x0173
        L_0x00f6:
            if (r2 != r4) goto L_0x0173
            com.google.assistant.e.j.ka r2 = r0.f139028e
            if (r2 != 0) goto L_0x00fe
            com.google.assistant.e.j.ka r2 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x00fe:
            java.lang.String r2 = r2.f137060b
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r10] = r2
            java.lang.String r2 = " protoType=\"%s\""
            java.lang.String r2 = java.lang.String.format(r2, r7)
            r6.append(r2)
            java.lang.String r2 = " part=\"%d/%d\" protoData=\"%s\"] "
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.google.common.l.i r6 = com.google.common.p4541l.C59326i.f157516d
            com.google.assistant.e.j.ka r0 = r0.f139028e
            if (r0 != 0) goto L_0x011e
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x011e:
            com.google.protobuf.z r0 = r0.f137061c
            byte[] r0 = r0.mo59174N()
            int r7 = r0.length
            java.lang.String r0 = r6.mo56837l(r0, r7)
            int r6 = r2.length()
            int r6 = 3200 - r6
            if (r6 <= 0) goto L_0x0133
            r7 = 1
            goto L_0x0134
        L_0x0133:
            r7 = 0
        L_0x0134:
            java.lang.String r8 = "The length may not be less than 1"
            com.google.common.base.C58838bb.m90869d(r7, r8)
            com.google.common.base.cf r7 = new com.google.common.base.cf
            com.google.common.base.ca r8 = new com.google.common.base.ca
            r8.<init>(r6)
            r7.<init>(r8)
            java.util.List r0 = r7.mo56155i(r0)
            r6 = 0
        L_0x0148:
            int r7 = r0.size()
            if (r6 >= r7) goto L_0x0196
            java.lang.Object r7 = r0.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object[] r8 = new java.lang.Object[r4]
            int r6 = r6 + 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r8[r10] = r9
            int r9 = r0.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r5] = r9
            r9 = 2
            r8[r9] = r7
            java.lang.String r7 = java.lang.String.format(r2, r8)
            r3.add(r7)
            goto L_0x0148
        L_0x0173:
            java.lang.String r0 = "] "
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r3.add(r0)
            goto L_0x0196
        L_0x0180:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x0187:
            r0 = move-exception
            com.google.common.f.e r2 = f338783a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r4 = "Clearcut flatDebugSection decoding failed. %s"
            r5 = 34773(0x87d5, float:4.8727E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r5)).mo56389s(r4, r0)
        L_0x0196:
            java.util.Iterator r0 = r3.iterator()
        L_0x019a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01bd
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.common.f.e r3 = f338783a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 34771(0x87d3, float:4.8725E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r4 = "%s"
            r3.mo56389s(r4, r2)
            goto L_0x019a
        L_0x01bd:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            return r0
        L_0x01c0:
            com.google.assistant.p.a.b r3 = com.google.assistant.p3989p.p3990a.C53040b.f139015e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.p.a.a r3 = (com.google.assistant.p3989p.p3990a.C53039a) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.p.a.b r6 = (com.google.assistant.p3989p.p3990a.C53040b) r6
            r19.getClass()
            int r7 = r6.f139017a
            r7 = r7 | r5
            r6.f139017a = r7
            r6.f139020d = r2
            com.google.assistant.p.f r2 = com.google.assistant.p3989p.C53053f.f139045c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.p.e r2 = (com.google.assistant.p3989p.C53052e) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.p.f r6 = (com.google.assistant.p3989p.C53053f) r6
            r18.getClass()
            int r7 = r6.f139047a
            r5 = r5 | r7
            r6.f139047a = r5
            r6.f139048b = r0
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.assistant.p.a.b r0 = (com.google.assistant.p3989p.p3990a.C53040b) r0
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.p.f r2 = (com.google.assistant.p3989p.C53053f) r2
            r2.getClass()
            r0.f139019c = r2
            r0.f139018b = r4
            com.google.protobuf.bv r0 = r3.build()
            com.google.assistant.p.a.b r0 = (com.google.assistant.p3989p.p3990a.C53040b) r0
            com.google.common.util.concurrent.cx r0 = r1.m201663c(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.p9263b.C122125f.mo105541b(com.google.protobuf.z, java.lang.String):com.google.common.util.concurrent.cx");
    }
}
