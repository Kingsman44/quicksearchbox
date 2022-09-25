package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.libraries.search.assistant.p2511d.p2512a.C32512e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.be */
/* compiled from: PG */
public final class C119810be extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119810be f333719c;

    /* renamed from: d */
    public static final C62940bt f333720d;

    /* renamed from: e */
    private static volatile C63010eb f333721e;

    /* renamed from: a */
    public int f333722a;

    /* renamed from: b */
    public C119834cb f333723b;

    static {
        C119810be beVar = new C119810be();
        f333719c = beVar;
        C62942bv.registerDefaultInstance(C119810be.class, beVar);
        f333720d = C62942bv.newSingularGeneratedExtension(C32512e.f87093e, beVar, beVar, (C62958ce) null, 421835927, C63066gd.MESSAGE, C119810be.class);
    }

    private C119810be() {
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
                return newMessageInfo(f333719c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C119810be();
            case 4:
                return new C119809bd();
            case 5:
                return f333719c;
            case 6:
                C63010eb ebVar = f333721e;
                if (ebVar == null) {
                    synchronized (C119810be.class) {
                        ebVar = f333721e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333719c);
                            f333721e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
