package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.C1400aa;
import androidx.camera.core.C1402ac;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p069a.p070a.p072b.C1266o;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.camera.lifecycle.h */
/* compiled from: PG */
public final class C1584h {

    /* renamed from: a */
    public static final C1584h f4330a = new C1584h();

    /* renamed from: b */
    public final Object f4331b = new Object();

    /* renamed from: c */
    public C1402ac f4332c = null;

    /* renamed from: d */
    public final C60870cx f4333d = C1266o.f3667a;

    /* renamed from: e */
    public final LifecycleCameraRepository f4334e = new LifecycleCameraRepository();

    /* renamed from: f */
    public C1400aa f4335f;

    /* renamed from: g */
    public Context f4336g;

    /* renamed from: h */
    private C60870cx f4337h;

    private C1584h() {
    }

    /* renamed from: a */
    public static C60870cx m4197a(Context context) {
        C60870cx cxVar;
        context.getClass();
        C1584h hVar = f4330a;
        synchronized (hVar.f4331b) {
            cxVar = hVar.f4337h;
            if (cxVar == null) {
                cxVar = C2169h.m6027a(new C1582f(hVar, new C1400aa(context, hVar.f4332c)));
                hVar.f4337h = cxVar;
            }
        }
        return C1263l.m3433e(cxVar, new C1581e(context), C1238a.m3410a());
    }
}
