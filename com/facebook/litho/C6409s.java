package com.facebook.litho;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1991k;
import androidx.core.p098j.p099a.C1995o;
import androidx.customview.p103b.C2144b;
import com.evernote.android.state.BuildConfig;
import com.facebook.p313c.C6051j;
import java.util.List;

/* renamed from: com.facebook.litho.s */
/* compiled from: PG */
public final class C6409s extends C2144b {

    /* renamed from: b */
    private static final Rect f19003b = new Rect(0, 0, 1, 1);

    /* renamed from: a */
    public C6248ev f19004a;

    /* renamed from: c */
    private final View f19005c;

    /* renamed from: d */
    private final C2061c f19006d = new C6408r(this);

    public C6409s(View view, C6248ev evVar, boolean z, int i) {
        super(view);
        this.f19005c = view;
        this.f19004a = evVar;
        view.setFocusable(z);
        C2043bi.m5551ae(view, i);
    }

    /* renamed from: c */
    private static C6051j m17307c(View view) {
        if (!(view instanceof ComponentHost)) {
            return null;
        }
        ComponentHost componentHost = (ComponentHost) view;
        for (int i = 0; i < componentHost.mo12601a(); i++) {
            C6051j c = componentHost.mo12602c(i);
            if (c != null && ((C6201du) c.f17806d.f17827b).f18345a.mo13155c()) {
                return c;
            }
        }
        return null;
    }

    public final C1995o getAccessibilityNodeProvider(View view) {
        C6051j c = m17307c(this.f19005c);
        if (c == null || !((C6201du) c.f17806d.f17827b).f18345a.f18255e.mo12820ak()) {
            return null;
        }
        return super.getAccessibilityNodeProvider(view);
    }

