package com.google.common.p4526f.p4528b.p4530b;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.C59095o;
import com.google.common.p4526f.p4528b.C59008ac;
import com.google.common.p4526f.p4528b.C59013ah;
import com.google.common.p4526f.p4528b.C59014ai;
import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4526f.p4528b.C59032g;
import com.google.common.p4526f.p4528b.C59035j;
import com.google.common.p4526f.p4528b.C59037l;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: com.google.common.f.b.b.c */
/* compiled from: PG */
public class C59019c extends LogRecord {

    /* renamed from: b */
    private static final Object[] f156930b = new Object[0];

    /* renamed from: a */
    public final C59008ac f156931a;

    /* renamed from: c */
    private final C59031f f156932c;

    static {
        new C59018b();
    }

    protected C59019c(C59031f fVar, C59037l lVar) {
        super(fVar.mo56309l(), (String) null);
        this.f156932c = fVar;
        this.f156931a = C59008ac.m91215g(lVar, fVar.mo56305h());
        C59095o e = fVar.mo56304e();
        setSourceClassName(e.mo56239b());
        setSourceMethodName(e.mo56241d());
        setLoggerName(fVar.mo56308k());
        setMillis(TimeUnit.NANOSECONDS.toMillis(fVar.mo56303d()));
        super.setParameters(f156930b);
    }

    /* renamed from: a */
    public static void m91248a(C59031f fVar, StringBuilder sb) {
        String str;
        String str2;
        String str3;
        String str4;
        sb.append("  original message: ");
        if (fVar.mo56306i() == null) {
            Object j = fVar.mo56307j();
            try {
                str4 = C59035j.m91288b(j);
            } catch (RuntimeException e) {
                str4 = C59035j.m91287a(j, e);
            }
            sb.append(str4);
        } else {
            sb.append(fVar.mo56306i().f156911b);
            sb.append("\n  original arguments:");
            for (Object obj : fVar.mo56302X()) {
                sb.append("\n    ");
                try {
                    str3 = C59035j.m91288b(obj);
                } catch (RuntimeException e2) {
                    str3 = C59035j.m91287a(obj, e2);
                }
                sb.append(str3);
            }
        }
        C59037l h = fVar.mo56305h();
        if (h.mo56310b() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < h.mo56310b(); i++) {
                sb.append("\n    ");
                sb.append(h.mo56311c(i).f156827a);
                sb.append(": ");
                Object e3 = h.mo56313e(i);
                try {
                    str2 = C59035j.m91288b(e3);
                } catch (RuntimeException e4) {
                    str2 = C59035j.m91287a(e3, e4);
                }
                sb.append(str2);
            }
        }
        sb.append("\n  level: ");
        Level l = fVar.mo56309l();
        try {
            str = C59035j.m91288b(l);
        } catch (RuntimeException e5) {
            str = C59035j.m91287a(l, e5);
        }
        sb.append(str);
        sb.append("\n  timestamp (nanos): ");
        sb.append(fVar.mo56303d());
        sb.append("\n  class: ");
        sb.append(fVar.mo56304e().mo56239b());
        sb.append("\n  method: ");
        sb.append(fVar.mo56304e().mo56241d());
        sb.append("\n  line number: ");
        sb.append(fVar.mo56304e().mo56238a());
    }

    public final String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            C59032g gVar = C59014ai.f156908a;
            C59031f fVar = this.f156932c;
            C59008ac acVar = this.f156931a;
            C59013ah ahVar = (C59013ah) gVar;
            if (C59014ai.m91241b(fVar, acVar, ahVar.f156906a)) {
                StringBuilder sb = new StringBuilder();
                ahVar.mo56278a(fVar, acVar, sb);
                message = sb.toString();
            } else {
                message = C59014ai.m91240a(fVar);
            }
            super.setMessage(message);
        }
        return message;
    }

    public final void setMessage(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        super.setMessage(str);
    }

    public final void setParameters(Object[] objArr) {
        getMessage();
        if (objArr == null) {
            objArr = f156930b;
        }
        super.setParameters(objArr);
    }

    public final void setResourceBundle(ResourceBundle resourceBundle) {
    }

    public final void setResourceBundleName(String str) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? Arrays.asList(getParameters()) : "<none>");
        sb.append(10);
        m91248a(this.f156932c, sb);
        sb.append("\n}");
        return sb.toString();
    }
}
