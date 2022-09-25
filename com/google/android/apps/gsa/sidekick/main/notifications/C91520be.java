package com.google.android.apps.gsa.sidekick.main.notifications;

import android.app.Notification;
import android.content.Context;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.preferences.C86319j;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.sidekick.main.entry.C91320ay;
import com.google.android.apps.gsa.sidekick.main.notifications.p7220a.p7221a.C91485a;
import com.google.android.apps.gsa.sidekick.main.notifications.p7222b.C91514b;
import com.google.android.apps.gsa.sidekick.main.p7200c.C91276a;
import com.google.android.apps.gsa.sidekick.main.p7200c.C91283h;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91385o;
import com.google.android.apps.gsa.sidekick.shared.C91651c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.be */
/* compiled from: PG */
public final class C91520be {

    /* renamed from: a */
    public static final C59071e f255258a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.notifications.be");

    /* renamed from: b */
    public final Context f255259b;

    /* renamed from: c */
    public final C21370a f255260c;

    /* renamed from: d */
    public final C91385o f255261d;

    /* renamed from: e */
    public final C91376f f255262e;

    /* renamed from: f */
    public final C86127w f255263f;

    /* renamed from: g */
    public final C90931ca f255264g;

    /* renamed from: h */
    public final C86124t f255265h;

    /* renamed from: i */
    public final C89911f f255266i;

    /* renamed from: j */
    public final C58833ax f255267j;

    /* renamed from: k */
    private final C91320ay f255268k;

    /* renamed from: l */
    private final C91651c f255269l;

    /* renamed from: m */
    private final C74637ae f255270m;

    /* renamed from: n */
    private final C91276a f255271n;

    /* renamed from: o */
    private final C86319j f255272o;

    /* renamed from: p */
    private final C91283h f255273p;

    /* renamed from: q */
    private final C91485a f255274q;

    /* renamed from: r */
    private final C91514b f255275r;

    public C91520be(Context context, C21370a aVar, C91320ay ayVar, C86127w wVar, C91385o oVar, C91376f fVar, C91651c cVar, C74637ae aeVar, C91276a aVar2, C86319j jVar, C91283h hVar, C90931ca caVar, C86124t tVar, C91514b bVar, C91485a aVar3, C89911f fVar2, C58833ax axVar) {
        this.f255259b = context;
        this.f255260c = aVar;
        this.f255268k = ayVar;
        this.f255263f = wVar;
        this.f255261d = oVar;
        this.f255262e = fVar;
        this.f255269l = cVar;
        this.f255270m = aeVar;
        this.f255271n = aVar2;
        this.f255272o = jVar;
        this.f255273p = hVar;
        this.f255264g = caVar;
        this.f255265h = tVar;
        this.f255275r = bVar;
        this.f255274q = aVar3;
        this.f255266i = fVar2;
        this.f255267j = axVar;
    }

