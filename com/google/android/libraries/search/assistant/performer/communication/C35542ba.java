package com.google.android.libraries.search.assistant.performer.communication;

import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ba */
/* compiled from: PG */
public final /* synthetic */ class C35542ba implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ ChatMessageExecutor f93335a;

    /* renamed from: b */
    public final /* synthetic */ C51098gh f93336b;

    /* renamed from: c */
    public final /* synthetic */ String f93337c;

    /* renamed from: d */
    public final /* synthetic */ String f93338d;

    /* renamed from: e */
    public final /* synthetic */ C52321nk f93339e;

    /* renamed from: f */
    public final /* synthetic */ String f93340f;

    public /* synthetic */ C35542ba(ChatMessageExecutor chatMessageExecutor, C51098gh ghVar, String str, String str2, C52321nk nkVar, String str3) {
        this.f93335a = chatMessageExecutor;
        this.f93336b = ghVar;
        this.f93337c = str;
        this.f93338d = str2;
        this.f93339e = nkVar;
        this.f93340f = str3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.android.libraries.search.assistant.performer.communication.ChatMessageExecutor r1 = r11.f93335a
            com.google.assistant.e.c.c.gh r2 = r11.f93336b
            java.lang.String r4 = r11.f93337c
            java.lang.String r5 = r11.f93338d
            com.google.assistant.e.j.nk r3 = r11.f93339e
            java.lang.String r7 = r11.f93340f
            r6 = r12
            com.google.common.b.gu r6 = (com.google.common.p4522b.C58485gu) r6
            if (r6 == 0) goto L_0x01db
            boolean r12 = r6.isEmpty()
            if (r12 != 0) goto L_0x01db
            int r12 = r2.f133012b
            r0 = 1
            if (r12 != r0) goto L_0x0021
            java.lang.Object r12 = r2.f133013c
            com.google.assistant.e.c.c.ev r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r12
            goto L_0x0023
        L_0x0021:
            com.google.assistant.e.c.c.ev r12 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0023:
            java.lang.String r12 = r12.f132944b
            boolean r8 = r12.isEmpty()
            if (r8 == 0) goto L_0x005a
            com.google.common.f.e r12 = com.google.android.libraries.search.assistant.performer.communication.ChatMessageExecutor.f93200a
            com.google.common.f.x r12 = r12.mo56224b()
            java.lang.String r2 = "Empty provider, send MMS message"
            r3 = 51619(0xc9a3, float:7.2334E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r3)).mo56386p(r2)
            com.google.android.libraries.search.assistant.performer.communication.db r12 = com.google.android.libraries.search.assistant.performer.communication.C35668dc.m64073e()
            r2 = r12
            com.google.android.libraries.search.assistant.performer.communication.i r2 = (com.google.android.libraries.search.assistant.performer.communication.C35763i) r2
            java.lang.String r3 = "image/png"
            r2.f93692a = r3
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89846n(r4)
            r12.mo39788d(r3)
            r12.mo39789e(r5)
            r2.f93694c = r6
            com.google.android.libraries.search.assistant.performer.communication.dc r12 = r12.mo39790f()
            com.google.common.util.concurrent.cx r12 = r1.mo39661f(r12, r0)
            goto L_0x01da
        L_0x005a:
            java.lang.String r8 = "com.whatsapp"
            boolean r12 = r8.equals(r12)
            if (r12 != 0) goto L_0x006e
            com.google.android.libraries.search.assistant.performer.communication.ay r12 = new com.google.android.libraries.search.assistant.performer.communication.ay
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.cx r12 = androidx.p104d.p105a.C2169h.m6027a(r12)
            goto L_0x01da
        L_0x006e:
            java.lang.String r12 = com.google.android.libraries.search.assistant.performer.communication.C35547bf.m63904b(r3)
            int r3 = r2.f133012b
            if (r3 != r0) goto L_0x007b
            java.lang.Object r2 = r2.f133013c
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            goto L_0x007d
        L_0x007b:
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x007d:
            java.lang.String r2 = r2.f132944b
            r3 = 0
            java.lang.Object r7 = r6.get(r3)
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r7 = r7.getPath()
            if (r7 == 0) goto L_0x0129
            java.lang.String r9 = "."
            boolean r10 = r7.contains(r9)
            if (r10 != 0) goto L_0x0096
            goto L_0x0129
        L_0x0096:
            int r9 = r7.lastIndexOf(r9)
            int r9 = r9 + r0
            java.lang.String r7 = r7.substring(r9)
            java.lang.String r7 = com.google.common.base.C58890d.m90988c(r7)
            int r9 = r7.hashCode()
            switch(r9) {
                case 96710: goto L_0x0107;
                case 105441: goto L_0x00fd;
                case 106458: goto L_0x00f3;
                case 108272: goto L_0x00e9;
                case 108273: goto L_0x00df;
                case 110810: goto L_0x00d4;
                case 111145: goto L_0x00ca;
                case 117484: goto L_0x00c0;
                case 3268712: goto L_0x00b6;
                case 3645340: goto L_0x00ac;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            goto L_0x0112
        L_0x00ac:
            java.lang.String r9 = "webp"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0112
            r7 = 3
            goto L_0x0113
        L_0x00b6:
            java.lang.String r9 = "jpeg"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0112
            r7 = 2
            goto L_0x0113
        L_0x00c0:
            java.lang.String r9 = "wav"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0112
            r7 = 7
            goto L_0x0113
        L_0x00ca:
            java.lang.String r9 = "png"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0112
            r7 = 0
            goto L_0x0113
        L_0x00d4:
            java.lang.String r9 = "pcm"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0112
            r7 = 8
            goto L_0x0113
        L_0x00df:
            java.lang.String r9 = "mp4"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0112
            r7 = 5
            goto L_0x0113
        L_0x00e9:
            java.lang.String r9 = "mp3"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0112
            r7 = 4
            goto L_0x0113
        L_0x00f3:
            java.lang.String r9 = "m4a"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0112
            r7 = 6
            goto L_0x0113
        L_0x00fd:
            java.lang.String r9 = "jpg"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0112
            r7 = 1
            goto L_0x0113
        L_0x0107:
            java.lang.String r9 = "amr"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0112
            r7 = 9
            goto L_0x0113
        L_0x0112:
            r7 = -1
        L_0x0113:
            switch(r7) {
                case 0: goto L_0x0122;
                case 1: goto L_0x0122;
                case 2: goto L_0x0122;
                case 3: goto L_0x0122;
                case 4: goto L_0x011b;
                case 5: goto L_0x011b;
                case 6: goto L_0x011b;
                case 7: goto L_0x011b;
                case 8: goto L_0x011b;
                case 9: goto L_0x011b;
                default: goto L_0x0116;
            }
        L_0x0116:
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            goto L_0x012d
        L_0x011b:
            java.lang.String r7 = "audio/*"
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            goto L_0x012d
        L_0x0122:
            java.lang.String r7 = "image/*"
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            goto L_0x012d
        L_0x0129:
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
        L_0x012d:
            boolean r9 = r8.equals(r2)
            java.lang.String r10 = "Package not supported: "
            if (r9 != 0) goto L_0x0148
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r10.concat(r0)
            r12.<init>(r0)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92899h(r12)
            goto L_0x01da
        L_0x0148:
            boolean r9 = android.text.TextUtils.isEmpty(r12)
            if (r9 == 0) goto L_0x0179
            boolean r12 = android.text.TextUtils.isEmpty(r4)
            if (r12 != 0) goto L_0x0167
            java.lang.String r12 = "+"
            java.lang.String r2 = ""
            java.lang.String r12 = r4.replace(r12, r2)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r2[r3] = r12
            java.lang.String r12 = "%s@s.whatsapp.net"
            java.lang.String r12 = java.lang.String.format(r12, r2)
            goto L_0x0179
        L_0x0167:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r10.concat(r0)
            r12.<init>(r0)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92899h(r12)
            goto L_0x01da
        L_0x0179:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.MAIN"
            r2.<init>(r4)
            java.lang.String r4 = "jid"
            android.content.Intent r12 = r2.putExtra(r4, r12)
            java.lang.String r4 = "android.intent.extra.TEXT"
            android.content.Intent r12 = r12.putExtra(r4, r5)
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L_0x0195
            java.lang.String r4 = "text/plain"
            goto L_0x019b
        L_0x0195:
            java.lang.Object r4 = r7.get()
            java.lang.String r4 = (java.lang.String) r4
        L_0x019b:
            android.content.Intent r12 = r12.setType(r4)
            r12.setPackage(r8)
            boolean r12 = r6.isEmpty()
            if (r12 != 0) goto L_0x01d4
            int r12 = r6.size()
            java.lang.String r4 = "android.intent.extra.STREAM"
            if (r12 <= r0) goto L_0x01c2
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r12.addAll(r6)
            java.lang.String r3 = "android.intent.action.SEND_MULTIPLE"
            android.content.Intent r3 = r2.setAction(r3)
            r3.putParcelableArrayListExtra(r4, r12)
            goto L_0x01d1
        L_0x01c2:
            java.lang.String r12 = "android.intent.action.SEND"
            android.content.Intent r12 = r2.setAction(r12)
            java.lang.Object r3 = r6.get(r3)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r12.putExtra(r4, r3)
        L_0x01d1:
            r2.addFlags(r0)
        L_0x01d4:
            com.google.android.libraries.search.assistant.performer.a.f r12 = r1.f93201b
            com.google.common.util.concurrent.cx r12 = r12.mo20101f(r2)
        L_0x01da:
            return r12
        L_0x01db:
            com.google.android.libraries.search.b.b r12 = r1.f93204e
            com.google.android.libraries.search.b.i.f r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97078ek
            com.google.net.a.a.b r1 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            com.google.android.libraries.search.b.i.a r0 = r0.mo40805c(r1)
            r12.mo19974a(r0)
            com.google.common.base.dd r12 = new com.google.common.base.dd
            java.lang.String r0 = "No image to share."
            r12.<init>((java.lang.String) r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.communication.C35542ba.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
