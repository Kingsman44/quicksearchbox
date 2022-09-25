package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.bp */
/* compiled from: PG */
public final /* synthetic */ class C11107bp implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11108bq f36395a;

    /* renamed from: b */
    public final /* synthetic */ C11054a f36396b;

    /* renamed from: c */
    public final /* synthetic */ C52490tr f36397c;

    public /* synthetic */ C11107bp(C11108bq bqVar, C11054a aVar, C52490tr trVar) {
        this.f36395a = bqVar;
        this.f36396b = aVar;
        this.f36397c = trVar;
    }

    public final C60870cx apply(Object obj) {
        C11108bq bqVar = this.f36395a;
        C11054a aVar = this.f36396b;
        C52490tr trVar = this.f36397c;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (bqVar.f36404f == null || bqVar.f36405g == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (aVar.mo19521b(23)) {
            return C60922j.m93044g(bqVar.f36409k.mo19662a(), new C11104bm(bqVar, aVar, trVar, booleanValue), bqVar.f36406h);
        }
        return C60856cj.m92900i(bqVar.mo19604b(aVar, trVar, booleanValue));
    }
}
