package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.bh */
/* compiled from: PG */
public final /* synthetic */ class C96104bh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C96109bm f269056a;

    public /* synthetic */ C96104bh(C96109bm bmVar) {
        this.f269056a = bmVar;
    }

    public final void run() {
        C96109bm bmVar = this.f269056a;
        String str = bmVar.f269083s.f269039a;
        str.getClass();
        bmVar.f269082r.mo89391a(str);
        if ("00000006".equals(bmVar.f269080p)) {
            bmVar.f269079o.mo90077d(bmVar.f269081q, "https://www.gstatic.com/bisto/oobe/b10/fit/index.html");
            bmVar.f269079o.mo90077d(bmVar.f269081q, "https://www.gstatic.com/bisto/oobe/b10/sleep_mode/index.html");
        }
        if (!C36619a.m65148d(bmVar.f269081q)) {
            bmVar.f269079o.mo90077d(bmVar.f269081q, "https://www.gstatic.com/bisto/oobe/hear_notifs/index.html");
        }
        C96331js jsVar = bmVar.f269079o;
        Context context = bmVar.f269081q;
        int i = C96381lo.f269637q;
        jsVar.mo90077d(context, C96381lo.m159719g("https://www.gstatic.com/bisto/oobe/tos_welcome/index.html", C58485gu.m89845m(), BuildConfig.FLAVOR));
    }
}
