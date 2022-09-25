package com.google.android.libraries.lens.sdk.avs.p2040b.p2041a;

import com.google.android.libraries.lens.common.text.C24135k;
import com.google.android.libraries.lens.common.text.C24139o;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.sdk.avs.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C24859b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C24859b f67912a = new C24859b();

    private /* synthetic */ C24859b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C24135k kVar = (C24135k) obj;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < kVar.f65896c.size(); i++) {
            C24139o oVar = (C24139o) kVar.f65896c.get(i);
            sb.append(oVar.f65909a);
            if (i < kVar.f65896c.size() - 1) {
                sb.append(oVar.f65911c);
            }
        }
        return sb;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
