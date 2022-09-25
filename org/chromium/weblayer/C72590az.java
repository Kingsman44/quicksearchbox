package org.chromium.weblayer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p031v4.app.Fragment;
import com.google.android.p445a.C8850c;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72322ar;
import org.chromium.p5643b.p5644a.C72341bj;

/* renamed from: org.chromium.weblayer.az */
/* compiled from: PG */
abstract class C72590az extends Fragment {

    /* renamed from: b */
    public C72588ax f193130b;

    /* renamed from: c */
    public boolean f193131c;

    /* renamed from: d */
    public boolean f193132d;

    /* renamed from: e */
    public C72322ar f193133e;

    protected C72590az() {
        C72604bm.m107399a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C72322ar mo64438a(Context context);

    /* renamed from: b */
    public final void mo64460b(Context context) {
        super.onAttach(context);
    }

    /* renamed from: c */
    public final void mo64461c(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: d */
    public final void mo64462d() {
        super.onDestroy();
    }

    /* renamed from: e */
    public final void mo64463e() {
        super.onDestroyView();
    }

    /* renamed from: f */
    public final void mo64464f() {
        super.onDetach();
    }

    /* renamed from: g */
    public final void mo64465g() {
        super.onPause();
    }

    /* renamed from: h */
    public final void mo64466h() {
        super.onResume();
    }

    /* renamed from: i */
    public final void mo64467i() {
        super.onStart();
    }

    /* renamed from: j */
    public final void mo64468j() {
        super.onStop();
    }

    public final void onActivityCreated(Bundle bundle) {
        C72604bm.m107399a();
        try {
            C72322ar arVar = this.f193133e;
            C72341bj bjVar = new C72341bj(bundle);
            Parcel gA = arVar.mo17260gA();
            C8850c.m23499h(gA, bjVar);
            arVar.mo17262he(3, gA);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C72604bm.m107399a();
        try {
            C72322ar arVar = this.f193133e;
            C72341bj bjVar = new C72341bj(intent);
            Parcel gA = arVar.mo17260gA();
            gA.writeInt(i);
            gA.writeInt(i2);
            C8850c.m23499h(gA, bjVar);
            arVar.mo17262he(13, gA);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public void onAttach(Context context) {
        C72604bm.m107399a();
        if (this.f193133e == null) {
            this.f193130b = new C72588ax(this);
            this.f193133e = mo64438a(context.getApplicationContext());
        }
        try {
            C72322ar arVar = this.f193133e;
            C72341bj bjVar = new C72341bj(context);
            Parcel gA = arVar.mo17260gA();
            C8850c.m23499h(gA, bjVar);
            arVar.mo17262he(2, gA);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public void onCreate(Bundle bundle) {
        C72604bm.m107399a();
        if (this.f193131c) {
            super.onCreate(bundle);
            return;
        }
        try {
            C72322ar arVar = this.f193133e;
            C72341bj bjVar = new C72341bj(bundle);
            Parcel gA = arVar.mo17260gA();
            C8850c.m23499h(gA, bjVar);
            arVar.mo17262he(1, gA);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
        /*
            r1 = this;
            org.chromium.weblayer.C72604bm.m107399a()
            org.chromium.b.a.ar r2 = r1.f193133e     // Catch:{ RemoteException -> 0x0047 }
            org.chromium.b.a.bj r0 = new org.chromium.b.a.bj     // Catch:{ RemoteException -> 0x0047 }
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x0047 }
            org.chromium.b.a.bj r3 = new org.chromium.b.a.bj     // Catch:{ RemoteException -> 0x0047 }
            r3.<init>(r4)     // Catch:{ RemoteException -> 0x0047 }
            android.os.Parcel r4 = r2.mo17260gA()     // Catch:{ RemoteException -> 0x0047 }
            com.google.android.p445a.C8850c.m23499h(r4, r0)     // Catch:{ RemoteException -> 0x0047 }
            com.google.android.p445a.C8850c.m23499h(r4, r3)     // Catch:{ RemoteException -> 0x0047 }
            r3 = 15
            android.os.Parcel r2 = r2.mo17261gT(r3, r4)     // Catch:{ RemoteException -> 0x0047 }
            android.os.IBinder r3 = r2.readStrongBinder()     // Catch:{ RemoteException -> 0x0047 }
            if (r3 != 0) goto L_0x0027
            r3 = 0
            goto L_0x003b
        L_0x0027:
            java.lang.String r4 = "org.chromium.weblayer_private.interfaces.IObjectWrapper"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)     // Catch:{ RemoteException -> 0x0047 }
            boolean r0 = r4 instanceof org.chromium.p5643b.p5644a.C72317am     // Catch:{ RemoteException -> 0x0047 }
            if (r0 == 0) goto L_0x0035
            r3 = r4
            org.chromium.b.a.am r3 = (org.chromium.p5643b.p5644a.C72317am) r3     // Catch:{ RemoteException -> 0x0047 }
            goto L_0x003b
        L_0x0035:
            org.chromium.b.a.ak r4 = new org.chromium.b.a.ak     // Catch:{ RemoteException -> 0x0047 }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x0047 }
            r3 = r4
        L_0x003b:
            r2.recycle()     // Catch:{ RemoteException -> 0x0047 }
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.Object r2 = org.chromium.p5643b.p5644a.C72341bj.m106988a(r3, r2)     // Catch:{ RemoteException -> 0x0047 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0047 }
            return r2
        L_0x0047:
            r2 = move-exception
            org.chromium.b.a.a r3 = new org.chromium.b.a.a
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.weblayer.C72590az.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        if (this.f193132d || this.f193131c) {
            super.onDestroy();
            return;
        }
        C72604bm.m107399a();
        try {
            this.f193133e.mo63715e();
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public final void onDestroyView() {
        C72604bm.m107399a();
        try {
            C72322ar arVar = this.f193133e;
            arVar.mo17262he(9, arVar.mo17260gA());
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public final void onDetach() {
        C72604bm.m107399a();
        try {
            C72322ar arVar = this.f193133e;
            arVar.mo17262he(10, arVar.mo17260gA());
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public final void onPause() {
        C72604bm.m107399a();
        try {
            C72322ar arVar = this.f193133e;
            arVar.mo17262he(7, arVar.mo17260gA());
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C72604bm.m107399a();
        try {
            C72322ar arVar = this.f193133e;
            Parcel gA = arVar.mo17260gA();
            gA.writeInt(i);
            gA.writeStringArray(strArr);
            gA.writeIntArray(iArr);
            arVar.mo17262he(14, gA);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public final void onResume() {
        C72604bm.m107399a();
        try {
            C72322ar arVar = this.f193133e;
            arVar.mo17262he(6, arVar.mo17260gA());
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C72604bm.m107399a();
        try {
            C72322ar arVar = this.f193133e;
            C72341bj bjVar = new C72341bj(bundle);
            Parcel gA = arVar.mo17260gA();
            C8850c.m23499h(gA, bjVar);
            arVar.mo17262he(12, gA);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public final void onStart() {
        C72604bm.m107399a();
        try {
            C72322ar arVar = this.f193133e;
            arVar.mo17262he(5, arVar.mo17260gA());
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    public final void onStop() {
        C72604bm.m107399a();
        try {
            C72322ar arVar = this.f193133e;
            arVar.mo17262he(8, arVar.mo17260gA());
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
