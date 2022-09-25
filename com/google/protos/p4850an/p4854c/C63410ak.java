package com.google.protos.p4850an.p4854c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63384bb;
import com.google.protos.p4850an.C63389bg;

/* renamed from: com.google.protos.an.c.ak */
/* compiled from: PG */
public final class C63410ak extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63410ak f171362e;

    /* renamed from: j */
    private static volatile C63010eb f171363j;

    /* renamed from: a */
    public int f171364a;

    /* renamed from: b */
    public String f171365b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f171366c;

    /* renamed from: d */
    public C63389bg f171367d;

    /* renamed from: f */
    private C63384bb f171368f;

    /* renamed from: g */
    private C63437z f171369g;

    /* renamed from: h */
    private C63406ag f171370h;

    /* renamed from: i */
    private byte f171371i = 2;

    static {
        C63410ak akVar = new C63410ak();
        f171362e = akVar;
        C62942bv.registerDefaultInstance(C63410ak.class, akVar);
    }

    private C63410ak() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171371i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171371i = b;
                return null;
            case 2:
                return newMessageInfo(f171362e, "\u0001\u0006\u0000\u0001\u0003\u0018\u0006\u0000\u0000\u0004\u0003ဌ\u000b\u0004ᐉ\f\u0007ဈ\n\u000eᐉ\u0010\u0012ᐉ\u000f\u0018ᐉ\u000e", new Object[]{"a", C45240c.f118157a, C63400aa.f171335a, "d", "b", C19618h.f54585a, C30325g.f82003a, C10662f.f35572a});
            case 3:
                return new C63410ak();
            case 4:
                return new C63409aj();
            case 5:
                return f171362e;
            case 6:
                C63010eb ebVar = f171363j;
                if (ebVar == null) {
                    synchronized (C63410ak.class) {
                        ebVar = f171363j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171362e);
                            f171363j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
