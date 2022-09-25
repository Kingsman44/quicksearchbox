package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.ar */
/* compiled from: PG */
public final class C54229ar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54229ar f142352d;

    /* renamed from: g */
    private static volatile C63010eb f142353g;

    /* renamed from: a */
    public String f142354a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f142355b = emptyProtobufList();

    /* renamed from: c */
    public C54231at f142356c;

    /* renamed from: e */
    private int f142357e;

    /* renamed from: f */
    private byte f142358f = 2;

    static {
        C54229ar arVar = new C54229ar();
        f142352d = arVar;
        C62942bv.registerDefaultInstance(C54229ar.class, arVar);
    }

    private C54229ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142358f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142358f = b;
                return null;
            case 2:
                return newMessageInfo(f142352d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"e", "a", "b", C54228aq.class, C45240c.f118157a});
            case 3:
                return new C54229ar();
            case 4:
                return new C54225an();
            case 5:
                return f142352d;
            case 6:
                C63010eb ebVar = f142353g;
                if (ebVar == null) {
                    synchronized (C54229ar.class) {
                        ebVar = f142353g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142352d);
                            f142353g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
