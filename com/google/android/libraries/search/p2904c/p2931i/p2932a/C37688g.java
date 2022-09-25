package com.google.android.libraries.search.p2904c.p2931i.p2932a;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.android.libraries.search.p2904c.C37504dk;
import com.google.android.libraries.search.p2904c.p2931i.C37697b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.search.c.i.a.g */
/* compiled from: PG */
final class C37688g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37689h f100083a;

    public C37688g(C37689h hVar) {
        this.f100083a = hVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C37689h.f100084a.mo56226d()).mo56372aa(52759)).mo56386p("#audio# Failed to receive the BluetoothHeadset Profile");
        this.f100083a.mo41073i(C37504dk.FAILED_ROUTING_DUE_TO_GETTING_BLUETOOTH_HEADSET_FAILED, C37476cy.DISCONNECT_REASON_FAILED_GETTING_BLUETOOTH_HEADSET);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar;
        C58833ax axVar2 = (C58833ax) obj;
        synchronized (this.f100083a) {
            C37689h hVar = this.f100083a;
            hVar.f100093i = axVar2;
            if (!hVar.f100093i.mo56113h()) {
                this.f100083a.mo41073i(C37504dk.FAILED_ROUTING_DUE_TO_NO_BLUETOOTH_PROFILE_FOUND, C37476cy.DISCONNECT_REASON_NO_BLUETOOTH_PROFILE_FOUND);
                return;
            }
            BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) this.f100083a.f100093i.mo56107c();
            Iterator<BluetoothDevice> it = bluetoothHeadset.getConnectedDevices().iterator();
            while (true) {
                if (!it.hasNext()) {
                    axVar = C58836b.f156633a;
                    break;
                }
                BluetoothDevice next = it.next();
                if (next != null && bluetoothHeadset.getConnectionState(next) == 2) {
                    axVar = C58833ax.m90834k(next);
                    break;
                }
            }
            if (!axVar.mo56113h()) {
                ((C59052c) ((C59052c) C37689h.f100084a.mo56226d()).mo56372aa(52760)).mo56386p("#audio# No BluetoothHeadset found");
                this.f100083a.mo41073i(C37504dk.FAILED_ROUTING_DUE_TO_NO_BLUETOOTH_HEADSET_FOUND, C37476cy.DISCONNECT_REASON_NO_BLUETOOTH_HEADSET_CONNECTED);
                return;
            }
            this.f100083a.f100091g = C37697b.CONNECTING;
            C37689h hVar2 = this.f100083a;
            hVar2.f100086b.mo41077a(hVar2);
            if (!((BluetoothHeadset) this.f100083a.f100093i.mo56107c()).startVoiceRecognition((BluetoothDevice) axVar.mo56107c())) {
                C37689h hVar3 = this.f100083a;
                hVar3.f100086b.mo41078b(hVar3);
                this.f100083a.mo41073i(C37504dk.FAILED_ROUTING_DUE_TO_START_SCO_FAILED, C37476cy.DISCONNECT_REASON_START_SCO_FAILED);
            }
        }
    }
}
