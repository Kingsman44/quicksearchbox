package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C50073jo;
import com.google.assistant.p3861at.C50077js;
import com.google.assistant.p3861at.acz;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.da */
/* compiled from: PG */
public final /* synthetic */ class C94249da implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C94256dh f263367a;

    /* renamed from: b */
    public final /* synthetic */ C83923j f263368b;

    public /* synthetic */ C94249da(C94256dh dhVar, C83923j jVar) {
        this.f263367a = dhVar;
        this.f263368b = jVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C94256dh dhVar = this.f263367a;
        C83923j jVar = this.f263368b;
        ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14328)).mo56386p("After link account.");
        C50077js jsVar = ((acz) obj).f129013b;
        if (jsVar == null) {
            jsVar = C50077js.f130196b;
        }
        for (C50073jo joVar : jsVar.f130198a) {
            String str = joVar.f130191b;
            if (!TextUtils.isEmpty(str)) {
                ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56372aa(14358)).mo56389s("Link account error: %s", str);
                return C60856cj.m92900i(false);
            }
        }
        ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14341)).mo56387q("verify account linked for %d device(s)", jVar.f228573b.size());
        Account account = (Account) dhVar.f263396k.mo77278a().mo56107c();
        if (account == null) {
            ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56372aa(14344)).mo56386p("No Account present when verify account linked!");
            return C60856cj.m92900i(false);
        }
        String h = dhVar.f263397l.mo79674h(account.name);
        if (h == null) {
            ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56372aa(14343)).mo56386p("Account Id is null when verify account linked!");
            return C60856cj.m92900i(false);
        }
        ArrayList arrayList = new ArrayList();
        for (C83917d dVar : jVar.f228573b) {
            String str2 = dVar.f228555b;
            boolean z = dVar.f228561h;
            StringBuilder sb = new StringBuilder();
            sb.append(true != z ? "http" : "https");
            sb.append("://");
            sb.append(dVar.f228557d);
            sb.append(":");
            sb.append(true != z ? 8008 : 8443);
            sb.append("/setup/assistant/check_ready_status");
            arrayList.add(C90877ak.m148470d(dhVar.f263392g, "verify account linked request", new C94240cs(dhVar, z, sb.toString(), h), new C94253de(dhVar, dVar), dhVar.f263395j));
        }
        return C60856cj.m92892a(arrayList).mo57334a(new C94252dd(dhVar, arrayList, jVar), C60826bg.f164896a);
    }
}
