package com.google.android.libraries.assistant.auto.tng.common.p933q;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.i */
/* compiled from: PG */
public final class C13325i {

    /* renamed from: a */
    public static final C59071e f41049a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.common.q.i");

    /* renamed from: b */
    public final PackageManager f41050b;

    /* renamed from: c */
    public final Executor f41051c;

    /* renamed from: d */
    public final Executor f41052d;

    /* renamed from: e */
    private final Context f41053e;

    /* renamed from: f */
    private final ActivityManager f41054f;

    public C13325i(Context context, ActivityManager activityManager, C60887da daVar, C60887da daVar2) {
        context.getClass();
        this.f41053e = context;
        this.f41050b = context.getPackageManager();
        activityManager.getClass();
        this.f41054f = activityManager;
        this.f41051c = daVar;
        this.f41052d = daVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x004f A[EDGE_INSN: B:38:0x004f->B:19:0x004f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0020 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo21026a() {
        /*
            r6 = this;
            java.lang.String r0 = "android.permission.GET_TASKS"
            android.content.Context r1 = r6.f41053e
            boolean r0 = com.google.android.libraries.assistant.auto.tng.common.permissions.p932a.C13315a.m29571a(r0, r1)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = "android.permission.REAL_GET_TASKS"
            android.content.Context r3 = r6.f41053e
            boolean r0 = com.google.android.libraries.assistant.auto.tng.common.permissions.p932a.C13315a.m29571a(r0, r3)
            if (r0 != 0) goto L_0x0057
            android.app.ActivityManager r0 = r6.f41054f
            java.util.List r0 = r0.getRunningAppProcesses()
            java.util.Iterator r0 = r0.iterator()
        L_0x0020:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004e
            java.lang.Object r3 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
            int r4 = r3.importance
            r5 = 100
            if (r4 != r5) goto L_0x0020
            java.lang.String r3 = r3.processName
            if (r3 != 0) goto L_0x0038
        L_0x0036:
            r3 = r2
            goto L_0x0047
        L_0x0038:
            r4 = 58
            int r4 = r3.indexOf(r4)
            if (r4 < 0) goto L_0x0047
            if (r4 != 0) goto L_0x0043
            goto L_0x0036
        L_0x0043:
            java.lang.String r3 = r3.substring(r1, r4)
        L_0x0047:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0020
            goto L_0x004f
        L_0x004e:
            r3 = r2
        L_0x004f:
            if (r3 != 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r3)
            return r0
        L_0x0057:
            android.app.ActivityManager r0 = r6.f41054f
            r3 = 1
            java.util.List r0 = r0.getRunningTasks(r3)
            if (r0 == 0) goto L_0x0073
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0067
            goto L_0x0073
        L_0x0067:
            java.lang.Object r0 = r0.get(r1)
            android.app.ActivityManager$RunningTaskInfo r0 = (android.app.ActivityManager.RunningTaskInfo) r0
            android.content.ComponentName r0 = r0.topActivity
            java.lang.String r2 = r0.getPackageName()
        L_0x0073:
            if (r2 != 0) goto L_0x00cb
            android.app.ActivityManager r0 = r6.f41054f
            r2 = 3
            java.util.List r0 = r0.getRecentTasks(r3, r2)
            if (r0 == 0) goto L_0x00b6
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0085
            goto L_0x00b6
        L_0x0085:
            java.lang.Object r0 = r0.get(r1)
            android.app.ActivityManager$RecentTaskInfo r0 = (android.app.ActivityManager.RecentTaskInfo) r0
            android.content.Intent r0 = r0.baseIntent
            com.google.android.libraries.assistant.auto.tng.common.q.f r1 = new com.google.android.libraries.assistant.auto.tng.common.q.f
            r1.<init>(r6, r0)
            java.util.concurrent.Executor r2 = r6.f41052d
            java.util.concurrent.Callable r1 = com.google.apps.tiktok.tracing.C47810es.m84978r(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92904m(r1, r2)
            com.google.apps.tiktok.tracing.contrib.b.f r1 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r1)
            com.google.android.libraries.assistant.auto.tng.common.q.g r2 = com.google.android.libraries.assistant.auto.tng.common.p933q.C13323g.f41047a
            java.util.concurrent.Executor r3 = r6.f41051c
            com.google.apps.tiktok.tracing.contrib.b.f r1 = r1.mo51515h(r2, r3)
            com.google.android.libraries.assistant.auto.tng.common.q.h r2 = new com.google.android.libraries.assistant.auto.tng.common.q.h
            r2.<init>(r0)
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            java.util.concurrent.Executor r3 = r6.f41051c
            com.google.apps.tiktok.tracing.contrib.b.f r0 = r1.mo51513e(r0, r2, r3)
            goto L_0x00ca
        L_0x00b6:
            com.google.common.f.e r0 = f41049a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "No recent tasks"
            r2 = 44758(0xaed6, float:6.272E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            java.lang.String r0 = ""
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x00ca:
            return r0
        L_0x00cb:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.common.p933q.C13325i.mo21026a():com.google.common.util.concurrent.cx");
    }
}
