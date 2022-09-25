package com.google.android.apps.gsa.opa.smartspace;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50792cp;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50795cs;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3994s.p3995a.C53119cb;
import com.google.assistant.p3994s.p3995a.C53121cd;
import com.google.assistant.p3994s.p3995a.C53122ce;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.j */
/* compiled from: PG */
public final class C83794j {

    /* renamed from: a */
    public static final C59071e f228388a = C59071e.m91332i("com.google.android.apps.gsa.opa.smartspace.j");

    /* renamed from: b */
    public static final C58528ij f228389b = C58528ij.m90011K(C53121cd.WEATHER, C53121cd.FLIGHT_STATUS);

    /* renamed from: c */
    public static final C58528ij f228390c = C58528ij.m90015O(C50794cr.TIPS, C50794cr.CALENDAR, C50794cr.ASSISTANT, C50794cr.BIRTHDAY, C50794cr.WEATHER_ALERT, C50794cr.REMINDER, C50794cr.ALARM, C50794cr.COMMUTE_TIME, C50794cr.HAMMERSPACE_DEBUG, C50794cr.OOBE, C50794cr.LOCATION_OOBE, C50794cr.SHOPPING_LIST, C50794cr.LOYALTY_CARD);

    /* renamed from: d */
    public static final C58528ij f228391d = C58528ij.m90015O(C50794cr.WEATHER, C50794cr.TIPS, C50794cr.OOBE, C50794cr.WEATHER_ALERT, C50794cr.SPORTS, C50794cr.STOCK_PRICE_CHANGE, new C50794cr[0]);

    /* renamed from: h */
    private static final ComponentName f228392h = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.smartspace.widget.SmartspaceWidgetProvider");

    /* renamed from: i */
    private static final long f228393i = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: e */
    public final C86124t f228394e;

    /* renamed from: f */
    public final C83793i f228395f;

    /* renamed from: g */
    public final Context f228396g;

    /* renamed from: j */
    private final bm f228397j;

    /* renamed from: k */
    private final C21370a f228398k;

    /* renamed from: l */
    private final C84469a f228399l;

    /* renamed from: m */
    private final C91123v f228400m;

    public C83794j(C83793i iVar, C86124t tVar, bm bmVar, C21370a aVar, Context context, C91123v vVar, C84469a aVar2) {
        this.f228395f = iVar;
        this.f228394e = tVar;
        this.f228397j = bmVar;
        this.f228398k = aVar;
        this.f228396g = context;
        this.f228400m = vVar;
        this.f228399l = aVar2;
    }

    /* renamed from: E */
    public static boolean m133428E(C85664bo boVar) {
        return boVar.mo79190b(new C85662bm[]{C85662bm.WEB_HISTORY}).mo79181g(C85662bm.WEB_HISTORY);
    }

    /* renamed from: J */
    public static boolean m133429J(Context context, C91123v vVar) {
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        return instance != null && !vVar.mo85390b() && instance.getAppWidgetIds(f228392h).length > 0;
    }

    /* renamed from: e */
    public static C50794cr m133430e(C53121cd cdVar) {
        C53121cd cdVar2 = C53121cd.UNKNOWN;
        int ordinal = cdVar.ordinal();
        if (ordinal == 3) {
            return C50794cr.WEATHER;
        }
        if (ordinal == 4) {
            return C50794cr.FLIGHT;
        }
        if (ordinal != 6) {
            return C50794cr.UNDEFINED;
        }
        return C50794cr.BIRTHDAY;
    }

    /* renamed from: g */
    public static C58833ax m133431g(C87696ae aeVar) {
        C53119cb cbVar = (C53119cb) C53122ce.f139215b.createBuilder();
        cbVar.mo53961a(C53121cd.WEATHER);
        C53122ce ceVar = (C53122ce) cbVar.build();
        C53271hs hsVar = aeVar.f237136c;
        if (hsVar == null) {
            hsVar = C53271hs.f139650u;
        }
        return hsVar.f139666o.equals(ceVar.toByteString()) ? C58833ax.m90834k(C39226b.TAG_CLASSIC_ASSISTANT_SMARTSPACE_WEATHER_LO) : C58836b.f156633a;
    }

    /* renamed from: r */
    public static boolean m133432r(C85664bo boVar) {
        return boVar.mo79190b(new C85662bm[]{C85662bm.LOCATION_HISTORY_AND_REPORTING}).mo79181g(C85662bm.LOCATION_HISTORY_AND_REPORTING);
    }

    /* renamed from: A */
    public final boolean mo77157A() {
        return this.f228394e.mo79746e(C89985ax.f246738u);
    }

    /* renamed from: B */
    public final boolean mo77158B() {
        return mo77163H() || mo77187z() || mo77181t();
    }

    /* renamed from: C */
    public final boolean mo77159C() {
        return this.f228394e.mo79746e(C89985ax.f246648B);
    }

    /* renamed from: D */
    public final boolean mo77160D() {
        return this.f228394e.mo79746e(C89985ax.f246649C);
    }

