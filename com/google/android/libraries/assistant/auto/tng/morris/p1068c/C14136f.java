package com.google.android.libraries.assistant.auto.tng.morris.p1068c;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.c.f */
/* compiled from: PG */
public final class C14136f {

    /* renamed from: a */
    static final C58495hd f42846a;

    /* renamed from: b */
    public static final /* synthetic */ int f42847b = 0;

    static {
        C58490gz gzVar = new C58490gz(4);
        C37258g gVar = C37179a.f97473as;
        Objects.requireNonNull(gVar);
        gzVar.mo55429h("MORRIS_ASSISTANT_STARTUP_ON_CALL_TAP", new C14133c(gVar));
        C37258g gVar2 = C37179a.f97474at;
        Objects.requireNonNull(gVar2);
        gzVar.mo55429h("MORRIS_ASSISTANT_STARTUP_HOTWORD", new C14133c(gVar2));
        C37258g gVar3 = C37179a.f97474at;
        Objects.requireNonNull(gVar3);
        gzVar.mo55429h("MORRIS_ASSISTANT_STARTUP_ON_GVIS", new C14133c(gVar3));
        C37258g gVar4 = C37179a.f97473as;
        Objects.requireNonNull(gVar4);
        gzVar.mo55429h("MORRIS_ASSISTANT_STARTUP_ON_IMMERSIVE_DESTINATION_SEARCH_BUTTON_TAP", new C14133c(gVar4));
        C37258g gVar5 = C37179a.f97473as;
        Objects.requireNonNull(gVar5);
        gzVar.mo55429h("MORRIS_ASSISTANT_STARTUP_ON_PLAY_MEDIA_TAP", new C14133c(gVar5));
        C37258g gVar6 = C37179a.f97473as;
        Objects.requireNonNull(gVar6);
        gzVar.mo55429h("MORRIS_ASSISTANT_STARTUP_ON_IMMERSIVE_MEDIA_BUTTON_TAP", new C14133c(gVar6));
        C37258g gVar7 = C37179a.f97472ar;
        Objects.requireNonNull(gVar7);
        gzVar.mo55429h("MORRIS_ASSISTANT_STARTUP_ON_SCREEN_MIC", new C14133c(gVar7));
        C37258g gVar8 = C37179a.f97473as;
        Objects.requireNonNull(gVar8);
        gzVar.mo55429h("MORRIS_ASSISTANT_STARTUP_ON_SEND_MESSAGE_TAP", new C14133c(gVar8));
        C37258g gVar9 = C37179a.f97473as;
        Objects.requireNonNull(gVar9);
        gzVar.mo55429h("MORRIS_ASSISTANT_STARTUP_ON_CLIENT_INPUT", new C14133c(gVar9));
        C37258g gVar10 = C37179a.f97473as;
        Objects.requireNonNull(gVar10);
        gzVar.mo55429h("MORRIS_ASSISTANT_STARTUP_ON_EXPERIENCE_LAUNCHER_EXIT_BUTTON", new C14133c(gVar10));
        C37258g gVar11 = C37179a.f97475au;
        Objects.requireNonNull(gVar11);
        gzVar.mo55429h("MORRIS_ASSISTANT_STARTUP_GENERIC", new C14133c(gVar11));
        f42846a = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static void m30431a(C37215b bVar) {
        bVar.mo19974a(C37179a.f97427Z.mo40804b());
    }

    /* renamed from: b */
    public static void m30432b(C14135e eVar) {
        Optional optional;
        C14138h hVar = (C14138h) eVar;
        String str = hVar.f42855b;
        C58495hd hdVar = f42846a;
        if (hdVar.containsKey(str)) {
            optional = Optional.m71637of((C37252a) ((Supplier) hdVar.get(str)).get());
        } else {
            optional = Optional.empty();
        }
        if (optional.isPresent()) {
            C37252a aVar = (C37252a) optional.get();
            aVar.mo40793q(hVar.f42856c);
            hVar.f42857d.ifPresent(new C14099a(aVar));
            hVar.f42858e.ifPresent(new C14126b(aVar));
            hVar.f42854a.mo19974a(aVar);
        }
    }
}
