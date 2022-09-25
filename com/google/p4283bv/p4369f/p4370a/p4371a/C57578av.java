package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.bv.f.a.a.av */
/* compiled from: PG */
public final class C57578av extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C57578av f153822h;

    /* renamed from: k */
    private static volatile C63010eb f153823k;

    /* renamed from: a */
    public C57566aj f153824a;

    /* renamed from: b */
    public int f153825b;

    /* renamed from: c */
    public C57582az f153826c;

    /* renamed from: d */
    public C57636cz f153827d;

    /* renamed from: e */
    public String f153828e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C63042fg f153829f;

    /* renamed from: g */
    public C57626cp f153830g;

    /* renamed from: i */
    private C62995dn f153831i = C62995dn.f170057a;

    /* renamed from: j */
    private byte f153832j = 2;

    static {
        C57578av avVar = new C57578av();
        f153822h = avVar;
        C62942bv.registerDefaultInstance(C57578av.class, avVar);
    }

    private C57578av() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153832j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153832j = b;
                return null;
            case 2:
                return newMessageInfo(f153822h, "\u0000\b\u0000\u0000\u0001\u0013\b\u0001\u0000\u0000\u0001\t\u0002\f\u0003\t\u0004\t\u0005Ȉ\b\t\n2\u0013\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, "i", C57577au.f153821a, C30325g.f82003a});
            case 3:
                return new C57578av();
            case 4:
                return new C57576at();
            case 5:
                return f153822h;
            case 6:
                C63010eb ebVar = f153823k;
                if (ebVar == null) {
                    synchronized (C57578av.class) {
                        ebVar = f153823k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153822h);
                            f153823k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
