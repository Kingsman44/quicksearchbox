package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.assistant.auto.tng.gmm.p996d.C13587a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16761k;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16762l;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16763m;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16764n;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16765o;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16766p;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.d.a */
/* compiled from: PG */
public final class C16783a {

    /* renamed from: a */
    private static final C59071e f49116a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.ui.voiceplate.d.a");

    /* renamed from: a */
    public final Intent mo23010a(C16766p pVar) {
        C59104x b = f49116a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AppOpenArgs");
        ((C59052c) ((C59052c) b).mo56372aa(46837)).mo56386p("Converting AppOpenArgs to intent");
        Intent intent = new Intent();
        C16764n nVar = pVar.f49067b;
        if (nVar == null) {
            nVar = C16764n.f49053j;
        }
        if ((nVar.f49055a & 1) != 0) {
            intent.setAction(nVar.f49056b);
        }
        if (!nVar.f49057c.isEmpty()) {
            for (String addCategory : nVar.f49057c) {
                intent.addCategory(addCategory);
            }
        }
        if ((nVar.f49055a & 2) != 0) {
            intent.setPackage(nVar.f49058d);
        }
        if ((nVar.f49055a & 4) != 0) {
            intent.setData(Uri.parse(nVar.f49059e));
        }
        if ((nVar.f49055a & 8) != 0) {
            intent.setType(nVar.f49060f);
        }
        if ((nVar.f49055a & 16) != 0) {
            intent.setFlags(nVar.f49061g);
        }
        if ((nVar.f49055a & 32) != 0) {
            intent.setComponent(ComponentName.unflattenFromString(nVar.f49063i));
        }
        C62971cq<C16763m> cqVar = nVar.f49062h;
        if (!cqVar.isEmpty()) {
            for (C16763m mVar : cqVar) {
                int i = mVar.f49050b;
                if (i == 5) {
                    intent.putExtra(mVar.f49052d, ((Boolean) mVar.f49051c).booleanValue());
                } else if (i == 4) {
                    intent.putExtra(mVar.f49052d, ((Integer) mVar.f49051c).intValue());
                } else if (i == 3) {
                    intent.putExtra(mVar.f49052d, ((C63088z) mVar.f49051c).mo59174N());
                } else if (i == 2) {
                    intent.putExtra(mVar.f49052d, (String) mVar.f49051c);
                }
            }
        }
        return intent;
    }

