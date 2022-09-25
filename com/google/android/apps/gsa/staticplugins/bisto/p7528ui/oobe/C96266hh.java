package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothAdapter;
import android.widget.Button;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.hh */
/* compiled from: PG */
public final class C96266hh extends C96098bb {

    /* renamed from: m */
    public C96094ay f269424m;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "HerbieConnectionFoundNew";
    }

    /* renamed from: g */
    public final void mo89941g(OpaPageLayout opaPageLayout) {
        String str;
        String str2;
        super.mo89941g(opaPageLayout);
        Button button = this.f269033g;
        button.getClass();
        button.setText(R.string.herbie_connection_found_correct);
        Button button2 = this.f269033g;
        button2.getClass();
        button2.setOnClickListener(new C89943l(new C96264hf(this)));
        Button button3 = this.f269034h;
        button3.getClass();
        button3.setText(R.string.herbie_connection_found_wrong);
        Button button4 = this.f269034h;
        button4.getClass();
        button4.setOnClickListener(new C89943l(new C96265hg(this)));
        C96095az azVar = this.f269050l;
        if (!(azVar == null || (str2 = azVar.f269040a) == null)) {
            mo89946l(String.format(str2, new Object[]{getArguments().getCharSequence("bt_name_tag")}));
        }
        String str3 = this.f269424m.f269039a;
        if (azVar != null && (str = azVar.f269043d) != null && str3 != null) {
            mo89945k(String.format(str, new Object[]{BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str3).getName()}));
        }
    }
}
