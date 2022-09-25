package com.google.protos.p4985f.p4986a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.ao */
/* compiled from: PG */
public final class C64661ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64661ao f175264d;

    /* renamed from: e */
    private static volatile C63010eb f175265e;

    /* renamed from: a */
    public int f175266a;

    /* renamed from: b */
    public String f175267b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C64663aq f175268c;

    static {
        C64661ao aoVar = new C64661ao();
        f175264d = aoVar;
        C62942bv.registerDefaultInstance(C64661ao.class, aoVar);
    }

    private C64661ao() {
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
                return newMessageInfo(f175264d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64661ao();
            case 4:
                return new C64660an();
            case 5:
                return f175264d;
            case 6:
                C63010eb ebVar = f175265e;
                if (ebVar == null) {
                    synchronized (C64661ao.class) {
                        ebVar = f175265e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175264d);
                            f175265e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
