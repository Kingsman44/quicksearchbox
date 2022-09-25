package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100757w;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.ap */
/* compiled from: PG */
public final /* synthetic */ class C101030ap implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101033as f282143a;

    /* renamed from: b */
    public final /* synthetic */ Account f282144b;

    public /* synthetic */ C101030ap(C101033as asVar, Account account) {
        this.f282143a = asVar;
        this.f282144b = account;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C101033as asVar = this.f282143a;
        String str = this.f282144b.name;
        C132818z zVar = ((C132800h) obj).f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132818z a = ((C101022ah) asVar.f282152g.mo27525b()).mo92129a();
        if (a.equals(zVar)) {
            C59104x b = C101033as.f282146a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FedAssExpListener");
            ((C59052c) ((C59052c) b).mo56372aa(19751)).mo56386p("No fed-ass flags changed.");
            return C60866ct.f164955a;
        }
        C59104x b2 = C101033as.f282146a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "FedAssExpListener");
        ((C59052c) ((C59052c) b2).mo56372aa(19749)).mo56386p("Updating fed-ass flags.");
        Optional optional = (Optional) asVar.f282150e.mo27525b();
        if (!optional.isPresent()) {
            C59104x c = C101033as.f282146a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FedAssExpListener");
            ((C59052c) ((C59052c) c).mo56372aa(19750)).mo56386p("Training cache not available while updating fedass flags.");
            return C60866ct.f164955a;
        }
        C100719ab abVar = (C100719ab) asVar.f282151f.mo27525b();
        if (TextUtils.isEmpty(str)) {
            cxVar = C60856cj.m92899h(new IllegalArgumentException("AccountName cannot be empty"));
        } else {
            cxVar = ((C42876ab) abVar.f281602a.mo27525b()).mo46039a(new C100757w(str, a), C60826bg.f164896a);
        }
        C100742h e = C100742h.m166944c(cxVar).mo92035e(new C101028an(a, zVar, optional));
        e.mo92038i(C101029ao.f282142a);
        return e.f281631a;
    }
}
