package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60459qv;
import com.google.common.p4552o.C60460qw;
import com.google.common.p4552o.C60462qy;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a */
/* compiled from: PG */
public final class C117050a implements C118549h {

    /* renamed from: a */
    private final Context f324989a;

    /* renamed from: b */
    private final C68214a f324990b;

    /* renamed from: c */
    private final C89257aa f324991c;

    /* renamed from: d */
    private final C117233ba f324992d;

    /* renamed from: e */
    private final C117251bs f324993e;

    public C117050a(Context context, C68214a aVar, C89257aa aaVar, C117233ba baVar, C117251bs bsVar) {
        this.f324989a = context;
        this.f324990b = aVar;
        this.f324991c = aaVar;
        this.f324992d = baVar;
        this.f324993e = bsVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        int[] t = this.f324991c.mo83227t();
        AppWidgetManager instance = AppWidgetManager.getInstance(this.f324989a);
        if (instance != null) {
            C117233ba.m194822e(C117233ba.m194821a(instance, t), (SharedPreferences) this.f324990b.mo27525b());
        }
        C86337q b = ((C86338r) this.f324990b.mo27525b()).mo80076b();
        int length = t.length;
        b.mo80067b("search_widget_present", length > 0);
        b.apply();
        C117233ba baVar = this.f324992d;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 462;
        C60459qv qvVar = (C60459qv) C60460qw.f163615i.createBuilder();
        C60462qy qyVar = C60462qy.WIDGET_STATE;
        qvVar.copyOnWrite();
        C60460qw qwVar = (C60460qw) qvVar.instance;
        qwVar.f163619c = qyVar.f163634h;
        qwVar.f163617a |= 2;
        String g = C58837ba.m90858g(baVar.f325425b.mo83214b());
        qvVar.copyOnWrite();
        C60460qw qwVar2 = (C60460qw) qvVar.instance;
        qwVar2.f163617a |= 4;
        qwVar2.f163620d = g;
        qvVar.copyOnWrite();
        C60460qw qwVar3 = (C60460qw) qvVar.instance;
        qwVar3.f163617a |= 128;
        qwVar3.f163624h = length;
        new C90873ag(baVar.f325431h.mo46042d(), baVar.f325429f, "Search Widget Disabled Timestamps PDS read.", new C117207av(qvVar, tzVar)).mo85223a(new C117208aw(tzVar, qvVar));
        if (length > 0 && instance != null) {
            this.f324993e.mo78806d();
        }
        return C118826c.f331423b;
    }
}
