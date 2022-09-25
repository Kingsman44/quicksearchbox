package com.google.protos.p4850an;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.protos.an.b */
/* compiled from: PG */
public final class C63356b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C63356b f171209a;

    /* renamed from: g */
    private static volatile C63010eb f171210g;

    /* renamed from: b */
    private int f171211b;

    /* renamed from: c */
    private C63630n f171212c;

    /* renamed from: d */
    private C63387be f171213d;

    /* renamed from: e */
    private C63771b f171214e;

    /* renamed from: f */
    private byte f171215f = 2;

    static {
        C63356b bVar = new C63356b();
        f171209a = bVar;
        C62942bv.registerDefaultInstance(C63356b.class, bVar);
    }

    private C63356b() {
        C62942bv.emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171215f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171215f = b;
                return null;
            case 2:
                return newMessageInfo(f171209a, "\u0001\u0003\u0000\u0001\u0007\u000e\u0003\u0000\u0000\u0003\u0007ᐉ\u0002\rᐉ\u0001\u000eᐉ\u0007", new Object[]{"b", "d", C45240c.f118157a, "e"});
            case 3:
                return new C63356b();
            case 4:
                return new C63316a();
            case 5:
                return f171209a;
            case 6:
                C63010eb ebVar = f171210g;
                if (ebVar == null) {
                    synchronized (C63356b.class) {
                        ebVar = f171210g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171209a);
                            f171210g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
