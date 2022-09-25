package com.google.android.libraries.componentview.components.base.p1687a;

import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.android.libraries.componentview.components.base.a.bu */
/* compiled from: PG */
public final class C19947bu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19947bu f55832e;

    /* renamed from: f */
    public static final C62940bt f55833f;

    /* renamed from: h */
    private static volatile C63010eb f55834h;

    /* renamed from: a */
    public int f55835a;

    /* renamed from: b */
    public C19943bq f55836b;

    /* renamed from: c */
    public float f55837c;

    /* renamed from: d */
    public String f55838d = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f55839g = 2;

    static {
        C19947bu buVar = new C19947bu();
        f55832e = buVar;
        C62942bv.registerDefaultInstance(C19947bu.class, buVar);
        f55833f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, buVar, buVar, (C62958ce) null, 108390335, C63066gd.MESSAGE, C19947bu.class);
    }

    private C19947bu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55839g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55839g = b;
                return null;
            case 2:
                return newMessageInfo(f55832e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0001\u0004ခ\u0001\u0005ဈ\u0002\u0006ᐉ\u0000", new Object[]{"a", C45240c.f118157a, "d", "b"});
            case 3:
                return new C19947bu();
            case 4:
                return new C19946bt();
            case 5:
                return f55832e;
            case 6:
                C63010eb ebVar = f55834h;
                if (ebVar == null) {
                    synchronized (C19947bu.class) {
                        ebVar = f55834h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55832e);
                            f55834h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
