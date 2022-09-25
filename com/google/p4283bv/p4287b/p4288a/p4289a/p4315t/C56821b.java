package com.google.p4283bv.p4287b.p4288a.p4289a.p4315t;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.t.b */
/* compiled from: PG */
public final class C56821b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56821b f151610b;

    /* renamed from: d */
    private static volatile C63010eb f151611d;

    /* renamed from: a */
    public String f151612a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f151613c;

    static {
        C56821b bVar = new C56821b();
        f151610b = bVar;
        C62942bv.registerDefaultInstance(C56821b.class, bVar);
    }

    private C56821b() {
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
                return newMessageInfo(f151610b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56821b();
            case 4:
                return new C56820a();
            case 5:
                return f151610b;
            case 6:
                C63010eb ebVar = f151611d;
                if (ebVar == null) {
                    synchronized (C56821b.class) {
                        ebVar = f151611d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151610b);
                            f151611d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
