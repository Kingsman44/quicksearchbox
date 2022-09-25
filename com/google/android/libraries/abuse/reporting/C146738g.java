package com.google.android.libraries.abuse.reporting;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* renamed from: com.google.android.libraries.abuse.reporting.g */
/* compiled from: PG */
public final class C146738g extends UrlRequest.Callback {

    /* renamed from: a */
    private final C146736e f396258a = new C146736e();

    /* renamed from: b */
    private final C146733b f396259b;

    /* renamed from: c */
    private String f396260c;

    public C146738g(C146733b bVar) {
        this.f396259b = bVar;
    }

    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.f396259b.mo123570a(cronetException);
    }

    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            urlRequest.read(byteBuffer);
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f396258a.mo123572a(allocateDirect);
        urlRequest.read(allocateDirect);
    }

    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        urlRequest.followRedirect();
    }

    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
        this.f396258a.mo123572a(allocateDirect);
        urlRequest.read(allocateDirect);
    }

    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ByteBuffer byteBuffer;
        C146736e eVar = this.f396258a;
        int i = 0;
        if (eVar.f396256a.isEmpty()) {
            byteBuffer = ByteBuffer.allocateDirect(0);
        } else if (eVar.f396256a.size() == 1) {
            byteBuffer = (ByteBuffer) eVar.f396256a.get(0);
            byteBuffer.flip();
        } else {
            for (ByteBuffer byteBuffer2 : eVar.f396256a) {
                byteBuffer2.flip();
                i += byteBuffer2.remaining();
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
            for (ByteBuffer put : eVar.f396256a) {
                allocateDirect.put(put);
            }
            allocateDirect.flip();
            eVar.f396256a = new ArrayList();
            byteBuffer = allocateDirect;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        try {
            this.f396260c = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            onFailed(urlRequest, urlResponseInfo, new C146735d(e));
        }
        this.f396259b.mo123571b(this.f396260c);
    }
}
