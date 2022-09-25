package androidx.biometric;

import android.content.DialogInterface;
import android.os.Looper;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2358bf;
import com.evernote.android.state.BuildConfig;
import java.util.concurrent.Executor;

/* renamed from: androidx.biometric.al */
/* compiled from: PG */
public final class C0908al extends C2358bf {

    /* renamed from: a */
    public Executor f2993a;

    /* renamed from: b */
    public C0900ad f2994b;

    /* renamed from: c */
    public C0903ag f2995c;

    /* renamed from: d */
    public C0902af f2996d;

    /* renamed from: e */
    public C0931e f2997e;

    /* renamed from: f */
    public DialogInterface.OnClickListener f2998f;

    /* renamed from: g */
    public CharSequence f2999g;

    /* renamed from: h */
    public boolean f3000h;

    /* renamed from: i */
    public boolean f3001i;

    /* renamed from: j */
    public boolean f3002j;

    /* renamed from: k */
    public boolean f3003k;

    /* renamed from: l */
    public boolean f3004l;

    /* renamed from: m */
    public boolean f3005m;

    /* renamed from: n */
    public C2332ag f3006n;

    /* renamed from: o */
    public C2332ag f3007o;

    /* renamed from: p */
    public C2332ag f3008p;

    /* renamed from: q */
    public C2332ag f3009q;

    /* renamed from: r */
    public C2332ag f3010r;

    /* renamed from: s */
    public C2332ag f3011s;

    /* renamed from: t */
    public int f3012t = 0;

    /* renamed from: u */
    public C2332ag f3013u;

    /* renamed from: v */
    public C2332ag f3014v;

    /* renamed from: z */
    private C0911ao f3015z;

    /* renamed from: o */
    public static void m2803o(C2332ag agVar, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            agVar.mo5708l(obj);
        } else {
            agVar.mo5706i(obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo3534a() {
        return this.f2995c != null ? 33023 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0900ad mo3535b() {
        if (this.f2994b == null) {
            this.f2994b = new C0904ah();
        }
        return this.f2994b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C0911ao mo3536c() {
        if (this.f3015z == null) {
            this.f3015z = new C0911ao();
        }
        return this.f3015z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final CharSequence mo3537e() {
        if (this.f2995c != null) {
            return BuildConfig.FLAVOR;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final CharSequence mo3538f() {
        C0903ag agVar = this.f2995c;
        if (agVar != null) {
            return agVar.f2989b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final CharSequence mo3539g() {
        C0903ag agVar = this.f2995c;
        if (agVar != null) {
            return agVar.f2988a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Executor mo3540h() {
        Executor executor = this.f2993a;
        return executor != null ? executor : new C0906aj();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo3541i(C0933g gVar) {
        if (this.f3007o == null) {
            this.f3007o = new C2332ag();
        }
        m2803o(this.f3007o, gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo3542j(boolean z) {
        if (this.f3009q == null) {
            this.f3009q = new C2332ag();
        }
        m2803o(this.f3009q, Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo3543k(C0901ae aeVar) {
        if (this.f3006n == null) {
            this.f3006n = new C2332ag();
        }
        m2803o(this.f3006n, aeVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo3544l(boolean z) {
        if (this.f3011s == null) {
            this.f3011s = new C2332ag();
        }
        m2803o(this.f3011s, Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo3545m(CharSequence charSequence) {
        if (this.f3014v == null) {
            this.f3014v = new C2332ag();
        }
        m2803o(this.f3014v, charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo3546n(boolean z) {
        if (this.f3010r == null) {
            this.f3010r = new C2332ag();
        }
        m2803o(this.f3010r, Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo3547p() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo3548q() {
        if (this.f3013u == null) {
            this.f3013u = new C2332ag();
        }
        m2803o(this.f3013u, 1);
    }
}
