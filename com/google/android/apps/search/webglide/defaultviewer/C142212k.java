package com.google.android.apps.search.webglide.defaultviewer;

import android.view.View;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.p299c.p300a.C5837ap;
import com.bumptech.glide.load.p299c.p300a.C5860i;
import com.google.android.apps.search.webglide.p10699b.C142185p;
import com.google.android.apps.search.webglide.p10700c.C142195a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1635au.C19567d;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.webglide.defaultviewer.k */
/* compiled from: PG */
final class C142212k implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C142211j f385813a;

    public C142212k(C142211j jVar) {
        this.f385813a = jVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C142195a aVar = (C142195a) bVar;
        C142211j jVar = this.f385813a;
        jVar.mo117060d(false);
        ((C19567d) jVar.f385809p.f103013dl.mo6453a()).mo24822a(1, new Object[0]);
        View view = jVar.f385797d.getView();
        if (view != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.webglide_bottom_navigation_image_next_thumbnail);
            imageView.setVisibility(0);
            C142185p h = jVar.f385802i.mo117061h(((ViewPager2) view.findViewById(R.id.webglide_viewpager)).f13893c + 1);
            C47449e eVar = jVar.f385799f;
            ((C6007z) ((C6007z) ((C6007z) ((C6007z) eVar.mo51286a().mo11873k(h.f385728d).mo11970W(new C5860i(), new C5837ap(10))).mo11963P(R.drawable.webglide_ic_default_image_thumbnail)).mo11952E(R.drawable.webglide_ic_error_publisher_thumbnail)).mo11968U(300)).mo12454r(imageView);
        }
        return C47392e.f123115a;
    }
}
