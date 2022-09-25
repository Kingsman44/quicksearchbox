package com.google.android.libraries.social.populous.logging;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.logging.b */
/* compiled from: PG */
public final class C42567b extends C42587v {

    /* renamed from: a */
    public Long f111703a;

    /* renamed from: b */
    public long f111704b;

    /* renamed from: c */
    public long f111705c;

    /* renamed from: d */
    public String f111706d;

    /* renamed from: e */
    public Long f111707e;

    /* renamed from: f */
    public boolean f111708f;

    /* renamed from: g */
    public Integer f111709g;

    /* renamed from: h */
    public byte f111710h;

    /* renamed from: i */
    public int f111711i;

    /* renamed from: j */
    private C58485gu f111712j;

    public C42567b() {
    }

    public C42567b(LogEvent logEvent) {
        this.f111711i = logEvent.mo45605j();
        this.f111703a = logEvent.mo45601g();
        this.f111704b = logEvent.mo45594a();
        this.f111705c = logEvent.mo45595b();
        this.f111706d = logEvent.mo45602h();
        this.f111712j = logEvent.mo45597d();
        this.f111707e = logEvent.mo45600f();
        this.f111708f = logEvent.mo45604i();
        this.f111709g = logEvent.mo45598e();
        this.f111710h = 7;
    }

    /* renamed from: a */
    public final LogEvent mo45643a() {
        if (this.f111710h == 7 && this.f111711i != 0 && this.f111712j != null) {
            return new AutoValue_LogEvent(this.f111711i, this.f111703a, this.f111704b, this.f111705c, this.f111706d, this.f111712j, this.f111707e, this.f111708f, this.f111709g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f111711i == 0) {
            sb.append(" eventType");
        }
        if ((this.f111710h & 1) == 0) {
            sb.append(" selectSessionId");
        }
        if ((this.f111710h & 2) == 0) {
            sb.append(" submitSessionId");
        }
        if (this.f111712j == null) {
            sb.append(" logEntities");
        }
        if ((this.f111710h & 4) == 0) {
            sb.append(" hadDeviceContactsPermission");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo45644b(C58485gu guVar) {
        if (guVar != null) {
            this.f111712j = guVar;
            return;
        }
        throw new NullPointerException("Null logEntities");
    }
}
