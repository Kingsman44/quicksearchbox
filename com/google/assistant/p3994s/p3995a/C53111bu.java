package com.google.assistant.p3994s.p3995a;

import com.google.assistant.p3980n.p3985c.C53014e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.s.a.bu */
/* compiled from: PG */
public final class C53111bu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53111bu f139178a;

    /* renamed from: b */
    public static final C62940bt f139179b;

    /* renamed from: d */
    private static volatile C63010eb f139180d;

    /* renamed from: c */
    private byte f139181c = 2;

    static {
        C53111bu buVar = new C53111bu();
        f139178a = buVar;
        C62942bv.registerDefaultInstance(C53111bu.class, buVar);
        f139179b = C62942bv.newSingularGeneratedExtension(C53014e.f138959a, buVar, buVar, (C62958ce) null, 208181233, C63066gd.MESSAGE, C53111bu.class);
    }

    private C53111bu() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139181c);
            case 1:
                this.f139181c = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f139178a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53111bu();
            case 4:
                return new C53110bt();
            case 5:
                return f139178a;
            case 6:
                C63010eb ebVar = f139180d;
                if (ebVar == null) {
                    synchronized (C53111bu.class) {
                        ebVar = f139180d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139178a);
                            f139180d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
