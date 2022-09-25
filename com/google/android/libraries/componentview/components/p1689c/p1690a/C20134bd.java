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

/* renamed from: com.google.android.libraries.componentview.components.c.a.bd */
/* compiled from: PG */
public final class C20134bd extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C20134bd f56445f;

    /* renamed from: g */
    public static final C62940bt f56446g;

    /* renamed from: i */
    private static volatile C63010eb f56447i;

    /* renamed from: a */
    public int f56448a;

    /* renamed from: b */
    public C56425d f56449b;

    /* renamed from: c */
    public boolean f56450c;

    /* renamed from: d */
    public String f56451d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f56452e = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f56453h = 2;

    static {
        C20134bd bdVar = new C20134bd();
        f56445f = bdVar;
        C62942bv.registerDefaultInstance(C20134bd.class, bdVar);
        f56446g = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bdVar, bdVar, (C62958ce) null, 119085576, C63066gd.MESSAGE, C20134bd.class);
    }

    private C20134bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56453h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56453h = b;
                return null;
            case 2:
                return newMessageInfo(f56445f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C20134bd();
            case 4:
                return new C20133bc();
            case 5:
                return f56445f;
            case 6:
                C63010eb ebVar = f56447i;
                if (ebVar == null) {
                    synchronized (C20134bd.class) {
                        ebVar = f56447i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56445f);
                            f56447i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
