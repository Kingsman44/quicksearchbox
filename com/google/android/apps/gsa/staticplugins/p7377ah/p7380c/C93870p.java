package com.google.android.apps.gsa.staticplugins.p7377ah.p7380c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.p7070b.p7089h.C90244b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.shared.p7148ui.header.CorpusBarView;
import com.google.android.apps.gsa.staticplugins.p7377ah.p7379b.C93851a;
import com.google.android.apps.gsa.staticplugins.p7377ah.p7379b.C93854d;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100045al;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.material.bottomsheet.C44565p;
import com.google.common.p4522b.C58485gu;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.c.p */
/* compiled from: PG */
public final class C93870p extends C22939d implements C90244b {

    /* renamed from: a */
    public final Map f262155a = new HashMap();

    /* renamed from: b */
    public final C93854d f262156b;

    /* renamed from: c */
    public final C93851a f262157c;

    /* renamed from: d */
    public final LayoutInflater f262158d;

    /* renamed from: e */
    public final Context f262159e;

    /* renamed from: f */
    public C58485gu f262160f = C58485gu.m89845m();

    /* renamed from: g */
    public CorpusBarView f262161g;

    /* renamed from: h */
    public C93858d f262162h;

    /* renamed from: i */
    public C100045al f262163i;

    /* renamed from: j */
    private final C90314b f262164j;

    /* renamed from: k */
    private int f262165k;

    /* renamed from: l */
    private final boolean f262166l;

    /* renamed from: m */
    private View f262167m;

    /* renamed from: n */
    private C90315c f262168n;

    public C93870p(C22945j jVar, C93854d dVar, C93851a aVar, Context context, C90314b bVar) {
        super(jVar);
        this.f262156b = dVar;
        this.f262157c = aVar;
        this.f262158d = LayoutInflater.from(context);
        this.f262159e = context;
        this.f262164j = bVar;
        this.f262166l = true;
    }

    /* renamed from: a */
    public final int mo83948a() {
        CorpusBarView corpusBarView = this.f262161g;
        if (corpusBarView == null) {
            return 0;
        }
        return corpusBarView.getLayoutParams().height;
    }

    /* renamed from: b */
    public final View mo83949b() {
        return this.f262161g;
    }

    /* renamed from: c */
    public final void mo83950c(int i) {
        View view = this.f262167m;
        if (view != null && i != this.f262165k) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            this.f262167m.setLayoutParams(marginLayoutParams);
            this.f262165k = i;
        }
    }

    /* renamed from: d */
    public final boolean mo83951d() {
        return ((Boolean) ((C93873s) this.f262156b).f262174c.f63720e).booleanValue();
    }

    /* renamed from: e */
    public final void mo83952e(C100045al alVar) {
        this.f262163i = alVar;
        if (alVar != null) {
            alVar.f279773a.mo91719c(((Boolean) ((C93873s) this.f262156b).f262174c.f63720e).booleanValue());
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        C93858d dVar = this.f262162h;
        if (dVar != null) {
            C44565p pVar = dVar.f262134f;
            if (pVar != null) {
                pVar.dismiss();
            }
            dVar.f262134f = null;
        }
        if (this.f262166l) {
            C90314b bVar = this.f262164j;
            C90315c cVar = this.f262168n;
            cVar.getClass();
            bVar.mo83995b(cVar);
            this.f262168n = null;
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = this.f262158d.inflate(R.layout.corpusbar, (ViewGroup) null, false);
        mo28295iC(inflate);
        View findViewById = inflate.findViewById(R.id.top_nav_parent_container);
        findViewById.getClass();
        this.f262167m = findViewById;
        CorpusBarView corpusBarView = (CorpusBarView) inflate.findViewById(R.id.corpus_bar_view);
        corpusBarView.getClass();
        this.f262161g = corpusBarView;
        ((C93873s) this.f262156b).f262174c.mo28726b(new C93866l(this));
        ((C93873s) this.f262156b).f262172a.mo28726b(new C93867m(this));
        ((C93873s) this.f262156b).f262173b.mo28726b(new C93868n(this));
        ((C93873s) this.f262156b).f262175d.mo28726b(new C93869o(this));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        if (this.f262166l) {
            C93864j jVar = new C93864j(this);
            this.f262168n = jVar;
            this.f262164j.mo83994a(jVar);
        }
    }
}
