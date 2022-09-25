package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4345d.p4346a.p4347a.C56961k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.vv */
/* compiled from: PG */
public final class C8108vv extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C8108vv f28502f;

    /* renamed from: i */
    private static volatile C63010eb f28503i;

    /* renamed from: a */
    public int f28504a;

    /* renamed from: b */
    public int f28505b = 0;

    /* renamed from: c */
    public Object f28506c;

    /* renamed from: d */
    public C7799kj f28507d;

    /* renamed from: e */
    public String f28508e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private String f28509g = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f28510h = 2;

    static {
        C8108vv vvVar = new C8108vv();
        f28502f = vvVar;
        C62942bv.registerDefaultInstance(C8108vv.class, vvVar);
    }

    private C8108vv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28510h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28510h = b;
                return null;
            case 2:
                return newMessageInfo(f28502f, "\u0001\u0005\u0001\u0001\u0001\b\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ᐼ\u0000\u0006ᐼ\u0000\bဈ\u0004", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C7702gu.class, C56961k.class, C30325g.f82003a});
            case 3:
                return new C8108vv();
            case 4:
                return new C8107vu();
            case 5:
                return f28502f;
            case 6:
                C63010eb ebVar = f28503i;
                if (ebVar == null) {
                    synchronized (C8108vv.class) {
                        ebVar = f28503i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28502f);
                            f28503i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
