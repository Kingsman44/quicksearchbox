package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.ah */
/* compiled from: PG */
public final /* synthetic */ class C95959ah implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268679a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268680b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f268681c;

    public /* synthetic */ C95959ah(C96017bm bmVar, BluetoothDevice bluetoothDevice, byte[] bArr) {
        this.f268679a = bmVar;
        this.f268680b = bluetoothDevice;
        this.f268681c = bArr;
    }

    public final void run() {
        C96017bm bmVar = this.f268679a;
        BluetoothDevice bluetoothDevice = this.f268680b;
        bmVar.mo89877a().mo88768d(bmVar.f268839i.mo88918a(bluetoothDevice), (C124548d) null, this.f268681c, false, false, bmVar.f268846p);
        bmVar.f268834d.mo83394aj(bluetoothDevice.getAddress(), (C124636bb) null, C124633az.OOBE_IN_PROGRESS);
        bmVar.mo89890p(bluetoothDevice.getAddress());
        bmVar.mo89889o();
    }
}
