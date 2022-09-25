package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.mdi.download.d */
/* compiled from: PG */
public final class C28812d extends Exception {

    /* renamed from: a */
    public final C58485gu f78281a;

    private C28812d(String str, Throwable th, C58485gu guVar) {
        super(str, th);
        this.f78281a = guVar;
    }

    /* renamed from: a */
    public static C28812d m53781a(C58485gu guVar, String str, Object... objArr) {
        PrintWriter printWriter;
        String format = String.format(Locale.US, str, objArr);
        if (guVar.size() > 1) {
            String str2 = format + "\n" + guVar.size() + " failure(s) in total:\n";
            try {
                StringWriter stringWriter = new StringWriter();
                try {
                    printWriter = new PrintWriter(stringWriter);
                    printWriter.println(str2);
                    int i = 0;
                    while (i < guVar.size()) {
                        i++;
                        printWriter.printf("--- Failure %d ----------------------------\n", new Object[]{Integer.valueOf(i)});
                        printWriter.println(m53785e((Throwable) guVar.get(i), 1));
                    }
                    printWriter.println("-------------------------------------------");
                    format = stringWriter.toString();
                    printWriter.close();
                    stringWriter.close();
                } catch (Throwable th) {
                    stringWriter.close();
                    throw th;
                }
            } catch (Throwable th2) {
                format = "Failed to build string from throwables: ".concat(th2.toString());
            }
        }
        return new C28812d(format, (Throwable) guVar.get(0), guVar);
        throw th;
    }

    /* renamed from: b */
    public static C60870cx m53782b(Collection collection, String str, Object... objArr) {
        try {
            m53784d(collection, C58836b.f156633a, str, objArr);
            return C60866ct.f164955a;
        } catch (C28812d e) {
            if (e.f78281a.size() == 1) {
                return C60856cj.m92899h((Throwable) e.f78281a.get(0));
            }
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: c */
    static Throwable m53783c(Throwable th) {
        Throwable cause = th.getCause();
        return (cause != null && th.getClass().equals(ExecutionException.class)) ? m53783c(cause) : th;
    }

    /* renamed from: d */
    public static void m53784d(Collection collection, C58833ax axVar, String str, Object... objArr) {
        Iterator it = collection.iterator();
        C58480gp gpVar = null;
        while (it.hasNext()) {
            try {
                Object r = C60856cj.m92909r((C60870cx) it.next());
                if (axVar.mo56113h()) {
                    ((C60845bz) axVar.mo56107c()).mo17911gm(r);
                }
            } catch (CancellationException | ExecutionException e) {
                if (gpVar == null) {
                    gpVar = C58485gu.m89837e();
                }
                Throwable c = m53783c(e);
                gpVar.mo55395g(c);
                if (axVar.mo56113h()) {
                    ((C60845bz) axVar.mo56107c()).mo17910gl(c);
                }
            }
        }
        if (gpVar != null) {
            throw m53781a(gpVar.mo55394f(), str, objArr);
        }
    }

    /* renamed from: e */
    private static String m53785e(Throwable th, int i) {
        String str = th.getClass().getName() + ": " + th.getMessage();
        Throwable cause = th.getCause();
        if (cause == null) {
            return str;
        }
        if (i >= 5) {
            return str.concat("\n(...)");
        }
        return str + "\nCaused by: " + m53785e(cause, i + 1);
    }
}