    /* access modifiers changed from: protected */
    public final int getVirtualViewAt(float f, float f2) {
        C6051j c = m17307c(this.f19005c);
        if (c == null) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        C6407q qVar = ((C6201du) c.f17806d.f17827b).f18345a.f18255e;
        if (qVar.mo12831av() != 0) {
            Rect bounds = ((Drawable) c.f17803a).getBounds();
            int au = qVar.mo12830au(((int) f) - bounds.left, ((int) f2) - bounds.top);
            if (au >= 0) {
                return au;
            }
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }

    /* access modifiers changed from: protected */
    public final void getVisibleVirtualViews(List list) {
        C6051j c = m17307c(this.f19005c);
        if (c != null) {
            int av = ((C6201du) c.f17806d.f17827b).f18345a.f18255e.mo12831av();
            for (int i = 0; i < av; i++) {
                list.add(Integer.valueOf(i));
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C1991k kVar) {
        C6051j c = m17307c(this.f19005c);
        C6248ev evVar = this.f19004a;
        if (evVar != null && evVar.mo13106w() != null) {
            C6154cb w = evVar.mo13106w();
            C2061c cVar = this.f19006d;
            C6349gb.m17045a();
            if (C6153ca.f18190h == null) {
                C6153ca.f18190h = new C6250ex();
            }
            C6250ex exVar = C6153ca.f18190h;
            exVar.f18467a = view;
            exVar.f18468b = kVar;
            exVar.f18469c = cVar;
            w.f18197b.mo13127l().mo12795N(w, C6153ca.f18190h);
            C6250ex exVar2 = C6153ca.f18190h;
            exVar2.f18467a = null;
            exVar2.f18468b = null;
            exVar2.f18469c = null;
        } else if (c != null) {
            super.onInitializeAccessibilityNodeInfo(view, kVar);
            ((C6201du) c.f17806d.f17827b).f18345a.f18255e.mo12834az(view, kVar);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, kVar);
        }
        C6248ev evVar2 = this.f19004a;
        if (!(evVar2 == null || evVar2.mo13037G() == null)) {
            kVar.f5921a.setClassName(evVar2.mo13037G());
        }
        C6248ev evVar3 = this.f19004a;
        if (!(evVar3 == null || evVar3.mo13034D() == null)) {
            kVar.mo5158f(evVar3.mo13034D());
            if (this.f19004a.mo13037G() == null) {
                kVar.f5921a.setClassName(BuildConfig.FLAVOR);
            }
        }
        C6248ev evVar4 = this.f19004a;
        if (evVar4 != null && evVar4.mo13091h() != 0) {
            boolean z = true;
            if (evVar4.mo13091h() != 1) {
                z = false;
            }
            kVar.f5921a.setHeading(z);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onPerformActionForVirtualView$ar$ds(int i, int i2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription(BuildConfig.FLAVOR);
    }

    /* access modifiers changed from: protected */
    public final void onPopulateNodeForVirtualView(int i, C1991k kVar) {
        C6051j c = m17307c(this.f19005c);
        if (c == null) {
            Log.e("ComponentAccessibility", "No accessible mount item found for view: ".concat(String.valueOf(String.valueOf(this.f19005c))));
            kVar.f5921a.setContentDescription(BuildConfig.FLAVOR);
            kVar.f5921a.setBoundsInParent(f19003b);
            return;
        }
        Rect bounds = ((Drawable) c.f17803a).getBounds();
        C6407q qVar = ((C6201du) c.f17806d.f17827b).f18345a.f18255e;
        kVar.f5921a.setClassName(qVar.getClass().getName());
        if (i >= qVar.mo12831av()) {
            Log.e("ComponentAccessibility", "Received unrecognized virtual view id: " + i);
            kVar.f5921a.setContentDescription(BuildConfig.FLAVOR);
            kVar.f5921a.setBoundsInParent(f19003b);
            return;
        }
        qVar.mo12807aA(kVar, i, bounds.left, bounds.top);
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C6248ev evVar = this.f19004a;
        if (evVar == null || evVar.mo13100q() == null) {
            return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        C6154cb q = evVar.mo13100q();
        C2061c cVar = this.f19006d;
        C6349gb.m17045a();
        if (C6153ca.f18188f == null) {
            C6153ca.f18188f = new C6130bk();
        }
        C6130bk bkVar = C6153ca.f18188f;
        bkVar.f18145a = view;
        bkVar.f18146b = accessibilityEvent;
        bkVar.f18147c = cVar;
        Object N = q.f18197b.mo13127l().mo12795N(q, C6153ca.f18188f);
        C6130bk bkVar2 = C6153ca.f18188f;
        bkVar2.f18145a = null;
        bkVar2.f18146b = null;
        bkVar2.f18147c = null;
        return N != null && ((Boolean) N).booleanValue();
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C6248ev evVar = this.f19004a;
        if (evVar == null || evVar.mo13105v() == null) {
            this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
            return;
        }
        C6154cb v = evVar.mo13105v();
        C2061c cVar = this.f19006d;
        C6349gb.m17045a();
        if (C6153ca.f18189g == null) {
            C6153ca.f18189g = new C6249ew();
        }
        C6249ew ewVar = C6153ca.f18189g;
        ewVar.f18464a = view;
        ewVar.f18465b = accessibilityEvent;
        ewVar.f18466c = cVar;
        v.f18197b.mo13127l().mo12795N(v, C6153ca.f18189g);
        C6249ew ewVar2 = C6153ca.f18189g;
        ewVar2.f18464a = null;
        ewVar2.f18465b = null;
        ewVar2.f18466c = null;
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C6248ev evVar = this.f19004a;
        if (evVar == null || evVar.mo13107x() == null) {
            this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
            return;
        }
        C6154cb x = evVar.mo13107x();
        C2061c cVar = this.f19006d;
        C6349gb.m17045a();
        if (C6153ca.f18191i == null) {
            C6153ca.f18191i = new C6251ey();
        }
        C6251ey eyVar = C6153ca.f18191i;
        eyVar.f18470a = view;
        eyVar.f18471b = accessibilityEvent;
        eyVar.f18472c = cVar;
        x.f18197b.mo13127l().mo12795N(x, C6153ca.f18191i);
        C6251ey eyVar2 = C6153ca.f18191i;
        eyVar2.f18470a = null;
        eyVar2.f18471b = null;
        eyVar2.f18472c = null;
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C6248ev evVar = this.f19004a;
        if (evVar == null || evVar.mo13108y() == null) {
            return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        C6154cb y = evVar.mo13108y();
        C2061c cVar = this.f19006d;
        C6349gb.m17045a();
        if (C6153ca.f18192j == null) {
            C6153ca.f18192j = new C6252ez();
        }
        C6252ez ezVar = C6153ca.f18192j;
        ezVar.f18473a = viewGroup;
        ezVar.f18474b = view;
        ezVar.f18475c = accessibilityEvent;
        ezVar.f18476d = cVar;
        Object N = y.f18197b.mo13127l().mo12795N(y, C6153ca.f18192j);
        C6252ez ezVar2 = C6153ca.f18192j;
        ezVar2.f18473a = null;
        ezVar2.f18474b = null;
        ezVar2.f18475c = null;
        ezVar2.f18476d = null;
        return N != null && ((Boolean) N).booleanValue();
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        C6248ev evVar = this.f19004a;
        if (evVar == null || evVar.mo13109z() == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        C6154cb z = evVar.mo13109z();
        C2061c cVar = this.f19006d;
        C6349gb.m17045a();
        if (C6153ca.f18193k == null) {
            C6153ca.f18193k = new C6262fe();
        }
        C6262fe feVar = C6153ca.f18193k;
        feVar.f18499a = view;
        feVar.f18500b = i;
        feVar.f18501c = bundle;
        feVar.f18502d = cVar;
        Object N = z.f18197b.mo13127l().mo12795N(z, C6153ca.f18193k);
        C6262fe feVar2 = C6153ca.f18193k;
        feVar2.f18499a = null;
        feVar2.f18500b = 0;
        feVar2.f18501c = null;
        feVar2.f18502d = null;
        if (N == null || !((Boolean) N).booleanValue()) {
            return false;
        }
        return true;
    }

    public final void sendAccessibilityEvent(View view, int i) {
        C6248ev evVar = this.f19004a;
        if (evVar == null || evVar.mo13031A() == null) {
            this.mOriginalDelegate.sendAccessibilityEvent(view, i);
            return;
        }
        C6154cb A = evVar.mo13031A();
        C2061c cVar = this.f19006d;
        C6349gb.m17045a();
        if (C6153ca.f18194l == null) {
            C6153ca.f18194l = new C6271fn();
        }
        C6271fn fnVar = C6153ca.f18194l;
        fnVar.f18521a = view;
        fnVar.f18522b = i;
        fnVar.f18523c = cVar;
        A.f18197b.mo13127l().mo12795N(A, C6153ca.f18194l);
        C6271fn fnVar2 = C6153ca.f18194l;
        fnVar2.f18521a = null;
        fnVar2.f18522b = 0;
        fnVar2.f18523c = null;
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        C6248ev evVar = this.f19004a;
        if (evVar == null || evVar.mo13032B() == null) {
            this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            return;
        }
        C6154cb B = evVar.mo13032B();
        C2061c cVar = this.f19006d;
        C6349gb.m17045a();
        if (C6153ca.f18195m == null) {
            C6153ca.f18195m = new C6272fo();
        }
        C6272fo foVar = C6153ca.f18195m;
        foVar.f18524a = view;
        foVar.f18525b = accessibilityEvent;
        foVar.f18526c = cVar;
        B.f18197b.mo13127l().mo12795N(B, C6153ca.f18195m);
        C6272fo foVar2 = C6153ca.f18195m;
        foVar2.f18524a = null;
        foVar2.f18525b = null;
        foVar2.f18526c = null;
    }
}
