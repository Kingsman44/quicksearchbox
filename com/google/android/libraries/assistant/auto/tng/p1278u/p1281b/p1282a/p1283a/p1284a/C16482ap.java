package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.tng.p894c.p895a.C13194a;
import com.google.android.libraries.assistant.auto.tng.p894c.p895a.C13202c;
import com.google.assistant.p3897e.p3917i.p3918a.C51340eb;
import com.google.assistant.p3897e.p3917i.p3918a.C51342ed;
import com.google.assistant.p3897e.p3917i.p3918a.C51343ee;
import com.google.assistant.p3897e.p3917i.p3918a.C51344ef;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C16482ap implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C13194a f48415a;

    /* renamed from: b */
    public final /* synthetic */ C13202c f48416b;

    /* renamed from: c */
    public final /* synthetic */ C51340eb f48417c;

    public /* synthetic */ C16482ap(C13194a aVar, C13202c cVar, C51340eb ebVar) {
        this.f48415a = aVar;
        this.f48416b = cVar;
        this.f48417c = ebVar;
    }

    public final Object apply(Object obj) {
        C13194a aVar = this.f48415a;
        C13202c cVar = this.f48416b;
        C51340eb ebVar = this.f48417c;
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            Iterator it = aVar.mo20971b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BluetoothDevice bluetoothDevice = (BluetoothDevice) it.next();
                bluetoothDevice.getAddress();
                if (TextUtils.equals(str, bluetoothDevice.getAddress()) && cVar.mo20977a(bluetoothDevice)) {
                    ebVar.copyOnWrite();
                    C51342ed edVar = (C51342ed) ebVar.instance;
                    C51342ed edVar2 = C51342ed.f133723f;
                    edVar.f133729e = 1;
                    edVar.f133725a |= 8;
                    break;
                }
            }
        }
        C51343ee eeVar = (C51343ee) C51344ef.f133730b.createBuilder();
        eeVar.mo53587a(ebVar);
        return C58833ax.m90834k((C51344ef) eeVar.build());
    }
}
