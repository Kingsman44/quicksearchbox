package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.google.assistant.p3863av.p3864a.p3865a.p3866a.C50532j;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.j */
/* compiled from: PG */
public final class C61967j extends C61924cg {

    /* renamed from: a */
    public C61908br f167445a;

    /* renamed from: b */
    public byte f167446b;

    /* renamed from: c */
    private boolean f167447c;

    /* renamed from: d */
    private boolean f167448d;

    /* renamed from: e */
    private boolean f167449e;

    /* renamed from: f */
    private boolean f167450f;

    /* renamed from: g */
    private boolean f167451g;

    /* renamed from: h */
    private boolean f167452h;

    /* renamed from: i */
    private C58485gu f167453i;

    /* renamed from: j */
    private C50532j f167454j;

    /* renamed from: a */
    public final C61925ch mo58362a() {
        C58485gu guVar;
        C61908br brVar;
        C50532j jVar;
        if (this.f167446b == Byte.MAX_VALUE && (guVar = this.f167453i) != null && (brVar = this.f167445a) != null && (jVar = this.f167454j) != null) {
            return new C61968k(this.f167447c, this.f167448d, this.f167449e, this.f167450f, this.f167451g, this.f167452h, guVar, brVar, jVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f167446b & 1) == 0) {
            sb.append(" annotateName");
        }
        if ((this.f167446b & 2) == 0) {
            sb.append(" annotateGivenName");
        }
        if ((this.f167446b & 4) == 0) {
            sb.append(" annotateFamilyName");
        }
        if ((this.f167446b & 8) == 0) {
            sb.append(" annotateNickname");
        }
        if ((this.f167446b & 16) == 0) {
            sb.append(" enableChangeMonitoring");
        }
        if ((this.f167446b & 32) == 0) {
            sb.append(" enableDeclension");
        }
        if ((this.f167446b & 64) == 0) {
            sb.append(" enableShortcutContacts");
        }
        if (this.f167453i == null) {
            sb.append(" shortcutContactNames");
        }
        if (this.f167445a == null) {
            sb.append(" lightweightTokensProvider");
        }
        if (this.f167454j == null) {
            sb.append(" neuralContactMatchingConfig");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo58363b(boolean z) {
        this.f167449e = z;
        this.f167446b = (byte) (this.f167446b | 4);
    }

    /* renamed from: c */
    public final void mo58364c(boolean z) {
        this.f167448d = z;
        this.f167446b = (byte) (this.f167446b | 2);
    }

    /* renamed from: d */
    public final void mo58365d(boolean z) {
        this.f167447c = z;
        this.f167446b = (byte) (this.f167446b | 1);
    }

    /* renamed from: e */
    public final void mo58366e(boolean z) {
        this.f167450f = z;
        this.f167446b = (byte) (this.f167446b | 8);
    }

    /* renamed from: f */
    public final void mo58367f(boolean z) {
        this.f167451g = z;
        this.f167446b = (byte) (this.f167446b | 16);
    }

    /* renamed from: g */
    public final void mo58368g(boolean z) {
        this.f167452h = z;
        this.f167446b = (byte) (this.f167446b | 64);
    }

    /* renamed from: h */
    public final void mo58369h(C50532j jVar) {
        if (jVar != null) {
            this.f167454j = jVar;
            return;
        }
        throw new NullPointerException("Null neuralContactMatchingConfig");
    }

    /* renamed from: i */
    public final void mo58370i(C58485gu guVar) {
        if (guVar != null) {
            this.f167453i = guVar;
            return;
        }
        throw new NullPointerException("Null shortcutContactNames");
    }
}
