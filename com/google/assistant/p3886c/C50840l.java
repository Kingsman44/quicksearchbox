package com.google.assistant.p3886c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.l */
/* compiled from: PG */
public final class C50840l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50840l f132373c;

    /* renamed from: d */
    public static final C62940bt f132374d;

    /* renamed from: e */
    private static volatile C63010eb f132375e;

    /* renamed from: a */
    public int f132376a;

    /* renamed from: b */
    public String f132377b = BuildConfig.FLAVOR;

    static {
        C50840l lVar = new C50840l();
        f132373c = lVar;
        C62942bv.registerDefaultInstance(C50840l.class, lVar);
        f132374d = C62942bv.newSingularGeneratedExtension(C50706ar.f131960a, lVar, lVar, (C62958ce) null, 389958059, C63066gd.MESSAGE, C50840l.class);
    }

    private C50840l() {
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
                return newMessageInfo(f132373c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50840l();
            case 4:
                return new C50839k();
            case 5:
                return f132373c;
            case 6:
                C63010eb ebVar = f132375e;
                if (ebVar == null) {
                    synchronized (C50840l.class) {
                        ebVar = f132375e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132373c);
                            f132375e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
