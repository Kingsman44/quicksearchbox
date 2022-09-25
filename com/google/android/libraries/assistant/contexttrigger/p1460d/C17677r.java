package com.google.android.libraries.assistant.contexttrigger.p1460d;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.r */
/* compiled from: PG */
public final /* synthetic */ class C17677r implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ Context f50827a;

    public /* synthetic */ C17677r(Context context) {
        this.f50827a = context;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        Context context = this.f50827a;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            boolean profileProxy = defaultAdapter.getProfileProxy(context, new C17683x(cVar, defaultAdapter), 2);
            ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46975)).mo56389s("Attempt to connect to profile proxy was successful? %s", Boolean.valueOf(profileProxy));
            if (profileProxy) {
                return "getDevicesForProfile";
            }
        }
        cVar.mo5437b(C58485gu.m89845m());
        return "getDevicesForProfile";
    }
}
