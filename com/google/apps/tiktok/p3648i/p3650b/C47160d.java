package com.google.apps.tiktok.p3648i.p3650b;

import com.google.android.libraries.storage.protostore.C43007j;
import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.apps.tiktok.i.b.d */
/* compiled from: PG */
final class C47160d extends C47164h {

    /* renamed from: a */
    private final String f122801a;

    /* renamed from: b */
    private final MessageLite f122802b;

    /* renamed from: c */
    private final C47153d f122803c;

    /* renamed from: d */
    private final C58485gu f122804d;

    /* renamed from: e */
    private final C43007j f122805e;

    /* renamed from: f */
    private final C60887da f122806f;

    /* renamed from: g */
    private final C47162f f122807g;

    public C47160d(String str, MessageLite messageLite, C47153d dVar, C58485gu guVar, C43007j jVar, C60887da daVar, C47162f fVar) {
        this.f122801a = str;
        this.f122802b = messageLite;
        this.f122803c = dVar;
        this.f122804d = guVar;
        this.f122805e = jVar;
        this.f122806f = daVar;
        this.f122807g = fVar;
    }

    /* renamed from: a */
    public final C43007j mo51070a() {
        return this.f122805e;
    }

    /* renamed from: b */
    public final C47153d mo51071b() {
        return this.f122803c;
    }

    /* renamed from: c */
    public final C47162f mo51072c() {
        return this.f122807g;
    }

    /* renamed from: d */
    public final C58485gu mo51073d() {
        return this.f122804d;
    }

    /* renamed from: e */
    public final C60887da mo51074e() {
        return this.f122806f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r1 = r4.f122806f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        r1 = r4.f122807g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.apps.tiktok.p3648i.p3650b.C47164h
            r2 = 0
            if (r1 == 0) goto L_0x0073
            com.google.apps.tiktok.i.b.h r5 = (com.google.apps.tiktok.p3648i.p3650b.C47164h) r5
            java.lang.String r1 = r4.f122801a
            java.lang.String r3 = r5.mo51077g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0073
            com.google.protobuf.MessageLite r1 = r4.f122802b
            com.google.protobuf.MessageLite r3 = r5.mo51076f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0073
            com.google.apps.tiktok.i.a.d r1 = r4.f122803c
            com.google.apps.tiktok.i.a.d r3 = r5.mo51071b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0073
            com.google.common.b.gu r1 = r4.f122804d
            com.google.common.b.gu r3 = r5.mo51073d()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x0073
            com.google.android.libraries.storage.protostore.j r1 = r4.f122805e
            com.google.android.libraries.storage.protostore.j r3 = r5.mo51070a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0073
            com.google.common.util.concurrent.da r1 = r4.f122806f
            if (r1 != 0) goto L_0x0052
            com.google.common.util.concurrent.da r1 = r5.mo51074e()
            if (r1 != 0) goto L_0x0073
            goto L_0x005c
        L_0x0052:
            com.google.common.util.concurrent.da r3 = r5.mo51074e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0073
        L_0x005c:
            com.google.apps.tiktok.i.b.f r1 = r4.f122807g
            if (r1 != 0) goto L_0x0067
            com.google.apps.tiktok.i.b.f r5 = r5.mo51072c()
            if (r5 != 0) goto L_0x0073
            goto L_0x0072
        L_0x0067:
            com.google.apps.tiktok.i.b.f r5 = r5.mo51072c()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            return r0
        L_0x0073:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.p3648i.p3650b.C47160d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final MessageLite mo51076f() {
        return this.f122802b;
    }

    /* renamed from: g */
    public final String mo51077g() {
        return this.f122801a;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((this.f122801a.hashCode() ^ 1000003) * 1000003) ^ this.f122802b.hashCode()) * 1000003) ^ this.f122803c.hashCode()) * 1000003) ^ this.f122804d.hashCode()) * 1000003) ^ this.f122805e.hashCode()) * 1000003;
        C60887da daVar = this.f122806f;
        int i2 = 0;
        if (daVar == null) {
            i = 0;
        } else {
            i = daVar.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        C47162f fVar = this.f122807g;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.f122801a;
        String obj = this.f122802b.toString();
        String obj2 = this.f122803c.toString();
        String valueOf = String.valueOf(this.f122804d);
        String obj3 = this.f122805e.toString();
        String valueOf2 = String.valueOf(this.f122806f);
        String valueOf3 = String.valueOf(this.f122807g);
        return "ProtoDataStoreConfig{name=" + str + ", schema=" + obj + ", storage=" + obj2 + ", migrations=" + valueOf + ", handler=" + obj3 + ", ioExecutor=" + valueOf2 + ", lamsConfig=" + valueOf3 + "}";
    }
}
