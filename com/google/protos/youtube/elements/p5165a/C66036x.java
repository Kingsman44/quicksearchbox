package com.google.protos.youtube.elements.p5165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.youtube.elements.a.x */
/* compiled from: PG */
public final class C66036x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66036x f179591d;

    /* renamed from: e */
    public static final C62940bt f179592e;

    /* renamed from: f */
    private static volatile C63010eb f179593f;

    /* renamed from: a */
    public int f179594a;

    /* renamed from: b */
    public String f179595b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C66024l f179596c;

    static {
        C66036x xVar = new C66036x();
        f179591d = xVar;
        C62942bv.registerDefaultInstance(C66036x.class, xVar);
        f179592e = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, xVar, xVar, (C62958ce) null, 213669077, C63066gd.MESSAGE, C66036x.class);
    }

    private C66036x() {
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
                return newMessageInfo(f179591d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66036x();
            case 4:
                return new C66035w();
            case 5:
                return f179591d;
            case 6:
                C63010eb ebVar = f179593f;
                if (ebVar == null) {
                    synchronized (C66036x.class) {
                        ebVar = f179593f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179591d);
                            f179593f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
