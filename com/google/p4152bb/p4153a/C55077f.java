package com.google.p4152bb.p4153a;

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

/* renamed from: com.google.bb.a.f */
/* compiled from: PG */
public final class C55077f extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C55077f f144891h;

    /* renamed from: j */
    private static volatile C63010eb f144892j;

    /* renamed from: a */
    public int f144893a;

    /* renamed from: b */
    public String f144894b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f144895c;

    /* renamed from: d */
    public C55136he f144896d;

    /* renamed from: e */
    public C54969b f144897e;

    /* renamed from: f */
    public C62971cq f144898f = emptyProtobufList();

    /* renamed from: g */
    public C55293n f144899g;

    /* renamed from: i */
    private byte f144900i = 2;

    static {
        C55077f fVar = new C55077f();
        f144891h = fVar;
        C62942bv.registerDefaultInstance(C55077f.class, fVar);
    }

    private C55077f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144900i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144900i = b;
                return null;
            case 2:
                return newMessageInfo(f144891h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001ဈ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005Л\u0006ᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, C55023d.f144758a, "d", "e", C10662f.f35572a, C54969b.class, C30325g.f82003a});
            case 3:
                return new C55077f();
            case 4:
                return new C54996c();
            case 5:
                return f144891h;
            case 6:
                C63010eb ebVar = f144892j;
                if (ebVar == null) {
                    synchronized (C55077f.class) {
                        ebVar = f144892j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144891h);
                            f144892j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
