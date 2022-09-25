package com.google.android.apps.gsa.shared.p7033d.p7035b.p7036a;

import com.google.android.libraries.assistant.hotword.p1516b.C18343b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34697g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.shared.d.b.a.f */
/* compiled from: PG */
public final class C89703f extends C62942bv implements C89705h {

    /* renamed from: c */
    public static final C89703f f242840c;

    /* renamed from: d */
    public static final C62940bt f242841d;

    /* renamed from: e */
    private static volatile C63010eb f242842e;

    /* renamed from: a */
    public int f242843a;

    /* renamed from: b */
    public C18343b f242844b;

    static {
        C89703f fVar = new C89703f();
        f242840c = fVar;
        C62942bv.registerDefaultInstance(C89703f.class, fVar);
        f242841d = C62942bv.newSingularGeneratedExtension(C34697g.f92115a, fVar, fVar, (C62958ce) null, 3, C63066gd.MESSAGE, C89703f.class);
    }

    private C89703f() {
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
                return newMessageInfo(f242840c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C89703f();
            case 4:
                return new C89702e();
            case 5:
                return f242840c;
            case 6:
                C63010eb ebVar = f242842e;
                if (ebVar == null) {
                    synchronized (C89703f.class) {
                        ebVar = f242842e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242840c);
                            f242842e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
