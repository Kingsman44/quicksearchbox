package com.google.android.libraries.search.p2904c.p2931i.p2932a;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2904c.p2931i.C37681a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.search.c.i.a.m */
/* compiled from: PG */
final class C37694m implements BluetoothProfile.ServiceListener {

    /* renamed from: a */
    public final C60870cx f100111a;

    /* renamed from: b */
    public C2164c f100112b;

    /* renamed from: c */
    public final C60888db f100113c;

    /* renamed from: d */
    public final Object f100114d = new Object();

    /* renamed from: e */
    public C58833ax f100115e = C58836b.f156633a;

    /* renamed from: f */
    public final AtomicBoolean f100116f = new AtomicBoolean(false);

    /* renamed from: g */
    final /* synthetic */ C37695n f100117g;

    public C37694m(C37695n nVar, C60888db dbVar) {
        this.f100117g = nVar;
        this.f100113c = dbVar;
        this.f100111a = C2169h.m6027a(new C37693l(this));
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        synchronized (this.f100114d) {
            this.f100115e = C58833ax.m90833j((BluetoothHeadset) bluetoothProfile);
            this.f100112b.mo5437b((Object) null);
            if (!this.f100115e.mo56113h()) {
                ((C59052c) ((C59052c) C37695n.f100118a.mo56226d()).mo56372aa(52778)).mo56386p("#audio# Bluetooth Headset Profile is not present");
            }
        }
    }

    public final void onServiceDisconnected(int i) {
        synchronized (this.f100114d) {
            this.f100115e = C58836b.f156633a;
        }
        synchronized (this.f100117g) {
            for (C37681a b : this.f100117g.f100123f) {
                b.mo41064b();
            }
        }
    }
}
