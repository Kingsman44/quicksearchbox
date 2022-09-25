package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p976c;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannedString;
import androidx.core.app.C1802as;
import androidx.core.app.C1803at;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13541q;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58506ho;
import com.google.common.p4522b.C58512hu;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61880aq;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61883at;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61885av;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61896bf;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61922ce;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61954dj;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61955dk;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61976s;
import com.google.p4272br.C56449r;
import com.google.protobuf.C62963cj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.c.g */
/* compiled from: PG */
public final class C13488g {

    /* renamed from: a */
    public static final C59071e f41378a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.f.d.a.c.c.g");

    /* renamed from: b */
    public static final C56449r f41379b = C56449r.m88181b("[☀-⟿]|[🀀-𠏿]", "[☀-⟿]|[🀀-𠏿]", 0);

    /* renamed from: c */
    private static final C58512hu f41380c;

    static {
        C58506ho hoVar = new C58506ho();
        hoVar.mo55456j(C13529e.TEXT_REPLY, "text_reply");
        hoVar.mo55456j(C13529e.EMOJI_REPLY, "text_reply");
        hoVar.mo55456j(C13529e.SHARE_LOCATION, "share_location");
        hoVar.mo55456j(C13529e.SHARE_ETA, "share_location");
        hoVar.mo55456j(C13529e.NAVIGATE, "view_map");
        hoVar.mo55456j(C13529e.CALL_NUMBER, "call_phone");
        f41380c = hoVar.mo55453g();
    }

    /* renamed from: a */
    public static Uri m29744a(C61880aq aqVar) {
        Intent a = C61896bf.m94555a(aqVar.f167332e);
        if (a != null) {
            return a.getData();
        }
        return null;
    }

    /* renamed from: b */
    public static C60870cx m29745b(C61886aw awVar, List list, List list2, C60870cx cxVar, C15481g gVar, Executor executor, boolean z) {
        return C60922j.m93044g(cxVar, C47810es.m84963c(new C13487f(awVar, list, list2, gVar, z)), executor);
    }

    /* renamed from: c */
    public static C61885av m29746c(C13543s sVar) {
        C61922ce ceVar;
        if (!sVar.f41502a.isEmpty()) {
            ArrayList arrayList = new ArrayList(sVar.f41502a.size());
            Iterator it = sVar.f41502a.iterator();
            while (true) {
                SpannedString spannedString = null;
                if (!it.hasNext()) {
                    break;
                }
                C13541q qVar = (C13541q) it.next();
                C1802as asVar = new C1802as();
                asVar.f5624a = qVar.f41493a;
                C1803at atVar = new C1803at(asVar);
                String c = C58890d.m90988c(qVar.f41494b);
                Long valueOf = Long.valueOf(qVar.f41495c);
                if (c != null) {
                    spannedString = new SpannedString(c);
                }
                arrayList.add(new C61883at(atVar, valueOf, spannedString, Bundle.EMPTY));
            }
            if (sVar.f41503b.size() > 0) {
                C62963cj<C13529e> cjVar = new C62963cj(sVar.f41503b, C13543s.f41497c);
                C58506ho hoVar = new C58506ho();
                for (C13529e eVar : cjVar) {
                    C58512hu huVar = f41380c;
                    if (huVar.map.containsKey(eVar)) {
                        C58800sl lA = huVar.mo55423a(eVar).iterator();
                        while (lA.hasNext()) {
                            hoVar.mo55456j(eVar, (String) lA.next());
                        }
                    }
                }
                C58512hu g = hoVar.mo55453g();
                HashSet hashSet = new HashSet();
                for (C13529e eVar2 : new C62963cj(sVar.f41503b, C13543s.f41497c)) {
                    if (g.map.containsKey(eVar2)) {
                        hashSet.addAll(g.mo55423a(eVar2));
                    } else {
                        ((C59052c) ((C59052c) f41378a.mo56224b()).mo56372aa(44853)).mo56389s("Unexpected included type (%s) in request.", eVar2);
                    }
                }
                ceVar = new C61922ce(hashSet);
            } else {
                ceVar = null;
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            if (ceVar == null) {
                ceVar = new C61922ce((Collection) null);
            }
            return new C61885av(unmodifiableList, ceVar, C58485gu.m89845m(), Bundle.EMPTY);
        }
        throw new IllegalArgumentException("No message in SmartActionRequest");
    }

    /* renamed from: d */
    public static C61954dj m29747d(C13543s sVar) {
        return new C61976s((CharSequence) Collection.EL.stream(sVar.f41502a).map(C13486e.f41372a).collect(Collectors.joining(" ")));
    }

    /* renamed from: e */
    public static String m29748e(C61955dk dkVar) {
        if (dkVar.mo58417a().size() == 0) {
            return BuildConfig.FLAVOR;
        }
        return dkVar.mo58418b(0).getLanguage();
    }
}
