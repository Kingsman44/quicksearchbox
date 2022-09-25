package com.google.android.libraries.assistant.contexttrigger.p1460d;

import com.google.android.libraries.assistant.contexttrigger.p1461e.C17687a;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17689c;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17691e;
import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C59052c;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.n */
/* compiled from: PG */
public final /* synthetic */ class C17673n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C17684y f50823a;

    public /* synthetic */ C17673n(C17684y yVar) {
        this.f50823a = yVar;
    }

    public final Object apply(Object obj) {
        C17684y yVar = this.f50823a;
        ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46974)).mo56386p("getBluetoothHeadsetState(): device fetch done");
        List list = (List) Collection.EL.stream((List) obj).flatMap(C17676q.f50826a).collect(C58370cn.f155946a);
        if (list.isEmpty()) {
            ((C59052c) ((C59052c) C17684y.f50839a.mo56226d()).mo56372aa(46973)).mo56386p("getStateFromBluetoothDevices(): no connected devices.");
            C17687a a = yVar.mo23427a();
            C17691e eVar = C17691e.UNKNOWN;
            a.copyOnWrite();
            C17692f fVar = (C17692f) a.instance;
            C17692f fVar2 = C17692f.f50858f;
            fVar.f50862c = eVar.f50857e;
            fVar.f50860a |= 4;
            C17689c cVar = C17689c.DISCONNECTED;
            a.copyOnWrite();
            C17692f fVar3 = (C17692f) a.instance;
            fVar3.f50861b = cVar.f50850d;
            fVar3.f50860a |= 1;
            return Optional.m71637of((C17692f) a.build());
        }
        boolean anyMatch = Collection.EL.stream(list).anyMatch(C17679t.f50829a);
        ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46971)).mo56389s("getStateFromBluetoothDevices(): connected device [car? %b].", Boolean.valueOf(anyMatch));
        if (anyMatch) {
            C17687a a2 = yVar.mo23427a();
            C17689c cVar2 = C17689c.CONNECTED;
            a2.copyOnWrite();
            C17692f fVar4 = (C17692f) a2.instance;
            C17692f fVar5 = C17692f.f50858f;
            fVar4.f50861b = cVar2.f50850d;
            fVar4.f50860a |= 1;
            C17691e eVar2 = C17691e.CAR_BLUETOOTH;
            a2.copyOnWrite();
            C17692f fVar6 = (C17692f) a2.instance;
            fVar6.f50862c = eVar2.f50857e;
            fVar6.f50860a |= 4;
            String d = C17684y.m34957d(list, true);
            a2.copyOnWrite();
            C17692f fVar7 = (C17692f) a2.instance;
            d.getClass();
            fVar7.f50860a |= 8;
            fVar7.f50863d = d;
            return Optional.m71637of((C17692f) a2.build());
        }
        ((C59052c) ((C59052c) C17684y.f50839a.mo56224b()).mo56372aa(46972)).mo56386p("return bluetooth connected because non-empty device list");
        C17687a a3 = yVar.mo23427a();
        C17689c cVar3 = C17689c.CONNECTED;
        a3.copyOnWrite();
        C17692f fVar8 = (C17692f) a3.instance;
        C17692f fVar9 = C17692f.f50858f;
        fVar8.f50861b = cVar3.f50850d;
        fVar8.f50860a |= 1;
        C17691e eVar3 = C17691e.GENERIC_BLUETOOTH;
        a3.copyOnWrite();
        C17692f fVar10 = (C17692f) a3.instance;
        fVar10.f50862c = eVar3.f50857e;
        fVar10.f50860a |= 4;
        String d2 = C17684y.m34957d(list, false);
        a3.copyOnWrite();
        C17692f fVar11 = (C17692f) a3.instance;
        d2.getClass();
        fVar11.f50860a |= 8;
        fVar11.f50863d = d2;
        return Optional.m71637of((C17692f) a3.build());
    }
}
