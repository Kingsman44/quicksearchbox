package com.google.android.apps.gsa.smartspace;

import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4580v.C60950i;

/* renamed from: com.google.android.apps.gsa.smartspace.g */
/* compiled from: PG */
public final class C92111g {

    /* renamed from: a */
    public final C92122r f256815a;

    /* renamed from: b */
    public final C86124t f256816b;

    /* renamed from: c */
    public final u f256817c;

    /* renamed from: d */
    private final C60950i f256818d;

    /* renamed from: e */
    private final C84469a f256819e;

    public C92111g(C92122r rVar, C60950i iVar, C86124t tVar, C84469a aVar, u uVar) {
        this.f256815a = rVar;
        this.f256818d = iVar;
        this.f256816b = tVar;
        this.f256819e = aVar;
        this.f256817c = uVar;
    }

    /* renamed from: a */
    public static String m151146a(C50794cr crVar) {
        C50794cr crVar2 = C50794cr.UNDEFINED;
        switch (crVar.ordinal()) {
            case 1:
                return "Weather";
            case 2:
                return "Calendar";
            case 3:
                return "Commute";
            case 4:
                return "Flight";
            case 5:
                return "Birthday";
            case 7:
                return "Tips";
            case 8:
                return "Reminder";
            case 10:
                return "Alarm";
            case 12:
                return "OOBE";
            case 13:
                return "Sports live score";
            case 14:
                return "Weather alert";
            case 15:
                return "LocationOOBE";
            case 16:
                return "Stock price change";
            case 19:
                return "Media";
            case 20:
                return "Stock earnings call";
            case 22:
                return "Gas station payment";
            case 23:
                return "Transit station info";
            case 24:
                return "Time-to-leave";
            case 28:
                return "Restaurant";
            case 29:
                return "At Store";
            case 30:
                return "Holiday Alarms";
            case 31:
                return "Media Head-up";
            case 33:
                return "Grocery delivery";
            case 34:
                return "Grocery pickup";
            case 35:
                return "Air Quality";
            case 36:
                return "Flight landing";
            case 37:
                return "Hotel check in";
            case 38:
                return "Hotel check out";
            case 41:
                return "Shopping mall";
            default:
                return "Enum value ".concat(String.valueOf(crVar.name()));
        }
    }

