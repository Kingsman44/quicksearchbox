package com.google.p427am.p432b.p433a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.ag */
/* compiled from: PG */
public final class C8628ag extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8628ag f29890g;

    /* renamed from: h */
    private static volatile C63010eb f29891h;

    /* renamed from: a */
    public String f29892a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f29893b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f29894c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f29895d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f29896e;

    /* renamed from: f */
    public int f29897f;

    static {
        C8628ag agVar = new C8628ag();
        f29890g = agVar;
        C62942bv.registerDefaultInstance(C8628ag.class, agVar);
    }

    private C8628ag() {
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
                return newMessageInfo(f29890g, "\u0000\u0006\u0000\u0000\u0001\u000b\u0006\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0006Ȉ\bȈ\n\f\u000b\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C8628ag();
            case 4:
                return new C8626ae();
            case 5:
                return f29890g;
            case 6:
                C63010eb ebVar = f29891h;
                if (ebVar == null) {
                    synchronized (C8628ag.class) {
                        ebVar = f29891h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29890g);
                            f29891h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
