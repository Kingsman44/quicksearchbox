package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
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

/* renamed from: com.google.android.libraries.componentview.components.c.a.bh */
/* compiled from: PG */
public final class C20138bh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C20138bh f56465f;

    /* renamed from: g */
    public static final C62940bt f56466g;

    /* renamed from: h */
    private static volatile C63010eb f56467h;

    /* renamed from: a */
    public int f56468a;

    /* renamed from: b */
    public String f56469b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C19916aq f56470c;

    /* renamed from: d */
    public String f56471d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f56472e = BuildConfig.FLAVOR;

    static {
        C20138bh bhVar = new C20138bh();
        f56465f = bhVar;
        C62942bv.registerDefaultInstance(C20138bh.class, bhVar);
        f56466g = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bhVar, bhVar, (C62958ce) null, 121498843, C63066gd.MESSAGE, C20138bh.class);
    }

    private C20138bh() {
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
                return newMessageInfo(f56465f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C20138bh();
            case 4:
                return new C20137bg();
            case 5:
                return f56465f;
            case 6:
                C63010eb ebVar = f56467h;
                if (ebVar == null) {
                    synchronized (C20138bh.class) {
                        ebVar = f56467h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56465f);
                            f56467h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
