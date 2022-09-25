package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.shared.C73801ae;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106527a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106529c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.a.g */
/* compiled from: PG */
public final /* synthetic */ class C106609g implements Function {

    /* renamed from: a */
    public final /* synthetic */ C106615m f297242a;

    /* renamed from: b */
    public final /* synthetic */ Intent f297243b;

    public /* synthetic */ C106609g(C106615m mVar, Intent intent) {
        this.f297242a = mVar;
        this.f297243b = intent;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C106615m mVar = this.f297242a;
        Intent intent = this.f297243b;
        C106532f fVar = (C106532f) obj;
        C106529c a = C106529c.m177304a(fVar.f297081b);
        if (a == null) {
            a = C106529c.UNSPECIFIED;
        }
        if (!a.equals(C106529c.DISCONNECTED)) {
            return fVar;
        }
        if (C106615m.m177384l(intent)) {
            C106527a aVar = (C106527a) fVar.toBuilder();
            C106531e eVar = C106531e.WIRED;
            aVar.copyOnWrite();
            C106532f fVar2 = (C106532f) aVar.instance;
            fVar2.f297082c = eVar.f297077e;
            fVar2.f297080a |= 4;
            return (C106532f) aVar.build();
        } else if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) && !"android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) && !"android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) && !"android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            return fVar;
        } else {
            if (!C106615m.m177383h(mVar.f297253a)) {
                ((C58970a) ((C58970a) mVar.f297255c.mo56226d()).mo56372aa(23167)).mo56386p("isBluetoothCarDevice(): No permissions");
            } else {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null) {
                    ((C58970a) ((C58970a) mVar.f297255c.mo56225c()).mo56372aa(23165)).mo56386p("isBluetoothCarDevice(): Null device");
                } else if (C73801ae.m108365a(bluetoothDevice)) {
                    C106527a aVar2 = (C106527a) fVar.toBuilder();
                    C106531e eVar2 = C106531e.CAR_BLUETOOTH;
                    aVar2.copyOnWrite();
                    C106532f fVar3 = (C106532f) aVar2.instance;
                    fVar3.f297082c = eVar2.f297077e;
                    fVar3.f297080a |= 4;
                    return (C106532f) aVar2.build();
                }
            }
            C106527a aVar3 = (C106527a) fVar.toBuilder();
            C106531e eVar3 = C106531e.GENERIC_BLUETOOTH;
            aVar3.copyOnWrite();
            C106532f fVar4 = (C106532f) aVar3.instance;
            fVar4.f297082c = eVar3.f297077e;
            fVar4.f297080a |= 4;
            return (C106532f) aVar3.build();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
