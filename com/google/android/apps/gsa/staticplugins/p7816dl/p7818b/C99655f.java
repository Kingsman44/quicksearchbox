package com.google.android.apps.gsa.staticplugins.p7816dl.p7818b;

import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.monet.p7070b.p7082ah.C90212c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7082ah.C90213d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7082ah.C90215f;
import com.google.android.apps.gsa.shared.p7066m.C90138q;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91815v;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99676a;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99679d;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7821e.p7822a.C99719a;
import com.google.android.apps.gsa.staticplugins.videoplayer.p8781a.C117542g;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1859d.p1860a.C22740k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.b.f */
/* compiled from: PG */
public final class C99655f extends C23056g implements C99676a {

    /* renamed from: a */
    public final C99679d f278898a;

    /* renamed from: b */
    public final C99719a f278899b;

    /* renamed from: c */
    public final C21370a f278900c;

    /* renamed from: d */
    public final C86124t f278901d;

    /* renamed from: e */
    public final SettableFuture f278902e = new SettableFuture();

    /* renamed from: f */
    public int f278903f;

    /* renamed from: g */
    public boolean f278904g;

    /* renamed from: h */
    public boolean f278905h;

    /* renamed from: i */
    public long f278906i;

    /* renamed from: j */
    public Bundle f278907j;

    /* renamed from: k */
    public boolean f278908k;

    /* renamed from: l */
    public boolean f278909l;

    /* renamed from: m */
    private final Context f278910m;

    /* renamed from: n */
    private final C22871g f278911n;

    public C99655f(C23052c cVar, C99679d dVar, Context context, C99719a aVar, C22871g gVar, C21370a aVar2, C86124t tVar) {
        super(cVar);
        this.f278898a = dVar;
        this.f278910m = context;
        this.f278899b = aVar;
        this.f278911n = gVar;
        this.f278900c = aVar2;
        this.f278901d = tVar;
    }

