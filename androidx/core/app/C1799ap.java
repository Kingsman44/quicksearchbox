package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.support.p031v4.app.C0224cp;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.app.ap */
/* compiled from: PG */
final class C1799ap implements Handler.Callback, ServiceConnection {

    /* renamed from: a */
    public final Handler f5612a;

    /* renamed from: b */
    private final Context f5613b;

    /* renamed from: c */
    private final HandlerThread f5614c;

    /* renamed from: d */
    private final Map f5615d = new HashMap();

    /* renamed from: e */
    private Set f5616e = new HashSet();

    public C1799ap(Context context) {
        this.f5613b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.f5614c = handlerThread;
        handlerThread.start();
        this.f5612a = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    private final void m4950a(C1798ao aoVar) {
        if (aoVar.f5608b) {
            this.f5613b.unbindService(this);
            aoVar.f5608b = false;
        }
        aoVar.f5611e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0077, code lost:
        if (r11.f5608b != false) goto L_0x0079;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4951b(androidx.core.app.C1798ao r11) {
        /*
            r10 = this;
            java.lang.String r0 = "NotifManCompat"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L_0x002f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Processing component "
            r2.<init>(r3)
            android.content.ComponentName r3 = r11.f5607a
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            java.util.ArrayDeque r3 = r11.f5609c
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = " queued tasks"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r0, r2)
        L_0x002f:
            java.util.ArrayDeque r2 = r11.f5609c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0126
            boolean r2 = r11.f5608b
            r3 = 0
            if (r2 == 0) goto L_0x003d
            goto L_0x0079
        L_0x003d:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r2.<init>(r4)
            android.content.ComponentName r4 = r11.f5607a
            android.content.Intent r2 = r2.setComponent(r4)
            android.content.Context r4 = r10.f5613b
            r5 = 33
            boolean r2 = r4.bindService(r2, r10, r5)
            r11.f5608b = r2
            if (r2 == 0) goto L_0x0059
            r11.f5610d = r3
            goto L_0x0075
        L_0x0059:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Unable to bind to listener "
            r2.<init>(r4)
            android.content.ComponentName r5 = r11.f5607a
            r2.append(r5)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r2 = r4.concat(r2)
            android.util.Log.w(r0, r2)
            android.content.Context r2 = r10.f5613b
            r2.unbindService(r10)
        L_0x0075:
            boolean r2 = r11.f5608b
            if (r2 == 0) goto L_0x0123
        L_0x0079:
            android.support.v4.app.cp r2 = r11.f5611e
            if (r2 == 0) goto L_0x0123
        L_0x007d:
            java.util.ArrayDeque r2 = r11.f5609c
            java.lang.Object r2 = r2.peek()
            androidx.core.app.am r2 = (androidx.core.app.C1796am) r2
            if (r2 != 0) goto L_0x0089
            goto L_0x0117
        L_0x0089:
            boolean r4 = android.util.Log.isLoggable(r0, r1)     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            if (r4 == 0) goto L_0x00a3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            r4.<init>()     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            java.lang.String r5 = "Sending task "
            r4.append(r5)     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            r4.append(r2)     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            java.lang.String r4 = r4.toString()     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            android.util.Log.d(r0, r4)     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
        L_0x00a3:
            android.support.v4.app.cp r4 = r11.f5611e     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            java.lang.String r5 = r2.f5601a     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            int r6 = r2.f5602b     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            java.lang.String r7 = r2.f5603c     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            android.app.Notification r2 = r2.f5604d     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            android.os.Parcel r8 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            java.lang.String r9 = "android.support.v4.app.INotificationSideChannel"
            r8.writeInterfaceToken(r9)     // Catch:{ all -> 0x00db }
            r8.writeString(r5)     // Catch:{ all -> 0x00db }
            r8.writeInt(r6)     // Catch:{ all -> 0x00db }
            r8.writeString(r7)     // Catch:{ all -> 0x00db }
            r5 = 1
            if (r2 == 0) goto L_0x00c9
            r8.writeInt(r5)     // Catch:{ all -> 0x00db }
            r2.writeToParcel(r8, r3)     // Catch:{ all -> 0x00db }
            goto L_0x00cc
        L_0x00c9:
            r8.writeInt(r3)     // Catch:{ all -> 0x00db }
        L_0x00cc:
            android.os.IBinder r2 = r4.f849a     // Catch:{ all -> 0x00db }
            r4 = 0
            r2.transact(r5, r8, r4, r5)     // Catch:{ all -> 0x00db }
            r8.recycle()     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            java.util.ArrayDeque r2 = r11.f5609c     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            r2.remove()     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            goto L_0x007d
        L_0x00db:
            r2 = move-exception
            r8.recycle()     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
            throw r2     // Catch:{ DeadObjectException -> 0x00f9, RemoteException -> 0x00e0 }
        L_0x00e0:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "RemoteException communicating with "
            r2.<init>(r3)
            android.content.ComponentName r4 = r11.f5607a
            r2.append(r4)
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.w(r0, r2, r1)
            goto L_0x0117
        L_0x00f9:
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L_0x0117
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Remote service has died: "
            r1.<init>(r2)
            android.content.ComponentName r3 = r11.f5607a
            r1.append(r3)
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.d(r0, r1)
        L_0x0117:
            java.util.ArrayDeque r0 = r11.f5609c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0122
            r10.m4952c(r11)
        L_0x0122:
            return
        L_0x0123:
            r10.m4952c(r11)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C1799ap.m4951b(androidx.core.app.ao):void");
    }

    /* renamed from: c */
    private final void m4952c(C1798ao aoVar) {
        if (!this.f5612a.hasMessages(3, aoVar.f5607a)) {
            int i = aoVar.f5610d + 1;
            aoVar.f5610d = i;
            if (i > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + aoVar.f5609c.size() + " tasks to " + aoVar.f5607a + " after " + aoVar.f5610d + " retries");
                aoVar.f5609c.clear();
                return;
            }
            int i2 = (1 << (i - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
            }
            this.f5612a.sendMessageDelayed(this.f5612a.obtainMessage(3, aoVar.f5607a), (long) i2);
        }
    }

    public final boolean handleMessage(Message message) {
        C0224cp cpVar;
        int i = message.what;
        if (i == 0) {
            C1796am amVar = (C1796am) message.obj;
            Set a = C1800aq.m4953a(this.f5613b);
            if (!a.equals(this.f5616e)) {
                this.f5616e = a;
                List<ResolveInfo> queryIntentServices = this.f5613b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (a.contains(next.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f5615d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            new StringBuilder("Adding listener record for ").append(componentName2);
                            Log.d("NotifManCompat", "Adding listener record for ".concat(String.valueOf(componentName2)));
                        }
                        this.f5615d.put(componentName2, new C1798ao(componentName2));
                    }
                }
                Iterator it = this.f5615d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder sb = new StringBuilder("Removing listener record for ");
                            Object key = entry.getKey();
                            sb.append(key);
                            Log.d("NotifManCompat", "Removing listener record for ".concat(String.valueOf(key)));
                        }
                        m4950a((C1798ao) entry.getValue());
                        it.remove();
                    }
                }
            }
            for (C1798ao aoVar : this.f5615d.values()) {
                aoVar.f5609c.add(amVar);
                m4951b(aoVar);
            }
            return true;
        } else if (i == 1) {
            C1797an anVar = (C1797an) message.obj;
            ComponentName componentName3 = anVar.f5605a;
            IBinder iBinder = anVar.f5606b;
            C1798ao aoVar2 = (C1798ao) this.f5615d.get(componentName3);
            if (aoVar2 != null) {
                if (iBinder == null) {
                    cpVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                    cpVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C0224cp)) ? new C0224cp(iBinder) : (C0224cp) queryLocalInterface;
                }
                aoVar2.f5611e = cpVar;
                aoVar2.f5610d = 0;
                m4951b(aoVar2);
            }
            return true;
        } else if (i == 2) {
            C1798ao aoVar3 = (C1798ao) this.f5615d.get((ComponentName) message.obj);
            if (aoVar3 != null) {
                m4950a(aoVar3);
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            C1798ao aoVar4 = (C1798ao) this.f5615d.get((ComponentName) message.obj);
            if (aoVar4 != null) {
                m4951b(aoVar4);
            }
            return true;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            new StringBuilder("Connected to service ").append(componentName);
            Log.d("NotifManCompat", "Connected to service ".concat(String.valueOf(componentName)));
        }
        this.f5612a.obtainMessage(1, new C1797an(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            new StringBuilder("Disconnected from service ").append(componentName);
            Log.d("NotifManCompat", "Disconnected from service ".concat(String.valueOf(componentName)));
        }
        this.f5612a.obtainMessage(2, componentName).sendToTarget();
    }
}
