package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106527a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106529c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.a.j */
/* compiled from: PG */
public final /* synthetic */ class C106612j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106615m f297247a;

    public /* synthetic */ C106612j(C106615m mVar) {
        this.f297247a = mVar;
    }

    public final Object apply(Object obj) {
        C106615m mVar = this.f297247a;
        ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23160)).mo56386p("getBluetoothHeadsetState(): device fetch done");
        List list = (List) Collection.EL.stream((List) obj).flatMap(C106608f.f297241a).collect(C58370cn.f155946a);
        if (list.isEmpty()) {
            ((C58970a) ((C58970a) mVar.f297255c.mo56226d()).mo56372aa(23159)).mo56386p("getStateFromBluetoothDevices(): no connected devices.");
            C106527a a = mVar.mo95594a();
            C106531e eVar = C106531e.UNKNOWN;
            a.copyOnWrite();
            C106532f fVar = (C106532f) a.instance;
            C106532f fVar2 = C106532f.f297078g;
            fVar.f297082c = eVar.f297077e;
            fVar.f297080a |= 4;
            C106529c cVar = C106529c.DISCONNECTED;
            a.copyOnWrite();
            C106532f fVar3 = (C106532f) a.instance;
            fVar3.f297081b = cVar.f297070d;
            fVar3.f297080a |= 1;
            return Optional.m71637of((C106532f) a.build());
        }
        boolean anyMatch = Collection.EL.stream(list).anyMatch(C106611i.f297246a);
        ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23153)).mo56389s("getStateFromBluetoothDevices(): connected device [car? %b].", Boolean.valueOf(anyMatch));
        boolean isBluetoothA2dpOn = mVar.f297254b.isBluetoothA2dpOn();
        boolean isBluetoothScoOn = mVar.f297254b.isBluetoothScoOn();
        ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23154)).mo56358K("getStateFromBluetoothDevices(): check bluetooth a2dp:%b sco:%b", isBluetoothA2dpOn, isBluetoothScoOn);
        C106527a a2 = mVar.mo95594a();
        if (anyMatch) {
            Optional d = C106615m.m177380d(list, true);
            C106529c cVar2 = C106529c.CONNECTED;
            a2.copyOnWrite();
            C106532f fVar4 = (C106532f) a2.instance;
            C106532f fVar5 = C106532f.f297078g;
            fVar4.f297081b = cVar2.f297070d;
            fVar4.f297080a |= 1;
            C106531e eVar2 = C106531e.CAR_BLUETOOTH;
            a2.copyOnWrite();
            C106532f fVar6 = (C106532f) a2.instance;
            fVar6.f297082c = eVar2.f297077e;
            fVar6.f297080a |= 4;
            String str = (String) d.map(C106606d.f297239a).orElse(BuildConfig.FLAVOR);
            a2.copyOnWrite();
            C106532f fVar7 = (C106532f) a2.instance;
            str.getClass();
            fVar7.f297080a |= 8;
            fVar7.f297083d = str;
            String f = mVar.mo95597f(d);
            a2.copyOnWrite();
            C106532f fVar8 = (C106532f) a2.instance;
            fVar8.f297080a |= 32;
            fVar8.f297085f = f;
            return Optional.m71637of((C106532f) a2.build());
        }
        Optional d2 = C106615m.m177380d(list, false);
        if (!mVar.f297256d.mo85405j(C90017bw.f247942bD) && !mVar.f297256d.mo85405j(C90017bw.f247943bE)) {
            ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23158)).mo56386p("return bluetooth connected because non-empty device list");
            C106529c cVar3 = C106529c.CONNECTED;
            a2.copyOnWrite();
            C106532f fVar9 = (C106532f) a2.instance;
            C106532f fVar10 = C106532f.f297078g;
            fVar9.f297081b = cVar3.f297070d;
            fVar9.f297080a |= 1;
            C106531e eVar3 = C106531e.GENERIC_BLUETOOTH;
            a2.copyOnWrite();
            C106532f fVar11 = (C106532f) a2.instance;
            fVar11.f297082c = eVar3.f297077e;
            fVar11.f297080a |= 4;
            String str2 = (String) d2.map(C106606d.f297239a).orElse(BuildConfig.FLAVOR);
            a2.copyOnWrite();
            C106532f fVar12 = (C106532f) a2.instance;
            str2.getClass();
            fVar12.f297080a |= 8;
            fVar12.f297083d = str2;
            String f2 = mVar.mo95597f(d2);
            a2.copyOnWrite();
            C106532f fVar13 = (C106532f) a2.instance;
            fVar13.f297080a |= 32;
            fVar13.f297085f = f2;
            return Optional.m71637of((C106532f) a2.build());
        } else if (mVar.f297256d.mo85405j(C90017bw.f247942bD) && isBluetoothA2dpOn) {
            ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23157)).mo56386p("return bluetooth connected because bluetooth a2dp on");
            C106529c cVar4 = C106529c.CONNECTED;
            a2.copyOnWrite();
            C106532f fVar14 = (C106532f) a2.instance;
            C106532f fVar15 = C106532f.f297078g;
            fVar14.f297081b = cVar4.f297070d;
            fVar14.f297080a |= 1;
            C106531e eVar4 = C106531e.GENERIC_BLUETOOTH;
            a2.copyOnWrite();
            C106532f fVar16 = (C106532f) a2.instance;
            fVar16.f297082c = eVar4.f297077e;
            fVar16.f297080a |= 4;
            String str3 = (String) d2.map(C106606d.f297239a).orElse(BuildConfig.FLAVOR);
            a2.copyOnWrite();
            C106532f fVar17 = (C106532f) a2.instance;
            str3.getClass();
            fVar17.f297080a |= 8;
            fVar17.f297083d = str3;
            String f3 = mVar.mo95597f(d2);
            a2.copyOnWrite();
            C106532f fVar18 = (C106532f) a2.instance;
            fVar18.f297080a |= 32;
            fVar18.f297085f = f3;
            return Optional.m71637of((C106532f) a2.build());
        } else if (!mVar.f297256d.mo85405j(C90017bw.f247943bE) || !isBluetoothScoOn) {
            ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23155)).mo56386p("return bluetooth disconnected despite non-empty device list because checks failed");
            C106529c cVar5 = C106529c.DISCONNECTED;
            a2.copyOnWrite();
            C106532f fVar19 = (C106532f) a2.instance;
            C106532f fVar20 = C106532f.f297078g;
            fVar19.f297081b = cVar5.f297070d;
            fVar19.f297080a |= 1;
            C106531e eVar5 = C106531e.UNKNOWN;
            a2.copyOnWrite();
            C106532f fVar21 = (C106532f) a2.instance;
            fVar21.f297082c = eVar5.f297077e;
            fVar21.f297080a |= 4;
            return Optional.m71637of((C106532f) a2.build());
        } else {
            ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23156)).mo56386p("return bluetooth connected because bluetooth sco on");
            C106529c cVar6 = C106529c.CONNECTED;
            a2.copyOnWrite();
            C106532f fVar22 = (C106532f) a2.instance;
            C106532f fVar23 = C106532f.f297078g;
            fVar22.f297081b = cVar6.f297070d;
            fVar22.f297080a |= 1;
            C106531e eVar6 = C106531e.GENERIC_BLUETOOTH;
            a2.copyOnWrite();
            C106532f fVar24 = (C106532f) a2.instance;
            fVar24.f297082c = eVar6.f297077e;
            fVar24.f297080a |= 4;
            String str4 = (String) d2.map(C106606d.f297239a).orElse(BuildConfig.FLAVOR);
            a2.copyOnWrite();
            C106532f fVar25 = (C106532f) a2.instance;
            str4.getClass();
            fVar25.f297080a |= 8;
            fVar25.f297083d = str4;
            String f4 = mVar.mo95597f(d2);
            a2.copyOnWrite();
            C106532f fVar26 = (C106532f) a2.instance;
            fVar26.f297080a |= 32;
            fVar26.f297085f = f4;
            return Optional.m71637of((C106532f) a2.build());
        }
    }
}
