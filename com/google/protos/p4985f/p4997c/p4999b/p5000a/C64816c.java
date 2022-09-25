package com.google.protos.p4985f.p4997c.p4999b.p5000a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.c.b.a.c */
/* compiled from: PG */
public final class C64816c extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C64816c f175632g;

    /* renamed from: h */
    private static volatile C63010eb f175633h;

    /* renamed from: a */
    public String f175634a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f175635b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f175636c;

    /* renamed from: d */
    public String f175637d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f175638e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f175639f = BuildConfig.FLAVOR;

    static {
        C64816c cVar = new C64816c();
        f175632g = cVar;
        C62942bv.registerDefaultInstance(C64816c.class, cVar);
    }

    private C64816c() {
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
                return newMessageInfo(f175632g, "\u0000\u0006\u0000\u0000\u0002\t\u0006\u0000\u0000\u0000\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ\tȈ", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C64816c();
            case 4:
                return new C64814a();
            case 5:
                return f175632g;
            case 6:
                C63010eb ebVar = f175633h;
                if (ebVar == null) {
                    synchronized (C64816c.class) {
                        ebVar = f175633h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175632g);
                            f175633h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
