package com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.d.c.c */
/* compiled from: PG */
public final class C16868c extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C16868c f49349j;

    /* renamed from: k */
    private static volatile C63010eb f49350k;

    /* renamed from: a */
    public int f49351a;

    /* renamed from: b */
    public String f49352b = "en-US";

    /* renamed from: c */
    public boolean f49353c;

    /* renamed from: d */
    public C62971cq f49354d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public boolean f49355e;

    /* renamed from: f */
    public C62995dn f49356f = C62995dn.f170057a;

    /* renamed from: g */
    public C62971cq f49357g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public String f49358h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f49359i;

    static {
        C16868c cVar = new C16868c();
        f49349j = cVar;
        C62942bv.registerDefaultInstance(C16868c.class, cVar);
    }

    private C16868c() {
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
                return newMessageInfo(f49349j, "\u0001\b\u0000\u0001\u0001\n\b\u0001\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0005ဇ\u0002\u00062\u0007\u001a\b\u001a\tဈ\u0003\nဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C16866a.f49348a, C30325g.f82003a, "d", C19618h.f54585a, "i"});
            case 3:
                return new C16868c();
            case 4:
                return new C16867b();
            case 5:
                return f49349j;
            case 6:
                C63010eb ebVar = f49350k;
                if (ebVar == null) {
                    synchronized (C16868c.class) {
                        ebVar = f49350k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49349j);
                            f49350k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
