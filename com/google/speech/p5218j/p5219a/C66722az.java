package com.google.speech.p5218j.p5219a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.speech.context.p5201a.C66487j;

/* renamed from: com.google.speech.j.a.az */
/* compiled from: PG */
public final class C66722az extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C66722az f181493f;

    /* renamed from: h */
    private static volatile C63010eb f181494h;

    /* renamed from: a */
    public int f181495a;

    /* renamed from: b */
    public C62971cq f181496b = emptyProtobufList();

    /* renamed from: c */
    public C66716at f181497c;

    /* renamed from: d */
    public C62971cq f181498d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C66487j f181499e;

    /* renamed from: g */
    private byte f181500g = 2;

    static {
        C66722az azVar = new C66722az();
        f181493f = azVar;
        C62942bv.registerDefaultInstance(C66722az.class, azVar);
    }

    private C66722az() {
    }

    /* renamed from: a */
    public final void mo59719a() {
        C62971cq cqVar = this.f181496b;
        if (!cqVar.mo58948c()) {
            this.f181496b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181500g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181500g = b;
                return null;
            case 2:
                return newMessageInfo(f181493f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0001\u0001Л\u0002ဉ\u0000\u0004\u001a\u0005ဉ\u0002", new Object[]{"a", "b", C66707ak.class, C45240c.f118157a, "d", "e"});
            case 3:
                return new C66722az();
            case 4:
                return new C66721ay();
            case 5:
                return f181493f;
            case 6:
                C63010eb ebVar = f181494h;
                if (ebVar == null) {
                    synchronized (C66722az.class) {
                        ebVar = f181494h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181493f);
                            f181494h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
