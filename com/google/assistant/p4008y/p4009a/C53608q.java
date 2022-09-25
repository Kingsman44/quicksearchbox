package com.google.assistant.p4008y.p4009a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.q */
/* compiled from: PG */
public final class C53608q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53608q f140706d;

    /* renamed from: f */
    private static volatile C63010eb f140707f;

    /* renamed from: a */
    public int f140708a;

    /* renamed from: b */
    public C53548ah f140709b;

    /* renamed from: c */
    public String f140710c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f140711e = 2;

    static {
        C53608q qVar = new C53608q();
        f140706d = qVar;
        C62942bv.registerDefaultInstance(C53608q.class, qVar);
    }

    private C53608q() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140711e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140711e = b;
                return null;
            case 2:
                return newMessageInfo(f140706d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53608q();
            case 4:
                return new C53607p();
            case 5:
                return f140706d;
            case 6:
                C63010eb ebVar = f140707f;
                if (ebVar == null) {
                    synchronized (C53608q.class) {
                        ebVar = f140707f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140706d);
                            f140707f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
