package com.google.android.libraries.p579ar.faceviewer.utils;

import androidx.p104d.p105a.C2164c;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.google.android.libraries.ar.faceviewer.utils.b */
/* compiled from: PG */
final class C10669b extends UrlRequest.Callback {

    /* renamed from: a */
    private final C2164c f35591a;

    /* renamed from: b */
    private final File f35592b;

    /* renamed from: c */
    private FileChannel f35593c;

    /* renamed from: d */
    private Exception f35594d;

    public C10669b(C2164c cVar, File file) {
        this.f35591a = cVar;
        this.f35592b = file;
    }

    /* renamed from: a */
    private final boolean m25667a() {
        FileChannel fileChannel = this.f35593c;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException e) {
                this.f35594d = e;
            }
            this.f35593c = null;
        }
        Exception exc = this.f35594d;
        if (exc == null) {
            return true;
        }
        this.f35591a.mo5439d(exc);
        return false;
    }

    /* renamed from: b */
    private static final void m25668b(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int receivedByteCount = (int) urlResponseInfo.getReceivedByteCount();
        if (receivedByteCount <= 0) {
            receivedByteCount = 8192;
        }
        urlRequest.read(ByteBuffer.allocateDirect(receivedByteCount));
    }

    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (m25667a()) {
            this.f35591a.mo5438c();
        }
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (m25667a()) {
            this.f35591a.mo5439d(cronetException);
        }
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        try {
            this.f35593c.write(byteBuffer);
            m25668b(urlRequest, urlResponseInfo);
        } catch (IOException e) {
            this.f35594d = e;
            urlRequest.cancel();
        }
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        try {
            this.f35593c = FileChannel.open(this.f35592b.toPath(), new OpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.WRITE});
            m25668b(urlRequest, urlResponseInfo);
        } catch (IOException e) {
            this.f35593c = null;
            this.f35594d = e;
            urlRequest.cancel();
        }
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (m25667a()) {
            this.f35591a.mo5437b(true);
        }
    }
}
