package com.google.android.libraries.search.assistant.performer.p2766i;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36183e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.aq */
/* compiled from: PG */
public final class C36138aq implements C35472h {

    /* renamed from: a */
    public static final C59071e f94478a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.i.aq");

    /* renamed from: b */
    private final C35470f f94479b;

    /* renamed from: c */
    private final PackageManager f94480c;

    public C36138aq(C35470f fVar, PackageManager packageManager) {
        this.f94479b = fVar;
        this.f94480c = packageManager;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        Intent intent;
        C36183e.m64586d(dyVar, "timer.REMOVE_TIMER");
        C51594nm nmVar = (C51594nm) C36128ag.m64535c(dyVar).orElseThrow(C36135an.f94475a);
        if (nmVar.f134477b.size() <= 0) {
            throw new C35471g("ClientOp must contain at least 1 timer");
        } else if (nmVar.f134477b.size() <= 1 || C36128ag.m64539g(nmVar.f134477b)) {
            if (nmVar.f134477b.size() <= 1) {
                ((C59052c) ((C59052c) f94478a.mo56224b()).mo56372aa(52193)).mo56386p("Removing the timer using public Clock API.");
                String str = ((C51592nk) nmVar.f134477b.get(0)).f134467d;
                Uri parse = Uri.parse(str);
                if (C36128ag.m64541i(parse)) {
                    Uri build = parse.buildUpon().appendPath("delete").build();
                    intent = new Intent().setData(build).setPackage(build.getHost());
                } else {
                    throw new IllegalArgumentException("Invalid timer id ".concat(String.valueOf(str)));
                }
            } else if (C36128ag.m64540h(this.f94480c)) {
                ((C59052c) ((C59052c) f94478a.mo56224b()).mo56372aa(52192)).mo56386p("Removing the timer using Google Clock app.");
                Uri.Builder appendPath = C36128ag.f94466a.buildUpon().appendPath("multi");
                for (C51592nk nkVar : nmVar.f134477b) {
                    C36128ag.m64537e(1 == (nkVar.f134464a & 1), "Timer Id must be set");
                    appendPath.appendQueryParameter("action", Uri.parse("/timer").buildUpon().appendPath(Integer.toString(C36128ag.m64533a(nkVar.f134467d))).appendPath("delete").build().toString());
                }
                Uri build2 = appendPath.build();
                intent = new Intent().setData(build2).setPackage(build2.getHost());
            } else {
                throw new C35471g("Google Clock app is not installed, or too old");
            }
            return C47633f.m84733g(this.f94479b.mo20101f(intent)).mo51515h(C36136ao.f94476a, C60826bg.f164896a).mo51513e(Exception.class, new C36137ap(intent), C60826bg.f164896a);
        } else {
            throw new C35471g("Unable to handle multiple timers for 3rd party clock apps");
        }
    }
}
