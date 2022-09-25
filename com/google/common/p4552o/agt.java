package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.agt */
/* compiled from: PG */
public final class agt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final agt f158667c;

    /* renamed from: d */
    private static volatile C63010eb f158668d;

    /* renamed from: a */
    public int f158669a;

    /* renamed from: b */
    public String f158670b = BuildConfig.FLAVOR;

    static {
        agt agt = new agt();
        f158667c = agt;
        C62942bv.registerDefaultInstance(agt.class, agt);
    }

    private agt() {
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
                return newMessageInfo(f158667c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new agt();
            case 4:
                return new ags();
            case 5:
                return f158667c;
            case 6:
                C63010eb ebVar = f158668d;
                if (ebVar == null) {
                    synchronized (agt.class) {
                        ebVar = f158668d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158667c);
                            f158668d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
