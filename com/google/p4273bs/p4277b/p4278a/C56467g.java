package com.google.p4273bs.p4277b.p4278a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bs.b.a.g */
/* compiled from: PG */
public final class C56467g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f150831d = new C56465e();

    /* renamed from: f */
    public static final C56467g f150832f;

    /* renamed from: h */
    private static volatile C63010eb f150833h;

    /* renamed from: a */
    public String f150834a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f150835b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62961ch f150836c = emptyIntList();

    /* renamed from: e */
    public String f150837e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private int f150838g;

    static {
        C56467g gVar = new C56467g();
        f150832f = gVar;
        C62942bv.registerDefaultInstance(C56467g.class, gVar);
    }

    private C56467g() {
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
                return newMessageInfo(f150832f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003\u001e\u0004ဈ\u0003", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, C56464d.m88199b(), "e"});
            case 3:
                return new C56467g();
            case 4:
                return new C56466f();
            case 5:
                return f150832f;
            case 6:
                C63010eb ebVar = f150833h;
                if (ebVar == null) {
                    synchronized (C56467g.class) {
                        ebVar = f150833h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150832f);
                            f150833h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
