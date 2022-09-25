package com.google.android.libraries.search.assistant.p2828y.p2836f.p2837a;

import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.assistant.p3897e.p3917i.p3918a.C51566ml;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;

/* renamed from: com.google.android.libraries.search.assistant.y.f.a.a */
/* compiled from: PG */
final class C36873a extends C36884h {

    /* renamed from: a */
    public C51527l f96031a;

    /* renamed from: b */
    public C51594nm f96032b;

    /* renamed from: c */
    public C51566ml f96033c;

    /* renamed from: a */
    public final C36885i mo40434a() {
        C51594nm nmVar;
        C51566ml mlVar;
        C51527l lVar = this.f96031a;
        if (lVar != null && (nmVar = this.f96032b) != null && (mlVar = this.f96033c) != null) {
            return new C36878b(lVar, nmVar, mlVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f96031a == null) {
            sb.append(" alarmParams");
        }
        if (this.f96032b == null) {
            sb.append(" timerParams");
        }
        if (this.f96033c == null) {
            sb.append(" stopwatchParams");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
