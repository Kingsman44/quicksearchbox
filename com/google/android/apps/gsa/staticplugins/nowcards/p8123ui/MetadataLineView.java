package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.now.shared.p6421ui.C83420i;
import com.google.android.apps.gsa.now.shared.p6421ui.C83421j;
import com.google.p375ai.p378b.C7818lb;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.MetadataLineView */
/* compiled from: PG */
public class MetadataLineView extends LinearLayout {

    /* renamed from: a */
    public boolean f292771a;

    /* renamed from: b */
    public int f292772b;

    /* renamed from: c */
    protected C83420i f292773c;

    public MetadataLineView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.TextView mo94500b(com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105069f r7, com.google.p375ai.p378b.C7818lb r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            float r0 = r0.fontScale
            int r1 = r7.mo94510a(r8)
            r2 = 0
            if (r1 != 0) goto L_0x0017
        L_0x0015:
            r1 = r2
            goto L_0x0048
        L_0x0017:
            com.google.ai.b.la r1 = r7.mo94513d(r8)
            int r1 = r1.f27415aP
            int r3 = r6.f292772b
            int r3 = r3 << 16
            int r1 = r1 << 8
            r1 = r1 | r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r3
            int r0 = (int) r0
            r0 = r0 | r1
            com.google.android.apps.gsa.now.shared.ui.i r1 = r6.f292773c
            if (r1 == 0) goto L_0x0035
            com.google.android.apps.gsa.now.shared.ui.h r1 = r1.mo76754a(r0)
            com.google.android.apps.gsa.staticplugins.nowcards.ui.d r1 = (com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.C105067d) r1
            goto L_0x0036
        L_0x0035:
            r1 = r2
        L_0x0036:
            if (r1 != 0) goto L_0x0045
            android.widget.TextView r1 = r7.mo94512c(r8, r6)
            if (r1 == 0) goto L_0x0015
            com.google.android.apps.gsa.staticplugins.nowcards.ui.d r3 = new com.google.android.apps.gsa.staticplugins.nowcards.ui.d
            r3.<init>(r1, r0)
            r1 = r3
            goto L_0x0048
        L_0x0045:
            r1.mo94508a()
        L_0x0048:
            if (r1 != 0) goto L_0x004b
            return r2
        L_0x004b:
            android.view.View r0 = r1.f227389a
            android.widget.TextView r0 = (android.widget.TextView) r0
            boolean r3 = r8.f27428k
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x005c
            boolean r3 = r6.f292771a
            if (r3 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r3 = 0
            goto L_0x005d
        L_0x005c:
            r3 = 1
        L_0x005d:
            boolean r7 = r7.mo94514f(r8, r0, r3)
            if (r7 != 0) goto L_0x006b
            com.google.android.apps.gsa.now.shared.ui.i r7 = r6.f292773c
            if (r7 == 0) goto L_0x006a
            r7.mo76755b(r1)
        L_0x006a:
            return r2
        L_0x006b:
            android.view.View r7 = r1.f227389a
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setVisibility(r4)
            android.view.View r7 = r1.f227389a
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.addView(r7)
            int r7 = r8.f27426i
            if (r7 > 0) goto L_0x0081
            int r7 = r8.f27427j
            if (r7 <= 0) goto L_0x00ca
        L_0x0081:
            android.view.View r7 = r1.f227389a
            android.widget.TextView r7 = (android.widget.TextView) r7
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            if (r7 != 0) goto L_0x0092
            android.view.ViewGroup$MarginLayoutParams r7 = new android.view.ViewGroup$MarginLayoutParams
            r0 = -1
            r2 = -2
            r7.<init>(r0, r2)
        L_0x0092:
            boolean r0 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 != 0) goto L_0x0097
            goto L_0x00ca
        L_0x0097:
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r2 = r8.f27426i
            if (r2 <= 0) goto L_0x00b0
            float r2 = (float) r2
            android.util.DisplayMetrics r3 = r0.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r5, r2, r3)
            int r2 = (int) r2
            goto L_0x00b2
        L_0x00b0:
            int r2 = r7.bottomMargin
        L_0x00b2:
            int r8 = r8.f27427j
            if (r8 <= 0) goto L_0x00c1
            float r8 = (float) r8
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r8 = android.util.TypedValue.applyDimension(r5, r8, r0)
            int r8 = (int) r8
            goto L_0x00c3
        L_0x00c1:
            int r8 = r7.topMargin
        L_0x00c3:
            int r0 = r7.leftMargin
            int r3 = r7.rightMargin
            r7.setMargins(r0, r8, r3, r2)
        L_0x00ca:
            android.view.View r7 = r1.f227389a
            android.widget.TextView r7 = (android.widget.TextView) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8123ui.MetadataLineView.mo94500b(com.google.android.apps.gsa.staticplugins.nowcards.ui.f, com.google.ai.b.lb):android.widget.TextView");
    }

    /* renamed from: c */
    public final void mo94501c() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof C105066c) {
                    ((C105066c) childAt).mo94501c();
                    removeViewAt(childCount);
                } else {
                    C105067d dVar = this.f292773c != null ? (C105067d) C83420i.m132813c(childAt) : null;
                    if (dVar != null) {
                        dVar.mo94508a();
                    }
                    removeViewAt(childCount);
                    childAt.setBackground((Drawable) null);
                    removeDetachedView(childAt, false);
                    if (dVar != null) {
                        this.f292773c.mo76755b(dVar);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo94502d(C105069f fVar, List list, C83421j jVar) {
        if (this.f292773c == null && jVar != null) {
            this.f292773c = jVar.mo76756a(MetadataLineView.class);
        }
        mo94501c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7818lb lbVar = (C7818lb) it.next();
            if (lbVar.f27429l) {
                C105066c cVar = new C105066c(getContext(), this.f292773c);
                addView(cVar);
                cVar.mo94507a(fVar, lbVar);
            } else {
                mo94500b(fVar, lbVar);
            }
        }
        if (list.isEmpty()) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
    }

    public MetadataLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MetadataLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
    }

    public MetadataLineView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setOrientation(1);
    }
}
