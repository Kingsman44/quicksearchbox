package com.google.android.libraries.abuse.reporting;

import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.CronetException;

/* renamed from: com.google.android.libraries.abuse.reporting.o */
/* compiled from: PG */
final class C146746o implements C146733b {

    /* renamed from: a */
    final AtomicBoolean f396271a = new AtomicBoolean(true);

    /* renamed from: b */
    final /* synthetic */ ReportAbuseActivity f396272b;

    public C146746o(ReportAbuseActivity reportAbuseActivity) {
        this.f396272b = reportAbuseActivity;
    }

    /* renamed from: a */
    public final void mo123570a(CronetException cronetException) {
        this.f396272b.mo123512k(cronetException, 1000);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:85|(10:86|87|88|89|178|211|212|213|214|215)|220|221|249) */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04b3, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:220:0x04b5 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123571b(java.lang.String r30) {
        /*
            r29 = this;
            r1 = r29
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f396271a
            r2 = 0
            r0.set(r2)
            com.google.android.libraries.abuse.reporting.ReportAbuseActivity r0 = r1.f396272b     // Catch:{ JSONException -> 0x04fa }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x04fa }
            r4 = r30
            r3.<init>(r4)     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r4 = "configuration"
            org.json.JSONObject r3 = r3.getJSONObject(r4)     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.h r4 = com.google.p335a.p336a.C6586h.f19580e     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.e r4 = (com.google.p335a.p336a.C6583e) r4     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r5 = "options"
            org.json.JSONArray r5 = r3.getJSONArray(r5)     // Catch:{ JSONException -> 0x04fa }
            java.util.List r5 = com.google.android.libraries.abuse.reporting.C146731at.m239086a(r5)     // Catch:{ JSONException -> 0x04fa }
            boolean r6 = r5.isEmpty()     // Catch:{ JSONException -> 0x04fa }
            if (r6 != 0) goto L_0x04f2
            r4.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.h r6 = (com.google.p335a.p336a.C6586h) r6     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.cq r7 = r6.f19582a     // Catch:{ JSONException -> 0x04fa }
            boolean r8 = r7.mo58948c()     // Catch:{ JSONException -> 0x04fa }
            if (r8 != 0) goto L_0x0044
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)     // Catch:{ JSONException -> 0x04fa }
            r6.f19582a = r7     // Catch:{ JSONException -> 0x04fa }
        L_0x0044:
            com.google.protobuf.cq r6 = r6.f19582a     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r5, (java.util.List) r6)     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r5 = "actions"
            org.json.JSONArray r5 = r3.optJSONArray(r5)     // Catch:{ JSONException -> 0x04fa }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ JSONException -> 0x04fa }
            r6.<init>()     // Catch:{ JSONException -> 0x04fa }
            r7 = 16
            r8 = 4
            r9 = 2
            r10 = 1
            if (r5 == 0) goto L_0x011d
            r11 = 0
        L_0x005c:
            int r12 = r5.length()     // Catch:{ JSONException -> 0x04fa }
            if (r11 >= r12) goto L_0x011d
            org.json.JSONObject r12 = r5.optJSONObject(r11)     // Catch:{ JSONException -> 0x04fa }
            if (r12 == 0) goto L_0x0116
            com.google.a.a.d r13 = com.google.p335a.p336a.C6582d.f19571g     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.c r13 = (com.google.p335a.p336a.C6581c) r13     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r14 = "actionText"
            java.lang.String r14 = r12.optString(r14)     // Catch:{ JSONException -> 0x04fa }
            boolean r15 = r14.isEmpty()     // Catch:{ JSONException -> 0x04fa }
            if (r15 != 0) goto L_0x008d
            r13.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r15 = r13.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.d r15 = (com.google.p335a.p336a.C6582d) r15     // Catch:{ JSONException -> 0x04fa }
            r14.getClass()     // Catch:{ JSONException -> 0x04fa }
            int r2 = r15.f19573a     // Catch:{ JSONException -> 0x04fa }
            r2 = r2 | r8
            r15.f19573a = r2     // Catch:{ JSONException -> 0x04fa }
            r15.f19577e = r14     // Catch:{ JSONException -> 0x04fa }
        L_0x008d:
            java.lang.String r2 = "actionName"
            java.lang.String r2 = r12.optString(r2)     // Catch:{ JSONException -> 0x04fa }
            boolean r14 = r2.isEmpty()     // Catch:{ JSONException -> 0x04fa }
            if (r14 != 0) goto L_0x00aa
            r13.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r14 = r13.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.d r14 = (com.google.p335a.p336a.C6582d) r14     // Catch:{ JSONException -> 0x04fa }
            r2.getClass()     // Catch:{ JSONException -> 0x04fa }
            int r15 = r14.f19573a     // Catch:{ JSONException -> 0x04fa }
            r15 = r15 | r10
            r14.f19573a = r15     // Catch:{ JSONException -> 0x04fa }
            r14.f19574b = r2     // Catch:{ JSONException -> 0x04fa }
        L_0x00aa:
            java.lang.String r2 = "clientActionInt"
            int r2 = r12.optInt(r2)     // Catch:{ JSONException -> 0x04fa }
            r13.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r14 = r13.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.d r14 = (com.google.p335a.p336a.C6582d) r14     // Catch:{ JSONException -> 0x04fa }
            int r15 = r14.f19573a     // Catch:{ JSONException -> 0x04fa }
            r15 = r15 | r9
            r14.f19573a = r15     // Catch:{ JSONException -> 0x04fa }
            r14.f19575c = r2     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r2 = "showUnknownAction"
            boolean r2 = r12.optBoolean(r2)     // Catch:{ JSONException -> 0x04fa }
            r13.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r14 = r13.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.d r14 = (com.google.p335a.p336a.C6582d) r14     // Catch:{ JSONException -> 0x04fa }
            int r15 = r14.f19573a     // Catch:{ JSONException -> 0x04fa }
            r15 = r15 | r7
            r14.f19573a = r15     // Catch:{ JSONException -> 0x04fa }
            r14.f19578f = r2     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r2 = "requirements"
            org.json.JSONArray r2 = r12.optJSONArray(r2)     // Catch:{ JSONException -> 0x04fa }
            if (r2 == 0) goto L_0x010d
            r12 = 0
        L_0x00db:
            int r14 = r2.length()     // Catch:{ JSONException -> 0x04fa }
            if (r12 >= r14) goto L_0x010d
            java.lang.String r14 = r2.optString(r12)     // Catch:{ JSONException -> 0x04fa }
            boolean r15 = r14.isEmpty()     // Catch:{ JSONException -> 0x04fa }
            if (r15 != 0) goto L_0x0108
            r13.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r15 = r13.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.d r15 = (com.google.p335a.p336a.C6582d) r15     // Catch:{ JSONException -> 0x04fa }
            r14.getClass()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.cq r7 = r15.f19576d     // Catch:{ JSONException -> 0x04fa }
            boolean r16 = r7.mo58948c()     // Catch:{ JSONException -> 0x04fa }
            if (r16 != 0) goto L_0x0103
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)     // Catch:{ JSONException -> 0x04fa }
            r15.f19576d = r7     // Catch:{ JSONException -> 0x04fa }
        L_0x0103:
            com.google.protobuf.cq r7 = r15.f19576d     // Catch:{ JSONException -> 0x04fa }
            r7.add(r14)     // Catch:{ JSONException -> 0x04fa }
        L_0x0108:
            int r12 = r12 + 1
            r7 = 16
            goto L_0x00db
        L_0x010d:
            com.google.protobuf.bv r2 = r13.build()     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.d r2 = (com.google.p335a.p336a.C6582d) r2     // Catch:{ JSONException -> 0x04fa }
            r6.add(r2)     // Catch:{ JSONException -> 0x04fa }
        L_0x0116:
            int r11 = r11 + 1
            r2 = 0
            r7 = 16
            goto L_0x005c
        L_0x011d:
            r4.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r2 = r4.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.h r2 = (com.google.p335a.p336a.C6586h) r2     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.cq r5 = r2.f19583b     // Catch:{ JSONException -> 0x04fa }
            boolean r7 = r5.mo58948c()     // Catch:{ JSONException -> 0x04fa }
            if (r7 != 0) goto L_0x0132
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)     // Catch:{ JSONException -> 0x04fa }
            r2.f19583b = r5     // Catch:{ JSONException -> 0x04fa }
        L_0x0132:
            com.google.protobuf.cq r2 = r2.f19583b     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r6, (java.util.List) r2)     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r2 = "messages"
            org.json.JSONArray r2 = r3.optJSONArray(r2)     // Catch:{ JSONException -> 0x04fa }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ JSONException -> 0x04fa }
            r5.<init>()     // Catch:{ JSONException -> 0x04fa }
            if (r2 == 0) goto L_0x0275
            r7 = 0
        L_0x0145:
            int r11 = r2.length()     // Catch:{ JSONException -> 0x04fa }
            if (r7 >= r11) goto L_0x0275
            org.json.JSONObject r11 = r2.optJSONObject(r7)     // Catch:{ JSONException -> 0x04fa }
            if (r11 == 0) goto L_0x0268
            com.google.a.a.j r12 = com.google.p335a.p336a.C6588j.f19586g     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.i r12 = (com.google.p335a.p336a.C6587i) r12     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r13 = "confirmRequired"
            boolean r13 = r11.optBoolean(r13)     // Catch:{ JSONException -> 0x04fa }
            r12.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r14 = r12.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.j r14 = (com.google.p335a.p336a.C6588j) r14     // Catch:{ JSONException -> 0x04fa }
            int r15 = r14.f19588a     // Catch:{ JSONException -> 0x04fa }
            r15 = r15 | r9
            r14.f19588a = r15     // Catch:{ JSONException -> 0x04fa }
            r14.f19590c = r13     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r13 = "externalNavigation"
            java.lang.String r13 = r11.optString(r13)     // Catch:{ JSONException -> 0x04fa }
            boolean r14 = r13.isEmpty()     // Catch:{ JSONException -> 0x04fa }
            if (r14 != 0) goto L_0x018a
            r12.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r14 = r12.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.j r14 = (com.google.p335a.p336a.C6588j) r14     // Catch:{ JSONException -> 0x04fa }
            r13.getClass()     // Catch:{ JSONException -> 0x04fa }
            int r15 = r14.f19588a     // Catch:{ JSONException -> 0x04fa }
            r15 = r15 | r8
            r14.f19588a = r15     // Catch:{ JSONException -> 0x04fa }
            r14.f19591d = r13     // Catch:{ JSONException -> 0x04fa }
        L_0x018a:
            java.lang.String r13 = "urlParameterKvPair"
            org.json.JSONArray r13 = r11.optJSONArray(r13)     // Catch:{ JSONException -> 0x04fa }
            if (r13 == 0) goto L_0x021c
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ JSONException -> 0x04fa }
            r14.<init>()     // Catch:{ JSONException -> 0x04fa }
            r15 = 0
        L_0x0198:
            int r8 = r13.length()     // Catch:{ JSONException -> 0x04fa }
            if (r15 >= r8) goto L_0x01ff
            org.json.JSONObject r8 = r13.optJSONObject(r15)     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.s r17 = com.google.p335a.p336a.C6597s.f19616d     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bn r17 = r17.createBuilder()     // Catch:{ JSONException -> 0x04fa }
            r6 = r17
            com.google.a.a.r r6 = (com.google.p335a.p336a.C6596r) r6     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r9 = "key"
            java.lang.String r9 = r8.optString(r9)     // Catch:{ JSONException -> 0x04fa }
            boolean r19 = r9.isEmpty()     // Catch:{ JSONException -> 0x04fa }
            if (r19 != 0) goto L_0x01cf
            r6.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r10 = r6.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.s r10 = (com.google.p335a.p336a.C6597s) r10     // Catch:{ JSONException -> 0x04fa }
            r9.getClass()     // Catch:{ JSONException -> 0x04fa }
            r20 = r2
            int r2 = r10.f19618a     // Catch:{ JSONException -> 0x04fa }
            r19 = 1
            r2 = r2 | 1
            r10.f19618a = r2     // Catch:{ JSONException -> 0x04fa }
            r10.f19619b = r9     // Catch:{ JSONException -> 0x04fa }
            goto L_0x01d1
        L_0x01cf:
            r20 = r2
        L_0x01d1:
            java.lang.String r2 = "value"
            java.lang.String r2 = r8.optString(r2)     // Catch:{ JSONException -> 0x04fa }
            boolean r8 = r2.isEmpty()     // Catch:{ JSONException -> 0x04fa }
            if (r8 != 0) goto L_0x01ef
            r6.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r8 = r6.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.s r8 = (com.google.p335a.p336a.C6597s) r8     // Catch:{ JSONException -> 0x04fa }
            r2.getClass()     // Catch:{ JSONException -> 0x04fa }
            int r9 = r8.f19618a     // Catch:{ JSONException -> 0x04fa }
            r10 = 2
            r9 = r9 | r10
            r8.f19618a = r9     // Catch:{ JSONException -> 0x04fa }
            r8.f19620c = r2     // Catch:{ JSONException -> 0x04fa }
        L_0x01ef:
            com.google.protobuf.bv r2 = r6.build()     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.s r2 = (com.google.p335a.p336a.C6597s) r2     // Catch:{ JSONException -> 0x04fa }
            r14.add(r2)     // Catch:{ JSONException -> 0x04fa }
            int r15 = r15 + 1
            r2 = r20
            r9 = 2
            r10 = 1
            goto L_0x0198
        L_0x01ff:
            r20 = r2
            r12.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r2 = r12.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.j r2 = (com.google.p335a.p336a.C6588j) r2     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.cq r6 = r2.f19593f     // Catch:{ JSONException -> 0x04fa }
            boolean r8 = r6.mo58948c()     // Catch:{ JSONException -> 0x04fa }
            if (r8 != 0) goto L_0x0216
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)     // Catch:{ JSONException -> 0x04fa }
            r2.f19593f = r6     // Catch:{ JSONException -> 0x04fa }
        L_0x0216:
            com.google.protobuf.cq r2 = r2.f19593f     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r14, (java.util.List) r2)     // Catch:{ JSONException -> 0x04fa }
            goto L_0x021e
        L_0x021c:
            r20 = r2
        L_0x021e:
            java.lang.String r2 = "messageName"
            java.lang.String r2 = r11.optString(r2)     // Catch:{ JSONException -> 0x04fa }
            boolean r6 = r2.isEmpty()     // Catch:{ JSONException -> 0x04fa }
            if (r6 != 0) goto L_0x023c
            r12.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r6 = r12.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.j r6 = (com.google.p335a.p336a.C6588j) r6     // Catch:{ JSONException -> 0x04fa }
            r2.getClass()     // Catch:{ JSONException -> 0x04fa }
            int r8 = r6.f19588a     // Catch:{ JSONException -> 0x04fa }
            r9 = 1
            r8 = r8 | r9
            r6.f19588a = r8     // Catch:{ JSONException -> 0x04fa }
            r6.f19589b = r2     // Catch:{ JSONException -> 0x04fa }
        L_0x023c:
            java.lang.String r2 = "messageText"
            java.lang.String r2 = r11.optString(r2)     // Catch:{ JSONException -> 0x04fa }
            boolean r6 = r2.isEmpty()     // Catch:{ JSONException -> 0x04fa }
            if (r6 != 0) goto L_0x025c
            r12.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r6 = r12.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.j r6 = (com.google.p335a.p336a.C6588j) r6     // Catch:{ JSONException -> 0x04fa }
            r2.getClass()     // Catch:{ JSONException -> 0x04fa }
            int r8 = r6.f19588a     // Catch:{ JSONException -> 0x04fa }
            r9 = 8
            r8 = r8 | r9
            r6.f19588a = r8     // Catch:{ JSONException -> 0x04fa }
            r6.f19592e = r2     // Catch:{ JSONException -> 0x04fa }
            goto L_0x025e
        L_0x025c:
            r9 = 8
        L_0x025e:
            com.google.protobuf.bv r2 = r12.build()     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.j r2 = (com.google.p335a.p336a.C6588j) r2     // Catch:{ JSONException -> 0x04fa }
            r5.add(r2)     // Catch:{ JSONException -> 0x04fa }
            goto L_0x026c
        L_0x0268:
            r20 = r2
            r9 = 8
        L_0x026c:
            int r7 = r7 + 1
            r2 = r20
            r8 = 4
            r9 = 2
            r10 = 1
            goto L_0x0145
        L_0x0275:
            r9 = 8
            r4.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r2 = r4.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.h r2 = (com.google.p335a.p336a.C6586h) r2     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.cq r6 = r2.f19584c     // Catch:{ JSONException -> 0x04fa }
            boolean r7 = r6.mo58948c()     // Catch:{ JSONException -> 0x04fa }
            if (r7 != 0) goto L_0x028c
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)     // Catch:{ JSONException -> 0x04fa }
            r2.f19584c = r6     // Catch:{ JSONException -> 0x04fa }
        L_0x028c:
            com.google.protobuf.cq r2 = r2.f19584c     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r5, (java.util.List) r2)     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r2 = "strings"
            org.json.JSONArray r2 = r3.optJSONArray(r2)     // Catch:{ JSONException -> 0x04fa }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ JSONException -> 0x04fa }
            r3.<init>()     // Catch:{ JSONException -> 0x04fa }
            if (r2 == 0) goto L_0x04c5
            r5 = 0
        L_0x029f:
            int r6 = r2.length()     // Catch:{ JSONException -> 0x04fa }
            if (r5 >= r6) goto L_0x04c5
            org.json.JSONObject r6 = r2.optJSONObject(r5)     // Catch:{ JSONException -> 0x04fa }
            if (r6 == 0) goto L_0x04bf
            com.google.a.a.n r7 = com.google.p335a.p336a.C6592n.f19595d     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.k r7 = (com.google.p335a.p336a.C6589k) r7     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r8 = "stringText"
            java.lang.String r8 = r6.optString(r8)     // Catch:{ JSONException -> 0x04fa }
            r7.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.n r10 = (com.google.p335a.p336a.C6592n) r10     // Catch:{ JSONException -> 0x04fa }
            r8.getClass()     // Catch:{ JSONException -> 0x04fa }
            int r11 = r10.f19597a     // Catch:{ JSONException -> 0x04fa }
            r12 = 2
            r11 = r11 | r12
            r10.f19597a = r11     // Catch:{ JSONException -> 0x04fa }
            r10.f19599c = r8     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r8 = "stringTemplate"
            java.lang.String r6 = r6.optString(r8)     // Catch:{ JSONException -> 0x04fa }
            int r8 = r6.hashCode()     // Catch:{ IllegalArgumentException -> 0x04b4 }
            r10 = 27
            r11 = 9
            r13 = 14
            r14 = 13
            r15 = 17
            r17 = 23
            r18 = 7
            r20 = 28
            r21 = 26
            r22 = 22
            r23 = 21
            r24 = 24
            r25 = 11
            r26 = 3
            r27 = 25
            r28 = -1
            switch(r8) {
                case -2146148038: goto L_0x0439;
                case -1854072681: goto L_0x042f;
                case -1837508502: goto L_0x0424;
                case -1170718607: goto L_0x041a;
                case -1117644406: goto L_0x0410;
                case -988067462: goto L_0x0405;
                case -970882463: goto L_0x03fa;
                case -305891226: goto L_0x03ef;
                case -255092698: goto L_0x03e4;
                case -98675839: goto L_0x03d9;
                case 118428487: goto L_0x03ce;
                case 382685559: goto L_0x03c2;
                case 567069033: goto L_0x03b6;
                case 644985007: goto L_0x03aa;
                case 709980508: goto L_0x039e;
                case 723485892: goto L_0x0392;
                case 730086653: goto L_0x0386;
                case 821486488: goto L_0x037a;
                case 869243193: goto L_0x036f;
                case 1091361332: goto L_0x0363;
                case 1150585875: goto L_0x0357;
                case 1262327507: goto L_0x034c;
                case 1488263169: goto L_0x0340;
                case 1506274814: goto L_0x0334;
                case 1571106493: goto L_0x0329;
                case 1612512960: goto L_0x031d;
                case 1709129453: goto L_0x0311;
                case 1715462152: goto L_0x0306;
                case 1865546312: goto L_0x02fa;
                default: goto L_0x02f8;
            }
        L_0x02f8:
            goto L_0x0444
        L_0x02fa:
            java.lang.String r8 = "UNDO_HEADER"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 8
            goto L_0x0445
        L_0x0306:
            java.lang.String r8 = "INITIAL_HEADER"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 6
            goto L_0x0445
        L_0x0311:
            java.lang.String r8 = "UNDO_BUTTON"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 15
            goto L_0x0445
        L_0x031d:
            java.lang.String r8 = "ADDITIONAL_MESSAGE_PENDING_REPORT_HEADER"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 12
            goto L_0x0445
        L_0x0329:
            java.lang.String r8 = "OKAY_BUTTON"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 5
            goto L_0x0445
        L_0x0334:
            java.lang.String r8 = "NEXT_BUTTON"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 19
            goto L_0x0445
        L_0x0340:
            java.lang.String r8 = "NO_ADDITIONAL_ACTION_BUTTON"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 18
            goto L_0x0445
        L_0x034c:
            java.lang.String r8 = "UNKNOWN_STRING_TEMPLATE"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 0
            goto L_0x0445
        L_0x0357:
            java.lang.String r8 = "HARMONIA_NO_LEGAL_INITIAL_HEADER_OVERRIDE"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 20
            goto L_0x0445
        L_0x0363:
            java.lang.String r8 = "ADDITIONAL_ACTIONS_NO_REPORT_HEADER"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 10
            goto L_0x0445
        L_0x036f:
            java.lang.String r8 = "SUBMIT_BUTTON"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 4
            goto L_0x0445
        L_0x037a:
            java.lang.String r8 = "CANCEL_REPORT_BUTTON"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 27
            goto L_0x0445
        L_0x0386:
            java.lang.String r8 = "ADDITIONAL_MESSAGE_HEADER"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 9
            goto L_0x0445
        L_0x0392:
            java.lang.String r8 = "ERROR_HEADER"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 14
            goto L_0x0445
        L_0x039e:
            java.lang.String r8 = "CONTENT_HIDDEN_HEADER"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 13
            goto L_0x0445
        L_0x03aa:
            java.lang.String r8 = "FINISH_REPORTING_BUTTON"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 16
            goto L_0x0445
        L_0x03b6:
            java.lang.String r8 = "ERROR_BUTTON"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 17
            goto L_0x0445
        L_0x03c2:
            java.lang.String r8 = "HARMONIA_UNDO_HEADER_OVERRIDE"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 23
            goto L_0x0445
        L_0x03ce:
            java.lang.String r8 = "ADDITIONAL_ACTIONS_HEADER"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 7
            goto L_0x0445
        L_0x03d9:
            java.lang.String r8 = "SEND_REPORT_HEADER"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 28
            goto L_0x0445
        L_0x03e4:
            java.lang.String r8 = "SEND_REPORT_BUTTON"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 26
            goto L_0x0445
        L_0x03ef:
            java.lang.String r8 = "HARMONIA_WITH_LEGAL_NO_REPORT_HEADER_OVERRIDE"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 22
            goto L_0x0445
        L_0x03fa:
            java.lang.String r8 = "HARMONIA_NO_LEGAL_NO_REPORT_HEADER_OVERRIDE"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 21
            goto L_0x0445
        L_0x0405:
            java.lang.String r8 = "SOCIETY_NO_REPORT_HEADER_OVERRIDE"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 24
            goto L_0x0445
        L_0x0410:
            java.lang.String r8 = "BACK_BUTTON"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 2
            goto L_0x0445
        L_0x041a:
            java.lang.String r8 = "REPORT_ABUSE_HEADER"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 1
            goto L_0x0445
        L_0x0424:
            java.lang.String r8 = "ADDITIONAL_MESSAGE_NO_REPORT_HEADER"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 11
            goto L_0x0445
        L_0x042f:
            java.lang.String r8 = "CANCEL_BUTTON"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 3
            goto L_0x0445
        L_0x0439:
            java.lang.String r8 = "SOCIETY_UNDO_HEADER_OVERRIDE"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0444
            r6 = 25
            goto L_0x0445
        L_0x0444:
            r6 = -1
        L_0x0445:
            switch(r6) {
                case 0: goto L_0x049d;
                case 1: goto L_0x049b;
                case 2: goto L_0x0499;
                case 3: goto L_0x0497;
                case 4: goto L_0x0495;
                case 5: goto L_0x0493;
                case 6: goto L_0x0491;
                case 7: goto L_0x048e;
                case 8: goto L_0x048b;
                case 9: goto L_0x0488;
                case 10: goto L_0x0485;
                case 11: goto L_0x0482;
                case 12: goto L_0x047f;
                case 13: goto L_0x047c;
                case 14: goto L_0x0479;
                case 15: goto L_0x0476;
                case 16: goto L_0x0473;
                case 17: goto L_0x0470;
                case 18: goto L_0x046d;
                case 19: goto L_0x046a;
                case 20: goto L_0x0467;
                case 21: goto L_0x0464;
                case 22: goto L_0x0461;
                case 23: goto L_0x045e;
                case 24: goto L_0x045b;
                case 25: goto L_0x0458;
                case 26: goto L_0x0455;
                case 27: goto L_0x0451;
                case 28: goto L_0x044d;
                default: goto L_0x0448;
            }
        L_0x0448:
            r10 = 1
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x04b5 }
            goto L_0x04b0
        L_0x044d:
            r6 = 29
            goto L_0x049e
        L_0x0451:
            r6 = 28
            goto L_0x049e
        L_0x0455:
            r6 = 27
            goto L_0x049e
        L_0x0458:
            r6 = 26
            goto L_0x049e
        L_0x045b:
            r6 = 25
            goto L_0x049e
        L_0x045e:
            r6 = 24
            goto L_0x049e
        L_0x0461:
            r6 = 23
            goto L_0x049e
        L_0x0464:
            r6 = 22
            goto L_0x049e
        L_0x0467:
            r6 = 21
            goto L_0x049e
        L_0x046a:
            r6 = 20
            goto L_0x049e
        L_0x046d:
            r6 = 19
            goto L_0x049e
        L_0x0470:
            r6 = 18
            goto L_0x049e
        L_0x0473:
            r6 = 17
            goto L_0x049e
        L_0x0476:
            r6 = 16
            goto L_0x049e
        L_0x0479:
            r6 = 15
            goto L_0x049e
        L_0x047c:
            r6 = 14
            goto L_0x049e
        L_0x047f:
            r6 = 13
            goto L_0x049e
        L_0x0482:
            r6 = 12
            goto L_0x049e
        L_0x0485:
            r6 = 11
            goto L_0x049e
        L_0x0488:
            r6 = 10
            goto L_0x049e
        L_0x048b:
            r6 = 9
            goto L_0x049e
        L_0x048e:
            r6 = 8
            goto L_0x049e
        L_0x0491:
            r6 = 7
            goto L_0x049e
        L_0x0493:
            r6 = 6
            goto L_0x049e
        L_0x0495:
            r6 = 5
            goto L_0x049e
        L_0x0497:
            r6 = 4
            goto L_0x049e
        L_0x0499:
            r6 = 3
            goto L_0x049e
        L_0x049b:
            r6 = 2
            goto L_0x049e
        L_0x049d:
            r6 = 1
        L_0x049e:
            r7.copyOnWrite()     // Catch:{ IllegalArgumentException -> 0x04b4 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ IllegalArgumentException -> 0x04b4 }
            com.google.a.a.n r8 = (com.google.p335a.p336a.C6592n) r8     // Catch:{ IllegalArgumentException -> 0x04b4 }
            int r6 = r6 + -1
            r8.f19598b = r6     // Catch:{ IllegalArgumentException -> 0x04b4 }
            int r6 = r8.f19597a     // Catch:{ IllegalArgumentException -> 0x04b4 }
            r10 = 1
            r6 = r6 | r10
            r8.f19597a = r6     // Catch:{ IllegalArgumentException -> 0x04b5 }
            goto L_0x04b5
        L_0x04b0:
            r6.<init>()     // Catch:{ IllegalArgumentException -> 0x04b5 }
            throw r6     // Catch:{ IllegalArgumentException -> 0x04b5 }
        L_0x04b4:
            r10 = 1
        L_0x04b5:
            com.google.protobuf.bv r6 = r7.build()     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.n r6 = (com.google.p335a.p336a.C6592n) r6     // Catch:{ JSONException -> 0x04fa }
            r3.add(r6)     // Catch:{ JSONException -> 0x04fa }
            goto L_0x04c1
        L_0x04bf:
            r10 = 1
            r12 = 2
        L_0x04c1:
            int r5 = r5 + 1
            goto L_0x029f
        L_0x04c5:
            r4.copyOnWrite()     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r2 = r4.instance     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.h r2 = (com.google.p335a.p336a.C6586h) r2     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.cq r5 = r2.f19585d     // Catch:{ JSONException -> 0x04fa }
            boolean r6 = r5.mo58948c()     // Catch:{ JSONException -> 0x04fa }
            if (r6 != 0) goto L_0x04da
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)     // Catch:{ JSONException -> 0x04fa }
            r2.f19585d = r5     // Catch:{ JSONException -> 0x04fa }
        L_0x04da:
            com.google.protobuf.cq r2 = r2.f19585d     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r2)     // Catch:{ JSONException -> 0x04fa }
            com.google.protobuf.bv r2 = r4.build()     // Catch:{ JSONException -> 0x04fa }
            com.google.a.a.h r2 = (com.google.p335a.p336a.C6586h) r2     // Catch:{ JSONException -> 0x04fa }
            r0.f396169u = r2     // Catch:{ JSONException -> 0x04fa }
            com.google.android.libraries.abuse.reporting.ReportAbuseActivity r0 = r1.f396272b     // Catch:{ JSONException -> 0x04fa }
            com.google.android.libraries.abuse.reporting.n r2 = new com.google.android.libraries.abuse.reporting.n     // Catch:{ JSONException -> 0x04fa }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x04fa }
            r0.mo123518p(r2)     // Catch:{ JSONException -> 0x04fa }
            return
        L_0x04f2:
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x04fa }
            java.lang.String r2 = "Error parsing JSON - options list is empty."
            r0.<init>(r2)     // Catch:{ JSONException -> 0x04fa }
            throw r0     // Catch:{ JSONException -> 0x04fa }
        L_0x04fa:
            r0 = move-exception
            com.google.android.libraries.abuse.reporting.ReportAbuseActivity r2 = r1.f396272b
            r3 = 1000(0x3e8, float:1.401E-42)
            r2.mo123512k(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.abuse.reporting.C146746o.mo123571b(java.lang.String):void");
    }
}
