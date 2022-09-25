package com.google.p4017at.p4086k.p4087a.p4088a.p4089a;

import com.evernote.android.state.BuildConfig;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57595bl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.a.a.r */
/* compiled from: PG */
public final class C54481r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54481r f143043c;

    /* renamed from: e */
    private static volatile C63010eb f143044e;

    /* renamed from: a */
    public C57595bl f143045a;

    /* renamed from: b */
    public String f143046b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f143047d = 2;

    static {
        C54481r rVar = new C54481r();
        f143043c = rVar;
        C62942bv.registerDefaultInstance(C54481r.class, rVar);
    }

    private C54481r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143047d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143047d = b;
                return null;
            case 2:
                return newMessageInfo(f143043c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C54481r();
            case 4:
                return new C54480q();
            case 5:
                return f143043c;
            case 6:
                C63010eb ebVar = f143044e;
                if (ebVar == null) {
                    synchronized (C54481r.class) {
                        ebVar = f143044e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143043c);
                            f143044e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
