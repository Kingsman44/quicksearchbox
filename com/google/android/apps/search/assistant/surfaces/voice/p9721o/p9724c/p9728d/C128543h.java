package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.d.h */
/* compiled from: PG */
public final class C128543h extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C128543h f353464i;

    /* renamed from: j */
    private static volatile C63010eb f353465j;

    /* renamed from: a */
    public int f353466a;

    /* renamed from: b */
    public int f353467b;

    /* renamed from: c */
    public int f353468c;

    /* renamed from: d */
    public String f353469d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f353470e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public boolean f353471f;

    /* renamed from: g */
    public boolean f353472g;

    /* renamed from: h */
    public boolean f353473h;

    static {
        C128543h hVar = new C128543h();
        f353464i = hVar;
        C62942bv.registerDefaultInstance(C128543h.class, hVar);
    }

    private C128543h() {
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
                return newMessageInfo(f353464i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{"a", "b", C128541f.m209786b(), C45240c.f118157a, C79570b.m127649b(), "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C128543h();
            case 4:
                return new C128542g();
            case 5:
                return f353464i;
            case 6:
                C63010eb ebVar = f353465j;
                if (ebVar == null) {
                    synchronized (C128543h.class) {
                        ebVar = f353465j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f353464i);
                            f353465j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
