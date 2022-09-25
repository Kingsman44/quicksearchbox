package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.p */
/* compiled from: PG */
public final /* synthetic */ class C96038p implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268902a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268903b;

    /* renamed from: c */
    public final /* synthetic */ C124548d f268904c;

    /* renamed from: d */
    public final /* synthetic */ boolean f268905d;

    public /* synthetic */ C96038p(C96017bm bmVar, BluetoothDevice bluetoothDevice, C124548d dVar, boolean z) {
        this.f268902a = bmVar;
        this.f268903b = bluetoothDevice;
        this.f268904c = dVar;
        this.f268905d = z;
    }

    public final void run() {
        C96017bm bmVar = this.f268902a;
        BluetoothDevice bluetoothDevice = this.f268903b;
        C124548d dVar = this.f268904c;
        bmVar.mo89877a().mo88768d(bmVar.f268839i.mo88918a(bluetoothDevice), dVar, (byte[]) null, C124633az.OOBE_FINISHED.equals(dVar.mo106520r()), this.f268905d, bmVar.f268846p);
        bmVar.mo89889o();
    }
}
