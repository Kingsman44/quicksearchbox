package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.base.a.ba */
/* compiled from: PG */
public final class C19927ba extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19927ba f55760c;

    /* renamed from: d */
    public static final C62940bt f55761d;

    /* renamed from: e */
    private static volatile C63010eb f55762e;

    /* renamed from: a */
    public int f55763a;

    /* renamed from: b */
    public C19916aq f55764b;

    static {
        C19927ba baVar = new C19927ba();
        f55760c = baVar;
        C62942bv.registerDefaultInstance(C19927ba.class, baVar);
        f55761d = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, baVar, baVar, (C62958ce) null, 11400437, C63066gd.MESSAGE, C19927ba.class);
    }

    private C19927ba() {
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
                return newMessageInfo(f55760c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C19927ba();
            case 4:
                return new C19925az();
            case 5:
                return f55760c;
            case 6:
                C63010eb ebVar = f55762e;
                if (ebVar == null) {
                    synchronized (C19927ba.class) {
                        ebVar = f55762e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55760c);
                            f55762e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
