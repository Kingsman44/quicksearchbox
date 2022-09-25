package com.facebook.litho;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.core.p098j.p099a.C1984d;
import com.facebook.litho.p325d.C6180a;
import com.facebook.p313c.C6050i;
import com.facebook.p313c.C6051j;
import com.facebook.p313c.C6054m;
import com.facebook.p313c.C6064w;
import com.facebook.p313c.p314a.C6021a;
import com.facebook.p313c.p314a.C6022b;
import com.facebook.p313c.p315b.C6026b;
import com.facebook.p313c.p316c.C6033a;
import com.facebook.p313c.p318e.C6044d;
import com.google.android.libraries.elements.p1729h.C21215m;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* compiled from: PG */
public class LithoView extends ComponentHost implements C6064w, C6033a {

    /* renamed from: x */
    private static final String f17924x = "LithoView";

    /* renamed from: y */
    private static final int[] f17925y = new int[2];

    /* renamed from: A */
    private boolean f17926A;

    /* renamed from: B */
    private boolean f17927B;

    /* renamed from: C */
    private int f17928C;

    /* renamed from: D */
    private int f17929D;

    /* renamed from: E */
    private final Rect f17930E;

    /* renamed from: F */
    private final AccessibilityManager f17931F;

    /* renamed from: G */
    private final C6204dx f17932G;

    /* renamed from: H */
    private boolean f17933H;

    /* renamed from: j */
    public boolean f17934j;

    /* renamed from: k */
    public final boolean f17935k;

    /* renamed from: l */
    public final boolean f17936l;

    /* renamed from: m */
    public final C6050i f17937m;

    /* renamed from: n */
    public ComponentTree f17938n;

    /* renamed from: o */
    public final C6239em f17939o;

    /* renamed from: p */
    public final C6411u f17940p;

    /* renamed from: q */
    public final Rect f17941q;

    /* renamed from: r */
    public boolean f17942r;

    /* renamed from: s */
    public C6227ea f17943s;

    /* renamed from: t */
    public ComponentTree f17944t;

    /* renamed from: u */
    public int f17945u;

    /* renamed from: v */
    public C6206dz f17946v;

    /* renamed from: w */
    public C6194dn f17947w;

    /* renamed from: z */
    private boolean f17948z;

