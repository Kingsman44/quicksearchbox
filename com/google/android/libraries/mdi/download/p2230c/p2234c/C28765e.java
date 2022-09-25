package com.google.android.libraries.mdi.download.p2230c.p2234c;

import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.libraries.mdi.download.c.c.e */
/* compiled from: PG */
public final /* synthetic */ class C28765e implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C28766f f78194a;

    /* renamed from: b */
    public final /* synthetic */ String f78195b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f78196c;

    public /* synthetic */ C28765e(C28766f fVar, String str, C58833ax axVar) {
        this.f78194a = fVar;
        this.f78195b = str;
        this.f78196c = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx h;
        C28766f fVar = this.f78194a;
        String str = this.f78195b;
        C58833ax axVar = this.f78196c;
        C29045l.m53931c("%s: Fetch the latest ETag; url = %s", "OffroadFileDownloader", str);
        HttpURLConnection a = fVar.f78198b.mo124200a(str);
        a.setRequestMethod("HEAD");
        if (axVar.mo56113h()) {
            a.setRequestProperty("If-None-Match", (String) axVar.mo56107c());
        }
        try {
            a.connect();
            int responseCode = a.getResponseCode();
            if (responseCode == 304) {
                C29045l.m53930b("%s: Got HTTP_RESPONSE_NOT_MODIFIED, reuse cache.", "OffroadFileDownloader");
            } else if (responseCode == 200) {
                C29045l.m53930b("%s: Got HTTP_RESPONSE_OK, updating cache.", "OffroadFileDownloader");
                axVar = C58833ax.m90833j(a.getHeaderField("ETag"));
            } else {
                C28736bn bnVar = new C28736bn();
                bnVar.f78062a = C28737bo.ANDROID_DOWNLOADER_HTTP_ERROR;
                bnVar.f78063b = "Http request failed; code = " + responseCode;
                h = C60856cj.m92899h(bnVar.mo34334a());
                a.disconnect();
                return h;
            }
            a.disconnect();
            return C60856cj.m92900i(axVar);
        } catch (IOException e) {
            C28736bn bnVar2 = new C28736bn();
            bnVar2.f78062a = C28737bo.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
            bnVar2.f78063b = "Failed while connecting to " + str;
            bnVar2.f78064c = e;
            h = C60856cj.m92899h(bnVar2.mo34334a());
        } catch (Throwable th) {
            a.disconnect();
            throw th;
        }
    }
}
