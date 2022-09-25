package com.google.android.apps.search.sceneviewer.immersiveedge.clientevents;

import android.content.Context;
import com.google.android.apps.search.sceneviewer.modelviewer.C141577af;
import com.google.android.libraries.p579ar.sceneviewer.common.function.TriConsumer;
import com.google.android.libraries.p579ar.sceneviewer.immersiveedge.sidechannelevent.SideChannelEventManager;
import com.google.android.libraries.p579ar.sceneviewer.modelviewer.ImpApiHandler;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public final class UserActionManager implements SideChannelEventManager {

    /* renamed from: a */
    private static final C59071e f384217a = C59071e.m91332i("com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.UserActionManager");

    /* renamed from: b */
    private final Context f384218b;

    /* renamed from: c */
    private final C47770dh f384219c;

    /* renamed from: d */
    private final ImpApiHandler f384220d;

    /* renamed from: e */
    private final C141577af f384221e;

    public UserActionManager(Context context, C47770dh dhVar, C141577af afVar, ImpApiHandler impApiHandler) {
        this.f384221e = afVar;
        this.f384219c = dhVar;
        this.f384218b = context;
        this.f384220d = impApiHandler;
    }

    public static native void nSendSideChannelEventReturnCode(long j, int i, int i2);

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:43|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r8 = com.google.common.util.concurrent.C60856cj.m92900i(com.google.android.apps.search.sceneviewer.p10650e.C141547a.OTHER_FAILURES);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x009a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00f9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[Catch:{ all -> 0x00dc, all -> 0x00e3, v -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00af A[Catch:{ all -> 0x00dc, all -> 0x00e3, v -> 0x0014 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0037=Splitter:B:15:0x0037, B:43:0x00f9=Splitter:B:43:0x00f9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleSideChannelEvent(int r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "url"
            r1 = 0
            if (r9 == 0) goto L_0x0017
            boolean r2 = r9.isEmpty()     // Catch:{ v -> 0x0014 }
            if (r2 != 0) goto L_0x0017
            com.google.ak.n r9 = com.google.p386ak.C8403s.m23253b(r9)     // Catch:{ v -> 0x0014 }
            com.google.ak.q r9 = r9.mo17161g()     // Catch:{ v -> 0x0014 }
            goto L_0x0018
        L_0x0014:
            r8 = move-exception
            goto L_0x00fa
        L_0x0017:
            r9 = r1
        L_0x0018:
            com.google.android.libraries.ar.sceneviewer.immersiveedge.sidechannelevent.SideChannelEventManager$EventType r8 = com.google.android.libraries.p579ar.sceneviewer.immersiveedge.sidechannelevent.SideChannelEventManager.EventType.getEventTypeFromString(r8)     // Catch:{ v -> 0x0014 }
            int r8 = r8.ordinal()     // Catch:{ v -> 0x0014 }
            r2 = 0
            r3 = 1
            if (r8 == 0) goto L_0x00af
            if (r8 == r3) goto L_0x0030
            com.google.android.apps.search.sceneviewer.e.a r8 = com.google.android.apps.search.sceneviewer.p10650e.C141547a.NOT_SUPPORTED     // Catch:{ v -> 0x0014 }
            int r8 = r8.getNumber()     // Catch:{ v -> 0x0014 }
            r6.sendSideChannelEventReturnCode(r7, r8)     // Catch:{ v -> 0x0014 }
            return
        L_0x0030:
            com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.b r8 = new com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.b     // Catch:{ v -> 0x0014 }
            android.content.Context r4 = r6.f384218b     // Catch:{ v -> 0x0014 }
            r8.<init>(r4, r9)     // Catch:{ v -> 0x0014 }
            com.google.ak.q r9 = r8.f384225b     // Catch:{ NullPointerException -> 0x009a }
            if (r9 == 0) goto L_0x0093
            com.google.ak.b.ak r9 = r9.f29255a     // Catch:{ NullPointerException -> 0x009a }
            boolean r9 = r9.containsKey(r0)     // Catch:{ NullPointerException -> 0x009a }
            if (r9 != 0) goto L_0x0044
            goto L_0x0093
        L_0x0044:
            com.google.ak.q r9 = r8.f384225b     // Catch:{ NullPointerException -> 0x009a }
            com.google.ak.n r9 = r9.mo17166a(r0)     // Catch:{ NullPointerException -> 0x009a }
            java.lang.String r9 = r9.mo17154d()     // Catch:{ NullPointerException -> 0x009a }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ NullPointerException -> 0x009a }
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder     // Catch:{ NullPointerException -> 0x009a }
            android.content.Context r4 = r8.f384224a     // Catch:{ NullPointerException -> 0x009a }
            r0.<init>(r4)     // Catch:{ NullPointerException -> 0x009a }
            android.content.Context r4 = r8.f384224a     // Catch:{ NullPointerException -> 0x009a }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ NullPointerException -> 0x009a }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ NullPointerException -> 0x009a }
            java.lang.String r5 = r9.getHost()     // Catch:{ NullPointerException -> 0x009a }
            r3[r2] = r5     // Catch:{ NullPointerException -> 0x009a }
            r2 = 2132092099(0x7f1524c3, float:1.9824585E38)
            java.lang.String r2 = r4.getString(r2, r3)     // Catch:{ NullPointerException -> 0x009a }
            android.text.Spanned r2 = android.text.Html.fromHtml(r2)     // Catch:{ NullPointerException -> 0x009a }
            android.app.AlertDialog$Builder r0 = r0.setMessage(r2)     // Catch:{ NullPointerException -> 0x009a }
            com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.a r2 = new com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.a     // Catch:{ NullPointerException -> 0x009a }
            r2.<init>(r8, r9)     // Catch:{ NullPointerException -> 0x009a }
            r8 = 2132092098(0x7f1524c2, float:1.9824583E38)
            android.app.AlertDialog$Builder r8 = r0.setPositiveButton(r8, r2)     // Catch:{ NullPointerException -> 0x009a }
            r9 = 2132092097(0x7f1524c1, float:1.982458E38)
            android.app.AlertDialog$Builder r8 = r8.setNegativeButton(r9, r1)     // Catch:{ NullPointerException -> 0x009a }
            r8.show()     // Catch:{ NullPointerException -> 0x009a }
            com.google.android.apps.search.sceneviewer.e.a r8 = com.google.android.apps.search.sceneviewer.p10650e.C141547a.SUCCESS     // Catch:{ NullPointerException -> 0x009a }
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)     // Catch:{ NullPointerException -> 0x009a }
            goto L_0x00a0
        L_0x0093:
            com.google.android.apps.search.sceneviewer.e.a r8 = com.google.android.apps.search.sceneviewer.p10650e.C141547a.MISSING_PAYLOAD_FIELDS     // Catch:{ NullPointerException -> 0x009a }
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)     // Catch:{ NullPointerException -> 0x009a }
            goto L_0x00a0
        L_0x009a:
            com.google.android.apps.search.sceneviewer.e.a r8 = com.google.android.apps.search.sceneviewer.p10650e.C141547a.OTHER_FAILURES     // Catch:{ v -> 0x0014 }
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)     // Catch:{ v -> 0x0014 }
        L_0x00a0:
            com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.c r9 = new com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.c     // Catch:{ v -> 0x0014 }
            r9.<init>(r6, r7)     // Catch:{ v -> 0x0014 }
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ v -> 0x0014 }
            com.google.common.base.ah r9 = com.google.apps.tiktok.tracing.C47810es.m84963c(r9)     // Catch:{ v -> 0x0014 }
            com.google.common.util.concurrent.C60922j.m93044g(r8, r9, r0)     // Catch:{ v -> 0x0014 }
            return
        L_0x00af:
            com.google.apps.tiktok.tracing.dh r8 = r6.f384219c     // Catch:{ v -> 0x0014 }
            java.lang.String r9 = "side_channel_event_trace"
            com.google.apps.tiktok.tracing.ax r8 = r8.mo51613c(r9)     // Catch:{ v -> 0x0014 }
            com.google.android.apps.search.sceneviewer.modelviewer.af r9 = r6.f384221e     // Catch:{ all -> 0x00dc }
            com.google.ar.core.viewer.jniprotolite.Types$ViewerMode r0 = com.google.p3723ar.core.viewer.jniprotolite.Types.ViewerMode.AR     // Catch:{ all -> 0x00dc }
            com.google.android.apps.search.sceneviewer.modelviewer.am r9 = r9.f384259a     // Catch:{ all -> 0x00dc }
            boolean r9 = r9.mo116587u(r0)     // Catch:{ all -> 0x00dc }
            if (r9 == 0) goto L_0x00cd
            com.google.android.apps.search.sceneviewer.e.a r9 = com.google.android.apps.search.sceneviewer.p10650e.C141547a.SUCCESS     // Catch:{ all -> 0x00dc }
            int r9 = r9.getNumber()     // Catch:{ all -> 0x00dc }
            r6.sendSideChannelEventReturnCode(r7, r9)     // Catch:{ all -> 0x00dc }
            goto L_0x00d6
        L_0x00cd:
            com.google.android.apps.search.sceneviewer.e.a r9 = com.google.android.apps.search.sceneviewer.p10650e.C141547a.INFEASIBLE     // Catch:{ all -> 0x00dc }
            int r9 = r9.getNumber()     // Catch:{ all -> 0x00dc }
            r6.sendSideChannelEventReturnCode(r7, r9)     // Catch:{ all -> 0x00dc }
        L_0x00d6:
            if (r8 == 0) goto L_0x00db
            r8.close()     // Catch:{ v -> 0x0014 }
        L_0x00db:
            return
        L_0x00dc:
            r9 = move-exception
            if (r8 == 0) goto L_0x00f9
            r8.close()     // Catch:{ all -> 0x00e3 }
            goto L_0x00f9
        L_0x00e3:
            r8 = move-exception
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00f9 }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r0[r2] = r1     // Catch:{ Exception -> 0x00f9 }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.String r4 = "addSuppressed"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r4, r0)     // Catch:{ Exception -> 0x00f9 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00f9 }
            r1[r2] = r8     // Catch:{ Exception -> 0x00f9 }
            r0.invoke(r9, r1)     // Catch:{ Exception -> 0x00f9 }
        L_0x00f9:
            throw r9     // Catch:{ v -> 0x0014 }
        L_0x00fa:
            com.google.common.f.e r9 = f384217a
            com.google.common.f.x r9 = r9.mo56226d()
            java.lang.String r0 = "Malformed payload"
            r1 = 41737(0xa309, float:5.8486E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56382g(r8)).mo56372aa(r1)).mo56386p(r0)
            com.google.android.apps.search.sceneviewer.e.a r8 = com.google.android.apps.search.sceneviewer.p10650e.C141547a.MALFORMED_PAYLOAD
            int r8 = r8.getNumber()
            r6.sendSideChannelEventReturnCode(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.UserActionManager.handleSideChannelEvent(int, java.lang.String, java.lang.String):void");
    }

    public final void sendSideChannelEventReturnCode(int i, int i2) {
        ImpApiHandler impApiHandler = this.f384220d;
        if (impApiHandler != null) {
            impApiHandler.call((TriConsumer) C141558d.f384228a, (Object) Integer.valueOf(i), (Object) Integer.valueOf(i2));
        }
    }
}
