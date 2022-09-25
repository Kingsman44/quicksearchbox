package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.xi */
/* compiled from: PG */
public final class C52589xi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52589xi f138090c;

    /* renamed from: d */
    private static volatile C63010eb f138091d;

    /* renamed from: a */
    public int f138092a;

    /* renamed from: b */
    public String f138093b = BuildConfig.FLAVOR;

    static {
        C52589xi xiVar = new C52589xi();
        f138090c = xiVar;
        C62942bv.registerDefaultInstance(C52589xi.class, xiVar);
    }

    private C52589xi() {
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
                return newMessageInfo(f138090c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52589xi();
            case 4:
                return new C52588xh();
            case 5:
                return f138090c;
            case 6:
                C63010eb ebVar = f138091d;
                if (ebVar == null) {
                    synchronized (C52589xi.class) {
                        ebVar = f138091d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138090c);
                            f138091d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
