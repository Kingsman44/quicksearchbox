package com.google.android.libraries.lens.view.utils;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56310h;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56318p;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.utils.f */
/* compiled from: PG */
public final /* synthetic */ class C28116f implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C28116f f76513a = new C28116f();

    private /* synthetic */ C28116f() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58833ax axVar;
        C56320r rVar = (C56320r) obj;
        C56318p pVar = rVar.f150101h;
        if (pVar == null) {
            pVar = C56318p.f150087c;
        }
        if ((pVar.f150089a & 4) != 0) {
            C56318p pVar2 = rVar.f150101h;
            if (pVar2 == null) {
                pVar2 = C56318p.f150087c;
            }
            axVar = C58833ax.m90834k(pVar2.f150090b);
        } else {
            axVar = C58836b.f156633a;
        }
        String str = (String) axVar.mo56109e(BuildConfig.FLAVOR);
        C56310h hVar = rVar.f150100g;
        if (hVar == null) {
            hVar = C56310h.f150072g;
        }
        return new Pair(str, hVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
