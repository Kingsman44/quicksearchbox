package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bp */
/* compiled from: PG */
public final /* synthetic */ class C92912bp implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C92915bs f259207a;

    /* renamed from: b */
    public final /* synthetic */ String f259208b;

    public /* synthetic */ C92912bp(C92915bs bsVar, String str) {
        this.f259207a = bsVar;
        this.f259208b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C92915bs bsVar = this.f259207a;
        String str = this.f259208b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            bsVar.mo87480f(C89885b.OPA_LOCKHART_SEARCH_RESULT_MISSING_VALUE);
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "searchResult is missing."));
        }
        C86232bo boVar = (C86232bo) axVar.mo56107c();
        return bsVar.f259221h.mo28210j(bsVar.f259221h.mo28205e(boVar.mo79865A(), "Ignore searchResult#getOriginalQuery failure", Exception.class, C92908bl.f259194a), "process ClientOp", new C92909bm(bsVar, boVar, str));
    }
}
