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
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.s.a.bw */
/* compiled from: PG */
public final class C53113bw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53113bw f139182a;

    /* renamed from: b */
    public static final C62940bt f139183b;

    /* renamed from: d */
    private static volatile C63010eb f139184d;

    /* renamed from: c */
    private byte f139185c = 2;

    static {
        C53113bw bwVar = new C53113bw();
        f139182a = bwVar;
        C62942bv.registerDefaultInstance(C53113bw.class, bwVar);
        f139183b = C62942bv.newSingularGeneratedExtension(C53014e.f138959a, bwVar, bwVar, (C62958ce) null, 283837178, C63066gd.MESSAGE, C53113bw.class);
    }

    private C53113bw() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139185c);
            case 1:
                this.f139185c = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f139182a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53113bw();
            case 4:
                return new C53112bv();
            case 5:
                return f139182a;
            case 6:
                C63010eb ebVar = f139184d;
                if (ebVar == null) {
                    synchronized (C53113bw.class) {
                        ebVar = f139184d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139182a);
                            f139184d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
