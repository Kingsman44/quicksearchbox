package com.google.android.apps.gsa.staticplugins.p7772db;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.gsa.assist.p502b.C9359c;
import com.google.android.apps.gsa.p6487s3.C84286d;
import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.p6487s3.C84335x;
import com.google.android.apps.gsa.p6487s3.producers.C84299a;
import com.google.android.apps.gsa.p6487s3.producers.C84306e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90768bl;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.helper.C92304b;
import com.google.android.apps.gsa.speech.p7298l.C92472e;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.speech.p7298l.C92474g;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.db.g */
/* compiled from: PG */
final class C99323g implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ C99324h f277798a;

    public C99323g(C99324h hVar) {
        this.f277798a = hVar;
    }

    /* renamed from: b */
    public final C60870cx mo6453a() {
        synchronized (this.f277798a.f277801b) {
            try {
                C99324h hVar = this.f277798a;
                if (hVar.f277819v == null) {
                    return null;
                }
                C9359c cVar = hVar.f277811n;
                C84306e eVar = hVar.f277814q;
                C84299a aVar = hVar.f277815r;
                C92474g gVar = (C92474g) hVar.f277802c.mo27525b();
                Query query = this.f277798a.f277819v;
                C92472e eVar2 = (C92472e) gVar.f258041c.mo17428b();
                eVar2.f257999v = Long.valueOf(query.f252749G);
                eVar2.f257997t = "coca";
                eVar2.f257996s = gVar.f258039a;
                C92473f a = eVar2.mo87218a();
                C99324h hVar2 = this.f277798a;
                C90931ca caVar = hVar2.f277803f;
                C92304b bVar = hVar2.f277805h;
                C89994f fVar = hVar2.f277806i;
                C92461a aVar2 = hVar2.f277821x;
                C86124t tVar = hVar2.f277807j;
                C92302a aVar3 = hVar2.f277808k;
                C68214a aVar4 = hVar2.f277809l;
                C68214a aVar5 = hVar2.f277810m;
                C99319c cVar2 = new C99319c(cVar, eVar, aVar, a, caVar, bVar, fVar, aVar2, tVar, aVar3, aVar4, aVar5, hVar2.f277819v, hVar2.f277817t);
                C99324h hVar3 = this.f277798a;
                C84295m mVar = (C84295m) C90768bl.m148268a(hVar3.f277804g, C84295m.class, hVar3);
                String string = ((SharedPreferences) this.f277798a.f277812o.mo17428b()).getString("fake_s3_server_content_uri", (String) null);
                if (!TextUtils.isEmpty(string)) {
                    C99324h hVar4 = this.f277798a;
                    C84286d dVar = new C84286d(hVar4.f277803f, mVar, cVar2, hVar4.f277813p.getContentResolver(), this.f277798a.f277813p.getMainLooper(), string);
                    dVar.mo77824a();
                    C60870cx i = C60856cj.m92900i(dVar);
                    return i;
                }
                C60870cx c = this.f277798a.f277816s.mo78729c(mVar, cVar2, new C84335x());
                return c;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }
}
