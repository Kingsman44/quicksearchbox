package com.google.p4500cm.p4514b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.b.f */
/* compiled from: PG */
public final class C58172f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C58172f f155520d;

    /* renamed from: e */
    private static volatile C63010eb f155521e;

    /* renamed from: a */
    public int f155522a;

    /* renamed from: b */
    public String f155523b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f155524c = BuildConfig.FLAVOR;

    static {
        C58172f fVar = new C58172f();
        f155520d = fVar;
        C62942bv.registerDefaultInstance(C58172f.class, fVar);
    }

    private C58172f() {
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
                return newMessageInfo(f155520d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C58172f();
            case 4:
                return new C58171e();
            case 5:
                return f155520d;
            case 6:
                C63010eb ebVar = f155521e;
                if (ebVar == null) {
                    synchronized (C58172f.class) {
                        ebVar = f155521e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155520d);
                            f155521e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
