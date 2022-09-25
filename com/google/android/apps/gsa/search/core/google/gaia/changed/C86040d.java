package com.google.android.apps.gsa.search.core.google.gaia.changed;

import com.google.android.apps.gsa.assistant.shared.C73850cd;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6761u.C85601a;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.changed.d */
/* compiled from: PG */
public final class C86040d implements C118549h {

    /* renamed from: a */
    public final C92518d f232609a;

    /* renamed from: b */
    private final C86054o f232610b;

    /* renamed from: c */
    private final C85651bb f232611c;

    /* renamed from: d */
    private final C73850cd f232612d;

    /* renamed from: e */
    private final C90931ca f232613e;

    /* renamed from: f */
    private final C85601a f232614f;

    public C86040d(C86054o oVar, C85651bb bbVar, C92518d dVar, C73850cd cdVar, C90931ca caVar, C85601a aVar) {
        this.f232610b = oVar;
        this.f232611c = bbVar;
        this.f232609a = dVar;
        this.f232612d = cdVar;
        this.f232613e = caVar;
        this.f232614f = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        String F;
        C92518d dVar;
        String F2 = this.f232610b.mo79659F();
        this.f232610b.mo79680n();
        if (F2 != null && (((F = this.f232610b.mo79659F()) == null || !F.equals(F2)) && (dVar = this.f232609a) != null)) {
            dVar.mo87273a(new C86039c(this, F));
        }
        this.f232614f.mo79091b();
        this.f232612d.e();
        this.f232611c.mo79161x(this.f232610b.mo79668a());
        return this.f232613e.mo85136a(new C86038b(), TimeUnit.SECONDS.toMillis(10));
    }
}
