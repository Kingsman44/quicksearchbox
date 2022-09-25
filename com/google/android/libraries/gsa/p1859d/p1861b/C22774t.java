package com.google.android.libraries.gsa.p1859d.p1861b;

import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Pair;
import android.view.WindowManager;
import com.google.android.libraries.p10922ab.C146706b;
import com.google.android.libraries.p10922ab.C146710f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.UUID;

/* renamed from: com.google.android.libraries.gsa.d.b.t */
/* compiled from: PG */
final class C22774t extends C146706b implements Runnable {

    /* renamed from: a */
    public final int f62695a;

    /* renamed from: b */
    public final int f62696b;

    /* renamed from: c */
    public final int f62697c;

    /* renamed from: d */
    public final String f62698d;

    /* renamed from: e */
    public C22771q f62699e = new C22771q();

    /* renamed from: f */
    public int f62700f = 0;

    /* renamed from: g */
    public boolean f62701g;

    /* renamed from: h */
    final /* synthetic */ C22776v f62702h;

    /* renamed from: i */
    private Handler f62703i = new Handler(Looper.getMainLooper(), this.f62699e);

    /* renamed from: j */
    private boolean f62704j;

    public C22774t(C22776v vVar, int i, String str, int i2, int i3) {
        this.f62702h = vVar;
        this.f62695a = i;
        this.f62698d = str;
        this.f62696b = i2;
        this.f62697c = i3;
    }

    /* renamed from: c */
    private final synchronized void m42548c(boolean z) {
        this.f62702h.f62707b.removeCallbacks(this);
        Message.obtain(this.f62703i, 2, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: d */
    private final synchronized void m42549d(String str, boolean z, boolean z2, int i) {
        C22771q qVar;
        if (!this.f62704j) {
            int i2 = i & 15;
            C58976aa aaVar = C58975e.f156826a;
            boolean z3 = true;
            if ((i2 & 1) != 0 || z) {
                i2 = 1;
            }
            if (this.f62700f == i2) {
                this.f62702h.f62708c.mo27921f(str, i2, z, z2, false);
                return;
            }
            this.f62702h.f62708c.mo27921f(str, i2, z, z2, true);
            this.f62703i.removeCallbacksAndMessages((Object) null);
            Bundle bundle = new Bundle();
            bundle.putString("internal_request_id", str);
            Message.obtain(this.f62703i, 0, 0, 0, bundle).sendToTarget();
            m42548c(true);
            this.f62700f = i2;
            if (i2 == 0) {
                qVar = new C22771q();
            } else if (i2 == 1) {
                qVar = new C22773s(this.f62702h, this);
            } else if ((i2 & 8) == 0 || !this.f62702h.mo28105m()) {
                C22776v vVar = this.f62702h;
                int i3 = this.f62700f;
                boolean z4 = (i3 & 4) != 0;
                if ((i3 & 2) == 0) {
                    z3 = false;
                }
                qVar = new C22770p(vVar, this, z4, z3);
            } else {
                qVar = new C22775u(this.f62702h, this);
            }
            this.f62699e = qVar;
            this.f62703i = new Handler(Looper.getMainLooper(), this.f62699e);
        }
    }

    /* renamed from: h */
    private static final Bundle m42550h(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("overlay_animation_duration", (i >> 2) & 2047);
        int i2 = i & 3;
        boolean z = true;
        bundle.putInt("overlay_animation_type", (i2 != 1 ? i2 != 3 ? 1 : 4 : 2) - 1);
        if (i2 != 2) {
            z = false;
        }
        bundle.putBoolean("is_layer_mode_enabled", z);
        return bundle;
    }

    /* renamed from: A */
    public final synchronized void mo28072A(Bundle bundle) {
        if (!this.f62704j) {
            Message.obtain(this.f62703i, 9, 0, 0, bundle).sendToTarget();
        }
    }

    /* renamed from: C */
    public final synchronized void mo28073C(WindowManager.LayoutParams layoutParams, C146710f fVar, int i) {
        if (!this.f62704j) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("layout_params", layoutParams);
            bundle.putInt("client_options", i);
            mo28074D(bundle, fVar);
        }
    }

    /* renamed from: D */
    public final synchronized void mo28074D(Bundle bundle, C146710f fVar) {
        if (!this.f62704j) {
            String uuid = UUID.randomUUID().toString();
            bundle.putString("internal_request_id", uuid);
            this.f62702h.f62708c.mo27927l(uuid);
            C58976aa aaVar = C58975e.f156826a;
            this.f62702h.f62707b.removeCallbacks(this);
            Configuration configuration = (Configuration) bundle.getParcelable("configuration");
            this.f62701g = configuration != null && configuration.orientation == 2;
            this.f62702h.mo28104l(configuration);
            Parcelable parcelable = bundle.getParcelable("partner_overlay_icon");
            m42549d(uuid, parcelable != null, bundle.getBoolean("google_overlay_is_default"), bundle.getInt("client_options", 7));
            Message.obtain(this.f62703i, 0, 1, 0, Pair.create(bundle, fVar)).sendToTarget();
            return;
        }
        C59104x d = C22776v.f62706a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "OverlaySController");
        ((C59052c) ((C59052c) d).mo56372aa(48594)).mo56386p("windowAttached2 after destroy");
    }

