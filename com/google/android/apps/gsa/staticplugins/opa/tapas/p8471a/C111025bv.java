package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113126ak;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.common.base.C58890d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.bv */
/* compiled from: PG */
public final /* synthetic */ class C111025bv implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111029bz f309208a;

    public /* synthetic */ C111025bv(C111029bz bzVar) {
        this.f309208a = bzVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111029bz bzVar = this.f309208a;
        C48582b bVar = (C48582b) obj;
        String str = (String) bzVar.f309214a.mo79752r(C90063do.f249633i).getOrDefault(bzVar.f309215b.mo99002h(bVar), BuildConfig.FLAVOR);
        C58976aa aaVar = C58975e.f156826a;
        C60870cx e = bzVar.f309215b.mo98999e(bVar);
        AtomicReference atomicReference = new AtomicReference();
        C60856cj.m92895d(e).mo57334a(new C110980ar(atomicReference, e), C60826bg.f164896a);
        if (TextUtils.isEmpty(atomicReference.toString())) {
            return Stream.CC.empty();
        }
        return Stream.CC.concat(Collection.EL.stream(C113126ak.f313427a.mo56155i(C58890d.m90988c(str))), Collection.EL.stream(C113126ak.f313427a.mo56155i(C58890d.m90988c(atomicReference.toString()))));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
