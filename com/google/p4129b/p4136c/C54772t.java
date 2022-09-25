package com.google.p4129b.p4136c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.t */
/* compiled from: PG */
public final class C54772t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54772t f143700c;

    /* renamed from: d */
    private static volatile C63010eb f143701d;

    /* renamed from: a */
    public String f143702a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f143703b = emptyProtobufList();

    static {
        C54772t tVar = new C54772t();
        f143700c = tVar;
        C62942bv.registerDefaultInstance(C54772t.class, tVar);
    }

    private C54772t() {
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
                return newMessageInfo(f143700c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001Ȉ\u0003\u001b", new Object[]{"a", "b", C54769q.class});
            case 3:
                return new C54772t();
            case 4:
                return new C54771s();
            case 5:
                return f143700c;
            case 6:
                C63010eb ebVar = f143701d;
                if (ebVar == null) {
                    synchronized (C54772t.class) {
                        ebVar = f143701d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143700c);
                            f143701d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
