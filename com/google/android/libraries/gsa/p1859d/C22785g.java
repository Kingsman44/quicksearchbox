package com.google.android.libraries.gsa.p1859d;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.libraries.gsa.d.g */
/* compiled from: PG */
public final class C22785g {

    /* renamed from: a */
    private final String f62725a;

    /* renamed from: b */
    private final C22784f[] f62726b;

    /* renamed from: c */
    private int f62727c = 0;

    public C22785g(String str, int i) {
        this.f62725a = str;
        this.f62726b = new C22784f[i];
    }

    /* renamed from: e */
    private static boolean m42595e(C22784f fVar, int i, String str) {
        return fVar != null && fVar.f62720a == i && fVar.f62721b.equals(str);
    }

    /* renamed from: a */
    public final void mo28121a(String str) {
        mo28123c(0, str, 0.0f);
    }

    /* renamed from: b */
    public final void mo28122b(String str, boolean z) {
        mo28123c(true != z ? 4 : 3, str, 0.0f);
    }

    /* renamed from: c */
    public final void mo28123c(int i, String str, float f) {
        int i2 = this.f62727c;
        C22784f[] fVarArr = this.f62726b;
        int length = fVarArr.length;
        int i3 = i2 + length;
        int i4 = (i3 - 1) % length;
        int i5 = (i3 - 2) % length;
        if (!m42595e(fVarArr[i4], i, str) || !m42595e(this.f62726b[i5], i, str)) {
            C22784f[] fVarArr2 = this.f62726b;
            int i6 = this.f62727c;
            C22784f fVar = fVarArr2[i6];
            if (fVar == null) {
                fVar = new C22784f();
                fVarArr2[i6] = fVar;
            }
            fVar.mo28120a(i, str, f);
            this.f62727c = (this.f62727c + 1) % this.f62726b.length;
            return;
        }
        this.f62726b[i4].mo28120a(i, str, f);
        this.f62726b[i5].f62724e++;
    }

    /* renamed from: d */
    public final void mo28124d(String str, PrintWriter printWriter) {
        printWriter.println(str + this.f62725a + " event history:");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("  HH:mm:ss.SSSZ  ", Locale.US);
        Date date = new Date();
        int i = 0;
        while (true) {
            C22784f[] fVarArr = this.f62726b;
            int length = fVarArr.length;
            if (i < length) {
                C22784f fVar = fVarArr[(((this.f62727c + length) - i) - 1) % length];
                if (fVar != null) {
                    date.setTime(fVar.f62723d);
                    StringBuilder sb = new StringBuilder(str);
                    sb.append(simpleDateFormat.format(date));
                    sb.append(fVar.f62721b);
                    int i2 = fVar.f62720a;
                    if (i2 == 1) {
                        sb.append(": ");
                        sb.append(fVar.f62722c);
                    } else if (i2 == 2) {
                        sb.append(": ");
                        sb.append((int) fVar.f62722c);
                    } else if (i2 == 3) {
                        sb.append(": true");
                    } else if (i2 == 4) {
                        sb.append(": false");
                    }
                    if (fVar.f62724e > 0) {
                        sb.append(" & ");
                        sb.append(fVar.f62724e);
                        sb.append(" similar events");
                    }
                    printWriter.println(sb);
                }
                i++;
            } else {
                return;
            }
        }
    }
}
