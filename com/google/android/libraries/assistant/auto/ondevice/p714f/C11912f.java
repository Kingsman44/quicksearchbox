package com.google.android.libraries.assistant.auto.ondevice.p714f;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13461c;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13537m;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13540p;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13541q;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.f.f */
/* compiled from: PG */
public final /* synthetic */ class C11912f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C86124t f38293a;

    public /* synthetic */ C11912f(C86124t tVar) {
        this.f38293a = tVar;
    }

    public final Object apply(Object obj) {
        C86124t tVar = this.f38293a;
        List<BundledMessageNotification> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        ArrayList<C13461c> arrayList2 = new ArrayList<>();
        if (tVar.mo79746e(C90086ek.f250281aF)) {
            arrayList2.add(C13461c.TC_LIB);
        }
        if (tVar.mo79746e(C90086ek.f250279aD)) {
            arrayList2.add(C13461c.HEURISTIC);
        }
        for (BundledMessageNotification bundledMessageNotification : list) {
            C13537m mVar = (C13537m) C13543s.f41500j.createBuilder();
            mVar.copyOnWrite();
            C13543s sVar = (C13543s) mVar.instance;
            sVar.mo21160b();
            for (C13461c number : arrayList2) {
                sVar.f41506g.mo58916g(number.getNumber());
            }
            C13529e eVar = C13529e.TEXT_REPLY;
            mVar.copyOnWrite();
            C13543s sVar2 = (C13543s) mVar.instance;
            eVar.getClass();
            sVar2.mo21159a();
            sVar2.f41503b.mo58916g(eVar.getNumber());
            C58485gu d = bundledMessageNotification.mo84113d();
            ArrayList arrayList3 = new ArrayList();
            int size = d.size();
            for (int i = 0; i < size; i++) {
                MessageNotification messageNotification = (MessageNotification) d.get(i);
                C13540p pVar = (C13540p) C13541q.f41491d.createBuilder();
                String obj2 = messageNotification.f252535E.toString();
                pVar.copyOnWrite();
                obj2.getClass();
                ((C13541q) pVar.instance).f41493a = obj2;
                Object obj3 = messageNotification.f252543t;
                if (obj3 == null) {
                    obj3 = BuildConfig.FLAVOR;
                }
                String obj4 = obj3.toString();
                pVar.copyOnWrite();
                obj4.getClass();
                ((C13541q) pVar.instance).f41494b = obj4;
                long j = messageNotification.f252592m;
                pVar.copyOnWrite();
                ((C13541q) pVar.instance).f41495c = j;
                arrayList3.add((C13541q) pVar.build());
            }
            if (!arrayList3.isEmpty()) {
                mVar.mo21156a(arrayList3);
                arrayList.add((C13543s) mVar.build());
            }
        }
        return arrayList;
    }
}
