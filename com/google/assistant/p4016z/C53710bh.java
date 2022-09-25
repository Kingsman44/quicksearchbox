package com.google.assistant.p4016z;

import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.assistant.p3886c.C50738bc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.bh */
/* compiled from: PG */
public final class C53710bh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53710bh f141001c;

    /* renamed from: e */
    private static volatile C63010eb f141002e;

    /* renamed from: a */
    public C62971cq f141003a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f141004b = emptyProtobufList();

    /* renamed from: d */
    private byte f141005d = 2;

    static {
        C53710bh bhVar = new C53710bh();
        f141001c = bhVar;
        C62942bv.registerDefaultInstance(C53710bh.class, bhVar);
    }

    private C53710bh() {
    }

    /* renamed from: a */
    public final void mo54009a() {
        C62971cq cqVar = this.f141004b;
        if (!cqVar.mo58948c()) {
            this.f141004b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141005d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141005d = b;
                return null;
            case 2:
                return newMessageInfo(f141001c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001Л\u0002\u001b", new Object[]{"a", C50738bc.class, "b", C83739ak.class});
            case 3:
                return new C53710bh();
            case 4:
                return new C53709bg();
            case 5:
                return f141001c;
            case 6:
                C63010eb ebVar = f141002e;
                if (ebVar == null) {
                    synchronized (C53710bh.class) {
                        ebVar = f141002e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141001c);
                            f141002e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
