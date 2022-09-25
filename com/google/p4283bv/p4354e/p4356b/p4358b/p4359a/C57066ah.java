package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57177h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.e.b.b.a.ah */
/* compiled from: PG */
public final class C57066ah extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57066ah f152341d;

    /* renamed from: f */
    private static volatile C63010eb f152342f;

    /* renamed from: a */
    public int f152343a;

    /* renamed from: b */
    public C57177h f152344b;

    /* renamed from: c */
    public CommandOuterClass$Command f152345c;

    /* renamed from: e */
    private byte f152346e = 2;

    static {
        C57066ah ahVar = new C57066ah();
        f152341d = ahVar;
        C62942bv.registerDefaultInstance(C57066ah.class, ahVar);
    }

    private C57066ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152346e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152346e = b;
                return null;
            case 2:
                return newMessageInfo(f152341d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57066ah();
            case 4:
                return new C57065ag();
            case 5:
                return f152341d;
            case 6:
                C63010eb ebVar = f152342f;
                if (ebVar == null) {
                    synchronized (C57066ah.class) {
                        ebVar = f152342f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152341d);
                            f152342f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
