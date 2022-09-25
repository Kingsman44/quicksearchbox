package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55522ab;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.as */
/* compiled from: PG */
public final class C55609as extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C55609as f146718h;

    /* renamed from: i */
    private static volatile C63010eb f146719i;

    /* renamed from: a */
    public int f146720a;

    /* renamed from: b */
    public String f146721b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C55659co f146722c;

    /* renamed from: d */
    public long f146723d;

    /* renamed from: e */
    public C55653ci f146724e;

    /* renamed from: f */
    public int f146725f;

    /* renamed from: g */
    public C55543aw f146726g;

    static {
        C55609as asVar = new C55609as();
        f146718h = asVar;
        C62942bv.registerDefaultInstance(C55609as.class, asVar);
    }

    private C55609as() {
        emptyIntList();
        emptyProtobufList();
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
                return newMessageInfo(f146718h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဂ\u0002\u0007ဉ\u0001\bဉ\u0004\tဌ\u0005\nဉ\u0006", new Object[]{"a", "b", "d", C45240c.f118157a, "e", C10662f.f35572a, C55522ab.m87702b(), C30325g.f82003a});
            case 3:
                return new C55609as();
            case 4:
                return new C55608ar();
            case 5:
                return f146718h;
            case 6:
                C63010eb ebVar = f146719i;
                if (ebVar == null) {
                    synchronized (C55609as.class) {
                        ebVar = f146719i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146718h);
                            f146719i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
