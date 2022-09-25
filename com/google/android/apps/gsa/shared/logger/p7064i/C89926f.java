package com.google.android.apps.gsa.shared.logger.p7064i;

import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.search.logging.appflows.startup.p3038b.C38808a;
import com.google.android.libraries.search.logging.appflows.startup.p3038b.C38814g;
import com.google.android.libraries.search.logging.appflows.startup.p3038b.C38817j;
import com.google.common.base.C58833ax;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71204an;

/* renamed from: com.google.android.apps.gsa.shared.logger.i.f */
/* compiled from: PG */
public final class C89926f {

    /* renamed from: a */
    public static volatile boolean f246364a = false;

    /* renamed from: a */
    public static C38817j m146474a(C71204an anVar) {
        C38808a aVar = new C38808a();
        C71204an anVar2 = C71204an.UNKNOWN;
        switch (anVar.ordinal()) {
            case 0:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_UNKNOWN);
                break;
            case 1:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_OTHER);
                break;
            case 2:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_DISCOVER_GOOGLE_APP);
                aVar.f102424a = C58833ax.m90834k(C89849ae.APPLICATION_INTERACTIVE_DISCOVER_GOOGLE_APP);
                break;
            case 3:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_INTERESTS_TAB_SNA);
                aVar.f102424a = C58833ax.m90834k(C89849ae.APPLICATION_INTERACTIVE_INTERESTS_TAB_SNA);
                break;
            case 4:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_NOTIFICATION_SEARCH_SNA);
                break;
            case 5:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_TEXT_SEARCH_SNA);
                aVar.f102424a = C58833ax.m90834k(C89849ae.APPLICATION_INTERACTIVE_TEXT_SEARCH_SNA);
                break;
            case 6:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_VOICE_SEARCH_SNA);
                aVar.f102424a = C58833ax.m90834k(C89849ae.APPLICATION_INTERACTIVE_VOICE_SEARCH_SNA);
                break;
            case 7:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_TEXT_SEARCH_QEA);
                aVar.f102424a = C58833ax.m90834k(C89849ae.APPLICATION_INTERACTIVE_TEXT_SEARCH_QEA);
                break;
            case 8:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_VOICE_SEARCH_QEA);
                aVar.f102424a = C58833ax.m90834k(C89849ae.APPLICATION_INTERACTIVE_VOICE_SEARCH_QEA);
                break;
            case 9:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_TEXT_SEARCH_GOOGLE_APP);
                aVar.f102424a = C58833ax.m90834k(C89849ae.APPLICATION_INTERACTIVE_TEXT_SEARCH_GOOGLE_APP);
                break;
            case 10:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_LONG_PRESS_HOME_OPA);
                aVar.f102424a = C58833ax.m90834k(C89849ae.APPLICATION_INTERACTIVE_LONG_PRESS_HOME_VOICE_INPUT_OPA);
                break;
            case 11:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_LONG_PRESS_HOME_OPA);
                aVar.f102424a = C58833ax.m90834k(C89849ae.APPLICATION_INTERACTIVE_LONG_PRESS_HOME_TEXT_INPUT_OPA);
                break;
            case 12:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_HOTWORD_OPA);
                aVar.f102424a = C58833ax.m90834k(C89849ae.APPLICATION_INTERACTIVE_HOTWORD_VOICE_INPUT_OPA);
                break;
            case 13:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_SHELL_APP_OPA);
                aVar.f102424a = C58833ax.m90834k(C89849ae.APPLICATION_INTERACTIVE_SHELL_APP_VOICE_INPUT_OPA);
                break;
            case 14:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_SHELL_APP_OPA);
                aVar.mo41649b(C89849ae.APPLICATION_INTERACTIVE_SHELL_APP_TEXT_INPUT_OPA);
                break;
            case 15:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_OTHER_OPA);
                break;
            case 16:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_HOME_NIU);
                break;
            case 17:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_SUGGEST_NIU);
                aVar.f102424a = C58833ax.m90834k(C89849ae.FIRST_DRAW_DONE_SUGGEST_NIU);
                break;
            case 18:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_SRP_NIU);
                break;
            case 19:
                aVar.mo41649b(C89849ae.FIRST_DRAW_DONE_VOICE_SEARCH_GOOGLE_APP);
                aVar.f102424a = C58833ax.m90834k(C89849ae.APPLICATION_INTERACTIVE_VOICE_SEARCH_GOOGLE_APP);
                break;
        }
        return aVar.mo41648a();
    }

    /* renamed from: b */
    static C71204an m146475b(C89928h hVar, C38814g gVar) {
        C58833ax axVar = hVar.f246374e;
        C58833ax axVar2 = hVar.f246375f;
        if (!axVar.mo56113h() || !axVar2.mo56113h()) {
            return C71204an.UNKNOWN;
        }
        return gVar.mo41658a((Class) axVar.mo56107c(), (Intent) axVar2.mo56107c());
    }

    /* renamed from: c */
    public static boolean m146476c(C89928h hVar, C38814g gVar) {
        return m146474a(m146475b(hVar, gVar)).mo41650a().mo56113h();
    }
}
