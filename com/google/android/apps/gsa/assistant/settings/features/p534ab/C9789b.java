package com.google.android.apps.gsa.assistant.settings.features.p534ab;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.assistant.settings.base.C9499b;
import com.google.android.apps.gsa.assistant.settings.base.C9512n;
import com.google.android.apps.gsa.assistant.settings.p516d.C9525a;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90088em;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ab.b */
/* compiled from: PG */
public final class C9789b extends C9499b {

    /* renamed from: a */
    public static final C59071e f33766a = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.ab.b");

    /* renamed from: b */
    public C9525a f33767b;

    /* renamed from: c */
    public h f33768c;

    /* renamed from: d */
    public C86124t f33769d;

    /* renamed from: e */
    public C28310af f33770e;

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && getActivity() != null) {
            ((C9512n) getActivity()).mo17825E(0, (Intent) null);
        }
    }

    public final void onCreate(Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        C73873e.m108454a(this);
        super.onCreate(bundle);
        mo17778a();
        C9525a aVar = this.f33767b;
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= C89885b.HTTP_VALUE;
        acv.f128961q = true;
        aVar.mo17838c(acu, new C9787a(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        if (this.f33769d.mo79746e(C90088em.f250535b)) {
            this.f33770e.mo33806b(frameLayout, 68197).mo33808a();
        } else {
            C28295m.m52919e(frameLayout, new C28292j(68197));
            C89949q.m146521e(C28285c.m52874a(frameLayout, 61687), false);
        }
        return frameLayout;
    }
}
