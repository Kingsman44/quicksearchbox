package com.google.android.libraries.p1703d;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p026a.C0121c;
import android.support.p026a.C0122d;
import android.support.p026a.C0123e;
import androidx.browser.p059a.C0963k;
import androidx.browser.p059a.C0967o;
import androidx.core.app.C1826m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.d.z */
/* compiled from: PG */
public final class C20670z {

    /* renamed from: a */
    public final C20665u f57938a;

    /* renamed from: b */
    public final C0967o f57939b;

    /* renamed from: c */
    public final C20643ag f57940c;

    /* renamed from: d */
    public final C20669y f57941d = m38842i("setHideDomainForSession", "hidden");

    /* renamed from: e */
    private final IBinder f57942e;

    /* renamed from: f */
    private final Parcelable f57943f;

    /* renamed from: g */
    private volatile Boolean f57944g = null;

    /* renamed from: h */
    private final C20669y f57945h = m38842i("setPrerenderOnCellularForSession", "prerender");

    /* renamed from: i */
    private final C20669y f57946i = m38842i("setIgnoreUrlFragmentsForSession", "ignoreFragments");

    public C20670z(C20665u uVar, C0967o oVar, C20643ag agVar) {
        this.f57938a = uVar;
        this.f57939b = oVar;
        this.f57942e = C1826m.m5004a(new C0963k(oVar).mo3582a().f3074a.getExtras(), "android.support.customtabs.extra.SESSION");
        this.f57943f = new C0963k(oVar).mo3582a().f3074a.getParcelableExtra("android.support.customtabs.extra.SESSION_ID");
        this.f57940c = agVar;
    }

    /* renamed from: i */
    private static C20669y m38842i(String str, String str2) {
        return new C20669y(new AtomicBoolean(false), str2, str);
    }

    /* renamed from: a */
    public final Bundle mo25662a() {
        Bundle bundle = new Bundle();
        C1826m.m5005b(bundle, "session", this.f57942e);
        bundle.putParcelable("pendingId", this.f57943f);
        return bundle;
    }

    /* renamed from: b */
    public final C0963k mo25663b() {
        return new C0963k(this.f57939b);
    }

    /* renamed from: c */
    public final void mo25664c(Uri uri) {
        if (this.f57938a.mo25587k(14)) {
            Bundle a = mo25662a();
            a.putParcelable("origin", uri);
            this.f57938a.f57933b.mo3580a("addVerifiedOriginForSession", a);
        }
    }

    /* renamed from: d */
    public final void mo25665d() {
        if (this.f57938a.mo25587k(11)) {
            C20665u uVar = this.f57938a;
            uVar.f57933b.mo3580a("requestCurrentNavigationInfoForSession", mo25662a());
        }
    }

    /* renamed from: e */
    public final boolean mo25666e() {
        Bundle a = this.f57938a.f57933b.mo3580a("enableParallelRequestForSession", mo25662a());
        return a != null && a.getBoolean("enableParallelRequestForSession");
    }

    /* renamed from: f */
    public final boolean mo25667f() {
        return this.f57938a.mo25587k(26);
    }

    /* renamed from: g */
    public final boolean mo25668g() {
        if (this.f57944g == null) {
            boolean z = false;
            if (this.f57938a.mo25587k(16)) {
                C20665u uVar = this.f57938a;
                Bundle a = uVar.f57933b.mo3580a("isSWAAUser", mo25662a());
                if (a != null) {
                    z = a.getBoolean("isSWAAUser");
                }
            }
            this.f57944g = Boolean.valueOf(z);
        }
        return this.f57944g.booleanValue();
    }

    /* renamed from: h */
    public final boolean mo25669h(C20645ai aiVar) {
        Parcel obtain;
        Parcel obtain2;
        if (aiVar.mo25597a() == null && !this.f57938a.mo25587k(3)) {
            return false;
        }
        this.f57945h.mo25661a(this, aiVar.mo25601e());
        this.f57946i.mo25661a(this, aiVar.mo25600d());
        C0967o oVar = this.f57939b;
        Uri a = aiVar.mo25597a();
        Bundle b = aiVar.mo25598b();
        List<Parcelable> c = aiVar.mo25599c();
        ArrayList arrayList = null;
        if (c != null && !c.isEmpty()) {
            arrayList = new ArrayList();
            for (Parcelable putParcelable : c) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.otherurls.URL", putParcelable);
                arrayList.add(bundle);
            }
        }
        Bundle bundle2 = new Bundle();
        if (b != null) {
            bundle2.putAll(b);
        }
        oVar.mo3593a(bundle2);
        try {
            C0122d dVar = oVar.f3080d;
            C0121c cVar = oVar.f3077a;
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeStrongInterface(cVar);
            C0123e.m127a(obtain, a);
            C0123e.m127a(obtain, bundle2);
            obtain.writeTypedList(arrayList);
            dVar.f321a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            boolean z = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (RemoteException unused) {
            return false;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
