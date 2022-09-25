package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothAdapter;
import android.widget.Button;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.id */
/* compiled from: PG */
public abstract class C96289id extends C96098bb {

    /* renamed from: m */
    public C96094ay f269465m;

    /* renamed from: g */
    public final void mo89941g(OpaPageLayout opaPageLayout) {
        super.mo89941g(opaPageLayout);
        Button button = this.f269034h;
        button.getClass();
        button.setText(R.string.bisto_skip);
        Button button2 = this.f269033g;
        button2.getClass();
        button2.setText(R.string.bisto_try_again);
        Button button3 = this.f269033g;
        button3.getClass();
        button3.setOnClickListener(new C89943l(new C96284hz(this)));
        String str = this.f269465m.f269039a;
        if (str != null) {
            String name = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str).getName();
            Button button4 = this.f269034h;
            button4.getClass();
            button4.setOnClickListener(new C89943l(new C96286ia(this, name)));
        }
    }
}
