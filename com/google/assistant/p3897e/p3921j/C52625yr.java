package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.yr */
/* compiled from: PG */
public final class C52625yr extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52625yr f138170e;

    /* renamed from: f */
    private static volatile C63010eb f138171f;

    /* renamed from: a */
    public int f138172a;

    /* renamed from: b */
    public int f138173b;

    /* renamed from: c */
    public C52611yd f138174c;

    /* renamed from: d */
    public String f138175d = BuildConfig.FLAVOR;

    static {
        C52625yr yrVar = new C52625yr();
        f138170e = yrVar;
        C62942bv.registerDefaultInstance(C52625yr.class, yrVar);
    }

    private C52625yr() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f138170e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C52614yg.f138145a, C45240c.f118157a, "d"});
            case 3:
                return new C52625yr();
            case 4:
                return new C52624yq();
            case 5:
                return f138170e;
            case 6:
                C63010eb ebVar = f138171f;
                if (ebVar == null) {
                    synchronized (C52625yr.class) {
                        ebVar = f138171f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138170e);
                            f138171f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
