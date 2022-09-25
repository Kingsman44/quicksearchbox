package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.amf */
/* compiled from: PG */
public final class amf extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final amf f135365e;

    /* renamed from: f */
    private static volatile C63010eb f135366f;

    /* renamed from: a */
    public int f135367a;

    /* renamed from: b */
    public C52428rj f135368b;

    /* renamed from: c */
    public String f135369c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public amh f135370d;

    static {
        amf amf = new amf();
        f135365e = amf;
        C62942bv.registerDefaultInstance(amf.class, amf);
    }

    private amf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f135365e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new amf();
            case 4:
                return new ame();
            case 5:
                return f135365e;
            case 6:
                C63010eb ebVar = f135366f;
                if (ebVar == null) {
                    synchronized (amf.class) {
                        ebVar = f135366f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135365e);
                            f135366f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
