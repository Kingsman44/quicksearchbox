package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54765m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.c */
/* compiled from: PG */
public final class C41677c extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C41677c f108996h;

    /* renamed from: i */
    private static volatile C63010eb f108997i;

    /* renamed from: a */
    public int f108998a;

    /* renamed from: b */
    public C62995dn f108999b = C62995dn.f170057a;

    /* renamed from: c */
    public C54759g f109000c;

    /* renamed from: d */
    public String f109001d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f109002e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f109003f = emptyProtobufList();

    /* renamed from: g */
    public String f109004g = BuildConfig.FLAVOR;

    static {
        C41677c cVar = new C41677c();
        f108996h = cVar;
        C62942bv.registerDefaultInstance(C41677c.class, cVar);
    }

    private C41677c() {
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
                return newMessageInfo(f108996h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0001\u0000\u00012\u0002ဉ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005\u001b\u0006ဈ\u0003", new Object[]{"a", "b", C41676b.f108995a, C45240c.f118157a, "d", "e", C10662f.f35572a, C54765m.class, C30325g.f82003a});
            case 3:
                return new C41677c();
            case 4:
                return new C41660a();
            case 5:
                return f108996h;
            case 6:
                C63010eb ebVar = f108997i;
                if (ebVar == null) {
                    synchronized (C41677c.class) {
                        ebVar = f108997i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f108996h);
                            f108997i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
