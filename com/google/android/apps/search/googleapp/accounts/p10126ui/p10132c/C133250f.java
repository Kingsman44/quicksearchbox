package com.google.android.apps.search.googleapp.accounts.p10126ui.p10132c;

import android.content.Context;
import com.google.android.libraries.onegoogle.accountmenu.features.education.C30549b;
import com.google.android.libraries.onegoogle.accountmenu.features.education.C30601s;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30564k;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30574a;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.EducationDatabase;
import com.google.common.base.C58881cr;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.c.f */
/* compiled from: PG */
public final class C133250f implements C68220f {
    /* renamed from: a */
    public static Optional m216257a(Set set, C69464a aVar) {
        Optional optional;
        if (set.isEmpty()) {
            optional = Optional.empty();
        } else {
            C30549b bVar = (C30549b) ((C58881cr) aVar.mo17428b()).mo6453a();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                bVar.f82520c.mo55395g((C30564k) it.next());
            }
            bVar.f82522e = 2;
            Context context = bVar.f82518a;
            int i = bVar.f82522e;
            EducationDatabase educationDatabase = bVar.f82521d;
            if (educationDatabase == null) {
                Executor executor = bVar.f82519b;
                if (C30574a.f82596a == null) {
                    synchronized (EducationDatabase.class) {
                        if (C30574a.f82596a == null) {
                            C30574a.f82596a = EducationDatabase.m57133z(context, executor);
                        }
                    }
                }
                educationDatabase = C30574a.f82596a;
            }
            C30601s sVar = new C30601s(context, i, educationDatabase, bVar.f82519b, bVar.f82520c.mo55394f());
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                sVar.mo36288d(((C30564k) it2.next()).f82581a.mo36243r(), false);
            }
            optional = Optional.m71637of(sVar);
        }
        C68225k.m98532d(optional);
        return optional;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
