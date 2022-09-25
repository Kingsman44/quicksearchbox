package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ku */
/* compiled from: PG */
public final class C55233ku extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55233ku f145421c;

    /* renamed from: d */
    public static final C62940bt f145422d;

    /* renamed from: e */
    private static volatile C63010eb f145423e;

    /* renamed from: a */
    public int f145424a;

    /* renamed from: b */
    public String f145425b = BuildConfig.FLAVOR;

    static {
        C55233ku kuVar = new C55233ku();
        f145421c = kuVar;
        C62942bv.registerDefaultInstance(C55233ku.class, kuVar);
        f145422d = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, kuVar, kuVar, (C62958ce) null, 68568668, C63066gd.MESSAGE, C55233ku.class);
    }

    private C55233ku() {
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
                return newMessageInfo(f145421c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဈ\u0004", new Object[]{"a", "b"});
            case 3:
                return new C55233ku();
            case 4:
                return new C55232kt();
            case 5:
                return f145421c;
            case 6:
                C63010eb ebVar = f145423e;
                if (ebVar == null) {
                    synchronized (C55233ku.class) {
                        ebVar = f145423e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145421c);
                            f145423e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
