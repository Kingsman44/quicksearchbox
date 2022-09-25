package com.google.android.apps.search.googleapp.launcher.p10341b.p10344c;

import com.google.android.libraries.p1730f.C21370a;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.c.f */
/* compiled from: PG */
public final class C136453f {

    /* renamed from: a */
    private final C21370a f371502a;

    /* renamed from: b */
    private final C136452e[] f371503b;

    /* renamed from: c */
    private final String f371504c;

    /* renamed from: d */
    private int f371505d = 0;

    public C136453f(String str, int i, C21370a aVar) {
        this.f371504c = str;
        this.f371503b = new C136452e[i];
        this.f371502a = aVar;
    }

    /* renamed from: c */
    private static boolean m221755c(C136452e eVar, String str) {
        return eVar != null && eVar.f371499a.equals(str);
    }

    /* renamed from: a */
    public final void mo113057a(String str) {
        int i = this.f371505d;
        C136452e[] eVarArr = this.f371503b;
        int length = eVarArr.length;
        int i2 = i + length;
        int i3 = (i2 - 1) % length;
        int i4 = (i2 - 2) % length;
        if (!m221755c(eVarArr[i3], str) || !m221755c(this.f371503b[i4], str)) {
            C136452e[] eVarArr2 = this.f371503b;
            int i5 = this.f371505d;
            C136452e eVar = eVarArr2[i5];
            if (eVar == null) {
                eVar = new C136452e();
                eVarArr2[i5] = eVar;
            }
            eVar.mo113056a(str, this.f371502a);
            this.f371505d = (this.f371505d + 1) % this.f371503b.length;
            return;
        }
        this.f371503b[i3].mo113056a(str, this.f371502a);
        this.f371503b[i4].f371501c++;
    }

    /* renamed from: b */
    public final void mo113058b(String str, PrintWriter printWriter) {
        String str2 = this.f371504c;
        printWriter.println(str + str2 + " event history:");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("  HH:mm:ss.SSSZ  ", Locale.US);
        Date date = new Date();
        int i = 0;
        while (true) {
            C136452e[] eVarArr = this.f371503b;
            int length = eVarArr.length;
            if (i < length) {
                C136452e eVar = eVarArr[(((this.f371505d + length) - i) - 1) % length];
                if (eVar != null) {
                    date.setTime(eVar.f371500b);
                    StringBuilder sb = new StringBuilder(str);
                    sb.append(simpleDateFormat.format(date));
                    sb.append(eVar.f371499a);
                    if (eVar.f371501c > 0) {
                        sb.append(" & ");
                        sb.append(eVar.f371501c);
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
