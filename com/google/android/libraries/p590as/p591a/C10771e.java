package com.google.android.libraries.p590as.p591a;

import com.google.android.libraries.p590as.p591a.p592a.C10767a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59332o;
import com.google.common.p4541l.C59337t;
import com.google.speech.recognizer.p5233a.C67451at;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;

/* renamed from: com.google.android.libraries.as.a.e */
/* compiled from: PG */
public final class C10771e {

    /* renamed from: a */
    private static final C59071e f35763a = C59071e.m91332i("com.google.android.libraries.as.a.e");

    /* renamed from: b */
    private static Constructor f35764b;

    private C10771e() {
    }

    /* renamed from: a */
    public static int m25764a(C67451at atVar) {
        if (atVar == C67451at.AMR) {
            return 8000;
        }
        if (atVar == C67451at.AMR_WB || atVar == C67451at.OGG_OPUS) {
            return 16000;
        }
        throw new RuntimeException("Unsupported AMR encoding: ".concat(String.valueOf(atVar.name())));
    }

    /* renamed from: b */
    public static long m25765b(long j, int i) {
        if (i != 1) {
            return j;
        }
        long min = Math.min(j, 24000);
        if (j != min) {
            ((C59052c) ((C59052c) f35763a.mo56226d()).mo56372aa(53932)).mo56359L("OggOpus bitrate reduced from %d to %d, as channel count was %d.", Long.valueOf(j), Long.valueOf(min), 1);
        }
        return min;
    }

    /* renamed from: c */
    public static C10770d m25766c(int i) {
        if (i == 16000) {
            return C10770d.AMRWB;
        }
        if (i == 8000) {
            return C10770d.AMR;
        }
        throw new IllegalArgumentException("Unsupported sample rate: " + i);
    }

    /* renamed from: d */
    public static InputStream m25767d(InputStream inputStream, int i, int i2, int i3) {
        return new C10778l(inputStream, i2, 2048, i, i3);
    }

    /* renamed from: e */
    public static InputStream m25768e(InputStream inputStream, C10776j jVar) {
        C67451at atVar = C67451at.LINEAR16;
        C10770d dVar = C10770d.AMR;
        int ordinal = jVar.mo19263d().ordinal();
        if (ordinal == 0) {
            return inputStream;
        }
        if (ordinal == 2) {
            return new C10769c(inputStream, "audio/flac", ((Integer) jVar.mo19262c().mo56107c()).intValue(), 2048, 30000, ((Integer) jVar.mo19260a().mo56107c()).intValue());
        } else if (ordinal == 3) {
            try {
                return new C10768b(inputStream);
            } catch (Exception unused) {
                try {
                    synchronized (C10771e.class) {
                        if (f35764b == null) {
                            f35764b = Class.forName("android.media.AmrInputStream").getConstructor(new Class[]{InputStream.class});
                        }
                        return (InputStream) f35764b.newInstance(new Object[]{inputStream});
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception while instantiating AmrInputStream", e);
                }
            }
        } else if (ordinal == 9) {
            return new C10769c(inputStream, "audio/amr-wb", 16000, 2048, 23850, 1);
        } else {
            if (ordinal == 10) {
                return m25767d(inputStream, ((Integer) jVar.mo19261b().mo56107c()).intValue(), ((Integer) jVar.mo19262c().mo56107c()).intValue(), ((Integer) jVar.mo19260a().mo56107c()).intValue());
            }
            throw new IllegalArgumentException("unsupported encoding: ".concat(String.valueOf(jVar.mo19263d().name())));
        }
    }

    @Deprecated
    /* renamed from: f */
    public static byte[] m25769f(C10770d dVar, byte[] bArr) {
        C67451at atVar = C67451at.LINEAR16;
        C10770d dVar2 = C10770d.AMR;
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            return m25770g(bArr, C67451at.AMR, true);
        }
        if (ordinal == 1) {
            return m25770g(bArr, C67451at.AMR_WB, false);
        }
        throw new IllegalArgumentException("Encoding not supported: ".concat(String.valueOf(String.valueOf(dVar))));
    }

    /* renamed from: g */
    public static byte[] m25770g(byte[] bArr, C67451at atVar, boolean z) {
        Throwable th;
        InputStream inputStream;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            C10772f fVar = new C10772f();
            fVar.mo19257g(atVar);
            inputStream = m25768e(byteArrayInputStream, fVar.mo19268j());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (z) {
                    byteArrayOutputStream.write("#!AMR\n".getBytes());
                }
                byte[] bArr2 = new byte[384];
                while (true) {
                    int a = C59332o.m92210a(inputStream, bArr2, 0, 384);
                    if (a > 0) {
                        byteArrayOutputStream.write(bArr2, 0, a);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        C59337t.m92221a(inputStream);
                        return byteArray;
                    }
                }
            } catch (IOException e) {
                throw new C10767a(e);
            } catch (IOException e2) {
                throw new C10767a(e2);
            } catch (Throwable th2) {
                th = th2;
                C59337t.m92221a(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            C59337t.m92221a(inputStream);
            throw th;
        }
    }

    /* renamed from: h */
    public static byte[] m25771h(C67451at atVar) {
        int i;
        C67451at atVar2 = C67451at.LINEAR16;
        C10770d dVar = C10770d.AMR;
        int ordinal = atVar.ordinal();
        if (!(ordinal == 0 || ordinal == 2)) {
            if (ordinal == 3) {
                i = 384;
                return new byte[i];
            } else if (!(ordinal == 9 || ordinal == 10)) {
                throw new RuntimeException("Unsupported encoding: ".concat(String.valueOf(atVar.name())));
            }
        }
        i = 224;
        return new byte[i];
    }
}
