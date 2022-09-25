package com.google.android.libraries.componentview.components.elements.p1696a;

import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.elements.a.v */
/* compiled from: PG */
public final class C20397v extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C20397v f57366f;

    /* renamed from: g */
    public static final C62940bt f57367g;

    /* renamed from: h */
    private static volatile C63010eb f57368h;

    /* renamed from: a */
    public int f57369a;

    /* renamed from: b */
    public C19995r f57370b;

    /* renamed from: c */
    public C19995r f57371c;

    /* renamed from: d */
    public float f57372d;

    /* renamed from: e */
    public C19916aq f57373e;

    static {
        C20397v vVar = new C20397v();
        f57366f = vVar;
        C62942bv.registerDefaultInstance(C20397v.class, vVar);
        f57367g = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, vVar, vVar, (C62958ce) null, 108390324, C63066gd.MESSAGE, C20397v.class);
    }

    private C20397v() {
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
                return newMessageInfo(f57366f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C20397v();
            case 4:
                return new C20396u();
            case 5:
                return f57366f;
            case 6:
                C63010eb ebVar = f57368h;
                if (ebVar == null) {
                    synchronized (C20397v.class) {
                        ebVar = f57368h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57366f);
                            f57368h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
