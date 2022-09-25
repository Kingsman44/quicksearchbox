package com.google.apps.tiktok.concurrent;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.hilt.C68286a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.concurrent.b */
/* compiled from: PG */
public class C46429b extends Service {

    /* renamed from: a */
    private C60870cx f121504a = C60866ct.f164955a;

    /* renamed from: b */
    private int f121505b = -1;

    /* renamed from: com.google.apps.tiktok.concurrent.b$a */
    /* compiled from: PG */
    public interface C46430a {
        /* renamed from: dm */
        C46460l mo50424dm();
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (Map.Entry value : ((C46430a) C68286a.m98629a(getApplicationContext(), C46430a.class)).mo50424dm().f121580e.entrySet()) {
            printWriter.println((String) value.getValue());
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onDestroy() {
        long j;
        int i;
        if (!this.f121504a.isDone()) {
            C46460l dm = ((C46430a) C68286a.m98629a(getApplicationContext(), C46430a.class)).mo50424dm();
            int i2 = this.f121505b;
            int i3 = (int) (dm.f121578c.get() & 4294967295L);
            if (i2 == i3) {
                do {
                    j = dm.f121578c.get();
                    i = (int) (j & 4294967295L);
                    if (i != i3 || dm.f121578c.compareAndSet(j, C46460l.m82834a(0, (long) (i + 1)))) {
                    }
                    j = dm.f121578c.get();
                    i = (int) (j & 4294967295L);
                    return;
                } while (dm.f121578c.compareAndSet(j, C46460l.m82834a(0, (long) (i + 1))));
            }
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        C60870cx cxVar;
        if ((i & 2) == 0 && intent != null) {
            C46460l dm = ((C46430a) C68286a.m98629a(getApplicationContext(), C46430a.class)).mo50424dm();
            C58838bb.m90873h(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", intent);
            C58838bb.m90873h(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", intent);
            C58838bb.m90873h(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", intent);
            long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1);
            long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1);
            if (dm.f121583h.getMostSignificantBits() == longExtra && dm.f121583h.getLeastSignificantBits() == longExtra2) {
                int intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
                synchronized (dm.f121579d) {
                    cxVar = (SettableFuture) dm.f121581f.get(intExtra);
                    cxVar.getClass();
                    if (cxVar != C46460l.f121577b) {
                        dm.f121582g.put(intExtra, cxVar);
                    }
                    dm.f121581f.remove(intExtra);
                }
            } else {
                ((C59052c) ((C59052c) C46460l.f121576a.mo56226d()).mo56372aa(54727)).mo56393w("Stopping service immediately, intent delivered from previous process. Old PID was %d but current PID is %d", intent.getIntExtra("EXTRA_PROCESS_PID", -1), Process.myPid());
                cxVar = C60866ct.f164955a;
            }
            this.f121504a = cxVar;
            this.f121505b = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
        }
        this.f121504a.mo4106b(new C46413a(this, i2), C60826bg.f164896a);
        return 2;
    }
}
