package com.google.protobuf;

/* renamed from: com.google.protobuf.cz */
/* compiled from: PG */
public class C62980cz {

    /* renamed from: a */
    protected volatile MessageLite f170036a;

    /* renamed from: b */
    public volatile C63088z f170037b;

    static {
        C62921ba baVar = C62921ba.f169869a;
    }

    /* renamed from: a */
    public final int mo58957a() {
        if (this.f170037b != null) {
            return this.f170037b.mo59031d();
        }
        if (this.f170036a != null) {
            return this.f170036a.getSerializedSize();
        }
        return 0;
    }

    /* renamed from: b */
    public final C63088z mo58958b() {
        if (this.f170037b != null) {
            return this.f170037b;
        }
        synchronized (this) {
            if (this.f170037b != null) {
                C63088z zVar = this.f170037b;
                return zVar;
            }
            if (this.f170036a == null) {
                this.f170037b = C63088z.f170246b;
            } else {
                this.f170037b = this.f170036a.toByteString();
            }
            C63088z zVar2 = this.f170037b;
            return zVar2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58959c(com.google.protobuf.MessageLite r2) {
        /*
            r1 = this;
            com.google.protobuf.MessageLite r0 = r1.f170036a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.protobuf.MessageLite r0 = r1.f170036a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f170036a = r2     // Catch:{ ct -> 0x0011 }
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.f170246b     // Catch:{ ct -> 0x0011 }
            r1.f170037b = r0     // Catch:{ ct -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f170036a = r2     // Catch:{ all -> 0x001b }
            com.google.protobuf.z r2 = com.google.protobuf.C63088z.f170246b     // Catch:{ all -> 0x001b }
            r1.f170037b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C62980cz.mo58959c(com.google.protobuf.MessageLite):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62980cz)) {
            return false;
        }
        C62980cz czVar = (C62980cz) obj;
        MessageLite messageLite = this.f170036a;
        MessageLite messageLite2 = czVar.f170036a;
        if (messageLite == null && messageLite2 == null) {
            return mo58958b().equals(czVar.mo58958b());
        }
        if (messageLite != null && messageLite2 != null) {
            return messageLite.equals(messageLite2);
        }
        if (messageLite != null) {
            czVar.mo58959c(messageLite.getDefaultInstanceForType());
            return messageLite.equals(czVar.f170036a);
        }
        mo58959c(messageLite2.getDefaultInstanceForType());
        return this.f170036a.equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}
