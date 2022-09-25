package com.google.android.libraries.componentview.components.p1689c.p1690a;

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

/* renamed from: com.google.android.libraries.componentview.components.c.a.n */
/* compiled from: PG */
public final class C20168n extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C20168n f56573f;

    /* renamed from: g */
    public static final C62940bt f56574g;

    /* renamed from: i */
    private static volatile C63010eb f56575i;

    /* renamed from: a */
    public int f56576a;

    /* renamed from: b */
    public C56425d f56577b;

    /* renamed from: c */
    public String f56578c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f56579d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f56580e = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f56581h = 2;

    static {
        C20168n nVar = new C20168n();
        f56573f = nVar;
        C62942bv.registerDefaultInstance(C20168n.class, nVar);
        f56574g = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, nVar, nVar, (C62958ce) null, 162373420, C63066gd.MESSAGE, C20168n.class);
    }

    private C20168n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56581h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56581h = b;
                return null;
            case 2:
                return newMessageInfo(f56573f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C20168n();
            case 4:
                return new C20167m();
            case 5:
                return f56573f;
            case 6:
                C63010eb ebVar = f56575i;
                if (ebVar == null) {
                    synchronized (C20168n.class) {
                        ebVar = f56575i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56573f);
                            f56575i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
