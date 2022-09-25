package com.google.android.apps.gsa.nga.engine.p6026f.p6028b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.b.r */
/* compiled from: PG */
public final class C76023r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C76023r f210863c;

    /* renamed from: d */
    private static volatile C63010eb f210864d;

    /* renamed from: a */
    public String f210865a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f210866b = BuildConfig.FLAVOR;

    static {
        C76023r rVar = new C76023r();
        f210863c = rVar;
        C62942bv.registerDefaultInstance(C76023r.class, rVar);
    }

    private C76023r() {
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
                return newMessageInfo(f210863c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C76023r();
            case 4:
                return new C76022q();
            case 5:
                return f210863c;
            case 6:
                C63010eb ebVar = f210864d;
                if (ebVar == null) {
                    synchronized (C76023r.class) {
                        ebVar = f210864d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f210863c);
                            f210864d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
