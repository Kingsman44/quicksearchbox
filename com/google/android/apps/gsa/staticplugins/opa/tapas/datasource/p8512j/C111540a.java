package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8512j;

import android.database.Cursor;
import android.net.Uri;
import android.util.Pair;
import androidx.core.content.C1882h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.j.a */
/* compiled from: PG */
public final /* synthetic */ class C111540a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C111541b f310236a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f310237b;

    public /* synthetic */ C111540a(C111541b bVar, C113405ep epVar) {
        this.f310236a = bVar;
        this.f310237b = epVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C58485gu guVar;
        C111541b bVar = this.f310236a;
        C113405ep epVar = this.f310237b;
        C111543d dVar = bVar.f310238a;
        String p = epVar.mo100033p();
        Uri uri = C111543d.f310241b;
        Optional of = Optional.m71637of((String[]) C111543d.f310242c.toArray(new String[0]));
        Optional of2 = Optional.m71637of("body LIKE ?");
        Optional of3 = Optional.m71637of(new String[]{"%" + p + "%"});
        Optional empty = Optional.empty();
        if (C1882h.m5137c(dVar.f310243d, "android.permission.READ_SMS") != 0) {
            C59104x d = C111543d.f310240a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SmsFetcher");
            ((C59052c) ((C59052c) d).mo56372aa(27268)).mo56386p("#getMessages: READ_SMS permission not granted");
            guVar = C58485gu.m89845m();
        } else {
            C111542c cVar = dVar.f310244e;
            Cursor query = C39239a.m68666a(dVar.f310243d, C39226b.TAG_CLASSIC_ASSISTANT_TAPAS).getContentResolver().query(uri, (String[]) of.orElse(null), (String) of2.orElse(null), (String[]) of3.orElse(null), (String) empty.orElse(null));
            if (query == null) {
                C59104x d2 = C111543d.f310240a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "SmsFetcher");
                ((C59052c) ((C59052c) d2).mo56372aa(27267)).mo56386p("getMessages: Error occurred while fetching SMS");
                guVar = C58485gu.m89845m();
            } else {
                C58480gp e = C58485gu.m89837e();
                int i = 0;
                while (query.moveToNext()) {
                    int i2 = i + 1;
                    if (i >= 20) {
                        break;
                    }
                    e.mo55395g(Pair.create(query.getString(0), query.getString(1)));
                    i = i2;
                }
                query.close();
                guVar = e.mo55394f();
            }
        }
        C58480gp e2 = C58485gu.m89837e();
        int i3 = ((C58724pq) guVar).f156474d;
        for (int i4 = 0; i4 < i3; i4++) {
            Pair pair = (Pair) guVar.get(i4);
            String format = String.format("%s: %s", new Object[]{pair.first, pair.second});
            C113414ey q = bVar.mo100187q();
            q.mo100164i(format);
            q.mo100180y(168);
            q.mo100167l(C41669ai.f108954c.intValue());
            q.mo100174s(1.0d);
            e2.mo55395g(q.mo100156a());
        }
        C113407er p2 = C113408es.m187705p();
        p2.mo100096f(C113339cj.m187495c(C113339cj.m187496d(e2.mo55394f())));
        return C60856cj.m92900i(p2.mo100091a());
    }
}
