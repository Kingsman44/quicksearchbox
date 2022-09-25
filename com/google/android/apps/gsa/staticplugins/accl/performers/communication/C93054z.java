package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.z */
/* compiled from: PG */
public final /* synthetic */ class C93054z implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259569a;

    /* renamed from: b */
    public final /* synthetic */ C51098gh f259570b;

    /* renamed from: c */
    public final /* synthetic */ String f259571c;

    /* renamed from: d */
    public final /* synthetic */ String f259572d;

    /* renamed from: e */
    public final /* synthetic */ String f259573e;

    /* renamed from: f */
    public final /* synthetic */ C52321nk f259574f;

    public /* synthetic */ C93054z(ChatPerformer chatPerformer, C51098gh ghVar, String str, String str2, String str3, C52321nk nkVar) {
        this.f259569a = chatPerformer;
        this.f259570b = ghVar;
        this.f259571c = str;
        this.f259572d = str2;
        this.f259573e = str3;
        this.f259574f = nkVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer r10 = r0.f259569a
            com.google.assistant.e.c.c.gh r11 = r0.f259570b
            java.lang.String r12 = r0.f259571c
            java.lang.String r13 = r0.f259572d
            java.lang.String r6 = r0.f259573e
            com.google.assistant.e.j.nk r1 = r0.f259574f
            r14 = r20
            com.google.common.b.gu r14 = (com.google.common.p4522b.C58485gu) r14
            if (r14 == 0) goto L_0x0200
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto L_0x0200
            int r2 = r11.f133012b
            r15 = 1
            if (r2 != r15) goto L_0x0024
            java.lang.Object r2 = r11.f133013c
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            goto L_0x0026
        L_0x0024:
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0026:
            java.lang.String r2 = r2.f132944b
            boolean r3 = r2.isEmpty()
            r9 = 0
            if (r3 == 0) goto L_0x0059
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer.f259389a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "Empty provider, send MMS message"
            r3 = 13166(0x336e, float:1.845E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.gsa.search.core.al.dt.a r1 = new com.google.android.apps.gsa.search.core.al.dt.a
            r1.<init>()
            java.lang.String r2 = "image/png"
            r1.f231280a = r2
            java.lang.String[] r2 = new java.lang.String[r15]
            r2[r9] = r12
            r1.f231283d = r2
            r1.f231281b = r13
            r1.f231282c = r14
            com.google.android.apps.gsa.search.core.al.dt.b r1 = r1.mo78984a()
            com.google.common.util.concurrent.cx r1 = r10.mo87501d(r1, r15)
            goto L_0x01d9
        L_0x0059:
            java.lang.String r8 = "com.whatsapp"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x0089
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer$ResultReceiverCallback r2 = new com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer$ResultReceiverCallback
            r2.<init>()
            r10.f259398j = r2
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r2)
            boolean r5 = r1.f137335h
            r16 = 1
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r17 = r5
            r5 = r14
            r18 = r8
            r8 = r17
            r9 = r16
            boolean r1 = r1.mo87507k(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x008b
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer$ResultReceiverCallback r1 = r10.f259398j
            com.google.common.util.concurrent.SettableFuture r1 = r1.f259412a
            goto L_0x01d9
        L_0x0089:
            r18 = r8
        L_0x008b:
            com.google.assistant.e.j.nk r1 = r10.f259392d
            if (r1 == 0) goto L_0x01da
            int r2 = r11.f133012b
            if (r2 != r15) goto L_0x0098
            java.lang.Object r2 = r11.f133013c
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            goto L_0x009a
        L_0x0098:
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x009a:
            java.lang.String r2 = r2.f132944b
            java.lang.String r1 = com.google.android.apps.gsa.staticplugins.accl.performers.communication.C92998ai.m153057b(r1)
            r3 = 0
            java.lang.Object r4 = r14.get(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.String r4 = r4.getPath()
            if (r4 == 0) goto L_0x0148
            java.lang.String r5 = "."
            boolean r6 = r4.contains(r5)
            if (r6 != 0) goto L_0x00b7
            goto L_0x0148
        L_0x00b7:
            int r5 = r4.lastIndexOf(r5)
            int r5 = r5 + r15
            java.lang.String r4 = r4.substring(r5)
            java.lang.String r4 = com.google.common.base.C58890d.m90988c(r4)
            int r5 = r4.hashCode()
            switch(r5) {
                case 96710: goto L_0x0128;
                case 105441: goto L_0x011e;
                case 106458: goto L_0x0114;
                case 108272: goto L_0x010a;
                case 108273: goto L_0x0100;
                case 110810: goto L_0x00f5;
                case 111145: goto L_0x00eb;
                case 117484: goto L_0x00e1;
                case 3268712: goto L_0x00d7;
                case 3645340: goto L_0x00cd;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            goto L_0x0133
        L_0x00cd:
            java.lang.String r5 = "webp"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0133
            r9 = 3
            goto L_0x0134
        L_0x00d7:
            java.lang.String r5 = "jpeg"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0133
            r9 = 2
            goto L_0x0134
        L_0x00e1:
            java.lang.String r5 = "wav"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0133
            r9 = 7
            goto L_0x0134
        L_0x00eb:
            java.lang.String r5 = "png"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0133
            r9 = 0
            goto L_0x0134
        L_0x00f5:
            java.lang.String r5 = "pcm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0133
            r9 = 8
            goto L_0x0134
        L_0x0100:
            java.lang.String r5 = "mp4"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0133
            r9 = 5
            goto L_0x0134
        L_0x010a:
            java.lang.String r5 = "mp3"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0133
            r9 = 4
            goto L_0x0134
        L_0x0114:
            java.lang.String r5 = "m4a"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0133
            r9 = 6
            goto L_0x0134
        L_0x011e:
            java.lang.String r5 = "jpg"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0133
            r9 = 1
            goto L_0x0134
        L_0x0128:
            java.lang.String r5 = "amr"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0133
            r9 = 9
            goto L_0x0134
        L_0x0133:
            r9 = -1
        L_0x0134:
            switch(r9) {
                case 0: goto L_0x0141;
                case 1: goto L_0x0141;
                case 2: goto L_0x0141;
                case 3: goto L_0x0141;
                case 4: goto L_0x013a;
                case 5: goto L_0x013a;
                case 6: goto L_0x013a;
                case 7: goto L_0x013a;
                case 8: goto L_0x013a;
                case 9: goto L_0x013a;
                default: goto L_0x0137;
            }
        L_0x0137:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            goto L_0x014a
        L_0x013a:
            java.lang.String r4 = "audio/*"
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            goto L_0x014a
        L_0x0141:
            java.lang.String r4 = "image/*"
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90834k(r4)
            goto L_0x014a
        L_0x0148:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
        L_0x014a:
            r5 = r18
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x01da
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0170
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x01da
            java.lang.String r1 = "+"
            java.lang.String r2 = ""
            java.lang.String r1 = r12.replace(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r2[r3] = r1
            java.lang.String r1 = "%s@s.whatsapp.net"
            java.lang.String r1 = java.lang.String.format(r1, r2)
        L_0x0170:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.MAIN"
            r2.<init>(r6)
            java.lang.String r6 = "jid"
            android.content.Intent r1 = r2.putExtra(r6, r1)
            java.lang.String r6 = "android.intent.extra.TEXT"
            android.content.Intent r1 = r1.putExtra(r6, r13)
            boolean r6 = r14.isEmpty()
            if (r6 == 0) goto L_0x018c
            java.lang.String r4 = "text/plain"
            goto L_0x0192
        L_0x018c:
            java.lang.Object r4 = r4.mo56107c()
            java.lang.String r4 = (java.lang.String) r4
        L_0x0192:
            android.content.Intent r1 = r1.setType(r4)
            r1.setPackage(r5)
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto L_0x01cb
            int r1 = r14.size()
            java.lang.String r4 = "android.intent.extra.STREAM"
            if (r1 <= r15) goto L_0x01b9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.addAll(r14)
            java.lang.String r3 = "android.intent.action.SEND_MULTIPLE"
            android.content.Intent r3 = r2.setAction(r3)
            r3.putParcelableArrayListExtra(r4, r1)
            goto L_0x01c8
        L_0x01b9:
            java.lang.String r1 = "android.intent.action.SEND"
            android.content.Intent r1 = r2.setAction(r1)
            java.lang.Object r3 = r14.get(r3)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            r1.putExtra(r4, r3)
        L_0x01c8:
            r2.addFlags(r15)
        L_0x01cb:
            com.google.android.libraries.gsa.conversation.h.ah r1 = r10.f259390b
            boolean r1 = r1.mo27807a(r2)
            if (r1 == 0) goto L_0x01da
            com.google.android.apps.gsa.x.c r1 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x01d9:
            return r1
        L_0x01da:
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.ae r2 = new com.google.android.apps.gsa.staticplugins.accl.performers.communication.ae
            r2.<init>(r10)
            r1.post(r2)
            dagger.a r1 = r10.f259394f
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_SEND_MSG_FAILED
            r1.mo83702b(r2)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Failed to send screenshot via private or public API."
            r1.<init>(r2)
            throw r1
        L_0x0200:
            dagger.a r1 = r10.f259394f
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CHAT_PERFORMER_NO_IMAGE_URI
            r1.mo83702b(r2)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "No image to share."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.communication.C93054z.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
