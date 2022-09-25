package com.google.android.apps.gsa.staticplugins.opa.worker;

import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.ad;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.nga.api.bq;
import com.google.android.apps.gsa.opa.C83583an;
import com.google.android.apps.gsa.search.core.p6809l.C86152a;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.o */
/* compiled from: PG */
public final /* synthetic */ class C114369o implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114507v f317106a;

    /* renamed from: b */
    public final /* synthetic */ String f317107b;

    public /* synthetic */ C114369o(C114507v vVar, String str) {
        this.f317106a = vVar;
        this.f317107b = str;
    }

    public final void run() {
        C114507v vVar = this.f317106a;
        String str = this.f317107b;
        if (((C74720bx) vVar.f317529o.mo56107c()).mo71089f().b()) {
            ((bq) vVar.f317519c.mo56107c()).l(str);
        } else if (((Boolean) vVar.f317530p.mo6453a()).booleanValue()) {
            ((bq) vVar.f317519c.mo56107c()).p(str);
        } else {
            C87565h hVar = new C87565h();
            hVar.f236560f = 2;
            hVar.f236556b = e.aI;
            hVar.f236558d = C83583an.m133152g((C86152a) vVar.f317526l.mo27525b());
            hVar.f236497A = ad.b(vVar.f317525k);
            if (!TextUtils.isEmpty(str)) {
                hVar.f236523a = str;
            } else {
                hVar.f236523a = "and.opa.gsamic";
            }
            ((C87568k) vVar.f317524j.mo56107c()).mo81688b(vVar.f317520f, hVar.mo81685a());
        }
        vVar.f317518b.mo80228i(new C87684al(C88244um.OPA_STARTED).mo81964a());
    }
}
