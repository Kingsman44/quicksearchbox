package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.android.apps.p471d.p472a.p473a.p475b.p476a.C9027a;
import com.google.assistant.p3886c.p3889c.C50765c;
import com.google.assistant.p3886c.p3889c.C50767e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.n */
/* compiled from: PG */
public final /* synthetic */ class C130958n implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C130958n f358312a = new C130958n();

    private /* synthetic */ C130958n() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C59071e eVar = C130964t.f358314a;
        C50767e eVar2 = ((C50765c) obj).f132107e;
        if (eVar2 == null) {
            eVar2 = C50767e.f132109d;
        }
        int i = eVar2.f132113c;
        C9027a a = C9027a.m23575a(i);
        if (a != null && !a.equals(C9027a.DEFAULT)) {
            return Stream.CC.m71935of(a);
        }
        ((C59052c) ((C59052c) C130964t.f358314a.mo56226d()).mo56372aa(38994)).mo56387q("Feature type id %d does not have an associated feature type - not extracting sub cards", i);
        return Stream.CC.empty();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
