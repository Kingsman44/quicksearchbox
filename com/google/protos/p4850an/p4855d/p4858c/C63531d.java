package com.google.protos.p4850an.p4855d.p4858c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.c.d */
/* compiled from: PG */
public final class C63531d extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C63531d f171837b;

    /* renamed from: e */
    private static volatile C63010eb f171838e;

    /* renamed from: a */
    public String f171839a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f171840c;

    /* renamed from: d */
    private byte f171841d = 2;

    static {
        C63531d dVar = new C63531d();
        f171837b = dVar;
        C62942bv.registerDefaultInstance(C63531d.class, dVar);
    }

    private C63531d() {
        emptyIntList();
        emptyIntList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyIntList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171841d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171841d = b;
                return null;
            case 2:
                return newMessageInfo(f171837b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C63531d();
            case 4:
                return new C63530c();
            case 5:
                return f171837b;
            case 6:
                C63010eb ebVar = f171838e;
                if (ebVar == null) {
                    synchronized (C63531d.class) {
                        ebVar = f171838e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171837b);
                            f171838e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
