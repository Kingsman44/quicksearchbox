package com.google.ads.interactivemedia.p367v3.internal;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aen */
/* compiled from: PG */
public final class aen {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f20447a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Object f20448b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static boolean f20449c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static long f20450d = 0;

    /* renamed from: e */
    private static final String f20451e = "time.android.com";

    /* renamed from: a */
    public static boolean m18440a() {
        boolean z;
        synchronized (f20448b) {
            z = f20449c;
        }
        return z;
    }

    /* renamed from: b */
    public static long m18441b() {
        long j;
        synchronized (f20448b) {
            j = f20449c ? f20450d : -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: c */
    public static void m18442c(ada ada, aek aek) {
        if (m18440a()) {
            aek.mo14587a();
            return;
        }
        if (ada == null) {
            ada = new ada("SntpClient");
        }
        ada.mo14471e(new aem((byte[]) null), new ael(aek), 1);
    }

    /* renamed from: g */
    static /* synthetic */ long m18446g() {
        String str;
        DatagramSocket datagramSocket;
        long j;
        synchronized (f20448b) {
            str = f20451e;
        }
        InetAddress byName = InetAddress.getByName(str);
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j = currentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j2 = currentTimeMillis / 1000;
                Long.signum(j2);
                long j3 = currentTimeMillis - (j2 * 1000);
                long j4 = j2 + 2208988800L;
                j = currentTimeMillis;
                bArr[40] = (byte) ((int) (j4 >> 24));
                bArr[41] = (byte) ((int) (j4 >> 16));
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) ((int) (j4 >> 8));
                    bArr[43] = (byte) ((int) j4);
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) ((int) (j5 >> 24));
                    bArr[45] = (byte) ((int) (j5 >> 16));
                    bArr[46] = (byte) ((int) (j5 >> 8));
                    bArr[47] = (byte) ((int) (Math.random() * 255.0d));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                    } catch (Throwable th3) {
                        auf.m19649a(th2, th3);
                    }
                    throw th2;
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j6 = j + (elapsedRealtime2 - elapsedRealtime);
            byte b = bArr[0];
            int i = (b >> 6) & 3;
            byte b2 = b & 7;
            byte b3 = bArr[1] & 255;
            long j7 = m18449j(bArr, 24);
            long j8 = m18449j(bArr, 32);
            long j9 = m18449j(bArr, 40);
            if (i != 3) {
                if (b2 != 4) {
                    if (b2 != 5) {
                        StringBuilder sb = new StringBuilder(26);
                        sb.append("SNTP: Untrusted mode: ");
                        sb.append(b2);
                        throw new IOException(sb.toString());
                    }
                }
                if (b3 == 0 || b3 > 15) {
                    StringBuilder sb2 = new StringBuilder(36);
                    sb2.append("SNTP: Untrusted stratum: ");
                    sb2.append(b3);
                    throw new IOException(sb2.toString());
                } else if (j9 != 0) {
                    long j10 = ((j8 - j7) + (j9 - j6)) / 2;
                    datagramSocket.close();
                    return (j6 + j10) - elapsedRealtime2;
                } else {
                    throw new IOException("SNTP: Zero transmitTime");
                }
            } else {
                throw new IOException("SNTP: Unsynchronized server");
            }
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
            Throwable th22 = th;
            datagramSocket.close();
            throw th22;
        }
    }

    /* renamed from: j */
    private static long m18449j(byte[] bArr, int i) {
        long k = m18450k(bArr, i);
        long k2 = m18450k(bArr, i + 4);
        if (k == 0) {
            if (k2 == 0) {
                return 0;
            }
            k = 0;
        }
        return ((k - 2208988800L) * 1000) + ((k2 * 1000) / 4294967296L);
    }

    /* renamed from: k */
    private static long m18450k(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        byte b5 = b & true;
        int i2 = b;
        if (b5 == true) {
            i2 = (b & Byte.MAX_VALUE) + 128;
        }
        byte b6 = b2 & true;
        int i3 = b2;
        if (b6 == true) {
            i3 = (b2 & Byte.MAX_VALUE) + 128;
        }
        byte b7 = b3 & true;
        int i4 = b3;
        if (b7 == true) {
            i4 = (b3 & Byte.MAX_VALUE) + 128;
        }
        byte b8 = b4 & true;
        int i5 = b4;
        if (b8 == true) {
            i5 = (b4 & Byte.MAX_VALUE) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }
}
