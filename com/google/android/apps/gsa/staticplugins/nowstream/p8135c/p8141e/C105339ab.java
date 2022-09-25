package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8141e;

import com.google.android.apps.gsa.sidekick.main.p7204g.C91391c;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91396h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C8142xb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.e.ab */
/* compiled from: PG */
public final class C105339ab extends C105360v {

    /* renamed from: a */
    private static final C59071e f293911a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.c.e.ab");

    public C105339ab(C91391c cVar, C8142xb xbVar, C22871g gVar, C22871g gVar2, C105359u uVar) {
        super("SwapCardsTask", cVar, xbVar, gVar, gVar2, uVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C91396h mo94733b() {
        try {
            return mo94760f(false, C7642eo.SWAP_CARDS_TASK, (C7669fo) null, 2);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((C59052c) ((C59052c) ((C59052c) f293911a.mo56225c()).mo56382g(e)).mo56372aa(22313)).mo56386p("Could not retrieve entries from the EntryProvider");
            return null;
        }
    }
}
