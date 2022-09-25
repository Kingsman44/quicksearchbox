package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.xw */
/* compiled from: PG */
public final class C52603xw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52603xw f138117d;

    /* renamed from: f */
    private static volatile C63010eb f138118f;

    /* renamed from: a */
    public int f138119a;

    /* renamed from: b */
    public String f138120b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52568wo f138121c;

    /* renamed from: e */
    private byte f138122e = 2;

    static {
        C52603xw xwVar = new C52603xw();
        f138117d = xwVar;
        C62942bv.registerDefaultInstance(C52603xw.class, xwVar);
    }

    private C52603xw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138122e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138122e = b;
                return null;
            case 2:
                return newMessageInfo(f138117d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52603xw();
            case 4:
                return new C52602xv();
            case 5:
                return f138117d;
            case 6:
                C63010eb ebVar = f138118f;
                if (ebVar == null) {
                    synchronized (C52603xw.class) {
                        ebVar = f138118f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138117d);
                            f138118f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
