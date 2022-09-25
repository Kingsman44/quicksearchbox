package com.google.assistant.p3994s.p3995a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.assistant.s.a.nl */
/* compiled from: PG */
public final class C53426nl extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C53426nl f140205h;

    /* renamed from: j */
    private static volatile C63010eb f140206j;

    /* renamed from: a */
    public int f140207a;

    /* renamed from: b */
    public C63088z f140208b = C63088z.f170246b;

    /* renamed from: c */
    public int f140209c;

    /* renamed from: d */
    public C63204j f140210d;

    /* renamed from: e */
    public int f140211e;

    /* renamed from: f */
    public C53424nj f140212f;

    /* renamed from: g */
    public int f140213g;

    /* renamed from: i */
    private byte f140214i = 2;

    static {
        C53426nl nlVar = new C53426nl();
        f140205h = nlVar;
        C62942bv.registerDefaultInstance(C53426nl.class, nlVar);
    }

    private C53426nl() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140214i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140214i = b;
                return null;
            case 2:
                return newMessageInfo(f140205h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0002\u0001ည\u0000\u0002င\u0001\u0003ᐉ\u0002\u0007ᐉ\u0005\bဌ\u0006\nင\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C53306j.m86810b(), "e"});
            case 3:
                return new C53426nl();
            case 4:
                return new C53425nk();
            case 5:
                return f140205h;
            case 6:
                C63010eb ebVar = f140206j;
                if (ebVar == null) {
                    synchronized (C53426nl.class) {
                        ebVar = f140206j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140205h);
                            f140206j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
