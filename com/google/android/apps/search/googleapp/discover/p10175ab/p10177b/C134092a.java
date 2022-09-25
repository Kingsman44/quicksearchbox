package com.google.android.apps.search.googleapp.discover.p10175ab.p10177b;

import com.google.common.base.C58817ah;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.discover.ab.b.a */
/* compiled from: PG */
public final /* synthetic */ class C134092a implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C134092a f365273a = new C134092a();

    private /* synthetic */ C134092a() {
    }

    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        if (optional.isPresent()) {
            String str = (String) optional.get();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            str.getClass();
            ufVar.f164254i |= 8192;
            ufVar.f164166bT = str;
        }
        return (C60555uf) tzVar.build();
    }
}
