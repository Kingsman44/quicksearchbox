package com.google.assistant.p4008y.p4009a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4495cl.p4497b.p4498a.p4499a.C58135f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.d */
/* compiled from: PG */
public final class C53595d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53595d f140670d;

    /* renamed from: e */
    private static volatile C63010eb f140671e;

    /* renamed from: a */
    public int f140672a;

    /* renamed from: b */
    public String f140673b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C58135f f140674c;

    static {
        C53595d dVar = new C53595d();
        f140670d = dVar;
        C62942bv.registerDefaultInstance(C53595d.class, dVar);
    }

    private C53595d() {
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
                return newMessageInfo(f140670d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53595d();
            case 4:
                return new C53594c();
            case 5:
                return f140670d;
            case 6:
                C63010eb ebVar = f140671e;
                if (ebVar == null) {
                    synchronized (C53595d.class) {
                        ebVar = f140671e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140670d);
                            f140671e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