    /* renamed from: b */
    public final C16766p mo23011b(Intent intent) {
        C59104x b = f49116a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AppOpenArgs");
        ((C59052c) ((C59052c) b).mo56372aa(46838)).mo56386p("Converting intent to AppOpenArgs");
        C16765o oVar = (C16765o) C16766p.f49064d.createBuilder();
        C16761k kVar = (C16761k) C16764n.f49053j.createBuilder();
        boolean z = true;
        if (!C58837ba.m90859h(intent.getAction())) {
            String action = intent.getAction();
            kVar.copyOnWrite();
            C16764n nVar = (C16764n) kVar.instance;
            action.getClass();
            nVar.f49055a |= 1;
            nVar.f49056b = action;
        }
        if (intent.getCategories() != null && !intent.getCategories().isEmpty()) {
            for (String next : intent.getCategories()) {
                kVar.copyOnWrite();
                C16764n nVar2 = (C16764n) kVar.instance;
                next.getClass();
                C62971cq cqVar = nVar2.f49057c;
                if (!cqVar.mo58948c()) {
                    nVar2.f49057c = C62942bv.mutableCopy(cqVar);
                }
                nVar2.f49057c.add(next);
            }
        }
        if (!C58837ba.m90859h(intent.getPackage())) {
            String str = intent.getPackage();
            kVar.copyOnWrite();
            C16764n nVar3 = (C16764n) kVar.instance;
            str.getClass();
            nVar3.f49055a |= 2;
            nVar3.f49058d = str;
        }
        if (!C58837ba.m90859h(intent.getDataString())) {
            String dataString = intent.getDataString();
            kVar.copyOnWrite();
            C16764n nVar4 = (C16764n) kVar.instance;
            dataString.getClass();
            nVar4.f49055a |= 4;
            nVar4.f49059e = dataString;
        }
        if (!C58837ba.m90859h(intent.getType())) {
            String type = intent.getType();
            kVar.copyOnWrite();
            C16764n nVar5 = (C16764n) kVar.instance;
            type.getClass();
            nVar5.f49055a |= 8;
            nVar5.f49060f = type;
        }
        if (intent.getFlags() != 0) {
            int flags = intent.getFlags();
            kVar.copyOnWrite();
            C16764n nVar6 = (C16764n) kVar.instance;
            nVar6.f49055a |= 16;
            nVar6.f49061g = flags;
        }
        if (intent.getComponent() != null) {
            ComponentName component = intent.getComponent();
            component.getClass();
            if (!C58837ba.m90859h(component.flattenToString())) {
                ComponentName component2 = intent.getComponent();
                component2.getClass();
                String flattenToString = component2.flattenToString();
                kVar.copyOnWrite();
                C16764n nVar7 = (C16764n) kVar.instance;
                flattenToString.getClass();
                nVar7.f49055a |= 32;
                nVar7.f49063i = flattenToString;
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null && extras.size() > 0) {
            for (String str2 : extras.keySet()) {
                Object obj = extras.get(str2);
                if (obj instanceof Boolean) {
                    C16762l lVar = (C16762l) C16763m.f49047e.createBuilder();
                    lVar.copyOnWrite();
                    C16763m mVar = (C16763m) lVar.instance;
                    str2.getClass();
                    mVar.f49049a |= 1;
                    mVar.f49052d = str2;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    lVar.copyOnWrite();
                    C16763m mVar2 = (C16763m) lVar.instance;
                    mVar2.f49050b = 5;
                    mVar2.f49051c = Boolean.valueOf(booleanValue);
                    kVar.mo23000a(lVar);
                } else if (obj instanceof Integer) {
                    C16762l lVar2 = (C16762l) C16763m.f49047e.createBuilder();
                    lVar2.copyOnWrite();
                    C16763m mVar3 = (C16763m) lVar2.instance;
                    str2.getClass();
                    mVar3.f49049a |= 1;
                    mVar3.f49052d = str2;
                    int intValue = ((Integer) obj).intValue();
                    lVar2.copyOnWrite();
                    C16763m mVar4 = (C16763m) lVar2.instance;
                    mVar4.f49050b = 4;
                    mVar4.f49051c = Integer.valueOf(intValue);
                    kVar.mo23000a(lVar2);
                } else if (obj instanceof byte[]) {
                    C16762l lVar3 = (C16762l) C16763m.f49047e.createBuilder();
                    lVar3.copyOnWrite();
                    C16763m mVar5 = (C16763m) lVar3.instance;
                    str2.getClass();
                    mVar5.f49049a |= 1;
                    mVar5.f49052d = str2;
                    C63088z A = C63088z.m96139A((byte[]) obj);
                    lVar3.copyOnWrite();
                    C16763m mVar6 = (C16763m) lVar3.instance;
                    mVar6.f49050b = 3;
                    mVar6.f49051c = A;
                    kVar.mo23000a(lVar3);
                } else if (obj instanceof String) {
                    C16762l lVar4 = (C16762l) C16763m.f49047e.createBuilder();
                    lVar4.copyOnWrite();
                    C16763m mVar7 = (C16763m) lVar4.instance;
                    str2.getClass();
                    mVar7.f49049a |= 1;
                    mVar7.f49052d = str2;
                    String str3 = (String) obj;
                    lVar4.copyOnWrite();
                    C16763m mVar8 = (C16763m) lVar4.instance;
                    str3.getClass();
                    mVar8.f49050b = 2;
                    mVar8.f49051c = str3;
                    kVar.mo23000a(lVar4);
                } else {
                    C59104x d = f49116a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "AppOpenArgs");
                    C59052c cVar = (C59052c) d;
                    cVar.mo56378ag(C38505d.f101864b, 240469645);
                    ((C59052c) cVar.mo56372aa(46839)).mo56354G("Ignored extra key:%s, value:%s", str2, obj);
                }
            }
        }
        C16764n nVar8 = (C16764n) kVar.build();
        oVar.copyOnWrite();
        C16766p pVar = (C16766p) oVar.instance;
        nVar8.getClass();
        pVar.f49067b = nVar8;
        pVar.f49066a |= 1;
        Uri data = intent.getData();
        if (!C13587a.f41597a.contains(intent.getPackage()) || data == null || !data.isHierarchical() || data.getQueryParameter("gmm") == null || !"sar".equals(data.getQueryParameter("entry"))) {
            z = false;
        }
        oVar.copyOnWrite();
        C16766p pVar2 = (C16766p) oVar.instance;
        pVar2.f49066a |= 2;
        pVar2.f49068c = z;
        return (C16766p) oVar.build();
    }
}
