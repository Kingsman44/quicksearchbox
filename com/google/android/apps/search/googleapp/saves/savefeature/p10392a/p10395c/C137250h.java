package com.google.android.apps.search.googleapp.saves.savefeature.p10392a.p10395c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.a.c.h */
/* compiled from: PG */
public final class C137250h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C137250h f373398b;

    /* renamed from: d */
    private static volatile C63010eb f373399d;

    /* renamed from: a */
    public C62971cq f373400a = emptyProtobufList();

    /* renamed from: c */
    private byte f373401c = 2;

    static {
        C137250h hVar = new C137250h();
        f373398b = hVar;
        C62942bv.registerDefaultInstance(C137250h.class, hVar);
    }

    private C137250h() {
    }

    /* renamed from: a */
    public final void mo113600a() {
        C62971cq cqVar = this.f373400a;
        if (!cqVar.mo58948c()) {
            this.f373400a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373401c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f373401c = b;
                return null;
            case 2:
                return newMessageInfo(f373398b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C137248f.class});
            case 3:
                return new C137250h();
            case 4:
                return new C137249g();
            case 5:
                return f373398b;
            case 6:
                C63010eb ebVar = f373399d;
                if (ebVar == null) {
                    synchronized (C137250h.class) {
                        ebVar = f373399d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373398b);
                            f373399d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
