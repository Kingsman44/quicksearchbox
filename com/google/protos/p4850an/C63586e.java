package com.google.protos.p4850an;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.e */
/* compiled from: PG */
public final class C63586e extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C63586e f171995b;

    /* renamed from: f */
    private static volatile C63010eb f171996f;

    /* renamed from: a */
    public C63353ax f171997a;

    /* renamed from: c */
    private int f171998c;

    /* renamed from: d */
    private C62724b f171999d;

    /* renamed from: e */
    private byte f172000e = 2;

    static {
        C63586e eVar = new C63586e();
        f171995b = eVar;
        C62942bv.registerDefaultInstance(C63586e.class, eVar);
    }

    private C63586e() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172000e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172000e = b;
                return null;
            case 2:
                return newMessageInfo(f171995b, "\u0001\u0002\u0000\u0001\u0002\u000b\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u000bᐉ\t", new Object[]{C45240c.f118157a, "a", "d"});
            case 3:
                return new C63586e();
            case 4:
                return new C63438d();
            case 5:
                return f171995b;
            case 6:
                C63010eb ebVar = f171996f;
                if (ebVar == null) {
                    synchronized (C63586e.class) {
                        ebVar = f171996f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171995b);
                            f171996f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
