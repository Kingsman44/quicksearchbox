package com.google.android.libraries.assistant.p1467d;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17841d;
import com.google.android.libraries.assistant.p1467d.p1472c.p1473a.C17843f;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17871aa;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17872ab;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17873ac;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17876af;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17877ag;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17879ai;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17914p;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17918t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.d.n */
/* compiled from: PG */
public final /* synthetic */ class C17936n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17937o f51379a;

    /* renamed from: b */
    public final /* synthetic */ ComponentName f51380b;

    /* renamed from: c */
    public final /* synthetic */ IBinder f51381c;

    public /* synthetic */ C17936n(C17937o oVar, ComponentName componentName, IBinder iBinder) {
        this.f51379a = oVar;
        this.f51380b = componentName;
        this.f51381c = iBinder;
    }

    public final void run() {
        C17843f fVar;
        C17937o oVar = this.f51379a;
        ComponentName componentName = this.f51380b;
        IBinder iBinder = this.f51381c;
        if (componentName != null) {
            String packageName = componentName.getPackageName();
            if ("com.google.android.googlequicksearchbox".equals(packageName) && oVar.f51383b.f51389f.mo119084c(packageName)) {
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService");
                    fVar = queryLocalInterface instanceof C17843f ? (C17843f) queryLocalInterface : new C17841d(iBinder);
                }
                try {
                    C17938p pVar = oVar.f51383b;
                    pVar.f51388e = fVar.mo23479a(pVar.f51385b.getPackageName(), oVar.f51383b.f51386c);
                    if (oVar.f51383b.f51388e == null) {
                        oVar.mo23495a();
                        return;
                    }
                    oVar.f51382a = 3;
                    C17934l lVar = oVar.f51383b.f51387d;
                    if (lVar.f51373g.mo23487a()) {
                        if (lVar.f51372f == null) {
                            lVar.f51372f = (C17873ac) C17880aj.f51221i.createBuilder();
                        }
                        C17873ac acVar = lVar.f51372f;
                        int a = C17879ai.m35106a(0);
                        acVar.copyOnWrite();
                        C17880aj ajVar = (C17880aj) acVar.instance;
                        int i = a - 1;
                        C17880aj ajVar2 = C17880aj.f51221i;
                        if (a != 0) {
                            ajVar.f51224b = i;
                            ajVar.f51223a |= 1;
                            if (TextUtils.isEmpty((CharSequence) null)) {
                                acVar.copyOnWrite();
                                C17880aj ajVar3 = (C17880aj) acVar.instance;
                                ajVar3.f51223a &= -3;
                                ajVar3.f51225c = C17880aj.f51221i.f51225c;
                                C17876af afVar = (C17876af) C17877ag.f51217b.createBuilder();
                                ArrayList arrayList = new ArrayList();
                                afVar.copyOnWrite();
                                C17877ag agVar = (C17877ag) afVar.instance;
                                C62971cq cqVar = agVar.f51219a;
                                if (!cqVar.mo58948c()) {
                                    agVar.f51219a = C62942bv.mutableCopy(cqVar);
                                }
                                C62947c.addAll((Iterable) arrayList, (List) agVar.f51219a);
                                acVar.copyOnWrite();
                                C17880aj ajVar4 = (C17880aj) acVar.instance;
                                C17877ag agVar2 = (C17877ag) afVar.build();
                                agVar2.getClass();
                                ajVar4.f51226d = agVar2;
                                ajVar4.f51223a |= 4;
                                acVar.copyOnWrite();
                                C17880aj ajVar5 = (C17880aj) acVar.instance;
                                ajVar5.f51223a |= 32;
                                ajVar5.f51229g = 0;
                                if (TextUtils.isEmpty((CharSequence) null)) {
                                    acVar.copyOnWrite();
                                    C17880aj ajVar6 = (C17880aj) acVar.instance;
                                    ajVar6.f51223a |= 16;
                                    ajVar6.f51228f = BuildConfig.FLAVOR;
                                    C17871aa aaVar = (C17871aa) C17872ab.f51209b.createBuilder();
                                    List list = lVar.f51371e;
                                    aaVar.copyOnWrite();
                                    C17872ab abVar = (C17872ab) aaVar.instance;
                                    C62971cq cqVar2 = abVar.f51211a;
                                    if (!cqVar2.mo58948c()) {
                                        abVar.f51211a = C62942bv.mutableCopy(cqVar2);
                                    }
                                    C62947c.addAll((Iterable) list, (List) abVar.f51211a);
                                    acVar.copyOnWrite();
                                    C17880aj ajVar7 = (C17880aj) acVar.instance;
                                    C17872ab abVar2 = (C17872ab) aaVar.build();
                                    abVar2.getClass();
                                    ajVar7.f51230h = abVar2;
                                    ajVar7.f51223a |= 64;
                                    C17914p pVar2 = (C17914p) C17881ak.f51231h.createBuilder();
                                    pVar2.copyOnWrite();
                                    C17881ak akVar = (C17881ak) pVar2.instance;
                                    C17880aj ajVar8 = (C17880aj) acVar.build();
                                    ajVar8.getClass();
                                    akVar.f51235c = ajVar8;
                                    akVar.f51233a |= 2;
                                    C17918t[] tVarArr = C17934l.f51368b;
                                    int length = tVarArr.length;
                                    for (int i2 = 0; i2 < 2; i2++) {
                                        C17918t tVar = tVarArr[i2];
                                        pVar2.copyOnWrite();
                                        C17881ak akVar2 = (C17881ak) pVar2.instance;
                                        tVar.getClass();
                                        C62961ch chVar = akVar2.f51239g;
                                        if (!chVar.mo58948c()) {
                                            akVar2.f51239g = C62942bv.mutableCopy(chVar);
                                        }
                                        akVar2.f51239g.mo58916g(tVar.f51334d);
                                    }
                                    try {
                                        C17934l.m35122c(lVar.mo23491b(pVar2), "sendCurrentVoicePlateParamsAndCapabilities");
                                        lVar.f51372f = null;
                                    } catch (RemoteException unused) {
                                        Log.w("AssistantIntegClient", "#sendCurrentVoicePlateParamsAndCapabilities(): failed to send VoicePlateParams");
                                    }
                                } else {
                                    acVar.copyOnWrite();
                                    C17880aj ajVar9 = (C17880aj) acVar.instance;
                                    throw null;
                                }
                            } else {
                                acVar.copyOnWrite();
                                C17880aj ajVar10 = (C17880aj) acVar.instance;
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    }
                    C59104x d = C17938p.f51384a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "MaestroConnector");
                    ((C59052c) ((C59052c) d).mo56372aa(42848)).mo56386p("#onServiceConnected(): callback is null when try to notify onServiceConnected.");
                    return;
                } catch (RemoteException unused2) {
                    C59104x d2 = C17938p.f51384a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "MaestroConnector");
                    ((C59052c) ((C59052c) d2).mo56372aa(42847)).mo56386p("#onServiceConnected(): Failed to start session");
                    oVar.mo23495a();
                    return;
                }
            }
        }
        C59104x d3 = C17938p.f51384a.mo56226d();
        d3.mo56378ag(C58975e.f156826a, "MaestroConnector");
        ((C59052c) ((C59052c) d3).mo56372aa(42846)).mo56386p("#onServiceConnected(): Service signature is not matched");
        oVar.mo23495a();
    }
}
