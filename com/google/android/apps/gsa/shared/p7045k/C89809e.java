package com.google.android.apps.gsa.shared.p7045k;

import androidx.mediarouter.p175a.C3685au;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.cast.CastDevice;
import com.google.android.libraries.gcoreclient.cast.GcoreCastDevice;
import com.google.android.libraries.gcoreclient.cast.impl.BaseGcoreCastDeviceImpl;
import com.google.android.libraries.gcoreclient.cast.impl.C21480a;
import com.google.android.libraries.gcoreclient.cast.impl.GcoreCastDeviceImpl;
import com.google.assistant.p3861at.C49875cf;
import java.net.Inet4Address;
import java.net.InetAddress;

/* renamed from: com.google.android.apps.gsa.shared.k.e */
/* compiled from: PG */
public abstract class C89809e {
    /* renamed from: l */
    public static C89808d m146210l() {
        C89787a aVar = new C89787a();
        aVar.mo83640i(1);
        aVar.mo83635d(C49875cf.UNKNOWN);
        aVar.f243015b = BuildConfig.FLAVOR;
        aVar.f243014a = BuildConfig.FLAVOR;
        aVar.f243016c = BuildConfig.FLAVOR;
        aVar.mo83633b(false);
        aVar.mo83636e(InetAddress.getLoopbackAddress());
        aVar.mo83638g(false);
        aVar.mo83637f(false);
        aVar.mo83639h(0);
        return aVar;
    }

    /* renamed from: m */
    static C89809e m146211m(C3685au auVar) {
        GcoreCastDevice a = C21480a.m40590a(auVar.f11876p);
        GcoreCastDeviceImpl gcoreCastDeviceImpl = (GcoreCastDeviceImpl) a;
        int i = 4;
        boolean z = true;
        if (!gcoreCastDeviceImpl.f59914a.mo118384d(32)) {
            i = gcoreCastDeviceImpl.f59914a.mo118384d(4) ? gcoreCastDeviceImpl.f59914a.mo118384d(1) ? 2 : 3 : 1;
            z = false;
        }
        C89808d l = m146210l();
        BaseGcoreCastDeviceImpl baseGcoreCastDeviceImpl = (BaseGcoreCastDeviceImpl) a;
        l.mo83634c(baseGcoreCastDeviceImpl.f59914a.mo118383c());
        InetAddress inetAddress = baseGcoreCastDeviceImpl.f59914a.f388601c;
        l.mo83636e(inetAddress instanceof Inet4Address ? (Inet4Address) inetAddress : null);
        CastDevice castDevice = baseGcoreCastDeviceImpl.f59914a;
        C89787a aVar = (C89787a) l;
        aVar.f243015b = castDevice.f388603e;
        aVar.f243016c = castDevice.f388602d;
        l.mo83640i(i);
        l.mo83635d(C49875cf.UNKNOWN);
        l.mo83637f(z);
        return l.mo83632a();
    }

    /* renamed from: a */
    public abstract int mo83645a();

    /* renamed from: b */
    public abstract C89808d mo83646b();

    /* renamed from: c */
    public abstract C49875cf mo83647c();

    /* renamed from: d */
    public abstract String mo83648d();

    /* renamed from: e */
    public abstract String mo83649e();

    /* renamed from: f */
    public abstract String mo83651f();

    /* renamed from: g */
    public abstract InetAddress mo83652g();

    /* renamed from: h */
    public abstract boolean mo83653h();

    /* renamed from: i */
    public abstract boolean mo83655i();

    /* renamed from: j */
    public abstract boolean mo83656j();

    @Deprecated
    /* renamed from: k */
    public abstract int mo83657k();
}
