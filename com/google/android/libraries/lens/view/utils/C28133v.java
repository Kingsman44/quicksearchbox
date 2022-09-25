package com.google.android.libraries.lens.view.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4707j.C62590x;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protos.p4799ag.p4802b.C63164d;
import java.net.URISyntaxException;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.utils.v */
/* compiled from: PG */
public final class C28133v {

    /* renamed from: a */
    public static final C58974d f76548a = C58974d.m91135i("IntentUtils");

    /* renamed from: a */
    public static Intent m52415a(Intent intent) {
        if (intent.getData() != null) {
            Uri data = intent.getData();
            data.getClass();
            if (!data.isOpaque()) {
                Uri data2 = intent.getData();
                data2.getClass();
                String queryParameter = data2.getQueryParameter("lens_query");
                if (queryParameter == null) {
                    return null;
                }
                try {
                    Intent parseUri = Intent.parseUri("ae-action://lens-query-request", 0);
                    parseUri.putExtra("com.google.opa.eyes.EXTRA_LENS_QUERY_REQUEST_METADATA", queryParameter);
                    return parseUri;
                } catch (URISyntaxException e) {
                    ((C58970a) ((C58970a) ((C58970a) f76548a.mo56225c()).mo56382g(e)).mo56372aa(50262)).mo56386p("Could not build URI for Lens Query Request");
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Intent m52416b(String str) {
        try {
            return Intent.parseUri(str, 1);
        } catch (URISyntaxException unused) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            return intent;
        }
    }

    /* renamed from: c */
    public static C58833ax m52417c(Intent intent) {
        byte[] i = m52423i(intent, "com.google.opa.eyes.EXTRA_DOCUMENT_SCANNER_DATA");
        if (i.length != 0) {
            try {
                return C58833ax.m90834k((C63164d) C62942bv.parseFrom((C62942bv) C63164d.f170556b, C63088z.m96139A(i), C62921ba.m95368a()));
            } catch (C62974ct | IllegalArgumentException e) {
                ((C58970a) ((C58970a) ((C58970a) f76548a.mo56226d()).mo56382g(e)).mo56372aa(50264)).mo56386p("Could not set DocumentScannerActionData");
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public static C58833ax m52418d(Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.opa.eyes.EXTRA_DOWNLOAD_LANGUAGE_METADATA");
        if (stringExtra != null) {
            try {
                return C58833ax.m90834k((C62590x) C62942bv.parseFrom((C62942bv) C62590x.f168982b, C63088z.m96139A(Base64.decode(stringExtra, 8)), C62921ba.m95368a()));
            } catch (C62974ct | IllegalArgumentException e) {
                ((C58970a) ((C58970a) ((C58970a) f76548a.mo56226d()).mo56382g(e)).mo56372aa(50265)).mo56386p("Could not set DownloadLanguageActionData");
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: e */
    public static void m52419e(Context context) {
        String packageName = context.getPackageName();
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", packageName, (String) null));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (RuntimeException e) {
            ((C58970a) ((C58970a) ((C58970a) f76548a.mo56225c()).mo56382g(e)).mo56372aa(50268)).mo56386p("Failed to launch Application Settings dialog");
        }
    }

    /* renamed from: f */
    public static void m52420f(Context context, String str, Locale locale, Locale locale2) {
        Intent component = new Intent().setAction("android.intent.action.EDIT").addFlags(32).setComponent(new ComponentName(str, "com.google.android.apps.translate.TranslateAPIReceiver"));
        String languageTag = locale.toLanguageTag();
        String languageTag2 = locale2.toLanguageTag();
        context.sendBroadcast(component.setData(Uri.parse("googletranslate:///lang_pair?source=" + languageTag + "&target=" + languageTag2)));
    }

    /* renamed from: g */
    public static boolean m52421g(String str) {
        return str.matches("MT:[A-Z0-9.-]{19,}((\\*[A-Z0-9.-]{19,})+)?");
    }

    /* renamed from: h */
    public static boolean m52422h(String str) {
        return str.toLowerCase(Locale.US).startsWith("fido:/");
    }

    /* renamed from: i */
    public static byte[] m52423i(Intent intent, String str) {
        String stringExtra = intent.getStringExtra(str);
        return stringExtra != null ? Base64.decode(stringExtra, 8) : new byte[0];
    }
}
