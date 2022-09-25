package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.t */
/* compiled from: PG */
public final class C54068t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54068t f141871c;

    /* renamed from: e */
    private static volatile C63010eb f141872e;

    /* renamed from: a */
    public C60214n f141873a;

    /* renamed from: b */
    public String f141874b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f141875d = 2;

    static {
        C54068t tVar = new C54068t();
        f141871c = tVar;
        C62942bv.registerDefaultInstance(C54068t.class, tVar);
    }

    private C54068t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141875d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141875d = b;
                return null;
            case 2:
                return newMessageInfo(f141871c, "\u0000\u0002\u0000\u0000\u0003\u0005\u0002\u0000\u0000\u0001\u0003Љ\u0005Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C54068t();
            case 4:
                return new C54067s();
            case 5:
                return f141871c;
            case 6:
                C63010eb ebVar = f141872e;
                if (ebVar == null) {
                    synchronized (C54068t.class) {
                        ebVar = f141872e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141871c);
                            f141872e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
