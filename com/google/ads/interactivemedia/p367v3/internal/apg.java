package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.ads.interactivemedia.v3.internal.apg */
/* compiled from: PG */
public class apg extends ape {

    /* renamed from: c */
    static boolean f21330c = false;

    /* renamed from: d */
    private static Method f21331d;

    /* renamed from: e */
    private static Method f21332e;

    /* renamed from: f */
    private static Method f21333f;

    /* renamed from: g */
    private static Method f21334g;

    /* renamed from: h */
    private static Method f21335h;

    /* renamed from: i */
    private static Method f21336i;

    /* renamed from: j */
    private static Method f21337j;

    /* renamed from: k */
    private static Method f21338k;

    /* renamed from: l */
    private static Method f21339l;

    /* renamed from: m */
    private static Method f21340m;

    /* renamed from: n */
    private static Method f21341n;

    /* renamed from: o */
    private static Method f21342o;

    /* renamed from: p */
    private static String f21343p;

    /* renamed from: q */
    private static String f21344q;

    /* renamed from: r */
    private static String f21345r;

    /* renamed from: s */
    private static long f21346s;

    /* renamed from: t */
    private static apo f21347t;

    protected apg(Context context, apm apm, C6801app app) {
        super(context, apm, app);
    }

    /* renamed from: e */
    static String m19216e() {
        String str = f21343p;
        if (str != null) {
            return str;
        }
        throw new apf();
    }

