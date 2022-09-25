package com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58585km;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61366ah;
import com.google.protobuf.C63088z;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.j.d */
/* compiled from: PG */
public final /* synthetic */ class C40444d implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C40444d f106164a = new C40444d();

    private /* synthetic */ C40444d() {
    }

    public final Object apply(Object obj) {
        C61366ah ahVar = (C61366ah) obj;
        int i = C40445e.f106165a;
        C63088z z = C63088z.m96153z(ahVar.f165946b);
        int i2 = ahVar.f165947c;
        C40442b bVar = new C40442b();
        bVar.f106151a = z;
        bVar.mo42440b(i2);
        boolean z2 = false;
        if (i2 >= 200 && i2 < 300) {
            z2 = true;
        }
        bVar.mo42441c(z2);
        C58585km kmVar = ahVar.f165945a;
        C58486gv gvVar = new C58486gv();
        for (Map.Entry entry : kmVar.mo54948A()) {
            gvVar.mo55419c(Optional.m71637of(C40447g.m70146b(((C61362ad) entry.getKey()).mo57931a())), (String) entry.getValue());
        }
        bVar.f106152b = Optional.m71637of(gvVar.mo55417a());
        return bVar.mo42439a();
    }
}
