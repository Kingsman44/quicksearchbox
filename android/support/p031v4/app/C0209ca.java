package android.support.p031v4.app;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v4.app.ca */
/* compiled from: PG */
final class C0209ca {

    /* renamed from: a */
    public final Fragment f785a;

    /* renamed from: b */
    public int f786b = -1;

    /* renamed from: c */
    private final C0178ax f787c;

    /* renamed from: d */
    private final C0211cc f788d;

    /* renamed from: e */
    private boolean f789e = false;

    public C0209ca(C0178ax axVar, C0211cc ccVar, Fragment fragment) {
        this.f787c = axVar;
        this.f788d = ccVar;
        this.f785a = fragment;
    }

    public C0209ca(C0178ax axVar, C0211cc ccVar, Fragment fragment, FragmentState fragmentState) {
        this.f787c = axVar;
        this.f788d = ccVar;
        this.f785a = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f689m;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }

    /* renamed from: a */
    public final Bundle mo660a() {
        Bundle bundle = new Bundle();
        this.f785a.performSaveInstanceState(bundle);
        this.f787c.mo601j(this.f785a, bundle, false);
        if (true == bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f785a.mView != null) {
            mo667h();
        }
        if (this.f785a.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f785a.mSavedViewState);
        }
        if (this.f785a.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f785a.mSavedViewRegistryState);
        }
        if (!this.f785a.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f785a.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo661b() {
        View view;
        View view2;
        C0211cc ccVar = this.f788d;
        Fragment fragment = this.f785a;
        ViewGroup viewGroup = fragment.mContainer;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = ccVar.f796a.indexOf(fragment);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= ccVar.f796a.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) ccVar.f796a.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) ccVar.f796a.get(i2);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        Fragment fragment4 = this.f785a;
        fragment4.mContainer.addView(fragment4.mView, i);
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo662c() {
        /*
            r7 = this;
            android.support.v4.app.Fragment r0 = r7.f785a
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r0 = android.support.p031v4.app.FragmentManager.m246Z(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L_0x0027
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto CREATE_VIEW: "
            r0.<init>(r2)
            android.support.v4.app.Fragment r3 = r7.f785a
            r0.append(r3)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r2.concat(r0)
            android.util.Log.d(r1, r0)
        L_0x0027:
            android.support.v4.app.Fragment r0 = r7.f785a
            android.os.Bundle r2 = r0.mSavedFragmentState
            android.view.LayoutInflater r0 = r0.performGetLayoutInflater(r2)
            android.support.v4.app.Fragment r2 = r7.f785a
            android.view.ViewGroup r3 = r2.mContainer
            if (r3 == 0) goto L_0x0037
            goto L_0x00b5
        L_0x0037:
            int r3 = r2.mContainerId
            if (r3 == 0) goto L_0x00b4
            r4 = -1
            if (r3 == r4) goto L_0x0099
            android.support.v4.app.FragmentManager r2 = r2.mFragmentManager
            android.support.v4.app.aq r2 = r2.f648o
            android.view.View r2 = r2.mo521a(r3)
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 != 0) goto L_0x008f
            android.support.v4.app.Fragment r2 = r7.f785a
            boolean r4 = r2.mRestored
            if (r4 == 0) goto L_0x0052
            goto L_0x00b5
        L_0x0052:
            android.content.res.Resources r0 = r2.getResources()     // Catch:{ NotFoundException -> 0x005f }
            android.support.v4.app.Fragment r1 = r7.f785a     // Catch:{ NotFoundException -> 0x005f }
            int r1 = r1.mContainerId     // Catch:{ NotFoundException -> 0x005f }
            java.lang.String r0 = r0.getResourceName(r1)     // Catch:{ NotFoundException -> 0x005f }
            goto L_0x0061
        L_0x005f:
            java.lang.String r0 = "unknown"
        L_0x0061:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No view found for id 0x"
            r2.<init>(r3)
            android.support.v4.app.Fragment r3 = r7.f785a
            int r3 = r3.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r3 = " ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ") for fragment "
            r2.append(r0)
            android.support.v4.app.Fragment r0 = r7.f785a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x008f:
            boolean r2 = r3 instanceof android.support.p031v4.app.FragmentContainerView
            if (r2 != 0) goto L_0x00b5
            android.support.v4.app.Fragment r2 = r7.f785a
            androidx.p116i.p117a.p118a.C2284e.m6228i(r2, r3)
            goto L_0x00b5
        L_0x0099:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot create fragment "
            r1.<init>(r2)
            android.support.v4.app.Fragment r2 = r7.f785a
            r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b4:
            r3 = 0
        L_0x00b5:
            android.support.v4.app.Fragment r2 = r7.f785a
            r2.mContainer = r3
            android.os.Bundle r4 = r2.mSavedFragmentState
            r2.performCreateView(r0, r3, r4)
            android.support.v4.app.Fragment r0 = r7.f785a
            android.view.View r0 = r0.mView
            r2 = 2
            if (r0 == 0) goto L_0x0166
            r4 = 0
            r0.setSaveFromParentEnabled(r4)
            android.support.v4.app.Fragment r0 = r7.f785a
            android.view.View r5 = r0.mView
            r6 = 2131431142(0x7f0b0ee6, float:1.8484005E38)
            r5.setTag(r6, r0)
            if (r3 == 0) goto L_0x00d8
            r7.mo661b()
        L_0x00d8:
            android.support.v4.app.Fragment r0 = r7.f785a
            boolean r3 = r0.mHidden
            if (r3 == 0) goto L_0x00e5
            android.view.View r0 = r0.mView
            r3 = 8
            r0.setVisibility(r3)
        L_0x00e5:
            android.support.v4.app.Fragment r0 = r7.f785a
            android.view.View r0 = r0.mView
            boolean r0 = androidx.core.p098j.C2043bi.m5569aw(r0)
            if (r0 == 0) goto L_0x00f7
            android.support.v4.app.Fragment r0 = r7.f785a
            android.view.View r0 = r0.mView
            androidx.core.p098j.C2043bi.m5524R(r0)
            goto L_0x0103
        L_0x00f7:
            android.support.v4.app.Fragment r0 = r7.f785a
            android.view.View r0 = r0.mView
            android.support.v4.app.bz r3 = new android.support.v4.app.bz
            r3.<init>(r0)
            r0.addOnAttachStateChangeListener(r3)
        L_0x0103:
            android.support.v4.app.Fragment r0 = r7.f785a
            r0.performViewCreated()
            android.support.v4.app.ax r0 = r7.f787c
            android.support.v4.app.Fragment r3 = r7.f785a
            android.view.View r5 = r3.mView
            android.os.Bundle r6 = r3.mSavedFragmentState
            r0.mo604m(r3, r5, r6, r4)
            android.support.v4.app.Fragment r0 = r7.f785a
            android.view.View r0 = r0.mView
            int r0 = r0.getVisibility()
            android.support.v4.app.Fragment r3 = r7.f785a
            android.view.View r3 = r3.mView
            float r3 = r3.getAlpha()
            android.support.v4.app.Fragment r4 = r7.f785a
            r4.setPostOnViewCreatedAlpha(r3)
            android.support.v4.app.Fragment r3 = r7.f785a
            android.view.ViewGroup r4 = r3.mContainer
            if (r4 == 0) goto L_0x0166
            if (r0 != 0) goto L_0x0166
            android.view.View r0 = r3.mView
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L_0x015e
            android.support.v4.app.Fragment r3 = r7.f785a
            r3.setFocusedView(r0)
            boolean r3 = android.support.p031v4.app.FragmentManager.m246Z(r2)
            if (r3 == 0) goto L_0x015e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "requestFocus: Saved focused view "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " for Fragment "
            r3.append(r0)
            android.support.v4.app.Fragment r0 = r7.f785a
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.v(r1, r0)
        L_0x015e:
            android.support.v4.app.Fragment r0 = r7.f785a
            android.view.View r0 = r0.mView
            r1 = 0
            r0.setAlpha(r1)
        L_0x0166:
            android.support.v4.app.Fragment r0 = r7.f785a
            r0.mState = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.C0209ca.mo662c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo663d() {
        Fragment fragment = this.f785a;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m246Z(3)) {
                StringBuilder sb = new StringBuilder("moveto CREATE_VIEW: ");
                Fragment fragment2 = this.f785a;
                sb.append(fragment2);
                Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(fragment2)));
            }
            Fragment fragment3 = this.f785a;
            fragment3.performCreateView(fragment3.performGetLayoutInflater(fragment3.mSavedFragmentState), (ViewGroup) null, this.f785a.mSavedFragmentState);
            View view = this.f785a.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment4 = this.f785a;
                fragment4.mView.setTag(R.id.fragment_container_view_tag, fragment4);
                Fragment fragment5 = this.f785a;
                if (fragment5.mHidden) {
                    fragment5.mView.setVisibility(8);
                }
                this.f785a.performViewCreated();
                C0178ax axVar = this.f787c;
                Fragment fragment6 = this.f785a;
                axVar.mo604m(fragment6, fragment6.mView, fragment6.mSavedFragmentState, false);
                this.f785a.mState = 2;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: android.support.v4.app.dc} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x03bc, code lost:
        continue;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo664e() {
        /*
            r17 = this;
            r1 = r17
            boolean r2 = r1.f789e
            r3 = 2
            java.lang.String r4 = "FragmentManager"
            if (r2 == 0) goto L_0x0027
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r3)
            if (r2 == 0) goto L_0x0026
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Ignoring re-entrant call to moveToExpectedState() for "
            r2.<init>(r3)
            android.support.v4.app.Fragment r5 = r1.f785a
            r2.append(r5)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.v(r4, r2)
        L_0x0026:
            return
        L_0x0027:
            r2 = 0
            r5 = 1
            r1.f789e = r5     // Catch:{ all -> 0x074e }
            r6 = 0
        L_0x002c:
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            android.support.v4.app.FragmentManager r8 = r7.mFragmentManager     // Catch:{ all -> 0x074e }
            r9 = 6
            r10 = 5
            r11 = 4
            r12 = -1
            r14 = 3
            if (r8 != 0) goto L_0x003b
            int r7 = r7.mState     // Catch:{ all -> 0x074e }
            goto L_0x0141
        L_0x003b:
            int r7 = r1.f786b     // Catch:{ all -> 0x074e }
            androidx.lifecycle.n r8 = androidx.lifecycle.C2383n.DESTROYED     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r8 = r1.f785a     // Catch:{ all -> 0x074e }
            androidx.lifecycle.n r8 = r8.mMaxState     // Catch:{ all -> 0x074e }
            int r8 = r8.ordinal()     // Catch:{ all -> 0x074e }
            if (r8 == r5) goto L_0x005e
            if (r8 == r3) goto L_0x0059
            if (r8 == r14) goto L_0x0054
            if (r8 == r11) goto L_0x0062
            int r7 = java.lang.Math.min(r7, r12)     // Catch:{ all -> 0x074e }
            goto L_0x0062
        L_0x0054:
            int r7 = java.lang.Math.min(r7, r10)     // Catch:{ all -> 0x074e }
            goto L_0x0062
        L_0x0059:
            int r7 = java.lang.Math.min(r7, r5)     // Catch:{ all -> 0x074e }
            goto L_0x0062
        L_0x005e:
            int r7 = java.lang.Math.min(r7, r2)     // Catch:{ all -> 0x074e }
        L_0x0062:
            android.support.v4.app.Fragment r8 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r15 = r8.mFromLayout     // Catch:{ all -> 0x074e }
            if (r15 == 0) goto L_0x0092
            boolean r15 = r8.mInLayout     // Catch:{ all -> 0x074e }
            if (r15 == 0) goto L_0x0083
            int r7 = r1.f786b     // Catch:{ all -> 0x074e }
            int r7 = java.lang.Math.max(r7, r3)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r8 = r1.f785a     // Catch:{ all -> 0x074e }
            android.view.View r8 = r8.mView     // Catch:{ all -> 0x074e }
            if (r8 == 0) goto L_0x0092
            android.view.ViewParent r8 = r8.getParent()     // Catch:{ all -> 0x074e }
            if (r8 != 0) goto L_0x0092
            int r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x074e }
            goto L_0x0092
        L_0x0083:
            int r15 = r1.f786b     // Catch:{ all -> 0x074e }
            if (r15 >= r11) goto L_0x008e
            int r8 = r8.mState     // Catch:{ all -> 0x074e }
            int r7 = java.lang.Math.min(r7, r8)     // Catch:{ all -> 0x074e }
            goto L_0x0092
        L_0x008e:
            int r7 = java.lang.Math.min(r7, r5)     // Catch:{ all -> 0x074e }
        L_0x0092:
            android.support.v4.app.Fragment r8 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r8 = r8.mAdded     // Catch:{ all -> 0x074e }
            if (r8 != 0) goto L_0x009c
            int r7 = java.lang.Math.min(r7, r5)     // Catch:{ all -> 0x074e }
        L_0x009c:
            android.support.v4.app.Fragment r8 = r1.f785a     // Catch:{ all -> 0x074e }
            android.view.ViewGroup r15 = r8.mContainer     // Catch:{ all -> 0x074e }
            if (r15 == 0) goto L_0x00e8
            android.support.v4.app.FragmentManager r8 = r8.getParentFragmentManager()     // Catch:{ all -> 0x074e }
            r8.mo466ag()     // Catch:{ all -> 0x074e }
            android.support.v4.app.dd r8 = android.support.p031v4.app.C0239dd.m562k(r15)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r15 = r1.f785a     // Catch:{ all -> 0x074e }
            android.support.v4.app.dc r15 = r8.mo747f(r15)     // Catch:{ all -> 0x074e }
            if (r15 == 0) goto L_0x00b8
            int r15 = r15.f877f     // Catch:{ all -> 0x074e }
            goto L_0x00b9
        L_0x00b8:
            r15 = 0
        L_0x00b9:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            java.util.ArrayList r8 = r8.f881c     // Catch:{ all -> 0x074e }
            int r13 = r8.size()     // Catch:{ all -> 0x074e }
            r11 = 0
        L_0x00c2:
            if (r11 >= r13) goto L_0x00de
            java.lang.Object r16 = r8.get(r11)     // Catch:{ all -> 0x074e }
            r10 = r16
            android.support.v4.app.dc r10 = (android.support.p031v4.app.C0238dc) r10     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r12 = r10.f872a     // Catch:{ all -> 0x074e }
            boolean r12 = r12.equals(r2)     // Catch:{ all -> 0x074e }
            if (r12 == 0) goto L_0x00d9
            boolean r12 = r10.f874c     // Catch:{ all -> 0x074e }
            if (r12 != 0) goto L_0x00d9
            goto L_0x00df
        L_0x00d9:
            int r11 = r11 + 1
            r10 = 5
            r12 = -1
            goto L_0x00c2
        L_0x00de:
            r10 = 0
        L_0x00df:
            if (r10 == 0) goto L_0x00e9
            if (r15 == 0) goto L_0x00e5
            if (r15 != r5) goto L_0x00e9
        L_0x00e5:
            int r15 = r10.f877f     // Catch:{ all -> 0x074e }
            goto L_0x00e9
        L_0x00e8:
            r15 = 0
        L_0x00e9:
            if (r15 != r3) goto L_0x00f0
            int r7 = java.lang.Math.min(r7, r9)     // Catch:{ all -> 0x074e }
            goto L_0x010d
        L_0x00f0:
            if (r15 != r14) goto L_0x00f7
            int r7 = java.lang.Math.max(r7, r14)     // Catch:{ all -> 0x074e }
            goto L_0x010d
        L_0x00f7:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r8 = r2.mRemoving     // Catch:{ all -> 0x074e }
            if (r8 == 0) goto L_0x010d
            boolean r2 = r2.isInBackStack()     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0108
            int r7 = java.lang.Math.min(r7, r5)     // Catch:{ all -> 0x074e }
            goto L_0x010d
        L_0x0108:
            r2 = -1
            int r7 = java.lang.Math.min(r7, r2)     // Catch:{ all -> 0x074e }
        L_0x010d:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r8 = r2.mDeferStart     // Catch:{ all -> 0x074e }
            if (r8 == 0) goto L_0x011d
            int r2 = r2.mState     // Catch:{ all -> 0x074e }
            r8 = 5
            if (r2 >= r8) goto L_0x011d
            r2 = 4
            int r7 = java.lang.Math.min(r7, r2)     // Catch:{ all -> 0x074e }
        L_0x011d:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r3)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0141
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r8 = "computeExpectedState() of "
            r2.append(r8)     // Catch:{ all -> 0x074e }
            r2.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r8 = " for "
            r2.append(r8)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r8 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r8)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x074e }
            android.util.Log.v(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x0141:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            int r8 = r2.mState     // Catch:{ all -> 0x074e }
            java.lang.String r10 = "initState called for fragment: "
            if (r7 == r8) goto L_0x065f
            if (r7 <= r8) goto L_0x03b7
            int r8 = r8 + 1
            switch(r8) {
                case 0: goto L_0x02fa;
                case 1: goto L_0x02ae;
                case 2: goto L_0x02a6;
                case 3: goto L_0x0273;
                case 4: goto L_0x022a;
                case 5: goto L_0x01fb;
                case 6: goto L_0x01f7;
                case 7: goto L_0x0152;
                default: goto L_0x0150;
            }
        L_0x0150:
            goto L_0x03bc
        L_0x0152:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0172
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "moveto RESUMED: "
            r2.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r6.concat(r2)     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x0172:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            android.view.View r2 = r2.getFocusedView()     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x01d9
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            android.view.View r6 = r6.mView     // Catch:{ all -> 0x074e }
            if (r2 != r6) goto L_0x0181
            goto L_0x0192
        L_0x0181:
            android.view.ViewParent r6 = r2.getParent()     // Catch:{ all -> 0x074e }
        L_0x0185:
            if (r6 == 0) goto L_0x01d9
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            android.view.View r7 = r7.mView     // Catch:{ all -> 0x074e }
            if (r6 == r7) goto L_0x0192
            android.view.ViewParent r6 = r6.getParent()     // Catch:{ all -> 0x074e }
            goto L_0x0185
        L_0x0192:
            boolean r6 = r2.requestFocus()     // Catch:{ all -> 0x074e }
            boolean r7 = android.support.p031v4.app.FragmentManager.m246Z(r3)     // Catch:{ all -> 0x074e }
            if (r7 == 0) goto L_0x01d9
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r7.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r8 = "requestFocus: Restoring focused view "
            r7.append(r8)     // Catch:{ all -> 0x074e }
            r7.append(r2)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = " "
            r7.append(r2)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = "succeeded"
            java.lang.String r8 = "failed"
            if (r5 == r6) goto L_0x01b5
            r2 = r8
        L_0x01b5:
            r7.append(r2)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = " on Fragment "
            r7.append(r2)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r7.append(r2)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = " resulting in focused view "
            r7.append(r2)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            android.view.View r2 = r2.mView     // Catch:{ all -> 0x074e }
            android.view.View r2 = r2.findFocus()     // Catch:{ all -> 0x074e }
            r7.append(r2)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x074e }
            android.util.Log.v(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x01d9:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r6 = 0
            r2.setFocusedView(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.performResume()     // Catch:{ all -> 0x074e }
            android.support.v4.app.ax r2 = r1.f787c     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r7 = 0
            r2.mo600i(r6, r7)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r6 = 0
            r2.mSavedFragmentState = r6     // Catch:{ all -> 0x074e }
            r2.mSavedViewState = r6     // Catch:{ all -> 0x074e }
            r2.mSavedViewRegistryState = r6     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x01f7:
            r2.mState = r9     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x01fb:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x021b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "moveto STARTED: "
            r2.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r6.concat(r2)     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x021b:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.performStart()     // Catch:{ all -> 0x074e }
            android.support.v4.app.ax r2 = r1.f787c     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r7 = 0
            r2.mo602k(r6, r7)     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x022a:
            android.view.View r6 = r2.mView     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x026c
            android.view.ViewGroup r6 = r2.mContainer     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x026c
            android.support.v4.app.FragmentManager r2 = r2.getParentFragmentManager()     // Catch:{ all -> 0x074e }
            r2.mo466ag()     // Catch:{ all -> 0x074e }
            android.support.v4.app.dd r2 = android.support.p031v4.app.C0239dd.m562k(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            android.view.View r6 = r6.mView     // Catch:{ all -> 0x074e }
            int r6 = r6.getVisibility()     // Catch:{ all -> 0x074e }
            int r6 = android.support.p031v4.app.C0237db.m552b(r6)     // Catch:{ all -> 0x074e }
            boolean r7 = android.support.p031v4.app.FragmentManager.m246Z(r3)     // Catch:{ all -> 0x074e }
            if (r7 == 0) goto L_0x0269
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r7.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r8 = "SpecialEffectsController: Enqueuing add operation for fragment "
            r7.append(r8)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r9 = r1.f785a     // Catch:{ all -> 0x074e }
            r7.append(r9)     // Catch:{ all -> 0x074e }
            java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x074e }
            java.lang.String r7 = r8.concat(r7)     // Catch:{ all -> 0x074e }
            android.util.Log.v(r4, r7)     // Catch:{ all -> 0x074e }
        L_0x0269:
            r2.mo751j(r6, r3, r1)     // Catch:{ all -> 0x074e }
        L_0x026c:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r6 = 4
            r2.mState = r6     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x0273:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0293
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "moveto ACTIVITY_CREATED: "
            r2.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r6.concat(r2)     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x0293:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            android.os.Bundle r6 = r2.mSavedFragmentState     // Catch:{ all -> 0x074e }
            r2.performActivityCreated(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.ax r2 = r1.f787c     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            android.os.Bundle r7 = r6.mSavedFragmentState     // Catch:{ all -> 0x074e }
            r8 = 0
            r2.mo592a(r6, r7, r8)     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x02a6:
            r17.mo663d()     // Catch:{ all -> 0x074e }
            r17.mo662c()     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x02ae:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x02ce
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "moveto CREATED: "
            r2.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r6.concat(r2)     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x02ce:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r6 = r2.mIsCreated     // Catch:{ all -> 0x074e }
            if (r6 != 0) goto L_0x02ef
            android.support.v4.app.ax r6 = r1.f787c     // Catch:{ all -> 0x074e }
            android.os.Bundle r7 = r2.mSavedFragmentState     // Catch:{ all -> 0x074e }
            r8 = 0
            r6.mo599h(r2, r7, r8)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            android.os.Bundle r6 = r2.mSavedFragmentState     // Catch:{ all -> 0x074e }
            r2.performCreate(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.ax r2 = r1.f787c     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            android.os.Bundle r7 = r6.mSavedFragmentState     // Catch:{ all -> 0x074e }
            r8 = 0
            r2.mo594c(r6, r7, r8)     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x02ef:
            android.os.Bundle r6 = r2.mSavedFragmentState     // Catch:{ all -> 0x074e }
            r2.restoreChildFragmentState(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.mState = r5     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x02fa:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x031a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "moveto ATTACHED: "
            r2.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r6.concat(r2)     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x031a:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r2.mTarget     // Catch:{ all -> 0x074e }
            java.lang.String r7 = " that does not belong to this FragmentManager!"
            java.lang.String r8 = " declared target fragment "
            java.lang.String r9 = "Fragment "
            if (r6 == 0) goto L_0x0361
            android.support.v4.app.cc r2 = r1.f788d     // Catch:{ all -> 0x074e }
            java.lang.String r6 = r6.mWho     // Catch:{ all -> 0x074e }
            android.support.v4.app.ca r2 = r2.mo674f(r6)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x033d
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r6.mTarget     // Catch:{ all -> 0x074e }
            java.lang.String r7 = r7.mWho     // Catch:{ all -> 0x074e }
            r6.mTargetWho = r7     // Catch:{ all -> 0x074e }
            r7 = 0
            r6.mTarget = r7     // Catch:{ all -> 0x074e }
            r13 = r2
            goto L_0x0393
        L_0x033d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x074e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r3.<init>()     // Catch:{ all -> 0x074e }
            r3.append(r9)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r4 = r1.f785a     // Catch:{ all -> 0x074e }
            r3.append(r4)     // Catch:{ all -> 0x074e }
            r3.append(r8)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r4 = r1.f785a     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r4 = r4.mTarget     // Catch:{ all -> 0x074e }
            r3.append(r4)     // Catch:{ all -> 0x074e }
            r3.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x074e }
            r2.<init>(r3)     // Catch:{ all -> 0x074e }
            throw r2     // Catch:{ all -> 0x074e }
        L_0x0361:
            java.lang.String r2 = r2.mTargetWho     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0392
            android.support.v4.app.cc r6 = r1.f788d     // Catch:{ all -> 0x074e }
            android.support.v4.app.ca r13 = r6.mo674f(r2)     // Catch:{ all -> 0x074e }
            if (r13 == 0) goto L_0x036e
            goto L_0x0393
        L_0x036e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x074e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r3.<init>()     // Catch:{ all -> 0x074e }
            r3.append(r9)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r4 = r1.f785a     // Catch:{ all -> 0x074e }
            r3.append(r4)     // Catch:{ all -> 0x074e }
            r3.append(r8)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r4 = r1.f785a     // Catch:{ all -> 0x074e }
            java.lang.String r4 = r4.mTargetWho     // Catch:{ all -> 0x074e }
            r3.append(r4)     // Catch:{ all -> 0x074e }
            r3.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x074e }
            r2.<init>(r3)     // Catch:{ all -> 0x074e }
            throw r2     // Catch:{ all -> 0x074e }
        L_0x0392:
            r13 = 0
        L_0x0393:
            if (r13 == 0) goto L_0x0398
            r13.mo664e()     // Catch:{ all -> 0x074e }
        L_0x0398:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            android.support.v4.app.FragmentManager r6 = r2.mFragmentManager     // Catch:{ all -> 0x074e }
            android.support.v4.app.at r7 = r6.f647n     // Catch:{ all -> 0x074e }
            r2.mHost = r7     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r6.f649p     // Catch:{ all -> 0x074e }
            r2.mParentFragment = r6     // Catch:{ all -> 0x074e }
            android.support.v4.app.ax r6 = r1.f787c     // Catch:{ all -> 0x074e }
            r7 = 0
            r6.mo598g(r2, r7)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.performAttach()     // Catch:{ all -> 0x074e }
            android.support.v4.app.ax r2 = r1.f787c     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.mo593b(r6, r7)     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x03b7:
            int r8 = r8 + -1
            switch(r8) {
                case -1: goto L_0x05e8;
                case 0: goto L_0x04e7;
                case 1: goto L_0x0496;
                case 2: goto L_0x048f;
                case 3: goto L_0x0420;
                case 4: goto L_0x03f2;
                case 5: goto L_0x03ee;
                case 6: goto L_0x03c0;
                default: goto L_0x03bc;
            }     // Catch:{ all -> 0x074e }
        L_0x03bc:
            r2 = 0
            r6 = 1
            goto L_0x002c
        L_0x03c0:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x03e0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "movefrom RESUMED: "
            r2.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r6.concat(r2)     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x03e0:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.performPause()     // Catch:{ all -> 0x074e }
            android.support.v4.app.ax r2 = r1.f787c     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r7 = 0
            r2.mo597f(r6, r7)     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x03ee:
            r6 = 5
            r2.mState = r6     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x03f2:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0412
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "movefrom STARTED: "
            r2.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r6.concat(r2)     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x0412:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.performStop()     // Catch:{ all -> 0x074e }
            android.support.v4.app.ax r2 = r1.f787c     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r7 = 0
            r2.mo603l(r6, r7)     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x0420:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x043c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r2.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r6)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x043c:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r6 = r2.mBeingSaved     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x0446
            r17.mo666g()     // Catch:{ all -> 0x074e }
            goto L_0x0451
        L_0x0446:
            android.view.View r6 = r2.mView     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x0451
            android.util.SparseArray r2 = r2.mSavedViewState     // Catch:{ all -> 0x074e }
            if (r2 != 0) goto L_0x0451
            r17.mo667h()     // Catch:{ all -> 0x074e }
        L_0x0451:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            android.view.View r6 = r2.mView     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x0489
            android.view.ViewGroup r6 = r2.mContainer     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x0489
            android.support.v4.app.FragmentManager r2 = r2.getParentFragmentManager()     // Catch:{ all -> 0x074e }
            r2.mo466ag()     // Catch:{ all -> 0x074e }
            android.support.v4.app.dd r2 = android.support.p031v4.app.C0239dd.m562k(r6)     // Catch:{ all -> 0x074e }
            boolean r6 = android.support.p031v4.app.FragmentManager.m246Z(r3)     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x0486
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r6.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r7 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            r6.append(r7)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r8 = r1.f785a     // Catch:{ all -> 0x074e }
            r6.append(r8)     // Catch:{ all -> 0x074e }
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x074e }
            java.lang.String r6 = r7.concat(r6)     // Catch:{ all -> 0x074e }
            android.util.Log.v(r4, r6)     // Catch:{ all -> 0x074e }
        L_0x0486:
            r2.mo751j(r5, r14, r1)     // Catch:{ all -> 0x074e }
        L_0x0489:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.mState = r14     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x048f:
            r6 = 0
            r2.mInLayout = r6     // Catch:{ all -> 0x074e }
            r2.mState = r3     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x0496:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x04b6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "movefrom CREATE_VIEW: "
            r2.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r6.concat(r2)     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x04b6:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            android.view.ViewGroup r6 = r2.mContainer     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x04c3
            android.view.View r2 = r2.mView     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x04c3
            r6.removeView(r2)     // Catch:{ all -> 0x074e }
        L_0x04c3:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.performDestroyView()     // Catch:{ all -> 0x074e }
            android.support.v4.app.ax r2 = r1.f787c     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r7 = 0
            r2.mo605n(r6, r7)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r6 = 0
            r2.mContainer = r6     // Catch:{ all -> 0x074e }
            r2.mView = r6     // Catch:{ all -> 0x074e }
            r2.mViewLifecycleOwner = r6     // Catch:{ all -> 0x074e }
            androidx.lifecycle.ag r2 = r2.mViewLifecycleOwnerLiveData     // Catch:{ all -> 0x074e }
            r2.mo5708l(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r6 = 0
            r2.mInLayout = r6     // Catch:{ all -> 0x074e }
            r2.mState = r5     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x04e7:
            boolean r6 = r2.mBeingSaved     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x04fc
            android.support.v4.app.cc r6 = r1.f788d     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r2.mWho     // Catch:{ all -> 0x074e }
            java.util.HashMap r6 = r6.f798c     // Catch:{ all -> 0x074e }
            java.lang.Object r2 = r6.get(r2)     // Catch:{ all -> 0x074e }
            android.support.v4.app.FragmentState r2 = (android.support.p031v4.app.FragmentState) r2     // Catch:{ all -> 0x074e }
            if (r2 != 0) goto L_0x04fc
            r17.mo666g()     // Catch:{ all -> 0x074e }
        L_0x04fc:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x051c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "movefrom CREATED: "
            r2.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r6.concat(r2)     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x051c:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r6 = r2.mRemoving     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x052a
            boolean r2 = r2.isInBackStack()     // Catch:{ all -> 0x074e }
            if (r2 != 0) goto L_0x052a
            r2 = 1
            goto L_0x052b
        L_0x052a:
            r2 = 0
        L_0x052b:
            if (r2 == 0) goto L_0x053b
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r7 = r6.mBeingSaved     // Catch:{ all -> 0x074e }
            if (r7 != 0) goto L_0x053b
            android.support.v4.app.cc r7 = r1.f788d     // Catch:{ all -> 0x074e }
            java.lang.String r6 = r6.mWho     // Catch:{ all -> 0x074e }
            r8 = 0
            r7.mo673e(r6, r8)     // Catch:{ all -> 0x074e }
        L_0x053b:
            if (r2 != 0) goto L_0x0567
            android.support.v4.app.cc r6 = r1.f788d     // Catch:{ all -> 0x074e }
            android.support.v4.app.bu r6 = r6.f799d     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r6 = r6.mo642f(r7)     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x054a
            goto L_0x0567
        L_0x054a:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r2.mTargetWho     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0560
            android.support.v4.app.cc r6 = r1.f788d     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r2 = r6.mo669a(r2)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0560
            boolean r6 = r2.mRetainInstance     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x0560
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r6.mTarget = r2     // Catch:{ all -> 0x074e }
        L_0x0560:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r6 = 0
            r2.mState = r6     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x0567:
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            android.support.v4.app.at r6 = r6.mHost     // Catch:{ all -> 0x074e }
            boolean r7 = r6 instanceof androidx.lifecycle.C2371bs     // Catch:{ all -> 0x074e }
            if (r7 == 0) goto L_0x0576
            android.support.v4.app.cc r6 = r1.f788d     // Catch:{ all -> 0x074e }
            android.support.v4.app.bu r6 = r6.f799d     // Catch:{ all -> 0x074e }
            boolean r6 = r6.f778f     // Catch:{ all -> 0x074e }
            goto L_0x0585
        L_0x0576:
            android.content.Context r6 = r6.f742c     // Catch:{ all -> 0x074e }
            boolean r7 = r6 instanceof android.app.Activity     // Catch:{ all -> 0x074e }
            if (r7 == 0) goto L_0x0584
            android.app.Activity r6 = (android.app.Activity) r6     // Catch:{ all -> 0x074e }
            boolean r6 = r6.isChangingConfigurations()     // Catch:{ all -> 0x074e }
            r6 = r6 ^ r5
            goto L_0x0585
        L_0x0584:
            r6 = 1
        L_0x0585:
            if (r2 == 0) goto L_0x058d
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r2 = r2.mBeingSaved     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x058f
        L_0x058d:
            if (r6 == 0) goto L_0x0598
        L_0x058f:
            android.support.v4.app.cc r2 = r1.f788d     // Catch:{ all -> 0x074e }
            android.support.v4.app.bu r2 = r2.f799d     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.mo637b(r6)     // Catch:{ all -> 0x074e }
        L_0x0598:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.performDestroy()     // Catch:{ all -> 0x074e }
            android.support.v4.app.ax r2 = r1.f787c     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r7 = 0
            r2.mo595d(r6, r7)     // Catch:{ all -> 0x074e }
            android.support.v4.app.cc r2 = r1.f788d     // Catch:{ all -> 0x074e }
            java.util.List r2 = r2.mo675g()     // Catch:{ all -> 0x074e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x074e }
        L_0x05af:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x05d3
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x074e }
            android.support.v4.app.ca r6 = (android.support.p031v4.app.C0209ca) r6     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x05af
            android.support.v4.app.Fragment r6 = r6.f785a     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            java.lang.String r7 = r7.mWho     // Catch:{ all -> 0x074e }
            java.lang.String r8 = r6.mTargetWho     // Catch:{ all -> 0x074e }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x074e }
            if (r7 == 0) goto L_0x05af
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            r6.mTarget = r7     // Catch:{ all -> 0x074e }
            r7 = 0
            r6.mTargetWho = r7     // Catch:{ all -> 0x074e }
            goto L_0x05af
        L_0x05d3:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            java.lang.String r6 = r2.mTargetWho     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x05e1
            android.support.v4.app.cc r7 = r1.f788d     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r7.mo669a(r6)     // Catch:{ all -> 0x074e }
            r2.mTarget = r6     // Catch:{ all -> 0x074e }
        L_0x05e1:
            android.support.v4.app.cc r2 = r1.f788d     // Catch:{ all -> 0x074e }
            r2.mo681m(r1)     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x05e8:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0608
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "movefrom ATTACHED: "
            r2.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r6.concat(r2)     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x0608:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.performDetach()     // Catch:{ all -> 0x074e }
            android.support.v4.app.ax r2 = r1.f787c     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r7 = 0
            r2.mo596e(r6, r7)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r6 = -1
            r2.mState = r6     // Catch:{ all -> 0x074e }
            r6 = 0
            r2.mHost = r6     // Catch:{ all -> 0x074e }
            r2.mParentFragment = r6     // Catch:{ all -> 0x074e }
            r2.mFragmentManager = r6     // Catch:{ all -> 0x074e }
            boolean r6 = r2.mRemoving     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x062c
            boolean r2 = r2.isInBackStack()     // Catch:{ all -> 0x074e }
            if (r2 != 0) goto L_0x062c
            goto L_0x063a
        L_0x062c:
            android.support.v4.app.cc r2 = r1.f788d     // Catch:{ all -> 0x074e }
            android.support.v4.app.bu r2 = r2.f799d     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r2 = r2.mo642f(r6)     // Catch:{ all -> 0x074e }
            if (r2 != 0) goto L_0x063a
            goto L_0x03bc
        L_0x063a:
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0658
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            r2.append(r10)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r6)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r10.concat(r2)     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x0658:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.initState()     // Catch:{ all -> 0x074e }
            goto L_0x03bc
        L_0x065f:
            if (r6 != 0) goto L_0x06bd
            r6 = -1
            if (r8 != r6) goto L_0x06bd
            boolean r6 = r2.mRemoving     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x06bd
            boolean r2 = r2.isInBackStack()     // Catch:{ all -> 0x074e }
            if (r2 != 0) goto L_0x06bd
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r2 = r2.mBeingSaved     // Catch:{ all -> 0x074e }
            if (r2 != 0) goto L_0x06bd
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0690
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "Cleaning up state of never attached fragment: "
            r2.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r6)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x0690:
            android.support.v4.app.cc r2 = r1.f788d     // Catch:{ all -> 0x074e }
            android.support.v4.app.bu r2 = r2.f799d     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.mo637b(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.cc r2 = r1.f788d     // Catch:{ all -> 0x074e }
            r2.mo681m(r1)     // Catch:{ all -> 0x074e }
            boolean r2 = android.support.p031v4.app.FragmentManager.m246Z(r14)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x06b8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r2.<init>()     // Catch:{ all -> 0x074e }
            r2.append(r10)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.append(r6)     // Catch:{ all -> 0x074e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x074e }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x074e }
        L_0x06b8:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r2.initState()     // Catch:{ all -> 0x074e }
        L_0x06bd:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r6 = r2.mHiddenChanged     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x074a
            android.view.View r6 = r2.mView     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x0723
            android.view.ViewGroup r6 = r2.mContainer     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x0723
            android.support.v4.app.FragmentManager r2 = r2.getParentFragmentManager()     // Catch:{ all -> 0x074e }
            r2.mo466ag()     // Catch:{ all -> 0x074e }
            android.support.v4.app.dd r2 = android.support.p031v4.app.C0239dd.m562k(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r6 = r1.f785a     // Catch:{ all -> 0x074e }
            boolean r6 = r6.mHidden     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x0700
            boolean r3 = android.support.p031v4.app.FragmentManager.m246Z(r3)     // Catch:{ all -> 0x074e }
            if (r3 == 0) goto L_0x06fc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r3.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r6 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            r3.append(r6)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r7 = r1.f785a     // Catch:{ all -> 0x074e }
            r3.append(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x074e }
            java.lang.String r3 = r6.concat(r3)     // Catch:{ all -> 0x074e }
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x074e }
        L_0x06fc:
            r2.mo751j(r14, r5, r1)     // Catch:{ all -> 0x074e }
            goto L_0x0723
        L_0x0700:
            boolean r6 = android.support.p031v4.app.FragmentManager.m246Z(r3)     // Catch:{ all -> 0x074e }
            if (r6 == 0) goto L_0x0720
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x074e }
            r6.<init>()     // Catch:{ all -> 0x074e }
            java.lang.String r7 = "SpecialEffectsController: Enqueuing show operation for fragment "
            r6.append(r7)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r8 = r1.f785a     // Catch:{ all -> 0x074e }
            r6.append(r8)     // Catch:{ all -> 0x074e }
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x074e }
            java.lang.String r6 = r7.concat(r6)     // Catch:{ all -> 0x074e }
            android.util.Log.v(r4, r6)     // Catch:{ all -> 0x074e }
        L_0x0720:
            r2.mo751j(r3, r5, r1)     // Catch:{ all -> 0x074e }
        L_0x0723:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            android.support.v4.app.FragmentManager r3 = r2.mFragmentManager     // Catch:{ all -> 0x074e }
            if (r3 == 0) goto L_0x0735
            boolean r4 = r2.mAdded     // Catch:{ all -> 0x074e }
            if (r4 == 0) goto L_0x0735
            boolean r2 = android.support.p031v4.app.FragmentManager.m247ai(r2)     // Catch:{ all -> 0x074e }
            if (r2 == 0) goto L_0x0735
            r3.f656w = r5     // Catch:{ all -> 0x074e }
        L_0x0735:
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            r3 = 0
            r2.mHiddenChanged = r3     // Catch:{ all -> 0x0747 }
            boolean r3 = r2.mHidden     // Catch:{ all -> 0x074e }
            r2.onHiddenChanged(r3)     // Catch:{ all -> 0x074e }
            android.support.v4.app.Fragment r2 = r1.f785a     // Catch:{ all -> 0x074e }
            android.support.v4.app.FragmentManager r2 = r2.mChildFragmentManager     // Catch:{ all -> 0x074e }
            r2.mo490u()     // Catch:{ all -> 0x074e }
            goto L_0x074a
        L_0x0747:
            r0 = move-exception
            r2 = r0
            goto L_0x0751
        L_0x074a:
            r2 = 0
            r1.f789e = r2
            return
        L_0x074e:
            r0 = move-exception
            r2 = r0
            r3 = 0
        L_0x0751:
            r1.f789e = r3
            goto L_0x0755
        L_0x0754:
            throw r2
        L_0x0755:
            goto L_0x0754
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.C0209ca.mo664e():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo665f(ClassLoader classLoader) {
        Bundle bundle = this.f785a.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f785a;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f785a;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f785a;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.f785a;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f785a;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f785a.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f785a;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo666g() {
        FragmentState fragmentState = new FragmentState(this.f785a);
        Fragment fragment = this.f785a;
        if (fragment.mState < 0 || fragmentState.f689m != null) {
            fragmentState.f689m = fragment.mSavedFragmentState;
        } else {
            fragmentState.f689m = mo660a();
            if (this.f785a.mTargetWho != null) {
                if (fragmentState.f689m == null) {
                    fragmentState.f689m = new Bundle();
                }
                fragmentState.f689m.putString("android:target_state", this.f785a.mTargetWho);
                int i = this.f785a.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.f689m.putInt("android:target_req_state", i);
                }
            }
        }
        this.f788d.mo673e(this.f785a.mWho, fragmentState);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo667h() {
        if (this.f785a.mView != null) {
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + this.f785a + " with view " + this.f785a.mView);
            }
            SparseArray sparseArray = new SparseArray();
            this.f785a.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f785a.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f785a.mViewLifecycleOwner.f845b.mo8590c(bundle);
            if (!bundle.isEmpty()) {
                this.f785a.mSavedViewRegistryState = bundle;
            }
        }
    }

    public C0209ca(C0178ax axVar, C0211cc ccVar, ClassLoader classLoader, C0173as asVar, FragmentState fragmentState) {
        this.f787c = axVar;
        this.f788d = ccVar;
        Fragment a = fragmentState.mo500a(asVar, classLoader);
        this.f785a = a;
        if (FragmentManager.m246Z(2)) {
            new StringBuilder("Instantiated fragment ").append(a);
            Log.v("FragmentManager", "Instantiated fragment ".concat(String.valueOf(a)));
        }
    }
}
