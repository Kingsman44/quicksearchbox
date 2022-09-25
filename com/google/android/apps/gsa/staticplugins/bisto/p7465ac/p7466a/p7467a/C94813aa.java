package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import android.bluetooth.BluetoothGattCharacteristic;
import android.util.Base64;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94876ay;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94932d;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94938f;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j.C95010a;
import com.google.android.libraries.assistant.accessory.gmutls.C11018a;
import com.google.android.libraries.assistant.accessory.gmutls.C11022e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import javax.net.ssl.SSLEngineResult;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.aa */
/* compiled from: PG */
public final class C94813aa {

    /* renamed from: a */
    public static final C59071e f265119a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.aa");

    /* renamed from: b */
    public final C94821ai f265120b;

    /* renamed from: c */
    public final C94828c f265121c;

    /* renamed from: d */
    private final C94847v f265122d;

    /* renamed from: e */
    private final C95010a f265123e;

    public C94813aa(C94847v vVar, C94828c cVar) {
        this.f265121c = cVar;
        this.f265120b = cVar.f265165f;
        this.f265122d = vVar;
        this.f265123e = cVar.f265161b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        throw r5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x006c */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m156382d(java.util.Deque r5, int r6) {
        /*
            java.lang.Object r0 = r5.poll()
            byte[] r0 = (byte[]) r0
            r1 = 0
            if (r0 != 0) goto L_0x000c
            byte[] r5 = new byte[r1]
            return r5
        L_0x000c:
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.f r2 = new com.google.android.apps.gsa.staticplugins.bisto.ac.d.f
            r2.<init>(r0)
            byte[] r0 = r2.mo88844a()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x006d }
            int r3 = r0.length     // Catch:{ IOException -> 0x006d }
            int r4 = java.lang.Math.min(r3, r6)     // Catch:{ IOException -> 0x006d }
            r2.<init>(r4)     // Catch:{ IOException -> 0x006d }
            r2.write(r0)     // Catch:{ all -> 0x0050 }
            int r6 = r6 - r3
            java.lang.Object r0 = r5.peek()     // Catch:{ all -> 0x0050 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0050 }
        L_0x0029:
            if (r0 == 0) goto L_0x0048
            int r3 = r0.length     // Catch:{ all -> 0x0050 }
            int r3 = r3 + 2
            if (r3 > r6) goto L_0x0048
            com.google.android.apps.gsa.staticplugins.bisto.ac.d.f r3 = new com.google.android.apps.gsa.staticplugins.bisto.ac.d.f     // Catch:{ all -> 0x0050 }
            r3.<init>(r0)     // Catch:{ all -> 0x0050 }
            byte[] r0 = r3.mo88844a()     // Catch:{ all -> 0x0050 }
            r2.write(r0)     // Catch:{ all -> 0x0050 }
            r5.poll()     // Catch:{ all -> 0x0050 }
            int r0 = r0.length     // Catch:{ all -> 0x0050 }
            int r6 = r6 - r0
            java.lang.Object r0 = r5.peek()     // Catch:{ all -> 0x0050 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0050 }
            goto L_0x0029
        L_0x0048:
            byte[] r5 = r2.toByteArray()     // Catch:{ all -> 0x0050 }
            r2.close()     // Catch:{ IOException -> 0x006d }
            return r5
        L_0x0050:
            r5 = move-exception
            r2.close()     // Catch:{ all -> 0x0055 }
            goto L_0x006c
        L_0x0055:
            r6 = move-exception
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x006c }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r2[r1] = r3     // Catch:{ Exception -> 0x006c }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r4 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r4, r2)     // Catch:{ Exception -> 0x006c }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x006c }
            r0[r1] = r6     // Catch:{ Exception -> 0x006c }
            r2.invoke(r5, r0)     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            throw r5     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            byte[] r5 = new byte[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94813aa.m156382d(java.util.Deque, int):byte[]");
    }

    /* renamed from: e */
    private final int m156383e(C94936d dVar) {
        String f = m156384f(dVar);
        if (f == null) {
            C59104x c = f265119a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GacsGattOutputProcessor");
            ((C59052c) ((C59052c) c).mo56372aa(17515)).mo56386p("Unable to get write type due to invalid category type");
            return -1;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) this.f265121c.mo88645a(f).mo56111f();
        if ((bluetoothGattCharacteristic == null || (bluetoothGattCharacteristic.getProperties() & 1) == 0) && !this.f265121c.f265174o.get() && dVar != C94936d.TTS_OUTPUT) {
            return 2;
        }
        return 1;
    }

    /* renamed from: f */
    private static String m156384f(C94936d dVar) {
        C94936d dVar2 = C94936d.CONTROL_INPUT;
        int ordinal = dVar.ordinal();
        if (ordinal == 1) {
            return "389e8365-158f-4308-9204-756f29b6a87c";
        }
        if (ordinal == 3) {
            return "dd1d1206-568f-4b2d-a48c-969d8ad1f457";
        }
        if (ordinal == 5) {
            return "d9f83634-adf5-4cf6-a3c9-cdb149f6469c";
        }
        if (ordinal == 7) {
            return "95c93772-7ef8-4b38-96bd-24b351208157";
        }
        C59104x c = f265119a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GacsGattOutputProcessor");
        ((C59052c) ((C59052c) c).mo56372aa(17516)).mo56386p("Attempt to retrieve unexpected characteristic");
        return null;
    }

    /* renamed from: g */
    private final void m156385g() {
        C59104x c = f265119a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GacsGattOutputProcessor");
        ((C59052c) ((C59052c) c).mo56372aa(17517)).mo56389s("[%s] Fatal crypto error", C94876ay.m156554c(this.f265123e));
    }

    /* renamed from: h */
    private final void m156386h(C94936d dVar, byte[] bArr) {
        String f = m156384f(dVar);
        if (f == null) {
            C59104x c = f265119a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GacsGattOutputProcessor");
            ((C59052c) ((C59052c) c).mo56372aa(17523)).mo56386p("Unable to send write request due to invalid category type");
        } else if (m156383e(dVar) >= 0) {
            this.f265120b.mo88636e(new C94826an(this.f265121c, f, bArr, m156383e(dVar)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo88624a(C94936d dVar, byte[] bArr) {
        C94936d dVar2 = C94936d.CRYPTO_OUTPUT;
        if (dVar == dVar2) {
            try {
                Deque a = this.f265122d.mo88680a(bArr, dVar2);
                while (!a.isEmpty()) {
                    byte[] bArr2 = (byte[]) a.remove();
                    C58976aa aaVar = C58975e.f156826a;
                    C94876ay.m156554c(this.f265123e);
                    Base64.encodeToString(bArr2, 0);
                    m156386h(C94936d.CRYPTO_OUTPUT, bArr2);
                }
            } catch (C94932d | IllegalArgumentException e) {
                C59104x c = f265119a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GacsGattOutputProcessor");
                ((C59052c) ((C59052c) c).mo56372aa(17520)).mo56389s("Failed to send crypto response due to %s", e.getMessage());
                m156385g();
            }
        } else if (this.f265121c.mo88647c()) {
            mo88625b(dVar, new C94938f(bArr).mo88844a());
        } else {
            mo88626c(dVar, new C94938f(bArr).mo88844a());
        }
    }

    /* renamed from: b */
    public final void mo88625b(C94936d dVar, byte[] bArr) {
        try {
            C94847v vVar = this.f265122d;
            C94828c cVar = vVar.f265242a;
            C11022e eVar = cVar.f265166g;
            int i = cVar.f265167h;
            if (eVar.f36213d.get() == 11) {
                ArrayDeque arrayDeque = new ArrayDeque();
                int a = eVar.mo19475a();
                int i2 = 0;
                while (true) {
                    int length = bArr.length;
                    if (i2 >= length) {
                        while (!arrayDeque.isEmpty()) {
                            byte[] bArr2 = (byte[]) arrayDeque.remove();
                            C58976aa aaVar = C58975e.f156826a;
                            C94876ay.m156554c(this.f265123e);
                            Base64.encodeToString(bArr2, 0);
                            m156386h(dVar, bArr2);
                        }
                        return;
                    }
                    int i3 = i2 + a;
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, Math.min(length, i3));
                    C11018a aVar = new C11018a(i);
                    SSLEngineResult e = eVar.mo19480e(new C11018a(copyOfRange), aVar);
                    C58976aa aaVar2 = C58975e.f156826a;
                    int length2 = copyOfRange.length;
                    aVar.size();
                    if (SSLEngineResult.Status.OK.equals(e.getStatus()) && !SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.equals(e.getHandshakeStatus()) && !aVar.isEmpty()) {
                        Deque a2 = vVar.mo88680a(aVar.mo19468d(), dVar);
                        if (!a2.isEmpty()) {
                            arrayDeque.addAll(a2);
                        }
                        i2 = i3;
                    }
                }
                throw new C94932d("Fatal handshake error");
            }
            throw new C94932d("Not ready to encrypt record");
        } catch (C94932d e2) {
            C59104x c = f265119a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GacsGattOutputProcessor");
            ((C59052c) ((C59052c) c).mo56372aa(17522)).mo56389s("Failed to send encrypted record due to %s", e2.getMessage());
            m156385g();
        }
    }

    /* renamed from: c */
    public final void mo88626c(C94936d dVar, byte[] bArr) {
        C94847v vVar = this.f265122d;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = vVar.f265242a.f265171l.get() - 3;
        int i2 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                break;
            }
            int i3 = i2 + i;
            arrayDeque.add(Arrays.copyOfRange(bArr, i2, Math.min(length, i3)));
            i2 = i3;
        }
        while (!arrayDeque.isEmpty()) {
            m156386h(dVar, (byte[]) arrayDeque.remove());
        }
    }
}
