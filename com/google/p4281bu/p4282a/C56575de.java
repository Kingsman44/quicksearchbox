package com.google.p4281bu.p4282a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.de */
/* compiled from: PG */
public final class C56575de extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56575de f151056d;

    /* renamed from: e */
    private static volatile C63010eb f151057e;

    /* renamed from: a */
    public String f151058a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f151059b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f151060c;

    static {
        C56575de deVar = new C56575de();
        f151056d = deVar;
        C62942bv.registerDefaultInstance(C56575de.class, deVar);
    }

    private C56575de() {
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
                return newMessageInfo(f151056d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56575de();
            case 4:
                return new C56574dd();
            case 5:
                return f151056d;
            case 6:
                C63010eb ebVar = f151057e;
                if (ebVar == null) {
                    synchronized (C56575de.class) {
                        ebVar = f151057e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151056d);
                            f151057e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
