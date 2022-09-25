package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.app.PendingIntent;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.aq */
/* compiled from: PG */
public final class C80661aq extends C80704cf {

    /* renamed from: a */
    public PendingIntent f221431a;

    /* renamed from: b */
    public PendingIntent f221432b;

    /* renamed from: c */
    private boolean f221433c;

    /* renamed from: d */
    private boolean f221434d;

    /* renamed from: e */
    private String f221435e;

    /* renamed from: f */
    private byte f221436f;

    public C80661aq() {
    }

    public C80661aq(C80705cg cgVar) {
        C80662ar arVar = (C80662ar) cgVar;
        this.f221433c = arVar.f221437a;
        this.f221434d = arVar.f221438b;
        this.f221431a = arVar.f221439c;
        this.f221432b = arVar.f221440d;
        this.f221435e = arVar.f221441e;
        this.f221436f = 3;
    }

    /* renamed from: a */
    public final C80705cg mo74450a() {
        String str;
        if (this.f221436f == 3 && (str = this.f221435e) != null) {
            return new C80662ar(this.f221433c, this.f221434d, this.f221431a, this.f221432b, str);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f221436f & 1) == 0) {
            sb.append(" isAvailable");
        }
        if ((this.f221436f & 2) == 0) {
            sb.append(" ngaIsAssistant");
        }
        if (this.f221435e == null) {
            sb.append(" assistantLocale");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74451b(String str) {
        if (str != null) {
            this.f221435e = str;
            return;
        }
        throw new NullPointerException("Null assistantLocale");
    }

    /* renamed from: c */
    public final void mo74452c(PendingIntent pendingIntent) {
        this.f221431a = pendingIntent;
    }

    /* renamed from: d */
    public final void mo74453d(boolean z) {
        this.f221433c = z;
        this.f221436f = (byte) (this.f221436f | 1);
    }

    /* renamed from: e */
    public final void mo74454e(PendingIntent pendingIntent) {
        this.f221432b = pendingIntent;
    }

    /* renamed from: f */
    public final void mo74455f(boolean z) {
        this.f221434d = z;
        this.f221436f = (byte) (this.f221436f | 2);
    }
}
