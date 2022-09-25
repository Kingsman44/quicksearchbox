package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice;

import android.view.View;
import android.view.ViewGroup;
import androidx.p116i.p117a.C2298d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.appactions.appwidget.C32480m;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32433a;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32434aa;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32462u;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.lifecycle.flow.C47426f;
import com.google.apps.tiktok.lifecycle.flow.C47429i;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3921j.ady;
import com.google.assistant.p3931f.p3940d.p3941a.C52856af;
import com.google.assistant.p3931f.p3940d.p3941a.C52857ag;
import com.google.assistant.p3931f.p3940d.p3941a.C52858ah;
import com.google.assistant.p3931f.p3940d.p3941a.C52860aj;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.C69613f;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.r */
/* compiled from: PG */
public final class C129085r implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public static final C129082o f354604a = new C129082o();

    /* renamed from: g */
    private static final C59071e f354605g = C59071e.m91331h();

    /* renamed from: b */
    public final C47770dh f354606b;

    /* renamed from: c */
    public final C47274n f354607c;

    /* renamed from: d */
    public final String f354608d;

    /* renamed from: e */
    public final C69613f f354609e;

    /* renamed from: f */
    public boolean f354610f;

    /* renamed from: h */
    private final C129078k f354611h;

    /* renamed from: i */
    private final C129076i f354612i;

    /* renamed from: j */
    private final ady f354613j;

    /* renamed from: k */
    private final C32433a f354614k;

    /* renamed from: l */
    private int f354615l;

    /* renamed from: m */
    private final int f354616m;

    public C129085r(C129080m mVar, C129078k kVar, C129076i iVar, C47770dh dhVar, C47274n nVar, C47429i iVar2) {
        C69664n.m101061g(dhVar, "traceCreation");
        this.f354611h = kVar;
        this.f354612i = iVar;
        this.f354606b = dhVar;
        this.f354607c = nVar;
        ady ady = mVar.f354598b;
        ady = ady == null ? ady.f134912f : ady;
        C69664n.m101060f(ady, "args.args");
        this.f354613j = ady;
        String str = mVar.f354599c;
        C69664n.m101060f(str, "args.sessionKey");
        this.f354608d = str;
        C32433a a = iVar.mo108834a(str);
        this.f354614k = a;
        C129083p pVar = new C129083p(kVar);
        int i = C69649af.f186028a;
        this.f354609e = C2298d.m6235a(kVar, new C69657g(ActionsServiceSessionCleanupViewModel.class), new C129084q(pVar));
        this.f354610f = true;
        this.f354616m = nVar.getResources().getDimensionPixelSize(R.dimen.assistant_actions_service_container_max_height);
        if (a == null) {
            C59052c cVar = (C59052c) f354605g.mo56225c();
            cVar.mo56379ah(new C59094n(38090));
            cVar.mo56386p("Unable to initialize fragment due to the associated ActionsServiceSession not found");
            return;
        }
        C47426f.m84293a(iVar2.mo51262a(a.mo38062d()), new C129081n(this));
    }

    /* renamed from: c */
    private final float m210714c(int i) {
        return ((float) i) / this.f354607c.getResources().getDisplayMetrics().density;
    }

    /* renamed from: d */
    private final int m210715d(float f) {
        return (int) (f * this.f354607c.getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    public final ViewGroup mo108839a() {
        View findViewById = this.f354611h.requireView().findViewById(R.id.assistant_host_view_wrapper);
        C69664n.m101058d(findViewById);
        return (ViewGroup) findViewById;
    }

    /* renamed from: b */
    public final void mo108840b(C32434aa aaVar) {
        int i;
        int i2;
        C129082o oVar = f354604a;
        View requireView = this.f354611h.requireView();
        C69664n.m101060f(requireView, "fragment.requireView()");
        C32480m a = oVar.mo108838a(requireView);
        if (a != null) {
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            if (layoutParams != null) {
                C52860aj ajVar = aaVar.f86904b;
                float f = 0.0f;
                if (ajVar.f138688a != 3 || !((Boolean) ajVar.f138689b).booleanValue()) {
                    C52860aj ajVar2 = aaVar.f86904b;
                    i = Math.min(m210715d(ajVar2.f138688a == 1 ? ((Float) ajVar2.f138689b).floatValue() : 0.0f), this.f354615l);
                } else {
                    i = -1;
                }
                layoutParams.width = i;
                C52860aj ajVar3 = aaVar.f86904b;
                if (ajVar3.f138690c != 4 || !((Boolean) ajVar3.f138691d).booleanValue()) {
                    C52860aj ajVar4 = aaVar.f86904b;
                    if (ajVar4.f138690c == 2) {
                        f = ((Float) ajVar4.f138691d).floatValue();
                    }
                    i2 = Math.min(m210715d(f), this.f354616m);
                } else {
                    i2 = this.f354616m;
                }
                layoutParams.height = i2;
                a.setLayoutParams(layoutParams);
                a.updateAppWidget(aaVar.f86903a);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C69664n.m101061g(view, "view");
        C32433a aVar = this.f354614k;
        if (aVar != null) {
            this.f354615l = mo108839a().getMeasuredWidth();
            C32434aa aaVar = (C32434aa) aVar.mo38062d().mo62784e();
            if (aaVar != null) {
                mo108840b(aaVar);
            }
            if (this.f354610f) {
                C129076i iVar = this.f354612i;
                String str = this.f354608d;
                ady ady = this.f354613j;
                C52856af afVar = (C52856af) C52858ah.f138677h.createBuilder();
                C69664n.m101060f(afVar, "newBuilder()");
                C69664n.m101061g(afVar, "builder");
                float c = m210714c(this.f354615l);
                afVar.copyOnWrite();
                ((C52858ah) afVar.instance).f138679a = c;
                float c2 = m210714c(this.f354616m);
                afVar.copyOnWrite();
                ((C52858ah) afVar.instance).f138680b = c2;
                afVar.copyOnWrite();
                ((C52858ah) afVar.instance).f138685g = true;
                C52857ag agVar = C52857ag.MOBILE;
                C69664n.m101061g(agVar, "value");
                afVar.copyOnWrite();
                ((C52858ah) afVar.instance).f138684f = agVar.getNumber();
                C62942bv build = afVar.build();
                C69664n.m101060f(build, "_builder.build()");
                C52858ah ahVar = (C52858ah) build;
                C69664n.m101061g(str, "key");
                C69664n.m101061g(ady, "args");
                C69664n.m101061g(ahVar, "hostProperties");
                C32433a a = iVar.mo108834a(str);
                if (a == null) {
                    C59052c cVar = (C59052c) C129076i.f354587a.mo56225c();
                    cVar.mo56379ah(new C59094n(38088));
                    cVar.mo56389s("bindActionsService: unable to find ActionsServiceSession with key %s", str);
                    return;
                }
                a.mo38064f(new C32462u(ady, ahVar));
                C71803m.m105043d(iVar.f354588b, (C69585o) null, (C71424ay) null, new C129074g(a, iVar, (C69577g) null), 3);
            }
        }
    }
}
