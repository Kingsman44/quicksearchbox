package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import android.content.Context;
import android.net.Uri;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46740bx;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.Arrays;
import java.util.HashSet;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.s */
/* compiled from: PG */
public final class C35862s {

    /* renamed from: a */
    public static final C59071e f93953a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.s");

    /* renamed from: b */
    public static final C58528ij f93954b = C58528ij.m90006F(new HashSet(Arrays.asList(new String[]{"switch_access", "assist_sensitivity", "font_size", "screen_zoom", "enable_wifi_ap", "zen_mode", "toggle_lock_screen_rotation_preference"})));

    /* renamed from: c */
    public final String f93955c;

    /* renamed from: d */
    public final C60887da f93956d;

    /* renamed from: e */
    public final C60887da f93957e;

    /* renamed from: f */
    public final Context f93958f;

    /* renamed from: g */
    public boolean f93959g;

    /* renamed from: h */
    private final C46877q f93960h;

    public C35862s(String str, Context context, C46877q qVar, C60887da daVar, C60887da daVar2) {
        this.f93955c = str;
        this.f93958f = context;
        this.f93960h = qVar;
        this.f93956d = daVar;
        this.f93957e = daVar2;
    }

    /* renamed from: a */
    public final C46463o mo39868a(Uri uri) {
        return this.f93960h.mo50872b(uri, new String[0], (String) null, (String[]) null, (String) null);
    }

    /* renamed from: b */
    public final C60870cx mo39869b() {
        Uri c = C35864u.m64261c(this.f93955c);
        if (c == null) {
            ((C59052c) ((C59052c) f93953a.mo56226d()).mo56372aa(51873)).mo56389s("Null uri when query setting values. with: %s", this.f93955c);
            return C60856cj.m92900i(Optional.m71637of(Boolean.toString(false)));
        }
        return C60846c.m92878g(mo39868a(c).f121591a.mo57272e(C47810es.m84970j(new C35859p(this)), this.f93956d).mo57275g(), C46740bx.class, new C35860q(this), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo39870c(String str) {
        Uri uri;
        String str2 = this.f93955c;
        if (C58837ba.m90859h(str2)) {
            uri = null;
        } else {
            uri = new Uri.Builder().scheme("content").authority("com.google.android.settings.external").path("settings_manager").appendPath(str2).appendQueryParameter("new_setting_value", str).build();
        }
        if (uri == null) {
            ((C59052c) ((C59052c) f93953a.mo56226d()).mo56372aa(51875)).mo56386p("Null uri when modifying setting.");
            return C60856cj.m92900i(false);
        }
        return C60846c.m92878g(mo39868a(uri).f121591a.mo57272e(C47810es.m84970j(new C35853j(this, str)), this.f93956d).mo57275g(), C46740bx.class, new C35854k(this), C60826bg.f164896a);
    }
}
