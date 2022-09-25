package com.google.android.libraries.lens.view.infopanel.p2145f;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.lens.view.infopanel.p2140b.C27025m;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28449s;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.lens.view.infopanel.f.c */
/* compiled from: PG */
public final class C27188c {

    /* renamed from: f */
    private static final C58974d f74312f = C58974d.m91135i("NSVVeLogger");

    /* renamed from: a */
    public final Set f74313a = new HashSet();

    /* renamed from: b */
    public final HashMap f74314b = new HashMap();

    /* renamed from: c */
    public ViewGroup f74315c;

    /* renamed from: d */
    ViewTreeObserver.OnGlobalLayoutListener f74316d;

    /* renamed from: e */
    ViewTreeObserver.OnScrollChangedListener f74317e;

    /* renamed from: g */
    private final NestedScrollView f74318g;

    /* renamed from: h */
    private final C28310af f74319h;

    /* renamed from: i */
    private final C28443m f74320i;

    /* renamed from: j */
    private final C28306ab f74321j;

    public C27188c(NestedScrollView nestedScrollView, C28310af afVar, C28443m mVar, C28306ab abVar) {
        this.f74318g = nestedScrollView;
        C58838bb.m90869d(nestedScrollView.getChildCount() != 1 ? false : true, "scrollView must have exactly one child.");
        C58838bb.m90869d(nestedScrollView.getChildAt(0) instanceof ViewGroup, "scrollView child is not a ViewGroup.");
        this.f74315c = (ViewGroup) nestedScrollView.getChildAt(0);
        this.f74319h = afVar;
        this.f74320i = mVar;
        this.f74321j = abVar;
    }

    /* renamed from: f */
    private final void m50404f(ViewGroup viewGroup, Rect rect) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            boolean contains = this.f74313a.contains(Integer.valueOf(childAt.hashCode()));
            if (childAt.getLocalVisibleRect(rect)) {
                if (this.f74314b.containsKey(Integer.valueOf(childAt.hashCode())) && !contains) {
                    C27025m mVar = (C27025m) this.f74314b.get(Integer.valueOf(childAt.hashCode()));
                    mVar.getClass();
                    C28313c a = this.f74319h.mo33805a(C28427h.m53115a(mVar.mo32464b()));
                    int a2 = mVar.mo32463a();
                    if (a2 != -1) {
                        a.mo33858f(C28449s.m53155a(a2));
                        a.mo33858f(C28449s.m53155a(a2));
                        a.mo33858f(C28375ak.m53059a((long) a2));
                    }
                    this.f74321j.mo33802c(childAt, a);
                    this.f74313a.add(Integer.valueOf(childAt.hashCode()));
                }
                if (childAt instanceof ViewGroup) {
                    m50404f((ViewGroup) childAt, rect);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo32618a() {
        if (this.f74316d != null) {
            ViewTreeObserver viewTreeObserver = this.f74318g.getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f74316d;
            onGlobalLayoutListener.getClass();
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.f74316d = null;
        }
        if (this.f74317e != null) {
            this.f74318g.getViewTreeObserver().removeOnScrollChangedListener(this.f74317e);
        }
        this.f74313a.clear();
        this.f74314b.clear();
    }

    /* renamed from: b */
    public final void mo32619b(View view) {
        int i;
        int hashCode = view.hashCode();
        Set set = this.f74313a;
        Integer valueOf = Integer.valueOf(hashCode);
        if (set.contains(valueOf)) {
            this.f74320i.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
            return;
        }
        if (this.f74314b.containsKey(valueOf)) {
            C27025m mVar = (C27025m) this.f74314b.get(valueOf);
            mVar.getClass();
            i = mVar.mo32464b();
        } else {
            i = -1;
        }
        ((C58970a) ((C58970a) f74312f.mo56226d()).mo56372aa(49589)).mo56387q("Attempted to log interaction on non-impressed VE with id=%d", i);
    }

    /* renamed from: c */
    public final void mo32620c() {
        Rect rect = new Rect();
        this.f74318g.getHitRect(rect);
        m50404f(this.f74315c, rect);
    }

    /* renamed from: d */
    public final void mo32621d(View view, C27025m mVar) {
        this.f74314b.put(Integer.valueOf(view.hashCode()), mVar);
    }

    /* renamed from: e */
    public final void mo32622e() {
        if (this.f74317e == null && this.f74316d == null) {
            this.f74317e = new C27186a(this);
            this.f74318g.getViewTreeObserver().addOnScrollChangedListener(this.f74317e);
            this.f74316d = new C27187b(this);
            ViewTreeObserver viewTreeObserver = this.f74318g.getViewTreeObserver();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f74316d;
            onGlobalLayoutListener.getClass();
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }
}
