package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.staticplugins.opa.C108779dm;
import com.google.android.apps.gsa.staticplugins.opa.util.C113855cj;
import com.google.android.apps.gsa.staticplugins.opa.util.C113858cm;
import com.google.android.apps.gsa.staticplugins.opa.util.C113890u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.ah */
/* compiled from: PG */
final class C109090ah implements C91096f {

    /* renamed from: a */
    final /* synthetic */ Set f303719a;

    /* renamed from: b */
    final /* synthetic */ String f303720b;

    /* renamed from: c */
    final /* synthetic */ C109100ar f303721c;

    public C109090ah(C109100ar arVar, Set set, String str) {
        this.f303721c = arVar;
        this.f303719a = set;
        this.f303720b = str;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        HashSet hashSet = new HashSet(this.f303719a);
        hashSet.add(this.f303720b);
        ((SharedPreferences) this.f303721c.f303769b.mo27525b()).edit().putStringSet("watched_nbu_onboarding_video_url_set", hashSet).apply();
        if (i == 1) {
            String stringExtra = intent.getStringExtra("issuedQuery");
            if (stringExtra == null) {
                C59104x c = C109100ar.f303734a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TbybGreetingContainer");
                ((C59052c) ((C59052c) c).mo56372aa(24502)).mo56386p("The query has been issued from TbybGreetingVideo via query buttons but the query string is null");
                this.f303721c.f303763ab.mo97161a();
            } else {
                C108779dm dmVar = this.f303721c.f303763ab;
                Bundle bundle = new Bundle();
                bundle.putInt("android.opa.extra.TRIGGERED_BY", 45);
                C113855cj k = C113858cm.m188476k();
                C113890u uVar = (C113890u) k;
                uVar.f315322a = stringExtra;
                k.mo100706d(QueryTriggerType.OPA_SUGGESTION_CHIP);
                k.mo100704b(true);
                uVar.f315323b = bundle;
                dmVar.f302503a.mo97548u(k.mo100703a());
            }
        } else if (i == 2) {
            this.f303721c.mo97603s();
        } else {
            this.f303721c.f303763ab.mo97161a();
        }
        return true;
    }
}
