package org.chromium.base;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.util.ArrayList;
import org.chromium.base.task.C72402h;
import org.chromium.base.task.C72407m;
import org.chromium.base.task.PostTask;
import p000J.C0000N;

/* renamed from: org.chromium.base.aa */
/* compiled from: PG */
final class C72370aa implements MessageQueue.IdleHandler {

    /* renamed from: a */
    private static boolean f192516a;

    /* renamed from: b */
    private static C72370aa f192517b;

    /* renamed from: c */
    private long f192518c;

    private C72370aa() {
    }

    /* renamed from: a */
    public static void m107034a() {
        if (!ThreadUtils.m107029b()) {
            ThreadUtils.m107028a().post(C72413z.f192594a);
        } else if (C0000N.MnfJQqTB()) {
            if (f192517b == null) {
                f192517b = new C72370aa();
            }
            if (!f192516a) {
                Looper.myQueue().addIdleHandler(f192517b);
                f192516a = true;
            }
        } else if (f192517b != null && f192516a) {
            Looper.myQueue().removeIdleHandler(f192517b);
            f192516a = false;
        }
    }

    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f192518c;
        if (j != 0 && elapsedRealtime - j <= 1000) {
            return true;
        }
        this.f192518c = elapsedRealtime;
        if (!TraceEvent.f192510a || !C0000N.MnfJQqTB()) {
            return true;
        }
        TraceEvent.m107030a("instantAndroidViewHierarchy", (String) null);
        synchronized (ApplicationStatus.f192472a) {
        }
        ArrayList arrayList = new ArrayList();
        if (arrayList.isEmpty()) {
            TraceEvent.m107031b("instantAndroidViewHierarchy", 0);
            return true;
        }
        long hashCode = (long) arrayList.hashCode();
        C72407m mVar = C72407m.f192571a;
        C72409v vVar = new C72409v(hashCode, arrayList);
        if (!PostTask.f192544c || mVar.f192581k) {
            ((C72402h) PostTask.f192547f.get(0)).mo63864a(mVar, vVar);
        } else {
            C72407m c = mVar.mo63869c();
            C0000N.MTILOhAQ(c.f192576f, c.f192577g, c.f192578h, (byte) 0, (byte[]) null, vVar, 0, vVar.getClass().getName());
        }
        TraceEvent.m107031b("instantAndroidViewHierarchy", hashCode);
        return true;
    }
}
