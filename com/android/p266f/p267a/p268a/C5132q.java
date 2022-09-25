package com.android.p266f.p267a.p268a;

import android.util.Log;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.android.f.a.a.q */
/* compiled from: PG */
public final class C5132q {

    /* renamed from: a */
    private static byte[] f16335a;

    /* renamed from: b */
    private static byte[] f16336b;

    /* renamed from: c */
    private ByteArrayInputStream f16337c = null;

    /* renamed from: d */
    private C5131p f16338d = null;

    /* renamed from: e */
    private C5125j f16339e = null;

    public C5132q(byte[] bArr) {
        this.f16337c = new ByteArrayInputStream(bArr);
    }

    /* renamed from: a */
    protected static int m14030a(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read();
        if (read == -1) {
            return -1;
        }
        int i = 0;
        while ((read & 128) != 0) {
            i = (i << 7) | (read & 127);
            read = byteArrayInputStream.read();
            if (read == -1) {
                return -1;
            }
        }
        return (i << 7) | (read & 127);
    }

    /* renamed from: b */
    protected static int m14031b(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read() & PrivateKeyType.INVALID;
        if (read <= 30) {
            return read;
        }
        if (read == 31) {
            return m14030a(byteArrayInputStream);
        }
        throw new RuntimeException("Value length > LENGTH_QUOTE!");
    }

    /* renamed from: c */
    protected static int m14032c(ByteArrayInputStream byteArrayInputStream, int i) {
        int read = byteArrayInputStream.read(new byte[i], 0, i);
        if (read < i) {
            return -1;
        }
        return read;
    }

    /* renamed from: d */
    protected static long m14033d(ByteArrayInputStream byteArrayInputStream) {
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        if (read > 127) {
            return (long) (byteArrayInputStream.read() & 127);
        }
        return m14034e(byteArrayInputStream);
    }

    /* renamed from: e */
    protected static long m14034e(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read() & PrivateKeyType.INVALID;
        if (read <= 8) {
            long j = 0;
            for (int i = 0; i < read; i++) {
                j = (j << 8) + ((long) (byteArrayInputStream.read() & PrivateKeyType.INVALID));
            }
            return j;
        }
        throw new RuntimeException("Octet count greater than 8 and I can't represent that!");
    }

