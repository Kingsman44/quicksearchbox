package com.google.android.libraries.assistant.portable.p1586b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4273bs.p4277b.p4278a.C56469i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.ae */
/* compiled from: PG */
public final class C19061ae extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19061ae f53470e;

    /* renamed from: g */
    private static volatile C63010eb f53471g;

    /* renamed from: a */
    public int f53472a;

    /* renamed from: b */
    public C19059ac f53473b;

    /* renamed from: c */
    public int f53474c;

    /* renamed from: d */
    public C62971cq f53475d;

    /* renamed from: f */
    private byte f53476f = 2;

    static {
        C19061ae aeVar = new C19061ae();
        f53470e = aeVar;
        C62942bv.registerDefaultInstance(C19061ae.class, aeVar);
    }

    private C19061ae() {
        emptyProtobufList();
        this.f53475d = emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53476f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53476f = b;
                return null;
            case 2:
                return newMessageInfo(f53470e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0005\u001b", new Object[]{"a", "b", C45240c.f118157a, C19060ad.f53469a, "d", C56469i.class});
            case 3:
                return new C19061ae();
            case 4:
                return new C19089u();
            case 5:
                return f53470e;
            case 6:
                C63010eb ebVar = f53471g;
                if (ebVar == null) {
                    synchronized (C19061ae.class) {
                        ebVar = f53471g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53470e);
                            f53471g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
