package com.google.android.apps.gsa.staticplugins.p7867dv.p7870c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88329xq;
import com.google.android.libraries.gsa.monet.shared.C23112h;
import com.google.android.libraries.gsa.monet.shared.LazyParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C60456qs;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.dv.c.b */
/* compiled from: PG */
public final class C100233b implements C100232a {

    /* renamed from: a */
    private final C23112h f280308a;

    public C100233b(C23112h hVar) {
        this.f280308a = hVar;
    }

    /* renamed from: e */
    public final void mo91809e() {
        this.f280308a.mo28345s("clearZeroPrefixSuggestions", "SuggestEventsDispatcher", new Bundle());
    }

    /* renamed from: f */
    public final void mo91810f(Suggestion suggestion) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("suggestion", new LazyParcelable((Parcelable) suggestion));
        this.f280308a.mo28345s("dismissIccSuggestion_com.google.android.libraries.searchbox.shared.suggestion.Suggestion", "SuggestEventsDispatcher", bundle);
    }

    /* renamed from: h */
    public final void mo91811h(ClientEventData clientEventData) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("clientEventData", new LazyParcelable((Parcelable) clientEventData));
        this.f280308a.mo28345s("handleGenericSuggestEvent_com.google.android.apps.gsa.search.shared.service.ClientEventData", "SuggestEventsDispatcher", bundle);
    }

    /* renamed from: i */
    public final void mo91812i(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("width", Integer.valueOf(i).intValue());
        this.f280308a.mo28345s("handleSuggestContainerWidthChanged_int", "SuggestEventsDispatcher", bundle);
    }

    /* renamed from: j */
    public final void mo91813j(Suggestion suggestion) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("suggestion", new LazyParcelable((Parcelable) suggestion));
        this.f280308a.mo28345s("handleSuggestFeedbackClick_com.google.android.libraries.searchbox.shared.suggestion.Suggestion", "SuggestEventsDispatcher", bundle);
    }

    /* renamed from: k */
    public final void mo91814k(C88329xq xqVar, Response response) {
        Bundle bundle = new Bundle();
        C88329xq.f238867j.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("suggestResponseRenderedEventData", C23245b.m43556a(xqVar));
        bundle.putParcelable("response", new LazyParcelable((Parcelable) response));
        this.f280308a.mo28345s("handleSuggestResponseRendered_com.google.android.apps.gsa.search.shared.service.proto.SuggestResponseRenderedEventData_com.google.android.libraries.searchbox.shared.response.Response", "SuggestEventsDispatcher", bundle);
    }

    /* renamed from: l */
    public final void mo91815l(ClientEventData clientEventData) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("clientEventData", new LazyParcelable((Parcelable) clientEventData));
        this.f280308a.mo28345s("handleSuggestionActionClick_com.google.android.apps.gsa.search.shared.service.ClientEventData", "SuggestEventsDispatcher", bundle);
    }

    /* renamed from: m */
    public final void mo91816m(ClientEventData clientEventData) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("clienteventData", new LazyParcelable((Parcelable) clientEventData));
        this.f280308a.mo28345s("handleSuggestionClick_com.google.android.apps.gsa.search.shared.service.ClientEventData", "SuggestEventsDispatcher", bundle);
    }

    /* renamed from: n */
    public final void mo91817n(Suggestion suggestion) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("suggestion", new LazyParcelable((Parcelable) suggestion));
        this.f280308a.mo28345s("handleSuggestionLongClick_com.google.android.libraries.searchbox.shared.suggestion.Suggestion", "SuggestEventsDispatcher", bundle);
    }

    /* renamed from: o */
    public final void mo91818o(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("uri", str);
        this.f280308a.mo28345s("launchUri_java.lang.String", "SuggestEventsDispatcher", bundle);
    }

    /* renamed from: p */
    public final void mo91819p(Suggestion suggestion) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("suggestion", new LazyParcelable((Parcelable) suggestion));
        this.f280308a.mo28345s("removeSuggestionFromHistory_com.google.android.libraries.searchbox.shared.suggestion.Suggestion", "SuggestEventsDispatcher", bundle);
    }

    /* renamed from: q */
    public final void mo91820q(C60456qs qsVar, long j) {
        Bundle bundle = new Bundle();
        C60456qs.f163602g.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("uiStats", C23245b.m43556a(qsVar));
        bundle.putLong("sessionStartTime", Long.valueOf(j).longValue());
        this.f280308a.mo28345s("updateUiLoggingSnapshot_com.google.common.logging.GsaClientLogProto.AndroidGsaOmniboxEvent_long", "SuggestEventsDispatcher", bundle);
    }
}
