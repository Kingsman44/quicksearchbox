package com.google.p3723ar.imp.view.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.p3723ar.imp.view.ipc.p3727a.C47996b;

/* renamed from: com.google.ar.imp.view.ipc.LoaderService */
/* compiled from: PG */
public class LoaderService extends Service {

    /* renamed from: a */
    public static final String f124221a = "LoaderService";

    /* renamed from: b */
    private final LoaderServiceImpl f124222b = new LoaderServiceImpl();

    /* renamed from: c */
    private long f124223c;

    /* renamed from: com.google.ar.imp.view.ipc.LoaderService$LoaderServiceImpl */
    /* compiled from: PG */
    class LoaderServiceImpl extends C47996b {
        private LoaderServiceImpl() {
        }

        public void close() {
            Log.d(LoaderService.f124221a, "LoaderService closed");
            LoaderService.this.mo53107a();
        }

        public void create(ParcelFileDescriptor parcelFileDescriptor, String str) {
            Log.d(LoaderService.f124221a, "LoaderService created");
            LoaderService.this.create(parcelFileDescriptor, str);
        }
    }

    private static native long nCreate(int i);

    private static native void nDestroy(long j);

    /* renamed from: a */
    public final void mo53107a() {
        long j = this.f124223c;
        if (j != 0) {
            nDestroy(j);
        }
        this.f124223c = 0;
    }

    public void create(ParcelFileDescriptor parcelFileDescriptor, String str) {
        System.loadLibrary(str);
        long j = this.f124223c;
        if (j != 0) {
            nDestroy(j);
        }
        this.f124223c = nCreate(parcelFileDescriptor.detachFd());
    }

    public final IBinder onBind(Intent intent) {
        Log.d(f124221a, "LoaderService onBind");
        return this.f124222b;
    }

    public final boolean onUnbind(Intent intent) {
        Log.d(f124221a, "LoaderService unbound");
        mo53107a();
        return false;
    }
}
