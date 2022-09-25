package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.content.Intent;
import com.google.android.apps.gsa.assistant.settings.shared.p5795f.C73748d;
import com.google.assistant.p3861at.C50286rl;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.bg */
/* compiled from: PG */
public final /* synthetic */ class C9923bg implements Function {

    /* renamed from: a */
    public final /* synthetic */ C9935bs f34026a;

    public /* synthetic */ C9923bg(C9935bs bsVar) {
        this.f34026a = bsVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C9935bs bsVar = this.f34026a;
        C58833ax c = C58557jl.m90122c(bsVar.f34050j, new C9930bn((C50286rl) obj));
        if (!c.mo56113h()) {
            return C9931bo.f34036a;
        }
        Intent a = ((C73748d) c.mo56107c()).mo65219a();
        a.putExtra("extra_assistant_settings_entry_source", "settings_main_promo_section");
        return new C9932bp(bsVar, a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
