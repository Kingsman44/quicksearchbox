package com.google.protos.p4850an;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4671b.C61784ac;
import com.google.p4242bp.p4257f.p4262c.C56342d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.n */
/* compiled from: PG */
public final class C63630n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63630n f172086a;

    /* renamed from: g */
    private static volatile C63010eb f172087g;

    /* renamed from: b */
    private int f172088b;

    /* renamed from: c */
    private C61784ac f172089c;

    /* renamed from: d */
    private C63628l f172090d;

    /* renamed from: e */
    private C56342d f172091e;

    /* renamed from: f */
    private byte f172092f = 2;

    static {
        C63630n nVar = new C63630n();
        f172086a = nVar;
        C62942bv.registerDefaultInstance(C63630n.class, nVar);
    }

    private C63630n() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172092f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172092f = b;
                return null;
            case 2:
                return newMessageInfo(f172086a, "\u0001\u0003\u0000\u0001\u0005\u0012\u0003\u0000\u0000\u0003\u0005ᐉ\u0004\fᐉ\u000b\u0012ᐉ\u000e", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C63630n();
            case 4:
                return new C63629m();
            case 5:
                return f172086a;
            case 6:
                C63010eb ebVar = f172087g;
                if (ebVar == null) {
                    synchronized (C63630n.class) {
                        ebVar = f172087g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172086a);
                            f172087g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
