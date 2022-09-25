package com.google.android.apps.gsa.speech.p7272e.p7274b;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90936cf;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.speech.e.b.f */
/* compiled from: PG */
public final class C92244f extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C8476as f257181a;

    /* renamed from: b */
    final /* synthetic */ C90936cf f257182b;

    /* renamed from: c */
    final /* synthetic */ C92248j f257183c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92244f(C92248j jVar, C8476as asVar, C90936cf cfVar) {
        super("delete language", 2, 0);
        this.f257183c = jVar;
        this.f257181a = asVar;
        this.f257182b = cfVar;
    }

    public final void run() {
        C92248j jVar = this.f257183c;
        C8476as asVar = this.f257181a;
        C90936cf cfVar = this.f257182b;
        jVar.f257193g.mo86922a(new File(jVar.f257189c.getDir("g3_models", 0), asVar.f29417b), true, new C92245g(jVar, cfVar));
    }
}
