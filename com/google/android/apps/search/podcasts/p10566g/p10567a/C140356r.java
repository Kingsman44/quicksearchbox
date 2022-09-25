package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.support.p033v7.widget.C0660fv;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140369d;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140370e;
import com.google.android.apps.search.podcasts.p10600q.C140943b;
import com.google.android.apps.search.podcasts.p10600q.C140946e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28449s;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.play.unison.binding.C31951a;
import com.google.android.libraries.play.unison.binding.C31963al;
import com.google.android.libraries.play.unison.binding.C31969ar;
import com.google.android.libraries.play.unison.binding.C31970as;
import com.google.android.libraries.play.unison.binding.C31975ax;
import com.google.android.libraries.play.unison.binding.C31987m;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.android.libraries.play.unison.binding.C31992r;
import com.google.android.libraries.play.unison.binding.C31993s;
import com.google.android.libraries.play.unison.binding.C31996v;
import com.google.android.libraries.play.unison.binding.C31999y;
import com.google.android.libraries.play.unison.binding.C32000z;

/* renamed from: com.google.android.apps.search.podcasts.g.a.r */
/* compiled from: PG */
final class C140356r extends C31993s {

    /* renamed from: c */
    private final C31969ar f381260c;

    /* renamed from: d */
    private final C28306ab f381261d;

    /* renamed from: e */
    private final C28310af f381262e;

    /* renamed from: j */
    private final TextView f381263j;

    public C140356r(C31975ax axVar, C0660fv fvVar, C28306ab abVar, C28310af afVar, View view) {
        super(view);
        this.f381261d = abVar;
        this.f381262e = afVar;
        this.f381263j = (TextView) view.findViewById(R.id.podcasts_show_carousel_title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.podcasts_show_carousel_recycler);
        C140943b.m228894a(recyclerView, fvVar);
        C31969ar a = C31963al.m59554a(recyclerView, new C31996v(new C32000z(C140370e.class, axVar)), C31969ar.f85962j, C140355q.f381259a, C31999y.f85999a, C31963al.f85947a);
        this.f381260c = a;
        mo37763k(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo37761c(Object obj, C31989o oVar) {
        C140369d dVar = (C140369d) obj;
        this.f381263j.setText(dVar.f381309a);
        mo37764l(this.f381260c, C140946e.m228899a(dVar.f381310b));
        C28306ab abVar = this.f381261d;
        View view = this.f85977f;
        C28313c a = this.f381262e.mo33805a(C28427h.m53115a(dVar.f381311c));
        C31989o oVar2 = ((C31992r) oVar).f85990a;
        if (oVar2 != null) {
            C31970as asVar = (C31970as) ((C31987m) oVar2).f85985a;
            asVar.getClass();
            a.mo33858f(C28449s.m53155a(asVar.mo37732a()));
            a.mo33858f(C28375ak.m53059a((long) dVar.f381310b.hashCode()));
            abVar.mo33802c(view, a);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo37762d() {
        C31951a.m59536b(this.f381260c);
        C28306ab.m52929e(this.f85977f);
    }
}
