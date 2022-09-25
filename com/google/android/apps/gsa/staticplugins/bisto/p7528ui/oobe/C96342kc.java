package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothAdapter;
import android.widget.Button;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.kc */
/* compiled from: PG */
public final class C96342kc extends C96098bb {

    /* renamed from: o */
    private static final C59071e f269557o = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.kc");

    /* renamed from: m */
    public C22871g f269558m;

    /* renamed from: n */
    public C96094ay f269559n;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "OtaZeroDayFailed";
    }

    /* renamed from: g */
    public final void mo89941g(OpaPageLayout opaPageLayout) {
        super.mo89941g(opaPageLayout);
        String str = this.f269559n.f269039a;
        if (str == null) {
            C59104x c = f269557o.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OtaZeroDayFailed");
            ((C59052c) ((C59052c) c).mo56372aa(17081)).mo56386p("Null device ID. Unable to perform OTA");
            this.f269558m.mo28212l("exit", new C96337jy(this));
            return;
        }
        C96095az azVar = this.f269050l;
        if (azVar == null) {
            C59104x c2 = f269557o.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "OtaZeroDayFailed");
            ((C59052c) ((C59052c) c2).mo56372aa(17080)).mo56386p("Null OobeScreen. Unable to perform OTA");
            this.f269558m.mo28212l("exit", new C96338jz(this));
            return;
        }
        Button button = this.f269034h;
        button.getClass();
        button.setText(R.string.bisto_skip);
        Button button2 = this.f269033g;
        button2.getClass();
        button2.setText(R.string.bisto_try_again);
        Button button3 = this.f269033g;
        button3.getClass();
        mo89942h(button3, true);
        Button button4 = this.f269033g;
        button4.getClass();
        button4.setOnClickListener(new C89943l(new C96340ka(this)));
        String name = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str).getName();
        String str2 = azVar.f269043d;
        if (str2 != null) {
            mo89945k(String.format(str2, new Object[]{name}));
        }
        Button button5 = this.f269034h;
        button5.getClass();
        button5.setOnClickListener(new C89943l(new C96341kb(this, name)));
    }
}
