package android.support.p033v7.widget;

import android.util.SparseArray;
import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2061c;
import androidx.customview.p102a.C2140a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.widget.fw */
/* compiled from: PG */
public final class C0661fw {

    /* renamed from: a */
    final ArrayList f2431a;

    /* renamed from: b */
    ArrayList f2432b = null;

    /* renamed from: c */
    final ArrayList f2433c = new ArrayList();

    /* renamed from: d */
    public final List f2434d;

    /* renamed from: e */
    public int f2435e;

    /* renamed from: f */
    int f2436f;

    /* renamed from: g */
    C0660fv f2437g;

    /* renamed from: h */
    final /* synthetic */ RecyclerView f2438h;

    public C0661fw(RecyclerView recyclerView) {
        this.f2438h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2431a = arrayList;
        this.f2434d = Collections.unmodifiableList(arrayList);
        this.f2435e = 2;
        this.f2436f = 2;
    }

    /* renamed from: a */
    public final int mo3024a(int i) {
        if (i < 0 || i >= this.f2438h.mState.mo3052a()) {
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.f2438h.mState.mo3052a() + this.f2438h.exceptionLabel());
        }
        RecyclerView recyclerView = this.f2438h;
        if (!recyclerView.mState.f2462g) {
            return i;
        }
        return recyclerView.mAdapterHelper.mo3284a(i, 0);
    }

    /* renamed from: b */
    public final C0660fv mo3025b() {
        if (this.f2437g == null) {
            this.f2437g = new C0660fv();
            mo3028e();
        }
        return this.f2437g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3026c(C0673gh ghVar, boolean z) {
        RecyclerView.clearNestedRecyclerViewIfNotNested(ghVar);
        View view = ghVar.itemView;
        C0675gj gjVar = this.f2438h.mAccessibilityDelegate;
        if (gjVar != null) {
            C2061c a = gjVar.mo3098a();
            C2043bi.m5526T(view, a instanceof C0674gi ? (C2061c) ((C0674gi) a).f2481b.remove(view) : null);
        }
        if (z) {
            int size = this.f2438h.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                ((C0662fx) this.f2438h.mRecyclerListeners.get(i)).mo3041a();
            }
            C0640fb fbVar = this.f2438h.mAdapter;
            if (fbVar != null) {
                fbVar.onViewRecycled(ghVar);
            }
            RecyclerView recyclerView = this.f2438h;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.mo3269g(ghVar);
            }
        }
        ghVar.mBindingAdapter = null;
        ghVar.mOwnerRecyclerView = null;
        mo3025b().mo3022g(ghVar);
    }

    /* renamed from: d */
    public final void mo3027d() {
        this.f2431a.clear();
        mo3031h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.f2438h;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3028e() {
        /*
            r3 = this;
            android.support.v7.widget.fv r0 = r3.f2437g
            if (r0 == 0) goto L_0x0013
            android.support.v7.widget.RecyclerView r1 = r3.f2438h
            android.support.v7.widget.fb r2 = r1.mAdapter
            if (r2 == 0) goto L_0x0013
            boolean r1 = r1.mIsAttached
            if (r1 == 0) goto L_0x0013
            java.util.Set r0 = r0.f2430c
            r0.add(r2)
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0661fw.mo3028e():void");
    }

    /* renamed from: f */
    public final void mo3029f(C0640fb fbVar, boolean z) {
        C0660fv fvVar = this.f2437g;
        if (fvVar != null) {
            fvVar.f2430c.remove(fbVar);
            if (fvVar.f2430c.size() == 0 && !z) {
                for (int i = 0; i < fvVar.f2428a.size(); i++) {
                    SparseArray sparseArray = fvVar.f2428a;
                    ArrayList arrayList = ((C0659fu) sparseArray.get(sparseArray.keyAt(i))).f2424a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        C2140a.m5939b(((C0673gh) arrayList.get(i2)).itemView);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo3030g(View view) {
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.mScrapContainer = null;
        childViewHolderInt.mInChangeScrap = false;
        childViewHolderInt.clearReturnedFromScrapFlag();
        mo3034k(childViewHolderInt);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo3031h() {
        int size = this.f2433c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            mo3032i(size);
        }
        this.f2433c.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            this.f2438h.mPrefetchRegistry.mo2730b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo3032i(int i) {
        mo3026c((C0673gh) this.f2433c.get(i), true);
        this.f2433c.remove(i);
    }

    /* renamed from: j */
    public final void mo3033j(View view) {
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isTmpDetached()) {
            this.f2438h.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.mScrapContainer.mo3037n(childViewHolderInt);
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        mo3034k(childViewHolderInt);
        if (this.f2438h.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
            this.f2438h.mItemAnimator.mo2687c(childViewHolderInt);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo3034k(C0673gh ghVar) {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        if (ghVar.isScrap() || ghVar.itemView.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(ghVar.isScrap());
            sb.append(" isAttached:");
            if (ghVar.itemView.getParent() == null) {
                z2 = false;
            }
            sb.append(z2);
            sb.append(this.f2438h.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        } else if (ghVar.isTmpDetached()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + ghVar + this.f2438h.exceptionLabel());
        } else if (!ghVar.shouldIgnore()) {
            boolean z4 = (ghVar.mFlags & 16) == 0 && C2043bi.m5568av(ghVar.itemView);
            C0640fb fbVar = this.f2438h.mAdapter;
            if ((fbVar != null && z4 && fbVar.onFailedToRecycleView(ghVar)) || ghVar.isRecyclable()) {
                if (this.f2436f <= 0 || ghVar.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = this.f2433c.size();
                    if (size >= this.f2436f && size > 0) {
                        mo3032i(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !this.f2438h.mPrefetchRegistry.mo2732d(ghVar.mPosition)) {
                        do {
                            size--;
                            if (size < 0) {
                                break;
                            }
                        } while (this.f2438h.mPrefetchRegistry.mo2732d(((C0673gh) this.f2433c.get(size)).mPosition));
                        size++;
                    }
                    this.f2433c.add(size, ghVar);
                    z = true;
                }
                if (!z) {
                    mo3026c(ghVar, true);
                    z3 = z;
                    this.f2438h.mViewInfoStore.mo3269g(ghVar);
                    if (!z3 && !z2 && z4) {
                        C2140a.m5939b(ghVar.itemView);
                        ghVar.mBindingAdapter = null;
                        ghVar.mOwnerRecyclerView = null;
                        return;
                    }
                    return;
                }
                z3 = z;
            }
            z2 = false;
            this.f2438h.mViewInfoStore.mo3269g(ghVar);
            if (!z3) {
            }
        } else {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(this.f2438h.exceptionLabel()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo3035l(View view) {
        C0646fh fhVar;
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.hasAnyOfTheFlags(12) || !childViewHolderInt.isUpdated() || (fhVar = this.f2438h.mItemAnimator) == null || fhVar.mo2694j(childViewHolderInt, childViewHolderInt.getUnmodifiedPayloads())) {
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved()) {
                RecyclerView recyclerView = this.f2438h;
                if (!recyclerView.mAdapter.mHasStableIds) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.exceptionLabel()));
                }
            }
            childViewHolderInt.mScrapContainer = this;
            childViewHolderInt.mInChangeScrap = false;
            this.f2431a.add(childViewHolderInt);
            return;
        }
        if (this.f2432b == null) {
            this.f2432b = new ArrayList();
        }
        childViewHolderInt.mScrapContainer = this;
        childViewHolderInt.mInChangeScrap = true;
        this.f2432b.add(childViewHolderInt);
    }

    /* renamed from: m */
    public final void mo3036m(C0660fv fvVar) {
        mo3029f(this.f2438h.mAdapter, false);
        C0660fv fvVar2 = this.f2437g;
        if (fvVar2 != null) {
            fvVar2.mo3021f();
        }
        this.f2437g = fvVar;
        if (!(fvVar == null || this.f2438h.mAdapter == null)) {
            fvVar.mo3019d();
        }
        mo3028e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo3037n(C0673gh ghVar) {
        if (ghVar.mInChangeScrap) {
            this.f2432b.remove(ghVar);
        } else {
            this.f2431a.remove(ghVar);
        }
        ghVar.mScrapContainer = null;
        ghVar.mInChangeScrap = false;
        ghVar.clearReturnedFromScrapFlag();
    }

    /* renamed from: o */
    public final void mo3038o() {
        C0653fo foVar = this.f2438h.mLayout;
        this.f2436f = this.f2435e + (foVar != null ? foVar.mPrefetchMaxCountObserved : 0);
        int size = this.f2433c.size();
        while (true) {
            size--;
            if (size >= 0 && this.f2433c.size() > this.f2436f) {
                mo3032i(size);
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public final View mo3039p(int i) {
        return mo3040q(i, Long.MAX_VALUE).itemView;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0206, code lost:
        if (r7.mItemId != r8.getItemId(r7.mPosition)) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02fc, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0434, code lost:
        if ((r10 + r8) >= r19) goto L_0x03f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01cc, code lost:
        if (r1.f2438h.mState.f2462g == false) goto L_0x0209;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p033v7.widget.C0673gh mo3040q(int r18, long r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            if (r0 < 0) goto L_0x04cd
            android.support.v7.widget.RecyclerView r2 = r1.f2438h
            android.support.v7.widget.ge r2 = r2.mState
            int r2 = r2.mo3052a()
            if (r0 >= r2) goto L_0x04cd
            android.support.v7.widget.RecyclerView r2 = r1.f2438h
            android.support.v7.widget.ge r2 = r2.mState
            boolean r2 = r2.f2462g
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x008f
            java.util.ArrayList r2 = r1.f2432b
            if (r2 == 0) goto L_0x008a
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0025
            goto L_0x008a
        L_0x0025:
            r6 = 0
        L_0x0026:
            if (r6 >= r2) goto L_0x0046
            java.util.ArrayList r7 = r1.f2432b
            java.lang.Object r7 = r7.get(r6)
            android.support.v7.widget.gh r7 = (android.support.p033v7.widget.C0673gh) r7
            boolean r8 = r7.wasReturnedFromScrap()
            if (r8 != 0) goto L_0x0043
            int r8 = r7.getLayoutPosition()
            if (r8 != r0) goto L_0x0043
            int r2 = r7.mFlags
            r2 = r2 | 32
            r7.mFlags = r2
            goto L_0x008b
        L_0x0043:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0046:
            android.support.v7.widget.RecyclerView r6 = r1.f2438h
            android.support.v7.widget.fb r7 = r6.mAdapter
            boolean r7 = r7.mHasStableIds
            if (r7 == 0) goto L_0x008a
            android.support.v7.widget.w r6 = r6.mAdapterHelper
            int r6 = r6.mo3284a(r0, r5)
            if (r6 <= 0) goto L_0x008a
            android.support.v7.widget.RecyclerView r7 = r1.f2438h
            android.support.v7.widget.fb r7 = r7.mAdapter
            int r7 = r7.getItemCount()
            if (r6 >= r7) goto L_0x008a
            android.support.v7.widget.RecyclerView r7 = r1.f2438h
            android.support.v7.widget.fb r7 = r7.mAdapter
            long r6 = r7.getItemId(r6)
            r8 = 0
        L_0x0069:
            if (r8 >= r2) goto L_0x008a
            java.util.ArrayList r9 = r1.f2432b
            java.lang.Object r9 = r9.get(r8)
            android.support.v7.widget.gh r9 = (android.support.p033v7.widget.C0673gh) r9
            boolean r10 = r9.wasReturnedFromScrap()
            if (r10 != 0) goto L_0x0087
            long r10 = r9.mItemId
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x0087
            int r2 = r9.mFlags
            r2 = r2 | 32
            r9.mFlags = r2
            r7 = r9
            goto L_0x008b
        L_0x0087:
            int r8 = r8 + 1
            goto L_0x0069
        L_0x008a:
            r7 = r4
        L_0x008b:
            if (r7 == 0) goto L_0x0090
            r2 = 1
            goto L_0x0091
        L_0x008f:
            r7 = r4
        L_0x0090:
            r2 = 0
        L_0x0091:
            r6 = -1
            if (r7 != 0) goto L_0x024d
            java.util.ArrayList r7 = r1.f2431a
            int r7 = r7.size()
            r8 = 0
        L_0x009b:
            if (r8 >= r7) goto L_0x00d1
            java.util.ArrayList r9 = r1.f2431a
            java.lang.Object r9 = r9.get(r8)
            android.support.v7.widget.gh r9 = (android.support.p033v7.widget.C0673gh) r9
            boolean r10 = r9.wasReturnedFromScrap()
            if (r10 != 0) goto L_0x00ce
            int r10 = r9.getLayoutPosition()
            if (r10 != r0) goto L_0x00ce
            boolean r10 = r9.isInvalid()
            if (r10 != 0) goto L_0x00ce
            android.support.v7.widget.RecyclerView r10 = r1.f2438h
            android.support.v7.widget.ge r10 = r10.mState
            boolean r10 = r10.f2462g
            if (r10 != 0) goto L_0x00c5
            boolean r10 = r9.isRemoved()
            if (r10 != 0) goto L_0x00ce
        L_0x00c5:
            int r7 = r9.mFlags
            r7 = r7 | 32
            r9.mFlags = r7
        L_0x00cb:
            r7 = r9
            goto L_0x01be
        L_0x00ce:
            int r8 = r8 + 1
            goto L_0x009b
        L_0x00d1:
            android.support.v7.widget.RecyclerView r7 = r1.f2438h
            android.support.v7.widget.bt r7 = r7.mChildHelper
            java.util.List r8 = r7.f2142b
            int r8 = r8.size()
            r9 = 0
        L_0x00dc:
            if (r9 >= r8) goto L_0x0102
            java.util.List r10 = r7.f2142b
            java.lang.Object r10 = r10.get(r9)
            android.view.View r10 = (android.view.View) r10
            android.support.v7.widget.ez r11 = r7.f2143c
            android.support.v7.widget.gh r11 = android.support.p033v7.widget.RecyclerView.getChildViewHolderInt(r10)
            int r12 = r11.getLayoutPosition()
            if (r12 != r0) goto L_0x00ff
            boolean r12 = r11.isInvalid()
            if (r12 != 0) goto L_0x00ff
            boolean r11 = r11.isRemoved()
            if (r11 != 0) goto L_0x00ff
            goto L_0x0103
        L_0x00ff:
            int r9 = r9 + 1
            goto L_0x00dc
        L_0x0102:
            r10 = r4
        L_0x0103:
            if (r10 == 0) goto L_0x0190
            android.support.v7.widget.gh r7 = android.support.p033v7.widget.RecyclerView.getChildViewHolderInt(r10)
            android.support.v7.widget.RecyclerView r8 = r1.f2438h
            android.support.v7.widget.bt r8 = r8.mChildHelper
            android.support.v7.widget.ez r9 = r8.f2143c
            android.support.v7.widget.RecyclerView r9 = r9.f2402a
            int r9 = r9.indexOfChild(r10)
            if (r9 < 0) goto L_0x0178
            android.support.v7.widget.bs r11 = r8.f2141a
            boolean r11 = r11.mo2598f(r9)
            if (r11 == 0) goto L_0x0160
            android.support.v7.widget.bs r11 = r8.f2141a
            r11.mo2594b(r9)
            r8.mo2612l(r10)
            android.support.v7.widget.RecyclerView r8 = r1.f2438h
            android.support.v7.widget.bt r8 = r8.mChildHelper
            int r8 = r8.mo2603c(r10)
            if (r8 == r6) goto L_0x0143
            android.support.v7.widget.RecyclerView r9 = r1.f2438h
            android.support.v7.widget.bt r9 = r9.mChildHelper
            r9.mo2608h(r8)
            r1.mo3035l(r10)
            int r8 = r7.mFlags
            r8 = r8 | 8224(0x2020, float:1.1524E-41)
            r7.mFlags = r8
            goto L_0x01be
        L_0x0143:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
            r2.<init>(r3)
            r2.append(r7)
            android.support.v7.widget.RecyclerView r3 = r1.f2438h
            java.lang.String r3 = r3.exceptionLabel()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0160:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "trying to unhide a view that was not hidden"
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r2 = r10.toString()
            java.lang.String r2 = r3.concat(r2)
            r0.<init>(r2)
            throw r0
        L_0x0178:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "view is not a child, cannot hide "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r2 = r10.toString()
            java.lang.String r2 = r3.concat(r2)
            r0.<init>(r2)
            throw r0
        L_0x0190:
            java.util.ArrayList r7 = r1.f2433c
            int r7 = r7.size()
            r8 = 0
        L_0x0197:
            if (r8 >= r7) goto L_0x01bd
            java.util.ArrayList r9 = r1.f2433c
            java.lang.Object r9 = r9.get(r8)
            android.support.v7.widget.gh r9 = (android.support.p033v7.widget.C0673gh) r9
            boolean r10 = r9.isInvalid()
            if (r10 != 0) goto L_0x01ba
            int r10 = r9.getLayoutPosition()
            if (r10 != r0) goto L_0x01ba
            boolean r10 = r9.isAttachedToTransitionOverlay()
            if (r10 != 0) goto L_0x01ba
            java.util.ArrayList r7 = r1.f2433c
            r7.remove(r8)
            goto L_0x00cb
        L_0x01ba:
            int r8 = r8 + 1
            goto L_0x0197
        L_0x01bd:
            r7 = r4
        L_0x01be:
            if (r7 == 0) goto L_0x024d
            boolean r8 = r7.isRemoved()
            if (r8 == 0) goto L_0x01d2
            android.support.v7.widget.RecyclerView r8 = r1.f2438h
            android.support.v7.widget.ge r8 = r8.mState
            boolean r8 = r8.f2462g
            if (r8 != 0) goto L_0x01cf
            goto L_0x0209
        L_0x01cf:
            r2 = 1
            goto L_0x024d
        L_0x01d2:
            int r8 = r7.mPosition
            if (r8 < 0) goto L_0x0230
            android.support.v7.widget.RecyclerView r9 = r1.f2438h
            android.support.v7.widget.fb r9 = r9.mAdapter
            int r9 = r9.getItemCount()
            if (r8 >= r9) goto L_0x0230
            android.support.v7.widget.RecyclerView r8 = r1.f2438h
            android.support.v7.widget.ge r9 = r8.mState
            boolean r9 = r9.f2462g
            if (r9 != 0) goto L_0x01f4
            android.support.v7.widget.fb r8 = r8.mAdapter
            int r9 = r7.mPosition
            int r8 = r8.getItemViewType(r9)
            int r9 = r7.mItemViewType
            if (r8 != r9) goto L_0x0209
        L_0x01f4:
            android.support.v7.widget.RecyclerView r8 = r1.f2438h
            android.support.v7.widget.fb r8 = r8.mAdapter
            boolean r9 = r8.mHasStableIds
            if (r9 == 0) goto L_0x01cf
            long r9 = r7.mItemId
            int r11 = r7.mPosition
            long r11 = r8.getItemId(r11)
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x0209
            goto L_0x01cf
        L_0x0209:
            int r8 = r7.mFlags
            r8 = r8 | 4
            r7.mFlags = r8
            boolean r8 = r7.isScrap()
            if (r8 == 0) goto L_0x0222
            android.support.v7.widget.RecyclerView r8 = r1.f2438h
            android.view.View r9 = r7.itemView
            r8.removeDetachedView(r9, r5)
            android.support.v7.widget.fw r8 = r7.mScrapContainer
            r8.mo3037n(r7)
            goto L_0x022b
        L_0x0222:
            boolean r8 = r7.wasReturnedFromScrap()
            if (r8 == 0) goto L_0x022b
            r7.clearReturnedFromScrapFlag()
        L_0x022b:
            r1.mo3034k(r7)
            r7 = r4
            goto L_0x024d
        L_0x0230:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
            r2.<init>(r3)
            r2.append(r7)
            android.support.v7.widget.RecyclerView r3 = r1.f2438h
            java.lang.String r3 = r3.exceptionLabel()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x024d:
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r7 != 0) goto L_0x03b5
            android.support.v7.widget.RecyclerView r12 = r1.f2438h
            android.support.v7.widget.w r12 = r12.mAdapterHelper
            int r12 = r12.mo3284a(r0, r5)
            if (r12 < 0) goto L_0x0380
            android.support.v7.widget.RecyclerView r13 = r1.f2438h
            android.support.v7.widget.fb r13 = r13.mAdapter
            int r13 = r13.getItemCount()
            if (r12 >= r13) goto L_0x0380
            android.support.v7.widget.RecyclerView r13 = r1.f2438h
            android.support.v7.widget.fb r13 = r13.mAdapter
            int r13 = r13.getItemViewType(r12)
            android.support.v7.widget.RecyclerView r14 = r1.f2438h
            android.support.v7.widget.fb r14 = r14.mAdapter
            boolean r15 = r14.mHasStableIds
            if (r15 == 0) goto L_0x0302
            long r14 = r14.getItemId(r12)
            java.util.ArrayList r7 = r1.f2431a
            int r7 = r7.size()
            int r7 = r7 + r6
        L_0x0283:
            if (r7 < 0) goto L_0x02cd
            java.util.ArrayList r3 = r1.f2431a
            java.lang.Object r3 = r3.get(r7)
            android.support.v7.widget.gh r3 = (android.support.p033v7.widget.C0673gh) r3
            long r8 = r3.mItemId
            int r16 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x02ca
            boolean r8 = r3.wasReturnedFromScrap()
            if (r8 != 0) goto L_0x02ca
            int r8 = r3.mItemViewType
            if (r13 != r8) goto L_0x02b9
            int r6 = r3.mFlags
            r6 = r6 | 32
            r3.mFlags = r6
            boolean r6 = r3.isRemoved()
            if (r6 == 0) goto L_0x02b7
            android.support.v7.widget.RecyclerView r6 = r1.f2438h
            android.support.v7.widget.ge r6 = r6.mState
            boolean r6 = r6.f2462g
            if (r6 != 0) goto L_0x02b7
            r6 = 2
            r7 = 14
            r3.setFlags(r6, r7)
        L_0x02b7:
            r7 = r3
            goto L_0x02fd
        L_0x02b9:
            java.util.ArrayList r8 = r1.f2431a
            r8.remove(r7)
            android.support.v7.widget.RecyclerView r8 = r1.f2438h
            android.view.View r9 = r3.itemView
            r8.removeDetachedView(r9, r5)
            android.view.View r3 = r3.itemView
            r1.mo3030g(r3)
        L_0x02ca:
            int r7 = r7 + -1
            goto L_0x0283
        L_0x02cd:
            java.util.ArrayList r3 = r1.f2433c
            int r3 = r3.size()
            int r3 = r3 + r6
        L_0x02d4:
            if (r3 < 0) goto L_0x02fc
            java.util.ArrayList r6 = r1.f2433c
            java.lang.Object r6 = r6.get(r3)
            android.support.v7.widget.gh r6 = (android.support.p033v7.widget.C0673gh) r6
            long r7 = r6.mItemId
            int r9 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r9 != 0) goto L_0x02f9
            boolean r7 = r6.isAttachedToTransitionOverlay()
            if (r7 != 0) goto L_0x02f9
            int r7 = r6.mItemViewType
            if (r13 != r7) goto L_0x02f5
            java.util.ArrayList r7 = r1.f2433c
            r7.remove(r3)
            r7 = r6
            goto L_0x02fd
        L_0x02f5:
            r1.mo3032i(r3)
            goto L_0x02fc
        L_0x02f9:
            int r3 = r3 + -1
            goto L_0x02d4
        L_0x02fc:
            r7 = r4
        L_0x02fd:
            if (r7 == 0) goto L_0x0302
            r7.mPosition = r12
            r2 = 1
        L_0x0302:
            if (r7 != 0) goto L_0x0312
            android.support.v7.widget.fv r3 = r17.mo3025b()
            android.support.v7.widget.gh r3 = r3.mo3018c(r13)
            if (r3 == 0) goto L_0x0311
            r3.resetInternal()
        L_0x0311:
            r7 = r3
        L_0x0312:
            if (r7 != 0) goto L_0x03b5
            long r6 = android.support.p033v7.widget.RecyclerView.getNanoTime$ar$ds()
            int r3 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0331
            android.support.v7.widget.fv r3 = r1.f2437g
            android.support.v7.widget.fu r3 = r3.mo3017b(r13)
            long r8 = r3.f2426c
            r14 = 0
            int r3 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x0331
            long r8 = r8 + r6
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 >= 0) goto L_0x0330
            goto L_0x0331
        L_0x0330:
            return r4
        L_0x0331:
            android.support.v7.widget.RecyclerView r3 = r1.f2438h
            android.support.v7.widget.fb r8 = r3.mAdapter
            java.lang.String r9 = "RV CreateView"
            androidx.core.p094f.C1901n.m5168a(r9)     // Catch:{ all -> 0x037b }
            android.support.v7.widget.gh r3 = r8.onCreateViewHolder(r3, r13)     // Catch:{ all -> 0x037b }
            android.view.View r8 = r3.itemView     // Catch:{ all -> 0x037b }
            android.view.ViewParent r8 = r8.getParent()     // Catch:{ all -> 0x037b }
            if (r8 != 0) goto L_0x0373
            r3.mItemViewType = r13     // Catch:{ all -> 0x037b }
            androidx.core.p094f.C1901n.m5169b()
            boolean r8 = android.support.p033v7.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r8 == 0) goto L_0x035e
            android.view.View r8 = r3.itemView
            android.support.v7.widget.RecyclerView r8 = android.support.p033v7.widget.RecyclerView.findNestedRecyclerView(r8)
            if (r8 == 0) goto L_0x035e
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r8)
            r3.mNestedRecyclerView = r9
        L_0x035e:
            long r8 = android.support.p033v7.widget.RecyclerView.getNanoTime$ar$ds()
            android.support.v7.widget.fv r12 = r1.f2437g
            android.support.v7.widget.fu r12 = r12.mo3017b(r13)
            long r13 = r12.f2426c
            long r8 = r8 - r6
            long r6 = android.support.p033v7.widget.C0660fv.m2320i(r13, r8)
            r12.f2426c = r6
            r7 = r3
            goto L_0x03b5
        L_0x0373:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x037b }
            java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r0.<init>(r2)     // Catch:{ all -> 0x037b }
            throw r0     // Catch:{ all -> 0x037b }
        L_0x037b:
            r0 = move-exception
            androidx.core.p094f.C1901n.m5169b()
            throw r0
        L_0x0380:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Inconsistency detected. Invalid item position "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = "(offset:"
            r3.append(r0)
            r3.append(r12)
            java.lang.String r0 = ").state:"
            r3.append(r0)
            android.support.v7.widget.RecyclerView r0 = r1.f2438h
            android.support.v7.widget.ge r0 = r0.mState
            int r0 = r0.mo3052a()
            r3.append(r0)
            android.support.v7.widget.RecyclerView r0 = r1.f2438h
            java.lang.String r0 = r0.exceptionLabel()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x03b5:
            if (r2 == 0) goto L_0x03e5
            android.support.v7.widget.RecyclerView r3 = r1.f2438h
            android.support.v7.widget.ge r3 = r3.mState
            boolean r3 = r3.f2462g
            if (r3 != 0) goto L_0x03e5
            r3 = 8192(0x2000, float:1.14794E-41)
            boolean r6 = r7.hasAnyOfTheFlags(r3)
            if (r6 == 0) goto L_0x03e5
            r7.setFlags(r5, r3)
            android.support.v7.widget.RecyclerView r3 = r1.f2438h
            android.support.v7.widget.ge r3 = r3.mState
            boolean r3 = r3.f2465j
            if (r3 == 0) goto L_0x03e5
            android.support.p033v7.widget.C0646fh.m2290w(r7)
            android.support.v7.widget.RecyclerView r3 = r1.f2438h
            android.support.v7.widget.fh r3 = r3.mItemAnimator
            r7.getUnmodifiedPayloads()
            android.support.v7.widget.fg r3 = r3.mo2898v(r7)
            android.support.v7.widget.RecyclerView r6 = r1.f2438h
            r6.recordAnimationInfoIfBouncedHiddenView(r7, r3)
        L_0x03e5:
            android.support.v7.widget.RecyclerView r3 = r1.f2438h
            android.support.v7.widget.ge r3 = r3.mState
            boolean r3 = r3.f2462g
            if (r3 == 0) goto L_0x03f9
            boolean r3 = r7.isBound()
            if (r3 == 0) goto L_0x03f9
            r7.mPreLayoutPosition = r0
        L_0x03f5:
            r0 = 0
            r4 = 1
            goto L_0x0497
        L_0x03f9:
            boolean r3 = r7.isBound()
            if (r3 == 0) goto L_0x040b
            boolean r3 = r7.needsUpdate()
            if (r3 != 0) goto L_0x040b
            boolean r3 = r7.isInvalid()
            if (r3 == 0) goto L_0x03f5
        L_0x040b:
            android.support.v7.widget.RecyclerView r3 = r1.f2438h
            android.support.v7.widget.w r3 = r3.mAdapterHelper
            int r3 = r3.mo3284a(r0, r5)
            r7.mBindingAdapter = r4
            android.support.v7.widget.RecyclerView r4 = r1.f2438h
            r7.mOwnerRecyclerView = r4
            int r4 = r7.mItemViewType
            long r8 = android.support.p033v7.widget.RecyclerView.getNanoTime$ar$ds()
            int r6 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0436
            android.support.v7.widget.fv r6 = r1.f2437g
            android.support.v7.widget.fu r4 = r6.mo3017b(r4)
            long r10 = r4.f2427d
            r12 = 0
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x0436
            long r10 = r10 + r8
            int r4 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r4 >= 0) goto L_0x03f5
        L_0x0436:
            android.support.v7.widget.RecyclerView r4 = r1.f2438h
            android.support.v7.widget.fb r4 = r4.mAdapter
            r4.bindViewHolder(r7, r3)
            long r3 = android.support.p033v7.widget.RecyclerView.getNanoTime$ar$ds()
            android.support.v7.widget.fv r6 = r1.f2437g
            int r10 = r7.mItemViewType
            android.support.v7.widget.fu r6 = r6.mo3017b(r10)
            long r10 = r6.f2427d
            long r3 = r3 - r8
            long r3 = android.support.p033v7.widget.C0660fv.m2320i(r10, r3)
            r6.f2427d = r3
            android.support.v7.widget.RecyclerView r3 = r1.f2438h
            boolean r3 = r3.isAccessibilityEnabled()
            if (r3 == 0) goto L_0x048b
            android.view.View r3 = r7.itemView
            int r4 = androidx.core.p098j.C2043bi.m5575d(r3)
            if (r4 != 0) goto L_0x0467
            r4 = 1
            androidx.core.p098j.C2043bi.m5551ae(r3, r4)
            goto L_0x0468
        L_0x0467:
            r4 = 1
        L_0x0468:
            android.support.v7.widget.RecyclerView r6 = r1.f2438h
            android.support.v7.widget.gj r6 = r6.mAccessibilityDelegate
            if (r6 != 0) goto L_0x046f
            goto L_0x048c
        L_0x046f:
            androidx.core.j.c r6 = r6.mo3098a()
            boolean r8 = r6 instanceof android.support.p033v7.widget.C0674gi
            if (r8 == 0) goto L_0x0487
            r8 = r6
            android.support.v7.widget.gi r8 = (android.support.p033v7.widget.C0674gi) r8
            androidx.core.j.c r9 = androidx.core.p098j.C2043bi.m5591t(r3)
            if (r9 == 0) goto L_0x0487
            if (r9 == r8) goto L_0x0487
            java.util.Map r8 = r8.f2481b
            r8.put(r3, r9)
        L_0x0487:
            androidx.core.p098j.C2043bi.m5526T(r3, r6)
            goto L_0x048c
        L_0x048b:
            r4 = 1
        L_0x048c:
            android.support.v7.widget.RecyclerView r3 = r1.f2438h
            android.support.v7.widget.ge r3 = r3.mState
            boolean r3 = r3.f2462g
            if (r3 == 0) goto L_0x0496
            r7.mPreLayoutPosition = r0
        L_0x0496:
            r0 = 1
        L_0x0497:
            android.view.View r3 = r7.itemView
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x04ab
            android.support.v7.widget.RecyclerView r3 = r1.f2438h
            android.view.ViewGroup$LayoutParams r3 = r3.generateDefaultLayoutParams()
            android.view.View r6 = r7.itemView
            r6.setLayoutParams(r3)
            goto L_0x04c1
        L_0x04ab:
            android.support.v7.widget.RecyclerView r6 = r1.f2438h
            boolean r6 = r6.checkLayoutParams(r3)
            if (r6 != 0) goto L_0x04bf
            android.support.v7.widget.RecyclerView r6 = r1.f2438h
            android.view.ViewGroup$LayoutParams r3 = r6.generateLayoutParams((android.view.ViewGroup.LayoutParams) r3)
            android.view.View r6 = r7.itemView
            r6.setLayoutParams(r3)
            goto L_0x04c1
        L_0x04bf:
            android.support.v7.widget.fp r3 = (android.support.p033v7.widget.C0654fp) r3
        L_0x04c1:
            android.support.v7.widget.fp r3 = (android.support.p033v7.widget.C0654fp) r3
            r3.f2420c = r7
            if (r2 == 0) goto L_0x04ca
            if (r0 == 0) goto L_0x04ca
            r5 = 1
        L_0x04ca:
            r3.f2423f = r5
            return r7
        L_0x04cd:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid item position "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = "("
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "). Item count:"
            r3.append(r0)
            android.support.v7.widget.RecyclerView r0 = r1.f2438h
            android.support.v7.widget.ge r0 = r0.mState
            int r0 = r0.mo3052a()
            r3.append(r0)
            android.support.v7.widget.RecyclerView r0 = r1.f2438h
            java.lang.String r0 = r0.exceptionLabel()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            goto L_0x0503
        L_0x0502:
            throw r2
        L_0x0503:
            goto L_0x0502
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0661fw.mo3040q(int, long):android.support.v7.widget.gh");
    }
}
