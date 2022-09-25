package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4915b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.c.a.a.a.b.a.b.b */
/* compiled from: PG */
public final class C64157b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64157b f173460d;

    /* renamed from: f */
    private static volatile C63010eb f173461f;

    /* renamed from: a */
    public int f173462a;

    /* renamed from: b */
    public C60214n f173463b;

    /* renamed from: c */
    public String f173464c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f173465e = 2;

    static {
        C64157b bVar = new C64157b();
        f173460d = bVar;
        C62942bv.registerDefaultInstance(C64157b.class, bVar);
    }

    private C64157b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173465e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173465e = b;
                return null;
            case 2:
                return newMessageInfo(f173460d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64157b();
            case 4:
                return new C64156a();
            case 5:
                return f173460d;
            case 6:
                C63010eb ebVar = f173461f;
                if (ebVar == null) {
                    synchronized (C64157b.class) {
                        ebVar = f173461f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173460d);
                            f173461f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
