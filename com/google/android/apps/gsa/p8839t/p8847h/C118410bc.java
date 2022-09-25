package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58487gw;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.t.h.bc */
/* compiled from: PG */
public final /* synthetic */ class C118410bc implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C118410bc f328648a = new C118410bc();

    private /* synthetic */ C118410bc() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C51058ev evVar;
        C58487gw gwVar = C118426bs.f328679a;
        C51098gh ghVar = ((C52560wg) obj).f137949e;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        String str = evVar.f132944b;
        return !str.isEmpty() ? C58833ax.m90834k(str) : C58836b.f156633a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
