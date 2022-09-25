package com.google.common.p4526f.p4534f;

/* renamed from: com.google.common.f.f.g */
/* compiled from: PG */
final class C59086g implements C59084e {
    /* renamed from: c */
    private static final int m91355c(StackTraceElement[] stackTraceElementArr, Class cls, int i) {
        String name = cls.getName();
        boolean z = false;
        while (i < stackTraceElementArr.length) {
            if (stackTraceElementArr[i].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public final StackTraceElement mo56344a(Class cls, int i) {
        C59081b.m91350b(i >= 0, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int c = m91355c(stackTrace, cls, i + 1);
        if (c != -1) {
            return stackTrace[c];
        }
        return null;
    }

    /* renamed from: b */
    public final StackTraceElement[] mo56345b(Class cls, int i, int i2) {
        C59081b.m91350b(i == -1 || i > 0, "maxDepth must be > 0 or -1");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int c = m91355c(stackTrace, cls, i2 + 1);
        if (c == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - c;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, c, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
