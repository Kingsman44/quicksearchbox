package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e;

import com.google.android.apps.gsa.sidekick.main.p7204g.C91391c;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C8142xb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.e.aa */
/* compiled from: PG */
public final class C105338aa extends C105363y {

    /* renamed from: a */
    private static final C59071e f293910a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.c.e.aa");

    public C105338aa(C91391c cVar, C8142xb xbVar, C22871g gVar, C22871g gVar2, C105359u uVar) {
        super("ReloadNowCardsTask", cVar, xbVar, gVar, gVar2, uVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C105364z mo94733b() {
        boolean z = true;
        try {
            return new C105342d(mo94760f(true, C7642eo.RELOAD_NOW_CARDS_TASK, (C7669fo) null, 3), ((Long) C60856cj.m92910s(this.f293963c.mo85726b())).longValue(), false);
        } catch (InterruptedException | TimeoutException e) {
            C59104x c = f293910a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ReloadNowCardsTask");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(22311)).mo56386p("Could not retrieve entries from the EntryProvider");
            z = false;
            return new C105342d((C91396h) null, 0, z);
        } catch (ExecutionException e2) {
            C59104x c2 = f293910a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "ReloadNowCardsTask");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(22312)).mo56386p("Could not retrieve entries from the EntryProvider. ExecutionException.");
            return new C105342d((C91396h) null, 0, z);
        }
    }
}
