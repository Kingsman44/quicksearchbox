package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8523p;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.sceneviewer.modelviewer.C141584am;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p.k */
/* compiled from: PG */
public final class C111761k extends C113409et {

    /* renamed from: a */
    public static final C58528ij f310647a = C58528ij.m90015O("i", "me", "my", "we", "our", "ours", "you", "your", "yours", "he", "him", "his", "she", "her", "hers", "it", "its", "they", "them", "their", "what", "which", "who", "whom", "this", "that", "these", "those", C141584am.f384270a, "is", "are", "was", "were", "be", "been", "being", "have", "has", "had", "having", "do", "does", "did", "doing", "a", "an", "the", "and", "but", "if", "or", "as", "of", "at", "by", "for", "with", "during", "before", "after", "above", "below", "to", "from", "up", "down", "in", "out", "on", "off", "over", "under", "again", "further", "then", "once", "here", "there", "when", "where", "why", "how", "all", "any", "both", "each", "few", "more", "most", "other", "some", "such", "no", "nor", "not", "only", "own", "same", "so", "than", "too", "very", C59002s.f156871a, C42181t.f110467a, "can", "will", "just", "don", "now", BuildConfig.FLAVOR);

    /* renamed from: b */
    public static final Pattern f310648b = Pattern.compile("%20|www\\.|_|\\-|\\.com");

    /* renamed from: c */
    public static final Pattern f310649c = Pattern.compile("\\s+");

    /* renamed from: f */
    private static final C59071e f310650f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p.k");

    /* renamed from: d */
    protected Map f310651d = new HashMap();

    /* renamed from: e */
    protected final Comparator f310652e = new C111760j(this);

    /* renamed from: g */
    private final C22871g f310653g;

    public C111761k(C22871g gVar) {
        this.f310653g = gVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.WEBPAGE;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        C59071e eVar = f310650f;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(27358)).mo56389s("#fetchSuggestions(): prefix='%s'", epVar.mo100033p());
        C60870cx cxVar = (C60870cx) map.get(C48672ag.ICING);
        if (cxVar != null) {
            return this.f310653g.mo28209i(cxVar, "IcingResponse for webpage source", new C111754d(this, epVar));
        }
        ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(27359)).mo56386p("Expected dependent response from Icing.");
        return C60856cj.m92900i(C113408es.f314036b);
    }
}