    /* renamed from: e */
    public static boolean m151147e(C50794cr crVar) {
        C50794cr crVar2 = C50794cr.UNDEFINED;
        switch (crVar.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 41:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final boolean mo86741b(C50818do doVar) {
        long epochMilli = this.f256818d.mo57444a().toEpochMilli();
        long j = -1;
        if (!(doVar == null || (doVar.f132304a & 32768) == 0)) {
            C50796ct ctVar = doVar.f132320q;
            if (ctVar == null) {
                ctVar = C50796ct.f132223c;
            }
            if ((ctVar.f132225a & 1) != 0) {
                C50796ct ctVar2 = doVar.f132320q;
                if (ctVar2 == null) {
                    ctVar2 = C50796ct.f132223c;
                }
                j = ctVar2.f132226b;
            }
        }
        if (j < epochMilli) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo86742c(C50794cr crVar) {
        C50794cr crVar2 = C50794cr.UNDEFINED;
        switch (crVar.ordinal()) {
            case 1:
                if (this.f256816b.mo79746e(C89985ax.f246674aA)) {
                    return this.f256815a.f256848d.mo86765u();
                }
                return this.f256815a.f256848d.mo86755k();
            case 2:
            case 39:
                return this.f256815a.f256848d.mo86752h();
            case 3:
                C92122r rVar = this.f256815a;
                return rVar.f256848d.mo86755k() && rVar.f256846b.mo79746e(C90017bw.f247969be) && rVar.f256846b.mo79746e(C90017bw.f247882X);
            case 4:
                return this.f256815a.f256848d.mo86756l();
            case 5:
                return this.f256815a.f256848d.mo86750f();
            case 7:
                return this.f256815a.f256848d.mo86755k();
            case 8:
                return this.f256815a.f256848d.mo86758n();
            case 10:
                return this.f256815a.mo86771k();
            case 11:
            case 32:
                return true;
            case 12:
                C92122r rVar2 = this.f256815a;
                return rVar2.f256848d.mo86755k() && rVar2.f256846b.mo79746e(C90017bw.f247899aN);
            case 13:
                return this.f256815a.f256848d.mo86759o();
            case 14:
                return this.f256815a.f256848d.mo86763s();
            case 15:
                return this.f256815a.f256846b.mo79746e(C90017bw.f247903aR);
            case 16:
                return this.f256815a.f256848d.mo86762r();
            case 17:
            case 26:
                C92122r rVar3 = this.f256815a;
                return rVar3.f256848d.mo86755k() && rVar3.f256846b.mo79746e(C90017bw.f247969be);
            case 18:
            case 27:
                C92122r rVar4 = this.f256815a;
                return rVar4.f256848d.mo86755k() && rVar4.f256846b.mo79746e(C90017bw.f247969be);
            case 20:
                C92119o oVar = this.f256815a.f256848d;
                return oVar.mo86755k() && oVar.f256837b.mo64691c(C90014bt.f247649lD) && oVar.f256836a.getBoolean("smartspace_stock_price_change_enabled", true);
            case 22:
                C92122r rVar5 = this.f256815a;
                return rVar5.f256848d.mo86755k() && rVar5.f256846b.mo79746e(C90017bw.f247969be);
            case 23:
                C92122r rVar6 = this.f256815a;
                return rVar6.f256848d.mo86755k() && rVar6.f256846b.mo79746e(C90017bw.f247969be);
            case 24:
                C92122r rVar7 = this.f256815a;
                return rVar7.f256848d.mo86755k() && rVar7.f256846b.mo79746e(C90017bw.f247969be) && rVar7.f256846b.mo79746e(C90017bw.f247883Y) && rVar7.f256848d.mo86754j();
            case 25:
                C92122r rVar8 = this.f256815a;
                return rVar8.f256848d.mo86755k() && rVar8.f256846b.mo79746e(C90017bw.f247969be);
            case 28:
                C92122r rVar9 = this.f256815a;
                return rVar9.f256848d.mo86755k() && rVar9.f256846b.mo79746e(C90017bw.f247969be);
            case 29:
                C92122r rVar10 = this.f256815a;
                return rVar10.f256848d.mo86755k() && rVar10.f256846b.mo79746e(C90017bw.f247969be);
            case 30:
                return this.f256815a.mo86772l();
            case 33:
            case 34:
                return this.f256815a.f256848d.mo86755k() && this.f256816b.mo79746e(C90017bw.f247969be) && this.f256819e.mo78046t();
            case 35:
                C92122r rVar11 = this.f256815a;
                return rVar11.f256848d.mo86755k() && rVar11.f256846b.mo79746e(C89985ax.f246741x);
            case 36:
                return this.f256815a.f256848d.mo86755k() && this.f256816b.mo79746e(C90017bw.f247969be) && this.f256819e.mo78044r();
            case 37:
            case 38:
                return this.f256815a.f256848d.mo86755k() && this.f256816b.mo79746e(C90017bw.f247969be) && this.f256819e.mo78047u();
            default:
                return false;
        }
    }

    /* renamed from: d */
    public final boolean mo86743d(C50818do doVar) {
        if (doVar.f132305b) {
            return true;
        }
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        if (!m151147e(a)) {
            return false;
        }
        C50794cr a2 = C50794cr.m85938a(doVar.f132315l);
        if (a2 == null) {
            a2 = C50794cr.UNDEFINED;
        }
        return mo86742c(a2);
    }

    /* renamed from: f */
    public final boolean mo86744f(C50794cr crVar) {
        return crVar == C50794cr.CALENDAR || (crVar == C50794cr.REMINDER && this.f256816b.mo79746e(C89985ax.f246713au));
    }
}
