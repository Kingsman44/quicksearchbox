package p5488io.grpc.p5523c;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.UrlResponseInfo;
import p5488io.grpc.C70251bv;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70676lv;

/* renamed from: io.grpc.c.f */
/* compiled from: PG */
final class C70262f extends BidirectionalStream.Callback {

    /* renamed from: a */
    final /* synthetic */ C70266j f187282a;

    /* renamed from: b */
    private List f187283b;

    public C70262f(C70266j jVar) {
        this.f187282a = jVar;
    }

    /* renamed from: a */
    private final void m102414a(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add((String) entry.getKey());
            arrayList.add((String) entry.getValue());
        }
        byte[][] bArr = new byte[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((String) arrayList.get(i)).getBytes(Charset.forName("UTF-8"));
            int i2 = i + 1;
            bArr[i2] = ((String) arrayList.get(i2)).getBytes(Charset.forName("UTF-8"));
        }
        C70334de c = C70251bv.m102400c(C70676lv.m103339b(bArr));
        C70265i iVar = this.f187282a.f187314o;
        int i3 = C70265i.f187288i;
        synchronized (iVar.f187289a) {
            C70265i iVar2 = this.f187282a.f187314o;
            if (z) {
                iVar2.mo62184r(c);
            } else {
                iVar2.mo62183q(c);
            }
        }
    }

    public final void onCanceled(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        Status status;
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onCanceled");
        }
        C70265i iVar = this.f187282a.f187314o;
        int i = C70265i.f187288i;
        synchronized (iVar.f187289a) {
            status = this.f187282a.f187314o.f187293e;
            if (status == null) {
                if (urlResponseInfo != null) {
                    status = C70460dv.m102873a(urlResponseInfo.getHttpStatusCode());
                } else {
                    status = Status.f186904b.withDescription("stream cancelled without reason");
                }
            }
        }
        C70266j jVar = this.f187282a;
        jVar.f187308i.mo61930a(jVar, status);
    }

    public final void onFailed(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onFailed");
        }
        C70266j jVar = this.f187282a;
        jVar.f187308i.mo61930a(jVar, Status.f186916n.mo61678e(cronetException));
    }

    public final void onReadCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        List list;
        byteBuffer.flip();
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            int remaining = byteBuffer.remaining();
            Log.v("grpc-java-cronet", "onReadCompleted. Size=" + remaining);
        }
        C70265i iVar = this.f187282a.f187314o;
        int i = C70265i.f187288i;
        synchronized (iVar.f187289a) {
            this.f187282a.f187314o.f187294f = z;
            if (byteBuffer.remaining() != 0) {
                this.f187282a.f187314o.mo61923f(byteBuffer);
            }
        }
        if (z && (list = this.f187283b) != null) {
            m102414a(list, true);
        }
    }

    public final void onResponseHeadersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onResponseHeadersReceived. Header=".concat(String.valueOf(String.valueOf(urlResponseInfo.getAllHeadersAsList()))));
            Log.v("grpc-java-cronet", "BidirectionalStream.read");
        }
        m102414a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(ByteBuffer.allocateDirect(4096));
    }

    public final void onResponseTrailersReceived(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        List asList = headerBlock.getAsList();
        this.f187283b = asList;
        C70265i iVar = this.f187282a.f187314o;
        int i = C70265i.f187288i;
        synchronized (iVar.f187289a) {
            z = this.f187282a.f187314o.f187294f;
        }
        if (z) {
            m102414a(asList, true);
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onResponseTrailersReceived. Trailer=".concat(String.valueOf(asList.toString())));
        }
    }

    public final void onStreamReady(BidirectionalStream bidirectionalStream) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onStreamReady");
        }
        C70265i iVar = this.f187282a.f187314o;
        int i = C70265i.f187288i;
        synchronized (iVar.f187289a) {
            this.f187282a.f187314o.mo61921d();
            C70265i iVar2 = this.f187282a.f187314o;
            iVar2.f187291c = true;
            for (C70263g gVar : iVar2.f187290b) {
                iVar2.f187296h.mo61927u(gVar.f187284a, gVar.f187285b, gVar.f187286c);
            }
            iVar2.f187290b.clear();
        }
    }

    public final void onSucceeded(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        boolean z;
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onSucceeded");
        }
        C70265i iVar = this.f187282a.f187314o;
        int i = C70265i.f187288i;
        synchronized (iVar.f187289a) {
            z = false;
            if (this.f187283b != null && this.f187282a.f187314o.f187294f) {
                z = true;
            }
        }
        if (!z) {
            List list = this.f187283b;
            if (list != null) {
                m102414a(list, true);
            } else if (urlResponseInfo != null) {
                m102414a(urlResponseInfo.getAllHeadersAsList(), true);
            } else {
                throw new AssertionError("No response header or trailer");
            }
        }
        C70266j jVar = this.f187282a;
        jVar.f187308i.mo61930a(jVar, C70460dv.m102873a(urlResponseInfo.getHttpStatusCode()));
    }

    public final void onWriteCompleted(BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "onWriteCompleted");
        }
        C70265i iVar = this.f187282a.f187314o;
        int i = C70265i.f187288i;
        synchronized (iVar.f187289a) {
            C70266j jVar = this.f187282a;
            C70265i iVar2 = jVar.f187314o;
            if (!iVar2.f187295g) {
                iVar2.f187295g = true;
                jVar.f187305f.mo62413b();
            }
            this.f187282a.f187314o.mo62324m(byteBuffer.position());
        }
    }
}
