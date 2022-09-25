package androidx.media3.p132b;

import android.net.Uri;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* renamed from: androidx.media3.b.ap */
/* compiled from: PG */
public final class C2497ap extends C2499c {

    /* renamed from: a */
    private final byte[] f6852a;

    /* renamed from: b */
    private final DatagramPacket f6853b;

    /* renamed from: c */
    private Uri f6854c;

    /* renamed from: d */
    private DatagramSocket f6855d;

    /* renamed from: e */
    private MulticastSocket f6856e;

    /* renamed from: f */
    private InetAddress f6857f;

    /* renamed from: g */
    private boolean f6858g;

    /* renamed from: h */
    private int f6859h;

    public C2497ap() {
        this((byte[]) null);
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f6859h == 0) {
            try {
                DatagramSocket datagramSocket = this.f6855d;
                datagramSocket.getClass();
                datagramSocket.receive(this.f6853b);
                int length = this.f6853b.getLength();
                this.f6859h = length;
                mo5927g(length);
            } catch (SocketTimeoutException e) {
                throw new C2496ao(e, 2002);
            } catch (IOException e2) {
                throw new C2496ao(e2, 2001);
            }
        }
        int length2 = this.f6853b.getLength();
        int i3 = this.f6859h;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f6852a, length2 - i3, bArr, i, min);
        this.f6859h -= min;
        return min;
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        Uri uri = nVar.f6891a;
        this.f6854c = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f6854c.getPort();
        mo5929i(nVar);
        try {
            this.f6857f = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f6857f, port);
            if (this.f6857f.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f6856e = multicastSocket;
                multicastSocket.joinGroup(this.f6857f);
                this.f6855d = this.f6856e;
            } else {
                this.f6855d = new DatagramSocket(inetSocketAddress);
            }
            this.f6855d.setSoTimeout(8000);
            this.f6858g = true;
            mo5930j(nVar);
            return -1;
        } catch (SecurityException e) {
            throw new C2496ao(e, 2006);
        } catch (IOException e2) {
            throw new C2496ao(e2, 2001);
        }
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f6854c;
    }

    /* renamed from: d */
    public final void mo5882d() {
        this.f6854c = null;
        MulticastSocket multicastSocket = this.f6856e;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f6857f;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f6856e = null;
        }
        DatagramSocket datagramSocket = this.f6855d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f6855d = null;
        }
        this.f6857f = null;
        this.f6859h = 0;
        if (this.f6858g) {
            this.f6858g = false;
            mo5928h();
        }
    }

    public C2497ap(byte[] bArr) {
        super(true);
        byte[] bArr2 = new byte[SimpleSnackbar.LENGTH_SHORT];
        this.f6852a = bArr2;
        this.f6853b = new DatagramPacket(bArr2, 0, SimpleSnackbar.LENGTH_SHORT);
    }
}
