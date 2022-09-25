package com.google.android.libraries.gsa.conversation.p1839c;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.conversation.c.b */
/* compiled from: PG */
public final class C22355b implements C68220f {

    /* renamed from: a */
    private final C69464a f61702a;

    public C22355b(C69464a aVar) {
        this.f61702a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        BluetoothManager bluetoothManager = (BluetoothManager) ((Context) ((C68221g) this.f61702a).f184583a).getSystemService("bluetooth");
        C68225k.m98532d(bluetoothManager);
        return bluetoothManager;
    }
}
