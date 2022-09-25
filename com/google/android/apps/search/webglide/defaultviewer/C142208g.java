package com.google.android.apps.search.webglide.defaultviewer;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.search.webglide.p10702e.p10703a.C142218b;
import com.google.android.apps.search.webglide.p10704f.C142225c;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.webglide.defaultviewer.g */
/* compiled from: PG */
final class C142208g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ViewPager2 f385788a;

    /* renamed from: b */
    final /* synthetic */ C142211j f385789b;

    public C142208g(C142211j jVar, ViewPager2 viewPager2) {
        this.f385789b = jVar;
        this.f385788a = viewPager2;
    }

    public final void onClick(View view) {
        C28443m mVar = this.f385789b.f385805l;
        C28440j h = C28442l.m53142h();
        h.mo33895b(C142218b.m230876a(this.f385789b.f385802i.mo117061h(this.f385788a.f13893c + 1).f385726b));
        mVar.mo33853c(h.mo33894a(), C28485y.m53234a(view));
        C142225c cVar = this.f385789b.f385810q;
        if (cVar != null) {
            cVar.mo117063a();
        }
        ViewPager2 viewPager2 = this.f385788a;
        viewPager2.mo9211c(viewPager2.f13893c + 1, true);
    }
}
