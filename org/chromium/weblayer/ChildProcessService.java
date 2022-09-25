package org.chromium.weblayer;

import android.app.Service;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72347f;

/* compiled from: PG */
public class ChildProcessService extends Service {

    /* renamed from: a */
    private C72347f f193086a;

    /* compiled from: PG */
    public final class Privileged0 extends C72622k {
    }

    /* compiled from: PG */
    public final class Privileged1 extends C72622k {
    }

    /* compiled from: PG */
    public final class Privileged2 extends C72622k {
    }

    /* compiled from: PG */
    public final class Privileged3 extends C72622k {
    }

    /* compiled from: PG */
    public final class Privileged4 extends C72622k {
    }

    /* compiled from: PG */
    public final class Sandboxed0 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed1 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed10 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed11 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed12 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed13 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed14 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed15 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed16 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed17 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed18 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed19 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed2 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed20 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed21 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed22 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed23 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed24 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed25 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed26 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed27 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed28 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed29 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed3 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed30 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed31 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed32 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed33 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed34 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed35 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed36 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed37 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed38 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed39 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed4 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed5 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed6 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed7 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed8 extends C72623l {
    }

    /* compiled from: PG */
    public final class Sandboxed9 extends C72623l {
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.IBinder onBind(android.content.Intent r4) {
        /*
            r3 = this;
            org.chromium.b.a.f r0 = r3.f193086a     // Catch:{ RemoteException -> 0x003b }
            org.chromium.b.a.bj r1 = new org.chromium.b.a.bj     // Catch:{ RemoteException -> 0x003b }
            r1.<init>(r4)     // Catch:{ RemoteException -> 0x003b }
            android.os.Parcel r4 = r0.mo17260gA()     // Catch:{ RemoteException -> 0x003b }
            com.google.android.p445a.C8850c.m23499h(r4, r1)     // Catch:{ RemoteException -> 0x003b }
            r1 = 3
            android.os.Parcel r4 = r0.mo17261gT(r1, r4)     // Catch:{ RemoteException -> 0x003b }
            android.os.IBinder r0 = r4.readStrongBinder()     // Catch:{ RemoteException -> 0x003b }
            if (r0 != 0) goto L_0x001b
            r0 = 0
            goto L_0x002f
        L_0x001b:
            java.lang.String r1 = "org.chromium.weblayer_private.interfaces.IObjectWrapper"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x003b }
            boolean r2 = r1 instanceof org.chromium.p5643b.p5644a.C72317am     // Catch:{ RemoteException -> 0x003b }
            if (r2 == 0) goto L_0x0029
            r0 = r1
            org.chromium.b.a.am r0 = (org.chromium.p5643b.p5644a.C72317am) r0     // Catch:{ RemoteException -> 0x003b }
            goto L_0x002f
        L_0x0029:
            org.chromium.b.a.ak r1 = new org.chromium.b.a.ak     // Catch:{ RemoteException -> 0x003b }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x003b }
            r0 = r1
        L_0x002f:
            r4.recycle()     // Catch:{ RemoteException -> 0x003b }
            java.lang.Class<android.os.IBinder> r4 = android.os.IBinder.class
            java.lang.Object r4 = org.chromium.p5643b.p5644a.C72341bj.m106988a(r0, r4)     // Catch:{ RemoteException -> 0x003b }
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch:{ RemoteException -> 0x003b }
            return r4
        L_0x003b:
            r4 = move-exception
            org.chromium.b.a.a r0 = new org.chromium.b.a.a
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.weblayer.ChildProcessService.onBind(android.content.Intent):android.os.IBinder");
    }

    public final void onCreate() {
        super.onCreate();
        try {
            C72611bt.f193167b = true;
            Context applicationContext = getApplicationContext();
            Context b = C72611bt.m107414b(applicationContext);
            Object[] objArr = {this, applicationContext, b};
            C72347f fVar = null;
            IBinder iBinder = (IBinder) C72611bt.m107415c(applicationContext, "org.chromium.weblayer_private.ChildProcessServiceImpl").getMethod("create", new Class[]{Service.class, Context.class, Context.class}).invoke((Object) null, objArr);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.chromium.weblayer_private.interfaces.IChildProcessService");
                if (queryLocalInterface instanceof C72347f) {
                    fVar = (C72347f) queryLocalInterface;
                } else {
                    fVar = new C72347f(iBinder);
                }
            }
            this.f193086a = fVar;
            fVar.mo17262he(1, fVar.mo17260gA());
        } catch (Exception e) {
            throw new C72304a(e);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        try {
            C72347f fVar = this.f193086a;
            fVar.mo17262he(2, fVar.mo17260gA());
            this.f193086a = null;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
