package com.google.protos.p4850an.p4866f;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.f.e */
/* compiled from: PG */
public final class C63600e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63600e f172024c;

    /* renamed from: d */
    private static volatile C63010eb f172025d;

    /* renamed from: a */
    public int f172026a;

    /* renamed from: b */
    public String f172027b = BuildConfig.FLAVOR;

    static {
        C63600e eVar = new C63600e();
        f172024c = eVar;
        C62942bv.registerDefaultInstance(C63600e.class, eVar);
    }

    private C63600e() {
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
                return newMessageInfo(f172024c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C63600e();
            case 4:
                return new C63599d();
            case 5:
                return f172024c;
            case 6:
                C63010eb ebVar = f172025d;
                if (ebVar == null) {
                    synchronized (C63600e.class) {
                        ebVar = f172025d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172024c);
                            f172025d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
