package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8638b;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.p5830s.C73908b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.p8369hq.C109248v;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.b.i */
/* compiled from: PG */
public final class C114957i {

    /* renamed from: a */
    public static final C59071e f318958a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.b.i");

    /* renamed from: b */
    public final Activity f318959b;

    /* renamed from: c */
    public final bm f318960c;

    /* renamed from: d */
    public final C68214a f318961d;

    /* renamed from: e */
    public final C58833ax f318962e;

    /* renamed from: f */
    public final C109248v f318963f;

    /* renamed from: g */
    public final C91097g f318964g;

    /* renamed from: h */
    public final C86124t f318965h;

    /* renamed from: i */
    public final C73908b f318966i;

    /* renamed from: j */
    public final C22871g f318967j;

    /* renamed from: k */
    public final ViewGroup f318968k;

    /* renamed from: l */
    public final C68214a f318969l;

    /* renamed from: m */
    public final List f318970m = new ArrayList();

    /* renamed from: n */
    public C28293k f318971n;

    /* renamed from: o */
    public ImageView f318972o;

    /* renamed from: p */
    private final C58833ax f318973p;

    /* renamed from: q */
    private final C22871g f318974q;

    public C114957i(Activity activity, bm bmVar, C68214a aVar, C58833ax axVar, C58833ax axVar2, C109248v vVar, C86124t tVar, C73908b bVar, C22871g gVar, C22871g gVar2, C68214a aVar2, C91097g gVar3, ViewGroup viewGroup) {
        this.f318959b = activity;
        this.f318960c = bmVar;
        this.f318961d = aVar;
        this.f318962e = axVar;
        this.f318973p = axVar2;
        this.f318963f = vVar;
        this.f318965h = tVar;
        this.f318966i = bVar;
        this.f318974q = gVar;
        this.f318967j = gVar2;
        this.f318969l = aVar2;
        this.f318964g = gVar3;
        this.f318968k = viewGroup;
    }

    /* renamed from: a */
    public final void mo101746a(LogoView logoView, float f, float f2, View.OnClickListener onClickListener) {
        logoView.mo28223c(f, f2);
        logoView.mo28225e(7, true);
        C28292j jVar = new C28292j(96309);
        jVar.mo33795i(5);
        logoView.getClass();
        C28295m.m52919e(logoView, jVar);
        this.f318970m.add(C28293k.m52908e(jVar, new C28293k[0]));
        logoView.setOnClickListener(onClickListener);
    }

    /* renamed from: b */
    public final void mo101747b(boolean z) {
        if (this.f318972o != null) {
            this.f318974q.mo28212l("setImageResource() on UI thread.", new C114949a(this, z));
            ImageView imageView = this.f318972o;
            imageView.getClass();
            imageView.setOnClickListener(new C89943l(new C114950b(this, z)));
        }
    }

    /* renamed from: c */
    public final void mo101748c(int i, boolean z) {
        C87565h hVar = new C87565h();
        hVar.mo81686b();
        hVar.f236509M = true;
        hVar.f236497A = this.f318965h.mo79746e(C90014bt.f247604kL);
        hVar.f236560f = i;
        hVar.f236541al = z;
        ((C87568k) this.f318973p.mo56107c()).mo81688b(this.f318959b, hVar.mo81685a());
    }
}
