package com.google.android.libraries.componentview.components.agsa.p1684a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
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

/* renamed from: com.google.android.libraries.componentview.components.agsa.a.j */
/* compiled from: PG */
public final class C19851j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C19851j f55513g;

    /* renamed from: h */
    public static final C62940bt f55514h;

    /* renamed from: j */
    private static volatile C63010eb f55515j;

    /* renamed from: a */
    public int f55516a;

    /* renamed from: b */
    public C56425d f55517b;

    /* renamed from: c */
    public C19983f f55518c;

    /* renamed from: d */
    public C19926b f55519d;

    /* renamed from: e */
    public String f55520e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f55521f;

    /* renamed from: i */
    private byte f55522i = 2;

    static {
        C19851j jVar = new C19851j();
        f55513g = jVar;
        C62942bv.registerDefaultInstance(C19851j.class, jVar);
        f55514h = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, jVar, jVar, (C62958ce) null, 127163915, C63066gd.MESSAGE, C19851j.class);
    }

    private C19851j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55522i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55522i = b;
                return null;
            case 2:
                return newMessageInfo(f55513g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C19851j();
            case 4:
                return new C19850i();
            case 5:
                return f55513g;
            case 6:
                C63010eb ebVar = f55515j;
                if (ebVar == null) {
                    synchronized (C19851j.class) {
                        ebVar = f55515j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55513g);
                            f55515j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