    /* renamed from: f */
    static Long m19217f() {
        Method method = f21331d;
        if (method != null) {
            try {
                return (Long) method.invoke((Object) null, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new apf(e);
            } catch (InvocationTargetException e2) {
                throw new apf(e2);
            }
        } else {
            throw new apf();
        }
    }

    /* renamed from: g */
    static String m19218g(Context context) {
        Method method = f21335h;
        if (method != null) {
            try {
                String str = (String) method.invoke((Object) null, new Object[]{context});
                if (str != null) {
                    return str;
                }
                throw new apf();
            } catch (IllegalAccessException e) {
                throw new apf(e);
            } catch (InvocationTargetException e2) {
                throw new apf(e2);
            }
        } else {
            throw new apf();
        }
    }

    /* renamed from: h */
    static String m19219h() {
        Method method = f21333f;
        if (method != null) {
            try {
                return (String) method.invoke((Object) null, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new apf(e);
            } catch (InvocationTargetException e2) {
                throw new apf(e2);
            }
        } else {
            throw new apf();
        }
    }

    /* renamed from: i */
    static String m19220i(Context context) {
        Method method = f21339l;
        if (method != null) {
            try {
                return (String) method.invoke((Object) null, new Object[]{context});
            } catch (IllegalAccessException e) {
                throw new apf(e);
            } catch (InvocationTargetException e2) {
                throw new apf(e2);
            }
        } else {
            throw new apf();
        }
    }

    /* renamed from: j */
    static Long m19221j(Context context) {
        Method method = f21340m;
        if (method != null) {
            try {
                return (Long) method.invoke((Object) null, new Object[]{context});
            } catch (IllegalAccessException e) {
                throw new apf(e);
            } catch (InvocationTargetException e2) {
                throw new apf(e2);
            }
        } else {
            throw new apf();
        }
    }

    /* renamed from: k */
    protected static synchronized void m19222k(Context context, apm apm) {
        File file;
        File file2;
        synchronized (apg.class) {
            if (!f21330c) {
                try {
                    apo apo = new apo(apm);
                    f21347t = apo;
                    f21343p = "a.3.21.0";
                    byte[] b = apo.mo15148b();
                    byte[] a = f21347t.mo15147a(b, "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");
                    File cacheDir = context.getCacheDir();
                    if (cacheDir == null) {
                        cacheDir = context.getDir("dex", 0);
                        if (cacheDir == null) {
                            throw new apf();
                        }
                    } else {
                        Context context2 = context;
                    }
                    File createTempFile = File.createTempFile("ads", ".jar", cacheDir);
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    fileOutputStream.write(a, 0, a.length);
                    fileOutputStream.close();
                    try {
                        DexClassLoader dexClassLoader = new DexClassLoader(createTempFile.getAbsolutePath(), cacheDir.getAbsolutePath(), (String) null, context.getClassLoader());
                        Class loadClass = dexClassLoader.loadClass(m19223l(b, "13+D8YKo7JA4YclLYFLTkDoLYm79WC6PTAAgd/iaV5l4mfBjRCrtCqwg533KI4Aw"));
                        Class loadClass2 = dexClassLoader.loadClass(m19223l(b, "52UTclpblbgPZlv7Nj6v0rtDMPh43h349e01ntb69/chxdGasn3EykJHT0GFkNS+"));
                        Class loadClass3 = dexClassLoader.loadClass(m19223l(b, "PLcKoSXa/7Erhgptf0Tz500+Zs0BLV22dGPCJPuPX1GNC9pyFVkRFks19kPnvjsE"));
                        Class loadClass4 = dexClassLoader.loadClass(m19223l(b, "BVu9+hfoVnCGMY+PLQku1FUwfoIHRy389bNZXV62hXZUkceukjyax4oNU/CRj5DY"));
                        Class loadClass5 = dexClassLoader.loadClass(m19223l(b, "lO2J0nQ8iUbwpSP7x7JVTRl9z6TOAokJraLnSEcbLEoX9aCYnEQiu/7d/0ADK+Kt"));
                        Class loadClass6 = dexClassLoader.loadClass(m19223l(b, "3STGKgBH0KW29J9eL7SkydCEoMJ5wVqqxnqpt7l1d/UdAE49dT9zzc+xme8GwL0S"));
                        Class loadClass7 = dexClassLoader.loadClass(m19223l(b, "R75TFH8UxzX6KzwmMOIAiEOgZ3w/LZFVVBMgCkszL4MS7jU6KCq3bFshhYLpG/lm"));
                        Class loadClass8 = dexClassLoader.loadClass(m19223l(b, "Cd51XF2SemCUJwXZiKeIYddl4xLKDa/a258CP7t9qBxOqbBbeoj3yUZZjpA6+SrQ"));
                        Class loadClass9 = dexClassLoader.loadClass(m19223l(b, "6Op3Osq/ycP+Tw/h0nZIOiaxu9PqhRTncsN3gXFfkXzFNVbOmFRaKWvs9L9+aZBY"));
                        Class loadClass10 = dexClassLoader.loadClass(m19223l(b, "/RcUmTOFoVKQmYTx4SXUI3MZ+V8YeEVVMyskmyn2LKriaejeXpUmZci+LjJRw7Qi"));
                        Class loadClass11 = dexClassLoader.loadClass(m19223l(b, "6LQAb447ICiHxbmOtmji3D4hpfwXiEjse1ir9OC50xqyamJ/KbX1/nX8AsL+bHcb"));
                        File file3 = cacheDir;
                        try {
                            Class loadClass12 = dexClassLoader.loadClass(m19223l(b, "OJV6xVIR1eh7tYy9riemmYtkPaU/NBCWvnOl95ehf5cPSRNoet0V98Y76fm3gKIx"));
                            file = createTempFile;
                            try {
                                Class loadClass13 = dexClassLoader.loadClass(m19223l(b, "eHOtFwMll5L1Neq7FYSb/mAfmCK3mjwD+kcR5jCosVyfkrvUDmIwRjmV8+q2NHYn"));
                                f21331d = loadClass.getMethod(m19223l(b, "GTcx0b8AlfY1ZowRGVcxzzHzJO55sJlZwAMsaBOasD4="), new Class[0]);
                                f21332e = loadClass2.getMethod(m19223l(b, "H2mF8ih5ZQ8pxTr+44xGtS8h3iHalDiydTmNQvvB9PE="), new Class[0]);
                                f21333f = loadClass3.getMethod(m19223l(b, "6ZHRPIXbN2vTr12hv8v+TAgfU76HlS1m5AiZXFvaSto="), new Class[0]);
                                f21334g = loadClass4.getMethod(m19223l(b, "dx4bb6UNwy6nC3HkcVDqL3Rsfu1d3Z1Pe6GiKK6hZrw="), new Class[]{Context.class});
                                loadClass5.getMethod(m19223l(b, "yTAAp+clNbNF5Td/QjC7p5K6b33nl9lorC0oZXbsQ+A="), new Class[]{MotionEvent.class, DisplayMetrics.class});
                                f21335h = loadClass6.getMethod(m19223l(b, "qb4zfYvhFYr4xgO9UX/SM6bCi7jkPggWD8USiOhVgzo="), new Class[]{Context.class});
                                f21336i = loadClass7.getMethod(m19223l(b, "SOQAY/Yc8NWIdkLAhBUoY0hR/vEv4aG+caNKA29L5T8="), new Class[]{Context.class});
                                f21337j = loadClass8.getMethod(m19223l(b, "MR/p4pF6zrM2yOWsh7Kq5dbwUT5Plh7L/wEZR20DFJc="), new Class[]{Context.class});
                                f21338k = loadClass9.getMethod(m19223l(b, "q9p7XgEInfiuZrB/emAOSeQGTPIFmNmpVflkcIcq4bg="), new Class[]{Context.class});
                                f21339l = loadClass10.getMethod(m19223l(b, "b42TKHdy7hWPdEEpyazy/kll9Hb0px+6KEorIMPWagk="), new Class[]{Context.class});
                                f21340m = loadClass11.getMethod(m19223l(b, "1BCDmMTvausZ3wHdSO9fsXVYA9qCh8/EnuL2Cru5aZ8="), new Class[]{Context.class});
                                f21341n = loadClass12.getMethod(m19223l(b, "foNiPa3eaLdvcAZc5cQJrbbRL+KJK+PxPLQjHS2rrNE="), new Class[]{Context.class});
                                f21342o = loadClass13.getMethod(m19223l(b, "wzEQNL6fxZpDqLLHWbHIQaIaTEFKm5CSEQgkOmhzams="), new Class[]{Context.class});
                                String name = file.getName();
                                file.delete();
                                new File(file3, name.replace(".jar", ".dex")).delete();
                                f21346s = m19217f().longValue();
                                f21330c = true;
                            } catch (Throwable th) {
                                th = th;
                                file2 = file3;
                                String name2 = file.getName();
                                file.delete();
                                new File(file2, name2.replace(".jar", ".dex")).delete();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            file = createTempFile;
                            file2 = file3;
                            String name22 = file.getName();
                            file.delete();
                            new File(file2, name22.replace(".jar", ".dex")).delete();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file2 = cacheDir;
                        file = createTempFile;
                        String name222 = file.getName();
                        file.delete();
                        new File(file2, name222.replace(".jar", ".dex")).delete();
                        throw th;
                    }
                } catch (FileNotFoundException e) {
                    throw new apf(e);
                } catch (IOException e2) {
                    throw new apf(e2);
                } catch (ClassNotFoundException e3) {
                    throw new apf(e3);
                } catch (apn e4) {
                    throw new apf(e4);
                } catch (NoSuchMethodException e5) {
                    throw new apf(e5);
                } catch (NullPointerException e6) {
                    throw new apf(e6);
                } catch (apf unused) {
                } catch (UnsupportedOperationException unused2) {
                }
            }
        }
    }

    /* renamed from: l */
    private static String m19223l(byte[] bArr, String str) {
        try {
            return new String(f21347t.mo15147a(bArr, str), "UTF-8");
        } catch (apn e) {
            throw new apf(e);
        } catch (UnsupportedEncodingException e2) {
            throw new apf(e2);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:(5:134|135|136|137|138)|147|148|149|150|152) */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x012f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x0160 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x018d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x01b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x01c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0083 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x00ee */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0133 A[SYNTHETIC, Splitter:B:103:0x0133] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025 A[Catch:{ apf -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x015a A[Catch:{ IllegalAccessException -> 0x0153, InvocationTargetException -> 0x014c, apf -> 0x0160 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0164 A[SYNTHETIC, Splitter:B:118:0x0164] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0187 A[Catch:{ IllegalAccessException -> 0x0180, InvocationTargetException -> 0x0179, apf -> 0x018d }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0191 A[SYNTHETIC, Splitter:B:134:0x0191] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01b3 A[Catch:{ IllegalAccessException -> 0x01ac, InvocationTargetException -> 0x01a5, apf -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:149:0x01c2] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038 A[SYNTHETIC, Splitter:B:16:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d A[Catch:{ IllegalAccessException -> 0x0076, InvocationTargetException -> 0x006f, apf -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3 A[Catch:{ IllegalAccessException -> 0x00e1, InvocationTargetException -> 0x00da, apf -> 0x00ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4 A[Catch:{ IllegalAccessException -> 0x00e1, InvocationTargetException -> 0x00da, apf -> 0x00ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f4 A[Catch:{ IllegalAccessException -> 0x0122, InvocationTargetException -> 0x011b, apf -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f5 A[Catch:{ IllegalAccessException -> 0x0122, InvocationTargetException -> 0x011b, apf -> 0x012f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15137b(android.content.Context r10) {
        /*
            r9 = this;
            r0 = 1
            java.lang.String r1 = m19219h()     // Catch:{ apf -> 0x0008 }
            r9.mo15139d(r0, r1)     // Catch:{ apf -> 0x0008 }
        L_0x0008:
            r1 = 2
            java.lang.String r2 = m19216e()     // Catch:{ apf -> 0x0010 }
            r9.mo15139d(r1, r2)     // Catch:{ apf -> 0x0010 }
        L_0x0010:
            java.lang.Long r2 = m19217f()     // Catch:{ apf -> 0x0032 }
            long r2 = r2.longValue()     // Catch:{ apf -> 0x0032 }
            r4 = 25
            r9.mo15138c(r4, r2)     // Catch:{ apf -> 0x0032 }
            long r4 = f21346s     // Catch:{ apf -> 0x0032 }
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0032
            r6 = 17
            long r2 = r2 - r4
            r9.mo15138c(r6, r2)     // Catch:{ apf -> 0x0032 }
            long r2 = f21346s     // Catch:{ apf -> 0x0032 }
            r4 = 23
            r9.mo15138c(r4, r2)     // Catch:{ apf -> 0x0032 }
        L_0x0032:
            r2 = 0
            r3 = 0
            java.lang.reflect.Method r4 = f21337j     // Catch:{ apf -> 0x0083 }
            if (r4 == 0) goto L_0x007d
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException -> 0x0076, InvocationTargetException -> 0x006f }
            r5[r3] = r10     // Catch:{ IllegalAccessException -> 0x0076, InvocationTargetException -> 0x006f }
            java.lang.Object r4 = r4.invoke(r2, r5)     // Catch:{ IllegalAccessException -> 0x0076, InvocationTargetException -> 0x006f }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ IllegalAccessException -> 0x0076, InvocationTargetException -> 0x006f }
            if (r4 == 0) goto L_0x0069
            int r5 = r4.size()     // Catch:{ IllegalAccessException -> 0x0076, InvocationTargetException -> 0x006f }
            if (r5 != r1) goto L_0x0069
            java.lang.Object r1 = r4.get(r3)     // Catch:{ apf -> 0x0083 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ apf -> 0x0083 }
            long r5 = r1.longValue()     // Catch:{ apf -> 0x0083 }
            r1 = 31
            r9.mo15138c(r1, r5)     // Catch:{ apf -> 0x0083 }
            java.lang.Object r1 = r4.get(r0)     // Catch:{ apf -> 0x0083 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ apf -> 0x0083 }
            long r4 = r1.longValue()     // Catch:{ apf -> 0x0083 }
            r1 = 32
            r9.mo15138c(r1, r4)     // Catch:{ apf -> 0x0083 }
            goto L_0x0083
        L_0x0069:
            com.google.ads.interactivemedia.v3.internal.apf r1 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ IllegalAccessException -> 0x0076, InvocationTargetException -> 0x006f }
            r1.<init>()     // Catch:{ IllegalAccessException -> 0x0076, InvocationTargetException -> 0x006f }
            throw r1     // Catch:{ IllegalAccessException -> 0x0076, InvocationTargetException -> 0x006f }
        L_0x006f:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r4 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x0083 }
            r4.<init>(r1)     // Catch:{ apf -> 0x0083 }
            throw r4     // Catch:{ apf -> 0x0083 }
        L_0x0076:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r4 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x0083 }
            r4.<init>(r1)     // Catch:{ apf -> 0x0083 }
            throw r4     // Catch:{ apf -> 0x0083 }
        L_0x007d:
            com.google.ads.interactivemedia.v3.internal.apf r1 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x0083 }
            r1.<init>()     // Catch:{ apf -> 0x0083 }
            throw r1     // Catch:{ apf -> 0x0083 }
        L_0x0083:
            java.lang.reflect.Method r1 = f21332e     // Catch:{ apf -> 0x00ad }
            if (r1 == 0) goto L_0x00a7
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x00a0, InvocationTargetException -> 0x0099 }
            java.lang.Object r1 = r1.invoke(r2, r4)     // Catch:{ IllegalAccessException -> 0x00a0, InvocationTargetException -> 0x0099 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IllegalAccessException -> 0x00a0, InvocationTargetException -> 0x0099 }
            long r4 = r1.longValue()     // Catch:{ apf -> 0x00ad }
            r1 = 33
            r9.mo15138c(r1, r4)     // Catch:{ apf -> 0x00ad }
            goto L_0x00ad
        L_0x0099:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r4 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x00ad }
            r4.<init>(r1)     // Catch:{ apf -> 0x00ad }
            throw r4     // Catch:{ apf -> 0x00ad }
        L_0x00a0:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r4 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x00ad }
            r4.<init>(r1)     // Catch:{ apf -> 0x00ad }
            throw r4     // Catch:{ apf -> 0x00ad }
        L_0x00a7:
            com.google.ads.interactivemedia.v3.internal.apf r1 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x00ad }
            r1.<init>()     // Catch:{ apf -> 0x00ad }
            throw r1     // Catch:{ apf -> 0x00ad }
        L_0x00ad:
            com.google.ads.interactivemedia.v3.internal.apm r1 = r9.f21328b     // Catch:{ apf -> 0x00ee }
            java.lang.String r4 = f21344q     // Catch:{ apf -> 0x00ee }
            if (r4 == 0) goto L_0x00b4
            goto L_0x00ce
        L_0x00b4:
            java.lang.reflect.Method r4 = f21334g     // Catch:{ apf -> 0x00ee }
            if (r4 == 0) goto L_0x00e8
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException -> 0x00e1, InvocationTargetException -> 0x00da }
            r5[r3] = r10     // Catch:{ IllegalAccessException -> 0x00e1, InvocationTargetException -> 0x00da }
            java.lang.Object r4 = r4.invoke(r2, r5)     // Catch:{ IllegalAccessException -> 0x00e1, InvocationTargetException -> 0x00da }
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch:{ IllegalAccessException -> 0x00e1, InvocationTargetException -> 0x00da }
            if (r4 == 0) goto L_0x00d4
            byte[] r4 = r4.array()     // Catch:{ IllegalAccessException -> 0x00e1, InvocationTargetException -> 0x00da }
            java.lang.String r4 = r1.mo15133b(r4)     // Catch:{ IllegalAccessException -> 0x00e1, InvocationTargetException -> 0x00da }
            f21344q = r4     // Catch:{ IllegalAccessException -> 0x00e1, InvocationTargetException -> 0x00da }
        L_0x00ce:
            r1 = 27
            r9.mo15139d(r1, r4)     // Catch:{ apf -> 0x00ee }
            goto L_0x00ee
        L_0x00d4:
            com.google.ads.interactivemedia.v3.internal.apf r1 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ IllegalAccessException -> 0x00e1, InvocationTargetException -> 0x00da }
            r1.<init>()     // Catch:{ IllegalAccessException -> 0x00e1, InvocationTargetException -> 0x00da }
            throw r1     // Catch:{ IllegalAccessException -> 0x00e1, InvocationTargetException -> 0x00da }
        L_0x00da:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r4 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x00ee }
            r4.<init>(r1)     // Catch:{ apf -> 0x00ee }
            throw r4     // Catch:{ apf -> 0x00ee }
        L_0x00e1:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r4 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x00ee }
            r4.<init>(r1)     // Catch:{ apf -> 0x00ee }
            throw r4     // Catch:{ apf -> 0x00ee }
        L_0x00e8:
            com.google.ads.interactivemedia.v3.internal.apf r1 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x00ee }
            r1.<init>()     // Catch:{ apf -> 0x00ee }
            throw r1     // Catch:{ apf -> 0x00ee }
        L_0x00ee:
            com.google.ads.interactivemedia.v3.internal.apm r1 = r9.f21328b     // Catch:{ apf -> 0x012f }
            java.lang.String r4 = f21345r     // Catch:{ apf -> 0x012f }
            if (r4 == 0) goto L_0x00f5
            goto L_0x010f
        L_0x00f5:
            java.lang.reflect.Method r4 = f21336i     // Catch:{ apf -> 0x012f }
            if (r4 == 0) goto L_0x0129
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException -> 0x0122, InvocationTargetException -> 0x011b }
            r5[r3] = r10     // Catch:{ IllegalAccessException -> 0x0122, InvocationTargetException -> 0x011b }
            java.lang.Object r4 = r4.invoke(r2, r5)     // Catch:{ IllegalAccessException -> 0x0122, InvocationTargetException -> 0x011b }
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4     // Catch:{ IllegalAccessException -> 0x0122, InvocationTargetException -> 0x011b }
            if (r4 == 0) goto L_0x0115
            byte[] r4 = r4.array()     // Catch:{ IllegalAccessException -> 0x0122, InvocationTargetException -> 0x011b }
            java.lang.String r4 = r1.mo15133b(r4)     // Catch:{ IllegalAccessException -> 0x0122, InvocationTargetException -> 0x011b }
            f21345r = r4     // Catch:{ IllegalAccessException -> 0x0122, InvocationTargetException -> 0x011b }
        L_0x010f:
            r1 = 29
            r9.mo15139d(r1, r4)     // Catch:{ apf -> 0x012f }
            goto L_0x012f
        L_0x0115:
            com.google.ads.interactivemedia.v3.internal.apf r1 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ IllegalAccessException -> 0x0122, InvocationTargetException -> 0x011b }
            r1.<init>()     // Catch:{ IllegalAccessException -> 0x0122, InvocationTargetException -> 0x011b }
            throw r1     // Catch:{ IllegalAccessException -> 0x0122, InvocationTargetException -> 0x011b }
        L_0x011b:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r4 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x012f }
            r4.<init>(r1)     // Catch:{ apf -> 0x012f }
            throw r4     // Catch:{ apf -> 0x012f }
        L_0x0122:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r4 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x012f }
            r4.<init>(r1)     // Catch:{ apf -> 0x012f }
            throw r4     // Catch:{ apf -> 0x012f }
        L_0x0129:
            com.google.ads.interactivemedia.v3.internal.apf r1 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x012f }
            r1.<init>()     // Catch:{ apf -> 0x012f }
            throw r1     // Catch:{ apf -> 0x012f }
        L_0x012f:
            java.lang.reflect.Method r1 = f21338k     // Catch:{ apf -> 0x0160 }
            if (r1 == 0) goto L_0x015a
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException -> 0x0153, InvocationTargetException -> 0x014c }
            r4[r3] = r10     // Catch:{ IllegalAccessException -> 0x0153, InvocationTargetException -> 0x014c }
            java.lang.Object r1 = r1.invoke(r2, r4)     // Catch:{ IllegalAccessException -> 0x0153, InvocationTargetException -> 0x014c }
            int[] r1 = (int[]) r1     // Catch:{ IllegalAccessException -> 0x0153, InvocationTargetException -> 0x014c }
            r4 = r1[r3]     // Catch:{ apf -> 0x0160 }
            long r4 = (long) r4     // Catch:{ apf -> 0x0160 }
            r6 = 5
            r9.mo15138c(r6, r4)     // Catch:{ apf -> 0x0160 }
            r1 = r1[r0]     // Catch:{ apf -> 0x0160 }
            long r4 = (long) r1     // Catch:{ apf -> 0x0160 }
            r1 = 6
            r9.mo15138c(r1, r4)     // Catch:{ apf -> 0x0160 }
            goto L_0x0160
        L_0x014c:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r4 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x0160 }
            r4.<init>(r1)     // Catch:{ apf -> 0x0160 }
            throw r4     // Catch:{ apf -> 0x0160 }
        L_0x0153:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r4 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x0160 }
            r4.<init>(r1)     // Catch:{ apf -> 0x0160 }
            throw r4     // Catch:{ apf -> 0x0160 }
        L_0x015a:
            com.google.ads.interactivemedia.v3.internal.apf r1 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x0160 }
            r1.<init>()     // Catch:{ apf -> 0x0160 }
            throw r1     // Catch:{ apf -> 0x0160 }
        L_0x0160:
            java.lang.reflect.Method r1 = f21341n     // Catch:{ apf -> 0x018d }
            if (r1 == 0) goto L_0x0187
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException -> 0x0180, InvocationTargetException -> 0x0179 }
            r4[r3] = r10     // Catch:{ IllegalAccessException -> 0x0180, InvocationTargetException -> 0x0179 }
            java.lang.Object r1 = r1.invoke(r2, r4)     // Catch:{ IllegalAccessException -> 0x0180, InvocationTargetException -> 0x0179 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException -> 0x0180, InvocationTargetException -> 0x0179 }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException -> 0x0180, InvocationTargetException -> 0x0179 }
            r4 = 12
            long r5 = (long) r1
            r9.mo15138c(r4, r5)     // Catch:{ apf -> 0x018d }
            goto L_0x018d
        L_0x0179:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r4 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x018d }
            r4.<init>(r1)     // Catch:{ apf -> 0x018d }
            throw r4     // Catch:{ apf -> 0x018d }
        L_0x0180:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r4 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x018d }
            r4.<init>(r1)     // Catch:{ apf -> 0x018d }
            throw r4     // Catch:{ apf -> 0x018d }
        L_0x0187:
            com.google.ads.interactivemedia.v3.internal.apf r1 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x018d }
            r1.<init>()     // Catch:{ apf -> 0x018d }
            throw r1     // Catch:{ apf -> 0x018d }
        L_0x018d:
            java.lang.reflect.Method r1 = f21342o     // Catch:{ apf -> 0x01b9 }
            if (r1 == 0) goto L_0x01b3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException -> 0x01ac, InvocationTargetException -> 0x01a5 }
            r0[r3] = r10     // Catch:{ IllegalAccessException -> 0x01ac, InvocationTargetException -> 0x01a5 }
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch:{ IllegalAccessException -> 0x01ac, InvocationTargetException -> 0x01a5 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalAccessException -> 0x01ac, InvocationTargetException -> 0x01a5 }
            int r0 = r0.intValue()     // Catch:{ IllegalAccessException -> 0x01ac, InvocationTargetException -> 0x01a5 }
            r1 = 3
            long r2 = (long) r0
            r9.mo15138c(r1, r2)     // Catch:{ apf -> 0x01b9 }
            goto L_0x01b9
        L_0x01a5:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r1 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x01b9 }
            r1.<init>(r0)     // Catch:{ apf -> 0x01b9 }
            throw r1     // Catch:{ apf -> 0x01b9 }
        L_0x01ac:
            r0 = move-exception
            com.google.ads.interactivemedia.v3.internal.apf r1 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x01b9 }
            r1.<init>(r0)     // Catch:{ apf -> 0x01b9 }
            throw r1     // Catch:{ apf -> 0x01b9 }
        L_0x01b3:
            com.google.ads.interactivemedia.v3.internal.apf r0 = new com.google.ads.interactivemedia.v3.internal.apf     // Catch:{ apf -> 0x01b9 }
            r0.<init>()     // Catch:{ apf -> 0x01b9 }
            throw r0     // Catch:{ apf -> 0x01b9 }
        L_0x01b9:
            java.lang.String r0 = m19220i(r10)     // Catch:{ apf -> 0x01c2 }
            r1 = 34
            r9.mo15139d(r1, r0)     // Catch:{ apf -> 0x01c2 }
        L_0x01c2:
            java.lang.Long r10 = m19221j(r10)     // Catch:{ IOException -> 0x01cf, IOException -> 0x01cf }
            long r0 = r10.longValue()     // Catch:{ IOException -> 0x01cf, IOException -> 0x01cf }
            r10 = 35
            r9.mo15138c(r10, r0)     // Catch:{ IOException -> 0x01cf, IOException -> 0x01cf }
        L_0x01cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.apg.mo15137b(android.content.Context):void");
    }
}
