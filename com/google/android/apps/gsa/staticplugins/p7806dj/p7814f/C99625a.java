package com.google.android.apps.gsa.staticplugins.p7806dj.p7814f;

import com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99594a;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99596c;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7807a.C99597d;
import com.google.android.libraries.gsa.p1876k.C22862b;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.f.a */
/* compiled from: PG */
public final /* synthetic */ class C99625a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C99626b f278784a;

    /* renamed from: b */
    public final /* synthetic */ String f278785b;

    public /* synthetic */ C99625a(C99626b bVar, String str) {
        this.f278784a = bVar;
        this.f278785b = str;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C99626b bVar = this.f278784a;
        String str = this.f278785b;
        C99597d dVar = bVar.f278786a;
        if (str.isEmpty()) {
            return C99597d.f278723b;
        }
        C99594a aVar = (C99594a) C99597d.f278723b.createBuilder();
        String lowerCase = str.toLowerCase(Locale.getDefault());
        for (C99596c cVar : dVar.f278725a) {
            if (cVar.f278719b.toLowerCase(Locale.getDefault()).contains(lowerCase)) {
                aVar.mo91497a(cVar);
            } else if ((cVar.f278718a & 2) != 0 && cVar.f278720c.toLowerCase(Locale.getDefault()).contains(lowerCase)) {
                aVar.mo91497a(cVar);
            }
        }
        return (C99597d) aVar.build();
    }
}
