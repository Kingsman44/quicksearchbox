package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95188c;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124527h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Locale;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.bv */
/* compiled from: PG */
public final class C95371bv extends C95447t {

    /* renamed from: f */
    private static final C59071e f266857f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.bv");

    /* renamed from: g */
    private final UsbDevice f266858g;

    /* renamed from: h */
    private final C95397cu f266859h;

    /* renamed from: i */
    private final C22871g f266860i;

    /* renamed from: j */
    private C95452y f266861j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95371bv(UsbDevice usbDevice, Context context, C22871g gVar, C22871g gVar2, C95432eb ebVar, C95850a aVar, C95397cu cuVar, C68214a aVar2, C89656k kVar, C95188c cVar) {
        super(C124521b.m203980c(usbDevice), context, gVar, gVar2, ebVar, aVar, aVar2, kVar, cVar);
        this.f266858g = usbDevice;
        this.f266859h = cuVar;
        this.f266860i = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final boolean mo89304B() {
        C95452y yVar = new C95452y(this.f266859h, this.f266860i, this);
        this.f266861j = yVar;
        return yVar.f267088b.mo89343b(yVar, true);
    }

    /* renamed from: e */
    public final C60870cx mo89264e() {
        if (!C124527h.m203996b(this.f267070b)) {
            return C60856cj.m92899h(new Exception("Unable to listen to media buttons"));
        }
        return super.mo89264e();
    }

    /* renamed from: i */
    public final Integer mo89313i() {
        if ("000018d1-00005033".equals(mo89305l())) {
            return Integer.valueOf(PrivateKeyType.INVALID);
        }
        return null;
    }

    /* renamed from: j */
    public final String mo89314j() {
        return this.f266858g.getVersion();
    }

    /* renamed from: l */
    public final String mo89305l() {
        return String.format(Locale.getDefault(), "%08x-%08x", new Object[]{Integer.valueOf(this.f266858g.getVendorId()), Integer.valueOf(this.f266858g.getProductId())});
    }

    /* renamed from: m */
    public final String mo89306m() {
        String serialNumber = this.f266858g.getSerialNumber();
        if (serialNumber != null) {
            return serialNumber;
        }
        C59104x d = f266857f.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoSimpleUsbC");
        ((C59052c) ((C59052c) d).mo56372aa(14968)).mo56386p("Missing serial");
        return BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo89308t() {
        C95452y yVar = this.f266861j;
        if (yVar != null) {
            yVar.f267088b.mo89342a(true);
        }
        this.f266861j = null;
    }

    /* renamed from: u */
    public final boolean mo89309u() {
        HashMap<String, UsbDevice> deviceList = ((UsbManager) this.f267070b.getSystemService("usb")).getDeviceList();
        return deviceList != null && deviceList.containsKey(this.f266858g.getDeviceName());
    }

    /* renamed from: v */
    public final boolean mo89310v(boolean z, boolean z2, boolean z3) {
        return z3 && z2 && !z;
    }
}
