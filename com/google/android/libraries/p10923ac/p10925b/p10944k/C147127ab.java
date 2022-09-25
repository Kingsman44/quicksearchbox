package com.google.android.libraries.p10923ac.p10925b.p10944k;

import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97263s;
import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97264t;
import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97265u;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147268c;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10967h.C147306a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10967h.C147307b;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10967h.C147309d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.p5294a.C68220f;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.k.ab */
/* compiled from: PG */
public final class C147127ab implements C68220f {

    /* renamed from: a */
    private final C69464a f397242a;

    /* renamed from: b */
    private final C69464a f397243b;

    public C147127ab(C69464a aVar, C69464a aVar2) {
        this.f397242a = aVar;
        this.f397243b = aVar2;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo17428b() {
        C147307b a = ((C147309d) this.f397242a).f397598a.mo124083a();
        Objects.requireNonNull(((C147268c) this.f397243b).f397506a.mo124074a());
        C147162v vVar = new C147162v();
        C97264t tVar = a.f397596a;
        C118522by byVar = (C118522by) C97265u.f271677b.get("mdh-regularsync");
        if (byVar == null) {
            C59104x c = C97265u.f271676a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "mdh-standalone-executor");
            ((C59052c) ((C59052c) c).mo56372aa(20928)).mo56389s("unrecognized task name ignored: %s", "mdh-regularsync");
        }
        return new C147306a(vVar, new C97263s(tVar, byVar));
    }
}
