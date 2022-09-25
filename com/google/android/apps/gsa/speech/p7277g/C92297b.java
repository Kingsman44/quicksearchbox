package com.google.android.apps.gsa.speech.p7277g;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92249k;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.assistant.soda.p1603b.C19250c;
import com.google.android.libraries.assistant.soda.p1603b.C19251d;
import com.google.android.libraries.assistant.soda.p1603b.C19252e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58448fk;
import com.google.common.p4522b.C58783rv;
import com.google.common.p4522b.C58785rx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.speech.g.b */
/* compiled from: PG */
public final class C92297b {

    /* renamed from: a */
    public static final C59071e f257376a = C59071e.m91332i("com.google.android.apps.gsa.speech.g.b");

    /* renamed from: b */
    static final C58785rx f257377b = new C58783rv(C58448fk.m89722o());

    /* renamed from: a */
    public static void m151558a(String str, C92249k kVar, C118561t tVar, boolean z, C19252e eVar) {
        C59104x b = f257376a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GrammarCompilationSvcCt");
        ((C59052c) ((C59052c) b).mo56372aa(12434)).mo56354G("#startService for %s, %s.", str, kVar);
        long millis = TimeUnit.MINUTES.toMillis(1);
        C60856cj.m92911t(C60856cj.m92897f(((C22871g) eVar.f53958d.mo27525b()).mo28201a("canInitiateSodaRecognitionContextTask", new C19251d(eVar)), ((C22871g) eVar.f53958d.mo27525b()).mo28201a("shouldGrammarCompilationUpdateSodaContext", new C19250c(eVar))), new C92293a(str, kVar, tVar, z, millis), C60826bg.f164896a);
    }

    /* renamed from: b */
    public static void m151559b(C118561t tVar, C86124t tVar2, C19252e eVar) {
        C92249k kVar = C92249k.NO_GRAMMAR;
        C58785rx rxVar = f257377b;
        synchronized (rxVar) {
            long currentTimeMillis = System.currentTimeMillis();
            if (rxVar.mo55021k(kVar, BuildConfig.FLAVOR)) {
                if (currentTimeMillis - ((Long) Objects.requireNonNull((Long) rxVar.mo55009a(kVar, BuildConfig.FLAVOR))).longValue() < tVar2.mo79743a(C90120fr.f250802aO)) {
                    C58976aa aaVar = C58975e.f156826a;
                    return;
                }
            }
            rxVar.mo55010b(kVar, BuildConfig.FLAVOR, Long.valueOf(currentTimeMillis));
            m151558a((String) null, (C92249k) null, tVar, false, eVar);
        }
    }
}
