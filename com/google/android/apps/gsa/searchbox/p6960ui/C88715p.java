package com.google.android.apps.gsa.searchbox.p6960ui;

import android.util.SparseArray;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88760ae;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89198c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41704d;
import com.google.common.p4522b.C58485gu;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.p */
/* compiled from: PG */
public final class C88715p implements C89198c {

    /* renamed from: t */
    private static final Comparator f239927t = C88712m.f239904a;

    /* renamed from: u */
    private static final Comparator f239928u = C88713n.f239905a;

    /* renamed from: a */
    public final C58485gu f239929a;

    /* renamed from: b */
    public final C58485gu f239930b;

    /* renamed from: c */
    public final C58485gu f239931c;

    /* renamed from: d */
    public final C58485gu f239932d;

    /* renamed from: e */
    public final C58485gu f239933e;

    /* renamed from: f */
    public final SparseArray f239934f;

    /* renamed from: g */
    public final C88701b f239935g;

    /* renamed from: h */
    public final C88708i f239936h;

    /* renamed from: i */
    public final C88698g f239937i;

    /* renamed from: j */
    public final C88710k f239938j;

    /* renamed from: k */
    public final C88705f f239939k;

    /* renamed from: l */
    public final C88706g f239940l;

    /* renamed from: m */
    public final C41704d f239941m;

    /* renamed from: n */
    public final C88707h f239942n;

    /* renamed from: o */
    public final C88760ae f239943o;

    /* renamed from: p */
    public final C88702c f239944p;

    /* renamed from: q */
    public final C88727aj f239945q;

    /* renamed from: r */
    public final C90476a f239946r;

    /* renamed from: s */
    public final C88703d f239947s;

    /* renamed from: v */
    private final C58485gu f239948v;

    /* renamed from: a */
    public final List mo82285a() {
        return this.f239948v;
    }

    public C88715p(C88714o oVar) {
        C88701b bVar = oVar.f239913h;
        bVar.getClass();
        this.f239935g = bVar;
        C88708i iVar = oVar.f239914i;
        iVar.getClass();
        this.f239936h = iVar;
        C88698g gVar = oVar.f239915j;
        gVar.getClass();
        this.f239937i = gVar;
        C88710k kVar = oVar.f239916k;
        kVar.getClass();
        this.f239938j = kVar;
        oVar.f239917l.getClass();
        C88705f fVar = oVar.f239918m;
        fVar.getClass();
        this.f239939k = fVar;
        C88706g gVar2 = oVar.f239919n;
        gVar2.getClass();
        this.f239940l = gVar2;
        C41704d dVar = oVar.f239920o;
        dVar.getClass();
        this.f239941m = dVar;
        C88707h hVar = oVar.f239921p;
        hVar.getClass();
        this.f239942n = hVar;
        C88760ae aeVar = oVar.f239922q;
        aeVar.getClass();
        this.f239943o = aeVar;
        C88702c cVar = oVar.f239923r;
        cVar.getClass();
        this.f239944p = cVar;
        C88727aj ajVar = oVar.f239924s;
        ajVar.getClass();
        this.f239945q = ajVar;
        C90476a aVar = oVar.f239925t;
        aVar.getClass();
        this.f239946r = aVar;
        this.f239947s = oVar.f239926u;
        Collections.sort(oVar.f239907b, f239927t);
        Collections.sort(oVar.f239908c, f239928u);
        this.f239948v = oVar.f239906a.mo55394f();
        this.f239929a = C58485gu.m89842j(oVar.f239907b);
        this.f239930b = C58485gu.m89842j(oVar.f239908c);
        this.f239931c = oVar.f239909d.mo55394f();
        this.f239932d = oVar.f239910e.mo55394f();
        this.f239933e = oVar.f239911f.mo55394f();
        this.f239934f = oVar.f239912g.clone();
    }
}
