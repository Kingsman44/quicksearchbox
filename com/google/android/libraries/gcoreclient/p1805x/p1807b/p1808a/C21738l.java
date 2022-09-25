package com.google.android.libraries.gcoreclient.p1805x.p1807b.p1808a;

import android.os.Bundle;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.search.C145891g;
import com.google.android.gms.search.queries.AnnotateCall$Request;
import com.google.android.gms.search.queries.C145916a;
import com.google.android.gms.search.queries.C145938f;
import com.google.android.gms.search.queries.C145941i;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.p10873a.C145926j;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21467o;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21469q;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21473u;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1765a.C21529b;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21539g;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21545m;
import com.google.android.libraries.gcoreclient.p1805x.p1807b.C21726a;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.x.b.a.l */
/* compiled from: PG */
public final class C21738l implements C21726a {

    /* renamed from: a */
    private static final C21545m f60041a = new C21735i();

    /* renamed from: b */
    private static final C21545m f60042b = new C21736j();

    /* renamed from: c */
    private static final C21545m f60043c = new C21737k();

    /* renamed from: a */
    public final C21539g mo27076a(C21529b bVar, String str, String str2, int[] iArr) {
        C143840l lVar = C145891g.f394428a;
        C143851w wVar = bVar.f59932a;
        AnnotateCall$Request annotateCall$Request = new AnnotateCall$Request(str, str2, iArr, new Bundle());
        annotateCall$Request.f394483d.putLong("request_timestamp_ms", System.currentTimeMillis());
        return new C21539g(wVar.mo119159d(new C145916a(annotateCall$Request, wVar)), C21734h.f60040a);
    }

    /* renamed from: b */
    public final C21539g mo27077b(C21529b bVar, String[] strArr, C21469q[] qVarArr) {
        PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr = new PhraseAffinityCorpusSpec[1];
        for (int i = 0; i <= 0; i++) {
            phraseAffinityCorpusSpecArr[i] = qVarArr[i].f59910a;
        }
        C143840l lVar = C145891g.f394428a;
        C143851w wVar = bVar.f59932a;
        GetPhraseAffinityCall$Request getPhraseAffinityCall$Request = new GetPhraseAffinityCall$Request();
        getPhraseAffinityCall$Request.f394494c = new Bundle();
        getPhraseAffinityCall$Request.f394494c.putLong("request_timestamp_ms", System.currentTimeMillis());
        getPhraseAffinityCall$Request.f394492a = strArr;
        getPhraseAffinityCall$Request.f394493b = phraseAffinityCorpusSpecArr;
        return new C21539g(wVar.mo119159d(new C145938f(getPhraseAffinityCall$Request, wVar)), f60043c);
    }

    /* renamed from: c */
    public final C21539g mo27078c(C21529b bVar, String str, int i, C21467o oVar) {
        C143840l lVar = C145891g.f394428a;
        C143851w wVar = bVar.f59932a;
        GlobalSearchQuerySpecification globalSearchQuerySpecification = oVar.f59909a;
        GlobalQueryCall$Request globalQueryCall$Request = new GlobalQueryCall$Request();
        globalQueryCall$Request.f394502e = new Bundle();
        globalQueryCall$Request.f394502e.putLong("request_timestamp_ms", System.currentTimeMillis());
        globalQueryCall$Request.f394498a = str;
        globalQueryCall$Request.f394499b = 0;
        globalQueryCall$Request.f394500c = i;
        globalQueryCall$Request.f394501d = globalSearchQuerySpecification;
        return new C21539g(wVar.mo119159d(new C145941i(globalQueryCall$Request, wVar)), f60041a);
    }

    /* renamed from: d */
    public final C21539g mo27079d(C21529b bVar, String str, String str2, String[] strArr, int i, C21473u uVar) {
        C143840l lVar = C145891g.f394428a;
        return new C21539g(C145926j.m237730a(bVar.f59932a, str, str2, strArr, i, uVar.f59913a), f60042b);
    }
}
