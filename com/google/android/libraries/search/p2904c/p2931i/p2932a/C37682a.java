package com.google.android.libraries.search.p2904c.p2931i.p2932a;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import androidx.p104d.p105a.C2168g;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.android.libraries.search.p2904c.C37504dk;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.c.i.a.a */
/* compiled from: PG */
public final /* synthetic */ class C37682a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C37689h f100075a;

    public /* synthetic */ C37682a(C37689h hVar) {
        this.f100075a = hVar;
    }

    public final void run() {
        C37689h hVar = this.f100075a;
        if (!((C2168g) hVar.f100089e).f6144b.isDone()) {
            ((C59052c) ((C59052c) C37689h.f100084a.mo56226d()).mo56372aa(52766)).mo56386p("#audio# Timeout while trying to establish SCO.");
            synchronized (hVar) {
                if (hVar.f100093i.mo56113h() && hVar.f100092h.mo56113h()) {
                    ((BluetoothHeadset) hVar.f100093i.mo56107c()).stopVoiceRecognition((BluetoothDevice) hVar.f100092h.mo56107c());
                }
            }
            hVar.mo41073i(C37504dk.FAILED_ROUTING_DUE_TO_SCO_TIMEOUT, C37476cy.DISCONNECT_REASON_START_SCO_TIMEOUT);
        }
    }
}
