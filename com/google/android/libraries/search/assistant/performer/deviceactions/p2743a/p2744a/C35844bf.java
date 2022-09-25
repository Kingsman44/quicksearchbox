package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.bf */
/* compiled from: PG */
public final /* synthetic */ class C35844bf implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f93933a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f93934b;

    public /* synthetic */ C35844bf(C58485gu guVar, C58480gp gpVar) {
        this.f93933a = guVar;
        this.f93934b = gpVar;
    }

    public final Object apply(Object obj) {
        C58485gu guVar = this.f93933a;
        C58480gp gpVar = this.f93934b;
        List list = (List) obj;
        C58724pq pqVar = (C58724pq) guVar;
        if (pqVar.f156474d != list.size()) {
            ((C59052c) ((C59052c) C35845bg.f93935a.mo56225c()).mo56372aa(51976)).mo56386p("List size mismatch");
            return gpVar.mo55394f();
        }
        for (int i = 0; i < pqVar.f156474d; i++) {
            if (!Objects.equals(list.get(i), Boolean.TRUE)) {
                gpVar.mo55395g((String) guVar.get(i));
            }
        }
        return gpVar.mo55394f();
    }
}
