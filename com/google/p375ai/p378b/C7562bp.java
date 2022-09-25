package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.bp */
/* compiled from: PG */
public final class C7562bp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7562bp f26157c;

    /* renamed from: e */
    private static volatile C63010eb f26158e;

    /* renamed from: a */
    public boolean f26159a;

    /* renamed from: b */
    public int f26160b;

    /* renamed from: d */
    private int f26161d;

    static {
        C7562bp bpVar = new C7562bp();
        f26157c = bpVar;
        C62942bv.registerDefaultInstance(C7562bp.class, bpVar);
    }

    private C7562bp() {
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
                return newMessageInfo(f26157c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C7562bp();
            case 4:
                return new C7561bo();
            case 5:
                return f26157c;
            case 6:
                C63010eb ebVar = f26158e;
                if (ebVar == null) {
                    synchronized (C7562bp.class) {
                        ebVar = f26158e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26157c);
                            f26158e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
