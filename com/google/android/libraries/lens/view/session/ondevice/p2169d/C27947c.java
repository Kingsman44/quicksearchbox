package com.google.android.libraries.lens.view.session.ondevice.p2169d;

import com.google.android.libraries.lens.common.text.C24140p;
import com.google.android.libraries.lens.common.text.C24141q;
import com.google.android.libraries.lens.view.p2069am.C25322bc;
import com.google.android.libraries.lens.view.p2069am.C25324be;
import com.google.android.libraries.lens.view.session.ondevice.p2168c.C27942p;
import com.google.common.p4522b.C58370cn;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.d.c */
/* compiled from: PG */
public final /* synthetic */ class C27947c implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f76103a;

    public /* synthetic */ C27947c(String str) {
        this.f76103a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f76103a;
        int i = C27949e.f76105a;
        String a = C24140p.m44838a(C24141q.m44842d(Locale.forLanguageTag(str)), (List) Collection.EL.stream(((C27942p) obj).mo33400b()).map(C27948d.f76104a).collect(C58370cn.f155946a));
        C25322bc bcVar = (C25322bc) C25324be.f68896e.createBuilder();
        bcVar.copyOnWrite();
        ((C25324be) bcVar.instance).f68900c = 1;
        bcVar.copyOnWrite();
        ((C25324be) bcVar.instance).f68898a = a;
        return (C25324be) bcVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
