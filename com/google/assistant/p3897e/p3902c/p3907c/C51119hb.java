package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.hb */
/* compiled from: PG */
public final class C51119hb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51119hb f133058f;

    /* renamed from: h */
    private static volatile C63010eb f133059h;

    /* renamed from: a */
    public int f133060a;

    /* renamed from: b */
    public String f133061b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f133062c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C51012dc f133063d;

    /* renamed from: e */
    public C51118ha f133064e;

    /* renamed from: g */
    private byte f133065g = 2;

    static {
        C51119hb hbVar = new C51119hb();
        f133058f = hbVar;
        C62942bv.registerDefaultInstance(C51119hb.class, hbVar);
    }

    private C51119hb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133065g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133065g = b;
                return null;
            case 2:
                return newMessageInfo(f133058f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C51119hb();
            case 4:
                return new C51115gy();
            case 5:
                return f133058f;
            case 6:
                C63010eb ebVar = f133059h;
                if (ebVar == null) {
                    synchronized (C51119hb.class) {
                        ebVar = f133059h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133058f);
                            f133059h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
