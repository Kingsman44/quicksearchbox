package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aki */
/* compiled from: PG */
public final class aki extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aki f135262d;

    /* renamed from: e */
    private static volatile C63010eb f135263e;

    /* renamed from: a */
    public int f135264a;

    /* renamed from: b */
    public String f135265b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f135266c;

    static {
        aki aki = new aki();
        f135262d = aki;
        C62942bv.registerDefaultInstance(aki.class, aki);
    }

    private aki() {
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
                return newMessageInfo(f135262d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, akh.f135261a});
            case 3:
                return new aki();
            case 4:
                return new akg();
            case 5:
                return f135262d;
            case 6:
                C63010eb ebVar = f135263e;
                if (ebVar == null) {
                    synchronized (aki.class) {
                        ebVar = f135263e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135262d);
                            f135263e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
