package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23227x;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.bn */
/* compiled from: PG */
final class C104731bn implements C23227x {

    /* renamed from: a */
    private static final C59071e f291715a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.bn");

    /* renamed from: b */
    private final LinearLayout f291716b;

    public C104731bn(LinearLayout linearLayout) {
        this.f291716b = linearLayout;
    }

    /* renamed from: a */
    public final void mo28670a(int i, C22939d dVar) {
        if (!dVar.mo28294af()) {
            C59104x c = f291715a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FullCardRChildCBacks");
            ((C59052c) ((C59052c) c).mo56372aa(22040)).mo56389s("onChildInserted: Type %s is missing view.", dVar.mo28292ad().f63478c);
            return;
        }
        this.f291716b.addView(dVar.mo28297il(), i);
    }

    /* renamed from: b */
    public final void mo28671b(int i, int i2, C22939d dVar) {
        if (!dVar.mo28294af()) {
            C59104x c = f291715a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FullCardRChildCBacks");
            ((C59052c) ((C59052c) c).mo56372aa(22041)).mo56389s("onChildMoved: Type %s is missing view.", dVar.mo28292ad().f63478c);
            return;
        }
        View childAt = this.f291716b.getChildAt(i);
        this.f291716b.removeViewAt(i);
        this.f291716b.addView(childAt, i2);
    }

    /* renamed from: c */
    public final void mo28672c(int i, C22939d dVar) {
        if (!dVar.mo28294af()) {
            C59104x c = f291715a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FullCardRChildCBacks");
            ((C59052c) ((C59052c) c).mo56372aa(22042)).mo56389s("onChildRemoved: Type %s is missing view.", dVar.mo28292ad().f63478c);
            return;
        }
        this.f291716b.removeViewAt(i);
    }
}
