package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Context;
import android.preference.Preference;
import com.google.android.apps.gsa.p6427o.C83559c;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.settingsui.C88987b;
import com.google.android.apps.gsa.settingsui.C88988c;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.web.profile.C44070e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.aa */
/* compiled from: PG */
public final class C97940aa extends C88987b {

    /* renamed from: b */
    private static final C59071e f273478b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cm.aa");

    /* renamed from: c */
    private final Context f273479c;

    /* renamed from: d */
    private final C97964ax f273480d;

    public C97940aa(Context context, C97964ax axVar) {
        this.f273479c = context;
        this.f273480d = axVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C88990e mo82939a(Preference preference) {
        if ("google_app_browser_preference".equals(preference.getKey())) {
            C97964ax axVar = this.f273480d;
            Context context = this.f273479c;
            context.getClass();
            C22871g gVar = (C22871g) axVar.f273540a.mo17428b();
            gVar.getClass();
            C22871g gVar2 = (C22871g) axVar.f273541b.mo17428b();
            gVar2.getClass();
            Executor executor = (Executor) axVar.f273542c.mo17428b();
            executor.getClass();
            C86034c cVar = (C86034c) axVar.f273543d.mo17428b();
            cVar.getClass();
            C44070e eVar = (C44070e) axVar.f273544e.mo17428b();
            eVar.getClass();
            C84474e eVar2 = (C84474e) axVar.f273545f.mo17428b();
            eVar2.getClass();
            C83559c cVar2 = (C83559c) axVar.f273546g.mo17428b();
            cVar2.getClass();
            return new C97962aw(context, gVar, gVar2, executor, cVar, eVar, eVar2, cVar2);
        }
        ((C59052c) ((C59052c) f273478b.mo56225c()).mo56372aa(30400)).mo56389s("Unexpected Preference %s, defaulting to DefaultSettingController", preference.getKey());
        return new C88988c();
    }
}
