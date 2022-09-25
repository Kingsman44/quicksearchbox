package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ape */
/* compiled from: PG */
public abstract class ape implements apd {

    /* renamed from: a */
    protected DisplayMetrics f21327a;

    /* renamed from: b */
    protected final apm f21328b;

    /* renamed from: c */
    private final C6801app f21329c;

    protected ape(Context context, apm apm, C6801app app) {
        this.f21328b = apm;
        this.f21329c = app;
        try {
            this.f21327a = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException unused) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f21327a = displayMetrics;
            displayMetrics.density = 1.0f;
        }
    }

    /* renamed from: e */
    private final void m19209e() {
        this.f21329c.mo15149a();
    }

    /* renamed from: f */
    private final byte[] m19210f() {
        return this.f21329c.mo15152d();
    }

    /* renamed from: g */
    private final String m19211g(Context context, boolean z) {
        byte[] f;
        byte[] bArr;
        try {
            synchronized (this) {
                m19209e();
                mo15137b(context);
                f = m19210f();
            }
            int length = f.length;
            if (length == 0) {
                return Integer.toString(5);
            }
            if (length > 239) {
                m19209e();
                mo15138c(20, 1);
                f = m19210f();
            }
            int length2 = f.length;
            if (length2 < 239) {
                byte[] bArr2 = new byte[(239 - length2)];
                new SecureRandom().nextBytes(bArr2);
                bArr = ByteBuffer.allocate(240).put((byte) length2).put(f).put(bArr2).array();
            } else {
                bArr = ByteBuffer.allocate(240).put((byte) length2).put(f).array();
            }
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] array = ByteBuffer.allocate(256).put(instance.digest()).put(bArr).array();
            byte[] bArr3 = new byte[256];
            aop[] aopArr = new apc().f21277cN;
            int length3 = aopArr.length;
            for (int i = 0; i < 12; i++) {
                aopArr[i].mo15134a(array, bArr3);
            }
            return this.f21328b.mo15133b(bArr3);
        } catch (NoSuchAlgorithmException unused) {
            return Integer.toString(7);
        } catch (UnsupportedEncodingException unused2) {
            return Integer.toString(7);
        } catch (IOException unused3) {
            return Integer.toString(3);
        }
    }

    /* renamed from: a */
    public final String mo15136a(Context context) {
        return m19211g(context, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo15137b(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo15138c(int i, long j) {
        this.f21329c.mo15150b(i, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo15139d(int i, String str) {
        this.f21329c.mo15151c(i, str);
    }
}
