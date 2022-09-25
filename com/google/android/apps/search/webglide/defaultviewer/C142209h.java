package com.google.android.apps.search.webglide.defaultviewer;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.search.webglide.p10702e.p10703a.C142218b;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.webglide.defaultviewer.h */
/* compiled from: PG */
final class C142209h implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ViewPager2 f385790a;

    /* renamed from: b */
    final /* synthetic */ C142211j f385791b;

    public C142209h(C142211j jVar, ViewPager2 viewPager2) {
        this.f385791b = jVar;
        this.f385790a = viewPager2;
    }

    public final void onClick(View view) {
        C28443m mVar = this.f385791b.f385805l;
        C28440j h = C28442l.m53142h();
        h.mo33895b(C142218b.m230876a(this.f385791b.f385802i.mo117061h(this.f385790a.f13893c - 1).f385726b));
        mVar.mo33853c(h.mo33894a(), C28485y.m53234a(view));
        ViewPager2 viewPager2 = this.f385790a;
        viewPager2.mo9211c(viewPager2.f13893c - 1, true);
    }
}
