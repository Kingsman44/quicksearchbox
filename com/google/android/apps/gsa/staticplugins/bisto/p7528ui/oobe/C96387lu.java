package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90122ft;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142355cg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.lu */
/* compiled from: PG */
public final class C96387lu extends C84036z {

    /* renamed from: a */
    private static final C59071e f269660a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.lu");

    /* renamed from: b */
    private final C68214a f269661b;

    /* renamed from: c */
    private final C68214a f269662c;

    /* renamed from: d */
    private final C96325jm f269663d;

    /* renamed from: e */
    private final C90021c f269664e;

    /* renamed from: f */
    private final C68214a f269665f;

    public C96387lu(C68214a aVar, C68214a aVar2, C96325jm jmVar, C90021c cVar, C68214a aVar3) {
        this.f269661b = aVar;
        this.f269662c = aVar2;
        this.f269663d = jmVar;
        this.f269664e = cVar;
        this.f269665f = aVar3;
    }

    /* renamed from: h */
    public final C58485gu mo77495h() {
        C83956t tVar;
        C58833ax axVar;
        C142324bc bcVar = this.f269663d.f269538a.f269047b;
        if (!this.f269664e.mo79746e(C90122ft.f250865d)) {
            C58833ax a = ((C83893b) this.f269662c.mo27525b()).mo77278a();
            String str = a.mo56113h() ? ((Account) a.mo56107c()).name : null;
            if (C58837ba.m90859h(str)) {
                C59104x c = f269660a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BistoBadLanguageSeq");
                ((C59052c) ((C59052c) c).mo56372aa(17095)).mo56386p("Missing account");
            } else if (bcVar.f386127m.size() > 0) {
                String languageTag = ((ae) this.f269661b.mo27525b()).d(str).toLanguageTag();
                if (!bcVar.f386127m.contains(languageTag)) {
                    C58976aa aaVar = C58975e.f156826a;
                    ((C95299e) this.f269665f.mo27525b()).f266647b.mo57066b("UnsupportedLocale-".concat(String.valueOf(languageTag)));
                    C96097ba baVar = this.f269663d.f269538a;
                    C142324bc bcVar2 = baVar.f269047b;
                    if ((bcVar2.f386115a & 4) != 0) {
                        C142355cg cgVar = bcVar2.f386117c;
                        if (cgVar == null) {
                            cgVar = C142355cg.f386263b;
                        }
                        String e = C124525f.m203989e(cgVar);
                        if (e != null) {
                            axVar = C58833ax.m90834k(e);
                            Objects.requireNonNull(baVar);
                            C96385ls lsVar = new C96385ls();
                            Bundle bundle = new Bundle();
                            bundle.putString("name", ((CharSequence) axVar.mo56108d(new C96386lt(baVar))).toString());
                            tVar = C83875ai.m133540e(lsVar, bundle);
                            return C58485gu.m89846n(tVar);
                        }
                    }
                    axVar = C58836b.f156633a;
                    Objects.requireNonNull(baVar);
                    C96385ls lsVar2 = new C96385ls();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("name", ((CharSequence) axVar.mo56108d(new C96386lt(baVar))).toString());
                    tVar = C83875ai.m133540e(lsVar2, bundle2);
                    return C58485gu.m89846n(tVar);
                }
            }
        }
        tVar = C83875ai.f228524a;
        return C58485gu.m89846n(tVar);
    }
}
