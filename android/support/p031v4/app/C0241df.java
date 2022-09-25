package android.support.p031v4.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2102q;
import androidx.core.p098j.C2103r;
import androidx.lifecycle.C2340ao;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import androidx.p060c.C0984n;

/* renamed from: android.support.v4.app.df */
/* compiled from: PG */
public class C0241df extends Activity implements C2391v, C2102q {

    /* renamed from: Za */
    private final C2393x f884Za = new C2393x(this);

    public C0241df() {
        new C0984n(0);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            int[] iArr = C2043bi.f5944a;
        }
        return C2103r.m5787a(this, keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (getWindow().getDecorView() != null) {
            int[] iArr = C2043bi.f5944a;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public C2384o getLifecycle() {
        return this.f884Za;
    }

    /* renamed from: i */
    public final boolean mo754i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2340ao.m6326b(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f884Za.mo5794f(C2383n.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
