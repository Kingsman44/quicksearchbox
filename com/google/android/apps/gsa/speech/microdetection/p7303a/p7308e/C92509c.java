package com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e;

import android.content.Context;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.e.c */
/* compiled from: PG */
public final class C92509c {

    /* renamed from: a */
    private static final C58974d f258185a = C58974d.m91136j();

    /* renamed from: a */
    public static String m152171a(String str, C90584f fVar, Context context, C29409fd fdVar, C42813k kVar, boolean z) {
        if (!z) {
            return C92513g.m152175d(context, str, fVar);
        }
        try {
            String str2 = (String) C90877ak.m148472f(C92513g.m152173b(str, fVar, fdVar));
            if (str2 == null) {
                ((C58970a) ((C58970a) f258185a.mo56225c()).mo56372aa(12744)).mo56386p("mobstoreUri is null!");
                return BuildConfig.FLAVOR;
            }
            Uri parse = Uri.parse(str2);
            C42788l lVar = new C42788l();
            lVar.f112052a = true;
            return ((File) kVar.mo45889c(parse, lVar)).getAbsolutePath();
        } catch (IOException | ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) f258185a.mo56226d()).mo56382g(e)).mo56372aa(12742)).mo56354G("Mobstore URI dereference failed for locale %s, model %s. Proceeding without hotword model.", str, fVar.name());
            return BuildConfig.FLAVOR;
        } catch (InterruptedException e2) {
            ((C58970a) ((C58970a) ((C58970a) f258185a.mo56226d()).mo56382g(e2)).mo56372aa(12743)).mo56354G("Mobstore URI dereference interrupted for locale %s, model %s. Proceeding without hotword model.", str, fVar.name());
            Thread.currentThread().interrupt();
            return BuildConfig.FLAVOR;
        }
    }
}