    /* renamed from: a */
    public final void mo85859a(int i, Notification notification, C91530d dVar) {
        C60870cx cxVar;
        if (dVar.mo85874F() == 6) {
            cxVar = C60856cj.m92900i(true);
        } else {
            cxVar = this.f255264g.mo85138c(new C91510ay(this, dVar, i, notification));
        }
        if (!dVar.mo85895u()) {
            C60856cj.m92911t(cxVar, new C91511az(this), C60826bg.f164896a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0534  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0573  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0601  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Notification mo85860b(int r26, com.google.android.apps.gsa.sidekick.main.notifications.C91530d r27, android.app.PendingIntent r28, boolean r29, com.google.common.p4522b.C58495hd r30) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r30
            int r0 = r27.mo85874F()
            r6 = 0
            r7 = 1
            if (r0 != r7) goto L_0x0013
            return r6
        L_0x0013:
            com.google.android.apps.gsa.location.ae r8 = r1.f255270m
            android.location.Location r8 = r8.mo71018a()
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r8 = com.google.android.sidekick.shared.remoteapi.CardRenderingContext.m80811b(r8)
            com.google.android.apps.gsa.sidekick.main.entry.ay r9 = r1.f255268k
            com.google.common.util.concurrent.cx r9 = r9.mo85612a()
            java.lang.Object r9 = com.google.common.util.concurrent.C60856cj.m92910s(r9)
            com.google.common.base.ax r9 = (com.google.common.base.C58833ax) r9
            java.lang.Object r9 = r9.mo56111f()
            com.google.ai.b.ii r9 = (com.google.p375ai.p378b.C7744ii) r9
            if (r9 == 0) goto L_0x0050
            int r10 = r9.f27056a
            r10 = r10 & r7
            if (r10 == 0) goto L_0x0050
            com.google.android.apps.gsa.sidekick.main.c.h r10 = r1.f255273p
            com.google.protobuf.cj r11 = new com.google.protobuf.cj
            com.google.protobuf.ch r12 = r9.f27062g
            com.google.protobuf.ci r13 = com.google.p375ai.p378b.C7744ii.f27053h
            r11.<init>(r12, r13)
            com.google.ai.b.hr r9 = r9.f27057b
            if (r9 != 0) goto L_0x004b
            com.google.ai.b.hr r9 = com.google.p375ai.p378b.C7726hr.f27008i
        L_0x004b:
            com.google.protobuf.cq r9 = r9.f27012c
            r10.mo85556a(r8, r11, r9)
        L_0x0050:
            java.util.Collection r9 = r27.mo85892r()
            java.util.Iterator r9 = r9.iterator()
        L_0x0058:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0074
            java.lang.Object r10 = r9.next()
            com.google.ai.b.hj r10 = (com.google.p375ai.p378b.C7718hj) r10
            com.google.android.apps.gsa.sidekick.shared.c r11 = r1.f255269l
            java.lang.Object r10 = r11.mo85797j(r10)
            com.google.android.apps.gsa.sidekick.main.c.c r10 = (com.google.android.apps.gsa.sidekick.main.p7200c.C91278c) r10
            if (r10 == 0) goto L_0x0058
            com.google.android.apps.gsa.sidekick.main.c.a r11 = r1.f255271n
            r10.mo85553a(r8, r11)
            goto L_0x0058
        L_0x0074:
            r9 = 5
            if (r0 != r9) goto L_0x0081
            android.content.Context r0 = r1.f255259b
            java.lang.CharSequence r0 = r3.mo85872D(r0)
            if (r0 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            return r6
        L_0x0081:
            java.lang.String r0 = r27.mo85889o()
            android.content.Context r10 = r1.f255259b
            androidx.core.app.z r10 = com.google.android.apps.gsa.shared.p6974ae.C89095d.m144923a(r10, r0)
            r0 = 8
            boolean r11 = r27.mo85896v()
            r10.mo5015d(r0, r11)
            boolean r0 = r27.mo85897w()
            r0 = r0 ^ r7
            r11 = 16
            r10.mo5015d(r11, r0)
            int r0 = r27.mo85878d()
            r10.f5671B = r0
            r10.f5702v = r7
            java.lang.Long r11 = r27.mo85887m()
            if (r11 == 0) goto L_0x00bc
            long r12 = r11.longValue()
            j$.time.Duration r0 = p3186j$.time.Duration.ofSeconds(r12)
            long r12 = r0.toMillis()
            android.app.Notification r0 = r10.f5679J
            r0.when = r12
        L_0x00bc:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r12 = "com.google.android.apps.sidekick.CONTENT_ACTION"
            r0.<init>(r12)
            android.content.ComponentName r12 = new android.content.ComponentName
            android.content.Context r13 = r1.f255259b
            java.lang.String r14 = "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver"
            r12.<init>(r13, r14)
            android.content.Intent r0 = r0.setComponent(r12)
            java.util.Collection r12 = r27.mo85892r()
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x0106
            java.util.Iterator r12 = r12.iterator()
            java.lang.Object r12 = r12.next()
            com.google.ai.b.hj r12 = (com.google.p375ai.p378b.C7718hj) r12
            int r13 = r12.f26955a
            r14 = 1073741824(0x40000000, float:2.0)
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0106
            com.google.android.apps.gsa.proactive.c r13 = new com.google.android.apps.gsa.proactive.c
            com.google.ai.b.nd r14 = r12.f26938J
            if (r14 != 0) goto L_0x00f3
            com.google.ai.b.nd r14 = com.google.p375ai.p378b.C7874nd.f27577J
        L_0x00f3:
            r13.<init>(r14, r12)
            android.net.Uri r13 = r13.mo77615a()
            r0.setData(r13)
            java.lang.String r13 = "notification_entries"
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89846n(r12)
            com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150940f(r0, r13, r12)
        L_0x0106:
            java.lang.String r12 = "notificationContentCallback"
            android.content.Context r13 = r1.f255259b
            android.app.PendingIntent r13 = r3.mo85880f(r13)
            r0.putExtra(r12, r13)
            int r12 = r27.mo85870B()
            r14 = 4
            r15 = 2
            if (r12 == r7) goto L_0x012c
            if (r12 == r15) goto L_0x0129
            r13 = 3
            if (r12 == r13) goto L_0x0126
            if (r12 == r14) goto L_0x0123
            java.lang.String r13 = "null"
            goto L_0x012e
        L_0x0123:
            java.lang.String r13 = "URL_TARGET"
            goto L_0x012e
        L_0x0126:
            java.lang.String r13 = "SEARCH_TARGET"
            goto L_0x012e
        L_0x0129:
            java.lang.String r13 = "FEED_TARGET"
            goto L_0x012e
        L_0x012c:
            java.lang.String r13 = "UNKNOWN"
        L_0x012e:
            if (r12 == 0) goto L_0x0621
            java.lang.String r12 = "notification_target_key"
            r0.putExtra(r12, r13)
            java.lang.String r12 = "notification_pinned_content_key"
            boolean r13 = r27.mo85894t()
            r0.putExtra(r12, r13)
            java.lang.String r12 = "notificationAutoCancel"
            boolean r13 = r27.mo85897w()
            r13 = r13 ^ r7
            r0.putExtra(r12, r13)
            java.lang.String r12 = "notificationContentId"
            com.google.ai.b.fo r13 = r27.mo85884j()
            com.google.android.apps.gsa.shared.util.C90734ar.m148200c(r0, r12, r13)
            java.lang.String r12 = "notification_event_id"
            com.google.common.o.l.t r13 = r27.mo85883i()
            com.google.android.apps.gsa.shared.util.C90734ar.m148200c(r0, r12, r13)
            com.google.ai.b.yk r12 = r27.mo85885k()
            if (r12 == 0) goto L_0x0165
            java.lang.String r13 = "notification_ve_info"
            com.google.android.apps.gsa.shared.util.C90734ar.m148200c(r0, r13, r12)
        L_0x0165:
            com.google.bv.e.b.b r12 = r27.mo85886l()
            if (r12 == 0) goto L_0x0170
            java.lang.String r13 = "notif_now_clearcut_data"
            com.google.android.apps.gsa.shared.util.C90734ar.m148200c(r0, r13, r12)
        L_0x0170:
            boolean r12 = r27.mo85897w()
            r20 = 1275068416(0x4c000000, float:3.3554432E7)
            if (r7 == r12) goto L_0x017b
            r12 = 1275068416(0x4c000000, float:3.3554432E7)
            goto L_0x017d
        L_0x017b:
            r12 = 201326592(0xc000000, float:9.8607613E-32)
        L_0x017d:
            android.content.Context r14 = r1.f255259b
            r9 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r14, r9, r0, r12)
            r10.f5687g = r0
            android.content.Context r0 = r1.f255259b
            android.content.res.Resources r0 = r0.getResources()
            r12 = 2131103423(0x7f060ebf, float:1.7819312E38)
            int r12 = r0.getColor(r12)
            r10.f5670A = r12
            r12 = 2131233164(0x7f08098c, float:1.8082458E38)
            android.graphics.drawable.Drawable r12 = r0.getDrawable(r12)
            boolean r14 = r3.mo85869A(r8)
            if (r14 == 0) goto L_0x01b9
            android.content.Context r14 = r1.f255259b
            r6 = 2132090745(0x7f151f79, float:1.9821839E38)
            java.lang.String r6 = r14.getString(r6)
            java.lang.CharSequence r6 = androidx.core.app.C1839z.m5037c(r6)
            r10.f5694n = r6
            r6 = 2131233202(0x7f0809b2, float:1.8082535E38)
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeResource(r0, r6)
            goto L_0x01e7
        L_0x01b9:
            java.lang.Object r6 = r8.f118456b
            monitor-enter(r6)
            android.os.Bundle r14 = r8.f118457c     // Catch:{ all -> 0x061e }
            java.lang.String r13 = "NOTIFICATION_BRANDING_KEY"
            boolean r13 = r14.getBoolean(r13, r9)     // Catch:{ all -> 0x061e }
            monitor-exit(r6)     // Catch:{ all -> 0x061e }
            if (r13 == 0) goto L_0x01e6
            int r6 = r27.mo85874F()
            r13 = 6
            if (r6 == r13) goto L_0x01e6
            r6 = 2131104021(0x7f061115, float:1.7820525E38)
            int r6 = r0.getColor(r6)
            r10.f5670A = r6
            r6 = 2131235503(0x7f0812af, float:1.8087202E38)
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeResource(r0, r6)
            r12 = 2131233163(0x7f08098b, float:1.8082456E38)
            android.graphics.drawable.Drawable r12 = r0.getDrawable(r12)
            goto L_0x01e7
        L_0x01e6:
            r6 = 0
        L_0x01e7:
            int r13 = r27.mo85876b()
            android.app.Notification r14 = r10.f5679J
            r14.icon = r13
            if (r6 == 0) goto L_0x0269
            boolean r13 = r3.mo85869A(r8)
            if (r13 != 0) goto L_0x0267
            int r13 = r12.getIntrinsicWidth()
            r14 = -1
            if (r13 == r14) goto L_0x0203
            int r13 = r12.getIntrinsicWidth()
            goto L_0x020a
        L_0x0203:
            r13 = 2131170750(0x7f0715be, float:1.7955867E38)
            int r13 = r0.getDimensionPixelSize(r13)
        L_0x020a:
            int r7 = r12.getIntrinsicHeight()
            if (r7 == r14) goto L_0x0215
            int r7 = r12.getIntrinsicHeight()
            goto L_0x021c
        L_0x0215:
            r7 = 2131170749(0x7f0715bd, float:1.7955865E38)
            int r7 = r0.getDimensionPixelSize(r7)
        L_0x021c:
            if (r13 <= 0) goto L_0x0250
            if (r7 > 0) goto L_0x0221
            goto L_0x0250
        L_0x0221:
            android.graphics.drawable.BitmapDrawable r14 = new android.graphics.drawable.BitmapDrawable
            r14.<init>(r0, r6)
            r0 = 17
            r14.setGravity(r0)
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r15]
            r4[r9] = r12
            r12 = 1
            r4[r12] = r14
            r0.<init>(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r9, r9, r13, r7)
            r0.setBounds(r4)
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r13, r7, r4)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r4)
            r0.draw(r7)
            r10.f5688h = r4
            goto L_0x0269
        L_0x0250:
            com.google.common.f.e r0 = f255258a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "NowNotificationManager"
            r0.mo56378ag(r4, r7)
            java.lang.String r4 = "Android failed to load the dimensions of the large icon."
            r7 = 11678(0x2d9e, float:1.6364E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r4)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x0269
        L_0x0267:
            r10.f5688h = r6
        L_0x0269:
            android.content.Context r0 = r1.f255259b
            java.lang.CharSequence r4 = r3.mo85872D(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0283
            java.lang.String r0 = r4.toString()
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.CharSequence r0 = androidx.core.app.C1839z.m5037c(r0)
            r10.f5685e = r0
        L_0x0283:
            android.content.Context r0 = r1.f255259b
            java.lang.CharSequence r18 = r3.mo85871C(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r18)
            if (r0 != 0) goto L_0x029d
            java.lang.String r0 = r18.toString()
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            java.lang.CharSequence r0 = androidx.core.app.C1839z.m5037c(r0)
            r10.f5686f = r0
        L_0x029d:
            java.lang.String r0 = r27.mo85890p()
            if (r0 == 0) goto L_0x02a5
            r10.f5699s = r0
        L_0x02a5:
            java.lang.String r0 = r27.mo85888n()
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L_0x02b1
            r10.f5705y = r0
        L_0x02b1:
            android.content.Context r0 = r1.f255259b
            androidx.core.app.af r0 = r3.mo85882h(r0)
            if (r0 == 0) goto L_0x02bc
            r10.mo5022k(r0)
        L_0x02bc:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r0 = r3.mo85891q(r8)
            java.util.Iterator r12 = r0.iterator()
            r0 = 0
        L_0x02ca:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0392
            java.lang.Object r13 = r12.next()
            com.google.android.apps.gsa.sidekick.main.notifications.f r13 = (com.google.android.apps.gsa.sidekick.main.notifications.C91532f) r13
            boolean r14 = r13.mo85907f()
            if (r14 == 0) goto L_0x02ca
            int r14 = r0 + 1
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            android.content.ComponentName r9 = new android.content.ComponentName
            r21 = r12
            android.content.Context r12 = r1.f255259b
            r22 = r14
            java.lang.String r14 = "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver"
            r9.<init>(r12, r14)
            android.content.Intent r9 = r15.setComponent(r9)
            java.lang.String r12 = "com.google.android.apps.sidekick.CALLBACK_ACTION"
            android.content.Intent r9 = r9.setAction(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "notification_action://"
            r12.<init>(r14)
            r12.append(r2)
            java.lang.String r14 = "_"
            r12.append(r14)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            android.net.Uri r12 = android.net.Uri.parse(r12)
            android.content.Intent r9 = r9.setData(r12)
            java.lang.String r12 = "action_dismisses_notification"
            boolean r14 = r13.mo85908g()
            r9.putExtra(r12, r14)
            java.lang.String r12 = "notification_entries"
            java.util.Collection r14 = r27.mo85892r()
            com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150940f(r9, r12, r14)
            java.lang.String r12 = "notificationIdKey"
            r9.putExtra(r12, r2)
            java.lang.String r12 = "notification_callback"
            android.content.Context r14 = r1.f255259b
            android.app.PendingIntent r0 = r13.mo85903b(r14, r2, r0)
            r9.putExtra(r12, r0)
            java.lang.String r0 = "notification_callback_action"
            com.google.ai.b.g r12 = r13.mo85905d()
            int r12 = r12.f26835cv
            r9.putExtra(r0, r12)
            android.os.Bundle r0 = r13.mo85904c()
            r9.putExtras(r0)
            java.lang.String r0 = "notificationContentId"
            com.google.ai.b.fo r12 = r27.mo85884j()
            com.google.android.apps.gsa.shared.util.C90734ar.m148200c(r9, r0, r12)
            android.content.Context r0 = r1.f255259b
            r12 = 0
            r14 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r12, r9, r14)
            int r9 = r13.mo85902a()     // Catch:{ an -> 0x0375 }
            android.content.Context r12 = r1.f255259b     // Catch:{ an -> 0x0375 }
            java.lang.String r12 = r13.mo85906e(r12)     // Catch:{ an -> 0x0375 }
            androidx.core.app.r r13 = new androidx.core.app.r     // Catch:{ an -> 0x0375 }
            r13.<init>(r9, r12, r0)     // Catch:{ an -> 0x0375 }
            androidx.core.app.s r0 = r13.mo5008a()     // Catch:{ an -> 0x0375 }
            r7.add(r0)     // Catch:{ an -> 0x0375 }
            goto L_0x038a
        L_0x0375:
            r0 = move-exception
            com.google.common.f.e r9 = f255258a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r13 = "NowNotificationManager"
            r9.mo56378ag(r12, r13)
            java.lang.String r12 = "Could not find icon resource ID"
            r13 = 11675(0x2d9b, float:1.636E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56382g(r0)).mo56372aa(r13)).mo56386p(r12)
        L_0x038a:
            r12 = r21
            r0 = r22
            r9 = 0
            r15 = 2
            goto L_0x02ca
        L_0x0392:
            r14 = 201326592(0xc000000, float:9.8607613E-32)
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r7)
            p3186j$.util.Objects.requireNonNull(r10)
            com.google.android.apps.gsa.sidekick.main.notifications.ax r9 = new com.google.android.apps.gsa.sidekick.main.notifications.ax
            r9.<init>(r10)
            r0.forEach(r9)
            com.google.ai.b.nd r0 = com.google.android.apps.gsa.sidekick.main.notifications.C91529c.m149710b(r27)
            com.google.android.apps.gsa.search.core.i.t r9 = r1.f255265h
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249841j
            boolean r9 = r9.mo79746e(r12)
            if (r9 != 0) goto L_0x03b9
            boolean r9 = r7.isEmpty()
            if (r9 != 0) goto L_0x03b9
            r9 = 0
            goto L_0x03ba
        L_0x03b9:
            r9 = 1
        L_0x03ba:
            com.google.android.apps.gsa.search.core.i.t r12 = r1.f255265h
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249839h
            boolean r12 = r12.mo79746e(r13)
            if (r12 == 0) goto L_0x0406
            if (r9 == 0) goto L_0x0406
            com.google.android.apps.gsa.sidekick.main.notifications.a.a.a r9 = r1.f255274q
            com.google.ai.b.mn r12 = r0.f27587I
            if (r12 != 0) goto L_0x03ce
            com.google.ai.b.mn r12 = com.google.p375ai.p378b.C7857mn.f27537c
        L_0x03ce:
            java.lang.String r0 = r0.f27607s
            boolean r0 = r9.mo85829b(r12, r0)
            if (r0 == 0) goto L_0x0406
            if (r6 == 0) goto L_0x0406
            if (r11 == 0) goto L_0x03e5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r11 = r11.longValue()
            long r11 = r0.toMillis(r11)
            goto L_0x03eb
        L_0x03e5:
            com.google.android.libraries.f.a r0 = r1.f255260c
            long r11 = r0.mo26870b()
        L_0x03eb:
            r21 = r11
            com.google.android.apps.gsa.sidekick.main.notifications.a.a.a r11 = r1.f255274q
            int r13 = r27.mo85876b()
            r12 = r10
            r9 = 201326592(0xc000000, float:9.8607613E-32)
            r23 = 4
            r24 = 2
            r14 = r21
            r16 = r6
            r17 = r4
            r19 = r7
            r11.mo85828a(r12, r13, r14, r16, r17, r18, r19)
            goto L_0x040c
        L_0x0406:
            r9 = 201326592(0xc000000, float:9.8607613E-32)
            r23 = 4
            r24 = 2
        L_0x040c:
            com.google.android.apps.gsa.sidekick.main.notifications.b.b r0 = r1.f255275r
            com.google.ai.b.nd r4 = com.google.android.apps.gsa.sidekick.main.notifications.C91529c.m149710b(r27)
            com.google.android.apps.gsa.sidekick.main.notifications.b.a r6 = r0.f255250a
            com.google.ai.b.iy r4 = r4.f27586H
            if (r4 != 0) goto L_0x041a
            com.google.ai.b.iy r4 = com.google.p375ai.p378b.C7760iy.f27173c
        L_0x041a:
            int r7 = r4.f27175a
            r11 = 1
            if (r7 != r11) goto L_0x04f3
            java.lang.Object r7 = r4.f27176b
            com.google.ai.b.ix r7 = (com.google.p375ai.p378b.C7759ix) r7
            com.google.ai.b.iw r7 = r7.f27171d
            if (r7 != 0) goto L_0x0429
            com.google.ai.b.iw r7 = com.google.p375ai.p378b.C7758iw.f27160d
        L_0x0429:
            java.lang.String r7 = r7.f27164c
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x04f3
            int r7 = r4.f27175a
            r11 = 1
            if (r7 != r11) goto L_0x043b
            java.lang.Object r4 = r4.f27176b
            com.google.ai.b.ix r4 = (com.google.p375ai.p378b.C7759ix) r4
            goto L_0x043d
        L_0x043b:
            com.google.ai.b.ix r4 = com.google.p375ai.p378b.C7759ix.f27166f
        L_0x043d:
            com.google.ai.b.iw r4 = r4.f27172e
            if (r4 != 0) goto L_0x0443
            com.google.ai.b.iw r4 = com.google.p375ai.p378b.C7758iw.f27160d
        L_0x0443:
            java.lang.String r4 = r4.f27164c
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x04f3
            com.google.android.apps.gsa.search.core.i.t r4 = r6.f255248b
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249838g
            boolean r4 = r4.mo79746e(r6)
            if (r4 == 0) goto L_0x04f3
            com.google.android.apps.gsa.sidekick.main.notifications.b.a r0 = r0.f255250a
            com.google.android.apps.gsa.sidekick.main.notifications.b.c r4 = com.google.android.apps.gsa.sidekick.main.notifications.p7222b.C91515c.CRICKET_MINI_SCORECARD_FIRST_TEAM_LOGO
            boolean r4 = r5.containsKey(r4)
            if (r4 == 0) goto L_0x04f3
            com.google.android.apps.gsa.sidekick.main.notifications.b.c r4 = com.google.android.apps.gsa.sidekick.main.notifications.p7222b.C91515c.CRICKET_MINI_SCORECARD_SECOND_TEAM_LOGO
            boolean r4 = r5.containsKey(r4)
            if (r4 != 0) goto L_0x0469
            goto L_0x04f3
        L_0x0469:
            com.google.ai.b.nd r4 = com.google.android.apps.gsa.sidekick.main.notifications.C91529c.m149710b(r27)
            android.widget.RemoteViews r6 = r0.mo85856a(r3, r5)
            r10.f5673D = r6
            com.google.protobuf.cq r6 = r4.f27598j
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x04c5
            android.widget.RemoteViews r5 = r0.mo85856a(r3, r5)
            com.google.ai.b.nd r6 = com.google.android.apps.gsa.sidekick.main.notifications.C91529c.m149710b(r27)
            j$.util.StringJoiner r7 = new j$.util.StringJoiner
            java.lang.String r11 = java.lang.System.lineSeparator()
            r7.<init>(r11)
            java.lang.String r11 = ""
            r7.setEmptyValue(r11)
            com.google.protobuf.cq r6 = r6.f27598j
            java.util.Iterator r6 = r6.iterator()
        L_0x0497:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x04b5
            java.lang.Object r11 = r6.next()
            com.google.ai.b.xj r11 = (com.google.p375ai.p378b.C8150xj) r11
            com.google.android.apps.gsa.shared.au.b.a r12 = r0.f255249c
            android.content.Context r13 = r0.f255247a
            java.lang.String r11 = r12.mo83231a(r13, r11)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x0497
            r7.add(r11)
            goto L_0x0497
        L_0x04b5:
            java.lang.String r0 = r7.toString()
            r6 = 2131433465(0x7f0b17f9, float:1.8488716E38)
            r7 = 0
            r5.setViewVisibility(r6, r7)
            r5.setTextViewText(r6, r0)
            r10.f5674E = r5
        L_0x04c5:
            com.google.ai.b.iy r0 = r4.f27586H
            if (r0 != 0) goto L_0x04cb
            com.google.ai.b.iy r0 = com.google.p375ai.p378b.C7760iy.f27173c
        L_0x04cb:
            int r4 = r0.f27175a
            r5 = 1
            if (r4 != r5) goto L_0x04d5
            java.lang.Object r0 = r0.f27176b
            com.google.ai.b.ix r0 = (com.google.p375ai.p378b.C7759ix) r0
            goto L_0x04d7
        L_0x04d5:
            com.google.ai.b.ix r0 = com.google.p375ai.p378b.C7759ix.f27166f
        L_0x04d7:
            int r4 = r0.f27168a
            r4 = r4 & 2
            if (r4 == 0) goto L_0x04e0
            java.lang.String r0 = r0.f27170c
            goto L_0x04e2
        L_0x04e0:
            java.lang.String r0 = r0.f27169b
        L_0x04e2:
            java.lang.CharSequence r0 = androidx.core.app.C1839z.m5037c(r0)
            r10.f5694n = r0
            androidx.core.app.ab r0 = new androidx.core.app.ab
            r0.<init>()
            r10.mo5022k(r0)
            r4 = 0
            r10.f5688h = r4
        L_0x04f3:
            android.content.Context r0 = r1.f255259b
            android.app.PendingIntent r0 = r3.mo85881g(r0, r8)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "com.google.android.apps.sidekick.DISMISS_ACTION"
            r4.<init>(r5)
            android.content.ComponentName r5 = new android.content.ComponentName
            android.content.Context r6 = r1.f255259b
            java.lang.String r7 = "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver"
            r5.<init>(r6, r7)
            android.content.Intent r4 = r4.setComponent(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "notification_id://"
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r4.setData(r5)
            java.lang.String r5 = "notification_entries"
            java.util.Collection r6 = r27.mo85892r()
            com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150940f(r4, r5, r6)
            java.lang.String r5 = "notificationIdKey"
            r4.putExtra(r5, r2)
            r2 = r28
            if (r2 == 0) goto L_0x0539
            java.lang.String r5 = "notificationDismissCallback"
            r4.putExtra(r5, r2)
        L_0x0539:
            java.lang.String r2 = "notificationAutoCancel"
            boolean r5 = r27.mo85897w()
            r6 = 1
            r5 = r5 ^ r6
            r4.putExtra(r2, r5)
            if (r0 == 0) goto L_0x054b
            java.lang.String r2 = "notificationClientDismissCallback"
            r4.putExtra(r2, r0)
        L_0x054b:
            java.lang.String r0 = "notificationContentId"
            com.google.ai.b.fo r2 = r27.mo85884j()
            com.google.android.apps.gsa.shared.util.C90734ar.m148200c(r4, r0, r2)
            boolean r0 = r27.mo85897w()
            if (r6 == r0) goto L_0x055c
            r9 = 1275068416(0x4c000000, float:3.3554432E7)
        L_0x055c:
            android.content.Context r0 = r1.f255259b
            r2 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r0, r2, r4, r9)
            android.app.Notification r4 = r10.f5679J
            r4.deleteIntent = r0
            int r0 = r27.mo85874F()
            r4 = 5
            if (r0 != r4) goto L_0x0573
            r0 = -2
            r10.f5690j = r0
            goto L_0x0619
        L_0x0573:
            boolean r0 = r27.mo85898x()
            r4 = 1
            if (r4 == r0) goto L_0x057c
            r14 = 0
            goto L_0x057d
        L_0x057c:
            r14 = 4
        L_0x057d:
            if (r29 == 0) goto L_0x0609
            boolean r0 = r27.mo85899y()
            if (r0 == 0) goto L_0x05c9
            com.google.android.apps.gsa.search.core.preferences.j r0 = r1.f255272o
            com.google.android.apps.gsa.search.core.preferences.h r0 = r0.mo80040a()
            java.lang.Object r5 = r0.f233379b
            monitor-enter(r5)
            com.google.ai.b.vl r0 = r0.mo80034b()     // Catch:{ all -> 0x05c6 }
            if (r0 == 0) goto L_0x05b0
            int r6 = r0.f28475b     // Catch:{ all -> 0x05c6 }
            r6 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x05b0
            com.google.ai.b.ve r6 = r0.f28483j     // Catch:{ all -> 0x05c6 }
            if (r6 != 0) goto L_0x05a0
            com.google.ai.b.ve r6 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x05c6 }
        L_0x05a0:
            int r6 = r6.f28457a     // Catch:{ all -> 0x05c6 }
            r6 = r6 & 4
            if (r6 == 0) goto L_0x05b0
            com.google.ai.b.ve r0 = r0.f28483j     // Catch:{ all -> 0x05c6 }
            if (r0 != 0) goto L_0x05ac
            com.google.ai.b.ve r0 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x05c6 }
        L_0x05ac:
            java.lang.String r6 = r0.f28460d     // Catch:{ all -> 0x05c6 }
            monitor-exit(r5)     // Catch:{ all -> 0x05c6 }
            goto L_0x05b2
        L_0x05b0:
            monitor-exit(r5)     // Catch:{ all -> 0x05c6 }
            r6 = 0
        L_0x05b2:
            if (r6 != 0) goto L_0x05b8
            r0 = r14 | 1
            r14 = r0
            goto L_0x05c9
        L_0x05b8:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x05c9
            android.net.Uri r0 = android.net.Uri.parse(r6)
            r10.mo5021j(r0)
            goto L_0x05c9
        L_0x05c6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x05c6 }
            throw r0
        L_0x05c9:
            boolean r0 = r27.mo85900z()
            if (r0 == 0) goto L_0x0609
            com.google.android.apps.gsa.search.core.preferences.j r0 = r1.f255272o
            com.google.android.apps.gsa.search.core.preferences.h r0 = r0.mo80040a()
            java.lang.Object r5 = r0.f233379b
            monitor-enter(r5)
            com.google.ai.b.vl r0 = r0.mo80034b()     // Catch:{ all -> 0x0606 }
            if (r0 == 0) goto L_0x0602
            int r6 = r0.f28475b     // Catch:{ all -> 0x0606 }
            r6 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r6 == 0) goto L_0x0602
            com.google.ai.b.ve r6 = r0.f28483j     // Catch:{ all -> 0x0606 }
            if (r6 != 0) goto L_0x05ea
            com.google.ai.b.ve r6 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x0606 }
        L_0x05ea:
            int r6 = r6.f28457a     // Catch:{ all -> 0x0606 }
            r6 = r6 & 2
            if (r6 == 0) goto L_0x05fd
            com.google.ai.b.ve r0 = r0.f28483j     // Catch:{ all -> 0x0606 }
            if (r0 != 0) goto L_0x05f6
            com.google.ai.b.ve r0 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x0606 }
        L_0x05f6:
            boolean r0 = r0.f28459c     // Catch:{ all -> 0x0606 }
            if (r0 == 0) goto L_0x05fb
            goto L_0x05fd
        L_0x05fb:
            r7 = 0
            goto L_0x05fe
        L_0x05fd:
            r7 = 1
        L_0x05fe:
            monitor-exit(r5)     // Catch:{ all -> 0x0606 }
            if (r7 == 0) goto L_0x0609
            goto L_0x0603
        L_0x0602:
            monitor-exit(r5)     // Catch:{ all -> 0x0606 }
        L_0x0603:
            r14 = r14 | 2
            goto L_0x0609
        L_0x0606:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0606 }
            throw r0
        L_0x0609:
            int r0 = r27.mo85875a()
            r10.f5690j = r0
            r10.mo5019h(r14)
            java.lang.CharSequence r0 = r27.mo85873E()
            r10.mo5023l(r0)
        L_0x0619:
            android.app.Notification r0 = r10.mo5013a()
            return r0
        L_0x061e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x061e }
            throw r0
        L_0x0621:
            r2 = r6
            goto L_0x0624
        L_0x0623:
            throw r2
        L_0x0624:
            goto L_0x0623
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.notifications.C91520be.mo85860b(int, com.google.android.apps.gsa.sidekick.main.notifications.d, android.app.PendingIntent, boolean, com.google.common.b.hd):android.app.Notification");
    }

    /* renamed from: c */
    public final void mo85861c(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (i != 65571) {
            this.f255264g.mo85139d(new C91516ba(this, i));
        }
    }
}
