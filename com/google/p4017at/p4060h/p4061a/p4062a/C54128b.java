package com.google.p4017at.p4060h.p4061a.p4062a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p395al.p417d.p418a.C8535ao;
import com.google.p395al.p417d.p418a.C8584k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.b */
/* compiled from: PG */
public final class C54128b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54128b f142037d;

    /* renamed from: g */
    private static volatile C63010eb f142038g;

    /* renamed from: a */
    public int f142039a;

    /* renamed from: b */
    public C8535ao f142040b;

    /* renamed from: c */
    public C8584k f142041c;

    /* renamed from: e */
    private C60220t f142042e;

    /* renamed from: f */
    private byte f142043f = 2;

    static {
        C54128b bVar = new C54128b();
        f142037d = bVar;
        C62942bv.registerDefaultInstance(C54128b.class, bVar);
    }

    private C54128b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142043f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142043f = b;
                return null;
            case 2:
                return newMessageInfo(f142037d, "\u0001\u0003\u0000\u0001\u0002\u0007\u0003\u0000\u0000\u0001\u0002ဉ\u0000\u0004ဉ\u0002\u0007ᐉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "e"});
            case 3:
                return new C54128b();
            case 4:
                return new C54075a();
            case 5:
                return f142037d;
            case 6:
                C63010eb ebVar = f142038g;
                if (ebVar == null) {
                    synchronized (C54128b.class) {
                        ebVar = f142038g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142037d);
                            f142038g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
