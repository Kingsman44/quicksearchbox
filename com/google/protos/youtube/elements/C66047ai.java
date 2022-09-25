package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.ai */
/* compiled from: PG */
public final class C66047ai extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66047ai f179616e;

    /* renamed from: f */
    public static final C62940bt f179617f;

    /* renamed from: g */
    private static volatile C63010eb f179618g;

    /* renamed from: a */
    public int f179619a;

    /* renamed from: b */
    public C66043ae f179620b;

    /* renamed from: c */
    public C66043ae f179621c;

    /* renamed from: d */
    public C66206dt f179622d;

    static {
        C66047ai aiVar = new C66047ai();
        f179616e = aiVar;
        C62942bv.registerDefaultInstance(C66047ai.class, aiVar);
        f179617f = C62942bv.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.f179521a, aiVar, aiVar, (C62958ce) null, 463642931, C63066gd.MESSAGE, C66047ai.class);
    }

    private C66047ai() {
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
                return newMessageInfo(f179616e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66047ai();
            case 4:
                return new C66046ah();
            case 5:
                return f179616e;
            case 6:
                C63010eb ebVar = f179618g;
                if (ebVar == null) {
                    synchronized (C66047ai.class) {
                        ebVar = f179618g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179616e);
                            f179618g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