    /* renamed from: F */
    public final boolean mo77161F() {
        if (!this.f228394e.mo79746e(C89985ax.f246739v)) {
            return this.f228394e.mo79746e(C89985ax.f246655I);
        }
        if (this.f228394e.mo79746e(C89985ax.f246655I) || this.f228399l.mo78048v() || this.f228399l.mo78040n()) {
            return true;
        }
        if (!this.f228399l.mo78038l() || !this.f228399l.mo78044r()) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public final boolean mo77162G() {
        return this.f228394e.mo79746e(C90017bw.f247970bf);
    }

    /* renamed from: H */
    public final boolean mo77163H() {
        return m133429J(this.f228396g, this.f228400m);
    }

    /* renamed from: I */
    public final boolean mo77164I() {
        return this.f228394e.mo79746e(C90014bt.f247647lB);
    }

    /* renamed from: a */
    public final long mo77165a() {
        return this.f228394e.mo79743a(C89985ax.f246673a);
    }

    /* renamed from: b */
    public final long mo77166b() {
        return this.f228394e.mo79743a(C89985ax.f246719b);
    }

    /* renamed from: c */
    public final long mo77167c() {
        return this.f228394e.mo79743a(C89985ax.f246671Y);
    }

    /* renamed from: d */
    public final long mo77168d() {
        return this.f228394e.mo79743a(C89985ax.f246672Z);
    }

    /* renamed from: f */
    public final C50818do mo77169f() {
        C50790cn cnVar = (C50790cn) C50818do.f132293H.createBuilder();
        cnVar.copyOnWrite();
        C50818do doVar = (C50818do) cnVar.instance;
        doVar.f132304a |= 1;
        doVar.f132305b = true;
        C50792cp cpVar = C50792cp.PRIMARY;
        cnVar.copyOnWrite();
        C50818do doVar2 = (C50818do) cnVar.instance;
        doVar2.f132306c = cpVar.f132174e;
        doVar2.f132304a |= 2;
        C50795cs csVar = (C50795cs) C50796ct.f132223c.createBuilder();
        long b = this.f228398k.mo26870b();
        long j = f228393i;
        csVar.copyOnWrite();
        C50796ct ctVar = (C50796ct) csVar.instance;
        ctVar.f132225a = 1 | ctVar.f132225a;
        ctVar.f132226b = b + j;
        cnVar.copyOnWrite();
        C50818do doVar3 = (C50818do) cnVar.instance;
        C50796ct ctVar2 = (C50796ct) csVar.build();
        ctVar2.getClass();
        doVar3.f132320q = ctVar2;
        doVar3.f132304a |= 32768;
        return (C50818do) cnVar.build();
    }

    /* renamed from: h */
    public final String mo77170h() {
        return mo77187z() ? "Pixel" : Build.MODEL;
    }

    /* renamed from: i */
    public final boolean mo77171i() {
        return this.f228394e.mo79746e(C89985ax.f246727j);
    }

    /* renamed from: j */
    public final boolean mo77172j() {
        return this.f228394e.mo79746e(C90017bw.f247861C);
    }

    /* renamed from: k */
    public final boolean mo77173k() {
        return this.f228397j.u() && this.f228397j.w();
    }

    /* renamed from: l */
    public final boolean mo77174l() {
        return this.f228394e.mo79746e(C89985ax.f246737t);
    }

    /* renamed from: m */
    public final boolean mo77175m() {
        if (mo77187z() && Build.VERSION.SDK_INT >= 31) {
            try {
                if (this.f228396g.getPackageManager().getPackageInfo("com.google.android.as", 0).getLongVersionCode() > 6488361) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                C59104x d = f228388a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OpaSsSharedUtils");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(6843)).mo56386p("Error obtaining package info");
            }
        }
        if (this.f228394e.mo79746e(C90017bw.f247969be)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo77176n() {
        return this.f228394e.mo79746e(C89985ax.f246728k);
    }

    /* renamed from: o */
    public final boolean mo77177o() {
        return this.f228394e.mo79746e(C89985ax.f246729l);
    }

    /* renamed from: p */
    public final boolean mo77178p() {
        return this.f228394e.mo79746e(C90014bt.f247565jZ);
    }

    /* renamed from: q */
    public final boolean mo77179q() {
        return this.f228394e.mo79746e(C90017bw.f247917af);
    }

    /* renamed from: s */
    public final boolean mo77180s() {
        return this.f228394e.mo79746e(C90014bt.f247795nr);
    }

    /* renamed from: t */
    public final boolean mo77181t() {
        return this.f228396g.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.SMARTSPACE_DEVICE_FEATURE");
    }

    /* renamed from: u */
    public final boolean mo77182u() {
        return this.f228394e.mo79746e(C90014bt.f247654lI);
    }

    /* renamed from: v */
    public final boolean mo77183v() {
        return this.f228394e.mo79746e(C90014bt.f247663lR);
    }

    /* renamed from: w */
    public final boolean mo77184w() {
        return this.f228394e.mo79746e(C90014bt.f247308eh);
    }

    /* renamed from: x */
    public final boolean mo77185x() {
        return this.f228394e.mo79746e(C90014bt.f247309ei);
    }

    /* renamed from: y */
    public final boolean mo77186y() {
        return this.f228394e.mo79746e(C90014bt.f247310ej);
    }

    /* renamed from: z */
    public final boolean mo77187z() {
        String str = Build.MODEL;
        return str.startsWith("Pixel") || this.f228396g.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_2017_EXPERIENCE") || this.f228394e.mo79745c(C90014bt.f247552jM).contains(str);
    }
}
