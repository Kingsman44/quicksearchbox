package com.google.p4283bv.p4287b.p4288a.p4289a.p4301f;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4364d.C57196b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57253bh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.f.f */
/* compiled from: PG */
public final class C56690f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56690f f151315f;

    /* renamed from: h */
    private static volatile C63010eb f151316h;

    /* renamed from: a */
    public String f151317a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f151318b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f151319c;

    /* renamed from: d */
    public C57196b f151320d;

    /* renamed from: e */
    public String f151321e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private int f151322g;

    static {
        C56690f fVar = new C56690f();
        f151315f = fVar;
        C62942bv.registerDefaultInstance(C56690f.class, fVar);
    }

    private C56690f() {
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
                return newMessageInfo(f151315f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0004\u0003ဌ\u0002\u0004ဈ\u0000\u0005ဉ\u0003", new Object[]{C30325g.f82003a, "b", "e", C45240c.f118157a, C57253bh.f152836a, "a", "d"});
            case 3:
                return new C56690f();
            case 4:
                return new C56689e();
            case 5:
                return f151315f;
            case 6:
                C63010eb ebVar = f151316h;
                if (ebVar == null) {
                    synchronized (C56690f.class) {
                        ebVar = f151316h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151315f);
                            f151316h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
