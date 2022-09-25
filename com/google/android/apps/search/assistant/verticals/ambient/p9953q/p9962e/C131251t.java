package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.gsa.h.c.a;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9954a.C131179d;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3886c.C50788cl;
import com.google.assistant.p3886c.C50789cm;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.t */
/* compiled from: PG */
public final class C131251t {

    /* renamed from: a */
    public static final Duration f358895a = Duration.ofMinutes(1);

    /* renamed from: b */
    public final Context f358896b;

    /* renamed from: c */
    public final C60950i f358897c;

    /* renamed from: d */
    public final C58974d f358898d;

    /* renamed from: e */
    public final C131244m f358899e;

    /* renamed from: f */
    private final boolean f358900f;

    /* renamed from: g */
    private final C60887da f358901g;

    public C131251t(Context context, C60950i iVar, boolean z, C131244m mVar, C130603a aVar, C60887da daVar) {
        this.f358896b = context;
        this.f358897c = iVar;
        this.f358900f = z;
        this.f358899e = mVar;
        this.f358898d = aVar.mo109740b(this);
        this.f358901g = daVar;
    }

    /* renamed from: a */
    public static int m213740a(String str) {
        int hashCode = Objects.hashCode(str);
        int i = hashCode % 8192;
        if (i == 0) {
            i = 0;
        } else if ((((hashCode ^ 8192) >> 31) | 1) <= 0) {
            i += 8192;
        }
        return Math.abs(i);
    }

    /* renamed from: b */
    public static Intent m213741b(boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://assistant.google.com/reminders/mainview"));
        intent.putExtra("full_screen", true);
        intent.putExtra("hide_status_bar", true);
        intent.putExtra("screen_orientation", true);
        intent.putExtra("com.google.android.apps.gsa.staticplugins.opa.smartspace.extra.REMINDER_HUB_INTENT_EXTRA", true);
        intent.addFlags(268435457);
        Intent a = a.a(intent, (String) null, C50794cr.REMINDER, C50731p.START_ACTIVITY);
        if (z) {
            a.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", true);
        }
        return a;
    }

    /* renamed from: f */
    public static Instant m213742f(C50818do doVar) {
        Instant ofEpochMilli = Instant.ofEpochMilli(doVar.f132318o);
        Instant ofEpochMilli2 = Instant.ofEpochMilli(doVar.f132317n);
        C50794cr crVar = C50794cr.UNDEFINED;
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        int ordinal = a.ordinal();
        if (ordinal == 2) {
            return ofEpochMilli.minus(Duration.ofSeconds(C131179d.f358772h));
        }
        if (ordinal == 4) {
            return ofEpochMilli.minus(Duration.ofMillis(C131179d.f358766b));
        }
        if (ordinal == 8) {
            return ofEpochMilli.minus(Duration.ofSeconds(C131179d.f358774j));
        }
        switch (ordinal) {
            case 36:
            case 37:
            case 38:
                return ofEpochMilli;
            default:
                return ofEpochMilli2;
        }
    }

    /* renamed from: k */
    public static boolean m213743k(C50818do doVar) {
        C50794cr crVar = C50794cr.UNDEFINED;
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        int ordinal = a.ordinal();
        return ordinal == 2 || ordinal == 4 || ordinal == 8 || ordinal == 36;
    }

    /* renamed from: m */
    public static void m213744m(C50818do doVar) {
        int[] iArr = C131250s.f358894a;
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        int i = iArr[a.ordinal()];
    }

    /* renamed from: c */
    public final C60870cx mo110129c(C50794cr crVar) {
        C50794cr crVar2 = C50794cr.UNDEFINED;
        int ordinal = crVar.ordinal();
        if (ordinal == 2) {
            return mo110130d(R.drawable.quantum_gm_ic_event_white_24);
        }
        if (ordinal == 3) {
            return mo110130d(R.drawable.quantum_gm_ic_directions_car_white_24);
        }
        if (ordinal == 4) {
            return mo110130d(R.drawable.quantum_gm_ic_flight_takeoff_white_24);
        }
        if (ordinal == 5) {
            return mo110130d(R.drawable.quantum_gm_ic_cake_white_24);
        }
        if (ordinal == 7) {
            return mo110130d(R.drawable.quantum_gm_ic_tips_and_updates_white_24);
        }
        if (ordinal == 8) {
            return mo110130d(R.drawable.quantum_gm_ic_reminder_white_24);
        }
        if (ordinal == 10) {
            return mo110130d(R.drawable.quantum_gm_ic_alarm_white_24);
        }
        if (ordinal == 14) {
            return mo110130d(R.drawable.quantum_gm_ic_warning_amber_white_24);
        }
        if (ordinal == 33 || ordinal == 34) {
            return mo110130d(R.drawable.quantum_gm_ic_gmail_white_24);
        }
        ((C58970a) ((C58970a) this.f358898d.mo56226d()).mo56372aa(39091)).mo56387q("cardType: %s has no icon.", crVar.f132222T);
        return C60856cj.m92900i(Optional.empty());
    }

