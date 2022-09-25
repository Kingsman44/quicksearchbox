package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9910e;

import android.content.Context;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83778u;
import com.google.android.apps.search.assistant.verticals.ambient.p9905c.C130551a;
import com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9907b.C130573s;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.e.b */
/* compiled from: PG */
public final class C130588b implements C130551a {

    /* renamed from: a */
    public final Context f357684a;

    /* renamed from: b */
    private final C130573s f357685b;

    /* renamed from: c */
    private final C60887da f357686c;

    public C130588b(Context context, C130573s sVar, C60887da daVar) {
        this.f357684a = context;
        this.f357685b = sVar;
        this.f357686c = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo109724a(C83739ak akVar) {
        C83778u uVar;
        C83738aj ajVar = akVar.f228233b;
        if (ajVar == null) {
            ajVar = C83738aj.f228226c;
        }
        if (!(!(ajVar.f228228a == 9))) {
            C83738aj ajVar2 = akVar.f228233b;
            if (ajVar2 == null) {
                ajVar2 = C83738aj.f228226c;
            }
            if (ajVar2.f228228a == 9) {
                uVar = (C83778u) ajVar2.f228229b;
            } else {
                uVar = C83778u.f228339k;
            }
            if (!uVar.f228343c) {
                C130573s sVar = this.f357685b;
                C83730ab abVar = (C83730ab) akVar.toBuilder();
                String str = uVar.f228342b;
                abVar.copyOnWrite();
                C83739ak akVar2 = (C83739ak) abVar.instance;
                str.getClass();
                akVar2.f228232a |= 8;
                akVar2.f228236e = str;
                return sVar.mo109724a((C83739ak) abVar.build());
            }
            return C60922j.m93044g(this.f357685b.mo109724a(akVar), C47810es.m84963c(new C130587a(this, uVar)), this.f357686c);
        }
        C130573s sVar2 = this.f357685b;
        C83730ab abVar2 = (C83730ab) akVar.toBuilder();
        C50794cr crVar = C50794cr.SHOPPING_LIST_ONBOARDING;
        abVar2.copyOnWrite();
        C83739ak akVar3 = (C83739ak) abVar2.instance;
        akVar3.f228239h = crVar.f132222T;
        akVar3.f228232a |= 64;
        return sVar2.mo109724a((C83739ak) abVar2.build());
    }
}
