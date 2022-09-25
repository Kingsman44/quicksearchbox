package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62584r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.cm */
/* compiled from: PG */
public final class C54032cm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54032cm f141762d;

    /* renamed from: e */
    private static volatile C63010eb f141763e;

    /* renamed from: a */
    public C62584r f141764a;

    /* renamed from: b */
    public C54071w f141765b;

    /* renamed from: c */
    public String f141766c = BuildConfig.FLAVOR;

    static {
        C54032cm cmVar = new C54032cm();
        f141762d = cmVar;
        C62942bv.registerDefaultInstance(C54032cm.class, cmVar);
    }

    private C54032cm() {
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
                return newMessageInfo(f141762d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\t\u0003\t\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54032cm();
            case 4:
                return new C54031cl();
            case 5:
                return f141762d;
            case 6:
                C63010eb ebVar = f141763e;
                if (ebVar == null) {
                    synchronized (C54032cm.class) {
                        ebVar = f141763e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141762d);
                            f141763e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
