package com.google.nlp.p4735b.p4736a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.h */
/* compiled from: PG */
public final class C62841h extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C62841h f169700j;

    /* renamed from: l */
    private static volatile C63010eb f169701l;

    /* renamed from: a */
    public int f169702a;

    /* renamed from: b */
    public String f169703b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f169704c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f169705d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f169706e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f169707f = emptyProtobufList();

    /* renamed from: g */
    public int f169708g;

    /* renamed from: h */
    public int f169709h;

    /* renamed from: i */
    public boolean f169710i;

    /* renamed from: k */
    private byte f169711k = 2;

    static {
        C62841h hVar = new C62841h();
        f169700j = hVar;
        C62942bv.registerDefaultInstance(C62841h.class, hVar);
    }

    private C62841h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169711k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169711k = b;
                return null;
            case 2:
                return newMessageInfo(f169700j, "\u0001\b\u0000\u0001\u0001\u0018\b\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003Л\u0007င\u0005\nဇ\u0006\u0011ဈ\u0003\u0012ဈ\u0002\u0018ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, C10662f.f35572a, C62839f.class, C19618h.f54585a, "i", "e", "d", C30325g.f82003a, C62843j.m94950b()});
            case 3:
                return new C62841h();
            case 4:
                return new C62840g();
            case 5:
                return f169700j;
            case 6:
                C63010eb ebVar = f169701l;
                if (ebVar == null) {
                    synchronized (C62841h.class) {
                        ebVar = f169701l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169700j);
                            f169701l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
