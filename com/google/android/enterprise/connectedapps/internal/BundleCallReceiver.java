package com.google.android.enterprise.connectedapps.internal;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public final class BundleCallReceiver {

    /* renamed from: a */
    private final Map f386870a = new HashMap();

    /* renamed from: b */
    private final Map f386871b = new HashMap();

    /* renamed from: c */
    private final Map f386872c = new HashMap();

    /* renamed from: d */
    private final Map f386873d = new HashMap();

    /* renamed from: e */
    private final Map f386874e = new HashMap();

    /* renamed from: b */
    static boolean m231179b(byte[] bArr) {
        return bArr[0] == 2;
    }

    /* renamed from: a */
    public final void mo117193a(long j, int i, int i2, byte[] bArr) {
        Map map = this.f386870a;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            this.f386870a.put(valueOf, new byte[i2]);
            this.f386871b.put(valueOf, 0);
        }
        System.arraycopy(bArr, 0, this.f386870a.get(valueOf), i * 250000, 250000);
        Map map2 = this.f386871b;
        map2.put(valueOf, Integer.valueOf(((Integer) map2.get(valueOf)).intValue() + 1 + i));
    }

    /* renamed from: c */
    public final byte[] mo117194c(long j, int i) {
        Map map = this.f386872c;
        Long valueOf = Long.valueOf(j);
        byte[] bArr = (byte[]) map.get(valueOf);
        int length = bArr.length;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i * 250000, Math.min(length, (i + 1) * 250000));
        double d = (double) length;
        Double.isNaN(d);
        if (i == ((int) Math.ceil(d / 250000.0d)) - 1) {
            this.f386872c.remove(valueOf);
        }
        return copyOfRange;
    }

    /* renamed from: d */
    public final Bundle mo117195d(long j) {
        return (Bundle) this.f386874e.remove(Long.valueOf(j));
    }

    /* renamed from: e */
    public final void mo117196e(long j, Bundle bundle) {
        Map map = this.f386873d;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            this.f386873d.put(valueOf, bundle);
            return;
        }
        throw new IllegalStateException("Already prepared bundle for call " + j);
    }

    public Bundle getPreparedCall(long j, int i, byte[] bArr) {
        if (m231179b(bArr)) {
            return (Bundle) this.f386873d.remove(Long.valueOf(j));
        }
        if (i > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                i2++;
                i3 += i2;
            }
            Map map = this.f386871b;
            Long valueOf = Long.valueOf(j);
            if (!map.containsKey(valueOf) || i3 != ((Integer) this.f386871b.get(valueOf)).intValue()) {
                throw new IllegalStateException("Call " + j + " not prepared");
            }
            byte[] bArr2 = (byte[]) this.f386870a.get(valueOf);
            System.arraycopy(bArr, 0, bArr2, i * 250000, bArr.length);
            this.f386870a.remove(valueOf);
            this.f386871b.remove(valueOf);
            bArr = bArr2;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        bundle.readFromParcel(obtain);
        obtain.recycle();
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r4 = r6.f386874e;
        r5 = java.lang.Long.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r4.containsKey(r5) == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r6.f386874e.put(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        return new byte[]{2};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        throw new java.lang.IllegalStateException("Already prepared bundle for response " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] prepareResponse(long r7, android.os.Bundle r9) {
        /*
            r6 = this;
            java.lang.String r0 = "Already prepared bundle for response "
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r2 = 0
            r9.writeToParcel(r1, r2)
            r3 = 1
            byte[] r9 = r1.marshall()     // Catch:{ AssertionError | Exception -> 0x004e }
            r1.recycle()
            int r0 = r9.length
            r1 = 250000(0x3d090, float:3.50325E-40)
            if (r0 > r1) goto L_0x0027
            byte[] r7 = new byte[r3]
            r7[r2] = r2
            int r8 = r0 + 1
            byte[] r8 = new byte[r8]
            java.lang.System.arraycopy(r7, r2, r8, r2, r3)
            java.lang.System.arraycopy(r9, r2, r8, r3, r0)
            return r8
        L_0x0027:
            java.util.Map r4 = r6.f386872c
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r4.put(r7, r9)
            r7 = 250005(0x3d095, float:3.50332E-40)
            byte[] r7 = new byte[r7]
            r7[r2] = r3
            r8 = 4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteBuffer r0 = r4.putInt(r0)
            byte[] r0 = r0.array()
            java.lang.System.arraycopy(r0, r2, r7, r3, r8)
            r8 = 5
            java.lang.System.arraycopy(r9, r2, r7, r8, r1)
            return r7
        L_0x004c:
            r7 = move-exception
            goto L_0x007a
        L_0x004e:
            java.util.Map r4 = r6.f386874e     // Catch:{ all -> 0x004c }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x004c }
            boolean r4 = r4.containsKey(r5)     // Catch:{ all -> 0x004c }
            if (r4 != 0) goto L_0x0068
            java.util.Map r7 = r6.f386874e     // Catch:{ all -> 0x004c }
            r7.put(r5, r9)     // Catch:{ all -> 0x004c }
            byte[] r7 = new byte[r3]     // Catch:{ all -> 0x004c }
            r8 = 2
            r7[r2] = r8     // Catch:{ all -> 0x004c }
            r1.recycle()
            return r7
        L_0x0068:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r2.<init>(r0)     // Catch:{ all -> 0x004c }
            r2.append(r7)     // Catch:{ all -> 0x004c }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x004c }
            r9.<init>(r7)     // Catch:{ all -> 0x004c }
            throw r9     // Catch:{ all -> 0x004c }
        L_0x007a:
            r1.recycle()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.enterprise.connectedapps.internal.BundleCallReceiver.prepareResponse(long, android.os.Bundle):byte[]");
    }
}
