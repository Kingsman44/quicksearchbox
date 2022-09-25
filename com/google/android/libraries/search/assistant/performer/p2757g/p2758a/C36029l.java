package com.google.android.libraries.search.assistant.performer.p2757g.p2758a;

import android.content.Context;
import android.media.session.MediaController;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import com.google.android.libraries.search.assistant.performer.p2757g.p2758a.p2759a.C36013a;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.a.l */
/* compiled from: PG */
public final class C36029l {

    /* renamed from: a */
    public static final C59071e f94246a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.g.a.l");

    /* renamed from: b */
    public final Context f94247b;

    /* renamed from: c */
    public final C46428ao f94248c;

    /* renamed from: d */
    private final C36030m f94249d;

    /* renamed from: e */
    private final Optional f94250e;

    /* renamed from: f */
    private final ScheduledExecutorService f94251f;

    public C36029l(Context context, C36030m mVar, Optional optional, ScheduledExecutorService scheduledExecutorService, C46428ao aoVar) {
        this.f94247b = context;
        this.f94249d = mVar;
        this.f94250e = optional;
        this.f94248c = aoVar;
        this.f94251f = scheduledExecutorService;
    }

    /* renamed from: c */
    private final C60870cx m64425c(MediaController mediaController) {
        if (this.f94250e.isPresent()) {
            return ((C36013a) this.f94250e.get()).mo39935a(mediaController);
        }
        return C60856cj.m92900i(Optional.m71637of(new C0320v(this.f94247b, MediaSessionCompat.Token.fromToken(mediaController.getSessionToken()))));
    }

