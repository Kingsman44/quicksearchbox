package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62454cd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.au */
/* compiled from: PG */
public final class C53986au extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53986au f141640d;

    /* renamed from: f */
    private static volatile C63010eb f141641f;

    /* renamed from: a */
    public String f141642a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C54066r f141643b;

    /* renamed from: c */
    public C62454cd f141644c;

    /* renamed from: e */
    private byte f141645e = 2;

    static {
        C53986au auVar = new C53986au();
        f141640d = auVar;
        C62942bv.registerDefaultInstance(C53986au.class, auVar);
    }

    private C53986au() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141645e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141645e = b;
                return null;
            case 2:
                return newMessageInfo(f141640d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53986au();
            case 4:
                return new C53985at();
            case 5:
                return f141640d;
            case 6:
                C63010eb ebVar = f141641f;
                if (ebVar == null) {
                    synchronized (C53986au.class) {
                        ebVar = f141641f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141640d);
                            f141641f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
