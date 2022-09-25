package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.apy */
/* compiled from: PG */
public final class apy extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final apy f135589f;

    /* renamed from: h */
    private static volatile C63010eb f135590h;

    /* renamed from: a */
    public int f135591a;

    /* renamed from: b */
    public String f135592b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f135593c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f135594d;

    /* renamed from: e */
    public boolean f135595e;

    /* renamed from: g */
    private byte f135596g = 2;

    static {
        apy apy = new apy();
        f135589f = apy;
        C62942bv.registerDefaultInstance(apy.class, apy);
    }

    private apy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135596g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f135596g = b;
                return null;
            case 2:
                return newMessageInfo(f135589f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new apy();
            case 4:
                return new apx();
            case 5:
                return f135589f;
            case 6:
                C63010eb ebVar = f135590h;
                if (ebVar == null) {
                    synchronized (apy.class) {
                        ebVar = f135590h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135589f);
                            f135590h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
