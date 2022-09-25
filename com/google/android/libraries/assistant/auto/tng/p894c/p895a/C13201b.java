package com.google.android.libraries.assistant.auto.tng.p894c.p895a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.p894c.p895a.p896a.C13197c;
import com.google.android.libraries.assistant.auto.tng.p894c.p895a.p896a.C13198d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.auto.tng.c.a.b */
/* compiled from: PG */
public final class C13201b implements C13194a {

    /* renamed from: a */
    private static final C59071e f40843a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.c.a.b");

    /* renamed from: b */
    private final BluetoothAdapter f40844b;

    /* renamed from: c */
    private final C13198d f40845c;

    public C13201b(Context context, C13198d dVar) {
        this.f40845c = dVar;
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        this.f40844b = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
    }

    /* renamed from: a */
    public final C60870cx mo20970a() {
        C13198d dVar = this.f40845c;
        C60870cx d = dVar.f40842b.mo46042d();
        C13197c cVar = C13197c.f40840a;
        return C60922j.m93044g(d, C47810es.m84963c(cVar), dVar.f40841a);
    }

    /* renamed from: b */
    public final /* synthetic */ Set mo20971b() {
        BluetoothAdapter bluetoothAdapter = this.f40844b;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            C59104x d = f40843a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AutoBtStateReader");
            ((C59052c) ((C59052c) d).mo56372aa(44679)).mo56386p("#getBondedDevices, bluetooth not enabled");
            return C58733pz.f156496a;
        }
        Set<BluetoothDevice> bondedDevices = this.f40844b.getBondedDevices();
        if (bondedDevices != null && !bondedDevices.isEmpty()) {
            return C58528ij.m90006F(bondedDevices);
        }
        C58976aa aaVar = C58975e.f156826a;
        return C58733pz.f156496a;
    }

    /* renamed from: c */
    public final boolean mo20972c() {
        C58976aa aaVar = C58975e.f156826a;
        return mo20976g(18) || mo20976g(11) || mo20976g(16) || mo20976g(17);
    }

    /* renamed from: d */
    public final boolean mo20973d() {
        C58976aa aaVar = C58975e.f156826a;
        return mo20976g(16);
    }

    /* renamed from: e */
    public final boolean mo20974e() {
        C58976aa aaVar = C58975e.f156826a;
        return mo20976g(18);
    }

    /* renamed from: f */
    public final boolean mo20975f() {
        C58976aa aaVar = C58975e.f156826a;
        return mo20976g(17);
    }

    /* renamed from: g */
    public final boolean mo20976g(int i) {
        BluetoothAdapter bluetoothAdapter = this.f40844b;
        boolean z = false;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            C59104x d = f40843a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AutoBtStateReader");
            ((C59052c) ((C59052c) d).mo56372aa(44685)).mo56386p("#isConnectedToProfile, bluetooth not enabled");
            return false;
        }
        if (this.f40844b.getProfileConnectionState(i) == 2) {
            z = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        return z;
    }
}
