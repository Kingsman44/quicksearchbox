package com.google.android.apps.gsa.speech.hotword.p7285c.p7286a;

import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.l;
import com.google.android.apps.gsa.shared.p7045k.C89809e;
import com.google.android.apps.gsa.shared.p7045k.C89824t;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7287b.C92361a;
import com.google.android.apps.gsa.speech.hotword.p7285c.p7288c.C92370h;
import com.google.common.base.C58894dd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;

/* renamed from: com.google.android.apps.gsa.speech.hotword.c.a.a */
/* compiled from: PG */
public final class C92356a {

    /* renamed from: a */
    private static final C59071e f257490a = C59071e.m91332i("com.google.android.apps.gsa.speech.hotword.c.a.a");

    /* renamed from: b */
    private final C92359d f257491b;

    /* renamed from: c */
    private final C92371d f257492c;

    public C92356a(C92359d dVar, C92371d dVar2) {
        this.f257491b = dVar;
        this.f257492c = dVar2;
    }

    /* renamed from: a */
    public final boolean mo87003a(l lVar, C92361a aVar, String str, C92391o oVar, boolean z) {
        String str2;
        int i;
        l lVar2 = lVar;
        C92361a aVar2 = aVar;
        C92391o oVar2 = oVar;
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            C92361a aVar3 = C92361a.ENROLL_CLOUD;
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                throw new C58894dd("This function should not be called with ENROLL_CLOUD action! Call enrollCloudWithRetries directly.");
            } else if (ordinal == 1) {
                throw new C58894dd("This function should not be called with AUTH_TOKEN_CHECK action! Call the getAuthTokenCheckResponseWithRetry directly.");
            } else if (ordinal != 2 && ordinal != 3) {
                return false;
            } else {
                if (z) {
                    ((C59052c) ((C59052c) f257490a.mo56224b()).mo56372aa(12577)).mo56386p("pass device can enroll check for Oobe");
                    if (aVar2 == C92361a.IS_SPEAKER_ID_SUPPORTED_CHECK) {
                        lVar2.g(1);
                    } else {
                        lVar2.e(1);
                    }
                    return true;
                }
                String d = lVar.d();
                C92361a aVar4 = C92361a.IS_SPEAKER_ID_SUPPORTED_CHECK;
                C92359d dVar = this.f257491b;
                if (oVar2 != null) {
                    str2 = oVar2.f257645c;
                } else {
                    str2 = dVar.f257501c.mo79674h(str);
                }
                String str3 = str2;
                if (str3 == null) {
                    ((C59052c) ((C59052c) C92359d.f257499a.mo56226d()).mo56372aa(12587)).mo56386p("Account was null.");
                } else {
                    C89824t tVar = lVar2.a;
                    tVar.getClass();
                    C89809e a = tVar.mo83663a();
                    String a2 = C92370h.m151688a(a);
                    try {
                        ((C59052c) ((C59052c) C92359d.f257499a.mo56224b()).mo56372aa(12585)).mo56354G("Send can enroll request to device [id=%s] over %s", a.mo83648d(), true != a.mo83656j() ? "HTTP" : "HTTPS");
                        C60870cx b = dVar.f257503e.mo87018b(a.mo83656j(), new URL(a2), aVar, str3, (String) null);
                        C89824t tVar2 = lVar2.a;
                        tVar2.getClass();
                        dVar.f257500b.mo85147l(b, new C92357b(dVar, tVar2.mo83663a().mo83649e(), lVar2, aVar2));
                    } catch (IOException | JSONException e) {
                        ((C59052c) ((C59052c) ((C59052c) C92359d.f257499a.mo56225c()).mo56382g(e)).mo56372aa(12586)).mo56386p("Exception: ");
                    }
                }
                if (aVar2 == aVar4) {
                    try {
                        i = ((Integer) C90877ak.m148472f(lVar2.e)).intValue();
                    } catch (InterruptedException | ExecutionException e2) {
                        ((C59052c) ((C59052c) ((C59052c) f257490a.mo56225c()).mo56382g(e2)).mo56372aa(12576)).mo56354G("#checkCanEnroll [deviceName: %s action: %s]", d, aVar);
                        return false;
                    }
                } else {
                    i = ((Integer) C90877ak.m148472f(lVar2.d)).intValue();
                }
                if (i != 1) {
                    return false;
                }
                return true;
            }
        } else {
            ((C59052c) ((C59052c) f257490a.mo56226d()).mo56372aa(12579)).mo56386p("#handleGoogleHomeServiceActionOnDevice - no account found.");
            this.f257492c.mo87025f(C92362c.NO_ACCOUNT);
            return false;
        }
    }
}
