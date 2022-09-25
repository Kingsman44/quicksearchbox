package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.kb */
/* compiled from: PG */
public final class C51502kb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51502kb f134175f;

    /* renamed from: g */
    private static volatile C63010eb f134176g;

    /* renamed from: a */
    public int f134177a;

    /* renamed from: b */
    public String f134178b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f134179c;

    /* renamed from: d */
    public String f134180d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f134181e = C62942bv.emptyProtobufList();

    static {
        C51502kb kbVar = new C51502kb();
        f134175f = kbVar;
        C62942bv.registerDefaultInstance(C51502kb.class, kbVar);
    }

    private C51502kb() {
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
                return newMessageInfo(f134175f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004\u001a", new Object[]{"a", "b", C45240c.f118157a, C51498jy.f134174a, "d", "e"});
            case 3:
                return new C51502kb();
            case 4:
                return new C51501ka();
            case 5:
                return f134175f;
            case 6:
                C63010eb ebVar = f134176g;
                if (ebVar == null) {
                    synchronized (C51502kb.class) {
                        ebVar = f134176g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134175f);
                            f134176g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