    public LithoView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: E */
    public static void m15699E(View view, C6403m mVar) {
        mVar.mo13414b(view.getClass().getSimpleName(), new Object[0]);
        mVar.mo13413a();
        view.getGlobalVisibleRect(new Rect());
        mVar.mo13414b("View.getVisibility(): %d", Integer.valueOf(view.getVisibility()));
        mVar.mo13414b("View.rect: [%.2f, %.2f, %d, %d]", Float.valueOf(view.getX()), Float.valueOf(view.getY()), Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
        if (view instanceof LithoView) {
            ((LithoView) view).mo12674g(mVar);
        } else if (view instanceof ComponentHost) {
            ((ComponentHost) view).mo12674g(mVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m15699E(viewGroup.getChildAt(i), mVar);
            }
        }
        mVar.mo13416d();
    }

    /* renamed from: J */
    private static int m15700J(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i) - i2), mode);
    }

    /* renamed from: L */
    private final void m15702L() {
        if (!this.f17948z) {
            this.f17948z = true;
            ComponentTree componentTree = this.f17938n;
            if (componentTree != null) {
                componentTree.mo12713h();
            }
            mo12683l(C6067a.m15729b(getContext()));
            AccessibilityManager accessibilityManager = this.f17931F;
            C6204dx dxVar = this.f17932G;
            if (dxVar != null) {
                accessibilityManager.addAccessibilityStateChangeListener(new C1984d(dxVar));
            }
            if (!mo12732F() && !mo12733G() && !mo12734H()) {
                mo12749t();
            }
        }
    }

    /* renamed from: M */
    private final void m15703M() {
        ComponentTree componentTree;
        if (this.f17948z) {
            this.f17948z = false;
            if (!mo12732F() && (componentTree = this.f17938n) != null && !componentTree.f17910m) {
                mo12751w(new Rect());
            }
            if (this.f17935k) {
                this.f17937m.mo12635p();
                C6194dn dnVar = this.f17947w;
                if (dnVar != null) {
                    int size = dnVar.f18327a.size();
                    for (int i = 0; i < size; i++) {
                        C6022b bVar = (C6022b) dnVar.f18327a.get(i);
                        C6021a j = dnVar.f18328b.mo12631j(bVar);
                        if (j != null) {
                            bVar.mo12579f(j);
                        }
                    }
                }
            } else {
                C6239em emVar = this.f17939o;
                C6349gb.m17045a();
                emVar.mo13221A();
            }
            ComponentTree componentTree2 = this.f17938n;
            if (componentTree2 != null) {
                componentTree2.mo12716k();
            }
            AccessibilityManager accessibilityManager = this.f17931F;
            C6204dx dxVar = this.f17932G;
            if (dxVar != null) {
                accessibilityManager.removeAccessibilityStateChangeListener(new C1984d(dxVar));
            }
        }
    }

    /* renamed from: N */
    private final void m15704N() {
        if (this.f17938n != null && (getParent() instanceof View)) {
            int width = ((View) getParent()).getWidth();
            int height = ((View) getParent()).getHeight();
            int translationX = (int) getTranslationX();
            int translationY = (int) getTranslationY();
            int top = getTop() + translationY;
            int bottom = getBottom() + translationY;
            int left = getLeft();
            int right = getRight() + translationX;
            Rect rect = this.f17941q;
            if (left + translationX < 0 || top < 0 || right > width || bottom > height || rect.left < 0 || rect.top < 0 || rect.right > width || rect.bottom > height || rect.width() != getWidth() || rect.height() != getHeight()) {
                Rect rect2 = new Rect();
                if (getLocalVisibleRect(rect2)) {
                    mo12593v(rect2, true);
                }
            }
        }
    }

    /* renamed from: O */
    private static void m15705O(ComponentHost componentHost) {
        int childCount = componentHost.getChildCount();
        if (childCount != 0) {
            View[] viewArr = new View[childCount];
            for (int i = 0; i < childCount; i++) {
                viewArr[i] = componentHost.getChildAt(i);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View view = viewArr[i2];
                if (view.getParent() == componentHost) {
                    if (view.isLayoutRequested()) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
                        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    }
                    if (view instanceof ComponentHost) {
                        m15705O((ComponentHost) view);
                    }
                }
            }
        }
    }

    /* renamed from: P */
    private final void m15706P(boolean z) {
        ArrayList arrayList;
        int i = 0;
        if (this.f17935k) {
            C6050i iVar = this.f17937m;
            arrayList = new ArrayList();
            int a = iVar.mo12627a();
            while (i < a) {
                Object k = iVar.mo12632k(i);
                if (k instanceof C6169cq) {
                    ((C6169cq) k).mo13143a(arrayList);
                }
                i++;
            }
        } else {
            C6239em emVar = this.f17939o;
            arrayList = new ArrayList();
            while (i < emVar.f18435a.mo3675c()) {
                C6051j jVar = (C6051j) emVar.f18435a.mo3678e(emVar.f18435a.mo3677d(i));
                if (jVar != null) {
                    Object obj = jVar.f17803a;
                    if (obj instanceof C6169cq) {
                        ((C6169cq) obj).mo13143a(arrayList);
                    }
                }
                i++;
            }
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((LithoView) arrayList.get(size)).mo12735I(z);
            } else {
                return;
            }
        }
    }

    /* renamed from: A */
    public final void mo12592A(int i) {
        this.f17928C = i;
        requestLayout();
    }

    /* renamed from: B */
    public final void mo12729B(ComponentTree componentTree) {
        C6194dn dnVar;
        C6021a j;
        C6349gb.m17045a();
        if (!this.f17926A) {
            this.f17944t = null;
            ComponentTree componentTree2 = this.f17938n;
            if (componentTree2 != componentTree) {
                this.f17927B = componentTree2 == null || componentTree == null || componentTree2.f17875F != componentTree.f17875F;
                mo12730C();
                if (this.f17938n != null) {
                    boolean z = C6180a.f18234a;
                    m15701K();
                    if (!this.f17935k || (dnVar = this.f17947w) == null) {
                        this.f17939o.mo13232o();
                    } else {
                        C6380he heVar = dnVar.f18331e;
                        if (!(heVar == null || (j = dnVar.f18328b.mo12631j(heVar)) == null)) {
                            dnVar.f18331e.mo13396h(j);
                        }
                    }
                    if (componentTree != null) {
                        componentTree.getLithoView();
                    }
                    if (this.f17948z) {
                        this.f17938n.mo12716k();
                    }
                    ComponentTree componentTree3 = this.f17938n;
                    C6349gb.m17045a();
                    if (!componentTree3.f17912o) {
                        componentTree3.f17914q = null;
                        componentTree3.f17903f = null;
                    } else {
                        throw new IllegalStateException("Clearing the LithoView while the ComponentTree is attached");
                    }
                }
                if (componentTree != null && !this.f17935k) {
                    this.f17939o.f18456v = 0;
                }
                this.f17938n = componentTree;
                if (this.f17927B && this.f17935k) {
                    if (this.f17947w == null) {
                        C6194dn dnVar2 = new C6194dn(this.f17937m);
                        this.f17947w = dnVar2;
                        C6050i iVar = this.f17937m;
                        if (dnVar2.f18330d == null) {
                            dnVar2.f18330d = C6044d.f17773a;
                            iVar.mo12639w(dnVar2.f18330d);
                            C6021a j2 = dnVar2.f18328b.mo12631j(dnVar2.f18330d);
                            if (j2 != null) {
                                C6044d.m15544j(j2, this);
                            }
                            dnVar2.mo13166a(dnVar2.f18330d);
                            C6050i iVar2 = this.f17937m;
                            if (iVar2 != null) {
                                C6194dn dnVar3 = this.f17947w;
                                if (dnVar3.f18331e == null) {
                                    dnVar3.f18331e = C6380he.f18885a;
                                    iVar2.mo12639w(dnVar3.f18331e);
                                    dnVar3.mo13166a(dnVar3.f18331e);
                                    if (C6180a.f18235b) {
                                        C6194dn dnVar4 = this.f17947w;
                                        C6050i iVar3 = this.f17937m;
                                        if (dnVar4.f18332f == null) {
                                            dnVar4.f18332f = new C6141bv(iVar3);
                                            dnVar4.mo13166a(dnVar4.f18332f);
                                        } else {
                                            throw new IllegalStateException("End to end test processing has already been enabled on this coordinator");
                                        }
                                    }
                                    if (this.f17936l) {
                                        C6194dn dnVar5 = this.f17947w;
                                        if (dnVar5.f18334h == null) {
                                            dnVar5.f18334h = C6229ec.f18407a;
                                            dnVar5.f18328b.mo12639w(dnVar5.f18334h);
                                            dnVar5.mo13166a(dnVar5.f18334h);
                                        } else {
                                            throw new IllegalStateException("View attributes extension has already been enabled on this coordinator");
                                        }
                                    }
                                    C6194dn dnVar6 = this.f17947w;
                                    if (dnVar6.f18333g == null) {
                                        dnVar6.f18333g = C6136bq.f18156a;
                                        dnVar6.f18328b.mo12639w(dnVar6.f18333g);
                                        dnVar6.mo13166a(dnVar6.f18333g);
                                    }
                                } else {
                                    throw new IllegalStateException("Transitions have already been enabled on this coordinator.");
                                }
                            } else {
                                throw new IllegalStateException("Cannot enable transitions extension or incremental mount extension without a MountDelegateTarget.");
                            }
                        } else {
                            throw new IllegalStateException("Visibility processing has already been enabled on this coordinator");
                        }
                    }
                    if (componentTree != null) {
                        if (componentTree.f17910m) {
                            C6194dn dnVar7 = this.f17947w;
                            C6050i iVar4 = this.f17937m;
                            if (dnVar7.f18329c == null) {
                                dnVar7.f18329c = this.f17936l ^ true ? C6026b.f17751b : C6026b.f17750a;
                                iVar4.mo12639w(dnVar7.f18329c);
                                dnVar7.mo13166a(dnVar7.f18329c);
                            }
                        } else {
                            C6194dn dnVar8 = this.f17947w;
                            C6026b bVar = dnVar8.f18329c;
                            if (bVar != null) {
                                dnVar8.f18328b.mo12625E(bVar);
                                dnVar8.f18327a.remove(dnVar8.f18329c);
                                dnVar8.f18329c = null;
                            }
                        }
                    }
                }
                ComponentTree componentTree4 = this.f17938n;
                if (componentTree4 == null) {
                    return;
                }
                if (!componentTree4.mo12723s()) {
                    C6349gb.m17045a();
                    LithoView lithoView = componentTree4.f17914q;
                    if (lithoView != this) {
                        if (lithoView != null) {
                            lithoView.mo12729B((ComponentTree) null);
                        } else if (componentTree4.f17912o) {
                            componentTree4.mo12716k();
                        }
                        Context context = componentTree4.f17907j.f19009b;
                        if (context != context.getApplicationContext()) {
                            if (C6107ar.m15892a(getContext()) != C6107ar.m15892a(componentTree4.f17907j.f19009b)) {
                                String valueOf = String.valueOf(getContext());
                                String valueOf2 = String.valueOf(componentTree4.f17907j.f19009b);
                                throw new IllegalArgumentException("Base view context differs, view context is: " + valueOf + ", ComponentTree context is: " + valueOf2);
                            }
                        }
                        componentTree4.f17914q = this;
                        componentTree4.f17903f = null;
                    }
                    if (this.f17948z) {
                        this.f17938n.mo12713h();
                    } else {
                        requestLayout();
                    }
                } else {
                    throw new IllegalStateException("Setting a released ComponentTree to a LithoView, released component was: ".concat(String.valueOf(componentTree4.mo12708d())));
                }
            } else if (this.f17948z) {
                mo12752x();
            }
        } else {
            throw new RuntimeException("Cannot update ComponentTree while in the middle of measure");
        }
    }

    /* renamed from: D */
    public final void mo12731D() {
        if (this.f17935k) {
            this.f17937m.mo12624C();
            C6194dn dnVar = this.f17947w;
            if (dnVar != null) {
                int size = dnVar.f18327a.size();
                for (int i = 0; i < size; i++) {
                    C6022b bVar = (C6022b) dnVar.f18327a.get(i);
                    C6021a j = dnVar.f18328b.mo12631j(bVar);
                    if (j != null) {
                        bVar.mo12580g(j);
                    }
                }
            }
        } else {
            this.f17939o.mo12624C();
        }
        this.f17941q.setEmpty();
    }

    /* renamed from: F */
    public final boolean mo12732F() {
        ComponentTree componentTree = this.f17938n;
        return componentTree != null && componentTree.f17910m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean mo12733G() {
        if (this.f17935k) {
            return this.f17934j;
        }
        C6239em emVar = this.f17939o;
        C6349gb.m17045a();
        return emVar.f18438d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final boolean mo12734H() {
        if (this.f17935k) {
            return this.f17937m.mo12626H();
        }
        C6239em emVar = this.f17939o;
        C6349gb.m17045a();
        return emVar.f18440f;
    }

    /* renamed from: I */
    public final void mo12735I(boolean z) {
        C6349gb.m17045a();
        if (this.f17938n == null) {
            return;
        }
        if (z) {
            if (getLocalVisibleRect(this.f17930E)) {
                mo12751w(this.f17930E);
            }
            m15706P(true);
            return;
        }
        m15706P(false);
        m15701K();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r4) {
        /*
            r3 = this;
            int r0 = r3.getPaddingLeft()     // Catch:{ all -> 0x0018 }
            float r0 = (float) r0     // Catch:{ all -> 0x0018 }
            int r1 = r3.getPaddingTop()     // Catch:{ all -> 0x0018 }
            float r1 = (float) r1     // Catch:{ all -> 0x0018 }
            r4.translate(r0, r1)     // Catch:{ all -> 0x0018 }
            super.draw(r4)     // Catch:{ all -> 0x0018 }
            com.facebook.litho.ea r4 = r3.f17943s     // Catch:{ all -> 0x0022 }
            if (r4 == 0) goto L_0x0017
            r4.mo13191a()     // Catch:{ all -> 0x0022 }
        L_0x0017:
            return
        L_0x0018:
            r4 = move-exception
            com.facebook.litho.dp r0 = new com.facebook.litho.dp     // Catch:{ all -> 0x0022 }
            com.facebook.litho.ComponentTree r1 = r3.f17938n     // Catch:{ all -> 0x0022 }
            r2 = 0
            r0.<init>(r2, r1, r4)     // Catch:{ all -> 0x0022 }
            throw r0     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Map mo12673e(int i, int i2) {
        Map e = super.mo12673e(i, i2);
        ComponentTree componentTree = this.f17938n;
        if (componentTree == null) {
            e.put("lithoView", (Object) null);
            return e;
        }
        HashMap hashMap = new HashMap();
        e.put("lithoView", hashMap);
        if (componentTree.mo12706a() == null) {
            hashMap.put("root", (Object) null);
            return e;
        }
        hashMap.put("root", componentTree.mo12706a().mo13461q());
        hashMap.put("tree", C6102am.m15872a(componentTree.f17907j));
        return e;
    }

    public Deque findTestItems(String str) {
        if (this.f17935k) {
            C6194dn dnVar = this.f17947w;
            if (dnVar == null) {
                return new LinkedList();
            }
            C6141bv bvVar = dnVar.f18332f;
            if (bvVar != null) {
                Deque deque = (Deque) bvVar.f18169a.get(str);
                return deque == null ? new LinkedList() : deque;
            }
            throw new IllegalStateException("Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false.");
        }
        Map map = this.f17939o.f18437c;
        if (map != null) {
            Deque deque2 = (Deque) map.get(str);
            return deque2 == null ? new LinkedList() : deque2;
        }
        throw new UnsupportedOperationException("Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo12674g(C6403m mVar) {
        boolean z = true;
        mVar.mo13414b("mIsAttached: %b", Boolean.valueOf(this.f17948z));
        mVar.mo13414b("mForceLayout: %b", Boolean.valueOf(this.f17942r));
        mVar.mo13414b("mSuppressMeasureComponentTree: %b", false);
        mVar.mo13414b("mIsMeasuring: %b", Boolean.valueOf(this.f17926A));
        mVar.mo13414b("mHasNewComponentTree: %b", Boolean.valueOf(this.f17927B));
        mVar.mo13414b("mTemporaryDetachedComponent: %b", this.f17944t);
        mVar.mo13414b("mDoMeasureInLayout: %b", Boolean.valueOf(this.f17933H));
        mVar.mo13414b("mIsMountStateDirty: %b", Boolean.valueOf(this.f17934j));
        super.mo12674g(mVar);
        C6239em emVar = this.f17939o;
        if (emVar != null) {
            mVar.mo13414b("MountState", new Object[0]);
            mVar.mo13413a();
            mVar.mo13414b("mIsDirty: %b", Boolean.valueOf(emVar.f18438d));
            mVar.mo13414b("mIsMounting: %b", Boolean.valueOf(emVar.f18439e));
            mVar.mo13414b("mNeedsRemount: %b", Boolean.valueOf(emVar.f18440f));
            mVar.mo13414b("mIsBound: %b", false);
            mVar.mo13416d();
        }
        ComponentTree componentTree = this.f17938n;
        if (componentTree != null) {
            mVar.mo13415c(ComponentTree.f17868a);
            mVar.mo13413a();
            mVar.mo13414b("mReleased: %b", Boolean.valueOf(componentTree.f17901d));
            mVar.mo13414b("mIsMounting: %b", Boolean.valueOf(componentTree.f17908k));
            mVar.mo13414b("mIncrementalMountEnabled: %b", Boolean.valueOf(componentTree.f17910m));
            mVar.mo13414b("mIsAttached: %b", Boolean.valueOf(componentTree.f17912o));
            mVar.mo13414b("mHasMounted: %b", Boolean.valueOf(componentTree.f17918u));
            mVar.mo13414b("mWidthSpec: %d", Integer.valueOf(componentTree.f17923z));
            mVar.mo13414b("mHeightSpec: %d", Integer.valueOf(componentTree.f17870A));
            mVar.mo13414b("mWidthSpec: %d", Integer.valueOf(componentTree.f17923z));
            mVar.mo13414b("mIsMereing: %b", Boolean.valueOf(componentTree.f17909l));
            Object[] objArr = new Object[1];
            objArr[0] = Boolean.valueOf(componentTree.f17871B == null);
            mVar.mo13414b("mMainThreadLayoutState == null: %b", objArr);
            Object[] objArr2 = new Object[1];
            objArr2[0] = Boolean.valueOf(componentTree.f17872C == null);
            mVar.mo13414b("mCommittedLayoutState == null: %b", objArr2);
            C6187dg dgVar = componentTree.f17872C;
            if (dgVar != null) {
                C6181da daVar = dgVar.f18310o;
                Object[] objArr3 = new Object[1];
                if (daVar != null) {
                    z = false;
                }
                objArr3[0] = Boolean.valueOf(z);
                mVar.mo13414b("layoutRoot == null: %b", objArr3);
                if (daVar != null) {
                    daVar.mo12924aW(mVar);
                }
            }
            mVar.mo13416d();
        }
    }

    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        m15704N();
    }

    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        m15704N();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m15702L();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m15703M();
    }

    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m15702L();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        com.facebook.litho.C6133bn.f18151a = 1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            android.content.res.Resources r0 = r9.getResources()     // Catch:{ all -> 0x0176 }
            android.content.Context r1 = r9.getContext()     // Catch:{ all -> 0x0176 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x0176 }
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x0176 }
            r3 = 1
            if (r2 != 0) goto L_0x0014
            goto L_0x0053
        L_0x0014:
            byte r4 = com.facebook.litho.C6133bn.f18151a     // Catch:{ all -> 0x0176 }
            r5 = 2
            if (r4 != 0) goto L_0x0029
            java.lang.String r4 = "org.chromium.arc.device_management"
            boolean r1 = r1.hasSystemFeature(r4)     // Catch:{ RuntimeException -> 0x0027 }
            if (r3 == r1) goto L_0x0023
            r1 = 1
            goto L_0x0024
        L_0x0023:
            r1 = 2
        L_0x0024:
            com.facebook.litho.C6133bn.f18151a = r1     // Catch:{ RuntimeException -> 0x0027 }
            goto L_0x0029
        L_0x0027:
            com.facebook.litho.C6133bn.f18151a = r3     // Catch:{ all -> 0x0176 }
        L_0x0029:
            android.content.res.Configuration r1 = r0.getConfiguration()     // Catch:{ all -> 0x0176 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ all -> 0x0176 }
            float r4 = r0.density     // Catch:{ all -> 0x0176 }
            int r1 = r1.screenWidthDp     // Catch:{ all -> 0x0176 }
            float r1 = (float) r1     // Catch:{ all -> 0x0176 }
            byte r6 = com.facebook.litho.C6133bn.f18151a     // Catch:{ all -> 0x0176 }
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r6 != r5) goto L_0x0041
            float r0 = r1 * r4
            float r0 = r0 + r7
            int r0 = (int) r0     // Catch:{ all -> 0x0176 }
            goto L_0x0043
        L_0x0041:
            int r0 = r0.widthPixels     // Catch:{ all -> 0x0176 }
        L_0x0043:
            float r4 = r4 * r1
            float r4 = r4 + r7
            int r1 = (int) r4     // Catch:{ all -> 0x0176 }
            if (r0 == r1) goto L_0x0053
            int r4 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x0176 }
            if (r1 != r4) goto L_0x0053
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)     // Catch:{ all -> 0x0176 }
        L_0x0053:
            int r0 = r9.f17928C     // Catch:{ all -> 0x0176 }
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L_0x0062
            int r0 = r9.f17929D     // Catch:{ all -> 0x0176 }
            if (r0 == r2) goto L_0x005f
            r0 = -1
            goto L_0x0062
        L_0x005f:
            r0 = -1
            r4 = 0
            goto L_0x0063
        L_0x0062:
            r4 = 1
        L_0x0063:
            if (r0 != r2) goto L_0x0069
            int r0 = r9.getWidth()     // Catch:{ all -> 0x0176 }
        L_0x0069:
            int r5 = r9.f17929D     // Catch:{ all -> 0x0176 }
            if (r5 != r2) goto L_0x0071
            int r5 = r9.getHeight()     // Catch:{ all -> 0x0176 }
        L_0x0071:
            r9.f17928C = r2     // Catch:{ all -> 0x0176 }
            r9.f17929D = r2     // Catch:{ all -> 0x0176 }
            if (r4 == 0) goto L_0x0082
            boolean r4 = r9.mo12733G()     // Catch:{ all -> 0x0176 }
            if (r4 == 0) goto L_0x007e
            goto L_0x0082
        L_0x007e:
            r9.setMeasuredDimension(r0, r5)     // Catch:{ all -> 0x0176 }
            return
        L_0x0082:
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()     // Catch:{ all -> 0x0176 }
            boolean r6 = r4 instanceof com.facebook.litho.C6205dy     // Catch:{ all -> 0x0176 }
            if (r6 == 0) goto L_0x009b
            com.facebook.litho.dy r4 = (com.facebook.litho.C6205dy) r4     // Catch:{ all -> 0x0176 }
            int r6 = r4.mo13170b()     // Catch:{ all -> 0x0176 }
            if (r6 == r2) goto L_0x0093
            r10 = r6
        L_0x0093:
            int r4 = r4.mo13169a()     // Catch:{ all -> 0x0176 }
            if (r4 != r2) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r11 = r4
        L_0x009b:
            int r4 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x0176 }
            int r6 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x0176 }
            com.facebook.litho.ComponentTree r7 = r9.f17944t     // Catch:{ all -> 0x0176 }
            if (r7 == 0) goto L_0x00b1
            com.facebook.litho.ComponentTree r8 = r9.f17938n     // Catch:{ all -> 0x0176 }
            if (r8 != 0) goto L_0x00b1
            r9.mo12729B(r7)     // Catch:{ all -> 0x0176 }
            r7 = 0
            r9.f17944t = r7     // Catch:{ all -> 0x0176 }
        L_0x00b1:
            boolean r7 = r9.f17942r     // Catch:{ all -> 0x0176 }
            if (r7 != 0) goto L_0x00ca
            int r7 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x0176 }
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 != r8) goto L_0x00ca
            int r7 = android.view.View.MeasureSpec.getMode(r11)     // Catch:{ all -> 0x0176 }
            if (r7 == r8) goto L_0x00c4
            goto L_0x00ca
        L_0x00c4:
            r9.f17933H = r3     // Catch:{ all -> 0x0176 }
            r9.setMeasuredDimension(r4, r6)     // Catch:{ all -> 0x0176 }
            return
        L_0x00ca:
            r9.f17926A = r3     // Catch:{ all -> 0x0176 }
            com.facebook.litho.ComponentTree r7 = r9.f17938n     // Catch:{ all -> 0x0176 }
            if (r7 == 0) goto L_0x00f9
            boolean r4 = r9.f17942r     // Catch:{ all -> 0x0176 }
            r9.f17942r = r1     // Catch:{ all -> 0x0176 }
            int r6 = r9.getPaddingRight()     // Catch:{ all -> 0x0176 }
            int r8 = r9.getPaddingLeft()     // Catch:{ all -> 0x0176 }
            int r6 = r6 + r8
            int r10 = m15700J(r10, r6)     // Catch:{ all -> 0x0176 }
            int r6 = r9.getPaddingTop()     // Catch:{ all -> 0x0176 }
            int r8 = r9.getPaddingBottom()     // Catch:{ all -> 0x0176 }
            int r6 = r6 + r8
            int r11 = m15700J(r11, r6)     // Catch:{ all -> 0x0176 }
            int[] r6 = f17925y     // Catch:{ all -> 0x0176 }
            r7.mo12718m(r10, r11, r6, r4)     // Catch:{ all -> 0x0176 }
            r4 = r6[r1]     // Catch:{ all -> 0x0176 }
            r6 = r6[r3]     // Catch:{ all -> 0x0176 }
            r9.f17933H = r1     // Catch:{ all -> 0x0176 }
        L_0x00f9:
            if (r6 != 0) goto L_0x0106
            com.facebook.litho.ComponentTree r10 = r9.f17938n     // Catch:{ all -> 0x0176 }
            if (r10 == 0) goto L_0x0105
            com.facebook.litho.dg r10 = r10.f17871B     // Catch:{ all -> 0x0176 }
            if (r10 == 0) goto L_0x0105
            com.facebook.litho.da r10 = r10.f18310o     // Catch:{ all -> 0x0176 }
        L_0x0105:
            r6 = 0
        L_0x0106:
            com.facebook.litho.ComponentTree r10 = r9.f17938n     // Catch:{ all -> 0x0176 }
            if (r10 == 0) goto L_0x016e
            boolean r11 = r9.f17927B     // Catch:{ all -> 0x0176 }
            if (r11 == 0) goto L_0x0112
            boolean r10 = r10.f17918u     // Catch:{ all -> 0x0176 }
            if (r10 != 0) goto L_0x016e
        L_0x0112:
            com.facebook.litho.ComponentTree r10 = r9.f17938n     // Catch:{ all -> 0x0176 }
            com.facebook.litho.C6349gb.m17045a()     // Catch:{ all -> 0x0176 }
            com.facebook.litho.dg r11 = r10.f17871B     // Catch:{ all -> 0x0176 }
            if (r11 == 0) goto L_0x0153
            com.facebook.litho.gt r3 = r11.f18311p     // Catch:{ all -> 0x0176 }
            if (r3 != 0) goto L_0x0120
            goto L_0x0153
        L_0x0120:
            com.facebook.litho.LithoView r10 = r10.f17914q     // Catch:{ all -> 0x0176 }
            boolean r3 = r10.f17935k     // Catch:{ all -> 0x0176 }
            if (r3 == 0) goto L_0x013c
            boolean r3 = r10.f17934j     // Catch:{ all -> 0x0176 }
            if (r3 == 0) goto L_0x0153
            com.facebook.litho.dn r10 = r10.f17947w     // Catch:{ all -> 0x0176 }
            com.facebook.litho.he r3 = r10.f18331e     // Catch:{ all -> 0x0176 }
            if (r3 == 0) goto L_0x0153
            com.facebook.c.i r10 = r10.f18328b     // Catch:{ all -> 0x0176 }
            com.facebook.c.a.a r10 = r10.mo12631j(r3)     // Catch:{ all -> 0x0176 }
            if (r10 == 0) goto L_0x0153
            com.facebook.litho.C6380he.m17100i(r10, r11)     // Catch:{ all -> 0x0176 }
            goto L_0x0153
        L_0x013c:
            com.facebook.litho.em r3 = r10.f17939o     // Catch:{ all -> 0x0176 }
            com.facebook.litho.C6349gb.m17045a()     // Catch:{ all -> 0x0176 }
            boolean r3 = r3.f18438d     // Catch:{ all -> 0x0176 }
            if (r3 == 0) goto L_0x0153
            com.facebook.litho.em r10 = r10.f17939o     // Catch:{ all -> 0x0176 }
            com.facebook.litho.C6349gb.m17045a()     // Catch:{ all -> 0x0176 }
            com.facebook.litho.he r3 = r10.f18454t     // Catch:{ all -> 0x0176 }
            if (r3 == 0) goto L_0x0153
            com.facebook.c.a.a r10 = r10.f18455u     // Catch:{ all -> 0x0176 }
            com.facebook.litho.C6380he.m17100i(r10, r11)     // Catch:{ all -> 0x0176 }
        L_0x0153:
            com.facebook.litho.ComponentTree r10 = r9.f17938n     // Catch:{ all -> 0x0176 }
            boolean r11 = r9.f17927B     // Catch:{ all -> 0x0176 }
            com.facebook.litho.gk r3 = r10.f17920w     // Catch:{ all -> 0x0176 }
            int r10 = r10.mo12728x(r0, r11, r3)     // Catch:{ all -> 0x0176 }
            if (r10 == r2) goto L_0x0160
            r4 = r10
        L_0x0160:
            com.facebook.litho.ComponentTree r10 = r9.f17938n     // Catch:{ all -> 0x0176 }
            boolean r11 = r9.f17927B     // Catch:{ all -> 0x0176 }
            com.facebook.litho.gk r0 = r10.f17921x     // Catch:{ all -> 0x0176 }
            int r10 = r10.mo12728x(r5, r11, r0)     // Catch:{ all -> 0x0176 }
            if (r10 != r2) goto L_0x016d
            goto L_0x016e
        L_0x016d:
            r6 = r10
        L_0x016e:
            r9.setMeasuredDimension(r4, r6)     // Catch:{ all -> 0x0176 }
            r9.f17927B = r1     // Catch:{ all -> 0x0176 }
            r9.f17926A = r1     // Catch:{ all -> 0x0176 }
            return
        L_0x0176:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.LithoView.onMeasure(int, int):void");
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m15703M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final boolean mo12689q() {
        ComponentTree componentTree = this.f17938n;
        if (componentTree == null || !componentTree.f17908k) {
            return super.mo12689q();
        }
        return false;
    }

    /* renamed from: r */
    public final void mo12690r(int i, int i2, int i3, int i4) {
        ComponentTree componentTree = this.f17938n;
        if (componentTree == null) {
            return;
        }
        if (!componentTree.mo12723s()) {
            if (this.f17933H || componentTree.f17871B == null) {
                this.f17938n.mo12718m(View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i3 - i) - getPaddingRight()) - getPaddingLeft()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i4 - i2) - getPaddingTop()) - getPaddingBottom()), 1073741824), f17925y, false);
                this.f17927B = false;
                this.f17933H = false;
            }
            ComponentTree componentTree2 = this.f17938n;
            C6349gb.m17045a();
            boolean t = componentTree2.mo12724t();
            if (t && !mo12732F()) {
                mo12749t();
            }
            if (!t) {
                mo12649u();
            }
            if (!t) {
                m15705O(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("Trying to layout a LithoView holding onto a released ComponentTree");
    }

    /* renamed from: s */
    public final C6050i mo12745s() {
        return this.f17935k ? this.f17937m : this.f17939o;
    }

    public final void setHasTransientState(boolean z) {
        super.setHasTransientState(z);
        if (z) {
            if (this.f17945u == 0 && this.f17938n != null) {
                mo12593v(new Rect(0, 0, getWidth(), getHeight()), false);
            }
            this.f17945u++;
            return;
        }
        int i = this.f17945u - 1;
        this.f17945u = i;
        if (i == 0 && this.f17938n != null) {
            mo12649u();
        }
        if (this.f17945u < 0) {
            this.f17945u = 0;
        }
    }

    public final void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            m15704N();
        }
    }

    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            m15704N();
        }
    }

    /* renamed from: t */
    public final void mo12749t() {
        ComponentTree componentTree = this.f17938n;
        if (componentTree != null && !componentTree.f17910m) {
            mo12751w(new Rect(0, 0, getWidth(), getHeight()));
        }
    }

    public final String toString() {
        return String.valueOf(super.toString()).concat(LithoViewTestHelper.viewToString(this, true));
    }

    /* renamed from: u */
    public final void mo12649u() {
        ComponentTree componentTree = this.f17938n;
        if (componentTree != null && componentTree.f17871B != null) {
            if (!componentTree.f17910m) {
                Rect rect = new Rect();
                if (!getLocalVisibleRect(rect)) {
                    rect.setEmpty();
                }
                mo12751w(rect);
                return;
            }
            componentTree.mo12717l();
        }
    }

    /* renamed from: v */
    public final void mo12593v(Rect rect, boolean z) {
        ComponentTree componentTree = this.f17938n;
        if (componentTree == null) {
            return;
        }
        if (componentTree.f17871B != null) {
            if (componentTree.f17910m) {
                componentTree.mo12719n(rect, z);
            } else if (z) {
                mo12751w(rect);
            }
        } else if (componentTree.f17910m && !isLayoutRequested()) {
            throw new RuntimeException("Trying to incrementally mount a component with a null main thread LayoutState on a LithoView that hasn't requested layout!");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo12751w(Rect rect) {
        C6021a j;
        ComponentTree componentTree = this.f17938n;
        if (componentTree != null && componentTree.f17911n) {
            if (componentTree.f17871B == null) {
                Log.w(f17924x, "Main Thread Layout state is not found");
                return;
            }
            C6194dn dnVar = this.f17947w;
            if (dnVar != null) {
                C6044d dVar = dnVar.f18330d;
                if (!(dVar == null || (j = dnVar.f18328b.mo12631j(dVar)) == null)) {
                    dnVar.f18330d.mo12610i(j, rect);
                }
            } else {
                this.f17939o.mo13226L(rect, mo12733G());
            }
            this.f17941q.set(rect);
        }
    }

    /* renamed from: x */
    public final void mo12752x() {
        if (this.f17935k) {
            this.f17937m.mo12634n();
        } else {
            this.f17939o.mo13234v();
        }
    }

    /* renamed from: y */
    public final void mo12753y() {
        C6349gb.m17045a();
        boolean z = C6180a.f18234a;
        ComponentTree componentTree = this.f17938n;
        if (componentTree != null) {
            componentTree.mo12720o();
            this.f17938n = null;
        }
    }

    /* renamed from: z */
    public final void mo12594z(int i) {
        this.f17929D = i;
        requestLayout();
    }

    public LithoView(Context context, AttributeSet attributeSet) {
        this(new C6411u(context, (String) null, (C21215m) null, (C6381hf) null), attributeSet);
    }

    /* renamed from: K */
    private final void m15701K() {
        C6194dn dnVar;
        if (!this.f17935k || (dnVar = this.f17947w) == null) {
            C6044d.m15543h(this.f17939o.f18452r);
            return;
        }
        C6044d dVar = dnVar.f18330d;
        if (dVar != null) {
            C6044d.m15543h(this.f17937m.mo12631j(dVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo12730C() {
        if (this.f17935k) {
            this.f17934j = true;
        } else {
            C6239em emVar = this.f17939o;
            C6349gb.m17045a();
            emVar.f18438d = true;
            emVar.f18443i.setEmpty();
        }
        this.f17941q.setEmpty();
    }

    public LithoView(C6411u uVar) {
        this(uVar, (AttributeSet) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LithoView(C6411u uVar, AttributeSet attributeSet) {
        this(uVar, attributeSet, false, false);
        boolean z = C6180a.f18234a;
    }

    public LithoView(C6411u uVar, AttributeSet attributeSet, boolean z, boolean z2) {
        super(uVar, attributeSet);
        this.f17941q = new Rect();
        this.f17926A = false;
        this.f17927B = false;
        this.f17928C = -1;
        this.f17929D = -1;
        this.f17930E = new Rect();
        this.f17943s = null;
        this.f17932G = new C6204dx(this);
        this.f17940p = uVar;
        this.f17935k = z;
        this.f17936l = z2;
        if (z) {
            if (z2) {
                this.f17937m = new C6054m(this);
            } else {
                this.f17937m = new C6239em(this);
            }
            this.f17939o = null;
        } else {
            this.f17937m = null;
            this.f17939o = new C6239em(this);
        }
        this.f17931F = (AccessibilityManager) uVar.f19009b.getSystemService("accessibility");
    }

    public LithoView(C6411u uVar, boolean z, boolean z2) {
        this(uVar, (AttributeSet) null, z, z2);
    }
}
