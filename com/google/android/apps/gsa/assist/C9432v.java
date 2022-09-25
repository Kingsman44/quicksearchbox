package com.google.android.apps.gsa.assist;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.v */
/* compiled from: PG */
public final class C9432v extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C9432v f32760b;

    /* renamed from: d */
    private static volatile C63010eb f32761d;

    /* renamed from: a */
    public C62971cq f32762a = emptyProtobufList();

    /* renamed from: c */
    private byte f32763c = 2;

    static {
        C9432v vVar = new C9432v();
        f32760b = vVar;
        C62942bv.registerDefaultInstance(C9432v.class, vVar);
    }

    private C9432v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32763c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32763c = b;
                return null;
            case 2:
                return newMessageInfo(f32760b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C9429s.class});
            case 3:
                return new C9432v();
            case 4:
                return new C9425o();
            case 5:
                return f32760b;
            case 6:
                C63010eb ebVar = f32761d;
                if (ebVar == null) {
                    synchronized (C9432v.class) {
                        ebVar = f32761d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32760b);
                            f32761d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
