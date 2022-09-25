package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102292e;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102295h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23198ac;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64631b;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ba */
/* compiled from: PG */
public final class C102328ba extends C22939d {

    /* renamed from: a */
    public static final C59071e f285577a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.images.viewer.ui.ba");

    /* renamed from: b */
    public final C102292e f285578b;

    /* renamed from: c */
    public final Context f285579c;

    /* renamed from: d */
    public C102360cf f285580d;

    /* renamed from: e */
    public View f285581e;

    /* renamed from: f */
    public ViewPager f285582f;

    /* renamed from: g */
    public C102320at f285583g;

    /* renamed from: h */
    public C102358cd f285584h;

    /* renamed from: i */
    public int f285585i = -1;

    /* renamed from: j */
    public C65926d f285586j = C65926d.f179289b;

    /* renamed from: k */
    public boolean f285587k = false;

    /* renamed from: l */
    public boolean f285588l = false;

    /* renamed from: m */
    public final Map f285589m = new HashMap();

    /* renamed from: n */
    private final C102295h f285590n;

    public C102328ba(C22945j jVar, C102292e eVar, C102295h hVar, Context context, C102360cf cfVar) {
        super(jVar);
        this.f285578b = eVar;
        this.f285590n = hVar;
        this.f285579c = context;
        this.f285580d = cfVar;
    }

    /* renamed from: e */
    public final void mo93131e() {
        if (this.f285583g == null && !this.f285589m.isEmpty() && this.f285585i != -1 && !this.f285586j.equals(C65926d.f179289b) && this.f285587k) {
            if (((C64631b) ((C23249a) this.f285590n.mo93045b()).mo28725a()).f175207i) {
                this.f285580d = new C102330bc();
            }
            C102320at atVar = new C102320at(this.f285581e, this.f285589m, this.f285586j, this.f285584h, this.f285580d);
            this.f285583g = atVar;
            this.f285582f.mo9146k(atVar);
            this.f285582f.mo9137f(new C102326az(this));
            this.f285582f.post(new C102323aw(this));
        }
    }

    /* renamed from: f */
    public final void mo93132f(boolean z) {
        C102378t tVar = (C102378t) this.f285589m.get(((C23249a) this.f285590n.mo93046c()).mo28725a());
        if (tVar != null) {
            ImageViewerPage imageViewerPage = tVar.f285699a;
            imageViewerPage.setAlpha(true != z ? 1.0f : 0.0f);
            C102301aa aaVar = new C102301aa(imageViewerPage, z);
            if (z) {
                imageViewerPage.getViewTreeObserver().addOnGlobalLayoutListener(new C102310aj(imageViewerPage, aaVar));
            } else {
                aaVar.run();
            }
        }
    }

    /* renamed from: g */
    public final void mo93133g(String str) {
        for (C102378t tVar : this.f285589m.values()) {
            if (tVar.f285706h.f285681c.f179303b.equals(str)) {
                ImageViewerPage imageViewerPage = tVar.f285699a;
                boolean a = C102345br.f285630a.mo93150a(tVar.f285706h.f285681c);
                imageViewerPage.f285457d.mo93065a(a);
                imageViewerPage.f285456c.mo93063a(a);
            }
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        this.f285581e = LayoutInflater.from(this.f285579c).inflate(R.layout.monet_image_viewer, (ViewGroup) null, false);
        this.f285584h = new C102358cd(this.f285581e.findViewById(R.id.image_viewer_visual_elements), this.f285580d);
        ViewPager viewPager = (ViewPager) this.f285581e.findViewById(R.id.monet_viewer_view_pager);
        this.f285582f = viewPager;
        viewPager.mo9150o(this.f285579c.getResources().getDimensionPixelSize(R.dimen.monet_viewer_page_margin));
        this.f285582f.mo9162p(new ColorDrawable(-1));
        this.f285582f.setVisibility(8);
        this.f285582f.mo9171w();
        mo28295iC(this.f285581e);
        C2043bi.m5526T(this.f285581e, new C102324ax(this));
        ((C23249a) this.f285590n.mo93045b()).mo28726b(new C102321au(this));
        ((C23249a) this.f285590n.mo93046c()).mo28726b(new C102322av(this));
        ((C23198ac) this.f285590n.mo93047d()).mo28657c(new C102325ay(this));
    }
}
