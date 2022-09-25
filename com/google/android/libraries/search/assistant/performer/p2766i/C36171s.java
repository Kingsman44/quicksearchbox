package com.google.android.libraries.search.assistant.performer.p2766i;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.s */
/* compiled from: PG */
public final class C36171s implements C35472h {

    /* renamed from: a */
    public static final C59071e f94527a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.i.s");

    /* renamed from: b */
    private final C35470f f94528b;

    /* renamed from: c */
    private final KeyguardManager f94529c;

    /* renamed from: d */
    private final C36172t f94530d = new C36148b(C58729pv.f156485a);

    public C36171s(C35470f fVar, Context context) {
        this.f94528b = fVar;
        Object systemService = context.getSystemService("keyguard");
        systemService.getClass();
        this.f94529c = (KeyguardManager) systemService;
    }

    /* renamed from: b */
    private static Duration m64569b(C51592nk nkVar) {
        if (nkVar.f134465b == 4) {
            return Duration.ofMillis(((Long) nkVar.f134466c).longValue());
        }
        return Duration.ofMillis(nkVar.f134469f);
    }

    /* renamed from: c */
    private static void m64570c(Uri.Builder builder, C51592nk nkVar) {
        builder.appendPath("timer").appendPath("create").appendQueryParameter("timerStatus", "Started").appendQueryParameter("length", Long.toString(m64569b(nkVar).toMillis()));
        if ((nkVar.f134464a & 1) != 0) {
            builder.appendQueryParameter("uuid", nkVar.f134467d);
        }
        if ((nkVar.f134464a & 32) != 0) {
            builder.appendQueryParameter("message", nkVar.f134470g);
        }
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        boolean z;
        Intent intent;
        Uri.Builder builder;
        C36183e.m64586d(dyVar, "timer.CREATE_TIMER");
        C51594nm nmVar = (C51594nm) C36128ag.m64535c(dyVar).orElseThrow(C36168p.f94524a);
        if (nmVar.f134477b.size() != 0) {
            C51592nk nkVar = (C51592nk) nmVar.f134477b.get(0);
            if (nkVar.f134465b != 4 && (nkVar.f134464a & 4) == 0) {
                z = false;
            } else {
                z = true;
            }
            C36128ag.m64537e(z, "Duration is mandatory - either remaining_duration or original_duration has to be set");
            Duration b = m64569b(nkVar);
            if (b.isZero() || b.isNegative()) {
                return C60856cj.m92900i(C36180b.m64578b(C52235kf.OUT_OF_RANGE));
            }
            String str = nmVar.f134480e;
            if (str.equals("com.google.android.deskclock")) {
                C36172t tVar = this.f94530d;
                ((C59052c) ((C59052c) f94527a.mo56224b()).mo56372aa(52187)).mo56386p("Setting the timer using Google Clock app.");
                C51592nk nkVar2 = (C51592nk) nmVar.f134477b.get(0);
                if (!nmVar.f134478c || (nkVar2.f134464a & 1) == 0) {
                    builder = C36128ag.f94466a.buildUpon();
                    m64570c(builder, nkVar2);
                } else if (this.f94529c.isKeyguardLocked()) {
                    builder = C36128ag.f94466a.buildUpon();
                    m64570c(builder, nkVar2);
                } else {
                    builder = C36128ag.f94466a.buildUpon().appendPath("multi");
                    Uri.Builder builder2 = new Uri.Builder();
                    m64570c(builder2, nkVar2);
                    builder.appendQueryParameter("action", builder2.build().toString());
                    builder.appendQueryParameter("action", Uri.parse("/timer").buildUpon().appendPath(nkVar2.f134467d).appendPath("view").build().toString());
                }
                C58800sl lA = ((C36148b) tVar).f94492a.entrySet().iterator();
                while (lA.hasNext()) {
                    Map.Entry entry = (Map.Entry) lA.next();
                    builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = builder.build();
                intent = new Intent().setData(build).setPackage(build.getHost());
            } else {
                ((C59052c) ((C59052c) f94527a.mo56224b()).mo56372aa(52186)).mo56389s("Setting the timer using public Clock API on %s", str);
                C51592nk nkVar3 = (C51592nk) nmVar.f134477b.get(0);
                Intent intent2 = new Intent("android.intent.action.SET_TIMER");
                long seconds = m64569b(nkVar3).getSeconds();
                int i = (int) seconds;
                if (seconds == ((long) i)) {
                    intent2.putExtra("android.intent.extra.alarm.LENGTH", i);
                    if ((nkVar3.f134464a & 32) != 0) {
                        intent2.putExtra("android.intent.extra.alarm.MESSAGE", nkVar3.f134470g);
                    }
                    if (this.f94529c.isKeyguardLocked()) {
                        intent2.putExtra("android.intent.extra.alarm.SKIP_UI", true);
                    } else {
                        intent2.putExtra("android.intent.extra.alarm.SKIP_UI", !nmVar.f134478c);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        intent2.setPackage(str);
                    }
                    intent = intent2;
                } else {
                    throw new ArithmeticException();
                }
            }
            return C47633f.m84733g(this.f94528b.mo20101f(intent)).mo51515h(C36169q.f94525a, C60826bg.f164896a).mo51513e(Exception.class, new C36170r(intent), C60826bg.f164896a);
        }
        throw new C35471g("Timer args contained no timers");
    }
}