    /* renamed from: f */
    protected static C5120e m14035f(ByteArrayInputStream byteArrayInputStream) {
        int i;
        byteArrayInputStream.mark(1);
        int read = byteArrayInputStream.read() & PrivateKeyType.INVALID;
        if (read == 0) {
            return null;
        }
        byteArrayInputStream.reset();
        if (read < 32) {
            m14031b(byteArrayInputStream);
            i = byteArrayInputStream.read() & 127;
        } else {
            i = 0;
        }
        byte[] j = m14038j(byteArrayInputStream, 0);
        if (i == 0) {
            return new C5120e(106, j);
        }
        try {
            return new C5120e(i, j);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    protected static C5125j m14036h(ByteArrayInputStream byteArrayInputStream) {
        C5125j jVar;
        byte[] bArr;
        byte[] h;
        byte[] f;
        int i;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        C5125j jVar2 = null;
        if (byteArrayInputStream2 == null) {
            return null;
        }
        int a = m14030a(byteArrayInputStream);
        C5125j jVar3 = new C5125j();
        int i2 = 0;
        while (i2 < a) {
            int a2 = m14030a(byteArrayInputStream);
            int a3 = m14030a(byteArrayInputStream);
            C5133r rVar = new C5133r();
            int available = byteArrayInputStream.available();
            if (available <= 0) {
                return jVar2;
            }
            SparseArray sparseArray = new SparseArray();
            byte[] i3 = m14037i(byteArrayInputStream2, sparseArray);
            if (i3 != null) {
                rVar.mo10181d(i3);
            } else {
                rVar.mo10181d(C5130o.f16332a[0].getBytes());
            }
            byte[] bArr2 = (byte[]) sparseArray.get(151);
            if (bArr2 != null) {
                rVar.f16340a.put(151, bArr2);
            }
            Integer num = (Integer) sparseArray.get(129);
            if (num != null) {
                rVar.mo10178a(num.intValue());
            }
            int available2 = a2 - (available - byteArrayInputStream.available());
            if (available2 > 0) {
                int available3 = byteArrayInputStream.available();
                int i4 = available2;
                while (i4 > 0) {
                    int read = byteArrayInputStream.read();
                    int i5 = i4 - 1;
                    if (read > 127) {
                        if (read != 142) {
                            if (read != 174) {
                                if (read == 192) {
                                    byte[] j = m14038j(byteArrayInputStream2, 1);
                                    if (j != null) {
                                        rVar.mo10179b(j);
                                    }
                                    i = byteArrayInputStream.available();
                                } else if (read != 197) {
                                    if (m14032c(byteArrayInputStream2, i5) == -1) {
                                        Log.e("PduParser", "Corrupt Part headers");
                                        return null;
                                    }
                                    i4 = 0;
                                }
                            }
                            throw new IllegalStateException("MmsConfig is not initialized");
                        }
                        byte[] j2 = m14038j(byteArrayInputStream2, 0);
                        if (j2 != null) {
                            rVar.mo10180c(j2);
                        }
                        i = byteArrayInputStream.available();
                    } else if (read >= 32) {
                        byte[] j3 = m14038j(byteArrayInputStream2, 0);
                        byte[] j4 = m14038j(byteArrayInputStream2, 0);
                        if ("Content-Transfer-Encoding".equalsIgnoreCase(new String(j3))) {
                            if (j4 != null) {
                                rVar.f16340a.put(200, j4);
                            } else {
                                throw new NullPointerException("null content-transfer-encoding");
                            }
                        }
                        i = byteArrayInputStream.available();
                    } else {
                        if (m14032c(byteArrayInputStream2, i5) == -1) {
                            Log.e("PduParser", "Corrupt Part headers");
                            return null;
                        }
                        i4 = 0;
                    }
                    i4 = available2 - (available3 - i);
                }
                if (i4 != 0) {
                    Log.e("PduParser", "Corrupt Part headers");
                    return null;
                }
            } else if (available2 < 0) {
                return jVar2;
            }
            if (rVar.mo10184g() == null && rVar.mo10188k() == null && rVar.mo10187j() == null && rVar.mo10183f() == null) {
                rVar.mo10180c(Long.toOctalString(System.currentTimeMillis()).getBytes());
            }
            if (a3 > 0) {
                byte[] bArr3 = new byte[a3];
                String str = new String(rVar.mo10185h());
                byteArrayInputStream2.read(bArr3, 0, a3);
                if (str.equalsIgnoreCase("application/vnd.wap.multipart.alternative")) {
                    rVar = m14036h(new ByteArrayInputStream(bArr3)).mo10150a(0);
                } else {
                    byte[] bArr4 = (byte[]) rVar.f16340a.get(200);
                    if (bArr4 != null) {
                        String str2 = new String(bArr4);
                        if (str2.equalsIgnoreCase("base64")) {
                            bArr3 = C5117b.m13991a(bArr3);
                        } else if (str2.equalsIgnoreCase("quoted-printable")) {
                            bArr3 = C5134s.m14051a(bArr3);
                        }
                    }
                    if (bArr3 == null) {
                        return null;
                    }
                    jVar = null;
                    rVar.mo10182e(bArr3);
                    bArr = f16335a;
                    if (!(bArr == null && f16336b == null) && (f16336b == null ? !(bArr == null || (h = rVar.mo10185h()) == null || !Arrays.equals(f16335a, h)) : !((f = rVar.mo10183f()) == null || !Arrays.equals(f16336b, f)))) {
                        jVar3.mo10151b(rVar);
                    } else {
                        jVar3.mo10152c(rVar);
                    }
                    i2++;
                    jVar2 = jVar;
                }
            }
            jVar = null;
            bArr = f16335a;
            if (bArr == null || f16336b == null) {
            }
            jVar3.mo10152c(rVar);
            i2++;
            jVar2 = jVar;
        }
        return jVar3;
    }

    /* renamed from: i */
    protected static byte[] m14037i(ByteArrayInputStream byteArrayInputStream, SparseArray sparseArray) {
        byte[] bArr;
        int available;
        int intValue;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        SparseArray sparseArray2 = sparseArray;
        byteArrayInputStream2.mark(1);
        int read = byteArrayInputStream.read();
        byteArrayInputStream.reset();
        int i = read & PrivateKeyType.INVALID;
        if (i < 32) {
            int b = m14031b(byteArrayInputStream);
            int available2 = byteArrayInputStream.available();
            byteArrayInputStream2.mark(1);
            int read2 = byteArrayInputStream.read();
            byteArrayInputStream.reset();
            int i2 = read2 & PrivateKeyType.INVALID;
            if (i2 >= 32 && i2 <= 127) {
                bArr = m14038j(byteArrayInputStream2, 0);
            } else if (i2 > 127) {
                int read3 = byteArrayInputStream.read() & 127;
                int i3 = C5130o.f16333b;
                if (read3 < 83) {
                    bArr = C5130o.f16332a[read3].getBytes();
                } else {
                    byteArrayInputStream.reset();
                    bArr = m14038j(byteArrayInputStream2, 0);
                }
            } else {
                Log.e("PduParser", "Corrupt content-type");
                return C5130o.f16332a[0].getBytes();
            }
            int available3 = b - (available2 - byteArrayInputStream.available());
            if (available3 > 0) {
                Integer valueOf = Integer.valueOf(available3);
                int available4 = byteArrayInputStream.available();
                int intValue2 = valueOf.intValue();
                while (intValue2 > 0) {
                    intValue2--;
                    int read4 = byteArrayInputStream.read();
                    if (read4 != 129) {
                        if (read4 != 131) {
                            if (read4 == 133 || read4 == 151) {
                                byte[] j = m14038j(byteArrayInputStream2, 0);
                                if (!(j == null || sparseArray2 == null)) {
                                    sparseArray2.put(151, j);
                                }
                                available = byteArrayInputStream.available();
                                intValue = valueOf.intValue();
                                intValue2 = intValue - (available4 - available);
                            } else {
                                if (read4 != 153) {
                                    if (read4 != 137) {
                                        if (read4 != 138) {
                                            if (m14032c(byteArrayInputStream2, intValue2) == -1) {
                                                Log.e("PduParser", "Corrupt Content-Type");
                                            } else {
                                                intValue2 = 0;
                                            }
                                        }
                                    }
                                }
                                byte[] j2 = m14038j(byteArrayInputStream2, 0);
                                if (!(j2 == null || sparseArray2 == null)) {
                                    sparseArray2.put(153, j2);
                                }
                                available = byteArrayInputStream.available();
                                intValue = valueOf.intValue();
                                intValue2 = intValue - (available4 - available);
                            }
                        }
                        byteArrayInputStream2.mark(1);
                        int read5 = byteArrayInputStream.read();
                        byteArrayInputStream.reset();
                        if ((read5 & PrivateKeyType.INVALID) > 127) {
                            int read6 = byteArrayInputStream.read() & 127;
                            int i4 = C5130o.f16333b;
                            if (read6 < 83) {
                                sparseArray2.put(131, C5130o.f16332a[read6].getBytes());
                            }
                        } else {
                            byte[] j3 = m14038j(byteArrayInputStream2, 0);
                            if (!(j3 == null || sparseArray2 == null)) {
                                sparseArray2.put(131, j3);
                            }
                        }
                        available = byteArrayInputStream.available();
                        intValue = valueOf.intValue();
                        intValue2 = intValue - (available4 - available);
                    } else {
                        byteArrayInputStream2.mark(1);
                        int read7 = byteArrayInputStream.read() & PrivateKeyType.INVALID;
                        byteArrayInputStream.reset();
                        if ((read7 <= 32 || read7 >= 127) && read7 != 0) {
                            int d = (int) m14033d(byteArrayInputStream);
                            if (sparseArray2 != null) {
                                sparseArray2.put(129, Integer.valueOf(d));
                            }
                        } else {
                            byte[] j4 = m14038j(byteArrayInputStream2, 0);
                            try {
                                Integer num = (Integer) C5118c.f16306a.get(new String(j4));
                                if (num != null) {
                                    sparseArray2.put(129, Integer.valueOf(num.intValue()));
                                } else {
                                    throw new UnsupportedEncodingException();
                                }
                            } catch (UnsupportedEncodingException e) {
                                Log.e("PduParser", Arrays.toString(j4), e);
                                sparseArray2.put(129, 0);
                            }
                        }
                        intValue2 = valueOf.intValue() - (available4 - byteArrayInputStream.available());
                    }
                }
                if (intValue2 != 0) {
                    Log.e("PduParser", "Corrupt Content-Type");
                }
            }
            if (available3 >= 0) {
                return bArr;
            }
            Log.e("PduParser", "Corrupt MMS message");
            return C5130o.f16332a[0].getBytes();
        } else if (i <= 127) {
            return m14038j(byteArrayInputStream2, 0);
        } else {
            return C5130o.f16332a[byteArrayInputStream.read() & 127].getBytes();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004c A[SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static byte[] m14038j(java.io.ByteArrayInputStream r2, int r3) {
        /*
            r0 = 1
            r2.mark(r0)
            int r1 = r2.read()
            if (r3 != r0) goto L_0x0012
            r3 = 34
            if (r1 != r3) goto L_0x001a
            r2.mark(r0)
            goto L_0x001d
        L_0x0012:
            r3 = 127(0x7f, float:1.78E-43)
            if (r1 != r3) goto L_0x001a
            r2.mark(r0)
            goto L_0x001d
        L_0x001a:
            r2.reset()
        L_0x001d:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            int r0 = r2.read()
        L_0x0026:
            r1 = -1
            if (r0 == r1) goto L_0x0051
            if (r0 == 0) goto L_0x0051
            r1 = 32
            if (r0 < r1) goto L_0x0033
            r1 = 126(0x7e, float:1.77E-43)
            if (r0 <= r1) goto L_0x0049
        L_0x0033:
            r1 = 128(0x80, float:1.794E-43)
            if (r0 < r1) goto L_0x003c
            r1 = 255(0xff, float:3.57E-43)
            if (r0 > r1) goto L_0x003c
            goto L_0x0049
        L_0x003c:
            r1 = 9
            if (r0 == r1) goto L_0x0049
            r1 = 10
            if (r0 == r1) goto L_0x0049
            r1 = 13
            if (r0 == r1) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r3.write(r0)
        L_0x004c:
            int r0 = r2.read()
            goto L_0x0026
        L_0x0051:
            int r2 = r3.size()
            if (r2 <= 0) goto L_0x005c
            byte[] r2 = r3.toByteArray()
            return r2
        L_0x005c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p266f.p267a.p268a.C5132q.m14038j(java.io.ByteArrayInputStream, int):byte[]");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0238, code lost:
        if (r3.mo10176i(151) != null) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0254, code lost:
        if (r3.mo10176i(151) != null) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0272, code lost:
        if (r3.mo10176i(151) != null) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0279, code lost:
        if (r3.mo10175h(152) == null) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x027d, code lost:
        r1 = 132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x028f, code lost:
        if (r3.mo10169b(133) != -1) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x029d, code lost:
        if (r3.mo10175h(152) != null) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02c7, code lost:
        if (r3.mo10175h(152) != null) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02d7, code lost:
        if (r3.mo10175h(152) != null) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02ed, code lost:
        if (r3.mo10175h(152) != null) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02f1, code lost:
        if (r8 == 128) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02f3, code lost:
        if (r8 != r1) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02f5, code lost:
        r8 = 132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02f7, code lost:
        r1 = m14036h(r0.f16337c);
        r0.f16339e = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02ff, code lost:
        if (r1 == null) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0301, code lost:
        switch(r8) {
            case 128: goto L_0x038c;
            case 129: goto L_0x0384;
            case 130: goto L_0x037c;
            case 131: goto L_0x0374;
            case 132: goto L_0x0325;
            case 133: goto L_0x031d;
            case 134: goto L_0x0315;
            case 135: goto L_0x030d;
            case 136: goto L_0x0305;
            default: goto L_0x0304;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0304, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x030c, code lost:
        return new com.android.p266f.p267a.p268a.C5135t(r0.f16338d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0314, code lost:
        return new com.android.p266f.p267a.p268a.C5136u(r0.f16338d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x031c, code lost:
        return new com.android.p266f.p267a.p268a.C5119d(r0.f16338d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0324, code lost:
        return new com.android.p266f.p267a.p268a.C5116a(r0.f16338d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0325, code lost:
        r1 = new com.android.p266f.p267a.p268a.C5137v(r0.f16338d, r0.f16339e);
        r3 = r1.f16312a.mo10175h(132);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0336, code lost:
        if (r3 != null) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0338, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0339, code lost:
        r4 = new java.lang.String(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0344, code lost:
        if (r4.equals("application/vnd.wap.multipart.mixed") != false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x034c, code lost:
        if (r4.equals("application/vnd.wap.multipart.related") != false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0354, code lost:
        if (r4.equals("application/vnd.wap.multipart.alternative") == false) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x035d, code lost:
        if (r4.equals("application/vnd.wap.multipart.alternative") == false) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x035f, code lost:
        r2 = r0.f16339e.mo10150a(0);
        r0.f16339e.f16314a.clear();
        r0.f16339e.mo10151b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0371, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0372, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0373, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x037b, code lost:
        return new com.android.p266f.p267a.p268a.C5124i(r0.f16338d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0383, code lost:
        return new com.android.p266f.p267a.p268a.C5123h(r0.f16338d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x038b, code lost:
        return new com.android.p266f.p267a.p268a.C5138w(r0.f16338d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0395, code lost:
        return new com.android.p266f.p267a.p268a.C5139x(r0.f16338d, r0.f16339e);
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.p266f.p267a.p268a.C5121f mo10177g() {
        /*
            r20 = this;
            r0 = r20
            java.io.ByteArrayInputStream r1 = r0.f16337c
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            com.android.f.a.a.p r3 = new com.android.f.a.a.p
            r3.<init>()
        L_0x000d:
            r4 = 1
        L_0x000e:
            r5 = 1
        L_0x000f:
            r6 = 141(0x8d, float:1.98E-43)
            r9 = 137(0x89, float:1.92E-43)
            r10 = 128(0x80, float:1.794E-43)
            r11 = 138(0x8a, float:1.93E-43)
            r13 = 0
            if (r5 == 0) goto L_0x01ec
            int r14 = r1.available()
            if (r14 <= 0) goto L_0x01ec
            r1.mark(r4)
            int r14 = r1.read()
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 32
            r8 = 127(0x7f, float:1.78E-43)
            if (r14 < r15) goto L_0x0038
            if (r14 > r8) goto L_0x0038
            r1.reset()
            m14038j(r1, r13)
            goto L_0x000f
        L_0x0038:
            r5 = 130(0x82, float:1.82E-43)
            java.lang.String r15 = "/"
            r12 = 129(0x81, float:1.81E-43)
            switch(r14) {
                case 129: goto L_0x019f;
                case 130: goto L_0x019f;
                case 131: goto L_0x0194;
                case 132: goto L_0x016d;
                case 133: goto L_0x0164;
                case 134: goto L_0x0159;
                case 135: goto L_0x013b;
                case 136: goto L_0x013b;
                case 137: goto L_0x00fd;
                case 138: goto L_0x00ae;
                case 139: goto L_0x0194;
                case 140: goto L_0x009d;
                case 141: goto L_0x0093;
                case 142: goto L_0x0164;
                case 143: goto L_0x0159;
                case 144: goto L_0x0159;
                case 145: goto L_0x0159;
                case 146: goto L_0x0159;
                case 147: goto L_0x0088;
                case 148: goto L_0x0159;
                case 149: goto L_0x0159;
                case 150: goto L_0x0088;
                case 151: goto L_0x019f;
                case 152: goto L_0x0194;
                case 153: goto L_0x0159;
                case 154: goto L_0x0088;
                case 155: goto L_0x0159;
                case 156: goto L_0x0159;
                case 157: goto L_0x013b;
                case 158: goto L_0x0194;
                case 159: goto L_0x0164;
                case 160: goto L_0x0074;
                case 161: goto L_0x0064;
                case 162: goto L_0x0159;
                case 163: goto L_0x0159;
                case 164: goto L_0x005a;
                case 165: goto L_0x0159;
                case 166: goto L_0x0088;
                case 167: goto L_0x0159;
                case 168: goto L_0x0041;
                case 169: goto L_0x0159;
                case 170: goto L_0x0050;
                case 171: goto L_0x0159;
                case 172: goto L_0x0050;
                case 173: goto L_0x0046;
                case 174: goto L_0x0041;
                case 175: goto L_0x0046;
                case 176: goto L_0x0041;
                case 177: goto L_0x0159;
                case 178: goto L_0x0042;
                case 179: goto L_0x0046;
                case 180: goto L_0x0159;
                case 181: goto L_0x0088;
                case 182: goto L_0x0088;
                case 183: goto L_0x0194;
                case 184: goto L_0x0194;
                case 185: goto L_0x0194;
                case 186: goto L_0x0159;
                case 187: goto L_0x0159;
                case 188: goto L_0x0159;
                case 189: goto L_0x0194;
                case 190: goto L_0x0194;
                case 191: goto L_0x0159;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x000d
        L_0x0042:
            m14037i(r1, r2)
            goto L_0x000e
        L_0x0046:
            long r7 = m14033d(r1)     // Catch:{  }
            r3.mo10172e(r7, r14)     // Catch:{  }
            goto L_0x000e
        L_0x004e:
            goto L_0x00ab
        L_0x0050:
            m14031b(r1)
            r1.read()
            m14033d(r1)     // Catch:{  }
            goto L_0x000e
        L_0x005a:
            m14031b(r1)
            r1.read()
            m14035f(r1)
            goto L_0x000e
        L_0x0064:
            m14031b(r1)
            m14033d(r1)     // Catch:{  }
            long r7 = m14034e(r1)     // Catch:{  }
            r5 = 161(0xa1, float:2.26E-43)
            r3.mo10172e(r7, r5)     // Catch:{  }
            goto L_0x000e
        L_0x0074:
            m14031b(r1)
            m14033d(r1)     // Catch:{  }
            com.android.f.a.a.e r5 = m14035f(r1)
            if (r5 == 0) goto L_0x000e
            r7 = 160(0xa0, float:2.24E-43)
            r3.mo10171d(r5, r7)     // Catch:{ NullPointerException -> 0x0086 }
            goto L_0x000e
        L_0x0086:
            goto L_0x000e
        L_0x0088:
            com.android.f.a.a.e r5 = m14035f(r1)
            if (r5 == 0) goto L_0x000e
            r3.mo10171d(r5, r14)     // Catch:{ NullPointerException -> 0x0086 }
            goto L_0x000e
        L_0x0093:
            int r5 = r1.read()
            r5 = r5 & r8
            r3.mo10173f(r5, r6)     // Catch:{ RuntimeException -> 0x004e }
            goto L_0x000e
        L_0x009d:
            int r5 = r1.read()
            r5 = r5 & 255(0xff, float:3.57E-43)
            switch(r5) {
                case 137: goto L_0x00ab;
                case 138: goto L_0x00ab;
                case 139: goto L_0x00ab;
                case 140: goto L_0x00ab;
                case 141: goto L_0x00ab;
                case 142: goto L_0x00ab;
                case 143: goto L_0x00ab;
                case 144: goto L_0x00ab;
                case 145: goto L_0x00ab;
                case 146: goto L_0x00ab;
                case 147: goto L_0x00ab;
                case 148: goto L_0x00ab;
                case 149: goto L_0x00ab;
                case 150: goto L_0x00ab;
                case 151: goto L_0x00ab;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            r3.mo10173f(r5, r14)     // Catch:{ RuntimeException -> 0x004e }
            goto L_0x000e
        L_0x00ab:
            r3 = r2
            goto L_0x01ec
        L_0x00ae:
            r1.mark(r4)
            int r7 = r1.read()
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 < r10) goto L_0x00ef
            if (r7 != r10) goto L_0x00c6
            java.lang.String r5 = "personal"
            byte[] r5 = r5.getBytes()     // Catch:{ NullPointerException -> 0x0086 }
            r3.mo10174g(r5, r11)     // Catch:{ NullPointerException -> 0x0086 }
            goto L_0x000e
        L_0x00c6:
            if (r7 != r12) goto L_0x00d3
            java.lang.String r5 = "advertisement"
            byte[] r5 = r5.getBytes()     // Catch:{ NullPointerException -> 0x0086 }
            r3.mo10174g(r5, r11)     // Catch:{ NullPointerException -> 0x0086 }
            goto L_0x000e
        L_0x00d3:
            if (r7 != r5) goto L_0x00e0
            java.lang.String r5 = "informational"
            byte[] r5 = r5.getBytes()     // Catch:{ NullPointerException -> 0x0086 }
            r3.mo10174g(r5, r11)     // Catch:{ NullPointerException -> 0x0086 }
            goto L_0x000e
        L_0x00e0:
            r5 = 131(0x83, float:1.84E-43)
            if (r7 != r5) goto L_0x000e
            java.lang.String r5 = "auto"
            byte[] r5 = r5.getBytes()     // Catch:{ NullPointerException -> 0x0086 }
            r3.mo10174g(r5, r11)     // Catch:{ NullPointerException -> 0x0086 }
            goto L_0x000e
        L_0x00ef:
            r1.reset()
            byte[] r5 = m14038j(r1, r13)
            if (r5 == 0) goto L_0x000e
            r3.mo10174g(r5, r11)     // Catch:{ NullPointerException -> 0x0086 }
            goto L_0x000e
        L_0x00fd:
            m14031b(r1)
            int r5 = r1.read()
            r5 = r5 & 255(0xff, float:3.57E-43)
            if (r5 != r10) goto L_0x0129
            com.android.f.a.a.e r5 = m14035f(r1)
            if (r5 == 0) goto L_0x0136
            byte[] r7 = r5.mo10147d()
            java.lang.String r8 = new java.lang.String
            r8.<init>(r7)
            int r7 = r8.indexOf(r15)
            if (r7 <= 0) goto L_0x0121
            java.lang.String r8 = r8.substring(r13, r7)
        L_0x0121:
            byte[] r7 = r8.getBytes()     // Catch:{  }
            r5.mo10145c(r7)     // Catch:{  }
            goto L_0x0136
        L_0x0129:
            com.android.f.a.a.e r5 = new com.android.f.a.a.e     // Catch:{  }
            java.lang.String r7 = "insert-address-token"
            byte[] r7 = r7.getBytes()     // Catch:{  }
            r8 = 106(0x6a, float:1.49E-43)
            r5.<init>(r8, r7)     // Catch:{  }
        L_0x0136:
            r3.mo10171d(r5, r9)     // Catch:{ NullPointerException -> 0x0086 }
            goto L_0x000e
        L_0x013b:
            m14031b(r1)
            int r5 = r1.read()
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r7 = m14034e(r1)     // Catch:{  }
            if (r5 != r12) goto L_0x0154
            long r16 = java.lang.System.currentTimeMillis()
            r18 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 / r18
            long r7 = r16 + r7
        L_0x0154:
            r3.mo10172e(r7, r14)     // Catch:{  }
            goto L_0x000e
        L_0x0159:
            int r5 = r1.read()
            r5 = r5 & 255(0xff, float:3.57E-43)
            r3.mo10173f(r5, r14)     // Catch:{ RuntimeException -> 0x004e }
            goto L_0x000e
        L_0x0164:
            long r7 = m14034e(r1)     // Catch:{  }
            r3.mo10172e(r7, r14)     // Catch:{  }
            goto L_0x000e
        L_0x016d:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            byte[] r7 = m14037i(r1, r5)
            if (r7 == 0) goto L_0x017d
            r8 = 132(0x84, float:1.85E-43)
            r3.mo10174g(r7, r8)     // Catch:{ NullPointerException -> 0x017d }
        L_0x017d:
            r6 = 153(0x99, float:2.14E-43)
            java.lang.Object r6 = r5.get(r6)
            byte[] r6 = (byte[]) r6
            f16336b = r6
            r6 = 131(0x83, float:1.84E-43)
            java.lang.Object r5 = r5.get(r6)
            byte[] r5 = (byte[]) r5
            f16335a = r5
            r5 = 0
            goto L_0x000f
        L_0x0194:
            byte[] r5 = m14038j(r1, r13)
            if (r5 == 0) goto L_0x000e
            r3.mo10174g(r5, r14)     // Catch:{ NullPointerException -> 0x0086 }
            goto L_0x000e
        L_0x019f:
            com.android.f.a.a.e r7 = m14035f(r1)
            if (r7 == 0) goto L_0x000d
            byte[] r8 = r7.mo10147d()
            java.lang.String r4 = new java.lang.String
            r4.<init>(r8)
            int r8 = r4.indexOf(r15)
            if (r8 <= 0) goto L_0x01b8
            java.lang.String r4 = r4.substring(r13, r8)
        L_0x01b8:
            byte[] r4 = r4.getBytes()     // Catch:{  }
            r7.mo10145c(r4)     // Catch:{  }
            if (r14 == r12) goto L_0x01d0
            if (r14 == r5) goto L_0x01d0
            r4 = 151(0x97, float:2.12E-43)
            if (r14 != r4) goto L_0x01c8
            goto L_0x01d0
        L_0x01c8:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ NullPointerException -> 0x01e9 }
            java.lang.String r5 = "Invalid header field!"
            r4.<init>(r5)     // Catch:{ NullPointerException -> 0x01e9 }
            throw r4     // Catch:{ NullPointerException -> 0x01e9 }
        L_0x01d0:
            android.util.SparseArray r4 = r3.f16334a     // Catch:{ NullPointerException -> 0x01e9 }
            java.lang.Object r4 = r4.get(r14)     // Catch:{ NullPointerException -> 0x01e9 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ NullPointerException -> 0x01e9 }
            if (r4 != 0) goto L_0x01df
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ NullPointerException -> 0x01e9 }
            r4.<init>()     // Catch:{ NullPointerException -> 0x01e9 }
        L_0x01df:
            r4.add(r7)     // Catch:{ NullPointerException -> 0x01e9 }
            android.util.SparseArray r5 = r3.f16334a     // Catch:{ NullPointerException -> 0x01e9 }
            r5.put(r14, r4)     // Catch:{ NullPointerException -> 0x01e9 }
            goto L_0x000d
        L_0x01e9:
            goto L_0x000d
        L_0x01ec:
            r0.f16338d = r3
            if (r3 != 0) goto L_0x01f1
            return r2
        L_0x01f1:
            r1 = 140(0x8c, float:1.96E-43)
            int r8 = r3.mo10168a(r1)
            com.android.f.a.a.p r3 = r0.f16338d
            if (r3 != 0) goto L_0x01fd
            goto L_0x0396
        L_0x01fd:
            int r1 = r3.mo10168a(r1)
            int r4 = r3.mo10168a(r6)
            if (r4 == 0) goto L_0x0396
            r4 = 155(0x9b, float:2.17E-43)
            r5 = 149(0x95, float:2.09E-43)
            r6 = 139(0x8b, float:1.95E-43)
            r7 = 133(0x85, float:1.86E-43)
            r14 = -1
            r12 = 152(0x98, float:2.13E-43)
            switch(r1) {
                case 128: goto L_0x02db;
                case 129: goto L_0x02cb;
                case 130: goto L_0x02a1;
                case 131: goto L_0x0293;
                case 132: goto L_0x0281;
                case 133: goto L_0x0275;
                case 134: goto L_0x0258;
                case 135: goto L_0x023c;
                case 136: goto L_0x0218;
                default: goto L_0x0216;
            }
        L_0x0216:
            goto L_0x0396
        L_0x0218:
            long r11 = r3.mo10169b(r7)
            int r1 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0396
            com.android.f.a.a.e r1 = r3.mo10170c(r9)
            if (r1 == 0) goto L_0x0396
            byte[] r1 = r3.mo10175h(r6)
            if (r1 == 0) goto L_0x0396
            int r1 = r3.mo10168a(r4)
            if (r1 == 0) goto L_0x0396
            r1 = 151(0x97, float:2.12E-43)
            com.android.f.a.a.e[] r1 = r3.mo10176i(r1)
            if (r1 != 0) goto L_0x027d
            goto L_0x0396
        L_0x023c:
            com.android.f.a.a.e r1 = r3.mo10170c(r9)
            if (r1 == 0) goto L_0x0396
            byte[] r1 = r3.mo10175h(r6)
            if (r1 == 0) goto L_0x0396
            int r1 = r3.mo10168a(r4)
            if (r1 == 0) goto L_0x0396
            r1 = 151(0x97, float:2.12E-43)
            com.android.f.a.a.e[] r1 = r3.mo10176i(r1)
            if (r1 != 0) goto L_0x027d
            goto L_0x0396
        L_0x0258:
            long r11 = r3.mo10169b(r7)
            int r1 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0396
            byte[] r1 = r3.mo10175h(r6)
            if (r1 == 0) goto L_0x0396
            int r1 = r3.mo10168a(r5)
            if (r1 == 0) goto L_0x0396
            r1 = 151(0x97, float:2.12E-43)
            com.android.f.a.a.e[] r1 = r3.mo10176i(r1)
            if (r1 == 0) goto L_0x0396
            goto L_0x027d
        L_0x0275:
            byte[] r1 = r3.mo10175h(r12)
            if (r1 != 0) goto L_0x027d
            goto L_0x0396
        L_0x027d:
            r1 = 132(0x84, float:1.85E-43)
            goto L_0x02f1
        L_0x0281:
            r1 = 132(0x84, float:1.85E-43)
            byte[] r4 = r3.mo10175h(r1)
            if (r4 == 0) goto L_0x0396
            long r3 = r3.mo10169b(r7)
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x027d
            goto L_0x0396
        L_0x0293:
            int r1 = r3.mo10168a(r5)
            if (r1 == 0) goto L_0x0396
            byte[] r1 = r3.mo10175h(r12)
            if (r1 != 0) goto L_0x027d
            goto L_0x0396
        L_0x02a1:
            r1 = 131(0x83, float:1.84E-43)
            byte[] r1 = r3.mo10175h(r1)
            if (r1 == 0) goto L_0x0396
            r1 = 136(0x88, float:1.9E-43)
            long r4 = r3.mo10169b(r1)
            int r1 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0396
            byte[] r1 = r3.mo10175h(r11)
            if (r1 == 0) goto L_0x0396
            r1 = 142(0x8e, float:1.99E-43)
            long r4 = r3.mo10169b(r1)
            int r1 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0396
            byte[] r1 = r3.mo10175h(r12)
            if (r1 != 0) goto L_0x027d
            goto L_0x0396
        L_0x02cb:
            r1 = 146(0x92, float:2.05E-43)
            int r1 = r3.mo10168a(r1)
            if (r1 == 0) goto L_0x0396
            byte[] r1 = r3.mo10175h(r12)
            if (r1 != 0) goto L_0x027d
            goto L_0x0396
        L_0x02db:
            r1 = 132(0x84, float:1.85E-43)
            byte[] r4 = r3.mo10175h(r1)
            if (r4 == 0) goto L_0x0396
            com.android.f.a.a.e r4 = r3.mo10170c(r9)
            if (r4 == 0) goto L_0x0396
            byte[] r3 = r3.mo10175h(r12)
            if (r3 != 0) goto L_0x02f1
            goto L_0x0396
        L_0x02f1:
            if (r8 == r10) goto L_0x02f7
            if (r8 != r1) goto L_0x0301
            r8 = 132(0x84, float:1.85E-43)
        L_0x02f7:
            java.io.ByteArrayInputStream r1 = r0.f16337c
            com.android.f.a.a.j r1 = m14036h(r1)
            r0.f16339e = r1
            if (r1 == 0) goto L_0x0396
        L_0x0301:
            switch(r8) {
                case 128: goto L_0x038c;
                case 129: goto L_0x0384;
                case 130: goto L_0x037c;
                case 131: goto L_0x0374;
                case 132: goto L_0x0325;
                case 133: goto L_0x031d;
                case 134: goto L_0x0315;
                case 135: goto L_0x030d;
                case 136: goto L_0x0305;
                default: goto L_0x0304;
            }
        L_0x0304:
            return r2
        L_0x0305:
            com.android.f.a.a.t r1 = new com.android.f.a.a.t
            com.android.f.a.a.p r2 = r0.f16338d
            r1.<init>(r2)
            return r1
        L_0x030d:
            com.android.f.a.a.u r1 = new com.android.f.a.a.u
            com.android.f.a.a.p r2 = r0.f16338d
            r1.<init>(r2)
            return r1
        L_0x0315:
            com.android.f.a.a.d r1 = new com.android.f.a.a.d
            com.android.f.a.a.p r2 = r0.f16338d
            r1.<init>(r2)
            return r1
        L_0x031d:
            com.android.f.a.a.a r1 = new com.android.f.a.a.a
            com.android.f.a.a.p r2 = r0.f16338d
            r1.<init>(r2)
            return r1
        L_0x0325:
            com.android.f.a.a.v r1 = new com.android.f.a.a.v
            com.android.f.a.a.p r3 = r0.f16338d
            com.android.f.a.a.j r4 = r0.f16339e
            r1.<init>(r3, r4)
            com.android.f.a.a.p r3 = r1.f16312a
            r4 = 132(0x84, float:1.85E-43)
            byte[] r3 = r3.mo10175h(r4)
            if (r3 != 0) goto L_0x0339
            return r2
        L_0x0339:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            java.lang.String r3 = "application/vnd.wap.multipart.mixed"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0373
            java.lang.String r3 = "application/vnd.wap.multipart.related"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0373
            java.lang.String r3 = "application/vnd.wap.multipart.alternative"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0357
            goto L_0x0373
        L_0x0357:
            java.lang.String r3 = "application/vnd.wap.multipart.alternative"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0372
            com.android.f.a.a.j r2 = r0.f16339e
            com.android.f.a.a.r r2 = r2.mo10150a(r13)
            com.android.f.a.a.j r3 = r0.f16339e
            java.util.Vector r3 = r3.f16314a
            r3.clear()
            com.android.f.a.a.j r3 = r0.f16339e
            r3.mo10151b(r2)
            return r1
        L_0x0372:
            return r2
        L_0x0373:
            return r1
        L_0x0374:
            com.android.f.a.a.i r1 = new com.android.f.a.a.i
            com.android.f.a.a.p r2 = r0.f16338d
            r1.<init>(r2)
            return r1
        L_0x037c:
            com.android.f.a.a.h r1 = new com.android.f.a.a.h
            com.android.f.a.a.p r2 = r0.f16338d
            r1.<init>(r2)
            return r1
        L_0x0384:
            com.android.f.a.a.w r1 = new com.android.f.a.a.w
            com.android.f.a.a.p r2 = r0.f16338d
            r1.<init>(r2)
            return r1
        L_0x038c:
            com.android.f.a.a.x r1 = new com.android.f.a.a.x
            com.android.f.a.a.p r2 = r0.f16338d
            com.android.f.a.a.j r3 = r0.f16339e
            r1.<init>(r2, r3)
            return r1
        L_0x0396:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p266f.p267a.p268a.C5132q.mo10177g():com.android.f.a.a.f");
    }
}
