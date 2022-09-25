package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.staticplugins.p8793w.p8794a.C117682ad;
import com.google.android.apps.gsa.staticplugins.p8793w.p8794a.C117687ai;
import com.google.android.apps.gsa.staticplugins.p8793w.p8794a.C117704r;
import com.google.android.apps.gsa.staticplugins.p8793w.p8794a.C117705s;
import com.google.android.libraries.assistant.auto.tng.p935d.p937b.p938a.C13339a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4486ci.p4487a.C58097b;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.bz */
/* compiled from: PG */
public final /* synthetic */ class C118009bz implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C117687ai f327513a;

    /* renamed from: b */
    public final /* synthetic */ Query f327514b;

    public /* synthetic */ C118009bz(C117687ai aiVar, Query query) {
        this.f327513a = aiVar;
        this.f327514b = query;
    }

    public final C60870cx apply(Object obj) {
        C117687ai aiVar = this.f327513a;
        Query query = this.f327514b;
        File file = (File) obj;
        Account a = aiVar.f326646c.mo79668a();
        if (a == null) {
            aiVar.mo103432c((C58097b) null, file, (C60870cx) null);
            return C60856cj.m92899h(new IllegalStateException("No account, please login."));
        } else if (!aiVar.f326647d.mo56113h()) {
            aiVar.mo103432c((C58097b) null, file, (C60870cx) null);
            return C60856cj.m92899h(new IllegalStateException("Test Drive Data Store is null."));
        } else if (file == null) {
            aiVar.mo103432c((C58097b) null, (File) null, (C60870cx) null);
            return C60856cj.m92899h(new IllegalArgumentException("Audio file is null."));
        } else if (!aiVar.f326656m.mo56113h()) {
            aiVar.mo103432c((C58097b) null, file, (C60870cx) null);
            return C60856cj.m92899h(new IllegalStateException("Car Client is null. Are you calling this file from Auto binary?"));
        } else {
            C60870cx e = aiVar.f326646c.mo79671e("oauth2:https://www.googleapis.com/auth/assistant", a, new C91032p());
            if (!aiVar.f326650g.mo79746e(C90086ek.f250434d)) {
                return C60922j.m93045h(e, new C117705s(aiVar, file, query, a), aiVar.f326655l);
            }
            aiVar.f326658o = new C117682ad(aiVar);
            return aiVar.f326645b.mo28203c("Timeout to wait listener", 300, new C117704r(aiVar, ((C13339a) aiVar.f326656m.mo56107c()).mo21029a(), e, file, query, a));
        }
    }
}
