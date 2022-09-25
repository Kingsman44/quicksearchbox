package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10460a;

import android.net.Uri;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4440ca.p4442b.p4443a.C57928d;
import java.io.File;
import java.io.IOException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C138371d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138372e f376439a;

    public /* synthetic */ C138371d(C138372e eVar) {
        this.f376439a = eVar;
    }

    public final Object apply(Object obj) {
        String str;
        C138372e eVar = this.f376439a;
        C29690f fVar = (C29690f) obj;
        if (fVar == null) {
            return Optional.empty();
        }
        for (C28595b bVar : fVar.f80416g) {
            if (bVar.f77798b.equals(eVar.f376446g)) {
                try {
                    str = bVar.f77799c;
                    Uri parse = Uri.parse(str);
                    C42788l lVar = new C42788l();
                    lVar.f112052a = true;
                    return Optional.m71637of(new C57928d(((File) ((C42813k) eVar.f376445f.mo17428b()).mo45889c(parse, lVar)).getAbsolutePath(), 10));
                } catch (IOException e) {
                    throw new IOException("Fail to get absolute path of " + str + " .", e);
                } catch (IOException e2) {
                    C58970a aVar = (C58970a) C138372e.f376440a.mo56225c();
                    aVar.mo56378ag(C38505d.f101864b, 163171465);
                    ((C58970a) ((C58970a) aVar.mo56382g(e2)).mo56372aa(41238)).mo56384n();
                    return Optional.empty();
                }
            }
        }
        ((C58970a) ((C58970a) C138372e.f376440a.mo56226d()).mo56372aa(41237)).mo56386p("APA Head Suggest client file was not found.");
        return Optional.empty();
    }
}
