package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.C143933h;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.libs.p10835c.C144855c;
import com.google.android.gms.libs.p10836d.p10839c.C144859a;
import com.google.android.gms.libs.p10836d.p10839c.C144860b;
import com.google.android.gms.wearable.C146530m;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.wearable.internal.dc */
/* compiled from: PG */
public final class C146499dc extends C143887ac {

    /* renamed from: a */
    public final ExecutorService f395681a;

    /* renamed from: b */
    public final C146456bn f395682b = new C146456bn();

    /* renamed from: c */
    public final C146456bn f395683c = new C146456bn();

    /* renamed from: d */
    public final C146456bn f395684d = new C146456bn();

    /* renamed from: e */
    public final File f395685e;

    /* renamed from: f */
    private final C146456bn f395686f = new C146456bn();

    /* renamed from: g */
    private final C146456bn f395687g = new C146456bn();

    /* renamed from: h */
    private final C146456bn f395688h = new C146456bn();

    /* renamed from: i */
    private final C146456bn f395689i = new C146456bn();

    /* renamed from: j */
    private final C146456bn f395690j = new C146456bn();

    /* renamed from: k */
    private final C146456bn f395691k = new C146456bn();

    /* renamed from: l */
    private final C146456bn f395692l = new C146456bn();

    /* renamed from: m */
    private final C146504dh f395693m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C146499dc(Context context, Looper looper, C143849u uVar, C143850v vVar, C143944s sVar) {
        super(context, looper, 14, sVar, uVar, vVar);
        C144859a aVar = C144860b.f391709a;
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        C146504dh a = C146504dh.m238504a(context);
        C143919bh.m233958a(unconfigurableExecutorService);
        this.f395681a = unconfigurableExecutorService;
        this.f395693m = a;
        File file = new File(new File(context.getFilesDir(), "wearos_assets"), "streamtmp");
        file.mkdirs();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        this.f395685e = file;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo119453I() {
        return this.f395693m.mo123292b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 8600000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof C146452bj ? (C146452bj) queryLocalInterface : new C146452bj(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.wearable.BIND";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C146530m.f395735o;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo118927p(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i);
        }
        if (i == 0) {
            this.f395686f.mo123256b(iBinder);
            this.f395687g.mo123256b(iBinder);
            this.f395688h.mo123256b(iBinder);
            this.f395682b.mo123256b(iBinder);
            this.f395683c.mo123256b(iBinder);
            this.f395690j.mo123256b(iBinder);
            this.f395691k.mo123256b(iBinder);
            this.f395692l.mo123256b(iBinder);
            this.f395684d.mo123256b(iBinder);
            this.f395689i.mo123256b(iBinder);
            i = 0;
        }
        super.mo118927p(i, iBinder, bundle, i2);
    }

    /* renamed from: v */
    public final void mo119466v(C143933h hVar) {
        if (!mo119470z()) {
            try {
                Bundle bundle = this.f390156t.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i);
                    Context context = this.f390156t;
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    mo119459Q(hVar, 6, PendingIntent.getActivity(context, 0, intent, C144855c.f391705a));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                mo119459Q(hVar, 16, (PendingIntent) null);
                return;
            }
        }
        super.mo119466v(hVar);
    }

    /* renamed from: z */
    public final boolean mo119470z() {
        return !this.f395693m.mo123292b();
    }
}
