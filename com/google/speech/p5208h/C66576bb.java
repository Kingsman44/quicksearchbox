package com.google.speech.p5208h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.bb */
/* compiled from: PG */
public final class C66576bb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66576bb f181093e;

    /* renamed from: f */
    public static final C62940bt f181094f;

    /* renamed from: g */
    private static volatile C63010eb f181095g;

    /* renamed from: a */
    public int f181096a;

    /* renamed from: b */
    public String f181097b = "en-us";

    /* renamed from: c */
    public C62971cq f181098c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public boolean f181099d;

    static {
        C66576bb bbVar = new C66576bb();
        f181093e = bbVar;
        C62942bv.registerDefaultInstance(C66576bb.class, bbVar);
        f181094f = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, bbVar, bbVar, (C62958ce) null, 62101562, C63066gd.MESSAGE, C66576bb.class);
    }

    private C66576bb() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f181093e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0004ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66576bb();
            case 4:
                return new C66575ba();
            case 5:
                return f181093e;
            case 6:
                C63010eb ebVar = f181095g;
                if (ebVar == null) {
                    synchronized (C66576bb.class) {
                        ebVar = f181095g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181093e);
                            f181095g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
