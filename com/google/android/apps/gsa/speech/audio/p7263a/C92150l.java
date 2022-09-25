package com.google.android.apps.gsa.speech.audio.p7263a;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.os.Build;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.speech.audio.a.l */
/* compiled from: PG */
public final class C92150l extends C92152n {

    /* renamed from: b */
    private static Method f256920b;

    /* renamed from: c */
    private static Method f256921c;

    /* renamed from: a */
    final BluetoothHeadset f256922a;

    static {
        try {
            f256920b = BluetoothHeadset.class.getMethod("startScoUsingVirtualVoiceCall", new Class[]{BluetoothDevice.class});
            f256921c = BluetoothHeadset.class.getMethod("stopScoUsingVirtualVoiceCall", new Class[]{BluetoothDevice.class});
        } catch (NoSuchMethodException e) {
            f256920b = null;
            f256921c = null;
            C59104x c = C92154p.f256923a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VS.BluetoothShim");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12146)).mo56386p("Error locating SCO method");
        }
    }

    public C92150l(BluetoothHeadset bluetoothHeadset) {
        this.f256922a = bluetoothHeadset;
    }

    /* renamed from: a */
    public final int mo86816a(C92149k kVar) {
        return this.f256922a.getConnectionState(kVar.f256919a);
    }

    /* renamed from: b */
    public final List mo86817b() {
        List<BluetoothDevice> connectedDevices = this.f256922a.getConnectedDevices();
        ArrayList arrayList = new ArrayList(connectedDevices.size());
        for (BluetoothDevice next : connectedDevices) {
            if (next != null) {
                arrayList.add(new C92149k(next));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo86818c(C92149k kVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return this.f256922a.isVoiceRecognitionSupported(kVar.f256919a);
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo86819d(C92149k kVar) {
        Boolean bool = (Boolean) C92154p.m151289b(f256920b, this.f256922a, kVar.f256919a);
        return bool != null && bool.booleanValue();
    }

    /* renamed from: e */
    public final boolean mo86820e(C92149k kVar) {
        try {
            return this.f256922a.startVoiceRecognition(kVar.f256919a);
        } catch (NullPointerException e) {
            C59104x c = C92154p.f256923a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VS.BluetoothShim");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12147)).mo56386p("NPE in framework IPC.");
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo86821f(C92149k kVar) {
        Boolean bool = (Boolean) C92154p.m151289b(f256921c, this.f256922a, kVar.f256919a);
        return bool != null && bool.booleanValue();
    }

    /* renamed from: g */
    public final boolean mo86822g(C92149k kVar) {
        try {
            return this.f256922a.stopVoiceRecognition(kVar.f256919a);
        } catch (NullPointerException e) {
            C59104x c = C92154p.f256923a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VS.BluetoothShim");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12148)).mo56386p("NPE in framework IPC.");
            return false;
        }
    }
}
