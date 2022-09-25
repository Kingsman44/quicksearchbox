package com.google.android.apps.gsa.staticplugins.p7867dv.p7870c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88329xq;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23271p;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.C60456qs;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.dv.c.c */
/* compiled from: PG */
public final class C100234c implements C23113i {

    /* renamed from: a */
    private final C100232a f280309a;

    public C100234c(C100232a aVar) {
        this.f280309a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SuggestEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("clearZeroPrefixSuggestions")) {
                this.f280309a.mo91809e();
            } else if (str.equals("dismissIccSuggestion_com.google.android.libraries.searchbox.shared.suggestion.Suggestion")) {
                this.f280309a.mo91810f((Suggestion) new C23269n().mo28733b("suggestion", pVar));
            } else if (str.equals("handleGenericSuggestEvent_com.google.android.apps.gsa.search.shared.service.ClientEventData")) {
                this.f280309a.mo91811h((ClientEventData) new C23269n().mo28733b("clientEventData", pVar));
            } else if (str.equals("handleSuggestContainerWidthChanged_int")) {
                this.f280309a.mo91812i(Integer.valueOf(pVar.f63472a.getInt("width")).intValue());
            } else if (str.equals("handleSuggestFeedbackClick_com.google.android.libraries.searchbox.shared.suggestion.Suggestion")) {
                this.f280309a.mo91813j((Suggestion) new C23269n().mo28733b("suggestion", pVar));
            } else if (str.equals("handleSuggestResponseRendered_com.google.android.apps.gsa.search.shared.service.proto.SuggestResponseRenderedEventData_com.google.android.libraries.searchbox.shared.response.Response")) {
                this.f280309a.mo91814k((C88329xq) new C23271p(C88329xq.f238867j.getParserForType(), C62921ba.m95368a(), C88329xq.f238867j).mo28733b("suggestResponseRenderedEventData", pVar), (Response) new C23269n().mo28733b("response", pVar));
            } else if (str.equals("handleSuggestionActionClick_com.google.android.apps.gsa.search.shared.service.ClientEventData")) {
                this.f280309a.mo91815l((ClientEventData) new C23269n().mo28733b("clientEventData", pVar));
            } else if (str.equals("handleSuggestionClick_com.google.android.apps.gsa.search.shared.service.ClientEventData")) {
                this.f280309a.mo91816m((ClientEventData) new C23269n().mo28733b("clienteventData", pVar));
            } else if (str.equals("handleSuggestionLongClick_com.google.android.libraries.searchbox.shared.suggestion.Suggestion")) {
                this.f280309a.mo91817n((Suggestion) new C23269n().mo28733b("suggestion", pVar));
            } else if (str.equals("launchUri_java.lang.String")) {
                String string = pVar.f63472a.getString("uri");
                string.getClass();
                this.f280309a.mo91818o(string);
            } else if (str.equals("removeSuggestionFromHistory_com.google.android.libraries.searchbox.shared.suggestion.Suggestion")) {
                this.f280309a.mo91819p((Suggestion) new C23269n().mo28733b("suggestion", pVar));
            } else if (str.equals("updateUiLoggingSnapshot_com.google.common.logging.GsaClientLogProto.AndroidGsaOmniboxEvent_long")) {
                long longValue = Long.valueOf(pVar.f63472a.getLong("sessionStartTime")).longValue();
                this.f280309a.mo91820q((C60456qs) new C23271p(C60456qs.f163602g.getParserForType(), C62921ba.m95368a(), C60456qs.f163602g).mo28733b("uiStats", pVar), longValue);
            }
        }
    }
}
