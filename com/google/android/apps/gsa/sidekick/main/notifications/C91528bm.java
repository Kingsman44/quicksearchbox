package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.sidekick.main.actions.C91254m;
import com.google.android.apps.gsa.sidekick.main.actions.C91255n;
import com.google.android.apps.gsa.sidekick.main.actions.C91259r;
import com.google.android.apps.gsa.sidekick.main.entry.C91306ak;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91374d;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.bm */
/* compiled from: PG */
public final class C91528bm {

    /* renamed from: b */
    private static final C59071e f255284b = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.notifications.bm");

    /* renamed from: a */
    public final C91374d f255285a;

    /* renamed from: c */
    private final C21370a f255286c;

    /* renamed from: d */
    private final C91306ak f255287d;

    public C91528bm(C21370a aVar, C91306ak akVar, C91374d dVar) {
        this.f255286c = aVar;
        this.f255287d = akVar;
        this.f255285a = dVar;
    }

    /* renamed from: b */
    public static C7708h m149706b(C7718hj hjVar, C7681g gVar) {
        for (C7708h hVar : hjVar.f26935G) {
            C7681g a = C7681g.m22802a(hVar.f26897b);
            if (a == null) {
                a = C7681g.INVALID;
                continue;
            }
            if (a == gVar) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C60870cx mo85867a(List list) {
        long b = this.f255286c.mo26870b();
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LoggingRequest loggingRequest = (LoggingRequest) it.next();
            if (loggingRequest.mo86502k() != null) {
                C58976aa aaVar = C58975e.f156826a;
                arrayList.add(loggingRequest.mo86532z(b));
                C7718hj m = loggingRequest.mo86504m();
                if (m != null) {
                    if (loggingRequest.mo86513u()) {
                        arrayList2.add(this.f255287d.mo85597j(new C91254m(m), true, "UserInteractionLogger/removeFeedbackQuestion"));
                    }
                    if (loggingRequest.mo86514v()) {
                        arrayList2.add(this.f255287d.mo85597j(new C91255n(m), true, "UserInteractionLogger/removeVoiceOfGoogle"));
                    }
                    if (loggingRequest.mo86515w() && (m.f26955a & 4) != 0) {
                        C7669fo foVar = m.f26968i;
                        if (foVar == null) {
                            foVar = C7669fo.f26633e;
                        }
                        hashSet.add(foVar);
                    }
                }
            }
        }
        if (!hashSet.isEmpty()) {
            arrayList2.add(this.f255287d.mo85597j(new C91259r(hashSet), false, "UserInteractionLogger/logLoggingRequestList"));
        }
        return C60856cj.m92894c(arrayList2).mo57335b(new C91527bl(this, arrayList), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo85868c(C7718hj hjVar, C7681g gVar) {
        C7708h b = m149706b(hjVar, gVar);
        if (b == null) {
            C59104x d = f255284b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "InteractionLogger");
            ((C59052c) ((C59052c) d).mo56372aa(11688)).mo56386p("Missing action!");
            return C118826c.f331423b;
        }
        C58976aa aaVar = C58975e.f156826a;
        return C118826c.m197213c(this.f255285a.mo85689j(hjVar, b));
    }
}
