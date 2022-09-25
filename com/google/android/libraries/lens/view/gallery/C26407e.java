package com.google.android.libraries.lens.view.gallery;

import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.GridLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.util.Size;
import com.google.android.libraries.lens.view.gallery.data.C26403v;
import com.google.android.libraries.lens.view.gallery.data.C26405x;
import com.google.android.libraries.lens.view.gallery.data.C26406y;
import com.google.android.libraries.lens.view.gallery.p2108a.C26296a;
import com.google.android.libraries.lens.view.gallery.p2110c.C26336d;
import com.google.android.libraries.lens.view.gallery.p2111d.C26361g;
import com.google.android.libraries.lens.view.gallery.p2111d.C26362h;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58485gu;
import dagger.p5294a.C68221g;

/* renamed from: com.google.android.libraries.lens.view.gallery.e */
/* compiled from: PG */
public final /* synthetic */ class C26407e implements C26317ar {

    /* renamed from: a */
    public final /* synthetic */ C26420g f71845a;

    public /* synthetic */ C26407e(C26420g gVar) {
        this.f71845a = gVar;
    }

    /* renamed from: a */
    public final void mo31516a(Size size) {
        C26420g gVar = this.f71845a;
        int a = C26296a.m48541a(gVar.f71898c.getResources(), size.getWidth());
        if (gVar.f71903h == null || a != gVar.f71904i) {
            gVar.f71904i = a;
            C26406y c = gVar.f71899d.mo31596c();
            C26362h hVar = gVar.f71897b;
            C26403v vVar = gVar.f71896a;
            C26405x b = c.mo31579b();
            C58485gu f = c.mo31606f(vVar);
            vVar.getClass();
            b.getClass();
            f.getClass();
            C21370a aVar = (C21370a) hVar.f71671a.mo17428b();
            aVar.getClass();
            Fragment fragment = (Fragment) ((C68221g) hVar.f71672b).f184583a;
            fragment.getClass();
            C47449e eVar = (C47449e) hVar.f71673c.mo17428b();
            eVar.getClass();
            C28443m mVar = (C28443m) hVar.f71674d.mo17428b();
            mVar.getClass();
            C26336d dVar = (C26336d) hVar.f71675e.mo17428b();
            dVar.getClass();
            C47770dh dhVar = (C47770dh) hVar.f71676f.mo17428b();
            dhVar.getClass();
            C28306ab abVar = (C28306ab) hVar.f71677g.mo17428b();
            abVar.getClass();
            gVar.f71903h = new C26361g(vVar, b, f, a, aVar, fragment, eVar, mVar, dVar, dhVar, abVar);
            RecyclerView a2 = gVar.mo31625a();
            a2.setAdapter(gVar.f71903h);
            a2.setLayoutManager(new GridLayoutManager(gVar.f71898c.getContext(), a));
        }
    }
}
