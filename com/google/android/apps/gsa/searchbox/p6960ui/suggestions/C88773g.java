package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88805ap;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91110i;
import com.google.android.apps.gsa.shared.util.p7187ui.C91121t;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.g */
/* compiled from: PG */
public final class C88773g extends HorizontalScrollView implements C88786t {

    /* renamed from: a */
    private static final TimeInterpolator f240225a = C91107f.f254406b;

    /* renamed from: b */
    private boolean f240226b;

    /* renamed from: c */
    private boolean f240227c;

    /* renamed from: d */
    private boolean f240228d;

    /* renamed from: e */
    private long f240229e;

    /* renamed from: f */
    private long f240230f;

    /* renamed from: g */
    private final int f240231g;

    /* renamed from: h */
    private C88845y f240232h;

    /* renamed from: i */
    private final List f240233i = new ArrayList();

    /* renamed from: j */
    private ListIterator f240234j;

    /* renamed from: k */
    private int f240235k;

    /* renamed from: l */
    private final LinearLayout f240236l;

    /* renamed from: m */
    private int f240237m;

    public C88773g(int i, Context context) {
        super(context);
        this.f240231g = i;
        setTag(R.id.suggestion_container_type, Integer.valueOf(i));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f240236l = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 16));
        addView(linearLayout);
        setHorizontalScrollBarEnabled(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036 A[LOOP:0: B:1:0x0007->B:15:0x0036, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x003a A[EDGE_INSN: B:32:0x003a->B:17:0x003a ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo82487b(int r6) {
        /*
            r5 = this;
            android.widget.LinearLayout r0 = r5.f240236l
            int r0 = r0.getChildCount()
            r1 = 0
        L_0x0007:
            r2 = -1
            if (r1 >= r0) goto L_0x0039
            if (r1 < 0) goto L_0x0032
            android.widget.LinearLayout r3 = r5.f240236l
            int r3 = r3.getChildCount()
            if (r1 < r3) goto L_0x0015
            goto L_0x0032
        L_0x0015:
            android.widget.LinearLayout r3 = r5.f240236l
            android.view.View r3 = r3.getChildAt(r1)
            int r4 = r3.getId()
            if (r4 == r2) goto L_0x0032
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L_0x0032
            boolean r4 = r3.isFocusable()
            if (r4 == 0) goto L_0x0032
            int r3 = r3.getId()
            goto L_0x0033
        L_0x0032:
            r3 = -1
        L_0x0033:
            if (r3 == r2) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0039:
            r3 = -1
        L_0x003a:
            r0 = 2
            if (r6 == r0) goto L_0x0063
            r0 = 17
            if (r6 == r0) goto L_0x0062
            r0 = 33
            if (r6 == r0) goto L_0x0063
            r0 = 66
            if (r6 == r0) goto L_0x0062
            r0 = 130(0x82, float:1.82E-43)
            if (r6 != r0) goto L_0x004e
            goto L_0x0063
        L_0x004e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus direction "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L_0x0062:
            return r2
        L_0x0063:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88773g.mo82487b(int):int");
    }

    /* renamed from: c */
    public final int mo82513c() {
        return this.f240231g;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88845y yVar = new C88845y(this);
        this.f240232h = yVar;
        yVar.mo82630b(((C88715p) obj).f239931c);
    }

    /* renamed from: e */
    public final C88803an mo82514e(int i) {
        if (this.f240234j.hasNext()) {
            C88803an anVar = (C88803an) this.f240234j.next();
            if (anVar.mo82342b(i)) {
                this.f240235k++;
                return anVar;
            }
            C88803an a = this.f240232h.mo82629a(i);
            if (a == null) {
                this.f240234j.previous();
                return null;
            }
            this.f240236l.removeView(anVar.mo82585s());
            this.f240232h.mo82631c(anVar);
            LinearLayout linearLayout = this.f240236l;
            int i2 = this.f240235k + 1;
            this.f240235k = i2;
            linearLayout.addView(a.mo82585s(), i2);
            this.f240234j.set(a);
            return a;
        }
        C88803an a2 = this.f240232h.mo82629a(i);
        if (a2 != null) {
            this.f240234j.add(a2);
            this.f240235k++;
            this.f240236l.addView(a2.mo82585s());
        }
        return a2;
    }

    /* renamed from: f */
    public final void mo82515f(List list) {
    }

    /* renamed from: g */
    public final void mo82516g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f240236l.addView((View) it.next(), 0);
            this.f240237m++;
        }
    }

    /* renamed from: h */
    public final void mo82519h() {
        this.f240236l.removeViews(0, this.f240237m);
        this.f240237m = 0;
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        int i;
        int i2;
        int i3;
        C88787u a = ((C88709j) obj).mo82433a(this.f240231g);
        int i4 = a.f240291e;
        if (i4 != -1) {
            setId(i4);
        }
        boolean z = a.f240288b;
        int i5 = 0;
        if (a.f240283I) {
            setBackgroundDrawable(new C88769c(getContext().getResources(), a.f240289c, a.f240290d != 0 ? getContext().getResources().getDimensionPixelSize(a.f240290d) : 0, a.f240311y, a.f240285K));
        } else {
            setBackgroundResource(a.f240289c);
        }
        setVisibility(8);
        boolean z2 = a.f240281G;
        this.f240226b = z2;
        this.f240227c = a.f240282H;
        this.f240229e = a.f240312z;
        this.f240230f = a.f240276B;
        this.f240228d = z2 & this.f240228d;
        boolean z3 = a.f240302p;
        if (z3) {
            int i6 = a.f240303q;
            i = 0;
        } else {
            Resources resources = getContext().getResources();
            int i7 = a.f240294h;
            i = resources.getDimensionPixelSize(R.dimen.default_suggestion_container_margin_left);
        }
        if (z3) {
            i2 = a.f240304r;
        } else {
            i2 = getContext().getResources().getDimensionPixelSize(a.f240295i);
        }
        if (z3) {
            int i8 = a.f240305s;
            i3 = 0;
        } else {
            Resources resources2 = getContext().getResources();
            int i9 = a.f240296j;
            i3 = resources2.getDimensionPixelSize(R.dimen.default_suggestion_container_margin_right);
        }
        if (z3) {
            int i10 = a.f240306t;
        } else {
            Resources resources3 = getContext().getResources();
            int i11 = a.f240297k;
            i5 = resources3.getDimensionPixelSize(R.dimen.default_suggestion_container_margin_bottom);
        }
        a.f240277C.setMargins(i, i2, i3, i5);
        setLayoutParams(a.f240277C);
    }

    /* renamed from: i */
    public final void mo82520i() {
        while (this.f240234j.hasNext()) {
            C88803an anVar = (C88803an) this.f240234j.next();
            this.f240232h.mo82631c(anVar);
            this.f240234j.remove();
            this.f240236l.removeView(anVar.mo82585s());
        }
        int size = this.f240233i.size() - 1;
        Iterator it = this.f240233i.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 8;
            int i4 = 1;
            if (!it.hasNext()) {
                break;
            }
            C88803an anVar2 = (C88803an) it.next();
            int i5 = i2 == 0 ? 4 : 0;
            if (i2 != size) {
                i3 = 0;
            }
            int i6 = i3 | i5;
            if (i2 != 0) {
                i4 = 0;
            }
            anVar2.mo82537f(new C88805ap(0, i2, i6 | i4 | (i2 == size ? 2 : 0)));
            i2++;
        }
        boolean z = this.f240235k != -1;
        if (this.f240226b && getVisibility() != 0 && z) {
            this.f240228d = true;
        }
        if (true != z) {
            i = 8;
        }
        setVisibility(i);
        post(new C88772f(this));
    }

    /* renamed from: j */
    public final void mo82521j() {
    }

    /* renamed from: k */
    public final void mo82522k() {
        this.f240234j = this.f240233i.listIterator();
        this.f240235k = -1;
        mo82519h();
    }

    /* renamed from: l */
    public final void mo82523l() {
        this.f240234j.remove();
        this.f240232h.mo82631c((C88803an) this.f240234j.previous());
        LinearLayout linearLayout = this.f240236l;
        int i = this.f240235k;
        this.f240235k = i - 1;
        linearLayout.removeViewAt(i);
    }

    /* renamed from: m */
    public final void mo82491m(C91110i iVar) {
        View view = null;
        View view2 = null;
        for (int i = 0; i < this.f240236l.getChildCount(); i++) {
            View childAt = this.f240236l.getChildAt(i);
            int id = childAt.getId();
            if (id != -1 && childAt.isFocusable()) {
                if (view2 == null) {
                    view = childAt;
                }
                childAt.setNextFocusUpId(C91121t.m148887a(iVar.f254420b, id));
                childAt.setNextFocusDownId(C91121t.m148887a(iVar.f254421c, id));
                if (view2 != null) {
                    childAt.setNextFocusLeftId(view2.getId());
                    view2.setNextFocusRightId(id);
                    view2.setNextFocusForwardId(id);
                }
                view2 = childAt;
            }
        }
        if (view != null && view2 != null) {
            view.setNextFocusLeftId(view2.getId());
            view2.setNextFocusRightId(view.getId());
            view2.setNextFocusForwardId(C91121t.m148887a(iVar.f254424f, view2.getId()));
        }
    }

    /* renamed from: n */
    public final boolean mo82524n() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f240228d && !C90772bp.m148283J(getContext())) {
            int childCount = this.f240236l.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = this.f240236l.getChildAt(i5);
                float f = this.f240227c ? ((float) (-childAt.getMeasuredHeight())) * 0.32f : 0.0f;
                childAt.setAlpha(0.0f);
                childAt.setTranslationY(f);
                childAt.animate().translationY(0.0f).alpha(1.0f).setDuration(this.f240229e).setStartDelay(this.f240230f).setInterpolator(f240225a).withLayer();
            }
        }
        this.f240228d = false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f240236l == null || getWidth() >= this.f240236l.getWidth() + getPaddingLeft() + getPaddingRight()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void scrollTo(int i, int i2) {
    }
}
