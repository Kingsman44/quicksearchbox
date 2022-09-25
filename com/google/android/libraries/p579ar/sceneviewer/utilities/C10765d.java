package com.google.android.libraries.p579ar.sceneviewer.utilities;

import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import com.google.common.p4526f.C59052c;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.Scanner;

/* renamed from: com.google.android.libraries.ar.sceneviewer.utilities.d */
/* compiled from: PG */
final class C10765d extends Thread {

    /* renamed from: a */
    public final WeakReference f35726a;

    /* renamed from: b */
    private final URL f35727b;

    /* renamed from: c */
    private final Handler f35728c;

    public C10765d(URL url, WeakReference weakReference, Handler handler) {
        this.f35727b = url;
        this.f35726a = weakReference;
        this.f35728c = handler;
    }

    public final void run() {
        InputStream openStream;
        int indexOf;
        Spanned spannedString = new SpannedString(this.f35727b.getAuthority());
        try {
            openStream = this.f35727b.openStream();
            String next = new Scanner(openStream).useDelimiter("</title>").next();
            int indexOf2 = next.indexOf("<title");
            if (!(indexOf2 == -1 || (indexOf = next.indexOf(">", indexOf2 + 6)) == -1)) {
                spannedString = Html.fromHtml(next.substring(indexOf + 1), 63);
            }
            if (openStream != null) {
                openStream.close();
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) WebUtilities.logger.mo56225c()).mo56382g(e)).mo56372aa(42395)).mo56386p("Unable to load title of link.");
        } catch (Throwable th) {
            WebUtilities$PageTitleThread$$ExternalSyntheticBackport0.m25754m(th, th);
        }
        this.f35728c.post(new WebUtilities$PageTitleThread$$ExternalSyntheticLambda1(this, spannedString));
        return;
        throw th;
    }
}
