package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.yx */
/* compiled from: PG */
public final class C60681yx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60681yx f164631e;

    /* renamed from: f */
    private static volatile C63010eb f164632f;

    /* renamed from: a */
    public int f164633a;

    /* renamed from: b */
    public int f164634b;

    /* renamed from: c */
    public String f164635c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f164636d;

    static {
        C60681yx yxVar = new C60681yx();
        f164631e = yxVar;
        C62942bv.registerDefaultInstance(C60681yx.class, yxVar);
    }

    private C60681yx() {
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
                return newMessageInfo(f164631e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C90584f.m147801b()});
            case 3:
                return new C60681yx();
            case 4:
                return new C60680yw();
            case 5:
                return f164631e;
            case 6:
                C63010eb ebVar = f164632f;
                if (ebVar == null) {
                    synchronized (C60681yx.class) {
                        ebVar = f164632f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164631e);
                            f164632f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
