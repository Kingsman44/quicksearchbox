package com.google.android.libraries.abuse.reporting;

import android.net.Uri;
import android.os.AsyncTask;
import androidx.p060c.C0984n;
import com.google.android.gms.auth.C142903e;
import java.io.IOException;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* renamed from: com.google.android.libraries.abuse.reporting.p */
/* compiled from: PG */
final class C146747p extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ ReportAbuseActivity f396273a;

    public C146747p(ReportAbuseActivity reportAbuseActivity) {
        this.f396273a = reportAbuseActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            ReportAbuseActivity reportAbuseActivity = this.f396273a;
            C146711a aVar = reportAbuseActivity.f396165q;
            String str = reportAbuseActivity.f396151C;
            String str2 = reportAbuseActivity.f396167s;
            String str3 = reportAbuseActivity.f396168t;
            UrlRequest.Callback callback = reportAbuseActivity.f396162n;
            Uri.Builder appendPath = aVar.f396200d.buildUpon().appendPath("v1").appendPath("configuration").appendPath(str2);
            if (str3 != null) {
                appendPath.appendQueryParameter("language", str3);
            }
            UrlRequest.Builder newUrlRequestBuilder = ((CronetEngine) aVar.f396199c.mo123575b()).newUrlRequestBuilder(appendPath.build().toString(), callback, aVar.f396198b);
            int i = 0;
            while (true) {
                C0984n nVar = C146711a.f396197a;
                if (i < nVar.f3122d) {
                    newUrlRequestBuilder.addHeader((String) nVar.mo3702e(i), (String) C146711a.f396197a.mo3708h(i));
                    i++;
                } else {
                    newUrlRequestBuilder.setHttpMethod("GET");
                    aVar.mo123541a(newUrlRequestBuilder, str);
                    newUrlRequestBuilder.build().start();
                    return null;
                }
            }
        } catch (C142903e | IOException e) {
            this.f396273a.mo123512k(e, 1000);
            return null;
        }
    }
}
