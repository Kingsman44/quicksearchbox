package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.graphics.C1924a;
import com.google.android.apps.gsa.searchnow.C88855ag;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.p7078a.C90186a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.p7078a.C90187b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7077ae.p7078a.C90188c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90274c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90275d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90294j;
import com.google.android.apps.gsa.shared.monet.p7070b.p7105v.C90295k;
import com.google.android.apps.gsa.sidekick.shared.monet.p7248d.C91820a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.apps.gsa.sidekick.shared.overlay.C91896e;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105400h;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105401i;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105434d;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105435e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.p576aq.C10558u;
import com.google.android.libraries.p576aq.C10563z;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.bg */
/* compiled from: PG */
public final class C105506bg extends C22939d implements C90275d, C90186a, C90187b {

    /* renamed from: i */
    public static final /* synthetic */ int f294328i = 0;

    /* renamed from: j */
    private static final C90295k f294329j = C90295k.DAYNIGHT_DARK;

    /* renamed from: a */
    final int f294330a;

    /* renamed from: b */
    final int f294331b;

    /* renamed from: c */
    final C10558u f294332c;

    /* renamed from: d */
    final C10558u f294333d;

    /* renamed from: e */
    public final C105419b f294334e;

    /* renamed from: f */
    public final C91820a f294335f;

    /* renamed from: g */
    public C90274c f294336g;

    /* renamed from: h */
    public final C91825b f294337h;

    /* renamed from: k */
    private final Context f294338k;

    /* renamed from: l */
    private final ArgbEvaluator f294339l;

    /* renamed from: m */
    private final C105435e f294340m;

    /* renamed from: n */
    private final C105400h f294341n;

    /* renamed from: o */
    private final C105505bf f294342o = new C105505bf(this);

    /* renamed from: p */
    private final C105504be f294343p = new C105504be();

    /* renamed from: q */
    private ViewGroup f294344q;

    public C105506bg(C22945j jVar, Context context, C105435e eVar, C105400h hVar, C91825b bVar, C91820a aVar, C105419b bVar2) {
        super(jVar);
        this.f294338k = context;
        this.f294340m = eVar;
        this.f294341n = hVar;
        this.f294335f = aVar;
        this.f294337h = bVar;
        this.f294334e = bVar2;
        int color = context.getResources().getColor(R.color.agsa_color_background);
        this.f294331b = color;
        int h = C1924a.m5189h(color, 0);
        this.f294330a = h;
        this.f294339l = new ArgbEvaluator();
        this.f294332c = C10563z.m25518j(f294329j);
        this.f294333d = C10563z.m25518j(Integer.valueOf(h));
    }

    /* renamed from: a */
    public final void mo83978a(boolean z) {
        this.f294334e.mo94782d(z);
        if (z) {
            C105400h hVar = this.f294341n;
            ((C105401i) hVar).f294023a.mo28345s("onContentObscured", "InterestsTabContentEventsDispatcher", new Bundle());
            return;
        }
        C105400h hVar2 = this.f294341n;
        ((C105401i) hVar2).f294023a.mo28345s("onContentUnObscured", "InterestsTabContentEventsDispatcher", new Bundle());
    }

    /* renamed from: b */
    public final void mo83979b(C90274c cVar) {
        this.f294336g = cVar;
    }

    /* renamed from: c */
    public final C10563z mo83932c(C90188c cVar) {
        if (cVar == C90294j.f252212a) {
            return this.f294333d;
        }
        if (cVar == C90294j.f252213b) {
            return this.f294332c;
        }
        return null;
    }

    /* renamed from: e */
    public final C105504be mo94869e() {
        int i = -1;
        if (!this.f294335f.mo86295v() || !this.f294335f.mo86296w()) {
            C105504be beVar = this.f294343p;
            beVar.f294324a = -1;
            beVar.f294325b = 0;
            return beVar;
        }
        int m = this.f294335f.mo86289m();
        int jg = this.f294335f.mo86286jg();
        if (m < jg) {
            i = m;
        }
        C105504be beVar2 = this.f294343p;
        beVar2.f294324a = i;
        beVar2.f294325b = jg;
        return beVar2;
    }

    /* renamed from: g */
    public final void mo94870g(int i, boolean z) {
        C90274c cVar = this.f294336g;
        if (cVar != null) {
            C105504be e = mo94869e();
            mo94871h(e, true);
            if (z) {
                C91896e eVar = ((C88855ag) cVar).f240564a.f240591U;
                if (eVar != null) {
                    eVar.mo86477e(0, 0, 0);
                    return;
                }
                return;
            }
            int i2 = e.f294324a;
            int i3 = this.f294342o.f294326a;
            C88855ag agVar = (C88855ag) cVar;
            C91896e eVar2 = agVar.f240564a.f240591U;
            if (eVar2 != null) {
                eVar2.mo86477e(i2, i, i3);
            }
            if (i2 != 0) {
                agVar.f240564a.mo82643c();
            }
        }
    }

    /* renamed from: h */
    public final void mo94871h(C105504be beVar, boolean z) {
        C90295k kVar;
        int i = beVar.f294324a;
        if (i != -1) {
            float f = ((float) i) / ((float) beVar.f294325b);
            this.f294333d.mo18619f((Integer) this.f294339l.evaluate(f, Integer.valueOf(this.f294330a), Integer.valueOf(this.f294331b)));
            C58833ax axVar = (C58833ax) ((C105577dx) this.f294340m).f294538b.f63720e;
            if (f >= 0.5f || !axVar.mo56113h()) {
                this.f294332c.mo18619f(f294329j);
                return;
            }
            C10558u uVar = this.f294332c;
            if (axVar.mo56107c() == C105434d.ALWAYS_DARK) {
                kVar = C90295k.ALWAYS_DARK;
            } else {
                kVar = C90295k.ALWAYS_LIGHT;
            }
            uVar.mo18619f(kVar);
        } else if (z) {
            this.f294333d.mo18619f(Integer.valueOf(this.f294331b));
            this.f294332c.mo18619f(f294329j);
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        this.f294337h.mo86304c(this.f294342o);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f294338k).inflate(R.layout.interests_tab_content_stub, (ViewGroup) null);
        this.f294344q = viewGroup;
        mo28295iC(viewGroup);
        ((C105577dx) this.f294340m).f294539c.mo28685c(new C23243a((ChildStub) this.f294344q.findViewById(R.id.content_stub)));
        C105419b bVar = this.f294334e;
        bVar.f294039f = 2;
        bVar.mo94780b();
        ((C105577dx) this.f294340m).f294540d.mo28726b(new C105497ay(this));
        ((C105577dx) this.f294340m).f294538b.mo28726b(new C105498az(this));
        ((C105577dx) this.f294340m).f294537a.mo28685c(new C105503bd(this, this.f294344q));
        this.f63126Q.mo28327o("Scroll to top", new C105500ba(this));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        this.f294337h.mo86302a(this.f294342o);
    }

    /* renamed from: n */
    public final C23108e mo28302n() {
        return C105501bb.f294321a;
    }
}
