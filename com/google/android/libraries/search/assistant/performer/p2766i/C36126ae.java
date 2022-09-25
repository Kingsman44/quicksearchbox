package com.google.android.libraries.search.assistant.performer.p2766i;

import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.android.libraries.search.assistant.performer.p2767j.C36186h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36187i;
import com.google.assistant.p3897e.p3899b.p3901b.C50875b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.ae */
/* compiled from: PG */
public final class C36126ae implements C35472h {

    /* renamed from: a */
    public final C36186h f94464a;

    public C36126ae(C36187i iVar, C35470f fVar) {
        this.f94464a = iVar.mo40004a(fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m64530b(java.lang.String r6, com.google.assistant.p3897e.p3899b.p3901b.C50875b r7) {
        /*
            android.net.Uri r0 = android.net.Uri.parse(r6)
            java.lang.String r1 = r0.getHost()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r0.getScheme()
            java.lang.String r4 = "clock-app"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r0.getLastPathSegment()
            if (r1 == 0) goto L_0x0020
            r1 = 1
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r6
            java.lang.String r6 = "Invalid alarm id %s"
            java.lang.String r6 = java.lang.String.format(r6, r4)
            com.google.android.libraries.search.assistant.performer.p2766i.C36128ag.m64537e(r1, r6)
            android.net.Uri$Builder r6 = r0.buildUpon()
            java.lang.String r1 = "edit"
            android.net.Uri$Builder r6 = r6.appendPath(r1)
            int r1 = r7.f132465a
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0076
            com.google.assistant.e.j.ql r1 = r7.f132470f
            if (r1 != 0) goto L_0x004c
            com.google.assistant.e.j.ql r1 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x004c:
            int r4 = r1.f137515b     // Catch:{ DateTimeException -> 0x006f }
            int r1 = r1.f137516c     // Catch:{ DateTimeException -> 0x006f }
            j$.time.LocalTime r1 = p3186j$.time.LocalTime.m71211of(r4, r1)     // Catch:{ DateTimeException -> 0x006f }
            int r4 = r1.getHour()
            java.lang.String r4 = java.lang.Integer.toString(r4)
            java.lang.String r5 = "hour"
            r6.appendQueryParameter(r5, r4)
            int r1 = r1.getMinute()
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r4 = "minute"
            r6.appendQueryParameter(r4, r1)
            goto L_0x0076
        L_0x006f:
            r6 = move-exception
            com.google.android.libraries.search.assistant.performer.a.g r7 = new com.google.android.libraries.search.assistant.performer.a.g
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        L_0x0076:
            int r1 = r7.f132466b
            r4 = 6
            java.lang.String r5 = "dayOfWeek"
            if (r1 != r4) goto L_0x009f
            java.lang.Object r1 = r7.f132467c
            com.google.assistant.e.j.qf r1 = (com.google.assistant.p3897e.p3921j.C52397qf) r1
            com.google.protobuf.ch r1 = r1.f137496d
            java.util.Iterator r1 = r1.iterator()
        L_0x0087:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00a7
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.String r4 = com.google.android.libraries.search.assistant.performer.p2766i.C36128ag.m64536d(r4)
            r6.appendQueryParameter(r5, r4)
            goto L_0x0087
        L_0x009f:
            r4 = 5
            if (r1 != r4) goto L_0x00a7
            java.lang.String r1 = ""
            r6.appendQueryParameter(r5, r1)
        L_0x00a7:
            int r1 = r7.f132465a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00b4
            java.lang.String r1 = "message"
            java.lang.String r4 = r7.f132469e
            r6.appendQueryParameter(r1, r4)
        L_0x00b4:
            int r1 = r7.f132465a
            r1 = r1 & 64
            if (r1 == 0) goto L_0x0115
            int r1 = r7.f132471g
            com.google.assistant.e.i.a.h r1 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.m86180a(r1)
            if (r1 != 0) goto L_0x00c4
            com.google.assistant.e.i.a.h r1 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.UNKNOWN_ALARM_STATUS
        L_0x00c4:
            com.google.assistant.e.i.a.h r4 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.DISABLED
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00e1
            int r1 = r7.f132471g
            com.google.assistant.e.i.a.h r1 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.m86180a(r1)
            if (r1 != 0) goto L_0x00d6
            com.google.assistant.e.i.a.h r1 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.UNKNOWN_ALARM_STATUS
        L_0x00d6:
            com.google.assistant.e.i.a.h r4 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.SCHEDULED
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00df
            goto L_0x00e1
        L_0x00df:
            r1 = 0
            goto L_0x00e2
        L_0x00e1:
            r1 = 1
        L_0x00e2:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r4 = r7.f132471g
            com.google.assistant.e.i.a.h r4 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.m86180a(r4)
            if (r4 != 0) goto L_0x00ee
            com.google.assistant.e.i.a.h r4 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.UNKNOWN_ALARM_STATUS
        L_0x00ee:
            java.lang.String r4 = r4.name()
            r2[r3] = r4
            java.lang.String r3 = "Invalid alarm_status_mutation %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            com.google.android.libraries.search.assistant.performer.p2766i.C36128ag.m64537e(r1, r2)
            int r7 = r7.f132471g
            com.google.assistant.e.i.a.h r7 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.m86180a(r7)
            if (r7 != 0) goto L_0x0107
            com.google.assistant.e.i.a.h r7 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.UNKNOWN_ALARM_STATUS
        L_0x0107:
            com.google.assistant.e.i.a.h r1 = com.google.assistant.p3897e.p3917i.p3918a.C51419h.SCHEDULED
            if (r7 != r1) goto L_0x010e
            java.lang.String r7 = "true"
            goto L_0x0110
        L_0x010e:
            java.lang.String r7 = "false"
        L_0x0110:
            java.lang.String r1 = "enabled"
            r6.appendQueryParameter(r1, r7)
        L_0x0115:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r7 = r7.setAction(r1)
            android.net.Uri r6 = r6.build()
            android.content.Intent r6 = r7.setData(r6)
            java.lang.String r7 = r0.getHost()
            android.content.Intent r6 = r6.setPackage(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.p2766i.C36126ae.m64530b(java.lang.String, com.google.assistant.e.b.b.b):android.content.Intent");
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        return C36183e.m64583a(dyVar, "mutate_alarm_args", C50875b.f132463h.getParserForType(), new C36125ad(this));
    }
}
