package com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.hotword.C92354c;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42787k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59315ac;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.e.g */
/* compiled from: PG */
public final class C92513g {

    /* renamed from: a */
    public static final C59071e f258190a = C59071e.m91332i("com.google.android.apps.gsa.speech.microdetection.a.e.g");

    /* renamed from: b */
    public static final Map f258191b = new HashMap();

    /* renamed from: c */
    static final C90584f f258192c = C90584f.OK_GOOGLE;

    /* renamed from: d */
    private static final Map f258193d;

    /* renamed from: e */
    private static final Map f258194e;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("Ok Google", C90584f.OK_GOOGLE);
        gzVar.mo55429h("X Google", C90584f.OK_HEY_GOOGLE);
        f258193d = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C90584f.OK_GOOGLE, "hotword.data");
        gzVar2.mo55429h(C90584f.OK_HEY_GOOGLE, "x_hotword.data");
        f258194e = gzVar2.mo55427f(false);
    }

    /* renamed from: a */
    public static C90584f m152172a(String str) {
        C90584f fVar = (C90584f) f258193d.get(str);
        if (fVar == null) {
            fVar = f258192c;
            C59104x d = f258190a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
            ((C59052c) ((C59052c) d).mo56372aa(12746)).mo56389s("No modelType found for keyphrase %s", str);
            int i = C90755l.f253831a;
        }
        C58976aa aaVar = C58975e.f156826a;
        return fVar;
    }

    /* renamed from: b */
    public static C60870cx m152173b(String str, C90584f fVar, C29409fd fdVar) {
        String c = C92354c.m151657c(str, fVar);
        C28804cs f = C28805ct.m53747f();
        f.mo34449c(c);
        C60870cx f2 = fdVar.mo34717f(f.mo34447a());
        C92512f fVar2 = new C92512f(c, str);
        return C60922j.m93044g(f2, C47810es.m84963c(fVar2), C60826bg.f164896a);
    }

    /* renamed from: c */
    public static File m152174c(Context context, String str, C90584f fVar) {
        String d = m152175d(context, str, fVar);
        if (!d.isEmpty()) {
            return new File(d);
        }
        return null;
    }

    /* renamed from: e */
    public static void m152176e(Context context, String str) {
        Intent intent = new Intent("com.google.android.googlequicksearchbox.interactor.HOTWORD_MODEL_DOWNLOADED");
        intent.setPackage(str);
        context.sendBroadcast(intent);
        C58976aa aaVar = C58975e.f156826a;
    }

    @Deprecated
    /* renamed from: f */
    public static byte[] m152177f(Context context, String str, String str2, C90584f fVar) {
        Map map = f258191b;
        if (map.containsKey(str)) {
            return (byte[]) map.get(str);
        }
        C58976aa aaVar = C58975e.f156826a;
        if (!URLUtil.isValidUrl(str)) {
            return m152179h(context, str);
        }
        File c = m152174c(context, str2, fVar);
        if (c == null) {
            return null;
        }
        try {
            return new C59315ac(c).mo56803a();
        } catch (IOException e) {
            C59104x c2 = f258190a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(12760)).mo56389s("No model available at %s", c.getAbsolutePath());
            return null;
        }
    }

    /* renamed from: g */
    public static byte[] m152178g(C42813k kVar, Uri uri) {
        C59104x b = f258190a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
        ((C59052c) ((C59052c) b).mo56372aa(12757)).mo56389s("#getHotwordModelFromMobstore [mobstoreUri: %s]", uri);
        try {
            return (byte[]) kVar.mo45889c(uri, new C42787k());
        } catch (IOException e) {
            C59104x c = f258190a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12758)).mo56389s("Mobstore dereference of hotword model failed: %s", uri);
            return null;
        }
    }

    /* renamed from: h */
    public static byte[] m152179h(Context context, String str) {
        byte[] bArr;
        try {
            InputStream open = context.getAssets().open(str);
            bArr = new byte[open.available()];
            try {
                open.read(bArr);
                open.close();
            } catch (IOException e) {
                e = e;
                C59104x c = f258190a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(12759)).mo56389s("No model available at location: %s", str);
                return bArr;
            } catch (Throwable th) {
                open.close();
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            bArr = null;
            C59104x c2 = f258190a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(12759)).mo56389s("No model available at location: %s", str);
            return bArr;
        }
        return bArr;
    }

    /* renamed from: i */
    public static C60870cx m152180i(int i, String str, C29409fd fdVar) {
        C28804cs f = C28805ct.m53747f();
        f.mo34449c(C92354c.m151659e(i, str));
        C60870cx f2 = fdVar.mo34717f(f.mo34447a());
        C92511e eVar = C92511e.f258187a;
        return C60922j.m93044g(f2, C47810es.m84963c(eVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public static String m152175d(Context context, String str, C90584f fVar) {
        boolean z = context == null;
        if (z || str == null) {
            C59104x d = f258190a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
            ((C59052c) ((C59052c) d).mo56372aa(12750)).mo56359L("Cannot load hotword model [isNullContext: %b, locale: %s, modelType: %s]", Boolean.valueOf(z), str, fVar);
            return BuildConfig.FLAVOR;
        }
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            C59104x d2 = f258190a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
            ((C59052c) ((C59052c) d2).mo56372aa(12753)).mo56386p("getFilesDir returned null");
            return BuildConfig.FLAVOR;
        }
        String absolutePath = filesDir.getAbsolutePath();
        if (absolutePath == null) {
            C59104x d3 = f258190a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
            ((C59052c) ((C59052c) d3).mo56372aa(12752)).mo56386p("Absolute path is null");
            return BuildConfig.FLAVOR;
        }
        File file = new File(absolutePath + "/" + str);
        file.mkdirs();
        String str2 = (String) f258194e.get(fVar);
        if (str2 == null) {
            C59104x d4 = f258190a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "MicroModelsUtil");
            ((C59052c) ((C59052c) d4).mo56372aa(12751)).mo56386p("Incorrect model type");
            int i = C90755l.f253831a;
            return BuildConfig.FLAVOR;
        }
        String absolutePath2 = file.getAbsolutePath();
        return absolutePath2 + "/" + str2;
    }
}
