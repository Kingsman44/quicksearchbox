package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88511e;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.ArgumentContainerView;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93524ab;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93545aw;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93602cz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* compiled from: PG */
public class InteractiveArgumentContainerView extends ArgumentContainerView implements C73867g {

    /* renamed from: g */
    private static final C59071e f285754g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.immersiveactions.InteractiveArgumentContainerView");

    public InteractiveArgumentContainerView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C60870cx mo65343a(C90931ca caVar) {
        if (getChildCount() == 0) {
            C59104x d = f285754g.mo56226d();
            d.mo56378ag(C58975e.f156826a, "InterArgContainerView");
            ((C59052c) ((C59052c) d).mo56372aa(20784)).mo56386p("getActionCardHistoryProto: no subviews!");
            return null;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof C73867g) {
            return ((C73867g) childAt).mo65343a(caVar);
        }
        C59104x d2 = f285754g.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "InterArgContainerView");
        ((C59052c) ((C59052c) d2).mo56372aa(20783)).mo56389s("getActionCardHistoryProto: not persistable action card = %s", childAt);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C93524ab mo87847h(C88511e eVar) {
        if (this.f260983a == null) {
            Context context = getContext();
            LayoutInflater f = mo87845f();
            C93602cz czVar = this.f260986d;
            czVar.getClass();
            C93545aw awVar = this.f260987e;
            awVar.getClass();
            this.f260983a = new C102419i(context, f, this, eVar, czVar, awVar);
        }
        return this.f260983a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo87852m(int i) {
        return i == 5;
    }

    public InteractiveArgumentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InteractiveArgumentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
