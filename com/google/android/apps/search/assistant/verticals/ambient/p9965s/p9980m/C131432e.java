package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9980m;

import android.content.Context;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53702b;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.m.e */
/* compiled from: PG */
public final class C131432e {

    /* renamed from: a */
    public final Context f359249a;

    public C131432e(C130603a aVar, Context context) {
        aVar.mo109740b(this);
        this.f359249a = context;
    }

    /* renamed from: a */
    public final String mo110160a(C58485gu guVar) {
        Optional empty = Optional.empty();
        if (guVar.size() == 1) {
            C53692aq aqVar = (C53692aq) guVar.get(0);
            C53702b bVar = aqVar.f140946h;
            if (bVar == null) {
                bVar = C53702b.f140971f;
            }
            empty = Collection.EL.stream(bVar.f140976d).map(C131430c.f359247a).filter(C131431d.f359248a).findFirst();
            if (!empty.isPresent()) {
                if (!aqVar.f140944f.isEmpty()) {
                    empty = Optional.m71637of(aqVar.f140944f);
                } else {
                    empty = Optional.empty();
                }
            }
        }
        return (String) empty.orElseGet(new C131429b(this));
    }
}
