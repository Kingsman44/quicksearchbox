package com.google.android.apps.search.webglide.defaultviewer;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.search.webglide.bottombar.C142186a;
import com.google.android.apps.search.webglide.p10702e.p10703a.C142218b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.webglide.defaultviewer.m */
/* compiled from: PG */
final class C142214m implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C142211j f385815a;

    public C142214m(C142211j jVar) {
        this.f385815a = jVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C142186a aVar = (C142186a) bVar;
        C142211j jVar = this.f385815a;
        int i = aVar.f385737a;
        ((ViewPager2) jVar.f385797d.requireView().findViewById(R.id.webglide_viewpager)).mo9211c(i, true);
        C28443m mVar = jVar.f385805l;
        C28440j h = C28442l.m53142h();
        h.mo33895b(C142218b.m230876a(jVar.f385802i.mo117061h(i).f385726b));
        mVar.mo33853c(h.mo33894a(), C28485y.m53234a(aVar.f385738b));
        return C47392e.f123115a;
    }
}
