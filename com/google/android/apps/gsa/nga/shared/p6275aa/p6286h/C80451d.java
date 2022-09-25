package com.google.android.apps.gsa.nga.shared.p6275aa.p6286h;

import com.google.nlp.p4735b.p4736a.C62837d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.h.d */
/* compiled from: PG */
public final class C80451d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C80451d f220813a;

    /* renamed from: b */
    public static final C62940bt f220814b = C62942bv.newSingularGeneratedExtension(C62837d.f169685e, C80449b.f220808c, C80449b.f220808c, (C62958ce) null, 283054193, C63066gd.MESSAGE, C80449b.class);

    /* renamed from: c */
    private static volatile C63010eb f220815c;

    static {
        C80451d dVar = new C80451d();
        f220813a = dVar;
        C62942bv.registerDefaultInstance(C80451d.class, dVar);
    }

    private C80451d() {
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
                return newMessageInfo(f220813a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C80451d();
            case 4:
                return new C80450c();
            case 5:
                return f220813a;
            case 6:
                C63010eb ebVar = f220815c;
                if (ebVar == null) {
                    synchronized (C80451d.class) {
                        ebVar = f220815c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220813a);
                            f220815c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
