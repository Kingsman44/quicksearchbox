package com.google.android.libraries.web.weblayer.p3450c.p3451a;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.web.base.C43257h;
import com.google.android.libraries.web.browser.internal.p3352a.C43288g;
import com.google.android.libraries.web.p3420k.p3421a.C43854a;
import com.google.android.libraries.web.weblayer.p3468g.p3469a.C44297y;
import com.google.android.p445a.C8850c;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72331b;
import org.chromium.p5643b.p5644a.C72341bj;
import org.chromium.weblayer.C72591b;
import org.chromium.weblayer.C72601bj;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;
import org.chromium.weblayer.C72615d;
import p3186j$.util.Objects;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.c.a.b */
/* compiled from: PG */
final class C44131b implements C43288g {

    /* renamed from: a */
    final /* synthetic */ C44142m f114850a;

    public C44131b(C44142m mVar) {
        this.f114850a = mVar;
    }

    /* renamed from: a */
    public final void mo46393a(C43854a aVar) {
        C69664n.m101061g(aVar, "callback");
        if (this.f114850a.f114871i.isEmpty()) {
            C72615d dVar = this.f114850a.f114872j;
            C69664n.m101058d(dVar);
            C44132c cVar = new C44132c(this.f114850a);
            C72604bm.m107399a();
            dVar.mo64487f();
            if (C72611bt.m107413a() >= 88) {
                if (dVar.f193180c.mo64454b()) {
                    try {
                        C72331b bVar = dVar.f193182e;
                        Parcel gA = bVar.mo17260gA();
                        C8850c.m23495d(gA, true);
                        bVar.mo17262he(14, gA);
                    } catch (RemoteException e) {
                        throw new C72304a(e);
                    }
                }
                dVar.f193180c.mo64455c(cVar);
            } else {
                throw new UnsupportedOperationException();
            }
        }
        this.f114850a.f114871i.add(aVar);
    }

    /* renamed from: b */
    public final /* synthetic */ C43257h mo46394b(C43257h hVar) {
        C69664n.m101061g(hVar, "loadUrlParams");
        return hVar;
    }

    /* renamed from: c */
    public final void mo46395c(boolean z, C69626l lVar) {
        C72615d dVar = this.f114850a.f114872j;
        C69664n.m101058d(dVar);
        C44130a aVar = new C44130a(lVar);
        C72604bm.m107399a();
        if (C72611bt.m107413a() >= 90) {
            dVar.mo64487f();
            try {
                C72331b bVar = dVar.f193182e;
                Objects.requireNonNull(aVar);
                C72341bj bjVar = new C72341bj(new C72591b(aVar));
                Parcel gA = bVar.mo17260gA();
                gA.writeInt(z ? 1 : 0);
                C8850c.m23499h(gA, bjVar);
                bVar.mo17262he(18, gA);
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d */
    public final boolean mo46396d() {
        return this.f114850a.mo47100e();
    }

    /* renamed from: e */
    public final void mo46397e() {
        C72615d dVar = this.f114850a.f114872j;
        C69664n.m101058d(dVar);
        C72604bm.m107399a();
        if (C72611bt.m107413a() >= 91) {
            dVar.mo64487f();
            try {
                C72331b bVar = dVar.f193182e;
                Parcel gA = bVar.mo17260gA();
                C8850c.m23495d(gA, false);
                bVar.mo17262he(19, gA);
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    public final void mo46398f() {
        C72615d dVar = this.f114850a.f114872j;
        C69664n.m101058d(dVar);
        dVar.mo64484c(C44297y.m78190a(this.f114850a.mo47097b()).f115192a);
    }

    /* renamed from: g */
    public final void mo46399g() {
        C44142m mVar = this.f114850a;
        if (!mVar.f114870h.mo46945l() && !mVar.f114867e) {
            C72615d dVar = mVar.f114872j;
            C69664n.m101058d(dVar);
            C72601bj a = dVar.mo64482a();
            C69664n.m101058d(a);
            mVar.mo47101f(a);
        }
    }
}
