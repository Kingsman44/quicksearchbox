package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.btpermission;

import android.bluetooth.BluetoothManager;
import androidx.activity.result.C0816c;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124844bo;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124848bs;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.btpermission.c */
/* compiled from: PG */
public final class C124779c {

    /* renamed from: a */
    public static final C59071e f344213a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.btpermission.c");

    /* renamed from: b */
    public final BluetoothEnableRequestFragment f344214b;

    /* renamed from: c */
    public final C124844bo f344215c;

    /* renamed from: d */
    public final BluetoothManager f344216d;

    /* renamed from: e */
    public C0816c f344217e;

    /* renamed from: f */
    private final C46485f f344218f;

    /* renamed from: g */
    private final C124848bs f344219g;

    public C124779c(C124848bs bsVar, BluetoothManager bluetoothManager, BluetoothEnableRequestFragment bluetoothEnableRequestFragment, C46485f fVar) {
        this.f344214b = bluetoothEnableRequestFragment;
        this.f344216d = bluetoothManager;
        this.f344219g = bsVar;
        C124844bo boVar = bsVar.f344439b;
        this.f344215c = boVar == null ? C124844bo.f344417m : boVar;
        this.f344218f = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo106613a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f344218f.mo50482c(this.f344214b).mo50509e(R.id.assistant_bisto_oobe_next, this.f344219g);
    }
}
