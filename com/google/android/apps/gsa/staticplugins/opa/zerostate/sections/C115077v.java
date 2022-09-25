package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89109c;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89110d;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.C90732ap;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.C114577b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114757k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114841ck;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114870dm;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114876h;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114877i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64283ab;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64306ay;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64311bc;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64319bk;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64321bm;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64330f;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.p4944a.C64281b;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5059c.C65429b;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.v */
/* compiled from: PG */
public final class C115077v implements C114757k {

    /* renamed from: f */
    private static final C59071e f319420f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.v");

    /* renamed from: a */
    public final C91097g f319421a;

    /* renamed from: b */
    public final C114841ck f319422b;

    /* renamed from: c */
    C89109c f319423c;

    /* renamed from: d */
    BroadcastReceiver f319424d;

    /* renamed from: e */
    public C114577b f319425e;

    /* renamed from: g */
    private final Context f319426g;

    /* renamed from: h */
    private final Activity f319427h;

    /* renamed from: i */
    private final C86124t f319428i;

    /* renamed from: j */
    private final C21370a f319429j;

    /* renamed from: k */
    private final C68214a f319430k;

    /* renamed from: l */
    private final C58833ax f319431l;

    /* renamed from: m */
    private final C68214a f319432m;

    /* renamed from: n */
    private final C89110d f319433n;

    /* renamed from: o */
    private final C58833ax f319434o;

    /* renamed from: p */
    private final LayoutInflater f319435p;

    /* renamed from: q */
    private final List f319436q = new ArrayList();

    /* renamed from: r */
    private C28293k f319437r;

    /* renamed from: s */
    private ViewGroup f319438s;

    /* renamed from: t */
    private C115080y f319439t;

    public C115077v(Context context, Activity activity, C86124t tVar, C21370a aVar, C68214a aVar2, C58833ax axVar, C68214a aVar3, C89110d dVar, C58833ax axVar2, C114841ck ckVar, C115080y yVar, C91097g gVar) {
        this.f319426g = context;
        this.f319435p = LayoutInflater.from(activity);
        this.f319427h = activity;
        this.f319428i = tVar;
        this.f319429j = aVar;
        this.f319430k = aVar2;
        this.f319431l = axVar;
        this.f319432m = aVar3;
        this.f319433n = dVar;
        this.f319434o = axVar2;
        this.f319439t = yVar;
        this.f319421a = gVar;
        this.f319422b = ckVar;
    }

    /* renamed from: k */
    private final View m190752k(ViewGroup viewGroup, String str, String str2) {
        View inflate = this.f319435p.inflate(R.layout.ambient_contextual_action_view, viewGroup, false);
        ((C91189au) this.f319430k.mo27525b()).mo85421i(str, (ImageView) inflate.findViewById(R.id.ambient_contextual_action_icon));
        ((TextView) inflate.findViewById(R.id.ambient_contextual_action_text)).setText(str2);
        viewGroup.addView(inflate);
        return inflate;
    }

    /* renamed from: l */
    private final void m190753l(ViewGroup viewGroup, String str, String str2, int i) {
        View findViewById = m190752k(viewGroup, str, str2).findViewById(R.id.ambient_contextual_action_icon_container);
        C28292j jVar = new C28292j(i);
        jVar.mo33795i(5);
        C28295m.m52919e(findViewById, jVar);
        this.f319436q.add(C28293k.m52908e(jVar, new C28293k[0]));
        C114876h.m190421b(this.f319426g, findViewById, str2, this.f319434o);
    }

