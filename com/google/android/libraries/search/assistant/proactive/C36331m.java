package com.google.android.libraries.search.assistant.proactive;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.app.C1787ad;
import androidx.core.app.C1802as;
import androidx.core.app.C1803at;
import androidx.core.app.C1839z;
import androidx.core.content.C1878d;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121090b;
import com.google.android.apps.search.googleapp.silkpane.p10485a.C139272a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.android.libraries.search.assistant.proactive.p2772d.C36255a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.p3717aq.p3718a.p3719a.C47877k;
import com.google.p3717aq.p3718a.p3719a.C47878l;
import com.google.p3717aq.p3718a.p3719a.C47883q;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.search.assistant.proactive.m */
/* compiled from: PG */
public final class C36331m implements C36323j {

    /* renamed from: a */
    public static final C59071e f94873a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.m");

    /* renamed from: e */
    private static final C58528ij f94874e = new C58759qy("https://assistant.google.com/reminders/mainview");

    /* renamed from: f */
    private static final C58528ij f94875f = C58528ij.m90014N("android.intent.action.SEND", "com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOTIFICATION_CLICKED", "com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_LAUNCH_DRIVING_SETTINGS", "com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOT_DRIVING", "com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOTIFICATION_DISMISS");

    /* renamed from: b */
    public final Context f94876b;

    /* renamed from: c */
    public final C36255a f94877c;

    /* renamed from: d */
    public final C36205aa f94878d;

    /* renamed from: g */
    private final C60887da f94879g;

    /* renamed from: h */
    private final C47449e f94880h;

    /* renamed from: i */
    private final PackageManager f94881i;

    /* renamed from: j */
    private final C139272a f94882j;

    /* renamed from: k */
    private final C32240a f94883k;

    /* renamed from: com.google.android.libraries.search.assistant.proactive.m$a */
    /* compiled from: PG */
    public interface C36332a {
        /* renamed from: ak */
        C121090b mo40113ak();
    }

    public C36331m(Context context, C60887da daVar, C47449e eVar, C32240a aVar, PackageManager packageManager, C139272a aVar2, C36255a aVar3, C36205aa aaVar) {
        this.f94876b = context;
        this.f94879g = daVar;
        this.f94880h = eVar;
        this.f94883k = aVar;
        this.f94881i = packageManager;
        this.f94882j = aVar2;
        this.f94877c = aVar3;
        this.f94878d = aaVar;
    }

