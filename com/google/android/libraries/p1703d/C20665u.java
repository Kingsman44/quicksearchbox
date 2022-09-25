package com.google.android.libraries.p1703d;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p026a.C0122d;
import androidx.browser.p059a.C0962j;
import androidx.browser.p059a.C0967o;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.d.u */
/* compiled from: PG */
public final class C20665u extends C20640ad {

    /* renamed from: a */
    public final String f57932a;

    /* renamed from: b */
    public final C0962j f57933b;

    /* renamed from: c */
    private final C58881cr f57934c = C58886cw.m90973a(new C20662r(this));

    public C20665u(ComponentName componentName, C0962j jVar) {
        this.f57932a = componentName.getPackageName();
        this.f57933b = jVar;
    }

    /* renamed from: g */
    public static C60870cx m38827g(Context context, String str, C60931s sVar) {
        SettableFuture settableFuture = new SettableFuture();
        C20663s sVar2 = new C20663s(settableFuture);
        C60870cx h = C60922j.m93045h(settableFuture, sVar, C60826bg.f164896a);
        if (C0962j.m2898d(context, str, sVar2)) {
            h.mo4106b(new C20661q(context, sVar2), C60826bg.f164896a);
        } else {
            settableFuture.mo57357o(new C20664t());
        }
        return h;
    }

    /* renamed from: a */
    public final String mo25581a() {
        Bundle a = this.f57933b.mo3580a("getAccountName", (Bundle) null);
        if (a == null) {
            return null;
        }
        return a.getString("getAccountName");
    }

    /* renamed from: b */
    public final String mo25582b() {
        throw null;
    }

    /* renamed from: d */
    public final C20670z mo25658d() {
        C20643ag agVar = new C20643ag();
        C0967o b = this.f57933b.mo3581b(agVar, (PendingIntent) null);
        if (b == null) {
            return null;
        }
        return new C20670z(this, b, agVar);
    }

    /* renamed from: e */
    public final C20670z mo25659e(int i) {
        C20643ag agVar = new C20643ag();
        C0962j jVar = this.f57933b;
        C0967o b = jVar.mo3581b(agVar, PendingIntent.getActivity(jVar.f3064a, i, new Intent(), 67108864));
        if (b == null) {
            return null;
        }
        return new C20670z(this, b, agVar);
    }

    /* renamed from: f */
    public final boolean mo25583f() {
        if (ActivityManager.isRunningInUserTestHarness()) {
            return true;
        }
        Bundle a = this.f57933b.mo3580a("isFirstRunDone", (Bundle) null);
        if (a == null || !a.getBoolean("isFirstRunDone")) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo25660h() {
        Parcel obtain;
        Parcel obtain2;
        try {
            C0122d dVar = this.f57933b.f3065b;
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeLong(0);
            dVar.f321a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.readInt();
            obtain2.recycle();
            obtain.recycle();
        } catch (RemoteException unused) {
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    /* renamed from: iG */
    public final Integer mo25584iG() {
        return (Integer) ((C58833ax) this.f57934c.mo6453a()).mo56111f();
    }
}
