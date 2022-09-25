package com.google.android.apps.gsa.nowoverlayservice;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.p5846e.C74507e;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
public class DrawerOverlayService extends C83436ak {

    /* renamed from: a */
    public C83480bn f227396a;

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f227396a.mo76821q(printWriter);
    }

    public final IBinder onBind(Intent intent) {
        return this.f227396a.mo76818n(intent);
    }

    public final void onCreate() {
        C74507e.m120466b(11);
        super.onCreate();
        this.f227396a.mo76770f();
    }

    public final void onDestroy() {
        this.f227396a.mo76819o();
        super.onDestroy();
    }

    public final boolean onUnbind(Intent intent) {
        this.f227396a.mo76820p(intent);
        return false;
    }
}
