package com.google.p4283bv.p4287b.p4288a.p4289a.p4318w;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.w.b */
/* compiled from: PG */
public final class C56831b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56831b f151632b;

    /* renamed from: d */
    private static volatile C63010eb f151633d;

    /* renamed from: a */
    public String f151634a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f151635c;

    static {
        C56831b bVar = new C56831b();
        f151632b = bVar;
        C62942bv.registerDefaultInstance(C56831b.class, bVar);
    }

    private C56831b() {
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
                return newMessageInfo(f151632b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56831b();
            case 4:
                return new C56830a();
            case 5:
                return f151632b;
            case 6:
                C63010eb ebVar = f151633d;
                if (ebVar == null) {
                    synchronized (C56831b.class) {
                        ebVar = f151633d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151632b);
                            f151633d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
