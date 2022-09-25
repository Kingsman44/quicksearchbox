package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a;

import android.content.Context;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.assistant.p2786t.p2787a.C36453d;
import com.google.android.libraries.search.assistant.p2786t.p2787a.C36455f;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36408b;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36409c;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36410d;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36412f;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36414h;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36418l;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36421o;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36423q;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36424r;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36425s;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36426t;
import com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a.C36427u;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2791a.C36469c;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36476g;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c.C36477a;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2796f.C36505a;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36623e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5488io.grpc.C70148al;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.u */
/* compiled from: PG */
public final class C36447u extends C36418l {

    /* renamed from: a */
    public static final C59071e f95161a = C59071e.m91332i("com.google.android.libraries.search.assistant.t.a.a.u");

    /* renamed from: b */
    public static final Duration f95162b = Duration.ofMinutes(1);

    /* renamed from: c */
    public final C36435i f95163c;

    /* renamed from: d */
    public final C36477a f95164d;

    /* renamed from: e */
    public final C36505a f95165e;

    /* renamed from: f */
    public final C36469c f95166f;

    /* renamed from: g */
    public final Executor f95167g;

    /* renamed from: h */
    private final Context f95168h;

    /* renamed from: i */
    private final C36431e f95169i;

    /* renamed from: j */
    private final C36623e f95170j;

    public C36447u(Context context, C36431e eVar, C36435i iVar, C36477a aVar, C36505a aVar2, C36469c cVar, C36623e eVar2, Executor executor) {
        this.f95168h = context;
        this.f95169i = eVar;
        this.f95163c = iVar;
        this.f95164d = aVar;
        this.f95165e = aVar2;
        this.f95166f = cVar;
        this.f95170j = eVar2;
        this.f95167g = executor;
    }

    /* renamed from: g */
    public static void m64996g(C36476g gVar) {
        ((AtomicReference) C36450x.f95173a.mo61711a(C70148al.m102135m())).set(gVar);
    }

