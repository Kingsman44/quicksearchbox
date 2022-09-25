package androidx.mediarouter.p175a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.mediarouter.a.bv */
/* compiled from: PG */
final class C3713bv extends C3749v implements ServiceConnection {

    /* renamed from: a */
    static final boolean f11930a = Log.isLoggable("MediaRouteProviderProxy", 3);

    /* renamed from: b */
    public final ComponentName f11931b;

    /* renamed from: c */
    final C3708bq f11932c;

    /* renamed from: d */
    public final ArrayList f11933d = new ArrayList();

    /* renamed from: m */
    public boolean f11934m;

    /* renamed from: n */
    public C3706bo f11935n;

    /* renamed from: o */
    public boolean f11936o;

    /* renamed from: p */
    public C3714bw f11937p;

    /* renamed from: q */
    private boolean f11938q;

    public C3713bv(Context context, ComponentName componentName) {
        super(context, new C3747t(componentName));
        this.f11931b = componentName;
        this.f11932c = new C3708bq();
    }

    /* renamed from: q */
    private final C3748u m10744q(String str, String str2) {
        C3751x xVar = this.f12035k;
        if (xVar == null) {
            return null;
        }
        List list = xVar.f12039a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C3739l) list.get(i)).mo7895n().equals(str)) {
                C3712bu buVar = new C3712bu(this, str, str2);
                this.f11933d.add(buVar);
                if (this.f11936o) {
                    buVar.mo7813e(this.f11935n);
                }
                mo7833o();
                return buVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C3707bp mo7822a(int i) {
        ArrayList arrayList = this.f11933d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C3707bp bpVar = (C3707bp) arrayList.get(i2);
            i2++;
            if (bpVar.mo7812d() == i) {
                return bpVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo7824e() {
        if (!this.f11938q) {
            boolean z = f11930a;
            if (z) {
                new StringBuilder().append(this);
                Log.d("MediaRouteProviderProxy", toString().concat(": Binding"));
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f11931b);
            try {
                boolean bindService = this.f12029e.bindService(intent, this, 4097);
                this.f11938q = bindService;
                if (!bindService && z) {
                    Log.d("MediaRouteProviderProxy", this + ": Bind failed");
                }
            } catch (SecurityException e) {
                if (f11930a) {
                    new StringBuilder().append(this);
                    Log.d("MediaRouteProviderProxy", toString().concat(": Bind failed"), e);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo7825f(C3740m mVar) {
        if (this.f11936o) {
            this.f11935n.mo7807c(mVar);
        }
        mo7833o();
    }

    /* renamed from: fi */
    public final C3745r mo7826fi(String str) {
        if (str != null) {
            C3751x xVar = this.f12035k;
            C3711bt btVar = null;
            if (xVar != null) {
                List list = xVar.f12039a;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (((C3739l) list.get(i)).mo7895n().equals(str)) {
                        btVar = new C3711bt(this, str);
                        this.f11933d.add(btVar);
                        if (this.f11936o) {
                            btVar.mo7813e(this.f11935n);
                        }
                        mo7833o();
                    } else {
                        i++;
                    }
                }
            }
            return btVar;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    /* renamed from: g */
    public final void mo7828g() {
        if (this.f11935n != null) {
            mo7914fk((C3751x) null);
            this.f11936o = false;
            int size = this.f11933d.size();
            for (int i = 0; i < size; i++) {
                ((C3707bp) this.f11933d.get(i)).mo7814f();
            }
            C3706bo boVar = this.f11935n;
            boVar.mo7811g(2, 0, 0, (Object) null, (Bundle) null);
            boVar.f11905b.f11913a.clear();
            boVar.f11904a.getBinder().unlinkToDeath(boVar, 0);
            boVar.f11911h.f11932c.post(new C3704bm(boVar));
            this.f11935n = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo7829h(C3706bo boVar, C3751x xVar) {
        if (this.f11935n == boVar) {
            if (f11930a) {
                Log.d("MediaRouteProviderProxy", this + ": Descriptor changed, descriptor=" + xVar);
            }
            mo7914fk(xVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo7830l(C3707bp bpVar) {
        this.f11933d.remove(bpVar);
        bpVar.mo7814f();
        mo7833o();
    }

    /* renamed from: m */
    public final void mo7831m() {
        if (!this.f11934m) {
            if (f11930a) {
                new StringBuilder().append(this);
                Log.d("MediaRouteProviderProxy", toString().concat(": Starting"));
            }
            this.f11934m = true;
            mo7833o();
        }
    }

    /* renamed from: n */
    public final void mo7832n() {
        if (this.f11938q) {
            if (f11930a) {
                new StringBuilder().append(this);
                Log.d("MediaRouteProviderProxy", toString().concat(": Unbinding"));
            }
            this.f11938q = false;
            mo7828g();
            try {
                this.f12029e.unbindService(this);
            } catch (IllegalArgumentException e) {
                new StringBuilder().append(this);
                Log.e("MediaRouteProviderProxy", toString().concat(": unbindService failed"), e);
            }
        }
    }

    /* renamed from: o */
    public final void mo7833o() {
        if (mo7836p()) {
            mo7824e();
        } else {
            mo7832n();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (f11930a) {
            new StringBuilder().append(this);
            Log.d("MediaRouteProviderProxy", toString().concat(": Connected"));
        }
        if (this.f11938q) {
            mo7828g();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        C3706bo boVar = new C3706bo(this, messenger);
                        int i = boVar.f11906c;
                        boVar.f11906c = i + 1;
                        boVar.f11909f = i;
                        if (boVar.mo7811g(1, i, 4, (Object) null, (Bundle) null)) {
                            try {
                                boVar.f11904a.getBinder().linkToDeath(boVar, 0);
                                this.f11935n = boVar;
                                return;
                            } catch (RemoteException unused) {
                                boVar.binderDied();
                            }
                        }
                        if (f11930a) {
                            new StringBuilder().append(this);
                            Log.d("MediaRouteProviderProxy", toString().concat(": Registration failed"));
                            return;
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            new StringBuilder().append(this);
            Log.e("MediaRouteProviderProxy", toString().concat(": Service returned invalid messenger binder"));
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (f11930a) {
            new StringBuilder().append(this);
            Log.d("MediaRouteProviderProxy", toString().concat(": Service disconnected"));
        }
        mo7828g();
    }

    /* renamed from: p */
    public final boolean mo7836p() {
        if (this.f11934m) {
            return this.f12033i != null || !this.f11933d.isEmpty();
        }
        return false;
    }

    public final String toString() {
        return "Service connection ".concat(String.valueOf(this.f11931b.flattenToShortString()));
    }

    /* renamed from: c */
    public final C3748u mo7823c(String str) {
        if (str != null) {
            return m10744q(str, (String) null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    /* renamed from: fj */
    public final C3748u mo7827fj(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return m10744q(str, str2);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }
}
