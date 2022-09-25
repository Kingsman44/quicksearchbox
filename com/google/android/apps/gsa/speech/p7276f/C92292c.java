package com.google.android.apps.gsa.speech.p7276f;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6805i.C86109e;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.speech.f.c */
/* compiled from: PG */
public final class C92292c implements C86109e {

    /* renamed from: a */
    public static final C59071e f257356a = C59071e.m91332i("com.google.android.apps.gsa.speech.f.c");

    /* renamed from: b */
    public final Context f257357b;

    /* renamed from: c */
    public final C68214a f257358c;

    /* renamed from: d */
    boolean f257359d;

    /* renamed from: e */
    boolean f257360e;

    /* renamed from: f */
    boolean f257361f;

    /* renamed from: g */
    boolean f257362g;

    /* renamed from: h */
    private final C68214a f257363h;

    /* renamed from: i */
    private final C68214a f257364i;

    public C92292c(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f257357b = context;
        this.f257363h = aVar;
        this.f257364i = aVar2;
        this.f257358c = aVar3;
    }

    /* renamed from: a */
    public final void mo70818a(C86124t tVar, C86117m mVar) {
        C58976aa aaVar = C58975e.f156826a;
        boolean e = tVar.mo79746e(C90082eg.f250068e);
        boolean e2 = tVar.mo79746e(C90082eg.f250069f);
        if (!(this.f257359d && this.f257360e == e && this.f257361f == e2)) {
            this.f257359d = true;
            this.f257360e = e;
            this.f257361f = e2;
            Intent intent = new Intent("com.google.android.googlequicksearchbox.FROM_ANY_SCREEN_INTERACTOR_FLAG_CHANGED");
            intent.putExtra("com.google.android.googlequicksearchbox.FROM_ANY_SCREEN_INTERACTOR_FLAG_CHANGED", this.f257359d);
            this.f257357b.sendBroadcast(intent);
        }
        if (tVar.mo79746e(C90120fr.f250761A) && !this.f257362g) {
            C89994f fVar = (C89994f) this.f257363h.mo27525b();
            if (!fVar.mo83875aL()) {
                this.f257362g = true;
                if (!fVar.mo83824m(fVar.mo83882ab())) {
                    fVar.mo83900at();
                } else if (fVar.mo83817f()) {
                    fVar.mo83900at();
                } else {
                    C92518d dVar = (C92518d) this.f257364i.mo27525b();
                    if (dVar != null) {
                        dVar.mo87273a(new C92291b(this, dVar, fVar));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo70819b(C86124t tVar) {
        mo70818a(tVar, C86117m.f232762a);
    }
}
