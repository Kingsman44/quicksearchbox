package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.p6955b;

import com.google.android.apps.gsa.searchbox.p6960ui.C88703d;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41704d;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41705e;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.b.b */
/* compiled from: PG */
public final class C88653b implements C89200e, C89199d, C89204i, C89196a, C41705e, C88703d {

    /* renamed from: a */
    public boolean f239694a = false;

    /* renamed from: b */
    public boolean f239695b = false;

    /* renamed from: c */
    public C41704d f239696c;

    /* renamed from: d */
    public C88698g f239697d;

    /* renamed from: e */
    public int f239698e = 0;

    /* renamed from: f */
    public C60870cx f239699f;

    /* renamed from: g */
    private int f239700g = 0;

    /* renamed from: h */
    private int f239701h = 0;

    /* renamed from: i */
    private int f239702i = 0;

    /* renamed from: j */
    private C22871g f239703j;

    /* renamed from: k */
    private int f239704k = 0;

    /* renamed from: l */
    private boolean f239705l = false;

    /* renamed from: a */
    public final int mo44295a() {
        return 200;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88715p pVar = (C88715p) obj;
        this.f239696c = pVar.f239941m;
        this.f239697d = pVar.f239937i;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo82222f(C90931ca caVar) {
    }

    /* renamed from: g */
    public final void mo82223g(C22871g gVar) {
        this.f239703j = gVar;
    }

    /* renamed from: h */
    public final void mo82224h() {
        this.f239705l = true;
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        C88709j jVar = (C88709j) obj;
        this.f239694a = jVar.f239850G;
        this.f239695b = jVar.f239851H;
        this.f239700g = jVar.f239852I;
        this.f239701h = jVar.f239853J;
        this.f239702i = jVar.f239854K;
    }

    /* renamed from: hE */
    public final void mo78006hE() {
        this.f239698e = 0;
        this.f239704k = 0;
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: hM */
    public final void mo44296hM(Response response) {
        C58485gu<Suggestion> guVar = response.f108862b;
        HashSet hashSet = new HashSet();
        boolean z = false;
        for (Suggestion suggestion : guVar) {
            boolean equals = suggestion.f108915p.equals(C41669ai.f108958g);
            z += equals ^ true ? 1 : 0;
            if (!hashSet.contains(suggestion.f108915p)) {
                z += equals ? 1 : 0;
                hashSet.add(suggestion.f108915p);
            }
        }
        this.f239704k = z ? 1 : 0;
        if (mo82326m()) {
            mo82323j();
            mo82324k();
            return;
        }
        mo82323j();
    }

    /* renamed from: i */
    public final void mo82227i() {
        mo82323j();
        this.f239705l = false;
    }

    /* renamed from: j */
    public final void mo82323j() {
        C60870cx cxVar = this.f239699f;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f239699f = null;
        }
    }

    /* renamed from: m */
    public final boolean mo82326m() {
        if (!this.f239705l) {
            return false;
        }
        if ((!this.f239694a && !this.f239695b) || this.f239704k < this.f239701h || this.f239698e >= this.f239702i) {
            return false;
        }
        C41704d dVar = this.f239696c;
        dVar.getClass();
        return dVar.mo44287a().length() == 0;
    }

    /* renamed from: k */
    public final void mo82324k() {
        C22871g gVar = this.f239703j;
        gVar.getClass();
        this.f239699f = gVar.mo28208h("Hide Keyboard", (long) this.f239700g, new C88652a(this));
    }

    /* renamed from: l */
    public final void mo82325l(boolean z) {
        if (z) {
            C41704d dVar = this.f239696c;
            dVar.getClass();
            dVar.mo44288b();
            return;
        }
        C41704d dVar2 = this.f239696c;
        dVar2.getClass();
        dVar2.mo44293h();
    }
}
