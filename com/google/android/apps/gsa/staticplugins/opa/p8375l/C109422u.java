package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import android.content.res.Resources;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.k.a.f;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106392q;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106393r;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106394s;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.p8377b.C109403d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.assistant.p4008y.p4009a.C53615x;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.IntStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.u */
/* compiled from: PG */
public final class C109422u {

    /* renamed from: a */
    public static final C59071e f304735a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.l.u");

    /* renamed from: b */
    public final C86124t f304736b;

    /* renamed from: c */
    public final C22871g f304737c;

    /* renamed from: d */
    public final C68214a f304738d;

    /* renamed from: e */
    public final C68214a f304739e;

    /* renamed from: f */
    public String f304740f;

    /* renamed from: g */
    public final C68214a f304741g;

    /* renamed from: h */
    public final C68214a f304742h;

    /* renamed from: i */
    public final C68214a f304743i;

    /* renamed from: j */
    private final C68214a f304744j;

    /* renamed from: k */
    private final C60950i f304745k;

    public C109422u(C86124t tVar, C22871g gVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C60950i iVar) {
        this.f304736b = tVar;
        this.f304737c = gVar;
        this.f304738d = aVar3;
        this.f304744j = aVar2;
        this.f304742h = aVar;
        this.f304741g = aVar4;
        this.f304739e = aVar5;
        this.f304743i = aVar6;
        this.f304745k = iVar;
    }

    /* renamed from: f */
    public static final List m182104f(Resources resources) {
        String[] stringArray = resources.getStringArray(R.array.opa_first_time_greeting_query_suggestion_message_array);
        return (List) IntStream.CC.range(0, stringArray.length).mapToObj(new C109404c(resources.getStringArray(R.array.opa_first_time_greeting_query_suggestion_word_array), stringArray, resources.getStringArray(R.array.opa_first_time_greeting_query_suggestion_user_intent_array))).collect(Collectors.toList());
    }

    /* renamed from: a */
    public final C60870cx mo97816a() {
        C60870cx cxVar;
        if (!this.f304736b.mo79746e(C90037cp.f248401I)) {
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        } else {
            cxVar = C60922j.m93045h(mo97817b(), C109416o.f304723a, C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
        }
        C60870cx h = C60922j.m93045h(cxVar, new C109420s(this), C60826bg.f164896a);
        C90476a aVar2 = C91018d.f254254a;
        return h;
    }

    /* renamed from: b */
    public final C60870cx mo97817b() {
        return ((C109403d) this.f304738d.mo27525b()).f304696a.mo46042d();
    }

    /* renamed from: c */
    public final C60870cx mo97818c(String str, int i, Resources resources) {
        C58485gu guVar;
        C109398av avVar = (C109398av) this.f304739e.mo27525b();
        C106394s sVar = (C106394s) this.f304741g.mo27525b();
        if (!sVar.mo95499a(str, resources)) {
            C58976aa aaVar = C58975e.f156826a;
            guVar = C58485gu.m89846n(C53593bz.f140658j);
        } else {
            String[] strArr = (String[]) sVar.f296751b.get(str);
            if (strArr == null) {
                guVar = C58485gu.m89846n(C53593bz.f140658j);
            } else {
                int min = Math.min(i, strArr.length);
                List asList = Arrays.asList(strArr);
                Collections.shuffle(asList, new Random());
                guVar = C58485gu.m89842j((Collection) Collection.EL.stream(asList).filter(new C106392q(sVar)).map(C106393r.f296749a).limit((long) min).collect(Collectors.toList()));
            }
        }
        C60870cx g = C60922j.m93044g(avVar.mo97813a(guVar), new C109411j(i), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: d */
    public final boolean mo97819d(f fVar) {
        long j = fVar.d;
        return j == 0 || Instant.ofEpochSecond(j).isAfter(this.f304745k.mo57444a());
    }

    /* renamed from: e */
    public final boolean mo97820e(C53615x xVar) {
        return xVar.f140724a.size() > 0 && ((bm) this.f304744j.mo27525b()).b().equals(this.f304740f);
    }
}
