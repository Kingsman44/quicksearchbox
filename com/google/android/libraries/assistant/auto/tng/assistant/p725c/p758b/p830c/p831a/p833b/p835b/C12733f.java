package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p755g.C12154a;
import com.google.android.libraries.assistant.auto.tng.common.p928n.p929a.C13295a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1339a.C16884b;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.f */
/* compiled from: PG */
public final class C12733f extends C22538o {

    /* renamed from: a */
    public static final C59071e f39840a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.f");

    /* renamed from: b */
    public final C12154a f39841b;

    /* renamed from: c */
    private final Context f39842c;

    /* renamed from: d */
    private final C12737j f39843d;

    /* renamed from: e */
    private final C13295a f39844e;

    /* renamed from: f */
    private final C16850a f39845f;

    /* renamed from: g */
    private final C16884b f39846g;

    /* renamed from: h */
    private final Executor f39847h;

    public C12733f(Context context, C12737j jVar, C13295a aVar, C12154a aVar2, C16850a aVar3, C16884b bVar, Executor executor) {
        this.f39842c = context;
        this.f39843d = jVar;
        this.f39844e = aVar;
        this.f39841b = aVar2;
        this.f39845f = aVar3;
        this.f39846g = bVar;
        this.f39847h = executor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0165  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r12, com.google.android.libraries.gsa.conversation.clientop.C22434e r13) {
        /*
            r11 = this;
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r13 = "device.REQUEST_PERMISSION"
            java.lang.String r0 = r12.f135936b
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x025c
            com.google.assistant.e.j.dw r12 = r12.f135938d
            if (r12 != 0) goto L_0x0012
            com.google.assistant.e.j.dw r12 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0012:
            com.google.assistant.e.j.rt r13 = com.google.assistant.p3897e.p3921j.C52438rt.f137645h
            com.google.protobuf.eb r13 = r13.getParserForType()
            java.lang.String r0 = "device_request_permission_args"
            com.google.protobuf.MessageLite r12 = m41992m(r12, r0, r13)
            com.google.assistant.e.j.rt r12 = (com.google.assistant.p3897e.p3921j.C52438rt) r12
            int r13 = r12.f137647a
            r0 = r13 & 1
            r1 = 16
            if (r0 == 0) goto L_0x017f
            java.lang.String r12 = r12.f137648b
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.j r13 = r11.f39843d
            com.google.protobuf.cq r13 = r13.f39852a
            boolean r13 = r13.contains(r12)
            if (r13 != 0) goto L_0x004a
            com.google.assistant.e.j.kf r13 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r0 = "Unsupported Android permission: "
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r12 = r0.concat(r12)
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r13, r12)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            goto L_0x017e
        L_0x004a:
            int r13 = r12.hashCode()
            r0 = -2003032073(0xffffffff889c27f7, float:-9.398304E-34)
            java.lang.String r2 = "android.car.permission.CAR_ENERGY"
            r3 = 0
            r4 = 1
            if (r13 == r0) goto L_0x0065
            r0 = -288106087(0xffffffffeed3d999, float:-3.2782198E28)
            if (r13 == r0) goto L_0x005d
            goto L_0x006f
        L_0x005d:
            boolean r13 = r12.equals(r2)
            if (r13 == 0) goto L_0x006f
            r13 = 1
            goto L_0x0070
        L_0x0065:
            java.lang.String r13 = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"
            boolean r13 = r12.equals(r13)
            if (r13 == 0) goto L_0x006f
            r13 = 0
            goto L_0x0070
        L_0x006f:
            r13 = -1
        L_0x0070:
            java.lang.String r0 = "PermissionPerformer"
            if (r13 == 0) goto L_0x0165
            if (r13 == r4) goto L_0x008c
            com.google.assistant.e.j.kf r13 = com.google.assistant.p3897e.p3921j.C52235kf.UNIMPLEMENTED
            java.lang.String r0 = "Unhandled Android permission: "
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r12 = r0.concat(r12)
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r13, r12)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            goto L_0x017e
        L_0x008c:
            android.content.Context r12 = r11.f39842c
            boolean r12 = com.google.android.libraries.assistant.auto.tng.common.permissions.p932a.C13315a.m29571a(r2, r12)
            if (r12 == 0) goto L_0x009c
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            goto L_0x017e
        L_0x009c:
            android.content.Context r12 = r11.f39842c
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            if (r12 != 0) goto L_0x00c5
            com.google.common.f.e r12 = f39840a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r13, r0)
            java.lang.String r13 = "no suitable package present"
            r0 = 44418(0xad82, float:6.2243E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r0)).mo56386p(r13)
            com.google.assistant.e.j.kf r12 = com.google.assistant.p3897e.p3921j.C52235kf.UNKNOWN
            java.lang.String r13 = "Error with permission intent"
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r12, r13)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            goto L_0x017e
        L_0x00c5:
            android.content.Context r12 = r11.f39842c
            java.lang.String[] r13 = new java.lang.String[r4]
            r13[r3] = r2
            android.content.Intent r12 = com.google.android.libraries.assistant.auto.tng.common.permissions.PermissionsActivity.m29570a(r12, r13)
            com.google.android.libraries.assistant.auto.tng.common.n.a.a r13 = r11.f39844e
            android.content.Context r0 = r13.f41002b
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            android.content.Intent r12 = com.google.android.libraries.p11029ao.p11030a.C147798a.m240896b(r12, r2, r3)
            android.app.PendingIntent r12 = android.app.PendingIntent.getActivity(r0, r3, r12, r2)
            android.content.Context r0 = r13.f41002b
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2132091049(0x7f1520a9, float:1.9822455E38)
            java.lang.CharSequence r2 = r0.getText(r2)
            r3 = 2132091048(0x7f1520a8, float:1.9822453E38)
            java.lang.CharSequence r0 = r0.getText(r3)
            com.google.common.f.e r3 = com.google.android.libraries.assistant.auto.tng.common.p928n.p929a.C13295a.f41001a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "AaeNotificationUtil"
            r3.mo56378ag(r5, r6)
            java.lang.String r5 = "ready to post notification"
            r7 = 44735(0xaebf, float:6.2687E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56386p(r5)
            com.google.android.libraries.assistant.auto.tng.common.n.a.c r3 = r13.f41003c
            com.google.android.libraries.assistant.auto.tng.common.n.a.b r5 = com.google.android.libraries.assistant.auto.tng.common.p928n.p929a.C13296b.f41005a
            android.app.NotificationChannel r7 = new android.app.NotificationChannel
            java.lang.String r8 = r5.f41007b
            java.lang.String r9 = r5.f41008c
            int r10 = r5.f41009d
            r7.<init>(r8, r9, r10)
            android.app.NotificationManager r8 = r3.f41011b
            r8.createNotificationChannel(r7)
            androidx.core.app.z r7 = new androidx.core.app.z
            android.content.Context r3 = r3.f41010a
            java.lang.String r5 = r5.f41007b
            r7.<init>(r3, r5)
            java.lang.CharSequence r2 = androidx.core.app.C1839z.m5037c(r2)
            r7.f5685e = r2
            java.lang.CharSequence r0 = androidx.core.app.C1839z.m5037c(r0)
            r7.f5686f = r0
            android.app.Notification r0 = r7.f5679J
            r2 = 17301651(0x1080093, float:2.4979667E-38)
            r0.icon = r2
            r7.f5687g = r12
            r7.mo5015d(r1, r4)
            android.app.NotificationManager r12 = r13.f41004d
            r13 = 101(0x65, float:1.42E-43)
            android.app.Notification r0 = r7.mo5013a()
            r12.notify(r6, r13, r0)
            android.content.Context r12 = r11.f39842c
            r13 = 2132082731(0x7f15002b, float:1.9805584E38)
            java.lang.String r12 = r12.getString(r13)
            com.google.android.libraries.assistant.auto.tng.v.d.a.a r13 = r11.f39845f
            com.google.common.util.concurrent.cx r13 = r13.mo23063b()
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.e r0 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.e
            r0.<init>(r11, r12)
            java.util.concurrent.Executor r12 = r11.f39847h
            com.google.common.base.ah r0 = com.google.apps.tiktok.tracing.C47810es.m84963c(r0)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60922j.m93044g(r13, r0, r12)
            goto L_0x017e
        L_0x0165:
            com.google.common.f.e r12 = f39840a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r13, r0)
            java.lang.String r13 = "Missing NLS requester"
            r0 = 44419(0xad83, float:6.2244E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r0)).mo56386p(r13)
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
        L_0x017e:
            return r12
        L_0x017f:
            r0 = r13 & 4
            if (r0 == 0) goto L_0x01de
            int r12 = r12.f137649c
            com.google.bj.c.a.b r12 = com.google.p4184bj.p4193c.p4194a.C55912b.m87801a(r12)
            if (r12 != 0) goto L_0x018d
            com.google.bj.c.a.b r12 = com.google.p4184bj.p4193c.p4194a.C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN
        L_0x018d:
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.j r13 = r11.f39843d
            com.google.protobuf.cj r0 = new com.google.protobuf.cj
            com.google.protobuf.ch r13 = r13.f39853b
            com.google.protobuf.ci r1 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b.C12737j.f39848c
            r0.<init>(r13, r1)
            boolean r13 = r0.contains(r12)
            java.lang.String r0 = "Unsupported UDC permission: "
            if (r13 != 0) goto L_0x01b7
            com.google.assistant.e.j.kf r13 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r12 = r12.name()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r12 = r0.concat(r12)
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r13, r12)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            goto L_0x01dd
        L_0x01b7:
            com.google.assistant.e.j.rp r13 = com.google.assistant.p3897e.p3921j.C52434rp.UNKNOWN
            int r13 = r12.ordinal()
            r1 = 6
            if (r13 == r1) goto L_0x01d7
            com.google.assistant.e.j.kf r13 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r12 = r12.name()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r12 = r0.concat(r12)
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r13, r12)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            goto L_0x01dd
        L_0x01d7:
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
        L_0x01dd:
            return r12
        L_0x01de:
            r13 = r13 & r1
            if (r13 == 0) goto L_0x0256
            int r12 = r12.f137651e
            com.google.assistant.e.j.rp r12 = com.google.assistant.p3897e.p3921j.C52434rp.m86630a(r12)
            if (r12 != 0) goto L_0x01eb
            com.google.assistant.e.j.rp r12 = com.google.assistant.p3897e.p3921j.C52434rp.UNKNOWN
        L_0x01eb:
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.j r13 = r11.f39843d
            com.google.protobuf.cj r0 = new com.google.protobuf.cj
            com.google.protobuf.ch r13 = r13.f39854d
            com.google.protobuf.ci r1 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b.C12737j.f39849e
            r0.<init>(r13, r1)
            boolean r13 = r0.contains(r12)
            java.lang.String r0 = "Unsupported Assistant permission: "
            if (r13 != 0) goto L_0x0215
            com.google.assistant.e.j.kf r13 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r12 = r12.name()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r12 = r0.concat(r12)
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r13, r12)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            goto L_0x0255
        L_0x0215:
            com.google.bj.c.a.b r13 = com.google.p4184bj.p4193c.p4194a.C55912b.ACTIVITY_CONTROLS_SETTING_UNKNOWN
            int r13 = r12.ordinal()
            r1 = 2
            if (r13 == r1) goto L_0x0235
            com.google.assistant.e.j.kf r13 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.lang.String r12 = r12.name()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r12 = r0.concat(r12)
            com.google.assistant.e.j.ec r12 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r13, r12)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)
            goto L_0x0255
        L_0x0235:
            com.google.android.libraries.assistant.auto.tng.v.e.a.b r12 = r11.f39846g
            com.google.common.util.concurrent.cx r12 = r12.mo23070e()
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.c r13 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b.C12730c.f39836a
            java.util.concurrent.Executor r0 = r11.f39847h
            com.google.common.base.ah r13 = com.google.apps.tiktok.tracing.C47810es.m84963c(r13)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60922j.m93044g(r12, r13, r0)
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.d r13 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b.C12731d.f39837a
            java.util.concurrent.Executor r0 = r11.f39847h
            java.lang.Class<java.lang.Exception> r1 = java.lang.Exception.class
            com.google.common.base.ah r13 = com.google.apps.tiktok.tracing.C47810es.m84963c(r13)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60846c.m92878g(r12, r1, r13, r0)
        L_0x0255:
            return r12
        L_0x0256:
            com.google.android.libraries.gsa.conversation.clientop.k r12 = new com.google.android.libraries.gsa.conversation.clientop.k
            r12.<init>()
            throw r12
        L_0x025c:
            com.google.android.libraries.gsa.conversation.clientop.d r13 = new com.google.android.libraries.gsa.conversation.clientop.d
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b.C12733f.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }
}
