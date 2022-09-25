package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.assistant.at.s */
/* compiled from: PG */
public final class C50301s extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C50301s f130893k;

    /* renamed from: l */
    private static volatile C63010eb f130894l;

    /* renamed from: a */
    public int f130895a;

    /* renamed from: b */
    public String f130896b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130897c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130898d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f130899e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f130900f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f130901g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public C62971cq f130902h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public C62971cq f130903i = C62942bv.emptyProtobufList();

    /* renamed from: j */
    public C62971cq f130904j = C62942bv.emptyProtobufList();

    static {
        C50301s sVar = new C50301s();
        f130893k = sVar;
        C62942bv.registerDefaultInstance(C50301s.class, sVar);
    }

    private C50301s() {
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
                return newMessageInfo(f130893k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0001\u0004ဈ\u0003\u0005\u001a\u0006\u001a\u0007ဈ\u0004\b\u001a\t\u001a", new Object[]{"a", "b", "d", C45240c.f118157a, "e", "i", "j", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C50301s();
            case 4:
                return new C50274r();
            case 5:
                return f130893k;
            case 6:
                C63010eb ebVar = f130894l;
                if (ebVar == null) {
                    synchronized (C50301s.class) {
                        ebVar = f130894l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130893k);
                            f130894l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
