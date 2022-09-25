package com.google.android.apps.gsa.p8867w.p8879i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.preferences.C86317h;
import com.google.android.apps.gsa.search.core.preferences.C86319j;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.search.googleapp.p10385s.p10386a.C137184a;
import com.google.android.apps.search.googleapp.search.p10405b.C137396a;
import com.google.android.apps.search.googleapp.search.p10405b.C137397b;
import com.google.android.apps.search.googleapp.search.p10405b.C137398c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p417d.p418a.C8590q;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.w.i.p */
/* compiled from: PG */
public final class C118815p implements C137396a, C137184a {

    /* renamed from: a */
    private final C86338r f331388a;

    /* renamed from: b */
    private final C86319j f331389b;

    public C118815p(C86338r rVar, C86319j jVar) {
        this.f331388a = rVar;
        this.f331389b = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo103981a() {
        return C60856cj.m92900i(this.f331388a.getString("advertising_id", (String) null));
    }

    /* renamed from: b */
    public final C60870cx mo103982b() {
        return C60856cj.m92900i(Boolean.valueOf(this.f331388a.getBoolean("location_permission_notification_shown", false)));
    }

    /* renamed from: c */
    public final C60870cx mo103983c() {
        C137397b bVar = (C137397b) C137398c.f373717f.createBuilder();
        String k = mo103991k();
        bVar.copyOnWrite();
        C137398c cVar = (C137398c) bVar.instance;
        k.getClass();
        cVar.f373719a |= 1;
        cVar.f373720b = k;
        boolean z = false;
        if (this.f331388a.getString("advertising_id", (String) null) != null) {
            z = this.f331388a.getBoolean("limited_ad_tracking", false);
        }
        bVar.copyOnWrite();
        C137398c cVar2 = (C137398c) bVar.instance;
        cVar2.f373719a |= 2;
        cVar2.f373721c = z;
        int i = this.f331388a.getInt("search_video_preview_autoplay", C8590q.AUTOPLAY_UNSPECIFIED.f29729e);
        int i2 = C8590q.AUTOPLAY_UNSPECIFIED.f29729e;
        String str = BuildConfig.FLAVOR;
        String num = (i == i2 || i == 2) ? str : Integer.toString(i);
        bVar.copyOnWrite();
        C137398c cVar3 = (C137398c) bVar.instance;
        num.getClass();
        cVar3.f373719a |= 4;
        cVar3.f373722d = num;
        int i3 = this.f331388a.getInt("ram_mb", -1);
        if (i3 != -1) {
            str = Integer.toString(i3);
        }
        bVar.copyOnWrite();
        C137398c cVar4 = (C137398c) bVar.instance;
        str.getClass();
        cVar4.f373719a |= 8;
        cVar4.f373723e = str;
        return C60856cj.m92900i((C137398c) bVar.build());
    }

    /* renamed from: d */
    public final C60870cx mo103984d() {
        return C60856cj.m92900i(mo103991k());
    }

    /* renamed from: e */
    public final C60870cx mo103985e(String str) {
        return C60856cj.m92900i(Integer.valueOf(this.f331388a.getInt(String.format("opa_unicorn_status_%s", new Object[]{str}), 0)));
    }

    /* renamed from: f */
    public final C60870cx mo103986f() {
        return C60856cj.m92900i(Boolean.valueOf(this.f331388a.getBoolean("opa_enabled", true)));
    }

    /* renamed from: g */
    public final C60870cx mo103987g() {
        return C60856cj.m92900i(Boolean.valueOf(this.f331388a.getBoolean("suggest_trends_enabled", true)));
    }

    /* renamed from: h */
    public final C60870cx mo103988h(boolean z) {
        C86337q b = this.f331388a.mo80076b();
        b.mo80067b("suggest_trends_enabled", z);
        b.apply();
        return C60866ct.f164955a;
    }

    /* renamed from: i */
    public final C60870cx mo103989i(boolean z) {
        C86337q b = this.f331388a.mo80076b();
        b.mo80070e("temp_units", z ^ true ? 1 : 0);
        b.apply();
        C86317h a = this.f331389b.mo80040a();
        int i = 1;
        if (true != z) {
            i = 2;
        }
        a.mo80038f(i);
        return C60866ct.f164955a;
    }

    /* renamed from: j */
    public final C60870cx mo103990j(boolean z, String str) {
        C86337q b = this.f331388a.mo80076b();
        int i = 1;
        String format = String.format("opa_unicorn_status_%s", new Object[]{str});
        if (true != z) {
            i = 2;
        }
        b.mo80070e(format, i);
        b.apply();
        return C60866ct.f164955a;
    }

    /* renamed from: k */
    public final String mo103991k() {
        if (this.f331388a.getInt("search_language_state", 1) == 0) {
            return this.f331388a.getString("hl_parameter", BuildConfig.FLAVOR);
        }
        return C90772bp.m148312t(Locale.getDefault());
    }

    /* renamed from: l */
    public final C60870cx mo103992l() {
        return C60856cj.m92900i(Boolean.valueOf(this.f331388a.getBoolean("enable_corpus_com.google.android.gms/internal.3p:MobileApplication", true)));
    }

    /* renamed from: m */
    public final C60870cx mo103993m(boolean z) {
        C86337q b = this.f331388a.mo80076b();
        b.mo80067b("enable_corpus_com.google.android.gms/internal.3p:MobileApplication", z);
        b.apply();
        return C60866ct.f164955a;
    }

    /* renamed from: n */
    public final C60870cx mo103994n() {
        C86337q b = this.f331388a.mo80076b();
        b.mo80067b("location_permission_notification_shown", true);
        b.apply();
        return C60866ct.f164955a;
    }
}
