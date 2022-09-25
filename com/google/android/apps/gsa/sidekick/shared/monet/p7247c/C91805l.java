package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90273b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7669fo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.l */
/* compiled from: PG */
public final class C91805l extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C91805l f256031h;

    /* renamed from: j */
    private static volatile C63010eb f256032j;

    /* renamed from: a */
    public int f256033a;

    /* renamed from: b */
    public C7669fo f256034b;

    /* renamed from: c */
    public C62971cq f256035c = emptyProtobufList();

    /* renamed from: d */
    public String f256036d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f256037e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C91788al f256038f;

    /* renamed from: g */
    public String f256039g = BuildConfig.FLAVOR;

    /* renamed from: i */
    private byte f256040i = 2;

    static {
        C91805l lVar = new C91805l();
        f256031h = lVar;
        C62942bv.registerDefaultInstance(C91805l.class, lVar);
    }

    private C91805l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f256040i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f256040i = b;
                return null;
            case 2:
                return newMessageInfo(f256031h, "\u0001\u0006\u0000\u0001\u0003\t\u0006\u0000\u0001\u0002\u0003ဉ\u0000\u0004Л\u0006ဈ\u0001\u0007ဈ\u0002\bᐉ\u0003\tဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, C90273b.class, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C91805l();
            case 4:
                return new C91804k();
            case 5:
                return f256031h;
            case 6:
                C63010eb ebVar = f256032j;
                if (ebVar == null) {
                    synchronized (C91805l.class) {
                        ebVar = f256032j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256031h);
                            f256032j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
