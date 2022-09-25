package com.google.android.gms.cast.internal;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.cast.internal.r */
/* compiled from: PG */
final class C143592r extends C143562aa {

    /* renamed from: a */
    private final AtomicReference f389335a;

    /* renamed from: b */
    private final Handler f389336b;

    public C143592r(C143593s sVar) {
        this.f389335a = new AtomicReference(sVar);
        this.f389336b = new C144861c(sVar.f390157u);
    }

    /* renamed from: a */
    public final void mo118467a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        C143593s sVar = (C143593s) this.f389335a.get();
        if (sVar != null) {
            sVar.f389344d = applicationMetadata;
            sVar.f389356p = applicationMetadata.f388592a;
            sVar.f389357q = str2;
            sVar.f389348h = str;
            synchronized (C143593s.f389338b) {
            }
        }
    }

    /* renamed from: b */
    public final void mo118468b(int i) {
        if (((C143593s) this.f389335a.get()) != null) {
            synchronized (C143593s.f389338b) {
            }
        }
    }

    /* renamed from: c */
    public final void mo118469c(int i) {
        C143593s sVar = (C143593s) this.f389335a.get();
        if (sVar != null) {
            sVar.f389356p = null;
            sVar.f389357q = null;
            synchronized (C143593s.f389339c) {
            }
            if (sVar.f389346f != null) {
                this.f389336b.post(new C143588n(sVar, i));
            }
        }
    }

    /* renamed from: d */
    public final void mo118470d(int i) {
        if (((C143593s) this.f389335a.get()) != null) {
            synchronized (C143593s.f389339c) {
            }
        }
    }

    /* renamed from: e */
    public final void mo118471e(ApplicationStatus applicationStatus) {
        C143593s sVar = (C143593s) this.f389335a.get();
        if (sVar != null) {
            C143593s.f389337a.mo118884b("onApplicationStatusChanged", new Object[0]);
            this.f389336b.post(new C143590p(sVar, applicationStatus));
        }
    }

    /* renamed from: f */
    public final void mo118472f(int i) {
        if (((C143593s) this.f389335a.get()) != null) {
            synchronized (C143593s.f389339c) {
            }
        }
    }

    /* renamed from: g */
    public final void mo118473g(String str, byte[] bArr) {
        if (((C143593s) this.f389335a.get()) != null) {
            C143593s.f389337a.mo118884b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
        }
    }

    /* renamed from: h */
    public final void mo118474h(int i) {
    }

    /* renamed from: i */
    public final void mo118475i(DeviceStatus deviceStatus) {
        C143593s sVar = (C143593s) this.f389335a.get();
        if (sVar != null) {
            C143593s.f389337a.mo118884b("onDeviceStatusChanged", new Object[0]);
            this.f389336b.post(new C143589o(sVar, deviceStatus));
        }
    }

    /* renamed from: j */
    public final void mo118476j(int i) {
        C143593s p = mo118922p();
        if (p != null) {
            C143593s.f389337a.mo118884b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                p.mo119458P(2);
            }
        }
    }

    /* renamed from: k */
    public final void mo118477k(int i) {
    }

    /* renamed from: l */
    public final void mo118478l(String str, String str2) {
        C143593s sVar = (C143593s) this.f389335a.get();
        if (sVar != null) {
            C143593s.f389337a.mo118884b("Receive (type=text, ns=%s) %s", str, str2);
            this.f389336b.post(new C143591q(sVar, str, str2));
        }
    }

    /* renamed from: m */
    public final void mo118479m(long j) {
        C143593s sVar = (C143593s) this.f389335a.get();
        if (sVar != null) {
            sVar.mo118928q(j, 0);
        }
    }

    /* renamed from: n */
    public final void mo118480n(long j, int i) {
        C143593s sVar = (C143593s) this.f389335a.get();
        if (sVar != null) {
            sVar.mo118928q(j, i);
        }
    }

    /* renamed from: o */
    public final void mo118481o() {
        C143593s.f389337a.mo118884b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    /* renamed from: p */
    public final C143593s mo118922p() {
        C143593s sVar = (C143593s) this.f389335a.getAndSet((Object) null);
        if (sVar == null) {
            return null;
        }
        sVar.mo118924m();
        return sVar;
    }
}
