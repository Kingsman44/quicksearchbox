package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.n */
/* compiled from: PG */
public final class C66680n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66680n f181393c;

    /* renamed from: d */
    public static final C62940bt f181394d;

    /* renamed from: f */
    private static volatile C63010eb f181395f;

    /* renamed from: a */
    public int f181396a;

    /* renamed from: b */
    public C66663ec f181397b;

    /* renamed from: e */
    private byte f181398e = 2;

    static {
        C66680n nVar = new C66680n();
        f181393c = nVar;
        C62942bv.registerDefaultInstance(C66680n.class, nVar);
        f181394d = C62942bv.newSingularGeneratedExtension(C66603ca.f181183a, nVar, nVar, (C62958ce) null, 90294205, C63066gd.MESSAGE, C66680n.class);
    }

    private C66680n() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181398e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181398e = b;
                return null;
            case 2:
                return newMessageInfo(f181393c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66680n();
            case 4:
                return new C66679m();
            case 5:
                return f181393c;
            case 6:
                C63010eb ebVar = f181395f;
                if (ebVar == null) {
                    synchronized (C66680n.class) {
                        ebVar = f181395f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181393c);
                            f181395f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