    /* renamed from: e */
    public static C1787ad m64819e(C47883q qVar) {
        C1802as asVar = new C1802as();
        asVar.f5624a = qVar.f123960a;
        C1787ad adVar = new C1787ad(qVar.f123961b, qVar.f123962c, new C1803at(asVar));
        if (!qVar.f123963d.isEmpty()) {
            String str = qVar.f123963d;
            Uri parse = Uri.parse(qVar.f123964e);
            adVar.f5571d = str;
            adVar.f5572e = parse;
        }
        return adVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = com.google.assistant.p3897e.p3921j.aau.m86270a(r1.f134706m);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m64820f(com.google.p3717aq.p3718a.p3719a.C47868b r0, com.google.assistant.p3897e.p3921j.abc r1) {
        /*
            boolean r0 = r0.f123942e
            if (r0 == 0) goto L_0x0012
            int r0 = r1.f134706m
            int r0 = com.google.assistant.p3897e.p3921j.aau.m86270a(r0)
            if (r0 != 0) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            r1 = 2
            if (r0 != r1) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.proactive.C36331m.m64820f(com.google.aq.a.a.b, com.google.assistant.e.j.abc):boolean");
    }

    /* renamed from: g */
    private static int m64821g(int i) {
        int i2 = i - 2;
        if (i2 == 0) {
            return R.drawable.logo_assistant_notifications_48;
        }
        if (i2 == 2) {
            return R.drawable.morris_notification_icon_48;
        }
        ((C59052c) ((C59052c) f94873a.mo56226d()).mo56372aa(52220)).mo56386p("Couldn't resolve notification large icon");
        return R.drawable.logo_assistant_notifications_48;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r0.f123938a == 2) goto L_0x0040;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40103a(com.google.assistant.p3897e.p3921j.aas r3) {
        /*
            r2 = this;
            com.google.protobuf.bt r0 = com.google.assistant.p3897e.p3921j.abc.f134692p
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r3.mo58887l(r0)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r3 = r3.mo58854l(r1)
            if (r3 != 0) goto L_0x0016
            java.lang.Object r3 = r0.f169969b
            goto L_0x001a
        L_0x0016:
            java.lang.Object r3 = r0.mo58889c(r3)
        L_0x001a:
            com.google.assistant.e.j.abc r3 = (com.google.assistant.p3897e.p3921j.abc) r3
            int r0 = r3.f134694a
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L_0x006e
            com.google.aq.a.a.u r3 = r3.f134698e
            if (r3 != 0) goto L_0x0028
            com.google.aq.a.a.u r3 = com.google.p3717aq.p3718a.p3719a.C47887u.f123976l
        L_0x0028:
            com.google.aq.a.a.b r0 = r3.f123984g
            if (r0 != 0) goto L_0x002e
            com.google.aq.a.a.b r0 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x002e:
            com.google.protobuf.cq r0 = r0.f123940c
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0040
            com.google.aq.a.a.b r0 = r3.f123984g
            if (r0 != 0) goto L_0x003c
            com.google.aq.a.a.b r0 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x003c:
            int r0 = r0.f123938a
            if (r0 != r1) goto L_0x004c
        L_0x0040:
            com.google.aq.a.a.b r0 = r3.f123984g
            if (r0 != 0) goto L_0x0046
            com.google.aq.a.a.b r0 = com.google.p3717aq.p3718a.p3719a.C47868b.f123936f
        L_0x0046:
            android.content.Intent r0 = r2.mo40111c(r0)
            if (r0 == 0) goto L_0x0066
        L_0x004c:
            int r0 = r3.f123985h
            int r0 = com.google.p3717aq.p3718a.p3719a.C47871e.m85088a(r0)
            if (r0 != 0) goto L_0x0055
            goto L_0x0065
        L_0x0055:
            r1 = 5
            if (r0 != r1) goto L_0x0065
            com.google.aq.a.a.r r3 = r3.f123988k
            if (r3 == 0) goto L_0x005d
            goto L_0x0065
        L_0x005d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Requiring messaging style but missing data."
            r3.<init>(r0)
            throw r3
        L_0x0065:
            return
        L_0x0066:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to resolve intent for content."
            r3.<init>(r0)
            throw r3
        L_0x006e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unable to render notification without preview."
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.proactive.C36331m.mo40103a(com.google.assistant.e.j.aas):void");
    }

    /* renamed from: b */
    public final C60870cx mo40104b(int i, aas aas, C36334o oVar, C36201a aVar) {
        Object obj;
        C60870cx cxVar;
        int i2;
        aas aas2 = aas;
        C62940bt r0 = C62942bv.checkIsLite(abc.f134692p);
        aas2.mo58887l(r0);
        Object l = aas2.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        abc abc = (abc) obj;
        if ((abc.f134694a & 2) == 0) {
            return C60856cj.m92899h(new IllegalArgumentException("Unable to render notification without preview."));
        }
        C47887u uVar = abc.f134698e;
        if (uVar == null) {
            uVar = C47887u.f123976l;
        }
        C47887u uVar2 = uVar;
        C60870cx b = this.f94879g.mo19399b(C47810es.m84978r(new C36329k(this, aas, oVar, uVar2, abc, i, aVar)));
        int i3 = uVar2.f123982e;
        if (i3 == 8) {
            String str = (String) uVar2.f123983f;
            if (str.isEmpty()) {
                cxVar = C60856cj.m92900i(BitmapFactory.decodeResource(this.f94876b.getResources(), R.drawable.logo_assistant_notifications_48));
            } else {
                cxVar = C5528f.m14300b(C5528f.m14299a(this.f94880h.mo51286a().mo11864b().mo12445g(Uri.parse(str))));
            }
        } else if (i3 == 20) {
            Resources resources = this.f94876b.getResources();
            if (uVar2.f123982e == 20) {
                i2 = C47878l.m85095a(((Integer) uVar2.f123983f).intValue());
                if (i2 == 0) {
                    i2 = 1;
                }
            } else {
                i2 = 2;
            }
            cxVar = C60856cj.m92900i(BitmapFactory.decodeResource(resources, m64821g(i2)));
        } else {
            cxVar = C60856cj.m92900i(BitmapFactory.decodeResource(this.f94876b.getResources(), m64821g(2)));
        }
        C60870cx cxVar2 = cxVar;
        return C60856cj.m92893b(b, cxVar2).mo57334a(C47810es.m84978r(new C36330l(this, b, uVar2, cxVar2, aas)), C60826bg.f164896a);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:61|62|63|64|65|(2:67|68)(2:69|70)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0154 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent mo40111c(com.google.p3717aq.p3718a.p3719a.C47868b r12) {
        /*
            r11 = this;
            com.google.protobuf.cq r0 = r12.f123940c
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x02ad
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.google.common.base.ax r3 = com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36321e.m64808a(r1, r2)
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x002f
            com.google.common.base.ax r3 = com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36322f.m64809a(r1)
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x0028
            goto L_0x002f
        L_0x0028:
            java.lang.Object r12 = r3.mo56107c()
            android.content.Intent r12 = (android.content.Intent) r12
            return r12
        L_0x002f:
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x0047
            com.google.common.base.ax r3 = com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36318b.m64803b(r1)
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x0040
            goto L_0x0047
        L_0x0040:
            java.lang.Object r12 = r3.mo56107c()
            android.content.Intent r12 = (android.content.Intent) r12
            return r12
        L_0x0047:
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x0089
            boolean r3 = com.google.common.base.C58837ba.m90859h(r1)
            if (r3 != 0) goto L_0x0079
            java.lang.String r3 = "assistant-notification://try-saying"
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L_0x005c
            goto L_0x0079
        L_0x005c:
            android.net.Uri r3 = android.net.Uri.parse(r1)
            java.lang.String r4 = "com.google.android.apps.gsa.staticplugins.opa.worker.proactive.TrySayingUtil.EXTRA_QUERY"
            java.lang.String r3 = r3.getQueryParameter(r4)
            if (r3 != 0) goto L_0x006b
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            goto L_0x007b
        L_0x006b:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.Intent r3 = r5.putExtra(r4, r3)
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r3)
            goto L_0x007b
        L_0x0079:
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
        L_0x007b:
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x0082
            goto L_0x0089
        L_0x0082:
            java.lang.Object r12 = r3.mo56107c()
            android.content.Intent r12 = (android.content.Intent) r12
            return r12
        L_0x0089:
            boolean r4 = r3.mo56113h()
            r5 = 65536(0x10000, float:9.18355E-41)
            r6 = 0
            if (r4 != 0) goto L_0x00ed
            android.content.Context r4 = r11.f94876b
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r8 = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"
            r7.<init>(r8)
            android.content.pm.PackageManager r8 = r4.getPackageManager()
            if (r8 != 0) goto L_0x00a3
        L_0x00a1:
            r7 = r2
            goto L_0x00df
        L_0x00a3:
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r7, r5)
            if (r8 != 0) goto L_0x00aa
            goto L_0x00a1
        L_0x00aa:
            android.content.pm.ActivityInfo r8 = r8.activityInfo
            r8.getClass()
            java.lang.String r9 = r8.packageName
            r7.setPackage(r9)
            android.content.ComponentName r9 = new android.content.ComponentName
            java.lang.String r10 = r8.packageName
            java.lang.String r8 = r8.name
            r9.<init>(r10, r8)
            r7.setComponent(r9)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            android.content.ComponentName r9 = new android.content.ComponentName
            java.lang.String r10 = "com.google.android.apps.gsa.notificationlistener.GsaNotificationListenerService"
            r9.<init>(r4, r10)
            java.lang.String r4 = ":settings:fragment_args_key"
            java.lang.String r9 = r9.flattenToString()
            r8.putString(r4, r9)
            java.lang.String r4 = ":settings:show_fragment_args"
            r7.putExtra(r4, r8)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r7.setFlags(r4)
        L_0x00df:
            if (r7 == 0) goto L_0x00ed
            java.lang.String r4 = r7.toUri(r6)
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            return r7
        L_0x00ed:
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x0105
            com.google.common.base.ax r3 = com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36319c.m64806a(r1)
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x00fe
            goto L_0x0105
        L_0x00fe:
            java.lang.Object r12 = r3.mo56107c()
            android.content.Intent r12 = (android.content.Intent) r12
            return r12
        L_0x0105:
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x0123
            com.google.android.libraries.search.assistant.proactive.aa r4 = r11.f94878d
            boolean r4 = r4.f94588f
            if (r4 == 0) goto L_0x0123
            com.google.common.base.ax r3 = com.google.android.libraries.search.assistant.proactive.p2777i.p2778a.C36320d.m64807a(r1)
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x011c
            goto L_0x0123
        L_0x011c:
            java.lang.Object r12 = r3.mo56107c()
            android.content.Intent r12 = (android.content.Intent) r12
            return r12
        L_0x0123:
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x01ae
            com.google.common.b.ij r4 = f94874e     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.common.b.qy r4 = (com.google.common.p4522b.C58759qy) r4     // Catch:{ URISyntaxException -> 0x01ad }
            java.lang.Object r4 = r4.f156534a     // Catch:{ URISyntaxException -> 0x01ad }
            boolean r4 = r4.equals(r1)     // Catch:{ URISyntaxException -> 0x01ad }
            if (r4 == 0) goto L_0x01a4
            com.google.android.libraries.search.assistant.a.a r4 = r11.f94883k     // Catch:{ ExecutionException -> 0x0154 }
            java.lang.Class<com.google.android.libraries.search.assistant.proactive.m$a> r7 = com.google.android.libraries.search.assistant.proactive.C36331m.C36332a.class
            com.google.android.apps.search.assistant.platform.a.b r4 = r4.f86461a     // Catch:{ ExecutionException -> 0x0154 }
            com.google.common.util.concurrent.cx r4 = r4.mo104411a(r7)     // Catch:{ ExecutionException -> 0x0154 }
            java.lang.Object r4 = com.google.common.util.concurrent.C60856cj.m92909r(r4)     // Catch:{ ExecutionException -> 0x0154 }
            com.google.android.libraries.search.assistant.proactive.m$a r4 = (com.google.android.libraries.search.assistant.proactive.C36331m.C36332a) r4     // Catch:{ ExecutionException -> 0x0154 }
            com.google.android.apps.search.assistant.platform.h.f.b r4 = r4.mo40113ak()     // Catch:{ ExecutionException -> 0x0154 }
            com.google.common.util.concurrent.cx r4 = r4.mo105044b()     // Catch:{ ExecutionException -> 0x0154 }
            java.lang.Object r4 = com.google.common.util.concurrent.C60856cj.m92909r(r4)     // Catch:{ ExecutionException -> 0x0154 }
            java.util.Locale r4 = (java.util.Locale) r4     // Catch:{ ExecutionException -> 0x0154 }
            goto L_0x0158
        L_0x0154:
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch:{ URISyntaxException -> 0x01ad }
        L_0x0158:
            java.lang.String r4 = r4.toLanguageTag()     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.android.libraries.search.assistant.proactive.aa r7 = r11.f94878d     // Catch:{ URISyntaxException -> 0x01ad }
            boolean r7 = r7.f94584b     // Catch:{ URISyntaxException -> 0x01ad }
            if (r7 == 0) goto L_0x0167
            android.content.Intent r12 = com.google.android.apps.search.assistant.verticals.reminders.p10074a.C132540c.m215470c(r4)     // Catch:{ URISyntaxException -> 0x01ad }
            return r12
        L_0x0167:
            com.google.android.apps.search.googleapp.silkpane.a.a r4 = r11.f94882j     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.android.apps.search.googleapp.silkpane.b.b r7 = com.google.android.apps.search.googleapp.silkpane.p10486b.C139280b.f378830g     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.android.apps.search.googleapp.silkpane.b.a r7 = (com.google.android.apps.search.googleapp.silkpane.p10486b.C139279a) r7     // Catch:{ URISyntaxException -> 0x01ad }
            r7.copyOnWrite()     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.android.apps.search.googleapp.silkpane.b.b r8 = (com.google.android.apps.search.googleapp.silkpane.p10486b.C139280b) r8     // Catch:{ URISyntaxException -> 0x01ad }
            r1.getClass()     // Catch:{ URISyntaxException -> 0x01ad }
            int r9 = r8.f378832a     // Catch:{ URISyntaxException -> 0x01ad }
            r9 = r9 | 1
            r8.f378832a = r9     // Catch:{ URISyntaxException -> 0x01ad }
            r8.f378833b = r1     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.android.apps.search.googleapp.silkpane.b.b r7 = (com.google.android.apps.search.googleapp.silkpane.p10486b.C139280b) r7     // Catch:{ URISyntaxException -> 0x01ad }
            android.content.Intent r4 = r4.mo114864a(r7, r2)     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.common.f.e r7 = f94873a     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ URISyntaxException -> 0x01ad }
            r8 = 52224(0xcc00, float:7.3181E-41)
            com.google.common.f.x r7 = r7.mo56372aa(r8)     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ URISyntaxException -> 0x01ad }
            java.lang.String r8 = "#openSilkPaneIntent: %s"
            r7.mo56389s(r8, r4)     // Catch:{ URISyntaxException -> 0x01ad }
            return r4
        L_0x01a4:
            android.content.Intent r4 = android.content.Intent.parseUri(r1, r6)     // Catch:{ URISyntaxException -> 0x01ad }
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r4)     // Catch:{ URISyntaxException -> 0x01ad }
            goto L_0x01ae
        L_0x01ad:
        L_0x01ae:
            boolean r4 = r3.mo56113h()
            if (r4 != 0) goto L_0x01c4
            com.google.common.f.e r2 = f94873a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Unable to parse candidate URI: %s"
            r4 = 52222(0xcbfe, float:7.3179E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56389s(r3, r1)
            goto L_0x0006
        L_0x01c4:
            java.lang.Object r1 = r3.mo56107c()
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.String r1 = r1.getAction()
            java.lang.String r4 = "com.google.android.gm.intent.VIEW_PLID"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x01f2
            boolean r12 = android.text.TextUtils.isEmpty(r2)
            if (r12 != 0) goto L_0x01eb
            android.content.Context r12 = r11.f94876b
            java.lang.Object r0 = r3.mo56107c()
            android.content.Intent r0 = (android.content.Intent) r0
            com.google.android.gms.identity.accounts.api.AccountData r1 = com.google.android.gms.identity.accounts.api.AccountData.m234630a(r2)
            com.google.android.gms.identity.accounts.api.C144354b.m234631a(r12, r0, r1)
        L_0x01eb:
            java.lang.Object r12 = r3.mo56107c()
            android.content.Intent r12 = (android.content.Intent) r12
            return r12
        L_0x01f2:
            java.lang.Object r1 = r3.mo56107c()
            android.content.Intent r1 = (android.content.Intent) r1
            if (r1 != 0) goto L_0x01fb
            goto L_0x022d
        L_0x01fb:
            android.content.ComponentName r2 = r1.getComponent()
            if (r2 == 0) goto L_0x0214
            android.content.ComponentName r2 = r1.getComponent()
            r2.getClass()
            java.lang.String r2 = r2.getClassName()
            java.lang.String r4 = "com.google.android.apps.gsa.staticplugins.opa.ZeroStateActivity"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x023f
        L_0x0214:
            android.net.Uri r1 = r1.getData()
            if (r1 == 0) goto L_0x022d
            java.lang.String r2 = r1.toString()
            if (r2 == 0) goto L_0x022d
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "googleassistant://zerostate?data="
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x022d
            goto L_0x023f
        L_0x022d:
            com.google.common.b.ij r1 = f94875f
            java.lang.Object r2 = r3.mo56107c()
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.String r2 = r2.getAction()
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0246
        L_0x023f:
            java.lang.Object r12 = r3.mo56107c()
            android.content.Intent r12 = (android.content.Intent) r12
            return r12
        L_0x0246:
            android.content.pm.PackageManager r1 = r11.f94881i
            java.lang.Object r2 = r3.mo56107c()
            android.content.Intent r2 = (android.content.Intent) r2
            java.util.List r1 = r1.queryIntentActivities(r2, r5)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0298
            java.lang.Object r12 = r1.get(r6)
            android.content.pm.ResolveInfo r12 = (android.content.pm.ResolveInfo) r12
            android.content.pm.ActivityInfo r12 = r12.activityInfo
            java.lang.String r12 = r12.packageName
            java.util.Iterator r0 = r1.iterator()
        L_0x0266:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0288
            java.lang.Object r1 = r0.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.Context r2 = r11.f94876b
            java.lang.String r2 = r2.getPackageName()
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.packageName
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0266
            android.content.Context r12 = r11.f94876b
            java.lang.String r12 = r12.getPackageName()
        L_0x0288:
            java.lang.Object r0 = r3.mo56107c()
            android.content.Intent r0 = (android.content.Intent) r0
            r0.setPackage(r12)
            java.lang.Object r12 = r3.mo56107c()
            android.content.Intent r12 = (android.content.Intent) r12
            return r12
        L_0x0298:
            java.lang.Object r1 = r3.mo56107c()
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.String r2 = "NGA_PIE"
            boolean r1 = r1.getBooleanExtra(r2, r6)
            if (r1 == 0) goto L_0x0006
            java.lang.Object r12 = r3.mo56107c()
            android.content.Intent r12 = (android.content.Intent) r12
            return r12
        L_0x02ad:
            int r0 = r12.f123938a
            r1 = 2
            if (r0 != r1) goto L_0x02e8
            android.content.Context r0 = r11.f94876b
            java.lang.Object r12 = r12.f123939b
            com.google.assistant.e.j.du r12 = (com.google.assistant.p3897e.p3921j.C51805du) r12
            byte[] r12 = r12.toByteArray()
            if (r12 != 0) goto L_0x02c1
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
            goto L_0x02db
        L_0x02c1:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = "com.google.android.libraries.search.assistant.proactive.EXECUTE_CLIENT_INPUT_ACTION"
            android.content.Intent r1 = r1.setAction(r3)
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.opa.worker.proactive.NotificationTapActivity"
            android.content.Intent r0 = r1.setClassName(r0, r3)
            java.lang.String r1 = "client_input"
            r0.putExtra(r1, r12)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x02db:
            boolean r0 = r12.mo56113h()
            if (r0 == 0) goto L_0x02e8
            java.lang.Object r12 = r12.mo56107c()
            android.content.Intent r12 = (android.content.Intent) r12
            return r12
        L_0x02e8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.proactive.C36331m.mo40111c(com.google.aq.a.a.b):android.content.Intent");
    }

    /* renamed from: d */
    public final C1839z mo40112d(aas aas, C36334o oVar) {
        Object obj;
        int i;
        int i2;
        Context context = this.f94876b;
        C1839z zVar = new C1839z(context, (String) null);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        String num = Integer.toString(27);
        if (notificationManager.getNotificationChannel(num) == null) {
            String string = context.getResources().getString(R.string.miscellaneous_notification_channel);
            String string2 = context.getResources().getString(R.string.miscellaneous_notification_channel);
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string2);
            if (notificationChannel == null) {
                i2 = 2;
            } else {
                int importance = notificationChannel.getImportance();
                notificationManager.deleteNotificationChannel(string2);
                i2 = importance;
            }
            notificationManager.createNotificationChannel(new NotificationChannel(num, string, i2));
        }
        zVar.f5675F = num;
        zVar.mo5015d(16, true);
        zVar.mo5015d(8, true);
        zVar.f5670A = C1878d.m5128a(this.f94876b, R.color.google_blue);
        C62940bt r0 = C62942bv.checkIsLite(abc.f134692p);
        aas.mo58887l(r0);
        Object l = aas.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C47887u uVar = ((abc) obj).f134698e;
        if (uVar == null) {
            uVar = C47887u.f123976l;
        }
        int b = C47877k.m85094b(uVar.f123987j);
        if (b == 0) {
            b = 1;
        }
        switch (b - 2) {
            case 1:
                i = R.drawable.ic_google_home_googblue_24dp;
                break;
            case 2:
                i = R.drawable.ic_settings_googblue_24dp;
                break;
            case 3:
                i = R.drawable.quantum_ic_rss_feed_googblue_24;
                break;
            case 4:
                i = R.drawable.quantum_ic_cloud_googblue_24;
                break;
            case 5:
                i = R.drawable.quantum_ic_tag_faces_googblue_24;
                break;
            case 6:
                i = R.drawable.quantum_ic_format_quote_googblue_24;
                break;
            case 7:
                i = R.drawable.quantum_ic_play_arrow_googblue_24;
                break;
            case 8:
                i = R.drawable.quantum_ic_news_googblue_24;
                break;
            case 9:
                i = R.drawable.quantum_ic_trending_up_googblue_24;
                break;
            case 10:
                i = R.drawable.quantum_ic_theaters_googblue_24;
                break;
            case 11:
                i = R.drawable.quantum_ic_flight_takeoff_googblue_24;
                break;
            case 12:
                i = R.drawable.quantum_ic_favorite_border_googblue_24;
                break;
            case 13:
                i = R.drawable.ic_reminder;
                break;
            case 14:
                i = R.drawable.ic_music_note_blue;
                break;
            case 15:
                i = R.drawable.quantum_ic_cake_googblue_24;
                break;
            case 16:
                i = R.drawable.ic_restaurant_googblue_24;
                break;
            case 17:
                i = R.drawable.quantum_gm_ic_time_to_leave_googblue_24;
                break;
            case 18:
                i = R.drawable.quantum_gm_ic_directions_transit_googblue_24;
                break;
            case 19:
                i = R.drawable.quantum_gm_ic_local_offer_googblue_24;
                break;
            case 20:
                i = R.drawable.quantum_gm_ic_shopping_cart_gm_blue_24;
                break;
            default:
                i = R.drawable.ic_assistant_light;
                break;
        }
        zVar.f5679J.icon = i;
        int i3 = aas.f134663a & 512;
        zVar.f5699s = i3 != 0 ? aas.f134671i : "opa_proactive";
        zVar.f5700t = !(i3 != 0);
        zVar.f5675F = oVar.f94887a;
        zVar.f5690j = oVar.f94889c;
        if (!this.f94876b.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            zVar.f5694n = C1839z.m5037c(this.f94876b.getString(R.string.opa_proactive_notification_subtext));
        }
        return zVar;
    }
}
