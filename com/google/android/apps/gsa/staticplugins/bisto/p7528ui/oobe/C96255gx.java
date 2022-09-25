package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothAdapter;
import android.widget.Button;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gx */
/* compiled from: PG */
public final class C96255gx extends C96098bb {

    /* renamed from: m */
    static final long f269410m = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: q */
    public static final /* synthetic */ int f269411q = 0;

    /* renamed from: n */
    public C22871g f269412n;

    /* renamed from: o */
    public C22871g f269413o;

    /* renamed from: p */
    public C96094ay f269414p;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "HerbieBluetoothCheck";
    }

    /* renamed from: g */
    public final void mo89941g(OpaPageLayout opaPageLayout) {
        super.mo89941g(opaPageLayout);
        Button button = this.f269033g;
        button.getClass();
        button.setVisibility(8);
        Button button2 = this.f269034h;
        button2.getClass();
        button2.setVisibility(8);
        SettableFuture settableFuture = new SettableFuture();
        BluetoothAdapter.getDefaultAdapter().getProfileProxy(getContext(), new C96254gw(this, settableFuture), 2);
        new C90873ag(C90877ak.m148471e(settableFuture, f269410m, TimeUnit.MILLISECONDS, this.f269412n), this.f269413o, "Check complete", new C96252gu(this)).mo85223a(new C96253gv(this));
    }
}
