package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.content.Intent;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83903bi;
import com.google.android.apps.gsa.opaonboarding.C83904bj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.e */
/* compiled from: PG */
public final class C94568e implements C83904bj {

    /* renamed from: c */
    private static final C59071e f264518c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bf.c.e");

    /* renamed from: a */
    public C83903bi f264519a;

    /* renamed from: b */
    public int f264520b = 0;

    /* renamed from: d */
    private final l f264521d;

    public C94568e(l lVar) {
        this.f264521d = lVar;
    }

    /* renamed from: d */
    private final C83903bi m155950d() {
        C58833ax axVar;
        C83903bi biVar = this.f264519a;
        if (biVar != null) {
            axVar = biVar.mo77309c();
        } else {
            axVar = C58836b.f156633a;
        }
        Intent intent = (Intent) axVar.mo56109e(new Intent());
        intent.getClass();
        intent.putExtra("assistant_settings_version_info", this.f264521d.e());
        C83903bi biVar2 = this.f264519a;
        if (biVar2 != null) {
            return C83903bi.m133649e(biVar2.mo77308b(), intent);
        }
        C59104x d = f264518c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HomeResultController");
        ((C59052c) ((C59052c) d).mo56372aa(20195)).mo56386p("getResult: missing EnrollmentActivityResult!");
        return C83903bi.m133649e(-1, intent);
    }

    /* renamed from: b */
    public final C83903bi mo77310b() {
        return m155950d();
    }

    /* renamed from: c */
    public final boolean mo88509c() {
        C83903bi biVar = this.f264519a;
        if (biVar != null) {
            return biVar.mo77308b() == 0 || biVar.mo77308b() == 1;
        }
        C59104x d = f264518c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HomeResultController");
        ((C59052c) ((C59052c) d).mo56372aa(20197)).mo56386p("getVoiceMatchSkipped: missing EnrollmentActivityResult!");
        return false;
    }

    /* renamed from: i */
    public final C83903bi mo77311i() {
        return m155950d();
    }
}
