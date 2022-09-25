package com.google.p343ac.p358e.p359a.p360a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ac.e.a.a.b */
/* compiled from: PG */
public final class C6665b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C6665b f19917f;

    /* renamed from: g */
    private static volatile C63010eb f19918g;

    /* renamed from: a */
    public int f19919a;

    /* renamed from: b */
    public long f19920b;

    /* renamed from: c */
    public long f19921c;

    /* renamed from: d */
    public long f19922d;

    /* renamed from: e */
    public String f19923e = BuildConfig.FLAVOR;

    static {
        C6665b bVar = new C6665b();
        f19917f = bVar;
        C62942bv.registerDefaultInstance(C6665b.class, bVar);
    }

    private C6665b() {
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
                return newMessageInfo(f19917f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C6665b();
            case 4:
                return new C6664a();
            case 5:
                return f19917f;
            case 6:
                C63010eb ebVar = f19918g;
                if (ebVar == null) {
                    synchronized (C6665b.class) {
                        ebVar = f19918g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19917f);
                            f19918g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
