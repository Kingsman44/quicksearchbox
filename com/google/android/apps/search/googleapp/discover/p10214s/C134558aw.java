package com.google.android.apps.search.googleapp.discover.p10214s;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p4283bv.p4354e.C57051b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.aw */
/* compiled from: PG */
public final class C134558aw extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C134558aw f366443h;

    /* renamed from: j */
    private static volatile C63010eb f366444j;

    /* renamed from: a */
    public int f366445a;

    /* renamed from: b */
    public C63042fg f366446b;

    /* renamed from: c */
    public C63042fg f366447c;

    /* renamed from: d */
    public String f366448d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f366449e = emptyProtobufList();

    /* renamed from: f */
    public C60218r f366450f;

    /* renamed from: g */
    public C57051b f366451g;

    /* renamed from: i */
    private byte f366452i = 2;

    static {
        C134558aw awVar = new C134558aw();
        f366443h = awVar;
        C62942bv.registerDefaultInstance(C134558aw.class, awVar);
    }

    private C134558aw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f366452i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f366452i = b;
                return null;
            case 2:
                return newMessageInfo(f366443h, "\u0001\u0006\u0000\u0001\u0002\t\u0006\u0000\u0001\u0003\u0002Л\u0005ဈ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\bဉ\u0000\tဉ\u0001", new Object[]{"a", "e", C134573bk.class, "d", C10662f.f35572a, C30325g.f82003a, "b", C45240c.f118157a});
            case 3:
                return new C134558aw();
            case 4:
                return new C134557av();
            case 5:
                return f366443h;
            case 6:
                C63010eb ebVar = f366444j;
                if (ebVar == null) {
                    synchronized (C134558aw.class) {
                        ebVar = f366444j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366443h);
                            f366444j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
