package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138631aj;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138639ar;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders.C138640as;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138175aj;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138176ak;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138177al;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.p395al.p417d.p418a.p421b.C8564q;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54240d;
import com.google.protobuf.C62963cj;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.a */
/* compiled from: PG */
public final class C138266a {

    /* renamed from: a */
    private final long f376179a;

    /* renamed from: b */
    private final C8564q f376180b;

    /* renamed from: c */
    private final C59071e f376181c = C59071e.m91331h();

    public C138266a(long j, C8564q qVar) {
        this.f376179a = j;
        this.f376180b = qVar;
    }

    /* renamed from: b */
    public static final void m224612b(C138177al alVar, String str) {
        C69664n.m101061g(alVar, "suggestionBuilder");
        if ((((C138194bb) alVar.instance).f376009a & 32) == 0 && str != null && str.length() != 0) {
            if (!C138631aj.m225137l(str)) {
                str = String.format("https:%s", Arrays.copyOf(new Object[]{str}, 1));
                C69664n.m101060f(str, "format(format, *args)");
            }
            alVar.copyOnWrite();
            C138194bb bbVar = (C138194bb) alVar.instance;
            str.getClass();
            bbVar.f376009a |= 32;
            bbVar.f376015g = str;
        }
    }

    /* renamed from: c */
    public static final String m224613c(JSONObject jSONObject, C138177al alVar) {
        C69664n.m101061g(jSONObject, "imageLineJson");
        C69664n.m101061g(alVar, "suggestionBuilder");
        m224612b(alVar, C138640as.m225176g(jSONObject));
        List<C138639ar> i = C138640as.m225178i(jSONObject);
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(C69540x.m100804k(i, 10));
        for (C138639ar arVar : i) {
            if (sb.length() > 0) {
                String str = arVar.f377066a;
                C69664n.m101060f(str, "it.text");
                sb.append(true != C69764m.m101234m(str, "•") ? " · " : " ");
            }
            sb.append(arVar.f377066a);
            arrayList.add(sb);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo114222a(C138030av avVar, C138177al alVar) {
        C69664n.m101061g(avVar, "suggestion");
        C69664n.m101061g(alVar, "suggestionBuilder");
        C138175aj ajVar = (C138175aj) C138176ak.f375957e.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C69664n.m101061g(avVar, "suggestion");
        C64369b a = C64369b.m96390a((int) this.f376179a);
        if (a == null || a.equals(C64369b.SUBTYPE_NONE) || !new C62963cj(avVar.f375542e, C138030av.f375535f).contains(a) || this.f376180b.equals(C8564q.f29673c)) {
            C54228aq aqVar = avVar.f375543g;
            if (aqVar == null) {
                aqVar = C54228aq.f142328w;
            }
            if ((aqVar.f142330a & 134217728) != 0) {
                C54228aq aqVar2 = avVar.f375543g;
                if (aqVar2 == null) {
                    aqVar2 = C54228aq.f142328w;
                }
                C8564q qVar = aqVar2.f142349u;
                if (qVar == null) {
                    qVar = C8564q.f29673c;
                }
                ajVar.copyOnWrite();
                C138176ak akVar = (C138176ak) ajVar.instance;
                qVar.getClass();
                akVar.f375962d = qVar;
                akVar.f375959a |= 4;
            }
        } else {
            C8564q qVar2 = this.f376180b;
            ajVar.copyOnWrite();
            C138176ak akVar2 = (C138176ak) ajVar.instance;
            akVar2.f375962d = qVar2;
            akVar2.f375959a |= 4;
        }
        C54228aq aqVar3 = avVar.f375543g;
        if (aqVar3 == null) {
            aqVar3 = C54228aq.f142328w;
        }
        C54240d dVar = aqVar3.f142340l;
        if (dVar == null) {
            dVar = C54240d.f142409e;
        }
        if ((dVar.f142411a & 1) != 0) {
            try {
                C54228aq aqVar4 = avVar.f375543g;
                if (aqVar4 == null) {
                    aqVar4 = C54228aq.f142328w;
                }
                C54240d dVar2 = aqVar4.f142340l;
                if (dVar2 == null) {
                    dVar2 = C54240d.f142409e;
                }
                String str = dVar2.f142412b;
                C69664n.m101060f(str, "suggestion.serverSuggest…eters().getAnswerResult()");
                JSONObject jSONObject = new JSONObject(str);
                JSONArray j = C138640as.m225179j(jSONObject);
                if (j.length() > 0) {
                    JSONObject k = C138640as.m225180k(j, 0);
                    C69664n.m101060f(k, "getImageLineForIndex(lines, 0)");
                    String c = m224613c(k, alVar);
                    ajVar.copyOnWrite();
                    C138176ak akVar3 = (C138176ak) ajVar.instance;
                    akVar3.f375959a |= 1;
                    akVar3.f375960b = c;
                }
                if (j.length() > 1) {
                    JSONObject k2 = C138640as.m225180k(j, 1);
                    C69664n.m101060f(k2, "getImageLineForIndex(lines, 1)");
                    String c2 = m224613c(k2, alVar);
                    ajVar.copyOnWrite();
                    C138176ak akVar4 = (C138176ak) ajVar.instance;
                    akVar4.f375959a |= 2;
                    akVar4.f375961c = c2;
                }
                m224612b(alVar, C138640as.m225177h(jSONObject));
                if (jSONObject.has("ab")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("ab");
                    C69664n.m101060f(jSONObject2, "jsonObject.getJSONObject…nUtils.ACTION_BUTTON_KEY)");
                    C69664n.m101061g(jSONObject2, "actionButtonLine");
                    C69664n.m101061g(alVar, "suggestionBuilder");
                    m224612b(alVar, jSONObject2.getJSONObject("i").optString("d"));
                }
            } catch (JSONException e) {
                C59052c cVar = (C59052c) ((C59052c) this.f376181c.mo56225c()).mo56382g(e);
                cVar.mo56379ah(new C59094n(41136));
                cVar.mo56386p("Could not parse answer JSON");
            }
            alVar.copyOnWrite();
            C138194bb bbVar = (C138194bb) alVar.instance;
            C138176ak akVar5 = (C138176ak) ajVar.build();
            C138194bb bbVar2 = C138194bb.f376007r;
            akVar5.getClass();
            bbVar.f376022n = akVar5;
            bbVar.f376009a |= 2048;
            return;
        }
        alVar.copyOnWrite();
        C138194bb bbVar3 = (C138194bb) alVar.instance;
        C138176ak akVar6 = (C138176ak) ajVar.build();
        C138194bb bbVar4 = C138194bb.f376007r;
        akVar6.getClass();
        bbVar3.f376022n = akVar6;
        bbVar3.f376009a |= 2048;
    }
}