    /* renamed from: d */
    public final C60870cx mo110130d(int i) {
        C131248q qVar = new C131248q(this, i);
        return C60856cj.m92904m(C47810es.m84978r(qVar), this.f358901g);
    }

    /* renamed from: e */
    public final C60870cx mo110131e(C50818do doVar) {
        C50794cr a = C50794cr.m85938a(doVar.f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        C47633f i = C47633f.m84733g(mo110129c(a)).mo51516i(new C131247p(this, doVar), this.f358901g);
        C131249r rVar = new C131249r(this, doVar);
        return C60922j.m93044g(i, C47810es.m84963c(rVar), this.f358901g);
    }

    /* renamed from: g */
    public final void mo110132g(C50790cn cnVar) {
        if (this.f358900f) {
            ((C58970a) ((C58970a) this.f358898d.mo56224b()).mo56372aa(39095)).mo56386p("Add feedback button");
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.assistant.verticals.ambient.feedback.full.SmartspaceFeedbackActivity"));
            String uri = intent.toUri(1);
            String valueOf = String.valueOf(((C50818do) cnVar.instance).f132307d);
            C50794cr a = C50794cr.m85938a(((C50818do) cnVar.instance).f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            Intent c = a.c(uri, valueOf, a, C50731p.START_ACTIVITY, 4);
            C50788cl clVar = (C50788cl) C50789cm.f132161f.createBuilder();
            clVar.copyOnWrite();
            C50789cm cmVar = (C50789cm) clVar.instance;
            cmVar.f132167e = 3;
            cmVar.f132163a |= 8;
            C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
            C50731p pVar = C50731p.START_ACTIVITY;
            qVar.copyOnWrite();
            C50733r rVar = (C50733r) qVar.instance;
            rVar.f132024b = pVar.f132020d;
            rVar.f132023a |= 1;
            String uri2 = c.toUri(1);
            qVar.copyOnWrite();
            C50733r rVar2 = (C50733r) qVar.instance;
            uri2.getClass();
            rVar2.f132023a |= 2;
            rVar2.f132025c = uri2;
            C50733r rVar3 = (C50733r) qVar.build();
            clVar.copyOnWrite();
            C50789cm cmVar2 = (C50789cm) clVar.instance;
            rVar3.getClass();
            cmVar2.f132165c = rVar3;
            cmVar2.f132163a |= 2;
            cnVar.mo53460b((C50789cm) clVar.build());
        }
    }

    /* renamed from: h */
    public final boolean mo110133h() {
        if (mo110134i() && Build.VERSION.SDK_INT >= 31) {
            try {
                if (this.f358896b.getPackageManager().getPackageInfo("com.google.android.as", 0).getLongVersionCode() > 6488361) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                ((C58970a) ((C58970a) ((C58970a) this.f358898d.mo56226d()).mo56382g(e)).mo56372aa(39096)).mo56386p("Error obtaining package info");
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo110134i() {
        return Build.MODEL.startsWith("Pixel") || this.f358896b.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_2017_EXPERIENCE");
    }

    /* renamed from: j */
    public final boolean mo110135j() {
        return mo110134i() || this.f358896b.getPackageManager().hasSystemFeature("com.google.android.googlequicksearchbox.SMARTSPACE_DEVICE_FEATURE");
    }

    /* renamed from: l */
    public final boolean mo110136l() {
        try {
            this.f358896b.getPackageManager().getApplicationInfo("com.airbnb.android", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            ((C58970a) ((C58970a) ((C58970a) this.f358898d.mo56224b()).mo56382g(e)).mo56372aa(39097)).mo56389s("Package: %s is not installed.", "com.airbnb.android");
            return false;
        }
    }
}
