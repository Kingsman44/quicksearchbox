package com.google.android.libraries.assistant.contexttrigger.p1460d;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17687a;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.u */
/* compiled from: PG */
public final /* synthetic */ class C17680u implements Function {

    /* renamed from: a */
    public final /* synthetic */ C17684y f50830a;

    /* renamed from: b */
    public final /* synthetic */ Intent f50831b;

    public /* synthetic */ C17680u(C17684y yVar, Intent intent) {
        this.f50830a = yVar;
        this.f50831b = intent;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C17684y yVar = this.f50830a;
        Intent intent = this.f50831b;
        C17692f fVar = (C17692f) obj;
        C17689c a = C17689c.m34968a(fVar.f50861b);
        if (a == null) {
            a = C17689c.UNSPECIFIED;
        }
        if (!a.equals(C17689c.DISCONNECTED)) {
            return fVar;
        }
        if (C17684y.m34961j(intent)) {
            C17687a aVar = (C17687a) fVar.toBuilder();
            C17691e eVar = C17691e.WIRED;
            aVar.copyOnWrite();
            C17692f fVar2 = (C17692f) aVar.instance;
            fVar2.f50862c = eVar.f50857e;
            fVar2.f50860a |= 4;
            return (C17692f) aVar.build();
        } else if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) && !"android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) && !"android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction()) && !"android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            return fVar;
        } else {
            if (!yVar.mo23429f(yVar.f50840b)) {
                ((C59052c) ((C59052c) C17684y.f50839a.mo56226d()).mo56372aa(46980)).mo56386p("isBluetoothCarDevice(): No permissions");
            } else if (intent == null) {
                ((C59052c) ((C59052c) C17684y.f50839a.mo56226d()).mo56372aa(46979)).mo56386p("isBluetoothCarDevice(): Null intent");
            } else {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null) {
                    ((C59052c) ((C59052c) C17684y.f50839a.mo56225c()).mo56372aa(46978)).mo56386p("isBluetoothCarDevice(): Null device");
                } else if (C17659a.m34947a(bluetoothDevice)) {
                    C17687a aVar2 = (C17687a) fVar.toBuilder();
                    C17691e eVar2 = C17691e.CAR_BLUETOOTH;
                    aVar2.copyOnWrite();
                    C17692f fVar3 = (C17692f) aVar2.instance;
                    fVar3.f50862c = eVar2.f50857e;
                    fVar3.f50860a |= 4;
                    return (C17692f) aVar2.build();
                }
            }
            C17687a aVar3 = (C17687a) fVar.toBuilder();
            C17691e eVar3 = C17691e.GENERIC_BLUETOOTH;
            aVar3.copyOnWrite();
            C17692f fVar4 = (C17692f) aVar3.instance;
            fVar4.f50862c = eVar3.f50857e;
            fVar4.f50860a |= 4;
            return (C17692f) aVar3.build();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
