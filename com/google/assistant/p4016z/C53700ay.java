package com.google.assistant.p4016z;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8217af;
import com.google.p4479cg.C58079k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.ay */
/* compiled from: PG */
public final class C53700ay extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53700ay f140964d;

    /* renamed from: g */
    private static volatile C63010eb f140965g;

    /* renamed from: a */
    public C58079k f140966a;

    /* renamed from: b */
    public C62971cq f140967b;

    /* renamed from: c */
    public boolean f140968c;

    /* renamed from: e */
    private int f140969e;

    /* renamed from: f */
    private byte f140970f = 2;

    static {
        C53700ay ayVar = new C53700ay();
        f140964d = ayVar;
        C62942bv.registerDefaultInstance(C53700ay.class, ayVar);
    }

    private C53700ay() {
        emptyProtobufList();
        this.f140967b = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140970f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140970f = b;
                return null;
            case 2:
                return newMessageInfo(f140964d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0004Л\u0005ဇ\u0002", new Object[]{"e", "a", "b", C8217af.class, C45240c.f118157a});
            case 3:
                return new C53700ay();
            case 4:
                return new C53699ax();
            case 5:
                return f140964d;
            case 6:
                C63010eb ebVar = f140965g;
                if (ebVar == null) {
                    synchronized (C53700ay.class) {
                        ebVar = f140965g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140964d);
                            f140965g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
