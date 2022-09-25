package com.google.assistant.p4001w.p4002a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.assistant.w.a.f */
/* compiled from: PG */
public final class C53499f extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53499f f140392g;

    /* renamed from: h */
    public static final C62940bt f140393h;

    /* renamed from: i */
    public static final C62940bt f140394i;

    /* renamed from: j */
    private static volatile C63010eb f140395j;

    /* renamed from: a */
    public int f140396a;

    /* renamed from: b */
    public long f140397b;

    /* renamed from: c */
    public C62910ar f140398c;

    /* renamed from: d */
    public boolean f140399d;

    /* renamed from: e */
    public boolean f140400e;

    /* renamed from: f */
    public C53503j f140401f;

    static {
        C53499f fVar = new C53499f();
        f140392g = fVar;
        C62942bv.registerDefaultInstance(C53499f.class, fVar);
        C53499f fVar2 = fVar;
        C53499f fVar3 = fVar;
        f140393h = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, fVar2, fVar3, (C62958ce) null, 312441973, C63066gd.MESSAGE, C53499f.class);
        f140394i = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, fVar2, fVar3, (C62958ce) null, 312441973, C63066gd.MESSAGE, C53499f.class);
    }

    private C53499f() {
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
                return newMessageInfo(f140392g, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0000\u0000\u0003ဉ\u0001\u0006ဂ\u0000\u0007ဇ\u0002\bဇ\u0003\tဉ\u0004", new Object[]{"a", C45240c.f118157a, "b", "d", "e", C10662f.f35572a});
            case 3:
                return new C53499f();
            case 4:
                return new C53498e();
            case 5:
                return f140392g;
            case 6:
                C63010eb ebVar = f140395j;
                if (ebVar == null) {
                    synchronized (C53499f.class) {
                        ebVar = f140395j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140392g);
                            f140395j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
