package com.google.protos.p4816ai.p4820d.p4829f.p4830a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.f.a.f */
/* compiled from: PG */
public final class C63261f extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C63261f f170949g;

    /* renamed from: h */
    private static volatile C63010eb f170950h;

    /* renamed from: a */
    public int f170951a;

    /* renamed from: b */
    public String f170952b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f170953c;

    /* renamed from: d */
    public int f170954d;

    /* renamed from: e */
    public int f170955e;

    /* renamed from: f */
    public int f170956f;

    static {
        C63261f fVar = new C63261f();
        f170949g = fVar;
        C62942bv.registerDefaultInstance(C63261f.class, fVar);
    }

    private C63261f() {
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
                return newMessageInfo(f170949g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C63266k.f171001a, C10662f.f35572a, C63268m.f171002a});
            case 3:
                return new C63261f();
            case 4:
                return new C63260e();
            case 5:
                return f170949g;
            case 6:
                C63010eb ebVar = f170950h;
                if (ebVar == null) {
                    synchronized (C63261f.class) {
                        ebVar = f170950h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170949g);
                            f170950h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
