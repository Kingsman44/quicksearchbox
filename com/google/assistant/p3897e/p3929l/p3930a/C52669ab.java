package com.google.assistant.p3897e.p3929l.p3930a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.ab */
/* compiled from: PG */
public final class C52669ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52669ab f138265d;

    /* renamed from: e */
    private static volatile C63010eb f138266e;

    /* renamed from: a */
    public int f138267a;

    /* renamed from: b */
    public String f138268b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f138269c = BuildConfig.FLAVOR;

    static {
        C52669ab abVar = new C52669ab();
        f138265d = abVar;
        C62942bv.registerDefaultInstance(C52669ab.class, abVar);
    }

    private C52669ab() {
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
                return newMessageInfo(f138265d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52669ab();
            case 4:
                return new C52668aa();
            case 5:
                return f138265d;
            case 6:
                C63010eb ebVar = f138266e;
                if (ebVar == null) {
                    synchronized (C52669ab.class) {
                        ebVar = f138266e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138265d);
                            f138266e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
