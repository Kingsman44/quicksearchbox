package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.evernote.android.state.BuildConfig;
import com.google.p375ai.p378b.C7799kj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.v */
/* compiled from: PG */
public final class C57107v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57107v f152446c;

    /* renamed from: f */
    private static volatile C63010eb f152447f;

    /* renamed from: a */
    public String f152448a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C7799kj f152449b;

    /* renamed from: d */
    private int f152450d;

    /* renamed from: e */
    private byte f152451e = 2;

    static {
        C57107v vVar = new C57107v();
        f152446c = vVar;
        C62942bv.registerDefaultInstance(C57107v.class, vVar);
    }

    private C57107v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152451e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152451e = b;
                return null;
            case 2:
                return newMessageInfo(f152446c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C57107v();
            case 4:
                return new C57106u();
            case 5:
                return f152446c;
            case 6:
                C63010eb ebVar = f152447f;
                if (ebVar == null) {
                    synchronized (C57107v.class) {
                        ebVar = f152447f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152446c);
                            f152447f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
