package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
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

/* renamed from: com.google.android.libraries.componentview.components.c.a.f */
/* compiled from: PG */
public final class C20160f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C20160f f56550f;

    /* renamed from: g */
    public static final C62940bt f56551g;

    /* renamed from: i */
    private static volatile C63010eb f56552i;

    /* renamed from: a */
    public int f56553a;

    /* renamed from: b */
    public C56425d f56554b;

    /* renamed from: c */
    public C20158d f56555c;

    /* renamed from: d */
    public String f56556d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C19926b f56557e;

    /* renamed from: h */
    private byte f56558h = 2;

    static {
        C20160f fVar = new C20160f();
        f56550f = fVar;
        C62942bv.registerDefaultInstance(C20160f.class, fVar);
        f56551g = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, fVar, fVar, (C62958ce) null, 120448612, C63066gd.MESSAGE, C20160f.class);
    }

    private C20160f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56558h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56558h = b;
                return null;
            case 2:
                return newMessageInfo(f56550f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0005ဉ\u0004\u0006ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", "d"});
            case 3:
                return new C20160f();
            case 4:
                return new C20159e();
            case 5:
                return f56550f;
            case 6:
                C63010eb ebVar = f56552i;
                if (ebVar == null) {
                    synchronized (C20160f.class) {
                        ebVar = f56552i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56550f);
                            f56552i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
