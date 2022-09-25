package com.google.android.apps.gsa.staticplugins.p7816dl.p7818b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90138q;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91814u;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91815v;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91817x;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99680e;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7819c.C99683h;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7821e.p7822a.C99719a;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1859d.p1860a.C22740k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62921ba;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.b.x */
/* compiled from: PG */
public final class C99673x extends C23056g implements C99680e {

    /* renamed from: a */
    public final C99672w f278935a = new C99672w(this);

    /* renamed from: b */
    public final Context f278936b;

    /* renamed from: c */
    public final C99683h f278937c;

    /* renamed from: d */
    public final C22871g f278938d;

    /* renamed from: e */
    public final C21370a f278939e;

    /* renamed from: f */
    public boolean f278940f;

    /* renamed from: g */
    public boolean f278941g;

    /* renamed from: h */
    public long f278942h;

    /* renamed from: i */
    public Intent f278943i;

    /* renamed from: j */
    public boolean f278944j;

    /* renamed from: k */
    private final C99719a f278945k;

    /* renamed from: l */
    private final C86124t f278946l;

    public C99673x(Context context, C23052c cVar, C99683h hVar, C99719a aVar, C22871g gVar, C21370a aVar2, C86124t tVar) {
        super(cVar);
        this.f278936b = context;
        this.f278937c = hVar;
        this.f278945k = aVar;
        this.f278938d = gVar;
        this.f278939e = aVar2;
        this.f278946l = tVar;
    }

    /* renamed from: e */
    public final void mo91565e(Intent intent) {
        int intExtra = intent.getIntExtra("extra_content_index", -1);
        C58976aa aaVar = C58975e.f156826a;
        if (this.f278940f && intExtra >= 0 && intExtra < ((C99651b) this.f278937c).f278878e.f63603b.size()) {
            ((C99651b) this.f278937c).f278878e.mo28650d(intExtra, new C99661l(intent));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo91566f(C58485gu guVar) {
        C58976aa aaVar = C58975e.f156826a;
        guVar.size();
        ((C99651b) this.f278937c).f278874a.mo28730f(Boolean.valueOf(guVar.isEmpty()), false);
        ((C99651b) this.f278937c).f278878e.mo28652f();
        int size = guVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C22740k kVar = (C22740k) guVar.get(i2);
            if (i >= 10) {
                break;
            }
            C99651b bVar = (C99651b) this.f278937c;
            String str = (String) bVar.f278877d.f63720e;
            int intValue = ((Integer) bVar.f278879f.f63720e).intValue();
            C91814u uVar = (C91814u) C91815v.f256065j.createBuilder();
            Bundle bundle = kVar.f62565a;
            boolean z = ((Boolean) ((C99651b) this.f278937c).f278876c.f63720e).booleanValue() && bundle.containsKey("extra_video_url") && bundle.containsKey("extra_player_type");
            if (z) {
                String string = bundle.getString("extra_video_url");
                uVar.copyOnWrite();
                C91815v vVar = (C91815v) uVar.instance;
                string.getClass();
                vVar.f256067a |= 8;
                vVar.f256071e = string;
                int i3 = bundle.getInt("extra_player_type");
                uVar.copyOnWrite();
                C91815v vVar2 = (C91815v) uVar.instance;
                vVar2.f256067a |= 32;
                vVar2.f256073g = i3;
                if (bundle.containsKey("extra_player_horizontal_margin_dp")) {
                    int i4 = bundle.getInt("extra_player_horizontal_margin_dp");
                    uVar.copyOnWrite();
                    C91815v vVar3 = (C91815v) uVar.instance;
                    vVar3.f256067a |= 64;
                    vVar3.f256074h = i4;
                }
                if (bundle.containsKey("extra_player_width_dp")) {
                    int i5 = bundle.getInt("extra_player_width_dp");
                    uVar.copyOnWrite();
                    C91815v vVar4 = (C91815v) uVar.instance;
                    vVar4.f256067a |= 128;
                    vVar4.f256075i = i5;
                }
            } else if (!bundle.containsKey("extra_remoteviews")) {
            }
            uVar.copyOnWrite();
            C91815v vVar5 = (C91815v) uVar.instance;
            str.getClass();
            vVar5.f256067a |= 2;
            vVar5.f256069c = str;
            uVar.copyOnWrite();
            C91815v vVar6 = (C91815v) uVar.instance;
            vVar6.f256067a |= 16;
            vVar6.f256072f = z;
            uVar.copyOnWrite();
            C91815v vVar7 = (C91815v) uVar.instance;
            vVar7.f256067a = 1 | vVar7.f256067a;
            vVar7.f256068b = i;
            uVar.copyOnWrite();
            C91815v vVar8 = (C91815v) uVar.instance;
            vVar8.f256067a |= 4;
            vVar8.f256070d = intValue;
            ((C99651b) this.f278937c).f278878e.mo28647a("TYPE_POMO_TAB_CONTENT_HOST", C23245b.m43556a((C91815v) uVar.build()));
            ((C99651b) this.f278937c).f278878e.mo28650d(((C99651b) this.f278937c).f278878e.f63603b.size() - 1, new C99667r(kVar));
            i++;
        }
        ((C99651b) this.f278937c).f278875b.mo28730f(false, false);
        this.f278940f = true;
    }

    /* renamed from: h */
    public final void mo91567h() {
        this.f278942h = this.f278939e.mo26871c();
        boolean e = this.f278946l.mo79746e(C90138q.f251846t);
        ((C99651b) this.f278937c).f278876c.mo28730f(Boolean.valueOf(e), false);
        boolean e2 = this.f278946l.mo79746e(C90138q.f251845s);
        new C90873ag(this.f278945k.mo91575b((String) ((C99651b) this.f278937c).f278877d.f63720e, e, e2), this.f278938d, "On contents fetched.", new C99663n(this)).mo85223a(new C99664o(this));
    }

    /* renamed from: i */
    public final void mo91568i() {
        this.f278938d.mo28212l("Register ContentUpdateBroadcastReceiver", new C99657h(this));
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
        ArrayList arrayList = new ArrayList(((C99651b) this.f278937c).f278878e.f63603b.size());
        ((C99651b) this.f278937c).f278878e.mo28651e(new C99669t(arrayList));
        new C90873ag(C60856cj.m92894c(arrayList).mo57336c(C99670u.f278930a, C60826bg.f164896a), this.f278938d, "On all PomoContentHost restored.", new C99658i(this)).mo85223a(new C99659j(this));
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C91817x xVar = (C91817x) C23245b.m43557b(protoParcelable, C91817x.f256076d.getParserForType(), C62921ba.m95368a(), true);
        if (xVar == null) {
            xVar = C91817x.f256076d;
        }
        ((C99651b) this.f278937c).f278877d.mo28730f(xVar.f256079b, false);
        ((C99651b) this.f278937c).f278879f.mo28730f(Integer.valueOf(xVar.f256080c), false);
        mo91567h();
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        if (this.f278946l.mo79746e(C90138q.f251829c) && !this.f278946l.mo79746e(C90138q.f251835i)) {
            throw new RuntimeException("Kill and restart to disable partner tab");
        }
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        this.f278938d.mo28212l("Unregister ContentUpdateBroadcastReceiver", new C99662m(this));
    }
}
