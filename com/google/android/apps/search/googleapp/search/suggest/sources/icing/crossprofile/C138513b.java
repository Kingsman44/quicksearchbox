package com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.C138510b;
import com.google.android.apps.search.googleapp.search.suggest.sources.icing.C138511c;
import com.google.android.gms.appdatasearch.C142826w;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.search.queries.C145948p;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.inject.C47266f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.b */
/* compiled from: PG */
public final class C138513b {

    /* renamed from: a */
    public final Context f376762a;

    public C138513b(Context context) {
        this.f376762a = context;
    }

    /* renamed from: a */
    public final C60870cx mo114301a(C138133o oVar, String str, String str2) {
        CorpusId corpusId;
        C138511c bL = ((C138512a) C47266f.m84076a(this.f376762a, C138512a.class)).mo114300bL();
        String str3 = oVar.f375825b;
        long c = bL.f376754c.mo26871c();
        C145948p pVar = bL.f376757f;
        String format = String.format("(Q_PREFIX \"%s\")", new Object[]{str3});
        C142826w wVar = new C142826w();
        wVar.f387614g = "tng_suggest";
        wVar.f387609b = 5;
        wVar.f387613f = new STSortSpec(str);
        wVar.f387610c = 3;
        if (bL.f376759h || bL.f376760i) {
            List i = C58869cf.m90936b(new C58903m('-')).mo56155i(str2);
            if (i.size() != 2) {
                corpusId = C138511c.f376753b;
            } else {
                ((C58970a) ((C58970a) C138511c.f376752a.mo56226d()).mo56372aa(41246)).mo56389s("Using Icing corpus override: %s", str2);
                corpusId = new CorpusId((String) i.get(0), (String) i.get(1), (Bundle) null);
            }
        } else {
            corpusId = C138511c.f376753b;
        }
        wVar.mo117756b(corpusId);
        C60870cx b = C43205e.m76192b(pVar.mo122338b(format, 10, wVar.mo117755a()));
        C138510b bVar = new C138510b(bL, c, oVar);
        return C60922j.m93044g(b, C47810es.m84963c(bVar), bL.f376755d);
    }
}
