package com.google.android.apps.gsa.staticplugins.bisto.p7464ab;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3861at.C49946ew;
import com.google.assistant.p3861at.act;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ab.c */
/* compiled from: PG */
public final /* synthetic */ class C94804c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C94809h f265096a;

    /* renamed from: b */
    public final /* synthetic */ String f265097b;

    /* renamed from: c */
    public final /* synthetic */ String f265098c = "en-us-x-hol-local";

    /* renamed from: d */
    public final /* synthetic */ String f265099d;

    public /* synthetic */ C94804c(C94809h hVar, String str, String str2) {
        this.f265096a = hVar;
        this.f265097b = str;
        this.f265099d = str2;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C94809h hVar = this.f265096a;
        String str = this.f265097b;
        String str2 = this.f265098c;
        String str3 = this.f265099d;
        C49946ew ewVar = ((act) obj).f128911r;
        if (ewVar == null) {
            ewVar = C49946ew.f129824q;
        }
        C59104x b = C94809h.f265108a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoSettingsListener");
        ((C59052c) ((C59052c) b).mo56372aa(16916)).mo56386p("Retrieved Assistant Voice Setting from server");
        if (!C58837ba.m90859h(str) && !ewVar.f129828c.isEmpty()) {
            str2 = ewVar.f129828c;
        }
        hVar.mo88620a(str3, str2);
    }
}
