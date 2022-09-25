package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.assistant.p3897e.p3921j.acy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.qw */
/* compiled from: PG */
public final class C88146qw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C88146qw f238271b;

    /* renamed from: c */
    public static final C62940bt f238272c;

    /* renamed from: e */
    private static volatile C63010eb f238273e;

    /* renamed from: a */
    public acy f238274a;

    /* renamed from: d */
    private int f238275d;

    static {
        C88146qw qwVar = new C88146qw();
        f238271b = qwVar;
        C62942bv.registerDefaultInstance(C88146qw.class, qwVar);
        f238272c = C62942bv.newSingularGeneratedExtension(C87741bw.f237477c, qwVar, qwVar, (C62958ce) null, 190274809, C63066gd.MESSAGE, C88146qw.class);
    }

    private C88146qw() {
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
                return newMessageInfo(f238271b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C88146qw();
            case 4:
                return new C88145qv();
            case 5:
                return f238271b;
            case 6:
                C63010eb ebVar = f238273e;
                if (ebVar == null) {
                    synchronized (C88146qw.class) {
                        ebVar = f238273e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238271b);
                            f238273e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
