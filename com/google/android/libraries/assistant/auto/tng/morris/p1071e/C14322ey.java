package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ey */
/* compiled from: PG */
public final class C14322ey extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14322ey f43322f;

    /* renamed from: h */
    private static volatile C63010eb f43323h;

    /* renamed from: a */
    public C14216b f43324a;

    /* renamed from: b */
    public String f43325b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f43326c = emptyProtobufList();

    /* renamed from: d */
    public C14572oe f43327d;

    /* renamed from: e */
    public int f43328e;

    /* renamed from: g */
    private byte f43329g = 2;

    static {
        C14322ey eyVar = new C14322ey();
        f43322f = eyVar;
        C62942bv.registerDefaultInstance(C14322ey.class, eyVar);
    }

    private C14322ey() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43329g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43329g = b;
                return null;
            case 2:
                return newMessageInfo(f43322f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0002\u0001\t\u0002Ȉ\u0003Л\u0004Љ\u0005\f", new Object[]{"a", "b", C45240c.f118157a, C14292dv.class, "d", "e"});
            case 3:
                return new C14322ey();
            case 4:
                return new C14321ex();
            case 5:
                return f43322f;
            case 6:
                C63010eb ebVar = f43323h;
                if (ebVar == null) {
                    synchronized (C14322ey.class) {
                        ebVar = f43323h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43322f);
                            f43323h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
