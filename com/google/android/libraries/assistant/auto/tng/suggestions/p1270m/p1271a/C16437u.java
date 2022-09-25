package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1224d.C16002a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.u */
/* compiled from: PG */
public final /* synthetic */ class C16437u implements Function {

    /* renamed from: a */
    public final /* synthetic */ C16416ag f48343a;

    public /* synthetic */ C16437u(C16416ag agVar) {
        this.f48343a = agVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C16416ag agVar = this.f48343a;
        String str = (String) obj;
        C58833ax j = C58833ax.m90833j(agVar.f48288c.mo22626a(str));
        if (j.mo56113h()) {
            return C60856cj.m92900i(j);
        }
        return ((C16002a) agVar.f48287b.mo27525b()).mo22654k(str);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
