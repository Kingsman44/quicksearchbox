package com.google.android.gms.reminders;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.C144017q;
import com.google.android.gms.reminders.model.C145821aa;
import com.google.android.gms.reminders.model.C145851w;
import com.google.android.gms.reminders.model.C145852x;
import com.google.android.gms.reminders.model.ReminderEventEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.reminders.m */
/* compiled from: PG */
public abstract class C145819m extends Service {

    /* renamed from: a */
    private volatile int f394238a = -1;

    /* renamed from: b */
    private Handler f394239b;

    /* renamed from: c */
    public String f394240c;

    /* renamed from: d */
    public final Object f394241d = new Object();

    /* renamed from: e */
    public boolean f394242e;

    /* renamed from: f */
    private IBinder f394243f;

    /* renamed from: g */
    private final List f394244g = Collections.synchronizedList(new ArrayList());

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.common.data.DataHolder m237284a(int r3) {
        /*
            r2 = this;
            java.util.List r0 = r2.f394244g
            monitor-enter(r0)
            if (r3 < 0) goto L_0x0017
            java.util.List r1 = r2.f394244g     // Catch:{ all -> 0x001a }
            int r1 = r1.size()     // Catch:{ all -> 0x001a }
            if (r3 >= r1) goto L_0x0017
            java.util.List r1 = r2.f394244g     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x001a }
            com.google.android.gms.common.data.DataHolder r3 = (com.google.android.gms.common.data.DataHolder) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.reminders.C145819m.m237284a(int):com.google.android.gms.common.data.DataHolder");
    }

    /* renamed from: h */
    public static final void m237285h(String str) {
        if (Log.isLoggable("RemindersLS", 3)) {
            Log.d("RemindersLS", str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo77737b(C145851w wVar);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo77738d(C145852x xVar);

    /* renamed from: e */
    public final int mo122103e(DataHolder dataHolder) {
        int size;
        synchronized (this.f394244g) {
            size = this.f394244g.size();
            this.f394244g.add(dataHolder);
        }
        return size;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo122104f(Intent intent) {
        int intExtra = intent.getIntExtra("api_id", 0);
        if (intExtra == 1) {
            ReminderEventEntity reminderEventEntity = (ReminderEventEntity) intent.getParcelableExtra("reminder_event");
            m237285h("onReminderFiredInternal Handling thread:".concat(String.valueOf(reminderEventEntity.f394307a.mo122067G())));
            mo77737b(reminderEventEntity);
        } else if (intExtra == 2) {
            int intExtra2 = intent.getIntExtra("data_holder_id", -1);
            if (m237284a(intExtra2) != null) {
                C145852x xVar = new C145852x((DataHolder) this.f394244g.get(intExtra2));
                int c = xVar.mo119324c();
                m237285h("onRemindersChangedInternal Handling thread:" + c);
                try {
                    mo77738d(xVar);
                } finally {
                    xVar.mo119102b();
                }
            }
        } else if (intExtra == 3) {
            int intExtra3 = intent.getIntExtra("data_holder_id", -1);
            if (m237284a(intExtra3) != null) {
                C145821aa aaVar = new C145821aa((DataHolder) this.f394244g.get(intExtra3));
                int c2 = aaVar.mo119324c();
                m237285h("onRemindersChangedInternal Handling thread:" + c2);
                aaVar.mo119102b();
            }
        }
    }

    /* renamed from: g */
    public final void mo122105g() {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f394238a) {
            if (C144017q.m234197a(this, callingUid)) {
                this.f394238a = callingUid;
                return;
            }
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.reminders.BIND_LISTENER".equals(intent.getAction())) {
            return this.f394243f;
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        m237285h("onCreate: ".concat(String.valueOf(getPackageName())));
        this.f394240c = getPackageName();
        HandlerThread handlerThread = new HandlerThread("RemindersLS");
        handlerThread.start();
        this.f394239b = new C145818l(this, handlerThread.getLooper());
        this.f394243f = new C145817k(this);
    }

    public final void onDestroy() {
        m237285h("onDestroy");
        synchronized (this.f394241d) {
            this.f394242e = true;
            this.f394239b.getLooper().quit();
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String valueOf = String.valueOf(intent);
        m237285h("onStartCommand:" + valueOf + " flag:" + i + " startId:" + i2);
        Message obtainMessage = this.f394239b.obtainMessage();
        obtainMessage.arg1 = i2;
        obtainMessage.obj = intent;
        this.f394239b.sendMessage(obtainMessage);
        return 3;
    }
}
