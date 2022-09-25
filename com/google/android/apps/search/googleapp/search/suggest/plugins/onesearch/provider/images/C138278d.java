package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images;

import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.d */
/* compiled from: PG */
final class C138278d extends UrlRequest.Callback {

    /* renamed from: a */
    private final File f376220a;

    /* renamed from: b */
    private final SettableFuture f376221b;

    /* renamed from: c */
    private final Boolean f376222c;

    /* renamed from: d */
    private FileChannel f376223d;

    public C138278d(File file, SettableFuture settableFuture, Boolean bool) {
        this.f376220a = file;
        this.f376221b = settableFuture;
        this.f376222c = bool;
    }

    /* renamed from: a */
    private static String m224633a(UrlResponseInfo urlResponseInfo, String str) {
        List list = (List) urlResponseInfo.getAllHeaders().get(str);
        if (list == null) {
            return null;
        }
        return (String) C58557jl.m90133n(list);
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        SettableFuture settableFuture;
        try {
            FileChannel fileChannel = this.f376223d;
            if (fileChannel != null) {
                fileChannel.close();
            }
            settableFuture = this.f376221b;
        } catch (IOException e) {
            e.getMessage();
            settableFuture = this.f376221b;
        } catch (Throwable th) {
            this.f376221b.cancel(false);
            throw th;
        }
        settableFuture.cancel(false);
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        SettableFuture settableFuture;
        try {
            FileChannel fileChannel = this.f376223d;
            if (fileChannel != null) {
                fileChannel.close();
            }
            settableFuture = this.f376221b;
        } catch (IOException e) {
            e.getMessage();
            settableFuture = this.f376221b;
        } catch (Throwable th) {
            this.f376221b.mo57357o(cronetException);
            throw th;
        }
        settableFuture.mo57357o(cronetException);
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        FileChannel fileChannel = this.f376223d;
        fileChannel.getClass();
        fileChannel.write(byteBuffer);
        byteBuffer.flip();
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (httpStatusCode == 200 || httpStatusCode == 206) {
            try {
                this.f376223d = new FileOutputStream(this.f376220a, this.f376222c.booleanValue()).getChannel();
                String a = m224633a(urlResponseInfo, "Content-Length");
                if (this.f376222c.booleanValue()) {
                    this.f376220a.length();
                }
                if (a != null) {
                    Long.parseLong(a);
                }
                String a2 = m224633a(urlResponseInfo, "Content-Length");
                int i = 32768;
                if (a2 != null) {
                    long parseLong = Long.parseLong(a2);
                    if (parseLong <= 2147483647L) {
                        i = Math.max(Math.min((int) parseLong, 32768), 1);
                    }
                }
                urlRequest.read(ByteBuffer.allocateDirect(i));
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C138279e.f376224a.mo56225c()).mo56382g(e)).mo56372aa(41146)).mo56386p("Error in open file");
                this.f376221b.cancel(false);
            }
        } else {
            this.f376221b.cancel(false);
        }
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        try {
            FileChannel fileChannel = this.f376223d;
            fileChannel.getClass();
            fileChannel.close();
            this.f376221b.mo57356n(this.f376220a);
            m224633a(urlResponseInfo, "content-type");
        } catch (IOException e) {
            this.f376221b.mo57357o(e);
        }
    }
}
