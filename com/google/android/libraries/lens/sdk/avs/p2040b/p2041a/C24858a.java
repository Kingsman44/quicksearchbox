package com.google.android.libraries.lens.sdk.avs.p2040b.p2041a;

import com.google.android.libraries.lens.common.p1998a.C24093a;
import com.google.android.libraries.lens.common.text.C24134j;
import com.google.android.libraries.lens.common.text.C24135k;
import com.google.android.libraries.lens.common.text.C24138n;
import com.google.android.libraries.lens.common.text.C24139o;
import com.google.lens.p4707j.C62441br;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.sdk.avs.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C24858a implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C24858a f67911a = new C24858a();

    private /* synthetic */ C24858a() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C56233an anVar = (C56233an) obj;
        C24134j jVar = (C24134j) C24135k.f65892e.createBuilder();
        C56224ae aeVar = anVar.f149779c;
        if (aeVar == null) {
            aeVar = C56224ae.f149753h;
        }
        C62441br c = C24093a.m44747c(aeVar);
        jVar.copyOnWrite();
        c.getClass();
        ((C24135k) jVar.instance).f65895b = c;
        for (C56241av avVar : anVar.f149778b) {
            int size = ((C24135k) jVar.instance).f65896c.size();
            int size2 = anVar.f149778b.size() - 1;
            String str = " ";
            String str2 = (avVar.f149793a & 2) != 0 ? avVar.f149796d : str;
            if (size != size2) {
                str = str2;
            }
            C24138n nVar = (C24138n) C24139o.f65907f.createBuilder();
            String str3 = avVar.f149795c;
            nVar.copyOnWrite();
            str3.getClass();
            ((C24139o) nVar.instance).f65909a = str3;
            nVar.copyOnWrite();
            str.getClass();
            ((C24139o) nVar.instance).f65911c = str;
            C56224ae aeVar2 = avVar.f149797e;
            if (aeVar2 == null) {
                aeVar2 = C56224ae.f149753h;
            }
            C62441br c2 = C24093a.m44747c(aeVar2);
            nVar.copyOnWrite();
            c2.getClass();
            ((C24139o) nVar.instance).f65910b = c2;
            jVar.mo29541a((C24139o) nVar.build());
        }
        return (C24135k) jVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
