package com.google.android.libraries.search.assistant.performer.communication;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.p104d.p105a.C2164c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.assistant.performer.communication.p2740e.C35697e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2753e.C35990c;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36188j;
import com.google.android.libraries.search.assistant.performer.p2767j.C36195q;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class ChatMessageExecutor {

    /* renamed from: a */
    public static final C59071e f93200a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.ChatMessageExecutor");

    /* renamed from: b */
    public final C35470f f93201b;

    /* renamed from: c */
    public final Context f93202c;

    /* renamed from: d */
    public final C46428ao f93203d;

    /* renamed from: e */
    public final C37215b f93204e;

    /* renamed from: f */
    private final C36195q f93205f;

    /* renamed from: g */
    private final C60888db f93206g;

    /* renamed from: h */
    private final PackageManager f93207h;

    /* renamed from: i */
    private final C35697e f93208i;

    /* renamed from: j */
    private final C35674di f93209j;

    /* renamed from: k */
    private final C35990c f93210k;

    /* compiled from: PG */
    final class ResultReceiverCallback extends ResultReceiver {

        /* renamed from: a */
        public final C2164c f93211a;

        public ResultReceiverCallback(C46428ao aoVar, C2164c cVar) {
            super(aoVar);
            this.f93211a = cVar;
        }

        /* access modifiers changed from: protected */
        public final void onReceiveResult(int i, Bundle bundle) {
            if (i == 0) {
                this.f93211a.mo5437b((Object) null);
                return;
            }
            String string = (bundle == null || !bundle.containsKey("com.google.android.voicesearch.extra.ERROR_MESSAGE")) ? "Unknown error" : bundle.getString("com.google.android.voicesearch.extra.ERROR_MESSAGE");
            C2164c cVar = this.f93211a;
            cVar.mo5439d(new RuntimeException("Unknown error. ResultCode: " + i + " ErrorMessage: " + string));
        }
    }

    public ChatMessageExecutor(Context context, C36195q qVar, C60888db dbVar, C46428ao aoVar, PackageManager packageManager, C35470f fVar, C35697e eVar, C35674di diVar, C35990c cVar, C37215b bVar) {
        this.f93201b = fVar;
        this.f93202c = context;
        this.f93205f = qVar;
        this.f93206g = dbVar;
        this.f93207h = packageManager;
        this.f93203d = aoVar;
        this.f93208i = eVar;
        this.f93209j = diVar;
        this.f93210k = cVar;
        this.f93204e = bVar;
    }

    /* renamed from: a */
    public static C52070ec m63829a(C52235kf kfVar, String str) {
        return C36180b.m64579c(kfVar, "Send chat message failed. Error: ".concat(str));
    }

    /* renamed from: g */
    public static Optional m63830g(int i) {
        int i2 = i - 2;
        if (i2 == -1 || i2 == 0) {
            return Optional.empty();
        }
        return Optional.m71637of("message.text");
    }

    /* renamed from: h */
    public static void m63831h(C60870cx cxVar, C2164c cVar) {
        C35544bc bcVar = new C35544bc(cVar);
        C60856cj.m92911t(cxVar, C47810es.m84974n(bcVar), C60826bg.f164896a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.common.util.concurrent.C60870cx m63832i(com.google.assistant.p3897e.p3921j.C52321nk r10, java.lang.String r11, java.lang.String r12, boolean r13, p3186j$.util.Optional r14, p3186j$.util.Optional r15) {
        /*
            r9 = this;
            com.google.assistant.e.c.c.gh r0 = r10.f137333f
            if (r0 != 0) goto L_0x0006
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0006:
            r3 = r0
            com.google.assistant.e.j.pj r0 = r10.f137331d
            if (r0 != 0) goto L_0x000d
            com.google.assistant.e.j.pj r0 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x000d:
            int r1 = r0.f137437b
            r2 = 2
            java.lang.String r4 = ""
            if (r1 != r2) goto L_0x001a
            java.lang.Object r0 = r0.f137438c
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            goto L_0x001b
        L_0x001a:
            r5 = r4
        L_0x001b:
            java.lang.String r0 = com.google.android.libraries.search.assistant.performer.communication.C35547bf.m63904b(r10)
            int r1 = r3.f133012b
            r8 = 1
            if (r1 != r8) goto L_0x0029
            java.lang.Object r1 = r3.f133013c
            com.google.assistant.e.c.c.ev r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r1
            goto L_0x002b
        L_0x0029:
            com.google.assistant.e.c.c.ev r1 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x002b:
            java.lang.String r1 = r1.f132944b
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x008a
            com.google.common.f.e r10 = f93200a
            com.google.common.f.x r11 = r10.mo56224b()
            java.lang.String r14 = "Empty provider, send text message"
            r15 = 51630(0xc9ae, float:7.2349E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r15)).mo56386p(r14)
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 == 0) goto L_0x006b
            com.google.common.f.x r10 = r10.mo56225c()
            java.lang.String r11 = "Invalid args without recipient phone number."
            r12 = 51631(0xc9af, float:7.235E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56386p(r11)
            com.google.android.libraries.search.b.b r10 = r9.f93204e
            com.google.android.libraries.search.b.i.f r11 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97077ej
            com.google.net.a.a.b r12 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            com.google.android.libraries.search.b.i.a r11 = r11.mo40805c(r12)
            r10.mo19974a(r11)
            com.google.assistant.e.j.kf r10 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r10 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r10)
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60856cj.m92900i(r10)
            return r10
        L_0x006b:
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89846n(r5)
            com.google.android.libraries.search.assistant.performer.communication.db r11 = com.google.android.libraries.search.assistant.performer.communication.C35668dc.m64073e()
            r14 = r11
            com.google.android.libraries.search.assistant.performer.communication.i r14 = (com.google.android.libraries.search.assistant.performer.communication.C35763i) r14
            java.lang.String r15 = "text/plain"
            r14.f93692a = r15
            r11.mo39788d(r10)
            r11.mo39789e(r12)
            com.google.android.libraries.search.assistant.performer.communication.dc r10 = r11.mo39790f()
            com.google.common.util.concurrent.cx r10 = r9.mo39661f(r10, r13)
            goto L_0x0202
        L_0x008a:
            java.lang.String r2 = "com.google.android.talk"
            boolean r6 = com.google.common.base.C58890d.m90990e(r2, r1)
            if (r6 == 0) goto L_0x0128
            boolean r10 = android.text.TextUtils.isEmpty(r11)
            if (r10 == 0) goto L_0x00be
            com.google.common.f.e r10 = f93200a
            com.google.common.f.x r10 = r10.mo56225c()
            java.lang.String r11 = "Invalid args without sender Email."
            r12 = 51629(0xc9ad, float:7.2348E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56386p(r11)
            com.google.android.libraries.search.b.b r10 = r9.f93204e
            com.google.android.libraries.search.b.i.f r11 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97077ej
            com.google.net.a.a.b r12 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            com.google.android.libraries.search.b.i.a r11 = r11.mo40805c(r12)
            r10.mo19974a(r11)
            com.google.assistant.e.j.kf r10 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r10 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r10)
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60856cj.m92900i(r10)
            return r10
        L_0x00be:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x0102
            android.content.Intent r10 = new android.content.Intent
            java.lang.String r13 = "android.intent.action.SENDTO"
            r10.<init>(r13)
            java.lang.String r13 = "vnd.google.android.hangouts/vnd.google.android.hangout_privileged"
            android.content.Intent r10 = r10.setType(r13)
            android.content.Intent r10 = r10.setPackage(r2)
            java.lang.String r13 = "account_name"
            android.content.Intent r10 = r10.putExtra(r13, r11)
            java.lang.String r11 = "participant_gaia"
            android.content.Intent r10 = r10.putExtra(r11, r0)
            java.lang.String r11 = "android.intent.extra.TEXT"
            android.content.Intent r10 = r10.putExtra(r11, r12)
            r11 = 32768(0x8000, float:4.5918E-41)
            android.content.Intent r10 = r10.addFlags(r11)
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r10 = r10.addFlags(r11)
            r11 = 262144(0x40000, float:3.67342E-40)
            android.content.Intent r10 = r10.addFlags(r11)
            com.google.android.libraries.search.assistant.performer.a.f r11 = r9.f93201b
            com.google.common.util.concurrent.cx r10 = r11.mo20101f(r10)
            goto L_0x0202
        L_0x0102:
            com.google.common.f.e r10 = f93200a
            com.google.common.f.x r10 = r10.mo56225c()
            java.lang.String r11 = "Invalid args without recipient gaia."
            r12 = 51628(0xc9ac, float:7.2346E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56386p(r11)
            com.google.android.libraries.search.b.b r10 = r9.f93204e
            com.google.android.libraries.search.b.i.f r11 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97077ej
            com.google.net.a.a.b r12 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            com.google.android.libraries.search.b.i.a r11 = r11.mo40805c(r12)
            r10.mo19974a(r11)
            com.google.assistant.e.j.kf r10 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r10 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r10)
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60856cj.m92900i(r10)
            return r10
        L_0x0128:
            java.lang.String r2 = "com.whatsapp"
            boolean r2 = com.google.common.base.C58890d.m90990e(r2, r1)
            if (r2 == 0) goto L_0x0141
            if (r13 == 0) goto L_0x0141
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            r1 = r9
            r2 = r3
            r3 = r0
            r4 = r5
            r5 = r12
            com.google.common.util.concurrent.cx r10 = r1.mo39660e(r2, r3, r4, r5, r6)
            goto L_0x0202
        L_0x0141:
            java.lang.String r0 = "com.google.android.apps.dynamite"
            boolean r0 = com.google.common.base.C58890d.m90990e(r0, r1)
            if (r0 == 0) goto L_0x01f4
            boolean r0 = r15.isPresent()
            if (r0 == 0) goto L_0x01f4
            boolean r0 = r14.isPresent()
            if (r0 == 0) goto L_0x01f4
            com.google.assistant.e.j.pj r10 = r10.f137331d
            if (r10 != 0) goto L_0x015b
            com.google.assistant.e.j.pj r10 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x015b:
            int r13 = r10.f137437b
            if (r13 != r8) goto L_0x0164
            java.lang.Object r10 = r10.f137438c
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
        L_0x0164:
            java.lang.String r10 = com.google.common.base.C58890d.m90988c(r4)
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 == 0) goto L_0x0194
            com.google.common.f.e r10 = f93200a
            com.google.common.f.x r10 = r10.mo56225c()
            java.lang.String r11 = "Invalid args without sender email."
            r12 = 51627(0xc9ab, float:7.2345E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56386p(r11)
            com.google.android.libraries.search.b.b r10 = r9.f93204e
            com.google.android.libraries.search.b.i.f r11 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97077ej
            com.google.net.a.a.b r12 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            com.google.android.libraries.search.b.i.a r11 = r11.mo40805c(r12)
            r10.mo19974a(r11)
            com.google.assistant.e.j.kf r10 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r10 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r10)
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60856cj.m92900i(r10)
            return r10
        L_0x0194:
            boolean r13 = android.text.TextUtils.isEmpty(r10)
            if (r13 == 0) goto L_0x01c0
            com.google.common.f.e r10 = f93200a
            com.google.common.f.x r10 = r10.mo56225c()
            java.lang.String r11 = "Invalid args without recipient email."
            r12 = 51626(0xc9aa, float:7.2343E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56386p(r11)
            com.google.android.libraries.search.b.b r10 = r9.f93204e
            com.google.android.libraries.search.b.i.f r11 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97077ej
            com.google.net.a.a.b r12 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            com.google.android.libraries.search.b.i.a r11 = r11.mo40805c(r12)
            r10.mo19974a(r11)
            com.google.assistant.e.j.kf r10 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r10 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r10)
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60856cj.m92900i(r10)
            return r10
        L_0x01c0:
            java.lang.Object r13 = r14.get()
            com.google.android.libraries.x.a.a.b r13 = (com.google.android.libraries.p3494x.p3495a.p3496a.C44483b) r13
            java.lang.Object r14 = r15.get()
            com.google.android.libraries.search.assistant.performer.a.b r14 = (com.google.android.libraries.search.assistant.performer.p2728a.C35466b) r14
            boolean r15 = r12.isEmpty()
            if (r15 == 0) goto L_0x01db
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89846n(r10)
            android.content.Intent r10 = r13.mo47369a(r11, r10)
            goto L_0x01e3
        L_0x01db:
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89846n(r10)
            android.content.Intent r10 = r13.mo47370b(r11, r10, r12)
        L_0x01e3:
            com.google.common.util.concurrent.cx r10 = r14.mo39653g(r10)
            com.google.android.libraries.search.assistant.performer.communication.bb r11 = com.google.android.libraries.search.assistant.performer.communication.C35543bb.f93341a
            com.google.common.util.concurrent.bg r12 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.base.ah r11 = com.google.apps.tiktok.tracing.C47810es.m84963c(r11)
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60922j.m93044g(r10, r11, r12)
            goto L_0x0202
        L_0x01f4:
            com.google.android.libraries.search.assistant.performer.communication.am r11 = new com.google.android.libraries.search.assistant.performer.communication.am
            r1 = r11
            r2 = r9
            r4 = r10
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.cx r10 = androidx.p104d.p105a.C2169h.m6027a(r11)
        L_0x0202:
            com.google.common.f.e r11 = f93200a
            com.google.common.f.x r11 = r11.mo56224b()
            java.lang.String r12 = "Send text message executed."
            r13 = 51625(0xc9a9, float:7.2342E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r13)).mo56386p(r12)
            com.google.android.libraries.search.b.i.f r11 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97068ea
            com.google.net.a.a.b r12 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r11 = r11.mo40805c(r12)
            com.google.common.util.concurrent.cx r10 = r9.m63834k(r10, r8, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.communication.ChatMessageExecutor.m63832i(com.google.assistant.e.j.nk, java.lang.String, java.lang.String, boolean, j$.util.Optional, j$.util.Optional):com.google.common.util.concurrent.cx");
    }

    /* renamed from: j */
    private final C60870cx m63833j(C52321nk nkVar, String str, C60870cx cxVar, String str2) {
        C51098gh ghVar = nkVar.f137333f;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        C51098gh ghVar2 = ghVar;
        C52374pj pjVar = nkVar.f137331d;
        if (pjVar == null) {
            pjVar = C52374pj.f137434e;
        }
        String str3 = pjVar.f137437b == 2 ? (String) pjVar.f137438c : BuildConfig.FLAVOR;
        String b = C35547bf.m63904b(nkVar);
        if (!TextUtils.isEmpty(str3) || !b.isEmpty()) {
            return m63834k(C60922j.m93045h(cxVar, C47810es.m84966f(new C35542ba(this, ghVar2, str3, str, nkVar, str2)), C60826bg.f164896a), false, C37176a.f97081en.mo40805c(C62722b.OK));
        }
        ((C59052c) ((C59052c) f93200a.mo56225c()).mo56372aa(51633)).mo56386p("Invalid args without recipient phone number or app unique id.");
        this.f93204e.mo19974a(C37176a.f97077ej.mo40805c(C62722b.INVALID_ARGUMENT));
        return C60856cj.m92900i(C36180b.m64578b(C52235kf.INVALID_ARGUMENT));
    }

    /* renamed from: k */
    private final C60870cx m63834k(C60870cx cxVar, boolean z, C37252a aVar) {
        return C47633f.m84733g(C60856cj.m92908q(cxVar, 5, TimeUnit.SECONDS, this.f93206g)).mo51515h(new C35518ak(this, aVar), this.f93206g).mo51513e(RuntimeException.class, new C35527at(this), C60826bg.f164896a).mo51513e(TimeoutException.class, new C35528au(this, z, aVar), C60826bg.f164896a).mo51513e(Exception.class, new C35529av(this), C60826bg.f164896a);
    }

    /* renamed from: l */
    private static String m63835l(Optional optional) {
        return optional.isPresent() ? ((C35545bd) optional.get()).mo39696b() : "text/plain";
    }

    /* renamed from: m */
    private static boolean m63836m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!"content".equalsIgnoreCase(Uri.parse((String) it.next()).getScheme())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v35, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (com.google.android.libraries.search.assistant.performer.communication.C35547bf.m63907e(r4) == false) goto L_0x00c9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo39657b(com.google.assistant.p3897e.p3921j.C52321nk r16, java.lang.String r17) {
        /*
            r15 = this;
            r8 = r15
            r0 = r16
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            com.google.common.f.e r1 = f93200a
            com.google.common.f.x r2 = r1.mo56224b()
            java.lang.String r3 = "ChatMessageExecutor invoked."
            r4 = 51620(0xc9a4, float:7.2335E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.protobuf.bn r2 = r16.toBuilder()
            com.google.assistant.e.j.my r2 = (com.google.assistant.p3897e.p3921j.C52308my) r2
            android.content.Context r3 = r8.f93202c
            android.content.pm.PackageManager r4 = r8.f93207h
            com.google.assistant.e.c.c.gh r7 = r0.f137333f
            if (r7 != 0) goto L_0x0029
            com.google.assistant.e.c.c.gh r7 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0029:
            java.lang.String r9 = android.provider.Telephony.Sms.getDefaultSmsPackage(r3)
            int r10 = r7.f133012b
            r11 = 1
            if (r10 != r11) goto L_0x0037
            java.lang.Object r10 = r7.f133013c
            com.google.assistant.e.c.c.ev r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r10
            goto L_0x0039
        L_0x0037:
            com.google.assistant.e.c.c.ev r10 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0039:
            java.lang.String r10 = r10.f132944b
            boolean r10 = r10.isEmpty()
            r12 = 13
            if (r10 == 0) goto L_0x00c9
            java.lang.String r10 = "com.google.android.apps.messaging"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x00c9
            java.lang.String r9 = "keyguard"
            java.lang.Object r3 = r3.getSystemService(r9)
            android.app.KeyguardManager r3 = (android.app.KeyguardManager) r3
            boolean r3 = r3.isDeviceLocked()
            if (r3 != 0) goto L_0x00c9
            int r3 = r0.f137328a
            if (r3 != r12) goto L_0x0089
            java.lang.Object r3 = r0.f137329b
            com.google.assistant.e.j.nb r3 = (com.google.assistant.p3897e.p3921j.C52312nb) r3
            java.lang.String r3 = r3.f137315b
            boolean r3 = com.google.android.libraries.search.assistant.performer.communication.C35547bf.m63905c(r3)
            if (r3 == 0) goto L_0x0070
            boolean r3 = com.google.android.libraries.search.assistant.performer.communication.C35547bf.m63907e(r4)
            if (r3 != 0) goto L_0x0070
            goto L_0x00c9
        L_0x0070:
            int r3 = r0.f137328a
            if (r3 != r12) goto L_0x0079
            java.lang.Object r3 = r0.f137329b
            com.google.assistant.e.j.nb r3 = (com.google.assistant.p3897e.p3921j.C52312nb) r3
            goto L_0x007b
        L_0x0079:
            com.google.assistant.e.j.nb r3 = com.google.assistant.p3897e.p3921j.C52312nb.f137312c
        L_0x007b:
            com.google.protobuf.cq r3 = r3.f137314a
            int r3 = r3.size()
            if (r3 <= r11) goto L_0x0089
            boolean r3 = com.google.android.libraries.search.assistant.performer.communication.C35547bf.m63907e(r4)
            if (r3 == 0) goto L_0x00c9
        L_0x0089:
            com.google.protobuf.bn r3 = r7.toBuilder()
            com.google.assistant.e.c.c.gg r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r3
            int r4 = r7.f133012b
            if (r4 != r11) goto L_0x0098
            java.lang.Object r4 = r7.f133013c
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            goto L_0x009a
        L_0x0098:
            com.google.assistant.e.c.c.ev r4 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x009a:
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.assistant.e.c.c.es r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.assistant.e.c.c.ev r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r7
            int r9 = r7.f132943a
            r9 = r9 | r11
            r7.f132943a = r9
            r7.f132944b = r10
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.assistant.e.c.c.gh r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r7
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            r4.getClass()
            r7.f133013c = r4
            r7.f133012b = r11
            com.google.protobuf.bv r3 = r3.build()
            r7 = r3
            com.google.assistant.e.c.c.gh r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r7
        L_0x00c9:
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.nk r3 = (com.google.assistant.p3897e.p3921j.C52321nk) r3
            r7.getClass()
            r3.f137333f = r7
            com.google.assistant.e.j.pj r3 = r0.f137331d
            if (r3 != 0) goto L_0x00db
            com.google.assistant.e.j.pj r3 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x00db:
            int r3 = r3.f137437b
            java.lang.String r4 = ""
            r7 = 2
            if (r3 != r7) goto L_0x011e
            com.google.assistant.e.j.pj r3 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.pi r3 = (com.google.assistant.p3897e.p3921j.C52373pi) r3
            com.google.assistant.e.j.pj r0 = r0.f137331d
            if (r0 != 0) goto L_0x00f0
            com.google.assistant.e.j.pj r0 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x00f0:
            int r9 = r0.f137437b
            if (r9 != r7) goto L_0x00f9
            java.lang.Object r0 = r0.f137438c
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00fa
        L_0x00f9:
            r0 = r4
        L_0x00fa:
            java.lang.String r0 = android.telephony.PhoneNumberUtils.normalizeNumber(r0)
            r3.copyOnWrite()
            com.google.protobuf.bv r9 = r3.instance
            com.google.assistant.e.j.pj r9 = (com.google.assistant.p3897e.p3921j.C52374pj) r9
            r0.getClass()
            r9.f137437b = r7
            r9.f137438c = r0
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.j.nk r0 = (com.google.assistant.p3897e.p3921j.C52321nk) r0
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.e.j.pj r3 = (com.google.assistant.p3897e.p3921j.C52374pj) r3
            r3.getClass()
            r0.f137331d = r3
        L_0x011e:
            com.google.protobuf.bv r0 = r2.build()
            r9 = r0
            com.google.assistant.e.j.nk r9 = (com.google.assistant.p3897e.p3921j.C52321nk) r9
            com.google.assistant.e.c.c.gh r0 = r9.f137333f
            if (r0 != 0) goto L_0x012b
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x012b:
            int r2 = r0.f133012b
            if (r2 != r11) goto L_0x0134
            java.lang.Object r0 = r0.f133013c
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0
            goto L_0x0136
        L_0x0134:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0136:
            java.lang.String r0 = r0.f132944b
            j.a.c.c.a.ab r2 = p5535j.p5536a.p5545c.p5548c.p5549a.C70975ab.f189262c
            com.google.protobuf.bn r2 = r2.createBuilder()
            j.a.c.c.a.aa r2 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70974aa) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            j.a.c.c.a.ab r3 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70975ab) r3
            r0.getClass()
            int r10 = r3.f189264a
            r10 = r10 | r11
            r3.f189264a = r10
            r3.f189265b = r0
            com.google.protobuf.bv r0 = r2.build()
            j.a.c.c.a.ab r0 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70975ab) r0
            j.a.c.c.a.ad r2 = p5535j.p5536a.p5545c.p5548c.p5549a.C70977ad.f189266e
            com.google.protobuf.bn r2 = r2.createBuilder()
            j.a.c.c.a.ac r2 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70976ac) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            j.a.c.c.a.ad r3 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70977ad) r3
            r0.getClass()
            r3.f189270b = r0
            int r0 = r3.f189269a
            r0 = r0 | r11
            r3.f189269a = r0
            com.google.protobuf.bv r0 = r2.build()
            j.a.c.c.a.ad r0 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70977ad) r0
            java.lang.String r10 = r9.f137334g
            int r2 = r9.f137328a
            if (r2 != r12) goto L_0x0336
            java.lang.Object r2 = r9.f137329b
            com.google.assistant.e.j.nb r2 = (com.google.assistant.p3897e.p3921j.C52312nb) r2
            com.google.protobuf.cq r3 = r2.f137314a
            java.lang.String r2 = r2.f137315b
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r11 != r5) goto L_0x018c
            java.lang.String r2 = "image/*"
        L_0x018c:
            boolean r5 = com.google.android.libraries.search.assistant.performer.communication.C35547bf.m63905c(r2)
            r13 = 0
            if (r5 == 0) goto L_0x0244
            com.google.android.libraries.search.b.b r1 = r8.f93204e
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97076ei
            com.google.protobuf.bt r6 = p5535j.p5536a.p5545c.p5548c.p5549a.C70977ad.f189267f
            com.google.android.libraries.search.b.i.a r0 = r5.mo40812e(r6, r0)
            r1.mo19974a(r0)
            java.lang.Object r0 = r3.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r5 = android.net.Uri.parse(r0)
            com.google.assistant.e.c.c.gh r0 = r9.f137333f
            if (r0 != 0) goto L_0x01b0
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x01b0:
            r3 = r0
            java.lang.String r6 = com.google.android.libraries.search.assistant.performer.communication.C35547bf.m63904b(r9)
            com.google.assistant.e.j.pj r0 = r9.f137331d
            if (r0 != 0) goto L_0x01bb
            com.google.assistant.e.j.pj r0 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x01bb:
            int r1 = r0.f137437b
            if (r1 != r7) goto L_0x01c4
            java.lang.Object r0 = r0.f137438c
            java.lang.String r0 = (java.lang.String) r0
            r4 = r0
        L_0x01c4:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x01eb
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x01eb
            com.google.android.libraries.search.b.b r0 = r8.f93204e
            com.google.android.libraries.search.b.i.f r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97079el
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.INTERNAL
            com.google.android.libraries.search.b.i.a r1 = r1.mo40805c(r2)
            r0.mo19974a(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            java.lang.String r1 = "no recipient is provided."
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r0, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x03c8
        L_0x01eb:
            int r0 = r3.f133012b
            if (r0 != r11) goto L_0x01f4
            java.lang.Object r0 = r3.f133013c
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0
            goto L_0x01f6
        L_0x01f4:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x01f6:
            java.lang.String r0 = r0.f132944b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0229
            com.google.android.libraries.search.assistant.performer.communication.db r0 = com.google.android.libraries.search.assistant.performer.communication.C35668dc.m64073e()
            r0.mo39787c(r2)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r4)
            r0.mo39788d(r1)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89846n(r5)
            r0.mo39786b(r1)
            com.google.android.libraries.search.assistant.performer.communication.dc r0 = r0.mo39790f()
            com.google.common.util.concurrent.cx r0 = r15.mo39661f(r0, r13)
            com.google.android.libraries.search.b.i.f r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97069eb
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r1 = r1.mo40805c(r2)
            com.google.common.util.concurrent.cx r0 = r15.m63834k(r0, r13, r1)
            goto L_0x03c8
        L_0x0229:
            com.google.android.libraries.search.assistant.performer.communication.as r7 = new com.google.android.libraries.search.assistant.performer.communication.as
            r0 = r7
            r1 = r15
            r2 = r3
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.common.util.concurrent.cx r0 = androidx.p104d.p105a.C2169h.m6027a(r7)
            com.google.android.libraries.search.b.i.f r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97069eb
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r1 = r1.mo40805c(r2)
            com.google.common.util.concurrent.cx r0 = r15.m63834k(r0, r13, r1)
            goto L_0x03c8
        L_0x0244:
            com.google.android.libraries.search.b.b r5 = r8.f93204e
            com.google.android.libraries.search.b.i.g r6 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97073ef
            com.google.protobuf.bt r14 = p5535j.p5536a.p5545c.p5548c.p5549a.C70977ad.f189267f
            com.google.android.libraries.search.b.i.a r0 = r6.mo40812e(r14, r0)
            r5.mo19974a(r0)
            int r0 = r3.size()
            if (r0 != r11) goto L_0x02ef
            boolean r0 = m63836m(r3)
            if (r0 == 0) goto L_0x02ef
            java.lang.Object r0 = r3.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.android.libraries.search.assistant.performer.communication.f r3 = new com.google.android.libraries.search.assistant.performer.communication.f
            r3.<init>(r0, r2)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r3)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            com.google.assistant.e.c.c.gh r0 = r9.f137333f
            if (r0 != 0) goto L_0x027a
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x027a:
            r6 = r0
            com.google.assistant.e.j.pj r0 = r9.f137331d
            if (r0 != 0) goto L_0x0281
            com.google.assistant.e.j.pj r0 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x0281:
            int r2 = r0.f137437b
            if (r2 != r7) goto L_0x028b
            java.lang.Object r0 = r0.f137438c
            java.lang.String r0 = (java.lang.String) r0
            r3 = r0
            goto L_0x028c
        L_0x028b:
            r3 = r4
        L_0x028c:
            java.lang.String r7 = com.google.android.libraries.search.assistant.performer.communication.C35547bf.m63904b(r9)
            int r0 = r6.f133012b
            if (r0 != r11) goto L_0x0299
            java.lang.Object r0 = r6.f133013c
            com.google.assistant.e.c.c.ev r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r0
            goto L_0x029b
        L_0x0299:
            com.google.assistant.e.c.c.ev r0 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x029b:
            java.lang.String r2 = r0.f132944b
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x02ce
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x02ce
            com.google.common.f.x r0 = r1.mo56225c()
            java.lang.String r1 = "Invalid args without recipient phone number or app unique id."
            r2 = 51632(0xc9b0, float:7.2352E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.libraries.search.b.b r0 = r8.f93204e
            com.google.android.libraries.search.b.i.f r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97077ej
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            com.google.android.libraries.search.b.i.a r1 = r1.mo40805c(r2)
            r0.mo19974a(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x03c8
        L_0x02ce:
            com.google.android.libraries.search.assistant.performer.communication.al r11 = new com.google.android.libraries.search.assistant.performer.communication.al
            r0 = r11
            r1 = r15
            r4 = r10
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r11)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r12, r1, r0)
            com.google.android.libraries.search.b.i.f r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97080em
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r1 = r1.mo40805c(r2)
            com.google.common.util.concurrent.cx r0 = r15.m63834k(r0, r13, r1)
            goto L_0x03c8
        L_0x02ef:
            boolean r0 = m63836m(r3)
            if (r0 == 0) goto L_0x0311
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.libraries.search.assistant.performer.communication.an r1 = com.google.android.libraries.search.assistant.performer.communication.C35521an.f93280a
            j$.util.stream.Stream r0 = r0.map(r1)
            j$.util.stream.Collector r1 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r1)
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            com.google.common.util.concurrent.cx r0 = r15.m63833j(r9, r10, r0, r2)
            goto L_0x03c8
        L_0x0311:
            com.google.android.libraries.search.assistant.performer.e.c r0 = r8.f93210k
            int r1 = r9.f137328a
            if (r1 != r12) goto L_0x031c
            java.lang.Object r1 = r9.f137329b
            com.google.assistant.e.j.nb r1 = (com.google.assistant.p3897e.p3921j.C52312nb) r1
            goto L_0x031e
        L_0x031c:
            com.google.assistant.e.j.nb r1 = com.google.assistant.p3897e.p3921j.C52312nb.f137312c
        L_0x031e:
            com.google.protobuf.cq r1 = r1.f137314a
            com.google.common.util.concurrent.cx r0 = r0.mo39918a(r1)
            com.google.android.libraries.search.assistant.performer.communication.az r1 = com.google.android.libraries.search.assistant.performer.communication.C35533az.f93313a
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.base.ah r1 = com.google.apps.tiktok.tracing.C47810es.m84963c(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r3)
            com.google.common.util.concurrent.cx r0 = r15.m63833j(r9, r10, r0, r2)
            goto L_0x03c8
        L_0x0336:
            r1 = 11
            if (r2 != r1) goto L_0x038a
            com.google.android.libraries.search.b.b r2 = r8.f93204e
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97074eg
            com.google.protobuf.bt r4 = p5535j.p5536a.p5545c.p5548c.p5549a.C70977ad.f189267f
            com.google.android.libraries.search.b.i.a r0 = r3.mo40812e(r4, r0)
            r2.mo19974a(r0)
            int r0 = r9.f137328a
            if (r0 != r1) goto L_0x0350
            java.lang.Object r0 = r9.f137329b
            com.google.assistant.e.j.nj r0 = (com.google.assistant.p3897e.p3921j.C52320nj) r0
            goto L_0x0352
        L_0x0350:
            com.google.assistant.e.j.nj r0 = com.google.assistant.p3897e.p3921j.C52320nj.f137323b
        L_0x0352:
            java.lang.String r0 = r0.f137325a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0372
            com.google.android.libraries.search.b.b r0 = r8.f93204e
            com.google.android.libraries.search.b.i.f r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97077ej
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.INVALID_ARGUMENT
            com.google.android.libraries.search.b.i.a r1 = r1.mo40805c(r2)
            r0.mo19974a(r1)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x03c8
        L_0x0372:
            int r0 = r9.f137328a
            if (r0 != r1) goto L_0x037b
            java.lang.Object r0 = r9.f137329b
            com.google.assistant.e.j.nj r0 = (com.google.assistant.p3897e.p3921j.C52320nj) r0
            goto L_0x037d
        L_0x037b:
            com.google.assistant.e.j.nj r0 = com.google.assistant.p3897e.p3921j.C52320nj.f137323b
        L_0x037d:
            java.lang.String r3 = r0.f137325a
            boolean r4 = r9.f137335h
            r0 = r15
            r1 = r9
            r2 = r17
            com.google.common.util.concurrent.cx r0 = r0.m63832i(r1, r2, r3, r4, r5, r6)
            goto L_0x03c8
        L_0x038a:
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto L_0x03b0
            int r1 = r9.f137336i
            int r1 = com.google.assistant.p3897e.p3921j.C52309mz.m86567a(r1)
            if (r1 != 0) goto L_0x0399
            goto L_0x039a
        L_0x0399:
            r11 = r1
        L_0x039a:
            j$.util.Optional r1 = m63830g(r11)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x03a5
            goto L_0x03b0
        L_0x03a5:
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r0 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x03c8
        L_0x03b0:
            com.google.android.libraries.search.b.b r1 = r8.f93204e
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97075eh
            com.google.protobuf.bt r3 = p5535j.p5536a.p5545c.p5548c.p5549a.C70977ad.f189267f
            com.google.android.libraries.search.b.i.a r0 = r2.mo40812e(r3, r0)
            r1.mo19974a(r0)
            boolean r4 = r9.f137335h
            r0 = r15
            r1 = r9
            r2 = r17
            r3 = r10
            com.google.common.util.concurrent.cx r0 = r0.m63832i(r1, r2, r3, r4, r5, r6)
        L_0x03c8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.communication.ChatMessageExecutor.mo39657b(com.google.assistant.e.j.nk, java.lang.String):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final C60870cx mo39658c(C51098gh ghVar, String str, String str2, String str3, Optional optional, Optional optional2, ResultReceiverCallback resultReceiverCallback, boolean z) {
        C51058ev evVar;
        String replace = str2.replace("+", BuildConfig.FLAVOR);
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        String str4 = evVar.f132944b;
        Intent addFlags = new Intent("com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS").setPackage(str4).setType(m63835l(optional2)).putExtra("android.intent.extra.TEXT", str3).putExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_NAME", replace).putExtra("EXPECT_EXTERNAL_APP_UI", optional2.isPresent()).putExtra("EXPECT_EXTERNAL_CONFIRMATION", z).putExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID", str).putExtra("android.intent.extra.REFERRER_NAME", "android-app://com.google.android.googlequicksearchbox/https/www.google.com").putExtra("opa_allow_launch_intent_on_lockscreen", true).addFlags(32768).addFlags(268435456);
        optional.ifPresent(new C35530aw(addFlags));
        addFlags.putExtra("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER", C35547bf.m63903a(resultReceiverCallback));
        optional2.ifPresent(new C35531ax(addFlags));
        if (!this.f93205f.mo40007a(this.f93202c, addFlags)) {
            return C60856cj.m92899h(new RuntimeException("Unable to sign intent with package ".concat(String.valueOf(addFlags.getPackage()))));
        }
        if (!z) {
            if ("com.whatsapp".equals(str4)) {
                PackageManager packageManager = this.f93207h;
                if (C36188j.m64589a(C36188j.m64590b(addFlags, packageManager), packageManager).isEmpty()) {
                    return C60856cj.m92899h(new RuntimeException("Intent not supported to send msg with package using private API:".concat(String.valueOf(str4))));
                }
            }
            if (optional2.isEmpty()) {
                addFlags.addFlags(C89885b.HTTP_VALUE);
            }
        }
        if (!C35547bf.m63906d(addFlags, str4, this.f93207h)) {
            return C60856cj.m92899h(new RuntimeException("Can not sendMessageViaPrivateApi"));
        }
        if (optional2.isPresent()) {
            this.f93202c.grantUriPermission(str4, ((C35545bd) optional2.get()).mo39695a(), 1);
        }
        this.f93204e.mo19974a(C37176a.f97071ed);
        ((C59052c) ((C59052c) f93200a.mo56224b()).mo56372aa(51622)).mo56386p("Send message via API.");
        return this.f93201b.mo20101f(addFlags);
    }

    /* renamed from: d */
    public final C60870cx mo39659d(C51098gh ghVar, String str, String str2, String str3, C58485gu guVar, String str4, ResultReceiverCallback resultReceiverCallback, boolean z, boolean z2) {
        C51058ev evVar;
        String replace = str2.replace("+", BuildConfig.FLAVOR);
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        String str5 = evVar.f132944b;
        Intent addFlags = new Intent("com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS").setPackage(str5).setType(str4).putExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_NAME", replace).putExtra("android.intent.extra.TEXT", str3).putExtra("EXPECT_EXTERNAL_APP_UI", z2).putExtra("EXPECT_EXTERNAL_CONFIRMATION", z).putExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID", str).putExtra("android.intent.extra.REFERRER_NAME", "android-app://com.google.android.googlequicksearchbox/https/www.google.com").putExtra("opa_allow_launch_intent_on_lockscreen", true).putExtra("com.google.android.voicesearch.extra.SEND_MESSAGE_RESULT_RECEIVER", C35547bf.m63903a(resultReceiverCallback)).addFlags(32768).addFlags(268435456);
        if (C35547bf.m63905c(str4) && str5.equals("com.whatsapp")) {
            addFlags.setClipData(new ClipData("audio attachment", new String[]{"audio/*"}, new ClipData.Item((Uri) guVar.get(0))));
        } else if (!guVar.isEmpty()) {
            if (guVar.size() == 1) {
                addFlags.putExtra("android.intent.extra.STREAM", (Parcelable) guVar.get(0));
            } else {
                addFlags.putExtra("SEND_MULTIPLE", true).putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList(guVar));
            }
            addFlags.addFlags(1);
        }
        if (!this.f93205f.mo40007a(this.f93202c, addFlags)) {
            ((C59052c) ((C59052c) f93200a.mo56225c()).mo56372aa(51623)).mo56389s("Unable to sign intent with package %s", addFlags.getPackage());
            return C60856cj.m92899h(new RuntimeException("Unable to sign intent with package %s".concat(String.valueOf(addFlags.getPackage()))));
        }
        if (!z && (guVar.isEmpty() || C35547bf.m63905c(str4))) {
            addFlags.addFlags(C89885b.HTTP_VALUE);
        }
        if (!C35547bf.m63906d(addFlags, str5, this.f93207h)) {
            return C60856cj.m92899h(new RuntimeException("No suit"));
        }
        Collection.EL.forEach(guVar, new C35524aq(this, str5));
        return C47633f.m84733g(this.f93201b.mo20101f(addFlags)).mo51513e(Exception.class, new C35525ar(resultReceiverCallback), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo39660e(C51098gh ghVar, String str, String str2, String str3, Optional optional) {
        C51058ev evVar;
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        String str4 = evVar.f132944b;
        if (!"com.whatsapp".equals(str4)) {
            return C60856cj.m92899h(new RuntimeException("sendMessageViaPublicApi doesn't support ".concat(String.valueOf(str4))));
        }
        if (!TextUtils.isEmpty(str2)) {
            str = String.format("%s@s.whatsapp.net", new Object[]{str2.replace("+", BuildConfig.FLAVOR)});
        } else if (TextUtils.isEmpty(str)) {
            return C60856cj.m92899h(new RuntimeException("No contact id specified"));
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.putExtra("jid", str).putExtra("android.intent.extra.TEXT", str3).setType(m63835l(optional)).setAction("android.intent.action.SEND").setPackage("com.whatsapp");
        if (optional.isPresent()) {
            intent.putExtra("android.intent.extra.STREAM", ((C35545bd) optional.get()).mo39695a()).addFlags(1);
        }
        this.f93204e.mo19974a(C37176a.f97072ee);
        ((C59052c) ((C59052c) f93200a.mo56224b()).mo56372aa(51624)).mo56386p("Send message via intent.");
        return this.f93201b.mo20101f(intent);
    }

    /* renamed from: f */
    public final C60870cx mo39661f(C35668dc dcVar, boolean z) {
        C60870cx cxVar;
        this.f93204e.mo19974a(C37176a.f97070ec);
        if (dcVar == null) {
            cxVar = C60856cj.m92899h(new NullPointerException("Message Data cannot be null"));
        } else if (!C58890d.m90990e("text/plain", dcVar.mo39793c()) || dcVar.mo39792b().size() != 1) {
            C35674di diVar = this.f93209j;
            C35670de deVar = new C35670de(diVar, dcVar);
            C60870cx m = C60856cj.m92904m(C47810es.m84978r(deVar), diVar.f93559b);
            C35671df dfVar = new C35671df(diVar);
            C60870cx g = C60922j.m93044g(m, C47810es.m84963c(dfVar), diVar.f93559b);
            C35672dg dgVar = new C35672dg(diVar);
            cxVar = C60922j.m93045h(g, C47810es.m84966f(dgVar), diVar.f93559b);
        } else {
            cxVar = this.f93208i.mo39803a((String) dcVar.mo39792b().get(0), dcVar.mo39794d());
        }
        C35523ap apVar = new C35523ap(this, z, dcVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(apVar), C60826bg.f164896a);
    }
}
