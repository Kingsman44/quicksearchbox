package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.util.SparseArray;
import android.widget.Button;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83895ba;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83914a;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.util.permissions.C91076c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ho */
/* compiled from: PG */
public final class C96273ho extends C96098bb {

    /* renamed from: m */
    public static final C59071e f269431m = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ho");

    /* renamed from: n */
    static final long f269432n = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: o */
    static final Set f269433o = new HashSet(Arrays.asList(new Integer[]{2, 1}));

    /* renamed from: p */
    public final SparseArray f269434p = new SparseArray();

    /* renamed from: q */
    public C22871g f269435q;

    /* renamed from: r */
    public BluetoothDevice f269436r;

    /* renamed from: s */
    public C96094ay f269437s;

    /* renamed from: t */
    private C60870cx f269438t;

    /* renamed from: u */
    private boolean f269439u;

    /* renamed from: s */
    private final boolean m159585s(BluetoothDevice bluetoothDevice) {
        return bluetoothDevice != null && C58832aw.m90831a(bluetoothDevice.getAddress(), this.f269437s.f269039a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        return "HerbieConnectionManual";
    }

    /* renamed from: g */
    public final void mo89941g(OpaPageLayout opaPageLayout) {
        super.mo89941g(opaPageLayout);
        Button button = this.f269033g;
        button.getClass();
        button.setText(R.string.tos_accept_next);
        Button button2 = this.f269033g;
        button2.getClass();
        button2.setOnClickListener(new C89943l(new C96267hi(this)));
        Button button3 = this.f269033g;
        button3.getClass();
        mo89942h(button3, false);
        Button button4 = this.f269034h;
        button4.getClass();
        button4.setText(R.string.try_aux);
        Button button5 = this.f269034h;
        button5.getClass();
        button5.setOnClickListener(new C89943l(new C96268hj(this)));
        C96272hn hnVar = new C96272hn(this);
        for (Integer intValue : f269433o) {
            BluetoothAdapter.getDefaultAdapter().getProfileProxy(getContext(), hnVar, intValue.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Set mo90037o() {
        if (C91076c.m148792a(getContext())) {
            return BluetoothAdapter.getDefaultAdapter().getBondedDevices();
        }
        return C58733pz.f156496a;
    }

    public final void onDestroy() {
        super.onDestroy();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        for (int i = 0; i < this.f269434p.size(); i++) {
            defaultAdapter.closeProfileProxy(this.f269434p.keyAt(i), (BluetoothProfile) this.f269434p.valueAt(i));
        }
    }

    public final void onPause() {
        super.onPause();
        C60870cx cxVar = this.f269438t;
        if (cxVar != null && !cxVar.isDone()) {
            this.f269438t.cancel(false);
        }
        this.f269438t = null;
    }

    public final void onStart() {
        super.onStart();
        mo90042q();
    }

    /* renamed from: p */
    public final void mo90041p() {
        BluetoothDevice bluetoothDevice;
        BluetoothDevice bluetoothDevice2;
        boolean z;
        Button button = this.f269033g;
        button.getClass();
        Iterator it = mo90037o().iterator();
        loop0:
        while (true) {
            bluetoothDevice = null;
            if (!it.hasNext()) {
                bluetoothDevice2 = null;
                break;
            }
            bluetoothDevice2 = (BluetoothDevice) it.next();
            if (!m159585s(bluetoothDevice2)) {
                for (Integer intValue : f269433o) {
                    if (!mo90043r(bluetoothDevice2, intValue.intValue())) {
                    }
                }
                break loop0;
            }
        }
        this.f269436r = bluetoothDevice2;
        boolean z2 = bluetoothDevice2 != null;
        Iterator it2 = mo90037o().iterator();
        loop2:
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            BluetoothDevice bluetoothDevice3 = (BluetoothDevice) it2.next();
            if (!m159585s(bluetoothDevice3)) {
                for (Integer intValue2 : f269433o) {
                    int intValue3 = intValue2.intValue();
                    boolean r = mo90043r(bluetoothDevice3, intValue3);
                    if (intValue3 != 1) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z != r) {
                    }
                }
                bluetoothDevice = bluetoothDevice3;
                break loop2;
            }
        }
        if (button.isEnabled() != z2) {
            mo89942h(button, z2);
        }
        if (!z2 && bluetoothDevice != null) {
            C59104x b = f269431m.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HerbieConManFrg");
            ((C59052c) ((C59052c) b).mo56372aa(17043)).mo56386p("showHfpOnlyDialog");
            if (!this.f269439u) {
                Activity activity = getActivity();
                C83914a aVar = (C83914a) C83915b.f228541j.createBuilder();
                aVar.copyOnWrite();
                C83915b bVar = (C83915b) aVar.instance;
                bVar.f228543a |= 2;
                bVar.f228545c = R.string.try_aux;
                aVar.copyOnWrite();
                C83915b bVar2 = (C83915b) aVar.instance;
                bVar2.f228543a |= 8;
                bVar2.f228547e = R.string.herbie_hfp_only_dialog_text;
                aVar.copyOnWrite();
                C83915b bVar3 = (C83915b) aVar.instance;
                bVar3.f228543a |= 32;
                bVar3.f228549g = R.string.herbie_hfp_only_dialog_confirm;
                aVar.copyOnWrite();
                C83915b bVar4 = (C83915b) aVar.instance;
                bVar4.f228543a |= 128;
                bVar4.f228551i = R.string.cancel;
                C83895ba.m133621a(activity, (C83915b) aVar.build(), new C96269hk(this), C96270hl.f269428a).mo77277a();
                this.f269439u = true;
            }
        }
    }

    /* renamed from: q */
    public final void mo90042q() {
        C60870cx cxVar = this.f269438t;
        if (cxVar != null && !cxVar.isDone()) {
            this.f269438t.cancel(false);
        }
        mo90041p();
        C58976aa aaVar = C58975e.f156826a;
        this.f269438t = this.f269435q.mo28208h("AudioStatusCheck", f269432n, new C96271hm(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo90043r(BluetoothDevice bluetoothDevice, int i) {
        BluetoothProfile bluetoothProfile = (BluetoothProfile) this.f269434p.get(i);
        if (bluetoothProfile == null) {
            C59104x c = f269431m.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HerbieConManFrg");
            ((C59052c) ((C59052c) c).mo56372aa(17044)).mo56387q("missing proxy for profile %d", i);
            return false;
        } else if (bluetoothProfile.getConnectionState(bluetoothDevice) == 2) {
            return true;
        } else {
            return false;
        }
    }
}
