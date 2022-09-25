package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a.p959a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12796i;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12798k;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12801n;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p958a.C13406r;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b.C13432r;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35648i;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.p2738b.C35640k;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.assistant.p3897e.p3921j.aet;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13376a implements C13406r {

    /* renamed from: a */
    public final /* synthetic */ C12801n f41136a;

    /* renamed from: b */
    public final /* synthetic */ C13432r f41137b;

    /* renamed from: c */
    public final /* synthetic */ C35640k f41138c;

    public /* synthetic */ C13376a(C12801n nVar, C13432r rVar, C35640k kVar) {
        this.f41136a = nVar;
        this.f41137b = rVar;
        this.f41138c = kVar;
    }

    /* renamed from: a */
    public final C35648i mo21061a(aet aet, boolean z) {
        C12801n nVar = this.f41136a;
        C35648i iVar = this.f41137b;
        C35648i iVar2 = this.f41138c;
        if (aet == aet.ALTERNATIVE) {
            if (true != z) {
                iVar = iVar2;
            }
            return nVar.mo20798a(iVar);
        } else if (aet == aet.DEFAULT) {
            if (true != z) {
                iVar = iVar2;
            }
            return new C12798k(new C12796i(nVar), iVar);
        } else {
            C35471g gVar = new C35471g("incorrect fetch arg");
            int i = aet.f134958c;
            throw ((C35471g) gVar.initCause(new IllegalArgumentException("Unknown source: " + i)));
        }
    }
}
