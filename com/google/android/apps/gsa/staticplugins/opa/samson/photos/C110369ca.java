package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.shared.C73798aa;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.experience.OpaBActivity;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110397a;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110402b;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110420g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.ca */
/* compiled from: PG */
public class C110369ca implements C110420g {

    /* renamed from: a */
    private static final C59071e f307601a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.photos.ca");

    /* renamed from: b */
    private final Context f307602b;

    /* renamed from: c */
    private final C68214a f307603c;

    /* renamed from: d */
    private final C68214a f307604d;

    /* renamed from: e */
    private final C68214a f307605e;

    /* renamed from: f */
    private final C68214a f307606f;

    /* renamed from: g */
    private final C68214a f307607g;

    /* renamed from: h */
    private final C68214a f307608h;

    public C110369ca(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        this.f307602b = context;
        this.f307603c = aVar;
        this.f307604d = aVar2;
        this.f307605e = aVar3;
        this.f307606f = aVar4;
        this.f307607g = aVar5;
        this.f307608h = aVar6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo98583a(Intent intent) {
    }

    /* renamed from: b */
    public final Intent mo98440b() {
        if (!((C86124t) this.f307603c.mo27525b()).mo79746e(C90014bt.f247235dN)) {
            return null;
        }
        Account a = ((C86054o) this.f307605e.mo27525b()).mo79668a();
        if (a == null) {
            C59104x b = f307601a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PIProvider");
            ((C59052c) ((C59052c) b).mo56372aa(25882)).mo56387q("#gAI ec: %d", 1);
            return null;
        }
        String c = ((C73798aa) ((C58833ax) this.f307604d.mo27525b()).mo56107c()).mo65279c();
        if (c != null) {
            if (!((C110361bt) this.f307606f.mo27525b()).mo98594k(a.name, c)) {
                C59104x b2 = f307601a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "PIProvider");
                ((C59052c) ((C59052c) b2).mo56372aa(25881)).mo56387q("#gAI ec: %d", 3);
                return null;
            } else if (!((C110361bt) this.f307606f.mo27525b()).mo98591h(a.name, c)) {
                C59104x b3 = f307601a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "PIProvider");
                ((C59052c) ((C59052c) b3).mo56372aa(25880)).mo56387q("#gAI ec: %d", 4);
                return null;
            }
        } else if (!((C110402b) this.f307608h.mo27525b()).mo98629a()) {
            C59104x b4 = f307601a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "PIProvider");
            ((C59052c) ((C59052c) b4).mo56372aa(25876)).mo56387q("#gAI ec: %d", 2);
            return null;
        } else if (!((C110397a) this.f307607g.mo27525b()).mo98624b(true)) {
            C59104x b5 = f307601a.mo56224b();
            b5.mo56378ag(C58975e.f156826a, "PIProvider");
            ((C59052c) ((C59052c) b5).mo56372aa(25879)).mo56387q("#gAI ec -- chr: %d", 7);
            return null;
        } else if (!((C110361bt) this.f307606f.mo27525b()).mo98594k(a.name, "ch_amb_mode")) {
            C59104x b6 = f307601a.mo56224b();
            b6.mo56378ag(C58975e.f156826a, "PIProvider");
            ((C59052c) ((C59052c) b6).mo56372aa(25878)).mo56387q("#gAI ec -- chr: %d", 3);
            return null;
        } else if (!((C110361bt) this.f307606f.mo27525b()).mo98591h(a.name, "ch_amb_mode")) {
            C59104x b7 = f307601a.mo56224b();
            b7.mo56378ag(C58975e.f156826a, "PIProvider");
            ((C59052c) ((C59052c) b7).mo56372aa(25877)).mo56387q("#gAI ec -- chr: %d", 4);
            return null;
        }
        Intent intent = new Intent(this.f307602b, OpaBActivity.class);
        intent.addFlags(268468224);
        mo98583a(intent);
        return intent;
    }
}