    /* renamed from: a */
    public final C60870cx mo39945a() {
        MediaController b = this.f94249d.mo39948b();
        if (b == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        return m64425c(b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0152  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36019b mo39946b(java.lang.String r8) {
        /*
            r7 = this;
            com.google.android.libraries.search.assistant.performer.g.a.m r0 = r7.f94249d
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.media.browse.MediaBrowserService"
            r1.<init>(r2)
            r1.setPackage(r8)
            android.content.Context r0 = r0.f94253b
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r2 = 0
            java.util.List r0 = r0.queryIntentServices(r1, r2)
            boolean r1 = r0.isEmpty()
            r3 = 0
            if (r1 == 0) goto L_0x002e
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36030m.f94252a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Could not find a service matching MediaBrowserServiceCompat.SERVICE_INTERFACE and package name: %s"
            r4 = 52156(0xcbbc, float:7.3086E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r1, r8)
        L_0x002c:
            r1 = r3
            goto L_0x0063
        L_0x002e:
            java.lang.Object r0 = r0.get(r2)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ServiceInfo r1 = r0.serviceInfo
            if (r1 == 0) goto L_0x0054
            android.content.pm.ServiceInfo r0 = r0.serviceInfo
            java.lang.String r1 = r0.packageName
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = r0.name
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0054
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r4 = r0.packageName
            java.lang.String r0 = r0.name
            r1.<init>(r4, r0)
            goto L_0x0063
        L_0x0054:
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36030m.f94252a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Invalid ComponentInfo while creating ComponentName from package name %s"
            r4 = 52155(0xcbbb, float:7.3085E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r1, r8)
            goto L_0x002c
        L_0x0063:
            if (r1 != 0) goto L_0x0073
            com.google.common.f.e r0 = f94246a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r4 = "Component for package: %s is not found"
            r5 = 52152(0xcbb8, float:7.308E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56389s(r4, r8)
        L_0x0073:
            com.google.android.libraries.search.assistant.performer.g.a.m r0 = r7.f94249d
            boolean r4 = r0.mo39947a()
            if (r4 != 0) goto L_0x008a
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36030m.f94252a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r0 = "Do not have MEDIA_CONTENT_CONTROL permission."
            r4 = 52160(0xcbc0, float:7.3092E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r4)).mo56386p(r0)
            goto L_0x00f5
        L_0x008a:
            android.content.Context r0 = r0.f94253b
            java.lang.String r4 = "media_session"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.media.session.MediaSessionManager r0 = (android.media.session.MediaSessionManager) r0
            if (r0 != 0) goto L_0x00a5
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36030m.f94252a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r0 = "Could not find MEDIA_SESSION_SERVICE."
            r4 = 52159(0xcbbf, float:7.309E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r4)).mo56386p(r0)
            goto L_0x00f5
        L_0x00a5:
            java.util.List r0 = r0.getActiveSessions(r3)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x00be
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36030m.f94252a
            com.google.common.f.x r8 = r8.mo56224b()
            java.lang.String r0 = "There are no active sessions."
            r4 = 52158(0xcbbe, float:7.3089E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r4)).mo56386p(r0)
            goto L_0x00f5
        L_0x00be:
            java.util.Iterator r0 = r0.iterator()
        L_0x00c2:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00f5
            java.lang.Object r4 = r0.next()
            android.media.session.MediaController r4 = (android.media.session.MediaController) r4
            java.lang.String r5 = r4.getPackageName()
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x00c2
            android.os.Bundle r5 = r4.getExtras()
            if (r5 == 0) goto L_0x00e6
            java.lang.String r6 = "android.media.session.extra.NEED_CONNECT"
            boolean r5 = r5.getBoolean(r6, r2)
            if (r5 != 0) goto L_0x00c2
        L_0x00e6:
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36030m.f94252a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r3 = "Execute command with the active media controller: %s"
            r5 = 52157(0xcbbd, float:7.3088E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56389s(r3, r8)
            r3 = r4
        L_0x00f5:
            if (r3 != 0) goto L_0x0152
            com.google.common.f.e r8 = f94246a
            com.google.common.f.x r0 = r8.mo56224b()
            java.lang.String r3 = "about to reset connect."
            r4 = 52151(0xcbb7, float:7.3079E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            if (r1 != 0) goto L_0x011c
            com.google.common.f.x r8 = r8.mo56224b()
            java.lang.String r0 = "serviceComponent is null, aborting reset and returning empty mediaControllerCompat"
            r1 = 52154(0xcbba, float:7.3083E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
            goto L_0x0149
        L_0x011c:
            com.google.common.f.x r8 = r8.mo56224b()
            java.lang.String r0 = "reset Connect"
            r3 = 52153(0xcbb9, float:7.3082E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r3)).mo56386p(r0)
            com.google.android.libraries.search.assistant.performer.g.a.e r8 = new com.google.android.libraries.search.assistant.performer.g.a.e
            r8.<init>(r7, r1)
            com.google.common.util.concurrent.cx r8 = androidx.p104d.p105a.C2169h.m6027a(r8)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledExecutorService r1 = r7.f94251f
            r3 = 5000(0x1388, double:2.4703E-320)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92908q(r8, r3, r0, r1)
            com.google.android.libraries.search.assistant.performer.g.a.f r0 = com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36023f.f94234a
            java.util.concurrent.ScheduledExecutorService r1 = r7.f94251f
            java.lang.Class<java.util.concurrent.TimeoutException> r3 = java.util.concurrent.TimeoutException.class
            com.google.common.util.concurrent.s r0 = com.google.apps.tiktok.tracing.C47810es.m84966f(r0)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60846c.m92879h(r8, r3, r0, r1)
        L_0x0149:
            com.google.android.libraries.search.assistant.performer.g.a.a r8 = com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36019b.m64414a(r8, r2)
            com.google.android.libraries.search.assistant.performer.g.a.b r8 = r8.mo39934a()
            goto L_0x015f
        L_0x0152:
            com.google.common.util.concurrent.cx r8 = r7.m64425c(r3)
            r0 = 1
            com.google.android.libraries.search.assistant.performer.g.a.a r8 = com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36019b.m64414a(r8, r0)
            com.google.android.libraries.search.assistant.performer.g.a.b r8 = r8.mo39934a()
        L_0x015f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.p2757g.p2758a.C36029l.mo39946b(java.lang.String):com.google.android.libraries.search.assistant.performer.g.a.b");
    }
}
