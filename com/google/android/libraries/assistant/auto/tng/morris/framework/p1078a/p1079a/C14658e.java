package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.view.Display;
import android.view.DisplayCutout;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14726b;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14985g;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14113an;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14297e;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14488lb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14500ln;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14649e;
import com.google.android.libraries.assistant.auto.tng.p1098n.p1099a.C15460a;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.common.p4526f.C59071e;
import p001a.p007b.p011b.p012a.C0025a;
import p001a.p007b.p011b.p012a.C0027c;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e */
/* compiled from: PG */
public final class C14658e implements C14726b, C14985g {

    /* renamed from: a */
    public static final C59071e f44266a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.a.a.e");

    /* renamed from: b */
    public final Context f44267b;

    /* renamed from: c */
    public final C14647d f44268c;

    /* renamed from: d */
    public final C69464a f44269d;

    /* renamed from: e */
    public final C14113an f44270e;

    /* renamed from: f */
    public final C14115ap f44271f;

    /* renamed from: g */
    public final C15460a f44272g;

    /* renamed from: h */
    public C0027c f44273h = C0027c.OFF;

    /* renamed from: i */
    public C14500ln f44274i = C14500ln.NAVIGATION_OFF;

    /* renamed from: j */
    public String f44275j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public C51474ja f44276k = C51474ja.UNKNOWN;

    /* renamed from: l */
    public C14488lb f44277l = C14488lb.LEVEL_UNKNOWN;

    /* renamed from: m */
    public BroadcastReceiver f44278m;

    /* renamed from: n */
    public int f44279n;

    /* renamed from: o */
    public int f44280o = 2;

    /* renamed from: p */
    private final C86124t f44281p;

    public C14658e(Context context, C14647d dVar, C69464a aVar, C14113an anVar, C14115ap apVar, C15460a aVar2, C86124t tVar) {
        this.f44267b = context;
        this.f44268c = dVar;
        this.f44269d = aVar;
        this.f44279n = context.getResources().getConfiguration().orientation;
        this.f44270e = anVar;
        this.f44271f = apVar;
        this.f44272g = aVar2;
        this.f44281p = tVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final void mo21504d() {
        this.f44277l = C14488lb.LEVEL_UNKNOWN;
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final void mo21625f(C14297e eVar) {
        C0027c cVar = this.f44273h;
        eVar.copyOnWrite();
        C14324f fVar = C14324f.f43330f;
        ((C14324f) eVar.instance).f43332a = cVar.getNumber();
        int i = this.f44280o;
        eVar.copyOnWrite();
        ((C14324f) eVar.instance).f43333b = C0025a.m7b(i);
        String str = this.f44275j;
        eVar.copyOnWrite();
        str.getClass();
        ((C14324f) eVar.instance).f43334c = str;
        C14488lb lbVar = this.f44277l;
        eVar.copyOnWrite();
        ((C14324f) eVar.instance).f43335d = lbVar.getNumber();
        C14500ln lnVar = this.f44274i;
        eVar.copyOnWrite();
        ((C14324f) eVar.instance).f43336e = lnVar.getNumber();
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final void mo21626h() {
        this.f44273h = C0027c.MICRO;
        this.f44280o = 2;
    }

    /* renamed from: i */
    public final void mo21627i() {
        this.f44273h = C0027c.MINI;
        this.f44280o = 2;
    }

    /* renamed from: j */
    public final void mo21628j() {
        this.f44273h = C0027c.OFF;
        this.f44280o = 2;
    }

    /* renamed from: k */
    public final void mo21629k() {
        BroadcastReceiver broadcastReceiver = this.f44278m;
        if (broadcastReceiver != null) {
            this.f44267b.unregisterReceiver(broadcastReceiver);
            this.f44278m = null;
        }
    }

    /* renamed from: l */
    public final boolean mo21630l() {
        if (this.f44280o == 2) {
            return false;
        }
        this.f44280o = 2;
        return true;
    }

    /* renamed from: m */
    public final boolean mo21631m() {
        DisplayCutout cutout;
        Display defaultDisplay = C14649e.m30711b(this.f44267b).getDefaultDisplay();
        if (!this.f44268c.mo21594D() || !this.f44281p.mo79746e(C90051dc.f248914k) || defaultDisplay.getRotation() != 2 || (cutout = defaultDisplay.getCutout()) == null || cutout.getBoundingRects().isEmpty() || cutout.getSafeInsetBottom() <= 0) {
            return false;
        }
        return true;
    }
}
