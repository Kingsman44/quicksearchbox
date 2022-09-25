package com.google.android.libraries.componentview.components.p1693e.p1694a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
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

/* renamed from: com.google.android.libraries.componentview.components.e.a.b */
/* compiled from: PG */
public final class C20349b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C20349b f57198g;

    /* renamed from: h */
    public static final C62940bt f57199h;

    /* renamed from: i */
    private static volatile C63010eb f57200i;

    /* renamed from: a */
    public int f57201a;

    /* renamed from: b */
    public String f57202b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C19995r f57203c;

    /* renamed from: d */
    public C19995r f57204d;

    /* renamed from: e */
    public String f57205e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f57206f = BuildConfig.FLAVOR;

    static {
        C20349b bVar = new C20349b();
        f57198g = bVar;
        C62942bv.registerDefaultInstance(C20349b.class, bVar);
        f57199h = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 108390322, C63066gd.MESSAGE, C20349b.class);
    }

    private C20349b() {
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
                return newMessageInfo(f57198g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0006ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, "d"});
            case 3:
                return new C20349b();
            case 4:
                return new C20348a();
            case 5:
                return f57198g;
            case 6:
                C63010eb ebVar = f57200i;
                if (ebVar == null) {
                    synchronized (C20349b.class) {
                        ebVar = f57200i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57198g);
                            f57200i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
