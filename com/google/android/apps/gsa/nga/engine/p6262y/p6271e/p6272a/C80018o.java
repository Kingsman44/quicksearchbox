package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.assistant.p3781ad.p3789d.C48745c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.o */
/* compiled from: PG */
public final class C80018o extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C80018o f219583i;

    /* renamed from: j */
    private static volatile C63010eb f219584j;

    /* renamed from: a */
    public int f219585a;

    /* renamed from: b */
    public String f219586b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f219587c;

    /* renamed from: d */
    public int f219588d;

    /* renamed from: e */
    public String f219589e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public long f219590f;

    /* renamed from: g */
    public String f219591g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f219592h;

    static {
        C80018o oVar = new C80018o();
        f219583i = oVar;
        C62942bv.registerDefaultInstance(C80018o.class, oVar);
    }

    private C80018o() {
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
                return newMessageInfo(f219583i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007င\u0006", new Object[]{"a", "b", C45240c.f118157a, C48582b.m85244b(), "d", C48745c.f126137a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C80018o();
            case 4:
                return new C80017n();
            case 5:
                return f219583i;
            case 6:
                C63010eb ebVar = f219584j;
                if (ebVar == null) {
                    synchronized (C80018o.class) {
                        ebVar = f219584j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219583i);
                            f219584j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
