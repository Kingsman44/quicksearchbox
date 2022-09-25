package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ej */
/* compiled from: PG */
final class C112838ej implements C112849eu {

    /* renamed from: a */
    final /* synthetic */ C113321r f312749a;

    /* renamed from: b */
    final /* synthetic */ C112851ew f312750b;

    public C112838ej(C112851ew ewVar, C113321r rVar) {
        this.f312750b = ewVar;
        this.f312749a = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009d, code lost:
        if (r1.f312794e.mo85355d(r1.f312791b, r5) != false) goto L_0x00f4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99752a(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.r r2 = r0.f312749a
            java.lang.String r2 = r2.f313835b
            boolean r2 = r2.isEmpty()
            java.lang.String r3 = "Fail to send message"
            r4 = 1
            if (r2 == 0) goto L_0x001d
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.ew r1 = r0.f312750b
            android.content.Context r1 = r1.f312791b
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r3, r4)
            r1.show()
            return
        L_0x001d:
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.r r2 = r0.f312749a
            java.lang.String r2 = r2.f313839f
            java.lang.String r5 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            boolean r2 = android.text.TextUtils.equals(r2, r5)
            java.lang.String r9 = "com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"
            java.lang.String r10 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            java.lang.String r11 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r12 = "EXPECT_EXTERNAL_APP_UI"
            java.lang.String r13 = "com.google.android.voicesearch.extra.RECIPIENT_CONTACT_NAME"
            java.lang.String r14 = "android.intent.extra.TEXT"
            java.lang.String r15 = "text/plain"
            java.lang.String r5 = "com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS"
            r7 = 0
            if (r2 == 0) goto L_0x00ac
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.r r2 = r0.f312749a
            java.lang.String r2 = r2.f313835b
            java.lang.String r8 = ""
            if (r2 != 0) goto L_0x0043
            goto L_0x0049
        L_0x0043:
            java.lang.String r6 = "+"
            java.lang.String r8 = r2.replace(r6, r8)
        L_0x0049:
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 == 0) goto L_0x0051
            r5 = 0
            goto L_0x0091
        L_0x0051:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r5)
            java.lang.String r5 = "com.whatsapp"
            android.content.Intent r5 = r2.setPackage(r5)
            android.content.Intent r5 = r5.setType(r15)
            android.content.Intent r5 = r5.putExtra(r13, r8)
            android.content.Intent r1 = r5.putExtra(r14, r1)
            android.content.Intent r1 = r1.putExtra(r12, r7)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r7] = r8
            java.lang.String r6 = "%s@s.whatsapp.net"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            android.content.Intent r1 = r1.putExtra(r9, r5)
            android.content.Intent r1 = r1.putExtra(r11, r10)
            r5 = 262144(0x40000, float:3.67342E-40)
            android.content.Intent r1 = r1.addFlags(r5)
            r5 = 32768(0x8000, float:4.5918E-41)
            android.content.Intent r1 = r1.addFlags(r5)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r5)
            r5 = r2
        L_0x0091:
            if (r5 == 0) goto L_0x00a0
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.ew r1 = r0.f312750b
            com.google.android.apps.gsa.shared.util.s.a r2 = r1.f312794e
            android.content.Context r1 = r1.f312791b
            boolean r1 = r2.mo85355d(r1, r5)
            if (r1 == 0) goto L_0x00a0
            goto L_0x00f4
        L_0x00a0:
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.ew r1 = r0.f312750b
            android.content.Context r1 = r1.f312791b
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r3, r4)
            r1.show()
            return
        L_0x00ac:
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.r r2 = r0.f312749a
            java.lang.String r2 = r2.f313835b
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x00b8
            r5 = 0
            goto L_0x00f4
        L_0x00b8:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r5)
            android.content.Intent r5 = r6.setType(r15)
            java.lang.String r6 = "com.google.android.apps.messaging"
            android.content.Intent r5 = r5.setPackage(r6)
            android.content.Intent r1 = r5.putExtra(r14, r1)
            android.content.Intent r1 = r1.putExtra(r13, r2)
            android.content.Intent r1 = r1.putExtra(r12, r7)
            android.content.Intent r1 = r1.putExtra(r11, r10)
            android.content.Intent r1 = r1.putExtra(r9, r2)
            java.lang.String r2 = "EXPECT_EXTERNAL_CONFIRMATION"
            android.content.Intent r1 = r1.putExtra(r2, r7)
            r2 = 32768(0x8000, float:4.5918E-41)
            android.content.Intent r1 = r1.addFlags(r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r1 = r1.addFlags(r2)
            r2 = 262144(0x40000, float:3.67342E-40)
            android.content.Intent r5 = r1.addFlags(r2)
        L_0x00f4:
            if (r5 == 0) goto L_0x0100
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.ew r1 = r0.f312750b
            com.google.android.apps.gsa.assistant.shared.p.l r1 = r1.f312795f
            boolean r1 = r1.i(r5)
            if (r1 != 0) goto L_0x010b
        L_0x0100:
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.ew r1 = r0.f312750b
            android.content.Context r1 = r1.f312791b
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r3, r4)
            r1.show()
        L_0x010b:
            com.google.android.apps.gsa.staticplugins.opa.tapas.m.ew r1 = r0.f312750b
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.dp r1 = r1.f312799j
            r1.mo99375jB()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112838ej.mo99752a(java.lang.String):void");
    }
}
