package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142413ek;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.w */
/* compiled from: PG */
public final class C95130w {

    /* renamed from: a */
    public static final C59071e f266147a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ae.w");

    /* renamed from: b */
    public final AtomicReference f266148b;

    /* renamed from: c */
    public final AtomicReference f266149c = new AtomicReference("unknown");

    /* renamed from: d */
    public final AtomicBoolean f266150d = new AtomicBoolean(false);

    /* renamed from: e */
    public final AtomicBoolean f266151e = new AtomicBoolean(false);

    /* renamed from: f */
    public final String f266152f;

    /* renamed from: g */
    public final C89496ch f266153g;

    public C95130w(Context context, C89496ch chVar, C22871g gVar, C95355bf bfVar) {
        this.f266148b = new AtomicReference(m157242d(context, "Unknown", "Unknown", C124719q.UNKNOWN_DEVICE_CATEGORY, "Unknown"));
        this.f266152f = bfVar.mo89270k();
        this.f266153g = chVar;
        gVar.mo28212l("useragent", new C95129v(this, chVar, context));
    }

    /* renamed from: a */
    public static Bundle m157240a(C21370a aVar, boolean z, C95455a aVar2) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putBoolean("com.google.android.apps.gsa.shared.bisto.ENDPOINTING_BY_CLOSING_STREAM", true);
        }
        long j = aVar2.f267100c;
        if (j != 0) {
            bundle.putLong("com.google.android.apps.gsa.shared.bisto.QUERY_START_TIME_MILLIS", j + (aVar.mo26871c() - aVar.mo26870b()));
        }
        bundle.putInt("com.google.android.apps.gsa.shared.bisto.AUDIO_SAMPLING_RATE", 16000);
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m157241b(boolean z) {
        Bundle bundle = new Bundle();
        if (!z) {
            bundle.putBoolean("com.google.android.apps.gsa.shared.bisto.ENDPOINTING_BY_CLOSING_STREAM", true);
        }
        bundle.putInt("com.google.android.apps.gsa.shared.bisto.AUDIO_SAMPLING_RATE", 16000);
        return bundle;
    }

    /* renamed from: d */
    public static String m157242d(Context context, String str, String str2, C124719q qVar, String str3) {
        PackageInfo packageInfo;
        String str4;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            C59104x c = f266147a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaDialogUtil");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(17952)).mo56386p("Unable to retrieve package info.");
            packageInfo = null;
        }
        String str5 = "Unknown";
        if (packageInfo == null) {
            str4 = str5;
        } else {
            str4 = packageInfo.versionName;
        }
        if (true == C58837ba.m90859h(str)) {
            str = str5;
        }
        if (true == C58837ba.m90859h(str2)) {
            str2 = str5;
        }
        C124719q qVar2 = C124719q.UNKNOWN_DEVICE_CATEGORY;
        C142413ek ekVar = C142413ek.UNKNOWN;
        int ordinal = qVar.ordinal();
        if (ordinal == 1) {
            str5 = "Headphones";
        } else if (ordinal == 2) {
            str5 = "CarAccessory";
        } else if (ordinal == 3) {
            str5 = "Smartwatch";
        }
        if (true == C58837ba.m90859h(str3)) {
            str3 = BuildConfig.FLAVOR;
        }
        return String.format("AW/%s CWC/%s AWD/%s AWT/%s%s", new Object[]{str, str4, str2, str5, str3});
    }

    /* renamed from: f */
    public static int m157243f(C142413ek ekVar) {
        C124719q qVar = C124719q.UNKNOWN_DEVICE_CATEGORY;
        C142413ek ekVar2 = C142413ek.UNKNOWN;
        switch (ekVar.ordinal()) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            default:
                C59104x d = f266147a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GsaDialogUtil");
                ((C59052c) ((C59052c) d).mo56372aa(17951)).mo56389s("Usupported OHD: %s", ekVar);
                int i = C90755l.f253831a;
                return 2;
        }
    }

    /* renamed from: c */
    public final String mo89054c() {
        return (String) this.f266149c.get();
    }

    /* renamed from: e */
    public final String mo89055e() {
        return (String) this.f266148b.get();
    }
}
