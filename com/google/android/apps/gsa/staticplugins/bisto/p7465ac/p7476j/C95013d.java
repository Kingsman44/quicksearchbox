package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94872au;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95874b;
import com.google.assistant.p3739a.p3740a.C48065az;
import com.google.assistant.p3739a.p3740a.C48081bo;
import com.google.assistant.p3739a.p3740a.C48106cm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.j.d */
/* compiled from: PG */
public final class C95013d {

    /* renamed from: a */
    public static final C59071e f265822a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.j.d");

    /* renamed from: b */
    public final BluetoothGatt f265823b;

    /* renamed from: c */
    private final C95011b f265824c;

    public C95013d(C95011b bVar, C90851k kVar, BluetoothGatt bluetoothGatt) {
        this.f265824c = bVar;
        this.f265823b = bluetoothGatt;
        kVar.mo85208a("fake scheduled call");
    }

    /* renamed from: b */
    public final C95012c mo88920b(UUID uuid) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.f265823b;
        if (bluetoothGatt == null || (service = bluetoothGatt.getService(uuid)) == null) {
            return null;
        }
        return new C95012c(service);
    }

    /* renamed from: c */
    public final void mo88921c() {
        BluetoothGatt bluetoothGatt = this.f265823b;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
        }
    }

    /* renamed from: d */
    public final void mo88922d() {
        BluetoothGatt bluetoothGatt = this.f265823b;
        if (bluetoothGatt != null) {
            bluetoothGatt.getClass().getMethod("refresh", new Class[0]).invoke(this.f265823b, new Object[0]);
        }
    }

    /* renamed from: e */
    public final boolean mo88923e() {
        BluetoothGatt bluetoothGatt = this.f265823b;
        if (bluetoothGatt != null) {
            return bluetoothGatt.discoverServices();
        }
        ((C59052c) ((C59052c) f265822a.mo56225c()).mo56372aa(17863)).mo56386p("Unable to schedule onServicesDiscovered. BluetoothGattCallback is null.");
        return false;
    }

    /* renamed from: f */
    public final boolean mo88924f(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        BluetoothGatt bluetoothGatt = this.f265823b;
        return bluetoothGatt == null || bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z);
    }

    /* renamed from: g */
    public final boolean mo88925g(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGatt bluetoothGatt = this.f265823b;
        if (bluetoothGatt != null) {
            return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
        }
        C59071e eVar = f265822a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(17866)).mo56389s("Writing characteristic to fake device: %s", bluetoothGattCharacteristic.getUuid());
        try {
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (bluetoothGattCharacteristic.getUuid().equals(C94872au.f265316c)) {
                C48065az azVar = (C48065az) C62942bv.parseFrom((C62942bv) C48065az.f124397c, Arrays.copyOfRange(value, 2, value.length), C62921ba.f169869a);
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(17869)).mo56389s("Parsed characteristic: %s", azVar);
                int i = azVar.f124399a;
                if (i != 1) {
                    if (i == 4) {
                        boolean z = ((C48106cm) azVar.f124400b).f124509a;
                    } else {
                        C95874b bVar = C95874b.f268447a;
                        C95874b.f268447a.mo89830a(new ProtoLiteParcelable((MessageLite) azVar));
                    }
                }
            }
            if (bluetoothGattCharacteristic.getUuid().equals(C94872au.f265321h)) {
                C95874b bVar2 = C95874b.f268447a;
                C48081bo boVar = (C48081bo) C62942bv.parseFrom((C62942bv) C48081bo.f124437c, Arrays.copyOfRange(value, 2, value.length), C62921ba.f169869a);
            }
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f265822a.mo56225c()).mo56382g(e)).mo56372aa(17868)).mo56386p("Unable to parse host request");
        }
        ((C59052c) ((C59052c) f265822a.mo56225c()).mo56372aa(17867)).mo56386p("Unable to schedule onCharacteristicWrite. BluetoothGattCallback is null.");
        return false;
    }

    /* renamed from: h */
    public final boolean mo88926h(BluetoothGattDescriptor bluetoothGattDescriptor) {
        BluetoothGatt bluetoothGatt = this.f265823b;
        if (bluetoothGatt != null) {
            return bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
        }
        ((C59052c) ((C59052c) f265822a.mo56225c()).mo56372aa(17870)).mo56386p("Unable to schedule onDescriptorWrite. BluetoothGattCallback is null.");
        return false;
    }

    /* renamed from: a */
    public final C95010a mo88919a() {
        BluetoothGatt bluetoothGatt = this.f265823b;
        bluetoothGatt.getClass();
        return this.f265824c.mo88918a(bluetoothGatt.getDevice());
    }
}
