package com.facebook.litho.widget;

import android.content.Context;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0657fs;
import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.C0710hr;
import android.support.p033v7.widget.RecyclerView;
import androidx.core.p098j.C2043bi;
import com.facebook.litho.C6128bi;
import com.facebook.litho.C6154cb;
import com.facebook.litho.C6276fs;
import com.facebook.litho.C6278fu;
import com.facebook.litho.C6281fx;
import com.facebook.litho.C6411u;
import com.facebook.litho.C6564z;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.google.android.libraries.elements.p1708c.p1710b.C20747a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.litho.widget.cv */
/* compiled from: PG */
final class C6490cv {

    /* renamed from: a */
    static final C0646fh f19256a = new C6489cu();

    /* renamed from: a */
    static C6497db m17566a(Context context) {
        return new C6497db(context, new C6431aq(context));
    }

    /* renamed from: b */
    protected static void m17567b(C6281fx fxVar) {
        fxVar.f18496a = 0;
    }

    /* renamed from: c */
    protected static void m17568c(C6411u uVar, int i) {
        int i2 = i + 1;
        if (uVar.f19012e != null) {
            uVar.mo13349g(new C6278fu(0, Integer.valueOf(i2)), "updateState:Recycler.onUpdateMeasure");
        }
    }

    /* renamed from: d */
    protected static void m17569d(int i, C6281fx fxVar) {
        fxVar.f18496a = Integer.valueOf(i);
    }

    /* renamed from: e */
    protected static boolean m17570e(@C6118b C6468c cVar) {
        return cVar.mo13329g();
    }

