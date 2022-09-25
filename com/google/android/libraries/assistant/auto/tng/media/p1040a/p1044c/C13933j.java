package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c;

import android.support.p031v4.media.session.C0320v;
import com.google.assistant.p3897e.p3921j.C52179id;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.c.j */
/* compiled from: PG */
final class C13933j extends C13931h {

    /* renamed from: a */
    private final C0320v f42408a;

    /* renamed from: b */
    private final String f42409b;

    /* renamed from: c */
    private final C52179id f42410c;

    public C13933j(C0320v vVar, String str, C52179id idVar) {
        this.f42408a = vVar;
        this.f42409b = str;
        this.f42410c = idVar;
    }

    /* renamed from: a */
    public final C0320v mo21360a() {
        return this.f42408a;
    }

    /* renamed from: b */
    public final C52179id mo21361b() {
        return this.f42410c;
    }

    /* renamed from: c */
    public final String mo21362c() {
        return this.f42409b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f42410c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f42409b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.C13931h
            r2 = 0
            if (r1 == 0) goto L_0x0043
            com.google.android.libraries.assistant.auto.tng.media.a.c.h r5 = (com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.C13931h) r5
            android.support.v4.media.session.v r1 = r4.f42408a
            android.support.v4.media.session.v r3 = r5.mo21360a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0043
            java.lang.String r1 = r4.f42409b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo21362c()
            if (r1 != 0) goto L_0x0043
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.mo21362c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0043
        L_0x002c:
            com.google.assistant.e.j.id r1 = r4.f42410c
            if (r1 != 0) goto L_0x0037
            com.google.assistant.e.j.id r5 = r5.mo21361b()
            if (r5 != 0) goto L_0x0043
            goto L_0x0042
        L_0x0037:
            com.google.assistant.e.j.id r5 = r5.mo21361b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            return r0
        L_0x0043:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.C13933j.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f42408a.hashCode() ^ 1000003) * 1000003;
        String str = this.f42409b;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        C52179id idVar = this.f42410c;
        if (idVar != null) {
            i2 = idVar.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String obj = this.f42408a.toString();
        String str = this.f42409b;
        String valueOf = String.valueOf(this.f42410c);
        return "AssistantAutoMediaAppFlowMetadata{mediaControllerCompat=" + obj + ", playMusicUri=" + str + ", mediaErrorCode=" + valueOf + "}";
    }
}
