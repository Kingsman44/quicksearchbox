package com.google.android.libraries.assistant.gallium.framework;

import com.google.common.base.C58827ar;
import com.google.protos.p5127o.C65698x;
import com.google.protos.p5127o.C65699y;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import p5488io.grpc.C70761fa;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.av */
/* compiled from: PG */
public final class C18218av extends Exception {

    /* renamed from: a */
    public final C65699y f51741a;

    public C18218av(C65699y yVar) {
        this.f51741a = yVar;
    }

    /* renamed from: a */
    public static C18218av m35478a(int i, String str) {
        return new C18218av(C18219aw.m35485c(i, str));
    }

    /* renamed from: b */
    public static C18218av m35479b(int i, String str, Throwable th) {
        return new C18218av(C18219aw.m35485c(i, str), th);
    }

    /* renamed from: c */
    public static C18218av m35480c(Throwable th) {
        return new C18218av(C18219aw.m35483a(), th);
    }

    /* renamed from: d */
    public static C18218av m35481d(Throwable th) {
        return new C18218av(C18219aw.m35485c(13, "Execution of future failed"), th);
    }

    /* renamed from: e */
    public static C18218av m35482e(Throwable th) {
        int i;
        if ((th instanceof ExecutionException) && th.getCause() != null) {
            th = th.getCause();
        }
        if (th instanceof C18218av) {
            return (C18218av) th;
        }
        C65698x xVar = (C65698x) C65699y.f178500e.createBuilder();
        if (th instanceof IllegalArgumentException) {
            i = 3;
        } else if (th instanceof IndexOutOfBoundsException) {
            i = 11;
        } else if (th instanceof IllegalStateException) {
            i = 9;
        } else if (th instanceof TimeoutException) {
            i = 4;
        } else if (th instanceof CancellationException) {
            i = 1;
        } else if (th instanceof NullPointerException) {
            i = 13;
        } else if (th instanceof UnsupportedOperationException) {
            i = 12;
        } else if (th instanceof C70761fa) {
            i = ((C70761fa) th).f188571a.getCode().value();
        } else {
            i = th instanceof StatusException ? ((StatusException) th).f186943a.getCode().value() : 2;
        }
        xVar.copyOnWrite();
        C65699y yVar = (C65699y) xVar.instance;
        yVar.f178502a = 1 | yVar.f178502a;
        yVar.f178503b = i;
        if (th.getMessage() != null) {
            String message = th.getMessage();
            xVar.copyOnWrite();
            C65699y yVar2 = (C65699y) xVar.instance;
            message.getClass();
            yVar2.f178502a = 2 | yVar2.f178502a;
            yVar2.f178504c = message;
        }
        if (th.getStackTrace() != null) {
            String d = new C58827ar("\n").mo56097d(Arrays.asList(th.getStackTrace()));
            xVar.copyOnWrite();
            C65699y yVar3 = (C65699y) xVar.instance;
            yVar3.f178502a = 4 | yVar3.f178502a;
            yVar3.f178505d = d;
        }
        return new C18218av((C65699y) xVar.build(), th);
    }

    public final String getMessage() {
        C65699y yVar = this.f51741a;
        int i = yVar.f178503b;
        String str = yVar.f178504c;
        return "Status {code: " + i + ", message: " + str + "}";
    }

    public C18218av(C65699y yVar, Throwable th) {
        super(th);
        this.f51741a = yVar;
    }
}