    /* renamed from: l */
    private final boolean m165281l(int i) {
        return ((int) (((float) ((int) ((float) this.f278910m.getResources().getDisplayMetrics().widthPixels))) / this.f278910m.getResources().getDisplayMetrics().density)) / 2 > i && i >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo91557e(int i, int i2) {
        if (this.f278910m.getResources().getConfiguration().orientation != 2) {
            return 0;
        }
        float intValue = (float) (this.f278910m.getResources().getDisplayMetrics().heightPixels - ((Integer) ((C99643a) this.f278898a).f278836n.f63720e).intValue());
        int b = (int) (C91115n.m148870b((float) i2, this.f278910m) / 1.777f);
        if (b > 0 && ((float) b) <= intValue) {
            return b;
        }
        float b2 = C91115n.m148870b((float) i, this.f278910m);
        return (int) (intValue - (b2 + b2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo91558f(int i, int i2) {
        int i3 = this.f278910m.getResources().getConfiguration().orientation;
        if (i3 != 1 && i3 != 0) {
            return 0;
        }
        float f = (float) this.f278910m.getResources().getDisplayMetrics().widthPixels;
        int b = (int) C91115n.m148870b((float) i2, this.f278910m);
        if (b > 0 && ((float) b) <= f) {
            return b;
        }
        float b2 = C91115n.m148870b((float) i, this.f278910m);
        return (int) (f - (b2 + b2));
    }

    /* renamed from: h */
    public final void mo91559h(String str, int i, int i2, int i3) {
        C58976aa aaVar = C58975e.f156826a;
        if (((C99643a) this.f278898a).f278834l.mo28631l()) {
            ((C99643a) this.f278898a).f278834l.mo28627h();
        }
        ((C99643a) this.f278898a).f278835m.mo28730f(str, false);
        ((C99643a) this.f278898a).f278832j.mo28730f(Integer.valueOf(i), false);
        if (i2 != 0) {
            ((C99643a) this.f278898a).f278831i.mo28730f(Integer.valueOf(i2), false);
        }
        if (i3 != 0) {
            ((C99643a) this.f278898a).f278830h.mo28730f(Integer.valueOf(i3), false);
        }
        C90213d dVar = (C90213d) C90215f.f252021i.createBuilder();
        dVar.copyOnWrite();
        C90215f fVar = (C90215f) dVar.instance;
        str.getClass();
        int i4 = 2;
        fVar.f252023a |= 2;
        fVar.f252025c = str;
        if (i != 1) {
            i4 = i != 2 ? i != 3 ? 1 : 4 : 3;
        }
        dVar.copyOnWrite();
        C90215f fVar2 = (C90215f) dVar.instance;
        fVar2.f252024b = i4 - 1;
        fVar2.f252023a = 1 | fVar2.f252023a;
        dVar.copyOnWrite();
        C90215f fVar3 = (C90215f) dVar.instance;
        fVar3.f252023a |= 8;
        fVar3.f252027e = i3;
        dVar.copyOnWrite();
        C90215f fVar4 = (C90215f) dVar.instance;
        fVar4.f252023a |= 16;
        fVar4.f252028f = i2;
        dVar.copyOnWrite();
        C90215f fVar5 = (C90215f) dVar.instance;
        fVar5.f252023a = 4 | fVar5.f252023a;
        fVar5.f252026d = 1.777f;
        ((C99643a) this.f278898a).f278834l.mo28623d(C90212c.f252019c, C23245b.m43556a((C90215f) dVar.build()));
    }

    /* renamed from: i */
    public final void mo91560i() {
        if (!this.f63405W.mo28420E() && this.f278908k && ((C99643a) this.f278898a).f278834l.mo28631l()) {
            C117542g gVar = (C117542g) ((C99643a) this.f278898a).f278834l.mo28620a();
            gVar.getClass();
            gVar.f63405W.mo28435z("PAUSE");
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C91815v vVar = (C91815v) C23245b.m43557b(protoParcelable, C91815v.f256065j.getParserForType(), C62921ba.m95368a(), true);
        vVar.getClass();
        this.f278903f = vVar.f256068b;
        int i = 0;
        ((C99643a) this.f278898a).f278829g.mo28730f(vVar.f256069c, false);
        ((C99643a) this.f278898a).f278836n.mo28730f(Integer.valueOf(vVar.f256070d), false);
        boolean z = vVar.f256072f;
        this.f278908k = z;
        if (z) {
            String str = vVar.f256071e;
            int i2 = vVar.f256073g;
            int i3 = ((vVar.f256067a & 64) == 0 || !m165281l(vVar.f256074h)) ? 0 : vVar.f256074h;
            if ((vVar.f256067a & 128) != 0) {
                i = vVar.f256075i;
            }
            mo91559h(str, i2, mo91558f(i3, i), mo91557e(i3, i));
        }
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        if (!this.f278902e.isDone()) {
            this.f278902e.mo57357o(new Exception("Unable to restore state!"));
        }
    }

    /* renamed from: j */
    public final void mo91561j(Bundle bundle) {
        if (!((Boolean) ((C99643a) this.f278898a).f278827e.f63720e).booleanValue() && bundle != null && !this.f63405W.mo28420E()) {
            ((C99643a) this.f278898a).f278827e.mo28730f(true, false);
            boolean e = this.f278901d.mo79746e(C90138q.f251845s);
            C99719a aVar = this.f278899b;
            C99643a aVar2 = (C99643a) this.f278898a;
            String str = (String) aVar2.f278829g.f63720e;
            str.getClass();
            new C90873ag(aVar.mo91576c(str, e, bundle, (Bundle) ((C58833ax) aVar2.f278823a.f63720e).mo56107c()), this.f278911n, "On updated content fetched.", new C99653d(this)).mo85223a(new C99654e(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo91562k(C22740k kVar, Bundle bundle) {
        Bundle bundle2 = kVar.f62565a;
        if (bundle2.containsKey("extra_remoteviews") && !this.f278908k) {
            ((C99643a) this.f278898a).f278828f.mo28730f(Boolean.valueOf(bundle.getBoolean("option_partial_update", false)), false);
            ((C99643a) this.f278898a).f278833k.mo28730f(C58833ax.m90834k((RemoteViews) bundle2.getParcelable("extra_remoteviews")), false);
        } else if (this.f278908k && bundle2.containsKey("extra_video_url") && bundle2.containsKey("extra_player_type")) {
            String string = bundle2.getString("extra_video_url");
            int i = bundle2.getInt("extra_player_type");
            int i2 = (!bundle2.containsKey("extra_player_horizontal_margin_dp") || !m165281l(bundle2.getInt("extra_player_horizontal_margin_dp"))) ? 0 : bundle2.getInt("extra_player_horizontal_margin_dp");
            int i3 = bundle2.containsKey("extra_player_width_dp") ? bundle2.getInt("extra_player_width_dp") : 0;
            mo91559h(string, i, mo91558f(i2, i3), mo91557e(i2, i3));
        }
        ((C99643a) this.f278898a).f278823a.mo28730f(C58833ax.m90834k(kVar.f62566b), false);
    }
}
