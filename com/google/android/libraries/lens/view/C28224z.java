package com.google.android.libraries.lens.view;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60708zx;

/* renamed from: com.google.android.libraries.lens.view.z */
/* compiled from: PG */
public final class C28224z {

    /* renamed from: a */
    public static final C58974d f76835a = C58974d.m91135i("StartIdProvider");

    /* renamed from: b */
    public volatile C28222y f76836b;

    /* renamed from: c */
    public volatile C60708zx f76837c;

    /* renamed from: d */
    public int f76838d = -1;

    /* renamed from: e */
    private volatile String f76839e;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28224z(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.<init>()
            r0 = -1
            r7.f76838d = r0
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L_0x0077
            java.lang.String r2 = "lensView_lensViewStartIdState"
            byte[] r8 = r8.getByteArray(r2)
            r8.getClass()
            byte[] r8 = (byte[]) r8     // Catch:{ NullPointerException -> 0x0065, IllegalArgumentException -> 0x0063, ct -> 0x0061 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ NullPointerException -> 0x0065, IllegalArgumentException -> 0x0063, ct -> 0x0061 }
            com.google.common.o.zx r3 = com.google.common.p4552o.C60708zx.f164713d     // Catch:{ NullPointerException -> 0x0065, IllegalArgumentException -> 0x0063, ct -> 0x0061 }
            com.google.protobuf.bv r8 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r8, (com.google.protobuf.C62921ba) r2)     // Catch:{ NullPointerException -> 0x0065, IllegalArgumentException -> 0x0063, ct -> 0x0061 }
            com.google.common.o.zx r8 = (com.google.common.p4552o.C60708zx) r8     // Catch:{ NullPointerException -> 0x0065, IllegalArgumentException -> 0x0063, ct -> 0x0061 }
            com.google.protobuf.z r2 = r8.f164716b     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            byte[] r2 = r2.mo59174N()     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            int r3 = r2.length     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            r4 = 16
            if (r3 != r4) goto L_0x0046
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            long r3 = r2.getLong()     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            long r5 = r2.getLong()     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            java.util.UUID r2 = new java.util.UUID     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            r2.<init>(r3, r5)     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            int r3 = r8.f164717c     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            com.google.android.libraries.lens.view.a r4 = new com.google.android.libraries.lens.view.a     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            r4.<init>(r2, r3)     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            r1 = r4
            goto L_0x0078
        L_0x0046:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            java.lang.String r4 = "Unexpected size %s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            r5[r0] = r3     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            java.lang.String r3 = java.lang.String.format(r4, r5)     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            r2.<init>(r3)     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
            throw r2     // Catch:{ NullPointerException -> 0x005f, IllegalArgumentException -> 0x005d, ct -> 0x005b }
        L_0x005b:
            r2 = move-exception
            goto L_0x0068
        L_0x005d:
            r2 = move-exception
            goto L_0x0068
        L_0x005f:
            r2 = move-exception
            goto L_0x0068
        L_0x0061:
            r8 = move-exception
            goto L_0x0066
        L_0x0063:
            r8 = move-exception
            goto L_0x0066
        L_0x0065:
            r8 = move-exception
        L_0x0066:
            r2 = r8
            r8 = r1
        L_0x0068:
            com.google.common.f.a.d r3 = f76835a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "***** Can't restore saved instance. Recreating..."
            r5 = 48991(0xbf5f, float:6.8651E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0078
        L_0x0077:
            r8 = r1
        L_0x0078:
            if (r1 != 0) goto L_0x0084
            java.util.UUID r1 = java.util.UUID.randomUUID()
            com.google.android.libraries.lens.view.a r2 = new com.google.android.libraries.lens.view.a
            r2.<init>(r1, r0)
            r1 = r2
        L_0x0084:
            if (r8 != 0) goto L_0x008a
            com.google.common.o.zx r8 = r1.mo33728c()
        L_0x008a:
            r7.f76836b = r1
            r7.f76837c = r8
            java.lang.String r8 = r1.toString()
            r7.f76839e = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.C28224z.<init>(android.os.Bundle):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo33730a() {
        C28222y yVar = this.f76836b;
        C24946a aVar = new C24946a(((C24946a) yVar).f68075a, ((C24946a) yVar).f68076b + 1);
        this.f76836b = aVar;
        this.f76837c = aVar.mo33728c();
        this.f76839e = aVar.toString();
        ((C58970a) ((C58970a) f76835a.mo56224b()).mo56372aa(48992)).mo56389s("***** incrementRunIndex %s", this.f76839e);
    }

    public final String toString() {
        return this.f76839e;
    }
}
