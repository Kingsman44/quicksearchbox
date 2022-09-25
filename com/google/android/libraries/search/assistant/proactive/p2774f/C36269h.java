package com.google.android.libraries.search.assistant.proactive.p2774f;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3804a.C48800ah;
import com.google.common.p4552o.ajz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.proactive.f.h */
/* compiled from: PG */
public final class C36269h extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C36269h f94733k;

    /* renamed from: l */
    private static volatile C63010eb f94734l;

    /* renamed from: a */
    public int f94735a;

    /* renamed from: b */
    public C62971cq f94736b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C63088z f94737c = C63088z.f170246b;

    /* renamed from: d */
    public String f94738d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public ajz f94739e;

    /* renamed from: f */
    public C48800ah f94740f;

    /* renamed from: g */
    public String f94741g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public long f94742h;

    /* renamed from: i */
    public int f94743i;

    /* renamed from: j */
    public boolean f94744j;

    static {
        C36269h hVar = new C36269h();
        f94733k = hVar;
        C62942bv.registerDefaultInstance(C36269h.class, hVar);
    }

    private C36269h() {
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
                return newMessageInfo(f94733k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\u001a\u0002ည\u0000\u0003ဈ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006\tဇ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C36269h();
            case 4:
                return new C36268g();
            case 5:
                return f94733k;
            case 6:
                C63010eb ebVar = f94734l;
                if (ebVar == null) {
                    synchronized (C36269h.class) {
                        ebVar = f94734l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f94733k);
                            f94734l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
