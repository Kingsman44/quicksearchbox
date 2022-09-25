package com.google.android.libraries.onegoogle.accountmenu.cards;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30872ae;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.au */
/* compiled from: PG */
public final /* synthetic */ class C30366au implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C30373ba f82096a;

    public /* synthetic */ C30366au(C30373ba baVar) {
        this.f82096a = baVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C30373ba baVar = this.f82096a;
        C58833ax axVar = (C58833ax) obj;
        DynamicCardRootView dynamicCardRootView = baVar.f82109c;
        C30897z zVar = baVar.f82108b;
        if (dynamicCardRootView.f82045c && dynamicCardRootView.f82043a.mo56113h() && !dynamicCardRootView.f82044b.equals(axVar)) {
            dynamicCardRootView.f82044b = axVar;
            C58485gu a = dynamicCardRootView.mo35906a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                ((C30872ae) a.get(i)).mo35632lk(zVar);
            }
            dynamicCardRootView.mo35632lk(zVar);
            if (axVar.mo56113h()) {
                zVar.mo35824d(dynamicCardRootView, ((Integer) dynamicCardRootView.f82043a.mo56107c()).intValue(), (C28353e) axVar.mo56107c());
            } else {
                dynamicCardRootView.mo35630b(zVar);
            }
            C58485gu a2 = dynamicCardRootView.mo35906a();
            int size2 = a2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C30872ae) a2.get(i2)).mo35630b(zVar);
            }
            dynamicCardRootView.f82045c = true;
        }
    }
}
