package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.cc */
/* compiled from: PG */
public final class C80154cc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80154cc f219951b;

    /* renamed from: d */
    private static volatile C63010eb f219952d;

    /* renamed from: a */
    public C62971cq f219953a = emptyProtobufList();

    /* renamed from: c */
    private byte f219954c = 2;

    static {
        C80154cc ccVar = new C80154cc();
        f219951b = ccVar;
        C62942bv.registerDefaultInstance(C80154cc.class, ccVar);
    }

    private C80154cc() {
    }

    /* renamed from: a */
    public final void mo74287a() {
        C62971cq cqVar = this.f219953a;
        if (!cqVar.mo58948c()) {
            this.f219953a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219954c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219954c = b;
                return null;
            case 2:
                return newMessageInfo(f219951b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C80581o.class});
            case 3:
                return new C80154cc();
            case 4:
                return new C80153cb();
            case 5:
                return f219951b;
            case 6:
                C63010eb ebVar = f219952d;
                if (ebVar == null) {
                    synchronized (C80154cc.class) {
                        ebVar = f219952d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219951b);
                            f219952d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
