package com.google.android.libraries.gsa.conversation.p1855h;

import com.google.assistant.p3897e.p3921j.C52070ec;

/* renamed from: com.google.android.libraries.gsa.conversation.h.i */
/* compiled from: PG */
final class C22705i extends C22713q {

    /* renamed from: a */
    public String f62493a;

    /* renamed from: b */
    private C52070ec f62494b;

    /* renamed from: c */
    private C22714r f62495c;

    /* renamed from: d */
    private long f62496d;

    /* renamed from: e */
    private long f62497e;

    /* renamed from: f */
    private byte f62498f;

    /* renamed from: a */
    public final C22715s mo27840a() {
        String str;
        C52070ec ecVar;
        C22714r rVar;
        if (this.f62498f == 3 && (str = this.f62493a) != null && (ecVar = this.f62494b) != null && (rVar = this.f62495c) != null) {
            return new C22706j(str, ecVar, rVar, this.f62496d, this.f62497e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f62493a == null) {
            sb.append(" clientOpName");
        }
        if (this.f62494b == null) {
            sb.append(" clientOpResult");
        }
        if (this.f62495c == null) {
            sb.append(" clientOpReliabilityStatus");
        }
        if ((this.f62498f & 1) == 0) {
            sb.append(" clientOpStartElapsedTimeNanos");
        }
        if ((this.f62498f & 2) == 0) {
            sb.append(" clientOpEndElapsedTimeNanos");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo27841b(long j) {
        this.f62497e = j;
        this.f62498f = (byte) (this.f62498f | 2);
    }

    /* renamed from: c */
    public final void mo27842c(String str) {
        if (str != null) {
            this.f62493a = str;
            return;
        }
        throw new NullPointerException("Null clientOpName");
    }

    /* renamed from: d */
    public final void mo27843d(C22714r rVar) {
        if (rVar != null) {
            this.f62495c = rVar;
            return;
        }
        throw new NullPointerException("Null clientOpReliabilityStatus");
    }

    /* renamed from: e */
    public final void mo27844e(C52070ec ecVar) {
        if (ecVar != null) {
            this.f62494b = ecVar;
            return;
        }
        throw new NullPointerException("Null clientOpResult");
    }

    /* renamed from: f */
    public final void mo27845f(long j) {
        this.f62496d = j;
        this.f62498f = (byte) (this.f62498f | 1);
    }
}