    /* renamed from: F */
    public final synchronized void mo28075F(boolean z) {
        if (!this.f62704j) {
            Bundle bundle = new Bundle();
            bundle.putString("internal_request_id", UUID.randomUUID().toString());
            C58976aa aaVar = C58975e.f156826a;
            Message.obtain(this.f62703i, 0, 0, 0, bundle).sendToTarget();
            this.f62702h.f62707b.postDelayed(this, true != z ? 0 : 5000);
        }
    }

    /* renamed from: G */
    public final boolean mo28076G() {
        return this.f62702h.mo28103k();
    }

    /* renamed from: I */
    public final boolean mo28077I() {
        return this.f62702h.mo28098e().mo27979b();
    }

    /* renamed from: J */
    public final synchronized boolean mo28078J(byte[] bArr, Bundle bundle) {
        if (this.f62704j) {
            return false;
        }
        this.f62702h.mo28099g();
        if (!this.f62702h.mo28105m()) {
            return false;
        }
        Message.obtain(this.f62703i, 8, new C22766l(bArr, bundle)).sendToTarget();
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo28079a() {
        if (!this.f62704j) {
            m42548c(false);
            this.f62704j = true;
        }
    }

    /* renamed from: b */
    public final void mo28080b(C146710f fVar, int i) {
        int a = i | this.f62702h.mo28094a();
        if (fVar != null) {
            try {
                if (this.f62696b >= 10) {
                    Bundle bundle = new Bundle();
                    this.f62702h.mo28101i(bundle);
                    bundle.putInt("service_status", a);
                    fVar.mo28130c(bundle);
                    return;
                }
                fVar.mo28129b(a);
            } catch (RemoteException e) {
                C59104x c = C22776v.f62706a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OverlaySController");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(48588)).mo56386p("Failed to send status update");
            }
        }
    }

    /* renamed from: e */
    public final String mo28081e() {
        return this.f62702h.mo28098e().mo27978a();
    }

    /* renamed from: f */
    public final synchronized void mo28082f(int i) {
        if (!this.f62704j) {
            C58976aa aaVar = C58975e.f156826a;
            this.f62703i.removeMessages(6);
            Message.obtain(this.f62703i, 6, 0, 0, m42550h(i)).sendToTarget();
        }
    }

    /* renamed from: g */
    public final synchronized void mo28083g(Bundle bundle) {
        if (!this.f62704j) {
            C58976aa aaVar = C58975e.f156826a;
            this.f62703i.removeMessages(6);
            Message.obtain(this.f62703i, 6, 0, 0, bundle).sendToTarget();
        }
    }

    /* renamed from: i */
    public final synchronized void mo28084i() {
        if (!this.f62704j) {
            C58976aa aaVar = C58975e.f156826a;
            Message.obtain(this.f62703i, 5).sendToTarget();
        }
    }

    /* renamed from: m */
    public final synchronized void mo28085m() {
        if (!this.f62704j) {
            mo28092u(0);
        }
    }

    /* renamed from: n */
    public final synchronized void mo28086n() {
        if (!this.f62704j) {
            mo28092u(3);
        }
    }

    /* renamed from: o */
    public final synchronized void mo28087o(float f) {
        if (!this.f62704j) {
            C58976aa aaVar = C58975e.f156826a;
            Message.obtain(this.f62703i, 4, Float.valueOf(f)).sendToTarget();
        }
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (Binder.getCallingUid() == this.f62695a) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        C59104x c = C22776v.f62706a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OverlaySController");
        ((C59052c) ((C59052c) c).mo56372aa(48596)).mo56386p("Calling with an invalid UID, the transaction will not work");
        throw new RemoteException("Invalid client");
    }

    /* renamed from: p */
    public final synchronized void mo28088p(int i) {
        if (!this.f62704j) {
            this.f62703i.removeMessages(6);
            Message.obtain(this.f62703i, 6, 1, 0, m42550h(i)).sendToTarget();
        }
    }

    /* renamed from: q */
    public final synchronized void mo28089q(Bundle bundle) {
        if (!this.f62704j) {
            C58976aa aaVar = C58975e.f156826a;
            this.f62703i.removeMessages(6);
            Message.obtain(this.f62703i, 6, 1, 0, bundle).sendToTarget();
        }
    }

    public final void run() {
        m42548c(false);
    }

    /* renamed from: t */
    public final synchronized void mo28091t(boolean z) {
        if (!this.f62704j) {
            this.f62702h.mo28100h();
            this.f62703i.removeMessages(7);
            Message.obtain(this.f62703i, 7, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: u */
    public final synchronized void mo28092u(int i) {
        if (!this.f62704j) {
            C58976aa aaVar = C58975e.f156826a;
            this.f62703i.removeMessages(1);
            if ((i & 1) == 1 && (i & 2) == 0) {
                Handler handler = this.f62703i;
                handler.sendMessageDelayed(Message.obtain(handler, 1, Integer.valueOf(i)), 100);
                return;
            }
            Message.obtain(this.f62703i, 1, Integer.valueOf(i)).sendToTarget();
        }
    }

    /* renamed from: z */
    public final synchronized void mo28093z() {
        if (!this.f62704j) {
            C58976aa aaVar = C58975e.f156826a;
            Message.obtain(this.f62703i, 3).sendToTarget();
        }
    }
}
