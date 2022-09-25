package com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.a.a.g */
/* compiled from: PG */
public final class C79885g extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C79885g f218957h;

    /* renamed from: j */
    private static volatile C63010eb f218958j;

    /* renamed from: a */
    public int f218959a;

    /* renamed from: b */
    public C79893o f218960b;

    /* renamed from: c */
    public C79893o f218961c;

    /* renamed from: d */
    public String f218962d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C79881c f218963e;

    /* renamed from: f */
    public C79884f f218964f;

    /* renamed from: g */
    public boolean f218965g;

    /* renamed from: i */
    private byte f218966i = 2;

    static {
        C79885g gVar = new C79885g();
        f218957h = gVar;
        C62942bv.registerDefaultInstance(C79885g.class, gVar);
    }

    private C79885g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f218966i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f218966i = b;
                return null;
            case 2:
                return newMessageInfo(f218957h, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u000bဉ\u0004\fဉ\u0003\rဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, "e", C30325g.f82003a});
            case 3:
                return new C79885g();
            case 4:
                return new C79882d();
            case 5:
                return f218957h;
            case 6:
                C63010eb ebVar = f218958j;
                if (ebVar == null) {
                    synchronized (C79885g.class) {
                        ebVar = f218958j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218957h);
                            f218958j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
