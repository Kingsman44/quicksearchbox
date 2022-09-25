package com.google.common.android.concurrent;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.util.Log;
import androidx.lifecycle.C2344as;
import androidx.lifecycle.C2358bf;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import androidx.p060c.C0985o;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import java.util.Set;

/* renamed from: com.google.common.android.concurrent.t */
/* compiled from: PG */
public final class C58295t extends C2358bf implements C58298w {

    /* renamed from: j */
    private static volatile Handler f155846j;

    /* renamed from: a */
    public final C0985o f155847a = new C0985o(10);

    /* renamed from: b */
    public final Set f155848b;

    /* renamed from: c */
    public FragmentManager f155849c;

    /* renamed from: d */
    public C58277b f155850d;

    /* renamed from: e */
    public boolean f155851e;

    /* renamed from: f */
    public boolean f155852f;

    /* renamed from: g */
    public boolean f155853g;

    /* renamed from: h */
    public boolean f155854h;

    /* renamed from: i */
    public final String f155855i;

    /* renamed from: k */
    private final C2344as f155856k;

    public C58295t(C2344as asVar) {
        this.f155848b = new C0979i(0);
        this.f155849c = null;
        this.f155851e = false;
        this.f155852f = false;
        this.f155853g = false;
        this.f155854h = false;
        this.f155856k = asVar;
        this.f155855i = C58817ah.class.getName() + Fragment.class.getName() + getClass().getName();
        if (asVar.mo5759f()) {
            Bundle bundle = (Bundle) asVar.mo5755b("FutureListenerState");
            this.f155853g = true;
            m89273h(bundle);
            Parcelable[] parcelableArray = bundle.getParcelableArray("futures");
            if (parcelableArray != null) {
                for (Parcelable parcelable : parcelableArray) {
                    this.f155848b.add((ParcelableFuture) parcelable);
                }
            }
        }
        asVar.mo5758e("FutureListenerState", new C58287l(this));
    }

    /* renamed from: f */
    public static final void m89272f() {
        C58838bb.m90884s(Looper.myLooper() == Looper.getMainLooper(), "Must be called from the main thread.");
    }

    /* renamed from: h */
    private final void m89273h(Bundle bundle) {
        String string = bundle.getString("appVersion");
        if (string == null) {
            throw new C58294s("Got key but not value from saved state.");
        } else if (!this.f155855i.equals(string)) {
            String str = this.f155855i;
            throw new C58294s("Got data from old app version: expected=" + str + " got=" + string);
        }
    }

    /* renamed from: a */
    public final void mo54860a(Runnable runnable) {
        this.f155854h = true;
        try {
            runnable.run();
        } finally {
            this.f155854h = false;
        }
    }

    /* renamed from: b */
    public final void mo54861b(ParcelableFuture parcelableFuture, Throwable th) {
        mo54862c(parcelableFuture, new C58290o(this, parcelableFuture, th));
    }

    /* renamed from: c */
    public final void mo54862c(ParcelableFuture parcelableFuture, Runnable runnable) {
        if (this.f155849c != null) {
            if (f155846j == null) {
                f155846j = new Handler(Looper.getMainLooper());
            }
            f155846j.post(new C58291p(this, parcelableFuture, runnable));
        }
    }

    /* renamed from: d */
    public final void mo639d() {
        int i = ((C0979i) this.f155848b).f3101b;
        Log.i("FutureListener", "Dropped results for " + i + " pending futures.");
        C0978h hVar = new C0978h((C0979i) this.f155848b);
        while (hVar.hasNext()) {
            ParcelableFuture parcelableFuture = (ParcelableFuture) hVar.next();
            if (((C58281f) this.f155847a.mo3726e(parcelableFuture.f155815a)) != null) {
                mo54860a(new C58288m(parcelableFuture));
            }
        }
        this.f155848b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo54863e(FragmentManager fragmentManager) {
        boolean z = true;
        C58838bb.m90868c(fragmentManager != null);
        FragmentManager fragmentManager2 = this.f155849c;
        C58838bb.m90883r(fragmentManager2 == null || fragmentManager == fragmentManager2);
        if (!this.f155852f) {
            if (this.f155856k.mo5759f()) {
                Bundle bundle = (Bundle) this.f155856k.mo5755b("FutureListenerState");
                m89273h(bundle);
                int[] intArray = bundle.getIntArray("callback_ids");
                int length = intArray.length;
                for (int i = 0; i < length; i++) {
                    C58838bb.m90884s(this.f155847a.mo3726e(intArray[i]) != null, "Didn't re-register callback.");
                }
            }
            this.f155852f = true;
        }
        if (!this.f155851e && this.f155849c != null) {
            z = false;
        }
        if (this.f155849c == null) {
            this.f155849c = fragmentManager;
        }
        if (z) {
            this.f155851e = false;
            C0978h hVar = new C0978h((C0979i) this.f155848b);
            while (hVar.hasNext()) {
                ParcelableFuture parcelableFuture = (ParcelableFuture) hVar.next();
                if (!parcelableFuture.mo54849b()) {
                    C58281f fVar = (C58281f) this.f155847a.mo3726e(parcelableFuture.f155815a);
                    mo54864g(parcelableFuture);
                }
                parcelableFuture.f155818d = this;
                parcelableFuture.mo54848a();
            }
        }
    }

    /* renamed from: g */
    public final void mo54864g(ParcelableFuture parcelableFuture) {
        mo54860a(new C58293r(parcelableFuture));
    }
}
