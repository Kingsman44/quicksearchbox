package com.google.protos.p5170z.p5171a.p5172a;

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
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65878b;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65881e;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65882f;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65883g;

/* renamed from: com.google.protos.z.a.a.b */
/* compiled from: PG */
public final class C66270b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C66270b f180218j;

    /* renamed from: k */
    private static volatile C63010eb f180219k;

    /* renamed from: a */
    public int f180220a;

    /* renamed from: b */
    public int f180221b;

    /* renamed from: c */
    public int f180222c;

    /* renamed from: d */
    public String f180223d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f180224e;

    /* renamed from: f */
    public String f180225f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f180226g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f180227h;

    /* renamed from: i */
    public int f180228i;

    static {
        C66270b bVar = new C66270b();
        f180218j = bVar;
        C62942bv.registerDefaultInstance(C66270b.class, bVar);
    }

    private C66270b() {
        emptyIntList();
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
                return newMessageInfo(f180218j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0001\u0005ဈ\u0003\u0006ဌ\u0004\u0007ဈ\u0005\bဈ\u0006\u000bဌ\t\fဌ\n", new Object[]{"a", "b", C65881e.m96823b(), C45240c.f118157a, C65881e.m96823b(), "d", "e", C65878b.m96820b(), C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C65883g.f179197a, "i", C65882f.f179196a});
            case 3:
                return new C66270b();
            case 4:
                return new C66269a();
            case 5:
                return f180218j;
            case 6:
                C63010eb ebVar = f180219k;
                if (ebVar == null) {
                    synchronized (C66270b.class) {
                        ebVar = f180219k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180218j);
                            f180219k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
