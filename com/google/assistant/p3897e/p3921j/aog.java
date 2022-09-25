package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aog */
/* compiled from: PG */
public final class aog extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aog f135492d;

    /* renamed from: e */
    private static volatile C63010eb f135493e;

    /* renamed from: a */
    public int f135494a;

    /* renamed from: b */
    public aom f135495b;

    /* renamed from: c */
    public String f135496c = BuildConfig.FLAVOR;

    static {
        aog aog = new aog();
        f135492d = aog;
        C62942bv.registerDefaultInstance(aog.class, aog);
    }

    private aog() {
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
                return newMessageInfo(f135492d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aog();
            case 4:
                return new aof();
            case 5:
                return f135492d;
            case 6:
                C63010eb ebVar = f135493e;
                if (ebVar == null) {
                    synchronized (aog.class) {
                        ebVar = f135493e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135492d);
                            f135493e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
