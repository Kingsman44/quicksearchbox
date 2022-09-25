package com.google.android.libraries.gsa.p1833c.p1834a;

import com.google.common.base.C58887cx;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.gsa.c.a.br */
/* compiled from: PG */
public final /* synthetic */ class C22246br implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ StackTraceElement[] f61441a;

    public /* synthetic */ C22246br(StackTraceElement[] stackTraceElementArr) {
        this.f61441a = stackTraceElementArr;
    }

    public final C60870cx apply(Object obj) {
        StackTraceElement[] stackTraceElementArr = this.f61441a;
        Throwable d = C58887cx.m90977d((Throwable) obj);
        StackTraceElement[] stackTrace = d.getStackTrace();
        int length = stackTrace.length;
        int i = length + 1;
        int length2 = stackTraceElementArr.length;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[(i + length2)];
        System.arraycopy(stackTrace, 0, stackTraceElementArr2, 0, length);
        stackTraceElementArr2[length] = new StackTraceElement("the.stack.trace.below.was.manually", "injected", "NetworkingExecutors.java", 1);
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, i, length2);
        d.setStackTrace(stackTraceElementArr2);
        return C60856cj.m92899h(d);
    }
}
