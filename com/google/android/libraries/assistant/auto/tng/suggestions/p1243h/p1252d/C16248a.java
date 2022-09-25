package com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1252d;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11671ab;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11675af;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16091aq;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.h.d.a */
/* compiled from: PG */
public final /* synthetic */ class C16248a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C16267t f47855a;

    /* renamed from: b */
    public final /* synthetic */ C16091aq f47856b;

    /* renamed from: c */
    public final /* synthetic */ C11675af f47857c;

    public /* synthetic */ C16248a(C16267t tVar, C16091aq aqVar, C11675af afVar) {
        this.f47855a = tVar;
        this.f47856b = aqVar;
        this.f47857c = afVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C16267t tVar = this.f47855a;
        C16091aq aqVar = this.f47856b;
        C11675af afVar = this.f47857c;
        C60870cx b = tVar.f47893f.mo23063b();
        if (((Boolean) tVar.f47899l.mo17428b()).booleanValue()) {
            cxVar = C47633f.m84733g(b).mo51516i(new C16255h(tVar, aqVar), tVar.f47895h).mo51515h(C16256i.f47873a, tVar.f47896i);
        } else {
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        C60870cx i = C60856cj.m92900i(C58485gu.m89845m());
        boolean booleanValue = ((Boolean) tVar.f47891d.mo22630e(aqVar.mo22733g()).mo56106b(new C16260m(tVar)).mo56109e(false)).booleanValue();
        String str = (String) tVar.f47900m.get(aqVar.mo22733g());
        C11671ab abVar = afVar.f37667b;
        if (abVar == null) {
            abVar = C11671ab.f37655d;
        }
        String str2 = abVar.f37658b;
        boolean z = ((Boolean) tVar.f47898k.mo17428b()).booleanValue() && str != null && str2.equals("com.google.android.googlequicksearchbox");
        boolean equals = Objects.equals(str, str2);
        if (booleanValue && (z || equals)) {
            aqVar.mo22733g();
            i = C47633f.m84733g(tVar.f47892e.mo22663t(aqVar.mo22735i())).mo51515h(C16253f.f47866a, tVar.f47896i);
        }
        C47633f i2 = C47633f.m84733g(i).mo51516i(new C16254g(tVar, aqVar, afVar, b), tVar.f47895h);
        return C47636i.m84744c(i2, cxVar).mo51518a(new C16257j(tVar, cxVar, i2), tVar.f47896i);
    }
}
