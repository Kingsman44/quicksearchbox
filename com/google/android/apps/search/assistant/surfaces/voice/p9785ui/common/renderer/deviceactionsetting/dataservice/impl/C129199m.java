package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.impl;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.dataservice.C129184b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.deviceactionsetting.p9801a.C129172b;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46704av;
import com.google.apps.tiktok.dataservice.C46740bx;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.m */
/* compiled from: PG */
public final class C129199m implements C129184b {

    /* renamed from: a */
    public static final C59071e f354894a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.deviceactionsetting.dataservice.impl.m");

    /* renamed from: b */
    public final Context f354895b;

    /* renamed from: c */
    private final C46877q f354896c;

    /* renamed from: d */
    private final C60887da f354897d;

    /* renamed from: e */
    private final C60887da f354898e;

    public C129199m(Context context, C46877q qVar, C60887da daVar, C60887da daVar2) {
        this.f354895b = context;
        this.f354896c = qVar;
        this.f354897d = daVar;
        this.f354898e = daVar2;
    }

    /* renamed from: g */
    public static Integer m210911g(Cursor cursor, int i) {
        String string = cursor.getString(i);
        C58976aa aaVar = C58975e.f156826a;
        return Integer.valueOf(TextUtils.isEmpty(string) ? -1 : Integer.parseInt(string));
    }

    /* renamed from: a */
    public final C46689ag mo108893a(String str) {
        Uri a = C129172b.m210854a(str);
        Bundle bundle = new Bundle();
        bundle.putInt("android:query-arg-limit", 1);
        return new C46704av(this.f354896c.mo50873c(a, new String[0], bundle, new C129189c(this), this.f354897d), C129190d.f354882a, this.f354897d);
    }

    /* renamed from: b */
    public final C46689ag mo108894b(String str) {
        Uri a = C129172b.m210854a(str);
        Bundle bundle = new Bundle();
        bundle.putInt("android:query-arg-limit", 1);
        return new C46704av(this.f354896c.mo50873c(a, new String[0], bundle, C129191e.f354883a, this.f354897d), C129192f.f354884a, this.f354897d);
    }

    /* renamed from: c */
    public final C46689ag mo108895c(String str) {
        Uri a = C129172b.m210854a(str);
        Bundle bundle = new Bundle();
        bundle.putInt("android:query-arg-limit", 1);
        return new C46704av(this.f354896c.mo50873c(a, new String[0], bundle, C129197k.f354892a, this.f354897d), C129198l.f354893a, this.f354897d);
    }

    /* renamed from: d */
    public final C60870cx mo108896d(String str, String str2) {
        Uri build = new Uri.Builder().scheme("content").authority("com.google.android.settings.external").path("settings_manager").appendPath(str2).appendQueryParameter("new_setting_value", str).build();
        if (build != null) {
            return C60846c.m92878g(mo108900f(build).f121591a.mo57272e(C47810es.m84970j(new C129193g(str, str2)), this.f354898e).mo57275g(), C46740bx.class, C129194h.f354887a, C60826bg.f164896a);
        }
        C59104x d = f354894a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "DeviceSettingDataService");
        ((C59052c) ((C59052c) d).mo56372aa(38167)).mo56386p("Null uri when modifying setting.");
        return C60856cj.m92900i(false);
    }

    /* renamed from: e */
    public final void mo108897e(int i, String str) {
        Uri a = C129172b.m210854a(str);
        if (a == null) {
            C59104x d = f354894a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DeviceSettingDataService");
            ((C59052c) ((C59052c) d).mo56372aa(38168)).mo56386p("Null uri when modifying setting value.");
            C60856cj.m92900i(false);
            return;
        }
        C60846c.m92879h(mo108900f(a).f121591a.mo57273f(C47810es.m84968h(new C129195i(this, i, str)), this.f354898e).mo57275g(), C46740bx.class, C129196j.f354891a, C60826bg.f164896a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C46463o mo108900f(Uri uri) {
        return this.f354896c.mo50872b(uri, new String[0], (String) null, (String[]) null, (String) null);
    }
}
