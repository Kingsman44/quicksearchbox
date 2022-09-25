package com.google.android.apps.gsa.staticplugins.recently.p8678a;

import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.recently.timeline.Timeline;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116203a;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116208ae;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116214f;
import com.google.android.apps.gsa.staticplugins.recently.view.group.C116226r;
import com.google.android.libraries.gsa.p1875j.C22840k;
import com.google.android.libraries.p576aq.p578b.C10503aj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.a.f */
/* compiled from: PG */
public final class C116023f implements C116203a {

    /* renamed from: a */
    public static final Property f321703a = C10503aj.m25470a(Timeline.class, "Timeline", C116020c.f321700a, C116021d.f321701a);

    /* renamed from: b */
    public final Context f321704b;

    /* renamed from: c */
    public final SparseArray f321705c = new SparseArray();

    /* renamed from: d */
    public Timeline f321706d = new Timeline((List) new ArrayList());

    /* renamed from: e */
    public int f321707e;

    /* renamed from: f */
    public int f321708f;

    /* renamed from: g */
    public final C116022e f321709g;

    /* renamed from: h */
    public C116208ae f321710h;

    public C116023f(Context context) {
        this.f321704b = context;
        this.f321709g = new C116022e(this);
    }

    /* renamed from: a */
    public final int mo102419a(int i) {
        return this.f321706d.f322178a[i].f322177h.length;
    }

    /* renamed from: b */
    public final C116018a mo102420b(int i, int i2) {
        int a = C22840k.m42693a(this.f321706d.f322178a[i].f322177h[i2].f62894c);
        if (a == 0) {
            a = 1;
        }
        int i3 = a - 1;
        C116018a aVar = (C116018a) this.f321705c.get(i3);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("No presenter registered for type: ".concat(Integer.toString(i3)));
    }

    /* renamed from: c */
    public final void mo102421c(View view, C116226r rVar) {
        ((TextView) view).setText(Integer.toString(mo102419a(rVar.f322281b)));
    }

    /* renamed from: d */
    public final void mo102422d(float f, View view) {
        view.setAlpha(Math.max(0.0f, Math.min(1.0f - f, 1.0f)));
        view.setClickable(f < 0.5f);
    }

    /* renamed from: e */
    public final void mo102423e(C116226r rVar, C116214f fVar, View view) {
        mo102420b(rVar.f322281b, fVar.f322256e).mo102411d(rVar.f322290k.mo124175a(), view);
    }

    /* renamed from: f */
    public final boolean mo102424f(int i) {
        return this.f321706d.f322178a[i].f322176g;
    }

    /* renamed from: g */
    public final void mo102425g(int i, C116018a aVar) {
        this.f321705c.put(i - 1, aVar);
        aVar.mo102412e(this.f321707e, this.f321708f);
    }
}
