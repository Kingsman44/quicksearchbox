package com.google.protos.p4985f.p5042u;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3921j.p3926e.C52030ib;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.f.u.t */
/* compiled from: PG */
public final class C65358t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65358t f177746c;

    /* renamed from: d */
    public static final C62940bt f177747d;

    /* renamed from: f */
    private static volatile C63010eb f177748f;

    /* renamed from: a */
    public String f177749a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f177750b = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f177751e;

    static {
        C65358t tVar = new C65358t();
        f177746c = tVar;
        C62942bv.registerDefaultInstance(C65358t.class, tVar);
        f177747d = C62942bv.newSingularGeneratedExtension(C52030ib.f136561a, tVar, tVar, (C62958ce) null, 365646113, C63066gd.MESSAGE, C65358t.class);
    }

    private C65358t() {
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
                return newMessageInfo(f177746c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C65358t();
            case 4:
                return new C65357s();
            case 5:
                return f177746c;
            case 6:
                C63010eb ebVar = f177748f;
                if (ebVar == null) {
                    synchronized (C65358t.class) {
                        ebVar = f177748f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177746c);
                            f177748f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
