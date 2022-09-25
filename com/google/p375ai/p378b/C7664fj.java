package com.google.p375ai.p378b;

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

/* renamed from: com.google.ai.b.fj */
/* compiled from: PG */
public final class C7664fj extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C7664fj f26601h;

    /* renamed from: j */
    private static volatile C63010eb f26602j;

    /* renamed from: a */
    public int f26603a;

    /* renamed from: b */
    public String f26604b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C8178yk f26605c;

    /* renamed from: d */
    public boolean f26606d;

    /* renamed from: e */
    public String f26607e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f26608f = emptyProtobufList();

    /* renamed from: g */
    public int f26609g;

    /* renamed from: i */
    private byte f26610i = 2;

    static {
        C7664fj fjVar = new C7664fj();
        f26601h = fjVar;
        C62942bv.registerDefaultInstance(C7664fj.class, fjVar);
    }

    private C7664fj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26610i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26610i = b;
                return null;
            case 2:
                return newMessageInfo(f26601h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0005ဈ\u0004\u0006Л\u0007ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C7665fk.class, C30325g.f82003a, C7681g.m22803b()});
            case 3:
                return new C7664fj();
            case 4:
                return new C7663fi();
            case 5:
                return f26601h;
            case 6:
                C63010eb ebVar = f26602j;
                if (ebVar == null) {
                    synchronized (C7664fj.class) {
                        ebVar = f26602j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26601h);
                            f26602j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