    /* renamed from: h */
    private final C47633f m64997h() {
        return this.f95170j.mo40236a().mo51513e(Exception.class, C36443q.f95153a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C47633f mo40167b(Optional optional) {
        C60870cx cxVar;
        if (!C36619a.m65149e(this.f95168h)) {
            return C47633f.m84733g(C60856cj.m92899h(new IllegalStateException("Notification access not granted.")));
        }
        C36431e eVar = this.f95169i;
        Optional a = eVar.mo40165a(optional);
        if (a.isPresent()) {
            cxVar = C60856cj.m92900i((C58485gu) a.get());
        } else {
            cxVar = C60856cj.m92908q(C2169h.m6027a(new C36406a(eVar, optional)), C36431e.f95129b, TimeUnit.MILLISECONDS, eVar.f95132e);
        }
        return C47633f.m84733g(cxVar);
    }

    /* renamed from: c */
    public final C47633f mo40168c(String str, Optional optional, String str2) {
        return mo40167b(Optional.m71637of(C58485gu.m89846n(str))).mo51515h(C36436j.f95137a, C60826bg.f164896a).mo51516i(new C36437k(this, str, optional, str2), this.f95167g);
    }

    /* renamed from: d */
    public final void mo40160d(C36408b bVar, C70862aj ajVar) {
        if (bVar.f95089a == 2) {
            C36427u uVar = (C36427u) bVar.f95090b;
            if ((uVar.f95121a & 1) != 0) {
                C36426t tVar = uVar.f95122b;
                if (tVar == null) {
                    tVar = C36426t.f95114d;
                }
                int i = tVar.f95116a;
                if ((i & 1) == 0 || (i & 2) == 0) {
                    ((C59052c) ((C59052c) f95161a.mo56226d()).mo56372aa(51486)).mo56386p("Invalid NotificationId in RequestToken");
                    ajVar.mo20122b(new IllegalArgumentException("Invalid NotificationId in RequestToken"));
                    return;
                }
                String str = tVar.f95117b;
                C58485gu guVar = (C58485gu) this.f95163c.f95135a.get(str);
                if (guVar == null) {
                    ((C59052c) ((C59052c) f95161a.mo56226d()).mo56372aa(51488)).mo56386p("Invalid or expired cache_key in RequestToken.");
                    ajVar.mo20122b(new IllegalArgumentException("Invalid or expired cache_key in RequestToken."));
                    return;
                }
                int i2 = tVar.f95118c;
                if (i2 < 0 || i2 >= guVar.size()) {
                    ((C59052c) ((C59052c) f95161a.mo56226d()).mo56372aa(51487)).mo56386p("Invalid index in RequestToken.");
                    ajVar.mo20122b(new IllegalArgumentException("Invalid index in RequestToken."));
                    return;
                }
                m64996g((C36476g) guVar.get(i2));
                C36409c cVar = (C36409c) C36410d.f95091d.createBuilder();
                cVar.copyOnWrite();
                C36410d dVar = (C36410d) cVar.instance;
                dVar.f95093a |= 1;
                dVar.f95094b = true;
                int i3 = i2 + 1;
                if (i3 < guVar.size()) {
                    C36424r rVar = (C36424r) C36427u.f95119c.createBuilder();
                    C36425s sVar = (C36425s) tVar.toBuilder();
                    sVar.copyOnWrite();
                    C36426t tVar2 = (C36426t) sVar.instance;
                    tVar2.f95116a |= 2;
                    tVar2.f95118c = i3;
                    rVar.copyOnWrite();
                    C36427u uVar2 = (C36427u) rVar.instance;
                    C36426t tVar3 = (C36426t) sVar.build();
                    tVar3.getClass();
                    uVar2.f95122b = tVar3;
                    uVar2.f95121a |= 1;
                    C36427u uVar3 = (C36427u) rVar.build();
                    cVar.copyOnWrite();
                    C36410d dVar2 = (C36410d) cVar.instance;
                    uVar3.getClass();
                    dVar2.f95095c = uVar3;
                    dVar2.f95093a |= 2;
                } else {
                    this.f95163c.f95135a.remove(str);
                }
                ajVar.mo20123c((C36410d) cVar.build());
                ajVar.mo20121a();
                return;
            }
            ((C59052c) ((C59052c) f95161a.mo56226d()).mo56372aa(51489)).mo56386p("No NotificationId in RequestToken");
            ajVar.mo20122b(new IllegalArgumentException("No NotificationId in RequestToken"));
            return;
        }
        C60856cj.m92911t(m64997h().mo51516i(new C36444r(this, bVar), this.f95167g).f164926b, C47810es.m84974n(new C36445s(this, ajVar)), this.f95167g);
    }

    /* renamed from: e */
    public final void mo40161e(C36412f fVar, C70862aj ajVar) {
        C36453d dVar = fVar.f95099b;
        if (dVar == null) {
            dVar = C36453d.f95179d;
        }
        if ((dVar.f95181a & 1) != 0) {
            C47633f i = m64997h().mo51516i(new C36439m(this, fVar), this.f95167g).mo51516i(new C36440n(fVar), this.f95167g);
            C36446t tVar = new C36446t(String.format(Locale.US, "Triggering %s Action", new Object[]{"MarkAsRead"}), ajVar, C36414h.f95100a);
            C60856cj.m92911t(i.f164926b, C47810es.m84974n(tVar), this.f95167g);
            return;
        }
        ajVar.mo20122b(new IllegalArgumentException("Invalid request"));
    }

    /* renamed from: f */
    public final void mo40162f(C36421o oVar, C70862aj ajVar) {
        C36455f fVar = oVar.f95111b;
        if (fVar == null) {
            fVar = C36455f.f95184d;
        }
        if ((fVar.f95186a & 1) != 0) {
            C36455f fVar2 = oVar.f95111b;
            if (fVar2 == null) {
                fVar2 = C36455f.f95184d;
            }
            if ((fVar2.f95186a & 2) != 0) {
                C47633f i = m64997h().mo51516i(new C36438l(this, oVar), this.f95167g);
                C36446t tVar = new C36446t(String.format(Locale.US, "Triggering %s Action", new Object[]{"Reply"}), ajVar, C36423q.f95112a);
                C60856cj.m92911t(i.f164926b, C47810es.m84974n(tVar), this.f95167g);
                return;
            }
        }
        ajVar.mo20122b(new IllegalArgumentException("Invalid request"));
    }
}
