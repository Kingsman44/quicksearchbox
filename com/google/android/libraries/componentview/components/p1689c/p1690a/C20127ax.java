package com.google.android.libraries.componentview.components.p1689c.p1690a;

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

/* renamed from: com.google.android.libraries.componentview.components.c.a.ax */
/* compiled from: PG */
public final class C20127ax extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C20127ax f56411e;

    /* renamed from: f */
    public static final C62940bt f56412f;

    /* renamed from: h */
    private static volatile C63010eb f56413h;

    /* renamed from: a */
    public int f56414a;

    /* renamed from: b */
    public int f56415b;

    /* renamed from: c */
    public C56425d f56416c;

    /* renamed from: d */
    public boolean f56417d;

    /* renamed from: g */
    private byte f56418g = 2;

    static {
        C20127ax axVar = new C20127ax();
        f56411e = axVar;
        C62942bv.registerDefaultInstance(C20127ax.class, axVar);
        f56412f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, axVar, axVar, (C62958ce) null, 117492846, C63066gd.MESSAGE, C20127ax.class);
    }

    private C20127ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56418g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56418g = b;
                return null;
            case 2:
                return newMessageInfo(f56411e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C20125av.f56410a, C45240c.f118157a, "d"});
            case 3:
                return new C20127ax();
            case 4:
                return new C20124au();
            case 5:
                return f56411e;
            case 6:
                C63010eb ebVar = f56413h;
                if (ebVar == null) {
                    synchronized (C20127ax.class) {
                        ebVar = f56413h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56411e);
                            f56413h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
