package com.google.android.libraries.search.assistant.p2828y.p2850k;

import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.assistant.p3897e.p3917i.p3918a.C51300cp;
import com.google.assistant.p3897e.p3917i.p3918a.C51313db;
import com.google.assistant.p3897e.p3917i.p3918a.C51319dh;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.assistant.p3897e.p3917i.p3918a.C51333dv;

/* renamed from: com.google.android.libraries.search.assistant.y.k.a */
/* compiled from: PG */
public final class C36982a {

    /* renamed from: a */
    public byte f96294a;

    /* renamed from: b */
    private C51313db f96295b;

    /* renamed from: c */
    private C51333dv f96296c;

    /* renamed from: d */
    private C51300cp f96297d;

    /* renamed from: e */
    private C51319dh f96298e;

    /* renamed from: f */
    private C51331dt f96299f;

    /* renamed from: g */
    private C39226b f96300g;

    /* renamed from: a */
    public final C36983b mo40509a() {
        byte b = this.f96294a ^ -1;
        if ((b & 63) == 0) {
            return new C36983b(this.f96295b, this.f96296c, this.f96297d, this.f96298e, this.f96299f, this.f96300g, b & 192);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f96294a & 1) == 0) {
            sb.append(" entrySource");
        }
        if ((this.f96294a & 2) == 0) {
            sb.append(" userCredentialStatus");
        }
        if ((this.f96294a & 4) == 0) {
            sb.append(" assistantOnLockscreen");
        }
        if ((this.f96294a & 8) == 0) {
            sb.append(" lockscreenPuntDecision");
        }
        if ((this.f96294a & 16) == 0) {
            sb.append(" triggerTrustLevel");
        }
        if ((this.f96294a & 32) == 0) {
            sb.append(" personalResponseOnLockscreen");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo40510b(C51300cp cpVar) {
        if (cpVar != null) {
            this.f96297d = cpVar;
            this.f96294a = (byte) (this.f96294a | 4);
            return;
        }
        throw new NullPointerException("Null assistantOnLockscreen");
    }

    /* renamed from: c */
    public final void mo40511c(C39226b bVar) {
        this.f96300g = bVar;
        this.f96294a = (byte) (this.f96294a | 128);
    }

    /* renamed from: d */
    public final void mo40512d(C51313db dbVar) {
        if (dbVar != null) {
            this.f96295b = dbVar;
            this.f96294a = (byte) (this.f96294a | 1);
            return;
        }
        throw new NullPointerException("Null entrySource");
    }

    /* renamed from: e */
    public final void mo40513e(C51319dh dhVar) {
        if (dhVar != null) {
            this.f96298e = dhVar;
            this.f96294a = (byte) (this.f96294a | 8);
            return;
        }
        throw new NullPointerException("Null lockscreenPuntDecision");
    }

    /* renamed from: f */
    public final void mo40514f() {
        this.f96294a = (byte) (this.f96294a | 32);
    }

    /* renamed from: g */
    public final void mo40515g(C51331dt dtVar) {
        if (dtVar != null) {
            this.f96299f = dtVar;
            this.f96294a = (byte) (this.f96294a | 16);
            return;
        }
        throw new NullPointerException("Null triggerTrustLevel");
    }

    /* renamed from: h */
    public final void mo40516h(C51333dv dvVar) {
        if (dvVar != null) {
            this.f96296c = dvVar;
            this.f96294a = (byte) (this.f96294a | 2);
            return;
        }
        throw new NullPointerException("Null userCredentialStatus");
    }
}
