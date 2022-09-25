package com.google.android.apps.gsa.opa;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6809l.C86152a;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.p6968aa.C89034be;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;

/* renamed from: com.google.android.apps.gsa.opa.an */
/* compiled from: PG */
public final class C83583an {
    /* renamed from: a */
    public static Intent m133146a(int i, HotwordResultMetadata hotwordResultMetadata, Uri uri, int i2, int i3, int i4) {
        Intent a = C83576ag.f227889a.mo83277a(new Intent());
        a.addFlags(411041792);
        a.putExtra("launched_on", i);
        if (hotwordResultMetadata != null) {
            C87565h hVar = new C87565h(a.getExtras());
            hVar.f236556b = e.aU;
            hVar.f236574t = hotwordResultMetadata;
            a.putExtras(hVar.mo81685a());
        }
        a.putExtra("audio_content_uri", uri);
        if (uri != null) {
            a.putExtra("audio_frequency", i2);
        }
        if (i3 > 1) {
            a.putExtra("num_audio_channels", i3);
        }
        a.putExtra("opa-destination_after_keyguard_dismiss", i4);
        return a;
    }

    /* renamed from: b */
    public static boolean m133147b(String str, C86152a aVar) {
        if (str == null) {
            return false;
        }
        int a = C91042a.m148717a(str);
        if (!str.equals("com.google.android.googlequicksearchbox")) {
            return C83577ah.f227890a.contains(Integer.valueOf(a));
        }
        String b = aVar.f232820b.mo79805b(str);
        if ("com.google.android.launcher.GEL".equals(b) || "com.google.android.apps.gsa.queryentry.QueryEntryActivity".equals(b)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m133148c(Context context) {
        if (Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m133149d(C90021c cVar, C89062r rVar) {
        return cVar.mo79749o(C90014bt.f247223dB).contains(Integer.valueOf(C89034be.m144791a(rVar).f181028z));
    }

    /* renamed from: e */
    public static boolean m133150e(C90021c cVar, C89062r rVar) {
        return cVar.mo79746e(C90014bt.f247222dA) && m133149d(cVar, rVar);
    }

    /* renamed from: f */
    public static boolean m133151f(String str, C86152a aVar) {
        if (str == null) {
            return false;
        }
        return "com.google.android.apps.gsa.staticplugins.opa.OpaActivity".equals(aVar.f232820b.mo79805b(str));
    }

    /* renamed from: g */
    public static int m133152g(C86152a aVar) {
        String a = aVar.f232820b.mo79804a();
        if (a == null) {
            return 0;
        }
        if (m133147b(a, aVar)) {
            return 1;
        }
        if (m133151f(a, aVar)) {
            return 2;
        }
        if ("com.google.android.apps.gsa.staticplugins.opa.hq.OpaHqActivity".equals(aVar.f232820b.mo79805b(a))) {
            return 3;
        }
        if (!"com.google.android.googlequicksearchbox".equals(a) || "com.google.android.launcher.GEL".equals(aVar.f232820b.mo79805b(a))) {
            return 0;
        }
        return 4;
    }
}
