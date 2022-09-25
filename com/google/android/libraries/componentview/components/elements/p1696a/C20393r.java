package com.google.android.libraries.componentview.components.elements.p1696a;

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

/* renamed from: com.google.android.libraries.componentview.components.elements.a.r */
/* compiled from: PG */
public final class C20393r extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C20393r f57352f;

    /* renamed from: g */
    public static final C62940bt f57353g;

    /* renamed from: i */
    private static volatile C63010eb f57354i;

    /* renamed from: a */
    public int f57355a;

    /* renamed from: b */
    public C56425d f57356b;

    /* renamed from: c */
    public String f57357c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f57358d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f57359e;

    /* renamed from: h */
    private byte f57360h = 2;

    static {
        C20393r rVar = new C20393r();
        f57352f = rVar;
        C62942bv.registerDefaultInstance(C20393r.class, rVar);
        f57353g = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, rVar, rVar, (C62958ce) null, 114538922, C63066gd.MESSAGE, C20393r.class);
    }

    private C20393r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f57360h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f57360h = b;
                return null;
            case 2:
                return newMessageInfo(f57352f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C20393r();
            case 4:
                return new C20392q();
            case 5:
                return f57352f;
            case 6:
                C63010eb ebVar = f57354i;
                if (ebVar == null) {
                    synchronized (C20393r.class) {
                        ebVar = f57354i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57352f);
                            f57354i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
