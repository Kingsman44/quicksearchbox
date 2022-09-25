package com.google.android.apps.gsa.staticplugins.actionsui.modular.p7368a;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.permissions.C91076c;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.a.c */
/* compiled from: PG */
public final class C93511c extends C93518j {

    /* renamed from: a */
    private final BluetoothAdapter f261126a;

    /* renamed from: b */
    private boolean f261127b;

    /* renamed from: d */
    private final Context f261128d;

    public C93511c(Context context) {
        this.f261128d = context;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f261126a = defaultAdapter;
        this.f261127b = m154196i(defaultAdapter);
    }

    /* renamed from: i */
    private final boolean m154196i(BluetoothAdapter bluetoothAdapter) {
        if (!C91076c.m148792a(this.f261128d)) {
            return false;
        }
        int state = bluetoothAdapter.getState();
        if (state == 12 || state == 11) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo87923a() {
        return this.f261127b ? R.drawable.ic_bluetooth_on_action_card_material : R.drawable.ic_bluetooth_off_action_card_material;
    }

    /* renamed from: b */
    public final int mo87924b() {
        return this.f261127b ? R.string.bluetooth_on : R.string.bluetooth_off;
    }

    /* renamed from: c */
    public final int mo87925c() {
        return -1;
    }

    /* renamed from: d */
    public final IntentFilter mo87926d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentFilter.addAction("android.bluetooth.adapter.action.LOCAL_NAME_CHANGED");
        return intentFilter;
    }

    /* renamed from: e */
    public final CharSequence mo87927e(Resources resources) {
        StringBuilder sb = new StringBuilder();
        if (this.f261127b && C91076c.m148792a(this.f261128d)) {
            for (BluetoothDevice name : this.f261126a.getBondedDevices()) {
                String name2 = name.getName();
                if (!TextUtils.isEmpty(name2)) {
                    sb.append(name2);
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: f */
    public final void mo87928f() {
        this.f261127b = m154196i(this.f261126a);
    }

    /* renamed from: g */
    public final boolean mo87929g() {
        return this.f261127b;
    }
}
