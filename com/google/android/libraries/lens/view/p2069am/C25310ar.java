package com.google.android.libraries.lens.view.p2069am;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.ar */
/* compiled from: PG */
public final class C25310ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C25310ar f68865c;

    /* renamed from: e */
    private static volatile C63010eb f68866e;

    /* renamed from: a */
    public C62971cq f68867a = emptyProtobufList();

    /* renamed from: b */
    public long f68868b;

    /* renamed from: d */
    private byte f68869d = 2;

    static {
        C25310ar arVar = new C25310ar();
        f68865c = arVar;
        C62942bv.registerDefaultInstance(C25310ar.class, arVar);
    }

    private C25310ar() {
    }

    /* renamed from: a */
    public final void mo30371a() {
        C62971cq cqVar = this.f68867a;
        if (!cqVar.mo58948c()) {
            this.f68867a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f68869d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f68869d = b;
                return null;
            case 2:
                return newMessageInfo(f68865c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002\u0002", new Object[]{"a", C25308ap.class, "b"});
            case 3:
                return new C25310ar();
            case 4:
                return new C25309aq();
            case 5:
                return f68865c;
            case 6:
                C63010eb ebVar = f68866e;
                if (ebVar == null) {
                    synchronized (C25310ar.class) {
                        ebVar = f68866e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68865c);
                            f68866e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
