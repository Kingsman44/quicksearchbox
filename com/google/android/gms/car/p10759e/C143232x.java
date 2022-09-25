package com.google.android.gms.car.p10759e;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.car.C143181dh;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.car.e.x */
/* compiled from: PG */
public final class C143232x extends C143210b {

    /* renamed from: a */
    public final InputConnection f388355a;

    /* renamed from: b */
    public volatile boolean f388356b = true;

    public C143232x(InputConnection inputConnection) {
        this.f388355a = inputConnection;
    }

    /* renamed from: a */
    public final int mo118232a(int i) {
        if (!this.f388356b) {
            return 0;
        }
        return ((Integer) C143181dh.m232310c(new C143226r(this, i), 0)).intValue();
    }

    /* renamed from: b */
    public final CharSequence mo118233b(int i) {
        if (!this.f388356b) {
            return null;
        }
        return (CharSequence) C143181dh.m232310c(new C143225q(this, i), (Object) null);
    }

    /* renamed from: c */
    public final CharSequence mo118234c(int i, int i2) {
        if (!this.f388356b) {
            return null;
        }
        return (CharSequence) C143181dh.m232310c(new C143224p(this, i, i2), (Object) null);
    }

    /* renamed from: d */
    public final CharSequence mo118235d(int i, int i2) {
        if (!this.f388356b) {
            return null;
        }
        return (CharSequence) C143181dh.m232310c(new C143223o(this, i, i2), (Object) null);
    }

    /* renamed from: e */
    public final boolean mo118236e() {
        if (!this.f388356b) {
            return false;
        }
        return ((Boolean) C143181dh.m232310c(new C143216h(this), (Object) null)).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo118237f(int i) {
        return mo118273t(new C143219k(this, i));
    }

    /* renamed from: g */
    public final boolean mo118238g(CharSequence charSequence, int i) {
        return mo118273t(new C143231w(this, charSequence, i));
    }

    /* renamed from: h */
    public final boolean mo118239h(int i, int i2) {
        return mo118273t(new C143227s(this, i, i2));
    }

    /* renamed from: i */
    public final boolean mo118240i() {
        if (!this.f388356b) {
            return false;
        }
        return ((Boolean) C143181dh.m232310c(new C143217i(this), (Object) null)).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo118241j() {
        return mo118273t(new C143230v(this));
    }

    /* renamed from: k */
    public final boolean mo118242k(int i) {
        return mo118273t(new C143215g(this, i));
    }

    /* renamed from: l */
    public final boolean mo118243l(int i) {
        return mo118273t(new C143214f(this, i));
    }

    /* renamed from: m */
    public final boolean mo118244m(String str, Bundle bundle) {
        return mo118273t(new C143221m(this, str, bundle));
    }

    /* renamed from: n */
    public final boolean mo118245n(boolean z) {
        return mo118273t(new C143220l(this, z));
    }

    /* renamed from: o */
    public final boolean mo118246o(KeyEvent keyEvent) {
        return mo118273t(new C143218j(this, keyEvent));
    }

    /* renamed from: p */
    public final boolean mo118247p(int i, int i2) {
        return mo118273t(new C143229u(this, i, i2));
    }

    /* renamed from: q */
    public final boolean mo118248q(CharSequence charSequence, int i) {
        return mo118273t(new C143228t(this, charSequence, i));
    }

    /* renamed from: r */
    public final boolean mo118249r(int i, int i2) {
        return mo118273t(new C143213e(this, i, i2));
    }

    /* renamed from: s */
    public final void mo118250s() {
        throw new RemoteException("Deprecated Method");
    }

    /* renamed from: t */
    public final boolean mo118273t(Callable callable) {
        if (!this.f388356b) {
            return false;
        }
        C143181dh.m232309b(new C143222n(this, callable));
        return true;
    }
}
