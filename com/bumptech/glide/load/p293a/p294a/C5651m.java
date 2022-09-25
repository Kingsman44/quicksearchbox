package com.bumptech.glide.load.p293a.p294a;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.p291h.C5632s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.a.a.m */
/* compiled from: PG */
public final class C5651m implements C5642d {

    /* renamed from: a */
    private static final Bitmap.Config f17027a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    private final C5652n f17028b;

    /* renamed from: c */
    private final Set f17029c;

    /* renamed from: d */
    private final long f17030d;

    /* renamed from: e */
    private long f17031e;

    /* renamed from: f */
    private int f17032f;

    /* renamed from: g */
    private int f17033g;

    /* renamed from: h */
    private int f17034h;

    /* renamed from: i */
    private int f17035i;

    public C5651m(long j) {
        C5657s sVar = new C5657s();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add((Object) null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f17030d = j;
        this.f17028b = sVar;
        this.f17029c = unmodifiableSet;
    }

    /* renamed from: f */
    private static Bitmap m14680f(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f17027a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: g */
    private final synchronized Bitmap m14681g(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        int i3 = i;
        int i4 = i2;
        Bitmap.Config config2 = config;
        synchronized (this) {
            if (config2 != Bitmap.Config.HARDWARE) {
                C5652n nVar = this.f17028b;
                Bitmap.Config config3 = config2 != null ? config2 : f17027a;
                int b = C5632s.m14609b(i3, i4, config3);
                C5655q d = ((C5657s) nVar).f17045f.mo12133d(b, config3);
                int i5 = 0;
                if (Bitmap.Config.RGBA_F16.equals(config3)) {
                    configArr = C5657s.f17041b;
                } else {
                    int i6 = C5654p.f17036a[config3.ordinal()];
                    if (i6 == 1) {
                        configArr = C5657s.f17040a;
                    } else if (i6 == 2) {
                        configArr = C5657s.f17042c;
                    } else if (i6 != 3) {
                        configArr = i6 != 4 ? new Bitmap.Config[]{config3} : C5657s.f17044e;
                    } else {
                        configArr = C5657s.f17043d;
                    }
                }
                int length = configArr.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    Bitmap.Config config4 = configArr[i5];
                    Integer num = (Integer) ((C5657s) nVar).mo12134c(config4).ceilingKey(Integer.valueOf(b));
                    if (num == null || num.intValue() > b * 8) {
                        i5++;
                    } else {
                        if (num.intValue() == b) {
                            if (config4 == null) {
                                if (config3 != null) {
                                }
                            } else if (config4.equals(config3)) {
                            }
                        }
                        ((C5657s) nVar).f17045f.mo12112c(d);
                        d = ((C5657s) nVar).f17045f.mo12133d(num.intValue(), config4);
                    }
                }
                bitmap = (Bitmap) ((C5657s) nVar).f17046g.mo12120a(d);
                if (bitmap != null) {
                    ((C5657s) nVar).mo12135d(Integer.valueOf(d.f17037a), bitmap);
                    bitmap.reconfigure(i3, i4, config3);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 3)) {
                        Log.d("LruBitmapPool", "Missing bitmap=".concat(C5657s.m14695b(C5632s.m14609b(i, i2, config), config2)));
                    }
                    this.f17033g++;
                } else {
                    this.f17032f++;
                    this.f17031e -= (long) C5632s.m14608a(bitmap);
                    bitmap.setHasAlpha(true);
                    bitmap.setPremultiplied(true);
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Get bitmap=".concat(C5657s.m14695b(C5632s.m14609b(i, i2, config), config2)));
                }
                m14682h();
            } else {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + String.valueOf(config) + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        }
        return bitmap;
    }

    /* renamed from: h */
    private final void m14682h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m14683i();
        }
    }

    /* renamed from: i */
    private final void m14683i() {
        int i = this.f17032f;
        int i2 = this.f17033g;
        int i3 = this.f17034h;
        int i4 = this.f17035i;
        long j = this.f17031e;
        long j2 = this.f17030d;
        String obj = this.f17028b.toString();
        Log.v("LruBitmapPool", "Hits=" + i + ", misses=" + i2 + ", puts=" + i3 + ", evictions=" + i4 + ", currentSize=" + j + ", maxSize=" + j2 + "\nStrategy=" + obj);
    }

    /* renamed from: j */
    private final synchronized void m14684j(long j) {
        while (this.f17031e > j) {
            C5652n nVar = this.f17028b;
            Bitmap bitmap = (Bitmap) ((C5657s) nVar).f17046g.mo12121b();
            if (bitmap != null) {
                ((C5657s) nVar).mo12135d(Integer.valueOf(C5632s.m14608a(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m14683i();
                }
                this.f17031e = 0;
                return;
            }
            this.f17031e -= (long) C5632s.m14608a(bitmap);
            this.f17035i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=".concat(String.valueOf(this.f17028b.mo12129a(bitmap))));
            }
            m14682h();
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public final Bitmap mo12113a(int i, int i2, Bitmap.Config config) {
        Bitmap g = m14681g(i, i2, config);
        if (g == null) {
            return m14680f(i, i2, config);
        }
        g.eraseColor(0);
        return g;
    }

    /* renamed from: b */
    public final Bitmap mo12114b(int i, int i2, Bitmap.Config config) {
        Bitmap g = m14681g(i, i2, config);
        return g == null ? m14680f(i, i2, config) : g;
    }

    /* renamed from: c */
    public final void mo12115c() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m14684j(0);
    }

    /* renamed from: e */
    public final void mo12117e(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo12115c();
        } else if (i == 15) {
            m14684j(this.f17030d >> 1);
        }
    }

    /* renamed from: d */
    public final synchronized void mo12116d(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) C5632s.m14608a(bitmap)) <= this.f17030d) {
                        if (this.f17029c.contains(bitmap.getConfig())) {
                            int a = C5632s.m14608a(bitmap);
                            C5652n nVar = this.f17028b;
                            C5655q d = ((C5657s) nVar).f17045f.mo12133d(C5632s.m14608a(bitmap), bitmap.getConfig());
                            ((C5657s) nVar).f17046g.mo12122c(d, bitmap);
                            NavigableMap c = ((C5657s) nVar).mo12134c(bitmap.getConfig());
                            Integer num = (Integer) c.get(Integer.valueOf(d.f17037a));
                            c.put(Integer.valueOf(d.f17037a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                            this.f17034h++;
                            this.f17031e += (long) a;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=".concat(String.valueOf(this.f17028b.mo12129a(bitmap))));
                            }
                            m14682h();
                            m14684j(this.f17030d);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f17028b.mo12129a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f17029c.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }
}
