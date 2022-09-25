package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ly */
/* compiled from: PG */
public final class C50137ly extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50137ly f130339d;

    /* renamed from: f */
    private static volatile C63010eb f130340f;

    /* renamed from: a */
    public int f130341a;

    /* renamed from: b */
    public act f130342b;

    /* renamed from: c */
    public C50153mn f130343c;

    /* renamed from: e */
    private byte f130344e = 2;

    static {
        C50137ly lyVar = new C50137ly();
        f130339d = lyVar;
        C62942bv.registerDefaultInstance(C50137ly.class, lyVar);
    }

    private C50137ly() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f130344e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f130344e = b;
                return null;
            case 2:
                return newMessageInfo(f130339d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50137ly();
            case 4:
                return new C50136lx();
            case 5:
                return f130339d;
            case 6:
                C63010eb ebVar = f130340f;
                if (ebVar == null) {
                    synchronized (C50137ly.class) {
                        ebVar = f130340f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130339d);
                            f130340f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
