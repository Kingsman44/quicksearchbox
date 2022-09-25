package com.google.assistant.p3897e.p3899b.p3901b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51419h;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.b.b.b */
/* compiled from: PG */
public final class C50875b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50875b f132463h;

    /* renamed from: i */
    private static volatile C63010eb f132464i;

    /* renamed from: a */
    public int f132465a;

    /* renamed from: b */
    public int f132466b = 0;

    /* renamed from: c */
    public Object f132467c;

    /* renamed from: d */
    public String f132468d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f132469e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C52403ql f132470f;

    /* renamed from: g */
    public int f132471g;

    static {
        C50875b bVar = new C50875b();
        f132463h = bVar;
        C62942bv.registerDefaultInstance(C50875b.class, bVar);
    }

    private C50875b() {
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
                return newMessageInfo(f132463h, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဉ\u0003\u0005ြ\u0000\u0006ြ\u0000\u0007ဌ\u0006", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C52393qb.class, C52397qf.class, C30325g.f82003a, C51419h.m86181b()});
            case 3:
                return new C50875b();
            case 4:
                return new C50874a();
            case 5:
                return f132463h;
            case 6:
                C63010eb ebVar = f132464i;
                if (ebVar == null) {
                    synchronized (C50875b.class) {
                        ebVar = f132464i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132463h);
                            f132464i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
