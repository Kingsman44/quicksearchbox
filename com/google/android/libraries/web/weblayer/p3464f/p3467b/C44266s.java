package com.google.android.libraries.web.weblayer.p3464f.p3467b;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.web.profile.C44072g;
import com.google.android.libraries.web.profile.Profile;
import com.google.android.libraries.web.weblayer.wrapper.C44315a;
import com.google.android.p445a.C8850c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72319ao;
import org.chromium.weblayer.C72587aw;
import org.chromium.weblayer.C72604bm;
import org.chromium.weblayer.C72611bt;

/* renamed from: com.google.android.libraries.web.weblayer.f.b.s */
/* compiled from: PG */
public final class C44266s implements C44072g {

    /* renamed from: a */
    private final Profile f115123a;

    /* renamed from: b */
    private final C44315a f115124b;

    /* renamed from: c */
    private final Executor f115125c;

    public C44266s(Profile profile, Executor executor, C44315a aVar) {
        this.f115123a = profile;
        this.f115124b = aVar;
        this.f115125c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo47033a() {
        C44259l lVar = new C44259l(this);
        return C60856cj.m92904m(C47810es.m84978r(lVar), this.f115125c);
    }

    /* renamed from: b */
    public final C60870cx mo47034b() {
        C44263p pVar = new C44263p(this);
        return C60856cj.m92904m(C47810es.m84978r(pVar), this.f115125c);
    }

    /* renamed from: c */
    public final C60870cx mo47035c() {
        C44258k kVar = new C44258k(this);
        return C60856cj.m92904m(C47810es.m84978r(kVar), this.f115125c);
    }

    /* renamed from: d */
    public final C60870cx mo47036d() {
        C44262o oVar = new C44262o(this);
        return C60856cj.m92904m(C47810es.m84978r(oVar), this.f115125c);
    }

    /* renamed from: e */
    public final C60870cx mo47037e(boolean z) {
        C44265r rVar = new C44265r(this, z);
        return C60856cj.m92903l(C47810es.m84977q(rVar), this.f115125c);
    }

    /* renamed from: f */
    public final C60870cx mo47038f(boolean z) {
        C44260m mVar = new C44260m(this, z);
        return C60856cj.m92903l(C47810es.m84977q(mVar), this.f115125c);
    }

    /* renamed from: g */
    public final C60870cx mo47039g(boolean z) {
        C44261n nVar = new C44261n(this, z);
        return C60856cj.m92903l(C47810es.m84977q(nVar), this.f115125c);
    }

    /* renamed from: h */
    public final C60870cx mo47040h(boolean z) {
        C44264q qVar = new C44264q(this, z);
        return C60856cj.m92903l(C47810es.m84977q(qVar), this.f115125c);
    }

    /* renamed from: i */
    public final void mo47172i(int i, boolean z) {
        C72611bt h = this.f115124b.mo47217h();
        h.getClass();
        C72587aw a = C44268u.m78127a(h, this.f115123a);
        C72604bm.m107399a();
        try {
            C72319ao aoVar = a.f193125g;
            Parcel gA = aoVar.mo17260gA();
            gA.writeInt(i);
            C8850c.m23495d(gA, z);
            aoVar.mo17262he(8, gA);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: j */
    public final boolean mo47173j(int i) {
        C72611bt h = this.f115124b.mo47217h();
        h.getClass();
        C72587aw a = C44268u.m78127a(h, this.f115123a);
        C72604bm.m107399a();
        try {
            C72319ao aoVar = a.f193125g;
            Parcel gA = aoVar.mo17260gA();
            gA.writeInt(i);
            Parcel gT = aoVar.mo17261gT(9, gA);
            boolean i2 = C8850c.m23500i(gT);
            gT.recycle();
            return i2;
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }
}
