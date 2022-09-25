package com.google.android.libraries.componentview.components.elements.p1696a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19981da;
import com.google.android.libraries.componentview.components.base.p1687a.C19999v;
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

/* renamed from: com.google.android.libraries.componentview.components.elements.a.n */
/* compiled from: PG */
public final class C20389n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C20389n f57334e;

    /* renamed from: f */
    public static final C62940bt f57335f;

    /* renamed from: h */
    private static volatile C63010eb f57336h;

    /* renamed from: a */
    public int f57337a;

    /* renamed from: b */
    public C19981da f57338b;

    /* renamed from: c */
    public String f57339c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C19999v f57340d;

    /* renamed from: g */
    private byte f57341g = 2;

    static {
        C20389n nVar = new C20389n();
        f57334e = nVar;
        C62942bv.registerDefaultInstance(C20389n.class, nVar);
        f57335f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, nVar, nVar, (C62958ce) null, 107417348, C63066gd.MESSAGE, C20389n.class);
    }

    private C20389n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f57341g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f57341g = b;
                return null;
            case 2:
                return newMessageInfo(f57334e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C20389n();
            case 4:
                return new C20388m();
            case 5:
                return f57334e;
            case 6:
                C63010eb ebVar = f57336h;
                if (ebVar == null) {
                    synchronized (C20389n.class) {
                        ebVar = f57336h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57334e);
                            f57336h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
