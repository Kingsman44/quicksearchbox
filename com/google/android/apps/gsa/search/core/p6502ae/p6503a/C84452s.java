package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.os.ConditionVariable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.p10873a.C145926j;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.s */
/* compiled from: PG */
public final /* synthetic */ class C84452s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84425ag f229827a;

    /* renamed from: b */
    public final /* synthetic */ SearchResults[] f229828b;

    /* renamed from: c */
    public final /* synthetic */ String f229829c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public final /* synthetic */ String f229830d = "com.google.android.music";

    /* renamed from: e */
    public final /* synthetic */ String[] f229831e;

    /* renamed from: f */
    public final /* synthetic */ int f229832f;

    /* renamed from: g */
    public final /* synthetic */ QuerySpecification f229833g;

    /* renamed from: h */
    public final /* synthetic */ ConditionVariable f229834h;

    public /* synthetic */ C84452s(C84425ag agVar, SearchResults[] searchResultsArr, String[] strArr, int i, QuerySpecification querySpecification, ConditionVariable conditionVariable) {
        this.f229827a = agVar;
        this.f229828b = searchResultsArr;
        this.f229831e = strArr;
        this.f229832f = i;
        this.f229833g = querySpecification;
        this.f229834h = conditionVariable;
    }

    public final void run() {
        C84425ag agVar = this.f229827a;
        SearchResults[] searchResultsArr = this.f229828b;
        String str = this.f229829c;
        String str2 = this.f229830d;
        String[] strArr = this.f229831e;
        int i = this.f229832f;
        QuerySpecification querySpecification = this.f229833g;
        ConditionVariable conditionVariable = this.f229834h;
        C84421ac acVar = agVar.f229720c;
        C58976aa aaVar = C58975e.f156826a;
        SearchResults searchResults = null;
        if (acVar.f229708b && acVar.f229707a.f229713d.f59932a.mo119133h()) {
            try {
                QueryCall$Response queryCall$Response = (QueryCall$Response) C145926j.m237730a(acVar.f229707a.f229712c, str, str2, strArr, i, querySpecification).mo117317b(C84425ag.f229719b, TimeUnit.MILLISECONDS);
                if (!queryCall$Response.f394513a.mo119097c()) {
                    C89949q.m146523g(583);
                    C59104x c = C84425ag.f229718a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                    ((C59052c) ((C59052c) c).mo56372aa(9275)).mo56389s("Got error status from query: %s", queryCall$Response.f394513a.f389622h);
                } else {
                    SearchResults searchResults2 = queryCall$Response.f394514b;
                    if (searchResults2 == null) {
                        C59104x c2 = C84425ag.f229718a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                        ((C59052c) ((C59052c) c2).mo56372aa(9274)).mo56386p("Got null results from query.");
                    } else if (searchResults2.mo117665a()) {
                        C59104x c3 = C84425ag.f229718a.mo56225c();
                        c3.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                        ((C59052c) ((C59052c) c3).mo56372aa(9273)).mo56389s("Got error for search: %s", searchResults2.f387537a);
                    } else {
                        searchResults = searchResults2;
                    }
                }
            } catch (RuntimeException e) {
                C89949q.m146523g(582);
                C59104x c4 = C84425ag.f229718a.mo56225c();
                c4.mo56378ag(C58975e.f156826a, "Search.IcingConnection");
                ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e)).mo56372aa(9276)).mo56386p("Exception when calling query");
            }
        }
        searchResultsArr[0] = searchResults;
        conditionVariable.open();
    }
}
