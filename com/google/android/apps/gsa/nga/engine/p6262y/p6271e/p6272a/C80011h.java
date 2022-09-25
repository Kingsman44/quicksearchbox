package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56339j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.h */
/* compiled from: PG */
public final class C80011h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80011h f219551d;

    /* renamed from: g */
    private static volatile C63010eb f219552g;

    /* renamed from: a */
    public int f219553a;

    /* renamed from: b */
    public C56339j f219554b;

    /* renamed from: c */
    public C79955bc f219555c;

    /* renamed from: e */
    private C62995dn f219556e = C62995dn.f170057a;

    /* renamed from: f */
    private byte f219557f = 2;

    static {
        C80011h hVar = new C80011h();
        f219551d = hVar;
        C62942bv.registerDefaultInstance(C80011h.class, hVar);
    }

    private C80011h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219557f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219557f = b;
                return null;
            case 2:
                return newMessageInfo(f219551d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0001\u0000\u0001\u0001ဉ\u0000\u0003в\u0004ဉ\u0003", new Object[]{"a", "b", "e", C80010g.f219550a, C45240c.f118157a});
            case 3:
                return new C80011h();
            case 4:
                return new C80009f();
            case 5:
                return f219551d;
            case 6:
                C63010eb ebVar = f219552g;
                if (ebVar == null) {
                    synchronized (C80011h.class) {
                        ebVar = f219552g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219551d);
                            f219552g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
