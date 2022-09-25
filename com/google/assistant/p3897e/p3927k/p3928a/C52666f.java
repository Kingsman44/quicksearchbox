package com.google.assistant.p3897e.p3927k.p3928a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C52432rn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.k.a.f */
/* compiled from: PG */
public final class C52666f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52666f f138258d;

    /* renamed from: g */
    private static volatile C63010eb f138259g;

    /* renamed from: a */
    public C51715bm f138260a;

    /* renamed from: b */
    public C52432rn f138261b;

    /* renamed from: c */
    public boolean f138262c;

    /* renamed from: e */
    private C51715bm f138263e;

    /* renamed from: f */
    private byte f138264f = 2;

    static {
        C52666f fVar = new C52666f();
        f138258d = fVar;
        C62942bv.registerDefaultInstance(C52666f.class, fVar);
    }

    private C52666f() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138264f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138264f = b;
                return null;
            case 2:
                return newMessageInfo(f138258d, "\u0000\u0004\u0000\u0000\u0001\b\u0004\u0000\u0000\u0002\u0001Љ\u0002\t\u0003\u0007\bЉ", new Object[]{"a", "b", C45240c.f118157a, "e"});
            case 3:
                return new C52666f();
            case 4:
                return new C52665e();
            case 5:
                return f138258d;
            case 6:
                C63010eb ebVar = f138259g;
                if (ebVar == null) {
                    synchronized (C52666f.class) {
                        ebVar = f138259g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138258d);
                            f138259g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
