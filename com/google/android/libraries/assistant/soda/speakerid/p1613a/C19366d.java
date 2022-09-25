package com.google.android.libraries.assistant.soda.speakerid.p1613a;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5218j.C67119lt;
import com.google.speech.p5218j.C67121lv;
import com.google.speech.p5218j.C67123lx;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.soda.speakerid.a.d */
/* compiled from: PG */
public final /* synthetic */ class C19366d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C19366d f54203a = new C19366d();

    private /* synthetic */ C19366d() {
    }

    public final Object apply(Object obj) {
        boolean z;
        C67123lx lxVar;
        Iterator it = ((C67119lt) obj).f182460a.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                lxVar = (C67123lx) it.next();
            } else {
                C59104x b = C19372j.f54209a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "SodaEnrollmentClient");
                ((C59052c) ((C59052c) b).mo56372aa(47802)).mo56386p("#hasOnDeviceTdSidUtterances - speaker ID profile does not exist.");
                return false;
            }
        } while (!lxVar.f182466a.equals("0"));
        C67121lv lvVar = lxVar.f182467b;
        if (lvVar == null) {
            lvVar = C67121lv.f182461b;
        }
        int size = lvVar.f182463a.size();
        C59104x b2 = C19372j.f54209a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SodaEnrollmentClient");
        ((C59052c) ((C59052c) b2).mo56372aa(47803)).mo56387q("#hasOnDeviceTdSidUtterances - speaker ID profile exists with %d on-device utterances", size);
        if (size > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
