package com.google.android.apps.gsa.shared.p7148ui;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91945u;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91946v;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;

/* renamed from: com.google.android.apps.gsa.shared.ui.ap */
/* compiled from: PG */
final class C90640ap implements C90648ax {

    /* renamed from: a */
    final /* synthetic */ SuggestionGridLayout f253493a;

    /* renamed from: b */
    private C90637am f253494b;

    public C90640ap(SuggestionGridLayout suggestionGridLayout) {
        this.f253493a = suggestionGridLayout;
    }

    /* renamed from: a */
    public final View mo84928a(MotionEvent motionEvent) {
        if (this.f253493a.f253368e) {
            return null;
        }
        int x = (int) (motionEvent.getX() + 0.5f);
        int y = (int) (motionEvent.getY() + 0.5f);
        int childCount = this.f253493a.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = this.f253493a.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(this.f253493a.f253365b);
                if (!this.f253493a.f253365b.contains(x, y)) {
                    continue;
                } else {
                    if (childAt instanceof C91946v) {
                        C91946v vVar = (C91946v) childAt;
                        SuggestionGridLayout suggestionGridLayout = this.f253493a;
                        if (vVar.f256427k) {
                            int i = 0;
                            for (int i2 = 0; i2 < vVar.f256426j.getChildCount(); i2++) {
                                View childAt2 = vVar.f256426j.getChildAt(i2);
                                if (childAt2.getVisibility() != 8 && vVar.mo86603h(childAt2)) {
                                    i++;
                                }
                            }
                            if (i > 1) {
                                Point j = vVar.mo86646j(suggestionGridLayout, motionEvent);
                                View k = vVar.mo86647k(j.x, j.y);
                                if (k != null && ((C91945u) vVar.f256424h).f256421a.mo86603h(k)) {
                                }
                            }
                        }
                    }
                    C90637am e = C90637am.m147969e(childAt);
                    if (e != null && e.f253464a == childAt && SuggestionGridLayout.m147911a(e).f253474c) {
                        return childAt;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo84929b(View view) {
        this.f253493a.getParent().requestDisallowInterceptTouchEvent(true);
        C90637am e = C90637am.m147969e(view);
        this.f253494b = e;
        if (e != null) {
            if (!this.f253493a.f253369f.contains(e.f253464a)) {
                this.f253493a.f253369f.add(this.f253494b.f253464a);
            }
            this.f253494b.mo84925f(2);
        } else {
            SuggestionGridLayout.m147912d(view, 2);
        }
        SuggestionGridLayout suggestionGridLayout = this.f253493a;
        suggestionGridLayout.f253368e = true;
        suggestionGridLayout.invalidate();
    }

    /* renamed from: c */
    public final void mo84930c(View view) {
        SuggestionGridLayout suggestionGridLayout = this.f253493a;
        C90637am e = C90637am.m147969e(view);
        if (e != null) {
            C90639ao aoVar = new C90639ao(suggestionGridLayout, e);
            suggestionGridLayout.f253369f.remove(aoVar.f253491b.f253464a);
            if (SuggestionGridLayout.m147911a(aoVar.f253491b).f253475d) {
                C58801sm G = ((C58485gu) aoVar.f253491b.f253467d).listIterator(0);
                while (G.hasNext()) {
                    ((View) G.next()).setVisibility(8);
                }
            }
            aoVar.mo84881b();
        }
        suggestionGridLayout.f253368e = false;
        suggestionGridLayout.invalidate();
        this.f253494b = null;
    }

    /* renamed from: d */
    public final void mo84931d() {
    }

    /* renamed from: e */
    public final void mo84932e() {
        C90637am amVar = this.f253494b;
        if (amVar != null) {
            View view = amVar.f253464a;
            Math.max(0.0f, 1.0f - ((Math.abs(view.getTranslationX()) * 10.0f) / ((float) view.getWidth())));
            C90637am amVar2 = this.f253494b;
            View view2 = amVar2.f253465b;
            View view3 = amVar2.f253466c;
        }
    }

    /* renamed from: f */
    public final void mo84933f(View view) {
        C90637am e = C90637am.m147969e(view);
        if (e != null) {
            this.f253493a.f253369f.remove(e.f253464a);
            e.mo84925f(0);
        } else {
            SuggestionGridLayout.m147912d(view, 0);
        }
        SuggestionGridLayout suggestionGridLayout = this.f253493a;
        suggestionGridLayout.f253368e = false;
        this.f253494b = null;
        suggestionGridLayout.invalidate();
    }

    /* renamed from: g */
    public final boolean mo84934g(View view) {
        C90637am e;
        if (view.getParent() == null || (e = C90637am.m147969e(view)) == null) {
            return false;
        }
        return SuggestionGridLayout.m147911a(e).f253473b;
    }
}
