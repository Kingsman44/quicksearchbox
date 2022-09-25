package com.google.android.libraries.lens.view.srpx;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.lens.view.srpx.p2170a.C28033d;
import com.google.android.libraries.lens.view.utils.C28110al;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.libraries.lens.view.srpx.j */
/* compiled from: PG */
public final class C28044j {

    /* renamed from: a */
    private final C28045k f76320a;

    public C28044j(C28045k kVar) {
        this.f76320a = kVar;
    }

    /* renamed from: b */
    private final Uri.Builder m52254b(boolean z) {
        Uri.Builder appendQueryParameter = this.f76320a.mo33498a().buildUpon().appendQueryParameter("hl", Locale.getDefault().toLanguageTag()).appendQueryParameter("ctzn", Uri.encode(TimeZone.getDefault().getID())).appendQueryParameter("cs", true != z ? "0" : "1").appendQueryParameter("source", "and.lens.gsa.srp");
        if (this.f76320a.mo33499c()) {
            appendQueryParameter.appendQueryParameter("deb", "0j2");
        }
        return appendQueryParameter;
    }

    /* renamed from: a */
    public final String mo33497a(C28033d dVar, Context context, C58833ax axVar) {
        if (dVar.mo33491e().mo56113h()) {
            return m52254b(C28110al.m52391c(context)).appendQueryParameter("tbs", (String) dVar.mo33491e().mo56107c()).build().toString();
        }
        boolean c = C28110al.m52391c(context);
        C58833ax b = dVar.mo33488b();
        String str = (String) dVar.mo33494g().mo56111f();
        C58833ax f = dVar.mo33493f();
        C58833ax c2 = dVar.mo33489c();
        Uri.Builder appendQueryParameter = m52254b(c).appendQueryParameter("q", (String) dVar.mo33490d().mo56107c()).appendQueryParameter("safe", "active");
        if (!TextUtils.isEmpty((CharSequence) b.mo56111f())) {
            appendQueryParameter.appendQueryParameter("kgmid", (String) b.mo56107c());
        }
        if (!TextUtils.isEmpty(str)) {
            appendQueryParameter.appendQueryParameter("lns_vert", str);
        }
        if (!TextUtils.isEmpty((CharSequence) f.mo56111f())) {
            appendQueryParameter.appendQueryParameter("stick", (String) f.mo56107c());
        }
        if (c2.mo56113h()) {
            appendQueryParameter.appendQueryParameter("num", ((Integer) c2.mo56107c()).toString());
        }
        appendQueryParameter.appendQueryParameter("ved", (String) ((C58847bk) axVar).f156646a);
        appendQueryParameter.appendQueryParameter("lns_fp", "1");
        return appendQueryParameter.build().toString();
    }
}
