package com.google.android.libraries.search.assistant.performer.p2766i;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3917i.p3918a.C51591nj;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.bd */
/* compiled from: PG */
public final class C36152bd implements C35472h {

    /* renamed from: a */
    public static final C59071e f94496a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.i.bd");

    /* renamed from: b */
    private final C35470f f94497b;

    /* renamed from: c */
    private final PackageManager f94498c;

    /* renamed from: d */
    private final C36153be f94499d = new C36155c(C58729pv.f156485a);

    public C36152bd(C35470f fVar, PackageManager packageManager) {
        this.f94497b = fVar;
        this.f94498c = packageManager;
    }

    /* renamed from: b */
    private static void m64555b(Uri.Builder builder, C58495hd hdVar) {
        C58800sl lA = hdVar.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: c */
    private static void m64556c(Uri.Builder builder, C51592nk nkVar) {
        Optional optional;
        String str;
        Duration duration;
        builder.appendPath("edit");
        if ((nkVar.f134464a & 32) != 0) {
            builder.appendQueryParameter("message", nkVar.f134470g);
        }
        int i = nkVar.f134464a;
        if (!((i & 2) == 0 || nkVar.f134465b != 4 || (i & 4) == 0)) {
            C51591nj a = C51591nj.m86227a(nkVar.f134468e);
            if (a == null) {
                a = C51591nj.UNKNOWN_TIMER_STATUS;
            }
            if (a == C51591nj.PAUSED) {
                if ((nkVar.f134465b == 4 ? ((Long) nkVar.f134466c).longValue() : 0) == nkVar.f134469f) {
                    builder.appendQueryParameter("timerStatus", "Reset");
                    return;
                }
            }
        }
        int i2 = nkVar.f134465b;
        if (i2 == 4) {
            Duration ofMillis = Duration.ofMillis(((Long) nkVar.f134466c).longValue());
            if (ofMillis.isNegative()) {
                ofMillis = Duration.ZERO;
            }
            optional = Optional.m71637of(ofMillis);
        } else if (i2 != 5 || (nkVar.f134464a & 128) == 0) {
            optional = Optional.empty();
        } else {
            Instant ofEpochMilli = Instant.ofEpochMilli(((Long) nkVar.f134466c).longValue());
            C52407qp qpVar = nkVar.f134471h;
            if (qpVar == null) {
                qpVar = C52407qp.f137523d;
            }
            Instant ofEpochSecond = Instant.ofEpochSecond(qpVar.f137526b);
            C52407qp qpVar2 = nkVar.f134471h;
            if (qpVar2 == null) {
                qpVar2 = C52407qp.f137523d;
            }
            Instant plus = ofEpochSecond.plus(Duration.ofNanos((long) qpVar2.f137527c));
            if (plus.isBefore(ofEpochMilli)) {
                duration = Duration.between(plus, ofEpochMilli);
            } else {
                duration = Duration.ZERO;
            }
            optional = Optional.m71637of(duration);
        }
        if (optional.isPresent()) {
            builder.appendQueryParameter("remainingTime", ((Duration) optional.get()).toString());
        }
        if ((nkVar.f134464a & 2) != 0) {
            C51591nj a2 = C51591nj.m86227a(nkVar.f134468e);
            if (a2 == null) {
                a2 = C51591nj.UNKNOWN_TIMER_STATUS;
            }
            int ordinal = a2.ordinal();
            if (ordinal == 1) {
                str = "Started";
            } else if (ordinal == 2) {
                str = "Paused";
            } else {
                throw new IllegalArgumentException("can only update the Timer to PAUSED or RUNNING status, but got: ".concat(String.valueOf(a2.name())));
            }
            builder.appendQueryParameter("timerStatus", str);
        }
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        Intent intent;
        C36183e.m64586d(dyVar, "timer.UPDATE_TIMER");
        C51594nm nmVar = (C51594nm) C36128ag.m64535c(dyVar).orElseThrow(C36149ba.f94493a);
        if (nmVar.f134477b.size() == 0) {
            throw new C35471g("ClientOp must contain at least 1 timer");
        } else if (nmVar.f134477b.size() <= 1 || C36128ag.m64539g(nmVar.f134477b)) {
            if (!nmVar.f134480e.equals("com.google.android.deskclock")) {
                C51592nk nkVar = (C51592nk) nmVar.f134477b.get(0);
                C36153be beVar = this.f94499d;
                ((C59052c) ((C59052c) f94496a.mo56224b()).mo56372aa(52196)).mo56386p("Updating the timer using public Clock API.");
                String str = nkVar.f134467d;
                Uri parse = Uri.parse(str);
                if (C36128ag.m64541i(parse)) {
                    Uri.Builder buildUpon = parse.buildUpon();
                    m64556c(buildUpon, nkVar);
                    C58800sl lA = ((C36155c) beVar).f94502a.entrySet().iterator();
                    while (lA.hasNext()) {
                        Map.Entry entry = (Map.Entry) lA.next();
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    Uri build = buildUpon.build();
                    intent = new Intent().setData(build).setPackage(build.getHost());
                } else {
                    throw new IllegalArgumentException("Invalid timer id ".concat(String.valueOf(str)));
                }
            } else if (C36128ag.m64540h(this.f94498c)) {
                C36153be beVar2 = this.f94499d;
                ((C59052c) ((C59052c) f94496a.mo56224b()).mo56372aa(52195)).mo56386p("Updating the timer using Google Clock app.");
                Uri.Builder appendPath = C36128ag.f94466a.buildUpon().appendPath("multi");
                for (C51592nk nkVar2 : nmVar.f134477b) {
                    C36128ag.m64537e(1 == (nkVar2.f134464a & 1), "Timer Id must be set");
                    Uri.Builder appendPath2 = Uri.parse("/timer").buildUpon().appendPath(Integer.toString(C36128ag.m64533a(nkVar2.f134467d)));
                    m64556c(appendPath2, nkVar2);
                    appendPath.appendQueryParameter("action", appendPath2.build().toString());
                }
                if (nmVar.f134478c) {
                    C58495hd hdVar = ((C36155c) beVar2).f94502a;
                    Uri.Builder appendPath3 = Uri.parse("/timer").buildUpon().appendPath(Integer.toString(C36128ag.m64533a(((C51592nk) nmVar.f134477b.get(0)).f134467d))).appendPath("view");
                    m64555b(appendPath3, hdVar);
                    appendPath = appendPath.appendQueryParameter("action", appendPath3.build().toString());
                }
                m64555b(appendPath, ((C36155c) beVar2).f94502a);
                Uri build2 = appendPath.build();
                intent = new Intent().setData(build2).setPackage(build2.getHost());
            } else {
                throw new C35471g("Google Clock app is not installed, or too old");
            }
            return C47633f.m84733g(this.f94497b.mo20101f(intent)).mo51515h(C36150bb.f94494a, C60826bg.f164896a).mo51513e(Exception.class, new C36151bc(intent), C60826bg.f164896a);
        } else {
            throw new C35471g("Unable to handle multiple timers for 3rd party clock apps");
        }
    }
}
