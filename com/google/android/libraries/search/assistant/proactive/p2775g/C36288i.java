package com.google.android.libraries.search.assistant.proactive.p2775g;

import com.google.assistant.p3803ag.p3809c.C49058ex;
import com.google.assistant.p3803ag.p3809c.C49062fa;
import com.google.assistant.p3803ag.p3809c.C49064fc;
import com.google.assistant.p3803ag.p3809c.C49065fd;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.i */
/* compiled from: PG */
public final /* synthetic */ class C36288i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f94771a;

    /* renamed from: b */
    public final /* synthetic */ C49062fa f94772b;

    public /* synthetic */ C36288i(String str, C49062fa faVar) {
        this.f94771a = str;
        this.f94772b = faVar;
    }

    public final Object apply(Object obj) {
        String str = this.f94771a;
        C49062fa faVar = this.f94772b;
        C49065fd fdVar = (C49065fd) obj;
        C59071e eVar = C36295p.f94779a;
        C49064fc fcVar = (C49064fc) fdVar.toBuilder();
        str.getClass();
        C62995dn dnVar = fdVar.f126916a;
        if (dnVar.containsKey(str)) {
            C49058ex exVar = (C49058ex) ((C49062fa) dnVar.get(str)).toBuilder();
            exVar.mergeFrom(faVar);
            fcVar.mo53216a(str, (C49062fa) exVar.build());
            return (C49065fd) fcVar.build();
        }
        throw new IllegalArgumentException();
    }
}
