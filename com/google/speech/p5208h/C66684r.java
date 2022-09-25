package com.google.speech.p5208h;

import com.google.p4500cm.p4514b.C58172f;
import com.google.p4500cm.p4514b.C58174h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.r */
/* compiled from: PG */
public final class C66684r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66684r f181405c;

    /* renamed from: d */
    public static final C62940bt f181406d;

    /* renamed from: e */
    private static volatile C63010eb f181407e;

    /* renamed from: a */
    public C62971cq f181408a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f181409b;

    static {
        C66684r rVar = new C66684r();
        f181405c = rVar;
        C62942bv.registerDefaultInstance(C66684r.class, rVar);
        f181406d = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, rVar, rVar, (C62958ce) null, 57921610, C63066gd.MESSAGE, C66684r.class);
    }

    private C66684r() {
        emptyProtobufList();
        this.f181409b = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f181405c, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001b\u0003\u001b", new Object[]{"a", C58174h.class, "b", C58172f.class});
            case 3:
                return new C66684r();
            case 4:
                return new C66683q();
            case 5:
                return f181405c;
            case 6:
                C63010eb ebVar = f181407e;
                if (ebVar == null) {
                    synchronized (C66684r.class) {
                        ebVar = f181407e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181405c);
                            f181407e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
