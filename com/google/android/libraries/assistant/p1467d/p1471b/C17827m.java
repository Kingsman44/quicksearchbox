package com.google.android.libraries.assistant.p1467d.p1471b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.b.m */
/* compiled from: PG */
public final class C17827m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C17827m f51151d;

    /* renamed from: e */
    private static volatile C63010eb f51152e;

    /* renamed from: a */
    public int f51153a;

    /* renamed from: b */
    public String f51154b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f51155c = C62942bv.emptyProtobufList();

    static {
        C17827m mVar = new C17827m();
        f51151d = mVar;
        C62942bv.registerDefaultInstance(C17827m.class, mVar);
    }

    private C17827m() {
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
                return newMessageInfo(f51151d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C17827m();
            case 4:
                return new C17826l();
            case 5:
                return f51151d;
            case 6:
                C63010eb ebVar = f51152e;
                if (ebVar == null) {
                    synchronized (C17827m.class) {
                        ebVar = f51152e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51151d);
                            f51152e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
