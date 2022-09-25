package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d.t */
/* compiled from: PG */
public final class C54168t extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54168t f142159f;

    /* renamed from: h */
    private static volatile C63010eb f142160h;

    /* renamed from: a */
    public int f142161a;

    /* renamed from: b */
    public String f142162b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f142163c = emptyProtobufList();

    /* renamed from: d */
    public String f142164d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f142165e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f142166g = 2;

    static {
        C54168t tVar = new C54168t();
        f142159f = tVar;
        C62942bv.registerDefaultInstance(C54168t.class, tVar);
    }

    private C54168t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142166g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142166g = b;
                return null;
            case 2:
                return newMessageInfo(f142159f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C54167s.class, "d", "e"});
            case 3:
                return new C54168t();
            case 4:
                return new C54165q();
            case 5:
                return f142159f;
            case 6:
                C63010eb ebVar = f142160h;
                if (ebVar == null) {
                    synchronized (C54168t.class) {
                        ebVar = f142160h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142159f);
                            f142160h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
