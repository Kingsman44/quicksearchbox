package com.google.assistant.p3897e.p3927k.p3928a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3929l.p3930a.C52783k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.k.a.b */
/* compiled from: PG */
public final class C52662b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52662b f138248a;

    /* renamed from: e */
    private static volatile C63010eb f138249e;

    /* renamed from: b */
    private int f138250b;

    /* renamed from: c */
    private C52783k f138251c;

    /* renamed from: d */
    private byte f138252d = 2;

    static {
        C52662b bVar = new C52662b();
        f138248a = bVar;
        C62942bv.registerDefaultInstance(C52662b.class, bVar);
    }

    private C52662b() {
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138252d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138252d = b;
                return null;
            case 2:
                return newMessageInfo(f138248a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\bဉ\b", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C52662b();
            case 4:
                return new C52661a();
            case 5:
                return f138248a;
            case 6:
                C63010eb ebVar = f138249e;
                if (ebVar == null) {
                    synchronized (C52662b.class) {
                        ebVar = f138249e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138248a);
                            f138249e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
