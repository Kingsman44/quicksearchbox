package com.google.android.apps.gsa.staticplugins.p7706ct;

import android.os.ConditionVariable;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84448o;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84453t;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90139r;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.libraries.gcoreclient.p1805x.p1807b.p1808a.C21729c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.grammar.pumpkin.C66528t;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.b */
/* compiled from: PG */
public final class C98532b extends C66528t {

    /* renamed from: a */
    private static final C59071e f275132a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ct.b");

    /* renamed from: b */
    private final C68214a f275133b;

    /* renamed from: c */
    private final C118827a f275134c;

    /* renamed from: d */
    private final C68214a f275135d;

    /* renamed from: e */
    private final C118831d f275136e;

    public C98532b(C68214a aVar, C118827a aVar2, C68214a aVar3) {
        this.f275133b = aVar;
        this.f275134c = aVar2;
        this.f275136e = aVar2.mo77944g(C118569b.PUMPKIN_USER_VALIDATOR_GET_POSTERIOR_LATENCY, C118575h.PUMPKIN_VALIDATOR_ADDRESS);
        this.f275135d = aVar3;
    }

    /* renamed from: a */
    public final float mo59673a(String str) {
        if (!((C86124t) this.f275135d.mo27525b()).mo79746e(C90139r.f251856d)) {
            return 0.0f;
        }
        C89949q.m146523g(1196);
        long a = this.f275136e.mo104019a();
        C58833ax axVar = (C58833ax) this.f275133b.mo27525b();
        if (!axVar.mo56113h()) {
            ((C59052c) ((C59052c) f275132a.mo56225c()).mo56372aa(30770)).mo56386p("Could not get Icing connection");
            return 0.0f;
        }
        C84425ag agVar = (C84425ag) axVar.mo56107c();
        C90748e.m148224b();
        ConditionVariable conditionVariable = new ConditionVariable();
        ArrayList<C21729c> arrayList = new ArrayList<>();
        agVar.mo77997c();
        agVar.f229721d.mo28212l("blockingAnnotate", new C84448o(agVar, str, new int[]{2}, arrayList, conditionVariable));
        agVar.f229721d.mo28212l("maybeDisconnect", new C84453t(agVar));
        conditionVariable.block();
        arrayList.size();
        float f = 0.0f;
        for (C21729c cVar : arrayList) {
            if (cVar.f60036a.f394487a == 2) {
                f = C98555y.m163249a(str);
            }
        }
        C118837d.m197250d(this.f275136e, a);
        if (Float.compare(f, 0.0f) > 0) {
            this.f275134c.mo77944g(C118569b.PUMPKIN_ADDRESS_VALIDATOR_SUCCESS_COUNT, C118575h.PUMPKIN_VALIDATOR_ADDRESS).mo104025g(1);
        } else {
            this.f275134c.mo77944g(C118569b.PUMPKIN_ADDRESS_VALIDATOR_FAILURE_COUNT, C118575h.PUMPKIN_VALIDATOR_ADDRESS).mo104025g(1);
        }
        return f;
    }
}
