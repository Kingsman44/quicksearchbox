package com.google.common.p4526f.p4528b.p4529a;

import android.os.Looper;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.f.b.a.s */
/* compiled from: PG */
final class C59002s {

    /* renamed from: a */
    public static final String f156871a = "s";

    /* renamed from: b */
    static final byte[] f156872b;

    /* renamed from: c */
    public static final InputStream f156873c;

    /* renamed from: d */
    public final C58881cr f156874d;

    /* renamed from: e */
    public final Executor f156875e;

    /* renamed from: f */
    public final long f156876f;

    /* renamed from: g */
    public final int f156877g;

    /* renamed from: h */
    public PrintWriter f156878h;

    public C59002s(C58881cr crVar, long j, int i, Executor executor) {
        boolean z = true;
        C58838bb.m90869d(j > 0, "The max total log size must be greater than 0 bytes");
        C58838bb.m90869d(i <= 0 ? false : z, "There must be at least one log file");
        this.f156874d = C58886cw.m90973a(crVar);
        this.f156877g = i - 1;
        this.f156876f = j / ((long) i);
        this.f156875e = executor;
    }

    /* renamed from: c */
    public static void m91192c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Looper.getMainLooper().getThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new AssertionError("This method should not be called on main thread."));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo56267a(int i) {
        C58838bb.m90868c(i > 0);
        String absolutePath = ((File) this.f156874d.mo6453a()).getAbsolutePath();
        return new File(absolutePath + "." + i);
    }

    /* renamed from: b */
    public final PrintWriter mo56268b() {
        m91192c();
        File file = (File) this.f156874d.mo6453a();
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        return new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
    }

    /* renamed from: d */
    public final void mo56269d() {
        int i;
        m91192c();
        if (this.f156877g != 0) {
            m91192c();
            int i2 = 0;
            int i3 = 1;
            int i4 = 1;
            while (true) {
                i = this.f156877g;
                if (i3 > i) {
                    break;
                }
                File a = mo56267a(i3);
                if (a.exists()) {
                    i2++;
                    if (i4 != i3) {
                        a.renameTo(mo56267a(i4));
                    }
                    i4++;
                }
                i3++;
            }
            if (i2 == i) {
                mo56267a(1).delete();
                for (int i5 = 2; i5 <= this.f156877g; i5++) {
                    mo56267a(i5).renameTo(mo56267a(i5 - 1));
                }
                i2--;
            }
            ((File) this.f156874d.mo6453a()).renameTo(mo56267a(i2 + 1));
            return;
        }
        File file = (File) this.f156874d.mo6453a();
        file.delete();
        file.createNewFile();
    }

    static {
        byte[] bytes = "\nGap in log files detected, log data may be out of order or corrupted.\n".getBytes();
        f156872b = bytes;
        f156873c = new ByteArrayInputStream(bytes);
    }
}
