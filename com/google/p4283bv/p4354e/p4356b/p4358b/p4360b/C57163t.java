package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57774f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.b.b.t */
/* compiled from: PG */
public final class C57163t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57163t f152605c;

    /* renamed from: d */
    public static final C62940bt f152606d;

    /* renamed from: f */
    private static volatile C63010eb f152607f;

    /* renamed from: a */
    public int f152608a;

    /* renamed from: b */
    public C57057b f152609b;

    /* renamed from: e */
    private byte f152610e = 2;

    static {
        C57163t tVar = new C57163t();
        f152605c = tVar;
        C62942bv.registerDefaultInstance(C57163t.class, tVar);
        f152606d = C62942bv.newSingularGeneratedExtension(C57774f.f154362a, tVar, tVar, (C62958ce) null, 280361304, C63066gd.MESSAGE, C57163t.class);
    }

    private C57163t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152610e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152610e = b;
                return null;
            case 2:
                return newMessageInfo(f152605c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57163t();
            case 4:
                return new C57162s();
            case 5:
                return f152605c;
            case 6:
                C63010eb ebVar = f152607f;
                if (ebVar == null) {
                    synchronized (C57163t.class) {
                        ebVar = f152607f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152605c);
                            f152607f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
