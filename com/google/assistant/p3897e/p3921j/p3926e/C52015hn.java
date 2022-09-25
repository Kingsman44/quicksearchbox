package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.hn */
/* compiled from: PG */
public final class C52015hn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52015hn f136515e;

    /* renamed from: g */
    private static volatile C63010eb f136516g;

    /* renamed from: a */
    public int f136517a;

    /* renamed from: b */
    public String f136518b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f136519c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C51012dc f136520d;

    /* renamed from: f */
    private byte f136521f = 2;

    static {
        C52015hn hnVar = new C52015hn();
        f136515e = hnVar;
        C62942bv.registerDefaultInstance(C52015hn.class, hnVar);
    }

    private C52015hn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136521f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136521f = b;
                return null;
            case 2:
                return newMessageInfo(f136515e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0005ᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C52015hn();
            case 4:
                return new C52014hm();
            case 5:
                return f136515e;
            case 6:
                C63010eb ebVar = f136516g;
                if (ebVar == null) {
                    synchronized (C52015hn.class) {
                        ebVar = f136516g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136515e);
                            f136516g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
