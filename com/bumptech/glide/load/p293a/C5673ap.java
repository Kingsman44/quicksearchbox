package com.bumptech.glide.load.p293a;

import android.util.Log;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.C5955n;
import com.evernote.android.state.BuildConfig;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a.ap */
/* compiled from: PG */
public final class C5673ap extends Exception {

    /* renamed from: a */
    private static final StackTraceElement[] f17113a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final List f17114b;

    /* renamed from: c */
    private C5955n f17115c;

    /* renamed from: d */
    private C5637a f17116d;

    /* renamed from: e */
    private Class f17117e;

    /* renamed from: f */
    private final String f17118f;

    public C5673ap(String str, List list) {
        this.f17118f = str;
        setStackTrace(f17113a);
        this.f17114b = list;
    }

    /* renamed from: d */
    private final void m14729d(Throwable th, List list) {
        if (th instanceof C5673ap) {
            for (Throwable d : ((C5673ap) th).f17114b) {
                m14729d(d, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: e */
    private static void m14730e(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: f */
    private final void m14731f(Appendable appendable) {
        m14730e(this, appendable);
        List list = this.f17114b;
        C5672ao aoVar = new C5672ao(appendable);
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                aoVar.append("Cause (");
                int i2 = i + 1;
                aoVar.append(String.valueOf(i2));
                aoVar.append(" of ");
                aoVar.append(String.valueOf(size));
                aoVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof C5673ap) {
                    ((C5673ap) th).m14731f(aoVar);
                } else {
                    m14730e(th, aoVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final List mo12168a() {
        ArrayList arrayList = new ArrayList();
        m14729d(this, arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public final void mo12169b(String str) {
        List a = mo12168a();
        int size = a.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Log.i(str, "Root cause (" + i2 + " of " + size + ")", (Throwable) a.get(i));
            i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12170c(C5955n nVar, C5637a aVar, Class cls) {
        this.f17115c = nVar;
        this.f17116d = aVar;
        this.f17117e = cls;
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f17118f);
        Class cls = this.f17117e;
        String str = BuildConfig.FLAVOR;
        sb.append(cls != null ? ", ".concat(cls.toString()) : str);
        C5637a aVar = this.f17116d;
        sb.append(aVar != null ? ", ".concat(aVar.toString()) : str);
        C5955n nVar = this.f17115c;
        if (nVar != null) {
            str = ", ".concat(nVar.toString());
        }
        sb.append(str);
        List<Throwable> a = mo12168a();
        if (a.isEmpty()) {
            return sb.toString();
        }
        if (a.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(a.size());
            sb.append(" root causes:");
        }
        for (Throwable th : a) {
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void printStackTrace() {
        m14731f(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        m14731f(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        m14731f(printWriter);
    }
}
