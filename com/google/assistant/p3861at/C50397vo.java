package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.vo */
/* compiled from: PG */
public final class C50397vo extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50397vo f131172h;

    /* renamed from: i */
    private static volatile C63010eb f131173i;

    /* renamed from: a */
    public int f131174a;

    /* renamed from: b */
    public String f131175b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f131176c;

    /* renamed from: d */
    public C50449xm f131177d;

    /* renamed from: e */
    public C62971cq f131178e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C62971cq f131179f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f131180g = emptyProtobufList();

    static {
        C50397vo voVar = new C50397vo();
        f131172h = voVar;
        C62942bv.registerDefaultInstance(C50397vo.class, voVar);
    }

    private C50397vo() {
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
                return newMessageInfo(f131172h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0003\u0000\u0001ဈ\u0000\u0003ဌ\u0001\u0004ဉ\u0002\u0006\u001a\b\u001b\t\u001b", new Object[]{"a", "b", C45240c.f118157a, C50384vb.f131152a, "d", "e", C10662f.f35572a, C50383va.class, C30325g.f82003a, C50449xm.class});
            case 3:
                return new C50397vo();
            case 4:
                return new C50396vn();
            case 5:
                return f131172h;
            case 6:
                C63010eb ebVar = f131173i;
                if (ebVar == null) {
                    synchronized (C50397vo.class) {
                        ebVar = f131173i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131172h);
                            f131173i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
