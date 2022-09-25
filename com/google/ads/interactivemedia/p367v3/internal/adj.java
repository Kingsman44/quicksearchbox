package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adj */
/* compiled from: PG */
public final class adj extends abr {

    /* renamed from: a */
    private final int f20360a = 8000;

    /* renamed from: b */
    private final byte[] f20361b;

    /* renamed from: c */
    private final DatagramPacket f20362c;

    /* renamed from: d */
    private Uri f20363d;

    /* renamed from: e */
    private DatagramSocket f20364e;

    /* renamed from: f */
    private MulticastSocket f20365f;

    /* renamed from: g */
    private InetAddress f20366g;

    /* renamed from: h */
    private InetSocketAddress f20367h;

    /* renamed from: i */
    private boolean f20368i;

    /* renamed from: j */
    private int f20369j;

    public adj() {
        super(true);
        byte[] bArr = new byte[SimpleSnackbar.LENGTH_SHORT];
        this.f20361b = bArr;
        this.f20362c = new DatagramPacket(bArr, 0, SimpleSnackbar.LENGTH_SHORT);
    }

    /* renamed from: a */
    public final int mo14388a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f20369j == 0) {
            try {
                this.f20364e.receive(this.f20362c);
                int length = this.f20362c.getLength();
                this.f20369j = length;
                mo14406i(length);
            } catch (IOException e) {
                throw new adi(e);
            }
        }
        int length2 = this.f20362c.getLength();
        int i3 = this.f20369j;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f20361b, length2 - i3, bArr, i, min);
        this.f20369j -= min;
        return min;
    }

    /* renamed from: c */
    public final long mo14389c(acb acb) {
        Uri uri = acb.f20241a;
        this.f20363d = uri;
        String host = uri.getHost();
        int port = this.f20363d.getPort();
        mo14404g(acb);
        try {
            this.f20366g = InetAddress.getByName(host);
            this.f20367h = new InetSocketAddress(this.f20366g, port);
            if (this.f20366g.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f20367h);
                this.f20365f = multicastSocket;
                multicastSocket.joinGroup(this.f20366g);
                this.f20364e = this.f20365f;
            } else {
                this.f20364e = new DatagramSocket(this.f20367h);
            }
            try {
                this.f20364e.setSoTimeout(8000);
                this.f20368i = true;
                mo14405h(acb);
                return -1;
            } catch (SocketException e) {
                throw new adi(e);
            }
        } catch (IOException e2) {
            throw new adi(e2);
        }
    }

    /* renamed from: d */
    public final Uri mo14390d() {
        return this.f20363d;
    }

    /* renamed from: f */
    public final void mo14391f() {
        this.f20363d = null;
        MulticastSocket multicastSocket = this.f20365f;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f20366g);
            } catch (IOException unused) {
            }
            this.f20365f = null;
        }
        DatagramSocket datagramSocket = this.f20364e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f20364e = null;
        }
        this.f20366g = null;
        this.f20367h = null;
        this.f20369j = 0;
        if (this.f20368i) {
            this.f20368i = false;
            mo14407j();
        }
    }
}
