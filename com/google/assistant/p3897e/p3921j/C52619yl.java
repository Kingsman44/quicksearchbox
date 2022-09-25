package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.yl */
/* compiled from: PG */
public final class C52619yl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52619yl f138149d;

    /* renamed from: e */
    private static volatile C63010eb f138150e;

    /* renamed from: a */
    public int f138151a;

    /* renamed from: b */
    public String f138152b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f138153c = BuildConfig.FLAVOR;

    static {
        C52619yl ylVar = new C52619yl();
        f138149d = ylVar;
        C62942bv.registerDefaultInstance(C52619yl.class, ylVar);
    }

    private C52619yl() {
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
                return newMessageInfo(f138149d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52619yl();
            case 4:
                return new C52618yk();
            case 5:
                return f138149d;
            case 6:
                C63010eb ebVar = f138150e;
                if (ebVar == null) {
                    synchronized (C52619yl.class) {
                        ebVar = f138150e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138149d);
                            f138150e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
