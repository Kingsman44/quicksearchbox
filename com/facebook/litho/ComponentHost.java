package com.facebook.litho;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p098j.C2043bi;
import androidx.p060c.C0985o;
import com.facebook.litho.p325d.C6180a;
import com.facebook.p313c.C6032c;
import com.facebook.p313c.C6040e;
import com.facebook.p313c.C6051j;
import com.facebook.p313c.p316c.C6034b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.p1729h.C21215m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class ComponentHost extends C6040e implements C6034b, C6167co {

    /* renamed from: j */
    private static boolean f17841j = false;

    /* renamed from: a */
    public C0985o f17842a;

    /* renamed from: b */
    public SparseArray f17843b;

    /* renamed from: c */
    public C6410t f17844c;

    /* renamed from: d */
    public C6092ac f17845d;

    /* renamed from: e */
    public C6412v f17846e;

    /* renamed from: f */
    public C6093ad f17847f;

    /* renamed from: g */
    public C6154cb f17848g;

    /* renamed from: h */
    public int f17849h;

    /* renamed from: i */
    public boolean f17850i;

    /* renamed from: k */
    private C0985o f17851k;

    /* renamed from: l */
    private C0985o f17852l;

    /* renamed from: m */
    private C0985o f17853m;

    /* renamed from: n */
    private C0985o f17854n;

    /* renamed from: o */
    private C0985o f17855o;

    /* renamed from: p */
    private ArrayList f17856p;

    /* renamed from: q */
    private CharSequence f17857q;

    /* renamed from: r */
    private final C6413w f17858r;

    /* renamed from: s */
    private int[] f17859s;

    /* renamed from: t */
    private boolean f17860t;

    /* renamed from: u */
    private boolean f17861u;

    /* renamed from: v */
    private C6409s f17862v;

    /* renamed from: w */
    private boolean f17863w;

    /* renamed from: x */
    private C6132bm f17864x;

    /* renamed from: y */
    private C6352ge f17865y;

    public ComponentHost(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private final void m15641A(View view) {
        this.f17860t = true;
        if (this.f17861u) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: B */
    private final void m15642B(C6185de deVar) {
        if (deVar.mo13155c() && deVar.f18255e.mo12820ak()) {
            this.f17850i = true;
        }
        mo12679h();
        if (mo12601a() == 0) {
            this.f17850i = false;
        }
    }

    /* renamed from: s */
    private static String m15643s(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "unknown" : "hw" : "sw" : "none";
    }

    /* renamed from: t */
    private final void mo12749t() {
        if (this.f17856p == null) {
            this.f17856p = new ArrayList();
        }
    }

    /* renamed from: u */
    private final void mo12649u() {
        if (this.f17854n == null) {
            this.f17854n = new C0985o(10);
        }
    }

    /* renamed from: v */
    private final void m15646v() {
        if (this.f17842a == null) {
            this.f17842a = new C0985o(10);
        }
    }

    /* renamed from: w */
    private final void m15647w() {
        if (this.f17852l == null) {
            this.f17852l = new C0985o(10);
        }
    }

    /* renamed from: x */
    private final void m15648x(int i, C6051j jVar) {
        if (this.f17865y != null && !equals(jVar.f17803a)) {
            C6352ge geVar = this.f17865y;
            C0985o oVar = geVar.f18796b;
            if (oVar == null || ((C6351gd) oVar.mo3726e(i)) == null) {
                geVar.f18795a.mo3731j(i);
            } else {
                geVar.f18796b.mo3731j(i);
            }
        }
    }

    /* renamed from: y */
    private final void mo12753y() {
        C0985o oVar = this.f17851k;
        if (oVar != null && oVar.mo3725d() == 0) {
            this.f17851k = null;
        }
        C0985o oVar2 = this.f17853m;
        if (oVar2 != null && oVar2.mo3725d() == 0) {
            this.f17853m = null;
        }
    }

    /* renamed from: z */
    private final void m15650z(Drawable drawable) {
        C6349gb.m17045a();
        drawable.setCallback((Drawable.Callback) null);
        invalidate(drawable.getBounds());
        mo12753y();
    }

    /* renamed from: a */
    public final int mo12601a() {
        C0985o oVar = this.f17842a;
        if (oVar == null) {
            return 0;
        }
        return oVar.mo3725d();
    }

    @Deprecated
    public final void addView(View view) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    /* renamed from: b */
    public final C6132bm mo12667b() {
        return this.f17864x;
    }

    /* renamed from: c */
    public final C6051j mo12602c(int i) {
        return (C6051j) this.f17842a.mo3727f(i);
    }

    /* renamed from: d */
    public final List mo12668d() {
        int i;
        CharSequence E;
        ArrayList arrayList = new ArrayList();
        C0985o oVar = this.f17854n;
        if (oVar == null) {
            i = 0;
        } else {
            i = oVar.mo3725d();
        }
        for (int i2 = 0; i2 < i; i2++) {
            C6248ev evVar = ((C6201du) ((C6051j) this.f17854n.mo3727f(i2)).f17806d.f17827b).f18345a.f18253c;
            if (!(evVar == null || (E = evVar.mo13035E()) == null)) {
                arrayList.add(E);
            }
        }
        CharSequence charSequence = this.f17857q;
        if (charSequence != null) {
            arrayList.add(charSequence);
        }
        return arrayList;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C6409s sVar = this.f17862v;
        return (sVar != null && this.f17850i && sVar.dispatchHoverEvent(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C6132bm bmVar = this.f17864x;
        if (bmVar != null) {
            bmVar.mo13114a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C0985o oVar = this.f17854n;
        if (oVar == null) {
            i = 0;
        } else {
            i = oVar.mo3725d();
        }
        for (int i2 = 0; i2 < i; i2++) {
            C6051j jVar = (C6051j) this.f17854n.mo3727f(i2);
            C6185de deVar = ((C6201du) jVar.f17806d.f17827b).f18345a;
            C6563y.m17863b(this, (Drawable) jVar.f17803a, deVar.f18257g, deVar.f18253c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Map mo12673e(int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("uptimeMs", Long.valueOf(SystemClock.uptimeMillis()));
        hashMap.put("identity", Integer.toHexString(System.identityHashCode(this)));
        hashMap.put("width", Integer.valueOf(i));
        hashMap.put("height", Integer.valueOf(i2));
        hashMap.put("layerType", m15643s(getLayerType()));
        Map[] mapArr = new Map[mo12601a()];
        for (int i3 = 0; i3 < mo12601a(); i3++) {
            C6051j c = mo12602c(i3);
            Object obj = c.f17803a;
            C6185de deVar = ((C6201du) c.f17806d.f17827b).f18345a;
            Rect rect = new Rect();
            deVar.mo13156e(rect);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("class", obj.getClass().getName());
            hashMap2.put("identity", Integer.toHexString(System.identityHashCode(obj)));
            if (obj instanceof View) {
                hashMap2.put("layerType", m15643s(((View) obj).getLayerType()));
            }
            hashMap2.put("left", Integer.valueOf(rect.left));
            hashMap2.put("right", Integer.valueOf(rect.right));
            hashMap2.put("top", Integer.valueOf(rect.top));
            hashMap2.put("bottom", Integer.valueOf(rect.bottom));
            mapArr[i3] = hashMap2;
        }
        hashMap.put("mountItems", mapArr);
        StringBuilder sb = new StringBuilder();
        for (ViewParent viewParent = this; viewParent != null; viewParent = viewParent.getParent()) {
            sb.append(viewParent.getClass().getName());
            sb.append(',');
            if ((viewParent instanceof LithoView) && !hashMap.containsKey("lithoViewDimens")) {
                LithoView lithoView = (LithoView) viewParent;
                int width = lithoView.getWidth();
                int height = lithoView.getHeight();
                hashMap.put("lithoViewDimens", "(" + width + ", " + height + ")");
            }
        }
        hashMap.put("ancestors", sb.toString());
        return hashMap;
    }

    /* renamed from: f */
    public final void mo12595f(C6051j jVar) {
        mo12749t();
        if (this.f17856p.remove(jVar)) {
            Object obj = jVar.f17803a;
            if (obj instanceof Drawable) {
                m15650z((Drawable) obj);
            } else if (obj instanceof View) {
                m15641A((View) obj);
                this.f17860t = true;
            }
            m15642B(((C6201du) jVar.f17806d.f17827b).f18345a);
            return;
        }
        throw new RuntimeException("Tried to remove non-existent disappearing item, transitionId: ".concat(String.valueOf(String.valueOf(((C6201du) jVar.f17806d.f17827b).f18345a.f18260j))));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo12674g(C6403m mVar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f17842a.mo3725d(); i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(true != ((C6051j) this.f17842a.mo3727f(i)).f17805c ? "unbound" : "bound");
        }
        mVar.mo13414b("mMountItems.size(): %d", Integer.valueOf(this.f17842a.mo3725d()));
        mVar.mo13414b("mViewMountItems.size(): %d", Integer.valueOf(this.f17852l.mo3725d()));
        mVar.mo13414b("mDrawableMountItems.size(): %d", Integer.valueOf(this.f17854n.mo3725d()));
        mVar.mo13414b("mDisappearingItems.size(): %d", Integer.valueOf(this.f17856p.size()));
        mVar.mo13414b("mInLayout: %b", Boolean.valueOf(this.f17861u));
        mVar.mo13414b("mMountItems.boundState: %s", sb);
        mVar.mo13414b("mSkippedUnboundItems: %d", Integer.valueOf(this.f17849h));
    }

    public final CharSequence getContentDescription() {
        return this.f17857q;
    }

    public final Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.f17843b;
        if (sparseArray == null || (obj = sparseArray.get(i)) == null) {
            return super.getTag(i);
        }
        return obj;
    }

    public TextContent getTextContent() {
        List list;
        m15646v();
        C0985o oVar = this.f17842a;
        int d = oVar.mo3725d();
        if (d == 1) {
            list = Collections.singletonList(((C6051j) oVar.mo3727f(0)).f17803a);
        } else {
            ArrayList arrayList = new ArrayList(d);
            for (int i = 0; i < d; i++) {
                arrayList.add(((C6051j) oVar.mo3727f(i)).f17803a);
            }
            list = arrayList;
        }
        return C6563y.m17862a(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo12679h() {
        C6409s sVar;
        if (this.f17863w && this.f17850i && (sVar = this.f17862v) != null) {
            sVar.invalidateRoot();
        }
    }

    public final boolean hasOverlappingRendering() {
        if (C6180a.f18244k && getWidth() > 0 && getHeight() > 0 && getWidth() <= C6180a.f18246m && getHeight() <= C6180a.f18246m) {
            return super.hasOverlappingRendering();
        }
        return false;
    }

    /* renamed from: i */
    public final void mo12603i(int i, C6051j jVar) {
        mo12681j(i, jVar, jVar.f17806d.f17829d);
    }

    /* renamed from: j */
    public final void mo12681j(int i, C6051j jVar, Rect rect) {
        Object obj = jVar.f17803a;
        C6185de deVar = ((C6201du) jVar.f17806d.f17827b).f18345a;
        boolean z = false;
        boolean z2 = true;
        if (obj instanceof Drawable) {
            C6349gb.m17045a();
            mo12649u();
            this.f17854n.mo3730i(i, jVar);
            Drawable drawable = (Drawable) jVar.f17803a;
            C6185de deVar2 = ((C6201du) jVar.f17806d.f17827b).f18345a;
            if (getVisibility() != 0) {
                z2 = false;
            }
            drawable.setVisible(z2, false);
            drawable.setCallback(this);
            if (jVar.f17807e instanceof C6198dr) {
                C6563y.m17863b(this, drawable, deVar2.f18257g, deVar2.f18253c);
            }
            invalidate(rect);
        } else if (obj instanceof View) {
            m15647w();
            this.f17852l.mo3730i(i, jVar);
            View view = (View) obj;
            int i2 = deVar.f18257g;
            view.setDuplicateParentStateEnabled(C6185de.m16311d(i2));
            if (view instanceof ComponentHost) {
                ComponentHost componentHost = (ComponentHost) view;
                if ((i2 & 16) == 16) {
                    z = true;
                }
                componentHost.setAddStatesFromChildren(z);
            }
            this.f17860t = true;
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(generateDefaultLayoutParams());
            }
            if (this.f17861u) {
                super.addViewInLayout(view, -1, view.getLayoutParams(), true);
            } else {
                super.addView(view, -1, view.getLayoutParams());
            }
            C6383hh hhVar = ((C6201du) jVar.f17806d.f17827b).f18345a.f18254d;
            if (!(hhVar == null || hhVar.mo13399a() == null)) {
                Object obj2 = jVar.f17803a;
                if (!equals(obj2)) {
                    if (this.f17865y == null) {
                        C6352ge geVar = new C6352ge(this);
                        this.f17865y = geVar;
                        setTouchDelegate(geVar);
                    }
                    this.f17865y.f18795a.mo3730i(i, new C6351gd((View) obj2, jVar));
                }
            }
        }
        m15646v();
        this.f17842a.mo3730i(i, jVar);
        m15642B(deVar);
    }

    public final void jumpDrawablesToCurrentState() {
        int i;
        super.jumpDrawablesToCurrentState();
        C0985o oVar = this.f17854n;
        if (oVar == null) {
            i = 0;
        } else {
            i = oVar.mo3725d();
        }
        for (int i2 = 0; i2 < i; i2++) {
            ((Drawable) ((C6051j) this.f17854n.mo3727f(i2)).f17803a).jumpToCurrentState();
        }
    }

    /* renamed from: l */
    public final void mo12683l(boolean z) {
        if (z != this.f17863w) {
            C6409s sVar = null;
            if (z && this.f17862v == null) {
                this.f17862v = new C6409s(this, (C6248ev) null, isFocusable(), C2043bi.m5575d(this));
            }
            if (z) {
                sVar = this.f17862v;
            }
            C2043bi.m5526T(this, sVar);
            this.f17863w = z;
            if (z) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof ComponentHost) {
                        ((ComponentHost) childAt).mo12683l(true);
                    } else {
                        C6248ev evVar = (C6248ev) childAt.getTag(R.id.component_node_info);
                        if (evVar != null) {
                            C2043bi.m5526T(childAt, new C6409s(childAt, evVar, childAt.isFocusable(), C2043bi.m5575d(childAt)));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo12684m(C6132bm bmVar) {
        this.f17864x = bmVar;
    }

    /* renamed from: n */
    public final void mo12596n(C6051j jVar) {
        C0985o oVar = this.f17842a;
        int c = oVar.mo3723c(oVar.mo3722b(jVar));
        Object obj = jVar.f17803a;
        if (obj instanceof Drawable) {
            mo12649u();
            C6563y.m17865d(c, this.f17854n, this.f17855o);
        } else if (obj instanceof View) {
            m15647w();
            C6563y.m17865d(c, this.f17852l, this.f17853m);
            this.f17860t = true;
            m15648x(c, jVar);
        }
        m15646v();
        C6563y.m17865d(c, this.f17842a, this.f17851k);
        mo12753y();
        mo12749t();
        this.f17856p.add(jVar);
    }

    /* renamed from: o */
    public final void mo12605o(C6051j jVar) {
        m15646v();
        C0985o oVar = this.f17842a;
        mo12606p(oVar.mo3723c(oVar.mo3722b(jVar)), jVar);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C6154cb cbVar = this.f17848g;
        if (cbVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        C6349gb.m17045a();
        if (C6153ca.f18187e == null) {
            C6153ca.f18187e = new C6177cy();
        }
        C6177cy cyVar = C6153ca.f18187e;
        cyVar.f18224b = motionEvent;
        cyVar.f18223a = this;
        Object N = cbVar.f18197b.mo13127l().mo12795N(cbVar, C6153ca.f18187e);
        C6177cy cyVar2 = C6153ca.f18187e;
        cyVar2.f18224b = null;
        cyVar2.f18223a = null;
        return N != null && ((Boolean) N).booleanValue();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f17861u = true;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        String str = null;
        if (i6 <= 0 || i5 <= 0) {
            boolean z2 = C6180a.f18234a;
        } else if (i6 >= C6180a.f18245l || i5 >= C6180a.f18245l) {
            str = "TextureTooBig";
        }
        if (str != null) {
            mo12673e(i5, i6);
            C6032c.m15511a().mo12568c(C6106aq.m15890a(2), "abnormally sized litho layout (" + i5 + ", " + i6 + ")");
        }
        mo12690r(i, i2, i3, i4);
        this.f17861u = false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        C6349gb.m17045a();
        if (isEnabled()) {
            C0985o oVar = this.f17854n;
            if (oVar == null) {
                i = 0;
            } else {
                i = oVar.mo3725d();
            }
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                C6051j jVar = (C6051j) this.f17854n.mo3727f(i);
                Object obj = jVar.f17803a;
                if ((obj instanceof C6353gf) && (((C6201du) jVar.f17806d.f17827b).f18345a.f18257g & 2) != 2) {
                    C6353gf gfVar = (C6353gf) obj;
                    if (gfVar.mo13195d(motionEvent) && gfVar.mo13194c(motionEvent, this)) {
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void mo12606p(int i, C6051j jVar) {
        Object obj = jVar.f17803a;
        if (obj instanceof Drawable) {
            mo12649u();
            m15650z((Drawable) obj);
            C6563y.m17865d(i, this.f17854n, this.f17855o);
        } else if (obj instanceof View) {
            m15641A((View) obj);
            m15647w();
            C6563y.m17865d(i, this.f17852l, this.f17853m);
            this.f17860t = true;
            m15648x(i, jVar);
        }
        m15646v();
        C6563y.m17865d(i, this.f17842a, this.f17851k);
        mo12753y();
        m15642B(((C6201du) jVar.f17806d.f17827b).f18345a);
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        CharSequence charSequence;
        if (i != 512) {
            if (i == 256) {
                i = 256;
            }
            return super.performAccessibilityAction(i, bundle);
        }
        if (!TextUtils.isEmpty(this.f17857q)) {
            charSequence = this.f17857q;
        } else if (!mo12668d().isEmpty()) {
            charSequence = TextUtils.join(", ", mo12668d());
        } else {
            charSequence = !getTextContent().getTextItems().isEmpty() ? TextUtils.join(", ", getTextContent().getTextItems()) : null;
        }
        if (charSequence == null) {
            return false;
        }
        this.f17857q = charSequence;
        super.setContentDescription(charSequence);
        return super.performAccessibilityAction(i, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo12689q() {
        return !this.f17861u;
    }

    /* renamed from: r */
    public void mo12690r(int i, int i2, int i3, int i4) {
    }

    @Deprecated
    public final void removeAllViewsInLayout() {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final void removeDetachedView(View view, boolean z) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void removeView(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void removeViewAt(int i) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void removeViewInLayout(View view) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void removeViews(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    @Deprecated
    public final void removeViewsInLayout(int i, int i2) {
        throw new UnsupportedOperationException("Removing Views manually within LithoViews is not supported");
    }

    public final void requestLayout() {
        ViewParent viewParent = this;
        while (viewParent instanceof ComponentHost) {
            if (((ComponentHost) viewParent).mo12689q()) {
                viewParent = viewParent.getParent();
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public final void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        super.setAccessibilityDelegate(accessibilityDelegate);
        this.f17863w = false;
    }

    public final void setAlpha(float f) {
        if (!(f == 0.0f || f == 1.0f || (getWidth() < C6180a.f18247n && getHeight() < C6180a.f18247n))) {
            if (!f17841j) {
                f17841j = true;
                int width = getWidth();
                int height = getHeight();
                C6106aq.m15891b(2, "PartialAlphaTextureTooBig", "Partial alpha (" + f + ") with large view (" + width + ", " + height + ")");
            } else {
                return;
            }
        }
        super.setAlpha(f);
    }

    public final void setContentDescription(CharSequence charSequence) {
        this.f17857q = charSequence;
        if (!TextUtils.isEmpty(charSequence) && C2043bi.m5575d(this) == 0) {
            C2043bi.m5551ae(this, 1);
        }
        mo12679h();
    }

    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (i == R.id.component_node_info && obj != null) {
            mo12683l(C6067a.m15729b(getContext()));
            C6409s sVar = this.f17862v;
            if (sVar != null) {
                sVar.f19004a = (C6248ev) obj;
            }
        }
    }

    public final void setVisibility(int i) {
        int i2;
        C6349gb.m17045a();
        super.setVisibility(i);
        C0985o oVar = this.f17854n;
        if (oVar == null) {
            i2 = 0;
        } else {
            i2 = oVar.mo3725d();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ((Drawable) ((C6051j) this.f17854n.mo3727f(i3)).f17803a).setVisible(i == 0, false);
        }
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public ComponentHost(Context context, AttributeSet attributeSet) {
        this(new C6411u(context, (String) null, (C21215m) null, (C6381hf) null), attributeSet);
    }

    @Deprecated
    public final void addView(View view, int i) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        C6413w wVar = this.f17858r;
        wVar.f19023a = canvas;
        int i3 = 0;
        wVar.f19024b = 0;
        C0985o oVar = wVar.f19026d.f17842a;
        if (oVar == null) {
            i = 0;
        } else {
            i = oVar.mo3725d();
        }
        wVar.f19025c = i;
        try {
            super.dispatchDraw(canvas);
            if (this.f17858r.mo13478b()) {
                this.f17858r.mo13477a();
            }
            this.f17858r.f19023a = null;
            ArrayList arrayList = this.f17856p;
            if (arrayList == null) {
                i2 = 0;
            } else {
                i2 = arrayList.size();
            }
            while (i3 < i2) {
                Object obj = ((C6051j) this.f17856p.get(i3)).f17803a;
                if (obj instanceof Drawable) {
                    ((Drawable) obj).draw(canvas);
                }
                i3++;
            }
            boolean z = C6180a.f18234a;
        } catch (C6196dp e) {
            int a = mo12601a();
            StringBuilder sb = new StringBuilder("[");
            while (i3 < a) {
                C6051j jVar = (C6051j) this.f17842a.mo3726e(i3);
                sb.append(jVar != null ? ((C6201du) jVar.f17806d.f17827b).f18345a.f18255e.mo13461q() : "null");
                if (i3 < a - 1) {
                    sb.append(", ");
                } else {
                    sb.append("]");
                }
                i3++;
            }
            e.f18337c.put("component_names_from_mount_items", sb.toString());
            throw e;
        }
    }

    @Deprecated
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("Adding Views manually within LithoViews is not supported");
    }

    public ComponentHost(C6411u uVar) {
        this(uVar, (AttributeSet) null);
    }

    public ComponentHost(C6411u uVar, AttributeSet attributeSet) {
        super(uVar.f19009b, attributeSet);
        this.f17858r = new C6413w(this);
        this.f17859s = new int[0];
        this.f17863w = false;
        this.f17849h = 0;
        this.f17850i = false;
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        mo12683l(C6067a.m15729b(uVar.f19009b));
        this.f17842a = new C0985o(10);
        this.f17852l = new C0985o(10);
        this.f17854n = new C0985o(10);
        this.f17856p = new ArrayList();
    }

    /* renamed from: k */
    public final void mo12604k(C6051j jVar, int i, int i2) {
        C6352ge geVar;
        C6383hh hhVar = ((C6201du) jVar.f17806d.f17827b).f18345a.f18254d;
        if (!(hhVar == null || hhVar.mo13399a() == null || (geVar = this.f17865y) == null)) {
            if (geVar.f18795a.mo3726e(i2) != null) {
                if (geVar.f18796b == null) {
                    geVar.f18796b = new C0985o(4);
                }
                C6563y.m17866e(i2, geVar.f18795a, geVar.f18796b);
            }
            C6563y.m17864c(i, i2, geVar.f18795a, geVar.f18796b);
            C0985o oVar = geVar.f18796b;
            if (oVar != null && oVar.mo3725d() == 0) {
                geVar.f18796b = null;
            }
        }
        Object obj = jVar.f17803a;
        m15647w();
        if (obj instanceof Drawable) {
            C6349gb.m17045a();
            mo12649u();
            if (this.f17854n.mo3726e(i2) != null) {
                if (this.f17855o == null) {
                    this.f17855o = new C0985o(4);
                }
                C6563y.m17866e(i2, this.f17854n, this.f17855o);
            }
            C6563y.m17864c(i, i2, this.f17854n, this.f17855o);
            invalidate();
            mo12753y();
        } else if (obj instanceof View) {
            this.f17860t = true;
            if (this.f17852l.mo3726e(i2) != null) {
                if (this.f17853m == null) {
                    this.f17853m = new C0985o(4);
                }
                C6563y.m17866e(i2, this.f17852l, this.f17853m);
            }
            C6563y.m17864c(i, i2, this.f17852l, this.f17853m);
        }
        m15646v();
        if (this.f17842a.mo3726e(i2) != null) {
            if (this.f17851k == null) {
                this.f17851k = new C0985o(4);
            }
            C6563y.m17866e(i2, this.f17842a, this.f17851k);
        }
        C6563y.m17864c(i, i2, this.f17842a, this.f17851k);
        mo12753y();
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i, int i2) {
        int i3;
        int i4;
        if (this.f17860t) {
            int childCount = getChildCount();
            if (this.f17859s.length < childCount) {
                this.f17859s = new int[(childCount + 5)];
            }
            C0985o oVar = this.f17852l;
            if (oVar == null) {
                i3 = 0;
            } else {
                i3 = oVar.mo3725d();
            }
            int i5 = 0;
            int i6 = 0;
            while (i5 < i3) {
                this.f17859s[i6] = indexOfChild((View) ((C6051j) this.f17852l.mo3727f(i5)).f17803a);
                i5++;
                i6++;
            }
            ArrayList arrayList = this.f17856p;
            if (arrayList == null) {
                i4 = 0;
            } else {
                i4 = arrayList.size();
            }
            for (int i7 = 0; i7 < i4; i7++) {
                Object obj = ((C6051j) this.f17856p.get(i7)).f17803a;
                if (obj instanceof View) {
                    this.f17859s[i6] = indexOfChild((View) obj);
                    i6++;
                }
            }
            this.f17860t = false;
        }
        if (this.f17858r.mo13478b()) {
            this.f17858r.mo13477a();
        }
        return this.f17859s[i2];
    }
}
