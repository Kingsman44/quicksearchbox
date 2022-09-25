package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5218j.C67087ko;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.libraries.search.n.c.a.bt */
/* compiled from: PG */
public final /* synthetic */ class C39443bt implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ String f103836a;

    /* renamed from: b */
    public final /* synthetic */ C67087ko f103837b;

    public /* synthetic */ C39443bt(String str, C67087ko koVar) {
        this.f103836a = str;
        this.f103837b = koVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f103836a;
        C67087ko koVar = this.f103837b;
        C2164c cVar = (C2164c) obj;
        if (cVar == null) {
            C59104x c = C39479cu.f103938a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) c).mo56372aa(53561)).mo56389s("Try to finish the hotword verification due to %s, but we got another end event before this and completer has been reset!", str);
            return null;
        }
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53560)).mo56389s("Sending the SodaEvent back to the Triggering API for external hotword verification for %s.", str);
        cVar.mo5437b(koVar);
        return null;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
