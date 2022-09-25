package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.bz */
/* compiled from: PG */
public final /* synthetic */ class C35930bz implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C35930bz f94088a = new C35930bz();

    private /* synthetic */ C35930bz() {
    }

    public final C60870cx apply(Object obj) {
        if (((AssistStateResult) obj) == null) {
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "Error fetching AssistData"));
        }
        ((C59052c) ((C59052c) C35936ca.f94093a.mo56224b()).mo56372aa(51859)).mo56386p("Successfully fetched AssistData");
        return C60856cj.m92900i(C36180b.f94544a);
    }
}
