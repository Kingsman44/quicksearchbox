package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1161e.C15737d;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60888db;
import java.io.File;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.h */
/* compiled from: PG */
public final class C15755h {

    /* renamed from: a */
    public static final C58974d f46951a = C58974d.m91136j();

    /* renamed from: b */
    public final C42876ab f46952b;

    /* renamed from: c */
    public final String f46953c;

    /* renamed from: d */
    public final String f46954d;

    /* renamed from: e */
    public final File f46955e;

    /* renamed from: f */
    public final C60888db f46956f;

    /* renamed from: g */
    public final C60888db f46957g;

    public C15755h(C42876ab abVar, Context context, C60888db dbVar, C60888db dbVar2) {
        String str;
        this.f46952b = abVar;
        this.f46957g = dbVar;
        this.f46956f = dbVar2;
        ((C58970a) ((C58970a) f46951a.mo56224b()).mo56372aa(46264)).mo56386p("#getSodaCacheDir");
        StringBuilder sb = new StringBuilder(context.getCacheDir().getAbsolutePath());
        if (sb.charAt(sb.length() - 1) != '/') {
            sb.append('/');
        }
        sb.append("soda-offline/");
        this.f46955e = new File(sb.toString());
        this.f46954d = Build.FINGERPRINT;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            ((C58970a) ((C58970a) ((C58970a) f46951a.mo56225c()).mo56382g(e)).mo56372aa(46265)).mo56386p("Could not obtain APK version string. GPU-based LanguagePacks may not work.");
            str = BuildConfig.FLAVOR;
        }
        this.f46953c = str;
    }

    /* renamed from: a */
    public final boolean mo22530a(C15737d dVar, String str, int i) {
        return dVar.f46922b.equals(str) && dVar.f46923c == ((long) i) && dVar.f46924d.equals(this.f46953c) && dVar.f46925e.equals(this.f46954d);
    }
}
