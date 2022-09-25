package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.gd */
/* compiled from: PG */
public final class C51978gd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51978gd f136399b;

    /* renamed from: d */
    private static volatile C63010eb f136400d;

    /* renamed from: a */
    public String f136401a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f136402c;

    static {
        C51978gd gdVar = new C51978gd();
        f136399b = gdVar;
        C62942bv.registerDefaultInstance(C51978gd.class, gdVar);
    }

    private C51978gd() {
    }

    /* renamed from: a */
    public static C63010eb m86459a() {
        return f136399b.getParserForType();
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
                return newMessageInfo(f136399b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C51978gd();
            case 4:
                return new C51977gc();
            case 5:
                return f136399b;
            case 6:
                C63010eb ebVar = f136400d;
                if (ebVar == null) {
                    synchronized (C51978gd.class) {
                        ebVar = f136400d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136399b);
                            f136400d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
