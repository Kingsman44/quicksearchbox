package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

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

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.ai */
/* compiled from: PG */
public final class C79934ai extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C79934ai f219159k;

    /* renamed from: l */
    private static volatile C63010eb f219160l;

    /* renamed from: a */
    public int f219161a;

    /* renamed from: b */
    public String f219162b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f219163c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f219164d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public float f219165e;

    /* renamed from: f */
    public C62971cq f219166f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public boolean f219167g;

    /* renamed from: h */
    public boolean f219168h;

    /* renamed from: i */
    public float f219169i;

    /* renamed from: j */
    public String f219170j = BuildConfig.FLAVOR;

    static {
        C79934ai aiVar = new C79934ai();
        f219159k = aiVar;
        C62942bv.registerDefaultInstance(C79934ai.class, aiVar);
    }

    private C79934ai() {
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
                return newMessageInfo(f219159k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ခ\u0003\u0005\u001a\u0006ဇ\u0004\u0007ဇ\u0005\bခ\u0006\tဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C79934ai();
            case 4:
                return new C79933ah();
            case 5:
                return f219159k;
            case 6:
                C63010eb ebVar = f219160l;
                if (ebVar == null) {
                    synchronized (C79934ai.class) {
                        ebVar = f219160l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219159k);
                            f219160l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
