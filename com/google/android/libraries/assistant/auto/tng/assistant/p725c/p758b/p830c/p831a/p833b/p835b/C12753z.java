package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.URISyntaxException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.z */
/* compiled from: PG */
public final class C12753z extends C22538o {

    /* renamed from: a */
    private static final C59071e f39898a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.z");

    /* renamed from: b */
    private final C12989g f39899b;

    /* renamed from: c */
    private final NotificationManager f39900c;

    /* renamed from: d */
    private final Context f39901d;

    public C12753z(NotificationManager notificationManager, Context context, C12991i iVar) {
        this.f39900c = notificationManager;
        this.f39901d = context;
        C12989g a = C12989g.m29225a(iVar.f40385d);
        this.f39899b = a == null ? C12989g.UNKNOWN : a;
    }

    /* renamed from: b */
    private static Intent m29013b() {
        try {
            return Intent.parseUri("intent:#Intent;action=com.google.android.car.setupwizard.MINI_FLOW;S.mini_flow_extra=AGSA_OOBE_FLOW;component=com.google.android.car.setupwizard/.CarSetupWizardMiniFlowActivity;end", 1);
        } catch (URISyntaxException e) {
            ((C59052c) ((C59052c) ((C59052c) f39898a.mo56226d()).mo56382g(e)).mo56372aa(44433)).mo56389s("parseUri() failed due to bad URI syntax: %s", "intent:#Intent;action=com.google.android.car.setupwizard.MINI_FLOW;S.mini_flow_extra=AGSA_OOBE_FLOW;component=com.google.android.car.setupwizard/.CarSetupWizardMiniFlowActivity;end");
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r7, com.google.android.libraries.gsa.conversation.clientop.C22434e r8) {
        /*
            r6 = this;
            java.lang.String r8 = r7.f135936b
            java.lang.String r0 = "ui.SHOW_NOTIFICATION"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x014f
            com.google.assistant.e.j.dw r8 = r7.f135938d
            if (r8 != 0) goto L_0x0010
            com.google.assistant.e.j.dw r8 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0010:
            com.google.assistant.e.j.aas r0 = com.google.assistant.p3897e.p3921j.aas.f134661u
            com.google.protobuf.eb r0 = r0.getParserForType()
            java.lang.String r1 = "notification_args"
            com.google.protobuf.MessageLite r8 = m41992m(r8, r1, r0)
            com.google.assistant.e.j.aas r8 = (com.google.assistant.p3897e.p3921j.aas) r8
            if (r8 == 0) goto L_0x014f
            androidx.core.app.z r7 = new androidx.core.app.z
            android.content.Context r0 = r6.f39901d
            r1 = 0
            r7.<init>(r0, r1)
            r0 = 27
            java.lang.String r0 = java.lang.Integer.toString(r0)
            android.app.NotificationManager r1 = r6.f39900c
            android.app.NotificationChannel r1 = r1.getNotificationChannel(r0)
            if (r1 != 0) goto L_0x0043
            android.app.NotificationManager r1 = r6.f39900c
            android.app.NotificationChannel r2 = new android.app.NotificationChannel
            java.lang.String r3 = "Miscellaneous"
            r4 = 4
            r2.<init>(r0, r3, r4)
            r1.createNotificationChannel(r2)
        L_0x0043:
            r7.f5675F = r0
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r8.mo58887l(r0)
            com.google.protobuf.bf r8 = r8.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r8 = r8.mo58854l(r1)
            if (r8 != 0) goto L_0x005b
            java.lang.Object r8 = r0.f169969b
            goto L_0x005f
        L_0x005b:
            java.lang.Object r8 = r0.mo58889c(r8)
        L_0x005f:
            com.google.assistant.e.j.abc r8 = (com.google.assistant.p3897e.p3921j.abc) r8
            int r0 = r8.f134694a
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0147
            com.google.aq.a.a.u r8 = r8.f134698e
            if (r8 != 0) goto L_0x006d
            com.google.aq.a.a.u r8 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x006d:
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.g r0 = r6.f39899b
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.g r2 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g.AUTO_EMBEDDED
            java.lang.String r3 = "com.google.assistant.actions.GET_UDC_CONSENT"
            r4 = 0
            if (r0 != r2) goto L_0x00b8
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "com.google.android.googlequicksearchbox.action.PRIVACY_SETTINGS"
            r0.<init>(r2)
            java.lang.String r2 = "com.google.android.carassistant"
            java.lang.String r5 = "com.google.android.apps.gsa.velvet.ui.settings.PublicSettingsActivity"
            android.content.Intent r0 = r0.setClassName(r2, r5)
            com.google.aq.a.a.b r2 = r8.f123984g
            if (r2 != 0) goto L_0x008b
            com.google.aq.a.a.b r2 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x008b:
            com.google.protobuf.cq r2 = r2.f123940c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00cb
            com.google.aq.a.a.b r2 = r8.f123984g
            if (r2 != 0) goto L_0x0099
            com.google.aq.a.a.b r2 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x0099:
            com.google.protobuf.cq r2 = r2.f123940c
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = "com.google.android.car.setupwizard.MINI_FLOW"
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L_0x00af
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x00cb
        L_0x00af:
            android.content.Intent r2 = m29013b()
            if (r2 != 0) goto L_0x00b6
            goto L_0x00cb
        L_0x00b6:
            r0 = r2
            goto L_0x00cb
        L_0x00b8:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r3)
            java.lang.String r2 = "seq_arg_surface"
            android.content.Intent r0 = r0.putExtra(r2, r1)
            java.lang.String r2 = "com.google.android.googlequicksearchbox"
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.errorui.UdcPuntCardActivity"
            android.content.Intent r0 = r0.setClassName(r2, r3)
        L_0x00cb:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r2)
            android.content.Context r2 = r6.f39901d
            r3 = 201326592(0xc000000, float:9.8607613E-32)
            android.content.Intent r0 = com.google.android.libraries.p11029ao.p11030a.C147798a.m240896b(r0, r3, r4)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r2, r4, r0, r3)
            r2 = 16
            r3 = 1
            r7.mo5015d(r2, r3)
            int r2 = r8.f123978a
            java.lang.String r4 = ""
            if (r2 != r3) goto L_0x00ed
            java.lang.Object r2 = r8.f123979b
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00ee
        L_0x00ed:
            r2 = r4
        L_0x00ee:
            java.lang.CharSequence r2 = androidx.core.app.C1839z.m5037c(r2)
            r7.f5685e = r2
            int r2 = r8.f123980c
            r5 = 7
            if (r2 != r5) goto L_0x00fe
            java.lang.Object r8 = r8.f123981d
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
        L_0x00fe:
            java.lang.CharSequence r8 = androidx.core.app.C1839z.m5037c(r4)
            r7.f5686f = r8
            android.app.Notification r8 = r7.f5679J
            r2 = 2131233852(0x7f080c3c, float:1.8083853E38)
            r8.icon = r2
            r7.f5687g = r0
            r7.f5690j = r1
            android.app.NotificationManager r8 = r6.f39900c
            r0 = 327680(0x50000, float:4.59177E-40)
            android.app.Notification r7 = r7.mo5013a()
            java.lang.String r1 = "hf"
            r8.notify(r1, r0, r7)
            com.google.assistant.e.j.e.fp r7 = com.google.assistant.p3897e.p3921j.p3926e.C51963fp.f136365c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.e.fm r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51960fm) r7
            com.google.assistant.e.j.e.fo r8 = com.google.assistant.p3897e.p3921j.p3926e.C51962fo.DISPLAYED
            r7.copyOnWrite()
            com.google.protobuf.bv r0 = r7.instance
            com.google.assistant.e.j.e.fp r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51963fp) r0
            int r8 = r8.f136364u
            r0.f136368b = r8
            int r8 = r0.f136367a
            r8 = r8 | r3
            r0.f136367a = r8
            java.lang.String r8 = "assistant.api.client_op.ShowNotificationResult"
            com.google.protobuf.bv r7 = r7.build()
            java.lang.String r0 = "show_result"
            com.google.assistant.e.j.ec r7 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41821a(r0, r8, r7)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            return r7
        L_0x0147:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Unable to render notification without preview."
            r7.<init>(r8)
            throw r7
        L_0x014f:
            com.google.android.libraries.gsa.conversation.clientop.d r8 = new com.google.android.libraries.gsa.conversation.clientop.d
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b.C12753z.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }
}
