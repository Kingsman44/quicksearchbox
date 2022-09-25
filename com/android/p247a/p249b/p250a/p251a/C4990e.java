package com.android.p247a.p249b.p250a.p251a;

import com.android.p247a.p248a.C4981a;
import com.android.p247a.p249b.p250a.C4985a;
import com.android.p247a.p249b.p250a.C4991b;
import com.android.p247a.p249b.p250a.C4993d;
import com.android.p247a.p249b.p250a.C4995f;
import com.android.p247a.p249b.p252b.C5004e;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.android.a.b.a.a.e */
/* compiled from: PG */
public final class C4990e {
    /* renamed from: a */
    public static void m13770a(ByteBuffer byteBuffer, byte[] bArr, Map map, int i, int i2, C4985a aVar) {
        boolean z;
        C4991b bVar = new C4991b();
        aVar.f15803b.add(bVar);
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            ByteBuffer b = C4993d.m13776b(byteBuffer);
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    arrayList.add(new C5004e(Integer.valueOf(((C4995f) entry2.getKey()).f15827e), (byte[]) entry2.getValue()));
                }
                Collections.sort(arrayList, new C4989d());
                hashMap.put((Integer) entry.getKey(), C4993d.m13778d(arrayList));
            }
            X509Certificate a = C4988c.m13767a(b, instance, bArr, bVar);
            if (!bVar.mo9923d()) {
                if (!bVar.mo9922c()) {
                    ByteBuffer b2 = C4993d.m13776b(b);
                    HashMap hashMap2 = new HashMap();
                    while (b2.hasRemaining()) {
                        ByteBuffer b3 = C4993d.m13776b(b2);
                        int i3 = b3.getInt();
                        hashMap2.put(Integer.valueOf(i3), C4993d.m13776b(b3));
                    }
                    Iterator it = hashMap.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry3 = (Map.Entry) it.next();
                            if (((Integer) entry3.getKey()).intValue() != 31) {
                                if (!hashMap2.containsKey(entry3.getKey())) {
                                    bVar.mo9921b(17, new Object[0]);
                                    break;
                                }
                                C4988c.m13769c((byte[]) entry3.getValue(), i, a, (ByteBuffer) hashMap2.get(entry3.getKey()), bVar);
                                if (bVar.mo9923d()) {
                                    break;
                                } else if (bVar.mo9922c()) {
                                    break;
                                }
                            }
                        } else if (b.hasRemaining()) {
                            ByteBuffer b4 = C4993d.m13776b(b);
                            ByteBuffer b5 = C4993d.m13776b(b);
                            byte[] bArr2 = new byte[b4.remaining()];
                            b4.get(bArr2);
                            ByteBuffer byteBuffer2 = (ByteBuffer) b4.flip();
                            C4988c.m13769c(bArr2, i, a, b5, bVar);
                            if (!bVar.mo9922c() && !bVar.mo9923d()) {
                                C4988c.m13768b(b4, a, bVar);
                            }
                        }
                    }
                }
            }
            if (aVar.f15805d.isEmpty()) {
                if (!aVar.f15803b.isEmpty()) {
                    Iterator it2 = aVar.f15803b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((C4991b) it2.next()).mo9922c()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (aVar.f15804c.isEmpty()) {
                    z = true;
                    if (!aVar.f15803b.isEmpty()) {
                        Iterator it3 = aVar.f15803b.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((C4991b) it3.next()).mo9923d()) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    aVar.f15802a = z;
                }
            }
            z = false;
            aVar.f15802a = z;
        } catch (CertificateException e) {
            throw new IllegalStateException("Failed to obtain X.509 CertificateFactory", e);
        } catch (C4981a | BufferUnderflowException unused) {
            bVar.mo9921b(20, new Object[0]);
        }
    }
}
