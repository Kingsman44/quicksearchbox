package com.google.common.p4552o.p4571q;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4552o.apr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.q.b */
/* compiled from: PG */
public final class C60434b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60434b f163553c;

    /* renamed from: d */
    public static final C62940bt f163554d;

    /* renamed from: e */
    private static volatile C63010eb f163555e;

    /* renamed from: a */
    public int f163556a;

    /* renamed from: b */
    public String f163557b = BuildConfig.FLAVOR;

    static {
        C60434b bVar = new C60434b();
        f163553c = bVar;
        C62942bv.registerDefaultInstance(C60434b.class, bVar);
        f163554d = C62942bv.newSingularGeneratedExtension(apr.f159695c, bVar, bVar, (C62958ce) null, 390125636, C63066gd.MESSAGE, C60434b.class);
    }

    private C60434b() {
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
                return newMessageInfo(f163553c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60434b();
            case 4:
                return new C60433a();
            case 5:
                return f163553c;
            case 6:
                C63010eb ebVar = f163555e;
                if (ebVar == null) {
                    synchronized (C60434b.class) {
                        ebVar = f163555e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163553c);
                            f163555e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
