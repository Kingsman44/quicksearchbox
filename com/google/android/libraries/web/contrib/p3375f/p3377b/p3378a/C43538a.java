package com.google.android.libraries.web.contrib.p3375f.p3377b.p3378a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.p3375f.p3381c.C43541a;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.shared.C44076a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.web.contrib.f.b.a.a */
/* compiled from: PG */
public final class C43538a implements C43541a {

    /* renamed from: a */
    private static final C59071e f113693a = C59071e.m91332i("com.google.android.libraries.web.contrib.f.b.a.a");

    /* renamed from: b */
    private final Context f113694b;

    /* renamed from: c */
    private final C43377v f113695c;

    /* renamed from: d */
    private final PackageManager f113696d;

    public C43538a(Fragment fragment, C43377v vVar, PackageManager packageManager) {
        this.f113694b = fragment.requireContext();
        this.f113695c = vVar;
        this.f113696d = packageManager;
    }

    /* renamed from: f */
    private static Intent m76821f(Uri uri) {
        return new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(uri);
    }

    /* renamed from: g */
    private final String m76822g() {
        String str = this.f113695c.mo46468a().f113329b;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        C43367l lVar = this.f113695c.mo46468a().f113335h;
        if (lVar == null) {
            lVar = C43367l.f113293h;
        }
        return lVar.f113296b;
    }

    /* renamed from: a */
    public final int mo46594a() {
        return R.id.webx_open_in_browser_button;
    }

    /* renamed from: b */
    public final int mo46595b() {
        return 90167;
    }

    /* renamed from: c */
    public final CharSequence mo46596c() {
        Uri uri;
        String g = m76822g();
        CharSequence charSequence = null;
        if (TextUtils.isEmpty(g)) {
            uri = Uri.fromParts("http", BuildConfig.FLAVOR, (String) null);
        } else {
            uri = Uri.parse(C44076a.m77822e(g));
        }
        ResolveInfo resolveActivity = this.f113696d.resolveActivity(m76821f(uri), 65536);
        if (!(resolveActivity == null || resolveActivity.match == 0)) {
            charSequence = resolveActivity.loadLabel(this.f113696d);
        }
        if (charSequence == null) {
            return this.f113694b.getResources().getString(R.string.webx_open_in_browser_default_label);
        }
        return this.f113694b.getResources().getString(R.string.webx_open_in_browser_label, new Object[]{charSequence});
    }

    /* renamed from: d */
    public final void mo46597d() {
        String g = m76822g();
        C58838bb.m90883r(!TextUtils.isEmpty(g));
        try {
            C47810es.m84979s(this.f113694b, m76821f(Uri.parse(C44076a.m77822e(g))));
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f113693a.mo56226d()).mo56382g(e)).mo56372aa(54106)).mo56386p("No activity found to open in browser.");
        }
    }

    /* renamed from: e */
    public final boolean mo46598e() {
        return !TextUtils.isEmpty(m76822g());
    }
}
