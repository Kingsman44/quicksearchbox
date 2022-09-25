package com.google.protos.p4985f.p5030q;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.fg */
/* compiled from: PG */
public final class C65200fg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C65200fg f176467f;

    /* renamed from: g */
    private static volatile C63010eb f176468g;

    /* renamed from: a */
    public String f176469a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f176470b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f176471c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f176472d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f176473e = BuildConfig.FLAVOR;

    static {
        C65200fg fgVar = new C65200fg();
        f176467f = fgVar;
        C62942bv.registerDefaultInstance(C65200fg.class, fgVar);
    }

    private C65200fg() {
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
                return newMessageInfo(f176467f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C65200fg();
            case 4:
                return new C65199ff();
            case 5:
                return f176467f;
            case 6:
                C63010eb ebVar = f176468g;
                if (ebVar == null) {
                    synchronized (C65200fg.class) {
                        ebVar = f176468g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176467f);
                            f176468g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
