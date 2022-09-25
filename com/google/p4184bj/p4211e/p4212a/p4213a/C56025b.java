package com.google.p4184bj.p4211e.p4212a.p4213a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.bj.e.a.a.b */
/* compiled from: PG */
public final class C56025b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56025b f149198b;

    /* renamed from: c */
    public static final C62940bt f149199c;

    /* renamed from: e */
    private static volatile C63010eb f149200e;

    /* renamed from: a */
    public String f149201a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f149202d;

    static {
        C56025b bVar = new C56025b();
        f149198b = bVar;
        C62942bv.registerDefaultInstance(C56025b.class, bVar);
        f149199c = C62942bv.newSingularGeneratedExtension(C63771b.f172510a, bVar, bVar, (C62958ce) null, 45525626, C63066gd.MESSAGE, C56025b.class);
    }

    private C56025b() {
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
        emptyLongList();
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
                return newMessageInfo(f149198b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C56025b();
            case 4:
                return new C56024a();
            case 5:
                return f149198b;
            case 6:
                C63010eb ebVar = f149200e;
                if (ebVar == null) {
                    synchronized (C56025b.class) {
                        ebVar = f149200e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149198b);
                            f149200e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
