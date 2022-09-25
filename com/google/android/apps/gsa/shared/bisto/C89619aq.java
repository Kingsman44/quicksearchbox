package com.google.android.apps.gsa.shared.bisto;

import android.util.Printer;
import com.google.common.base.C58837ba;
import java.io.PrintWriter;
import java.io.Writer;

/* renamed from: com.google.android.apps.gsa.shared.bisto.aq */
/* compiled from: PG */
public final class C89619aq implements Printer {

    /* renamed from: a */
    public final PrintWriter f242690a;

    /* renamed from: b */
    private final StringBuilder f242691b = new StringBuilder();

    /* renamed from: c */
    private String f242692c;

    /* renamed from: d */
    private boolean f242693d = true;

    public C89619aq(Writer writer) {
        this.f242690a = new PrintWriter(writer);
        int i = C58837ba.f156634a;
    }

    /* renamed from: b */
    private final void m145855b() {
        if (this.f242693d) {
            this.f242693d = false;
            if (this.f242691b.length() != 0) {
                if (this.f242692c == null) {
                    this.f242692c = this.f242691b.toString();
                }
                PrintWriter printWriter = this.f242690a;
                String str = this.f242692c;
                printWriter.write(str, 0, str.length());
            }
        }
    }

    /* renamed from: a */
    public final void mo83483a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            if (str.charAt(i) == 10) {
                m145855b();
                this.f242690a.write(str, i2, i3 - i2);
                this.f242693d = true;
                i2 = i3;
            }
            i = i3;
        }
        if (i2 != i) {
            m145855b();
            this.f242690a.write(str, i2, i - i2);
        }
    }

    public final void println(String str) {
        mo83483a(str);
        mo83483a("\n");
    }
}
