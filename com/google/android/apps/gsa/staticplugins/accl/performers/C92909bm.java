package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bm */
/* compiled from: PG */
public final /* synthetic */ class C92909bm implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C92915bs f259195a;

    /* renamed from: b */
    public final /* synthetic */ C86232bo f259196b;

    /* renamed from: c */
    public final /* synthetic */ String f259197c;

    public /* synthetic */ C92909bm(C92915bs bsVar, C86232bo boVar, String str) {
        this.f259195a = bsVar;
        this.f259196b = boVar;
        this.f259197c = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C92915bs bsVar = this.f259195a;
        C86232bo boVar = this.f259196b;
        C58833ax axVar = (C58833ax) obj;
        Query N = bsVar.f259215b.mo84251N(this.f259197c, false);
        if (axVar.mo56113h()) {
            Query query = (Query) axVar.mo56107c();
            String bn = query.mo84355bn();
            if (bn != null) {
                N = N.mo84275aL(bn);
            }
            N = N.mo84481j(query);
            try {
                if (!boVar.mo79876L().isDone() || ((C58833ax) C60856cj.m92909r(boVar.mo79876L())).mo56113h()) {
                    C90498f i = N.mo84480i();
                    i.mo84573e(0, 16384);
                    N = i.mo84568a();
                }
            } catch (ExecutionException unused) {
                ((C59052c) ((C59052c) C92915bs.f259214a.mo56225c()).mo56372aa(13127)).mo56386p("Unexpected exception accessing the SearchResult");
            }
            bsVar.f259219f.mo79955c(query.f252752J, boVar);
        }
        Context context = bsVar.f259218e;
        Intent intent = new Intent("com.google.android.googlequicksearchbox.INTERNAL_GOOGLE_SEARCH");
        intent.setClassName(context, e.b());
        intent.addFlags(67108864);
        intent.putExtra("suppress_uel_logging", true);
        intent.putExtra("velvet-query", N);
        intent.putExtra("commit-query", true);
        intent.putExtra("disable_logo_header_transition", true);
        String bn2 = N.mo84355bn();
        if (!TextUtils.isEmpty(bn2)) {
            intent.putExtra("source", bn2);
        }
        if (bsVar.f259218e.getPackageName().equals(((C108100a) bsVar.f259220g.mo56107c()).mo96439d()) && bsVar.f259219f.mo79953a() != 0) {
            intent.putExtra("handover-session-id", bsVar.f259219f.mo79953a());
        }
        intent.addFlags(536870912);
        intent.putExtra("extra_opa_keep_conversation_alive_on_stop", true);
        bsVar.f259217d.mo27807a(intent);
        return C92915bs.f62144n;
    }
}
