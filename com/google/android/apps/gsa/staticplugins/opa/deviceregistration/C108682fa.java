package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83898bd;
import com.google.android.apps.gsa.opaonboarding.C83899be;
import com.google.android.apps.gsa.opaonboarding.C83946m;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.assistant.p3861at.C49875cf;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.fa */
/* compiled from: PG */
public final class C108682fa extends C83869ac {

    /* renamed from: a */
    private static final C59071e f302282a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.fa");

    /* renamed from: b */
    private final C108556ar f302283b;

    public C108682fa(C108556ar arVar) {
        this.f302283b = arVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        C83898bd j = C83899be.m133634j();
        j.mo77292i(false);
        j.mo77293j(true);
        String str = (String) this.f302283b.mo96984c().mo56107c();
        str.getClass();
        C49875cf b = this.f302283b.mo96983b();
        b.getClass();
        ((C83946m) j).f228663a = C58495hd.m89900n(str, b);
        String str2 = (String) this.f302283b.mo96984c().mo56107c();
        str2.getClass();
        j.mo77286c(C58485gu.m89846n(str2));
        j.mo77291h(false);
        j.mo77289f(false);
        return C83875ai.m133539d(j.mo77284a().getClass());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        C108741i iVar = this.f302283b.f302004l;
        if (iVar == null) {
            C59104x c = f302282a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PersonalFragSeq");
            ((C59052c) ((C59052c) c).mo56372aa(24212)).mo56386p("Skip with no selected device.");
            return false;
        } else if (!iVar.mo97114r()) {
            return true;
        } else {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
    }
}
