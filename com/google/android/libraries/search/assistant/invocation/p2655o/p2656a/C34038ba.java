package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.hotword.p1516b.C18343b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34662b;
import com.google.android.libraries.search.p3055n.C39260aj;
import com.google.android.libraries.search.p3055n.C39372bu;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.ba */
/* compiled from: PG */
public final class C34038ba extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C34038ba f90707h;

    /* renamed from: i */
    private static volatile C63010eb f90708i;

    /* renamed from: a */
    public int f90709a;

    /* renamed from: b */
    public String f90710b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C18343b f90711c;

    /* renamed from: d */
    public C39260aj f90712d;

    /* renamed from: e */
    public C34080cp f90713e;

    /* renamed from: f */
    public C34662b f90714f;

    /* renamed from: g */
    public C39372bu f90715g;

    static {
        C34038ba baVar = new C34038ba();
        f90707h = baVar;
        C62942bv.registerDefaultInstance(C34038ba.class, baVar);
    }

    private C34038ba() {
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
                return newMessageInfo(f90707h, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C34038ba();
            case 4:
                return new C34036az();
            case 5:
                return f90707h;
            case 6:
                C63010eb ebVar = f90708i;
                if (ebVar == null) {
                    synchronized (C34038ba.class) {
                        ebVar = f90708i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90707h);
                            f90708i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