    /* renamed from: f */
    protected static boolean m17571f(@C6118b C6128bi biVar, @C6118b C6128bi biVar2, @C6118b C6128bi biVar3, @C6118b C6128bi biVar4, @C6118b C6128bi biVar5, @C6118b C6128bi biVar6, @C6118b C6128bi biVar7, @C6118b(mo12872a = C6119c.COLOR) C6128bi biVar8, @C6118b(mo12872a = C6119c.COLOR) C6128bi biVar9, @C6118b C6128bi biVar10, @C6118b C6128bi biVar11, @C6118b C6128bi biVar12, @C6118b C6128bi biVar13, @C6118b C6128bi biVar14, @C6118b(mo12872a = C6119c.DIMEN_SIZE) C6128bi biVar15, @C6118b C6128bi biVar16, C6128bi biVar17) {
        C6128bi biVar18 = biVar;
        C6128bi biVar19 = biVar2;
        C6128bi biVar20 = biVar3;
        C6128bi biVar21 = biVar4;
        C6128bi biVar22 = biVar5;
        C6128bi biVar23 = biVar6;
        C6128bi biVar24 = biVar7;
        C6128bi biVar25 = biVar8;
        C6128bi biVar26 = biVar9;
        C6128bi biVar27 = biVar10;
        C6128bi biVar28 = biVar11;
        C6128bi biVar29 = biVar12;
        C6128bi biVar30 = biVar13;
        C6128bi biVar31 = biVar14;
        C6128bi biVar32 = biVar15;
        C6128bi biVar33 = biVar16;
        C6128bi biVar34 = biVar17;
        if (((Integer) biVar34.f18143a).intValue() == ((Integer) biVar34.f18144b).intValue() && biVar18.f18143a == biVar18.f18144b && ((Boolean) biVar19.f18143a).equals(biVar19.f18144b) && ((Boolean) biVar20.f18143a).equals(biVar20.f18144b) && ((Integer) biVar21.f18143a).equals(biVar21.f18144b) && ((Integer) biVar22.f18143a).equals(biVar22.f18144b) && ((Integer) biVar23.f18143a).equals(biVar23.f18144b) && ((Integer) biVar24.f18143a).equals(biVar24.f18144b) && ((Boolean) biVar27.f18143a).equals(biVar27.f18144b) && ((Integer) biVar28.f18143a).equals(biVar28.f18144b) && ((Boolean) biVar30.f18143a).equals(biVar30.f18144b) && ((Boolean) biVar31.f18143a).equals(biVar31.f18144b) && ((Integer) biVar32.f18143a).equals(biVar32.f18144b)) {
            Integer num = (Integer) biVar25.f18143a;
            Integer num2 = (Integer) biVar25.f18144b;
            if (num != null ? !num.equals(num2) : num2 != null) {
                return true;
            }
            if (((Integer) biVar26.f18143a).equals(biVar26.f18144b)) {
                C6128bi biVar35 = biVar16;
                C0646fh fhVar = (C0646fh) biVar35.f18143a;
                C0646fh fhVar2 = (C0646fh) biVar35.f18144b;
                if (fhVar != null ? !fhVar.getClass().equals(fhVar2.getClass()) : fhVar2 != null) {
                    return true;
                }
                C6128bi biVar36 = biVar12;
                C0648fj fjVar = (C0648fj) biVar36.f18143a;
                C0648fj fjVar2 = (C0648fj) biVar36.f18144b;
                if (fjVar == null) {
                    if (fjVar2 == null) {
                        return false;
                    }
                } else if (!fjVar.equals(fjVar2)) {
                    return true;
                } else {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    /* renamed from: g */
    protected static void m17572g(C6497db dbVar, @C6118b C6468c cVar, @C6118b C6484cp cpVar, @C6118b List list, @C6118b C0710hr hrVar, @C6118b boolean z, @C6118b C20747a aVar, @C6118b C0657fs fsVar, @C6118b C6154cb cbVar) {
        C6488ct ctVar = null;
        dbVar.setContentDescription((CharSequence) null);
        dbVar.setEnabled(z && cbVar != null);
        if (cbVar != null) {
            ctVar = new C6488ct(cbVar);
        }
        dbVar.f13508a = ctVar;
        RecyclerView recyclerView = dbVar.f19266p;
        if (recyclerView != null) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    recyclerView.addOnScrollListener((C0658ft) it.next());
                }
            }
            if (aVar != null) {
                ((C6431aq) recyclerView).f19081a = aVar;
            }
            if (fsVar != null) {
                recyclerView.mOnItemTouchListeners.add(fsVar);
            }
            if (hrVar != null && recyclerView.mOnFlingListener == null) {
                hrVar.mo3197g(recyclerView);
            }
            cVar.mo13326X();
            if (cpVar != null) {
                cpVar.f19252b = dbVar;
            }
            if (dbVar.f19267q) {
                recyclerView.requestLayout();
                dbVar.f19267q = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
    }

    /* renamed from: h */
    static void m17573h(C6564z zVar, @C6118b C6468c cVar) {
        cVar.mo13324V(zVar.mo12882H(), zVar.mo12901a());
    }

    /* renamed from: i */
    static void m17574i(C6411u uVar, int i, int i2, C6276fs fsVar, @C6118b C6468c cVar) {
        C6154cb cbVar;
        if (cVar.mo13328f() || cVar.mo13329g()) {
            int i3 = C6442ba.f19091T;
            cbVar = C6442ba.m15817L(C6442ba.class, "Recycler", uVar, 946341036, new Object[]{uVar});
        } else {
            cbVar = null;
        }
        cVar.mo13322T(fsVar, i, i2, cbVar);
    }

    /* renamed from: j */
    static void m17575j(C6497db dbVar, @C6118b C6468c cVar, @C6118b C6484cp cpVar, @C6118b C0657fs fsVar, @C6118b List list) {
        RecyclerView recyclerView = dbVar.f19266p;
        if (recyclerView != null) {
            cVar.mo13330i();
            if (cpVar != null) {
                cpVar.f19252b = null;
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    recyclerView.removeOnScrollListener((C0658ft) it.next());
                }
            }
            if (fsVar != null) {
                recyclerView.removeOnItemTouchListener(fsVar);
            }
            if (fsVar != null) {
                recyclerView.removeOnItemTouchListener(fsVar);
            }
            ((C6431aq) recyclerView).f19081a = null;
            dbVar.f13508a = null;
            return;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
    }

    /* renamed from: k */
    static void m17576k(C6497db dbVar, @C6118b C6468c cVar, @C6118b C0710hr hrVar) {
        RecyclerView recyclerView = dbVar.f19266p;
        if (recyclerView != null) {
            recyclerView.setId(-1);
            cVar.mo13325W(recyclerView);
            if (hrVar != null) {
                hrVar.mo3197g((RecyclerView) null);
            }
            dbVar.f19266p.setItemAnimator(dbVar.f19268r);
            dbVar.f19268r = null;
            return;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
    }

    /* renamed from: l */
    static void m17577l(C6497db dbVar, @C6118b C6468c cVar, @C6118b boolean z, @C6118b int i, @C6118b int i2, @C6118b int i3, @C6118b int i4, @C6118b(mo12872a = C6119c.COLOR) int i5, @C6118b boolean z2, @C6118b boolean z3, @C6118b(mo12872a = C6119c.DIMEN_SIZE) int i6, @C6118b int i7, @C6118b int i8, @C6118b CharSequence charSequence, @C6118b C0646fh fhVar) {
        RecyclerView recyclerView = dbVar.f19266p;
        if (recyclerView != null) {
            recyclerView.setContentDescription(charSequence);
            recyclerView.mHasFixedSize = true;
            recyclerView.setClipToPadding(z);
            dbVar.setClipToPadding(z);
            C2043bi.m5556aj(recyclerView, i, i3, i2, i4);
            recyclerView.setClipChildren(z2);
            dbVar.setClipChildren(z2);
            recyclerView.getScrollingChildHelper().mo5279a(z3);
            dbVar.f13510c.mo5279a(z3);
            recyclerView.setScrollBarStyle(0);
            recyclerView.setHorizontalFadingEdgeEnabled(false);
            recyclerView.setVerticalFadingEdgeEnabled(false);
            recyclerView.setFadingEdgeLength(i6);
            recyclerView.setId(i7);
            recyclerView.setOverScrollMode(i8);
            dbVar.mo8790i(i5);
            if (fhVar == f19256a) {
                fhVar = new C6489cu();
            }
            RecyclerView recyclerView2 = dbVar.f19266p;
            dbVar.f19268r = recyclerView2.mItemAnimator;
            recyclerView2.setItemAnimator(fhVar);
            cVar.mo13323U(recyclerView);
            return;
        }
        throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout");
    }
}
