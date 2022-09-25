package com.google.android.apps.search.webglide.bottombar;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.C5964w;
import com.bumptech.glide.load.p299c.p300a.C5837ap;
import com.bumptech.glide.load.p299c.p300a.C5860i;
import com.google.android.apps.search.webglide.p10699b.C142185p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.search.webglide.bottombar.i */
/* compiled from: PG */
public final class C142194i extends C0640fb {

    /* renamed from: a */
    public int f385759a = -1;

    /* renamed from: b */
    public final List f385760b = new ArrayList();

    /* renamed from: c */
    private final C47449e f385761c;

    /* renamed from: d */
    private final C47400m f385762d;

    /* renamed from: e */
    private final C28306ab f385763e;

    public C142194i(C47449e eVar, C47400m mVar, C28306ab abVar) {
        this.f385761c = eVar;
        this.f385762d = mVar;
        this.f385763e = abVar;
    }

    public final int getItemCount() {
        return this.f385760b.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C142193h hVar = (C142193h) ghVar;
        C142185p pVar = (C142185p) this.f385760b.get(i);
        C47449e eVar = this.f385761c;
        String str = pVar.f385728d;
        C5964w[] wVarArr = {new C5860i(), new C5837ap(10)};
        int i2 = C142193h.f385752g;
        ((C6007z) ((C6007z) ((C6007z) eVar.mo51286a().mo11873k(str).mo11952E(R.drawable.webglide_bottom_bar_error_thumbnail)).mo11970W(wVarArr)).mo11968U(1000)).mo12454r(hVar.f385754b);
        C47449e eVar2 = this.f385761c;
        ((C6007z) ((C6007z) eVar2.mo51286a().mo11873k(pVar.f385732h).mo11970W(new C5860i(), new C5837ap(10))).mo11968U(1000)).mo12454r(hVar.f385755c);
        hVar.f385753a.setText(pVar.f385729e);
        hVar.f385756d.setText(pVar.f385731g);
        if (i == this.f385759a) {
            hVar.f385758f.setVisibility(8);
            hVar.f385753a.setVisibility(8);
            hVar.f385757e.setVisibility(0);
            return;
        }
        hVar.f385758f.setVisibility(0);
        hVar.f385753a.setVisibility(0);
        hVar.f385757e.setVisibility(8);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C142193h(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.webglide_content_card, viewGroup, false), this.f385762d, this.f385763e);
    }
}
