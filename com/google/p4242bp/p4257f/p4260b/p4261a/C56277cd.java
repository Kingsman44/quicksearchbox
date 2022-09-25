package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.cd */
/* compiled from: PG */
public final class C56277cd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56277cd f149981d;

    /* renamed from: e */
    private static volatile C63010eb f149982e;

    /* renamed from: a */
    public int f149983a;

    /* renamed from: b */
    public String f149984b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f149985c = "auto";

    static {
        C56277cd cdVar = new C56277cd();
        f149981d = cdVar;
        C62942bv.registerDefaultInstance(C56277cd.class, cdVar);
    }

    private C56277cd() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f149981d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56277cd();
            case 4:
                return new C56276cc();
            case 5:
                return f149981d;
            case 6:
                C63010eb ebVar = f149982e;
                if (ebVar == null) {
                    synchronized (C56277cd.class) {
                        ebVar = f149982e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149981d);
                            f149982e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