    /* renamed from: m */
    private final void m190754m(ViewGroup viewGroup) {
        int i;
        Intent intent;
        C64330f fVar;
        int i2;
        AlarmManager.AlarmClockInfo nextAlarmClock;
        if (this.f319428i.mo79746e(C90014bt.f247169cA) && C114877i.m190422a(this.f319429j.mo26870b())) {
            String string = this.f319426g.getResources().getString(R.string.ambient_do_not_disturb);
            View k = m190752k(viewGroup, "https://www.gstatic.com/images/icons/material/system_gm/2x/do_not_disturb_on_white_36dp.png", string);
            View k2 = m190752k(viewGroup, "https://www.gstatic.com/images/icons/material/system_gm/2x/do_not_disturb_off_white_36dp.png", string);
            View findViewById = k.findViewById(R.id.ambient_contextual_action_icon_container);
            View findViewById2 = k2.findViewById(R.id.ambient_contextual_action_icon_container);
            C28292j jVar = new C28292j(75926);
            jVar.mo33795i(5);
            C28295m.m52919e(findViewById, jVar);
            C28295m.m52919e(findViewById2, jVar);
            this.f319436q.add(C28293k.m52908e(jVar, new C28293k[0]));
            findViewById.setOnClickListener(new C89943l(new C115073r(this)));
            findViewById2.setOnClickListener(new C89943l(new C115074s(this)));
            mo101839j(k, k2);
            this.f319424d = new C115076u(this, k, k2);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.app.action.INTERRUPTION_FILTER_CHANGED");
            this.f319426g.registerReceiver(this.f319424d, intentFilter);
        }
        long b = this.f319429j.mo26870b();
        if (C114877i.m190422a(b) && ((nextAlarmClock = ((AlarmManager) this.f319432m.mo27525b()).getNextAlarmClock()) == null || nextAlarmClock.getTriggerTime() - b >= TimeUnit.DAYS.toMillis(1))) {
            m190753l(viewGroup, "https://www.gstatic.com/images/icons/material/system_gm/2x/alarm_add_white_36dp.png", this.f319426g.getResources().getString(R.string.ambient_set_alarm), 76002);
        }
        if (this.f319439t.mo101792c().mo56113h()) {
            C58485gu guVar = ((C115024ca) this.f319439t.mo101792c().mo56107c()).f319281a;
            int size = guVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                C64311bc bcVar = (C64311bc) guVar.get(i3);
                int i4 = bcVar.f173883a;
                if ((i4 & 8) != 0) {
                    C64321bm bmVar = bcVar.f173885c;
                    if (bmVar == null) {
                        bmVar = C64321bm.f173901c;
                    }
                    Iterator it = bmVar.f173904b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            fVar = null;
                            break;
                        }
                        C64319bk bkVar = (C64319bk) it.next();
                        if (bkVar.f173899b) {
                            fVar = bkVar.f173898a;
                            if (fVar == null) {
                                fVar = C64330f.f173915f;
                            }
                        }
                    }
                    if (fVar != null) {
                        C64321bm bmVar2 = bcVar.f173885c;
                        if (bmVar2 == null) {
                            bmVar2 = C64321bm.f173901c;
                        }
                        String str = bmVar2.f173903a;
                        C64283ab abVar = fVar.f173919c;
                        if (abVar == null) {
                            abVar = C64283ab.f173811b;
                        }
                        View k3 = m190752k(viewGroup, abVar.f173813a, str);
                        C65429b bVar = bcVar.f173886d;
                        if (bVar == null) {
                            bVar = C65429b.f177864b;
                        }
                        if (bVar.f177866a.size() > 0) {
                            C65429b bVar2 = bcVar.f173886d;
                            if (bVar2 == null) {
                                bVar2 = C65429b.f177864b;
                            }
                            i2 = bVar2.f177866a.mo58914d(0);
                        } else {
                            i2 = 76003;
                        }
                        C28292j jVar2 = new C28292j(i2);
                        jVar2.mo33795i(5);
                        this.f319436q.add(C28293k.m52908e(jVar2, new C28293k[0]));
                        if ((fVar.f173917a & 8) != 0) {
                            m190755n(k3, new C115071p(this, fVar), jVar2);
                        }
                    }
                } else if ((i4 & 2) != 0) {
                    C64330f fVar2 = bcVar.f173884b;
                    if (fVar2 == null) {
                        fVar2 = C64330f.f173915f;
                    }
                    C64283ab abVar2 = fVar2.f173919c;
                    if (abVar2 == null) {
                        abVar2 = C64283ab.f173811b;
                    }
                    View k4 = m190752k(viewGroup, abVar2.f173813a, fVar2.f173918b);
                    C65429b bVar3 = bcVar.f173886d;
                    if (bVar3 == null) {
                        bVar3 = C65429b.f177864b;
                    }
                    if (bVar3.f177866a.size() > 0) {
                        C65429b bVar4 = bcVar.f173886d;
                        if (bVar4 == null) {
                            bVar4 = C65429b.f177864b;
                        }
                        i = bVar4.f177866a.mo58914d(0);
                    } else {
                        i = 76004;
                    }
                    C28292j jVar3 = new C28292j(i);
                    jVar3.mo33795i(5);
                    this.f319436q.add(C28293k.m52908e(jVar3, new C28293k[0]));
                    C64306ay ayVar = fVar2.f173921e;
                    if (ayVar == null) {
                        ayVar = C64306ay.f173871b;
                    }
                    C62971cq cqVar = ayVar.f173873a;
                    if (cqVar.isEmpty()) {
                        C59104x d = f319420f.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "AmbientShortcutSC");
                        ((C59052c) ((C59052c) d).mo56372aa(29468)).mo56386p("Unable to show smart device control. There's no available device.");
                    } else {
                        C114841ck ckVar = this.f319422b;
                        try {
                            ckVar.f318624e.getPackageInfo("com.google.android.apps.chromecast.app", 0);
                            intent = C87566i.m142325x(String.format("googlehome://controller/ha?device_id=%s", new Object[]{((C64281b) cqVar.get(0)).f173809a}));
                        } catch (PackageManager.NameNotFoundException unused) {
                            C90732ap apVar = ckVar.f318623d;
                            intent = C90732ap.m148195a(ckVar.f318621b, "com.google.android.apps.chromecast.app");
                        }
                        m190755n(k4, new C114870dm(this.f319427h, this.f319431l, new C115075t(this, intent), this.f319421a), jVar3);
                    }
                }
            }
        }
        if (C114877i.m190422a(this.f319429j.mo26870b())) {
            m190753l(viewGroup, "https://www.gstatic.com/images/icons/material/system_gm/2x/music_note_white_36dp.png", this.f319426g.getResources().getString(R.string.ambient_play_night_sounds), 76944);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f319427h.getSystemService(WindowManager.class)).getDefaultDisplay().getMetrics(displayMetrics);
        int i5 = displayMetrics.widthPixels;
        int dimensionPixelSize = this.f319427h.getResources().getDimensionPixelSize(R.dimen.ambient_zero_state_side_padding);
        int i6 = (i5 - (dimensionPixelSize + dimensionPixelSize)) / 4;
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            viewGroup.getChildAt(i7).getLayoutParams().width = i6;
        }
    }

    /* renamed from: n */
    private static void m190755n(View view, View.OnClickListener onClickListener, C28292j jVar) {
        View findViewById = view.findViewById(R.id.ambient_contextual_action_icon_container);
        C28295m.m52919e(findViewById, jVar);
        findViewById.setOnClickListener(new C89943l(onClickListener));
    }

    /* renamed from: a */
    public final View mo101577a() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f319438s == null) {
            ViewGroup viewGroup = (ViewGroup) this.f319435p.inflate(R.layout.ambient_shortcut_view, (ViewGroup) null);
            this.f319438s = viewGroup;
            m190754m(viewGroup);
            if (this.f319438s.getChildCount() > 0) {
                C28292j jVar = new C28292j(75848);
                ViewGroup viewGroup2 = this.f319438s;
                viewGroup2.getClass();
                C28295m.m52919e(viewGroup2, jVar);
                this.f319437r = C28293k.m52907d(jVar, this.f319436q);
            } else {
                this.f319438s.setVisibility(8);
            }
        }
        ViewGroup viewGroup3 = this.f319438s;
        viewGroup3.getClass();
        return viewGroup3;
    }

    /* renamed from: b */
    public final /* synthetic */ C114750d mo101578b(int i) {
        return null;
    }

    /* renamed from: c */
    public final C28293k mo101579c() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f319437r == null) {
            mo101577a();
        }
        return this.f319437r;
    }

    /* renamed from: d */
    public final void mo101580d() {
        C58976aa aaVar = C58975e.f156826a;
        BroadcastReceiver broadcastReceiver = this.f319424d;
        if (broadcastReceiver != null) {
            try {
                this.f319426g.unregisterReceiver(broadcastReceiver);
            } catch (Exception e) {
                C59104x d = f319420f.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AmbientShortcutSC");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(29465)).mo56386p("Exception when trying to unregister broadcastReceiver for DND switch.");
            }
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo101581e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo101582f() {
    }

    /* renamed from: g */
    public final void mo101583g(C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (axVar.mo56113h() && (axVar.mo56107c() instanceof C115024ca)) {
            C115079x a = this.f319439t.mo101791a();
            a.mo101790b((C115024ca) axVar.mo56107c());
            this.f319439t = a.mo101789a();
            ViewGroup viewGroup = this.f319438s;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                m190754m(this.f319438s);
            }
        }
    }

    /* renamed from: h */
    public final void mo101838h(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f319423c == null) {
            this.f319423c = this.f319433n.mo83088a("zen_mode", C63490p.DO_NOT_DISTURB.name());
        }
        this.f319423c.mo83087h(true != z ? "0" : "1");
    }

    /* renamed from: i */
    public final /* synthetic */ void mo101584i() {
    }

    /* renamed from: j */
    public final void mo101839j(View view, View view2) {
        boolean H = C90772bp.m148281H(this.f319426g);
        int i = 8;
        view.setVisibility(true != H ? 8 : 0);
        if (true != H) {
            i = 0;
        }
        view2.setVisibility(i);
    }
}
