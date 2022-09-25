package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a.p959a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12801n;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a.C13406r;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35648i;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2738b.C35640k;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.assistant.p3897e.p3921j.aet;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C13386k implements C13406r {

    /* renamed from: a */
    public final /* synthetic */ C12801n f41156a;

    /* renamed from: b */
    public final /* synthetic */ C35640k f41157b;

    public /* synthetic */ C13386k(C12801n nVar, C35640k kVar) {
        this.f41156a = nVar;
        this.f41157b = kVar;
    }

    /* renamed from: a */
    public final C35648i mo21061a(aet aet, boolean z) {
        C12801n nVar = this.f41156a;
        C35640k kVar = this.f41157b;
        if (aet == aet.ALTERNATIVE) {
            return nVar.mo20798a(kVar);
        }
        C35471g gVar = new C35471g("incorrect fetch arg");
        int i = aet.f134958c;
        throw ((C35471g) gVar.initCause(new IllegalArgumentException("Unknown source: " + i)));
    }
}
