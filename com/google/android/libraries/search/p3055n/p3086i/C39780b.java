package com.google.android.libraries.search.p3055n.p3086i;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.n.i.b */
/* compiled from: PG */
public final class C39780b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C39780b f104632c;

    /* renamed from: d */
    public static final C62940bt f104633d;

    /* renamed from: e */
    private static volatile C63010eb f104634e;

    /* renamed from: a */
    public int f104635a;

    /* renamed from: b */
    public String f104636b = BuildConfig.FLAVOR;

    static {
        C39780b bVar = new C39780b();
        f104632c = bVar;
        C62942bv.registerDefaultInstance(C39780b.class, bVar);
        f104633d = C62942bv.newSingularGeneratedExtension(C39785g.f104642a, bVar, bVar, (C62958ce) null, 405518497, C63066gd.MESSAGE, C39780b.class);
    }

    private C39780b() {
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
                return newMessageInfo(f104632c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C39780b();
            case 4:
                return new C39779a();
            case 5:
                return f104632c;
            case 6:
                C63010eb ebVar = f104634e;
                if (ebVar == null) {
                    synchronized (C39780b.class) {
                        ebVar = f104634e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104632c);
                            f104634e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
