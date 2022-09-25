package com.google.android.apps.gsa.staticplugins.p7932f.p7938f;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.core.p6519al.p6733g.C85472a;
import com.google.android.apps.gsa.search.core.p6519al.p6733g.C85476b;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.assistant.ampactions.C11045r;
import com.google.android.libraries.gsa.util.p1935a.C23336a;
import com.google.android.libraries.p1703d.C20644ah;
import com.google.android.libraries.p1703d.C20645ai;
import com.google.android.libraries.p1703d.C20656l;
import com.google.assistant.p3890d.p3891a.p3892a.C50856a;
import com.google.assistant.p3890d.p3891a.p3892a.C50857b;
import com.google.assistant.p3890d.p3891a.p3892a.C50858c;
import com.google.assistant.p3890d.p3891a.p3892a.C50859d;
import com.google.assistant.p3897e.p3921j.acy;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.f.a */
/* compiled from: PG */
public final class C100707a extends C86734a implements C85476b {

    /* renamed from: a */
    private static final Uri f281580a = Uri.parse("https://accounts.google.com/AccountChooser");

    /* renamed from: b */
    private final C84624a f281581b;

    /* renamed from: c */
    private final C91097g f281582c;

    /* renamed from: f */
    private final C86054o f281583f;

    public C100707a(C84624a aVar, C91097g gVar, C86054o oVar) {
        super(C118575h.WORKER_AMP_ACTIONS, "ampactions");
        this.f281581b = aVar;
        this.f281582c = gVar;
        this.f281583f = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        r2 = r4.f281583f.mo79668a();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.net.Uri m166889e(java.lang.String r5) {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.parse(r5)
            android.net.Uri r1 = f281580a
            java.lang.String r2 = r1.getAuthority()
            java.lang.String r3 = r0.getAuthority()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0015
            return r0
        L_0x0015:
            com.google.android.apps.gsa.search.core.google.gaia.o r2 = r4.f281583f
            android.accounts.Account r2 = r2.mo79668a()
            if (r2 == 0) goto L_0x003d
            java.lang.String r3 = r2.name
            boolean r3 = com.google.common.base.C58837ba.m90859h(r3)
            if (r3 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            android.net.Uri$Builder r0 = r1.buildUpon()
            java.lang.String r1 = "Email"
            java.lang.String r2 = r2.name
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)
            java.lang.String r1 = "continue"
            android.net.Uri$Builder r5 = r0.appendQueryParameter(r1, r5)
            android.net.Uri r5 = r5.build()
            return r5
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7932f.p7938f.C100707a.m166889e(java.lang.String):android.net.Uri");
    }

    /* renamed from: f */
    private static Bundle m166890f() {
        Bundle bundle = new Bundle();
        C50858c cVar = (C50858c) C50859d.f132429b.createBuilder();
        C50856a aVar = (C50856a) C50857b.f132425c.createBuilder();
        aVar.copyOnWrite();
        ((C50857b) aVar.instance).f132427a = true;
        C50857b bVar = (C50857b) aVar.build();
        cVar.copyOnWrite();
        bVar.getClass();
        ((C50859d) cVar.instance).f132431a = bVar;
        for (Map.Entry entry : C11045r.m26134a(cVar).entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo78995a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m166889e(((acy) it.next()).f134863b));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.intent.extra.REFERRER", C90721ae.f253801j);
        bundle.putBundle("com.android.browser.headers", m166890f());
        C20644ah f = C20645ai.m38752f();
        C20656l lVar = (C20656l) f;
        lVar.f57917a = (Uri) arrayList.get(0);
        lVar.f57918b = arrayList;
        lVar.f57919c = bundle;
        f.mo25595b(true);
        f.mo25596c(true);
        C20645ai a = f.mo25594a();
        this.f281581b.mo78392l();
        this.f281581b.mo78394n(a);
    }

    /* renamed from: c */
    public final void mo78996c(acy acy, C85472a aVar) {
        String uri = m166889e(acy.f134863b).toString();
        try {
            Intent a = C23336a.m43768a(uri);
            a.putExtra("android.intent.extra.REFERRER", C90721ae.f253801j);
            a.putExtra("com.google.android.apps.gsa.customtabs.PREFERRED_URL", uri).putExtra("com.google.android.apps.gsa.customtabs.AMP_HEADER", true).putExtra("com.google.android.search.core.extra.EXTRA_STAY_BOUND_TO_SERVICE_AFTER_INTENT_LAUNCH", true).putExtra("com.android.browser.headers", m166890f());
            this.f281582c.mo65089a(a);
        } catch (URISyntaxException unused) {
        }
    }

    /* renamed from: hY */
    public final void mo79108hY() {
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
