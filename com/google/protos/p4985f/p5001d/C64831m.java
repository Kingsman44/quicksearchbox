package com.google.protos.p4985f.p5001d;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.knowledge.p4661a.p4662a.C61754p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.f.d.m */
/* compiled from: PG */
public final class C64831m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64831m f175684c;

    /* renamed from: d */
    public static final C62940bt f175685d;

    /* renamed from: e */
    private static volatile C63010eb f175686e;

    /* renamed from: a */
    public int f175687a;

    /* renamed from: b */
    public int f175688b;

    static {
        C64831m mVar = new C64831m();
        f175684c = mVar;
        C62942bv.registerDefaultInstance(C64831m.class, mVar);
        f175685d = C62942bv.newSingularGeneratedExtension(C61754p.f166816a, mVar, mVar, (C62958ce) null, 378515962, C63066gd.MESSAGE, C64831m.class);
    }

    private C64831m() {
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
                return newMessageInfo(f175684c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C13529e.m29815b()});
            case 3:
                return new C64831m();
            case 4:
                return new C64830l();
            case 5:
                return f175684c;
            case 6:
                C63010eb ebVar = f175686e;
                if (ebVar == null) {
                    synchronized (C64831m.class) {
                        ebVar = f175686e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175684c);
                            f175686e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
