package com.google.p427am.p432b.p433a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.bc */
/* compiled from: PG */
public final class C8651bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8651bc f29941c;

    /* renamed from: d */
    private static volatile C63010eb f29942d;

    /* renamed from: a */
    public String f29943a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f29944b;

    static {
        C8651bc bcVar = new C8651bc();
        f29941c = bcVar;
        C62942bv.registerDefaultInstance(C8651bc.class, bcVar);
    }

    private C8651bc() {
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
                return newMessageInfo(f29941c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C8651bc();
            case 4:
                return new C8650bb();
            case 5:
                return f29941c;
            case 6:
                C63010eb ebVar = f29942d;
                if (ebVar == null) {
                    synchronized (C8651bc.class) {
                        ebVar = f29942d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29941c);
                            f29942d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
