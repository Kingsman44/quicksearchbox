package androidx.camera.core.p069a;

import androidx.camera.camera2.p063b.C1131c;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.a.ap */
/* compiled from: PG */
public final class C1302ap {

    /* renamed from: a */
    public static final C1306at f3747a = new C1367d("camerax.core.captureConfig.rotation", Integer.TYPE, (Object) null);

    /* renamed from: b */
    public static final C1306at f3748b = new C1367d("camerax.core.captureConfig.jpegQuality", Integer.class, (Object) null);

    /* renamed from: c */
    public final List f3749c;

    /* renamed from: d */
    public final C1308av f3750d;

    /* renamed from: e */
    public final int f3751e;

    /* renamed from: f */
    public final List f3752f;

    /* renamed from: g */
    public final boolean f3753g;

    /* renamed from: h */
    public final C1364cx f3754h;

    /* renamed from: i */
    public final C1131c f3755i;

    public C1302ap(List list, C1308av avVar, int i, List list2, boolean z, C1364cx cxVar, C1131c cVar) {
        this.f3749c = list;
        this.f3750d = avVar;
        this.f3751e = i;
        this.f3752f = Collections.unmodifiableList(list2);
        this.f3753g = z;
        this.f3754h = cxVar;
        this.f3755i = cVar;
    }

    /* renamed from: a */
    public static C1302ap m3495a() {
        return new C1300an().mo4157a();
    }
}
