package com.google.assistant.p3886c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.bb */
/* compiled from: PG */
public final class C50737bb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50737bb f132027d;

    /* renamed from: e */
    private static volatile C63010eb f132028e;

    /* renamed from: a */
    public int f132029a;

    /* renamed from: b */
    public String f132030b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f132031c;

    static {
        C50737bb bbVar = new C50737bb();
        f132027d = bbVar;
        C62942bv.registerDefaultInstance(C50737bb.class, bbVar);
    }

    private C50737bb() {
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
                return newMessageInfo(f132027d, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003ဈ\u0000\u0006ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C50714az.f131972a});
            case 3:
                return new C50737bb();
            case 4:
                return new C50713ay();
            case 5:
                return f132027d;
            case 6:
                C63010eb ebVar = f132028e;
                if (ebVar == null) {
                    synchronized (C50737bb.class) {
                        ebVar = f132028e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132027d);
                            f132028e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
