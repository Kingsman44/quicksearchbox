package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.e */
/* compiled from: PG */
final class C61962e extends C61882as {

    /* renamed from: a */
    public C58485gu f167428a;

    /* renamed from: b */
    public String f167429b;

    /* renamed from: c */
    private boolean f167430c;

    /* renamed from: d */
    private byte f167431d;

    /* renamed from: a */
    public final C61886aw mo58323a() {
        C58485gu guVar;
        if (this.f167431d == 1 && (guVar = this.f167428a) != null) {
            return new C61963f(guVar, this.f167429b, this.f167430c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f167428a == null) {
            sb.append(" conversationActions");
        }
        if (this.f167431d == 0) {
            sb.append(" sensitive");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo58324b(boolean z) {
        this.f167430c = z;
        this.f167431d = 1;
    }
}
