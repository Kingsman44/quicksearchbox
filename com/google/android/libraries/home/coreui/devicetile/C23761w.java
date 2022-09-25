package com.google.android.libraries.home.coreui.devicetile;

import android.content.Context;
import android.os.Vibrator;
import com.google.android.libraries.home.coreui.devicetile.model.C23751z;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.C71414ao;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.w */
/* compiled from: PG */
public final class C23761w implements C23752n {

    /* renamed from: a */
    public final Set f65123a = new LinkedHashSet();

    /* renamed from: b */
    private final Context f65124b;

    /* renamed from: c */
    private final C71414ao f65125c;

    /* renamed from: d */
    private final C71414ao f65126d;

    /* renamed from: e */
    private final C71422aw f65127e;

    public C23761w(Context context, C71414ao aoVar, C71414ao aoVar2) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aoVar, "bgDispatcher");
        C69664n.m101061g(aoVar2, "uiDispatcher");
        this.f65124b = context;
        this.f65125c = aoVar;
        this.f65126d = aoVar2;
        C71423ax.m104197b(aoVar);
        this.f65127e = C71423ax.m104197b(aoVar2);
        Object systemService = context.getSystemService("vibrator");
        C69664n.m101059e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) systemService;
    }

    /* renamed from: i */
    private final void m44253i(String str, boolean z, long j, C69615a aVar) {
        if (z) {
            if (this.f65123a.add(str)) {
                C71803m.m105043d(this.f65127e, (C69585o) null, (C71424ay) null, new C23757s(j, this, str, (C69577g) null), 3);
            } else {
                return;
            }
        }
        aVar.mo5672a();
    }

    /* renamed from: a */
    public final void mo29110a(C23656ab abVar) {
        m44253i(abVar.mo29001a().f64883a, false, 3000, new C23753o(abVar));
    }

    /* renamed from: b */
    public final void mo29111b(String str) {
        C69664n.m101061g(str, "controlId");
        this.f65123a.remove(str);
    }

    /* renamed from: c */
    public final void mo29112c(C23656ab abVar, boolean z) {
        C69664n.m101061g(abVar, "cvh");
        m44253i(abVar.mo29001a().f64883a, false, 3000, new C23754p(abVar, z));
    }

    /* renamed from: d */
    public final void mo29113d(C23656ab abVar) {
        C69664n.m101061g(abVar, "cvh");
        m44253i(abVar.mo29001a().f64883a, false, 3000, new C23755q(abVar));
    }

    /* renamed from: e */
    public final void mo29114e(C23656ab abVar, String str, float f) {
        C69664n.m101061g(abVar, "cvh");
        C69664n.m101061g(str, "templateId");
        m44253i(abVar.mo29001a().f64883a, false, 3000, new C23756r(abVar, str, f));
    }

    /* renamed from: f */
    public final void mo29115f(C23656ab abVar, String str, C23751z zVar) {
        C69664n.m101061g(abVar, "controlViewHolder");
        C69664n.m101061g(str, "templateId");
        C69664n.m101061g(zVar, "stepChangeActionType");
        m44253i(abVar.mo29001a().f64883a, true, 100, new C23758t(abVar, str, zVar));
    }

    /* renamed from: g */
    public final void mo29116g(C23656ab abVar, String str, boolean z) {
        C69664n.m101061g(abVar, "cvh");
        C69664n.m101061g(str, "templateId");
        m44253i(abVar.mo29001a().f64883a, true, 3000, new C23759u(abVar, str, z));
    }

    /* renamed from: h */
    public final void mo29117h(C23656ab abVar, String str, Control control) {
        C69664n.m101061g(abVar, "cvh");
        C69664n.m101061g(str, "templateId");
        C69664n.m101061g(control, "control");
        boolean e = abVar.mo29005e();
        m44253i(abVar.mo29001a().f64883a, e, 100, new C23760v(abVar, e, str));
    }
}
