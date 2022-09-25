package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.accounts.Account;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.e */
/* compiled from: PG */
public final /* synthetic */ class C96485e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C96497q f269943a;

    /* renamed from: b */
    public final /* synthetic */ boolean f269944b;

    /* renamed from: c */
    public final /* synthetic */ String f269945c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f269946d;

    public /* synthetic */ C96485e(C96497q qVar, boolean z, String str, C58833ax axVar) {
        this.f269943a = qVar;
        this.f269944b = z;
        this.f269945c = str;
        this.f269946d = axVar;
    }

    public final Object apply(Object obj) {
        C96497q qVar = this.f269943a;
        boolean z = this.f269944b;
        String str = this.f269945c;
        C58833ax axVar = this.f269946d;
        C118826c cVar = (C118826c) obj;
        C59104x b = C96497q.f269967a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoAssistantSettingsHelper");
        ((C59052c) ((C59052c) b).mo56372aa(17112)).mo56357J("speaker_id_enabled = %b for device %s", z, str);
        ((C89492cd) qVar.f269968b.mo27525b()).mo83380V(str, ((Account) axVar.mo56107c()).name, new C96484d(z));
        qVar.f269971e.mo90176d(str, z);
        return C118826c.f331422a;
    }
}
