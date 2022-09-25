package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p3055n.C39767h;
import com.google.android.libraries.search.p3055n.C39821y;
import com.google.android.libraries.search.p3055n.C39822z;
import com.google.android.libraries.search.p3055n.p3061c.C39645b;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3064b.C39419h;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3073j.C39628b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62940bt;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.n.c.a.ca */
/* compiled from: PG */
public final /* synthetic */ class C39459ca implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103884a;

    public /* synthetic */ C39459ca(C39479cu cuVar) {
        this.f103884a = cuVar;
    }

    public final C60870cx apply(Object obj) {
        C39479cu cuVar = this.f103884a;
        C39395ak akVar = (C39395ak) obj;
        if (akVar.mo41813b()) {
            C59104x b = C39479cu.f103938a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) b).mo56372aa(53609)).mo56386p("Hotword verification started successfully.");
            C39645b bVar = cuVar.f103951b;
            C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
            C62940bt btVar = C39822z.f104715d;
            C39821y yVar = (C39821y) C39822z.f104714c.createBuilder();
            C39767h a = ((C39419h) cuVar.f103939A.mo56107c()).mo41825a();
            yVar.copyOnWrite();
            C39822z zVar = (C39822z) yVar.instance;
            a.getClass();
            zVar.f104718b = a;
            zVar.f104717a |= 1;
            knVar.mo58885m(btVar, (C39822z) yVar.build());
            bVar.mo39385a((C67087ko) knVar.build());
            return C60856cj.m92908q(C2169h.m6027a(new C39461cc(cuVar)), 10, TimeUnit.SECONDS, cuVar.f103954e);
        }
        C39393ai aiVar = (C39393ai) akVar.mo41812a().mo56107c();
        C59104x d = C39479cu.f103938a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) d).mo56372aa(53608)).mo56354G("Cannot start hotword verification. Error code: %s, error message: %s", aiVar.mo41808a(), aiVar.mo41809b());
        return C60856cj.m92900i(C39628b.m69078c(aiVar));
    }
}
