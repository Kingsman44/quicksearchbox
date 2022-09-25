package com.google.android.libraries.p10923ac.p10925b.p10937f;

import android.accounts.Account;
import com.google.protos.p4895aw.p4902b.C64008br;
import com.google.protos.p4895aw.p4902b.C64098p;

/* renamed from: com.google.android.libraries.ac.b.f.g */
/* compiled from: PG */
final class C147043g extends C147044h {

    /* renamed from: a */
    private final C64008br f397029a;

    /* renamed from: b */
    private final C64098p f397030b;

    /* renamed from: c */
    private final Account f397031c;

    /* renamed from: d */
    private final boolean f397032d;

    /* renamed from: e */
    private final boolean f397033e;

    public C147043g(C64008br brVar, C64098p pVar, Account account, boolean z, boolean z2) {
        if (brVar != null) {
            this.f397029a = brVar;
            if (pVar != null) {
                this.f397030b = pVar;
                this.f397031c = account;
                this.f397032d = z;
                this.f397033e = z2;
                return;
            }
            throw new NullPointerException("Null channelId");
        }
        throw new NullPointerException("Null identity");
    }

    /* renamed from: a */
    public final Account mo123842a() {
        return this.f397031c;
    }

    /* renamed from: b */
    public final C64098p mo123843b() {
        return this.f397030b;
    }

    /* renamed from: c */
    public final C64008br mo123844c() {
        return this.f397029a;
    }

    /* renamed from: d */
    public final boolean mo123845d() {
        return this.f397033e;
    }

    /* renamed from: e */
    public final boolean mo123846e() {
        return this.f397032d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f397031c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.p10923ac.p10925b.p10937f.C147044h
            r2 = 0
            if (r1 == 0) goto L_0x004a
            com.google.android.libraries.ac.b.f.h r5 = (com.google.android.libraries.p10923ac.p10925b.p10937f.C147044h) r5
            com.google.protos.aw.b.br r1 = r4.f397029a
            com.google.protos.aw.b.br r3 = r5.mo123844c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
            com.google.protos.aw.b.p r1 = r4.f397030b
            com.google.protos.aw.b.p r3 = r5.mo123843b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004a
            android.accounts.Account r1 = r4.f397031c
            if (r1 != 0) goto L_0x002e
            android.accounts.Account r1 = r5.mo123842a()
            if (r1 != 0) goto L_0x004a
            goto L_0x0039
        L_0x002e:
            android.accounts.Account r3 = r5.mo123842a()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0039
            goto L_0x004a
        L_0x0039:
            boolean r1 = r4.f397032d
            boolean r3 = r5.mo123846e()
            if (r1 != r3) goto L_0x004a
            boolean r1 = r4.f397033e
            boolean r5 = r5.mo123845d()
            if (r1 != r5) goto L_0x004a
            return r0
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10937f.C147043g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f397029a.hashCode() ^ 1000003) * 1000003) ^ this.f397030b.hashCode()) * 1000003;
        Account account = this.f397031c;
        if (account == null) {
            i = 0;
        } else {
            i = account.hashCode();
        }
        int i2 = 1237;
        int i3 = (((hashCode ^ i) * 1000003) ^ (true != this.f397032d ? 1237 : 1231)) * 1000003;
        if (true == this.f397033e) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String obj = this.f397029a.toString();
        String obj2 = this.f397030b.toString();
        String valueOf = String.valueOf(this.f397031c);
        boolean z = this.f397032d;
        boolean z2 = this.f397033e;
        return "ChannelNotification{identity=" + obj + ", channelId=" + obj2 + ", account=" + valueOf + ", updated=" + z + ", deleted=" + z2 + "}";
    }
}
