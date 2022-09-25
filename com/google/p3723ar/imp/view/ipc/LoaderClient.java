package com.google.p3723ar.imp.view.ipc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p3723ar.imp.view.ipc.p3727a.C47996b;
import com.google.p3723ar.imp.view.ipc.p3727a.C47997c;
import com.google.p3723ar.sceneform.concurrent.C48017a;
import com.google.p3723ar.sceneform.concurrent.C48018b;
import com.google.p3723ar.sceneform.concurrent.CompletableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.ar.imp.view.ipc.LoaderClient */
/* compiled from: PG */
public class LoaderClient implements ServiceConnection {

    /* renamed from: a */
    public static final String f124212a = "LoaderClient";

    /* renamed from: b */
    public static String f124213b = "imp_view_jni";

    /* renamed from: c */
    public C47997c f124214c;

    /* renamed from: d */
    public int f124215d = 0;

    /* renamed from: e */
    public String f124216e;

    /* renamed from: f */
    private final Context f124217f;

    /* renamed from: g */
    private long f124218g;

    /* renamed from: h */
    private boolean f124219h = false;

    /* renamed from: i */
    private CompletableFuture f124220i;

    LoaderClient(Context context) {
        this.f124217f = context;
        this.f124216e = f124213b;
        try {
            this.f124216e = (String) Class.forName("com.google.ar.imp.test.Constants").getMethod("getNativeLibName", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ClassCastException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e(f124212a, "Exception invoking Constants class ".concat(String.valueOf(e.getMessage())));
            throw new IllegalStateException(e);
        } catch (ClassNotFoundException unused) {
        }
    }

    /* renamed from: a */
    private final void m85163a() {
        synchronized (this) {
            this.f124214c = null;
        }
        nHandleDisconnect(this.f124218g);
    }

    private static native void nHandleClose(long j);

    private static native void nHandleDisconnect(long j);

    public void close() {
        long j = this.f124218g;
        if (j != 0) {
            nHandleClose(j);
        }
        synchronized (this) {
            C47997c cVar = this.f124214c;
            if (cVar != null) {
                try {
                    cVar.close();
                } catch (RemoteException e) {
                    Log.w(f124212a, "Failure closing service: ", e);
                }
            }
        }
    }

    public void disconnect() {
        boolean z;
        m85163a();
        String str = f124212a;
        Log.d(str, "Stopping service");
        synchronized (this) {
            z = this.f124219h;
            this.f124219h = false;
        }
        if (z) {
            Log.d(str, "Calling unbindService");
            this.f124217f.unbindService(this);
        }
    }

    /* access modifiers changed from: package-private */
    public int getClientSocketFileDescriptor() {
        return this.f124215d;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str = f124212a;
        Log.d(str, "Service connected");
        synchronized (this) {
            this.f124214c = C47996b.asInterface(iBinder);
            CompletableFuture completableFuture = this.f124220i;
            if (completableFuture != null) {
                try {
                    ((SettableFuture) completableFuture.f124264b).mo57356n((Object) null);
                    this.f124220i = null;
                } catch (ClassCastException e) {
                    throw new RuntimeException(e);
                }
            } else {
                Log.w(str, "Service connected did not have corresponding request");
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Log.d(f124212a, "Service disconnected");
        m85163a();
    }

    /* access modifiers changed from: package-private */
    public void setNativeHandler(long j) {
        this.f124218g = j;
    }

    public CompletableFuture startLoaderService() {
        CompletableFuture completableFuture = new CompletableFuture();
        synchronized (this) {
            CompletableFuture completableFuture2 = this.f124220i;
            if (completableFuture2 != null) {
                completableFuture = completableFuture2;
            } else {
                this.f124220i = completableFuture;
                this.f124217f.bindService(new Intent(this.f124217f, LoaderService.class), this, 193);
                synchronized (this) {
                    this.f124219h = true;
                }
            }
        }
        C47994a aVar = new C47994a(this);
        Executor executor = CompletableFuture.f124263a;
        C60870cx cxVar = completableFuture.f124264b;
        Objects.requireNonNull(aVar);
        CompletableFuture completableFuture3 = new CompletableFuture(C60922j.m93044g(cxVar, new C48017a(aVar), executor));
        C47998b bVar = C47998b.f124225a;
        C60870cx cxVar2 = completableFuture3.f124264b;
        Objects.requireNonNull(bVar);
        C60846c.m92878g(cxVar2, Throwable.class, new C48018b(), C60826bg.f164896a);
        return completableFuture3;
    }
}
