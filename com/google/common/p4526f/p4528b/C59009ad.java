package com.google.common.p4526f.p4528b;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.common.f.b.ad */
/* compiled from: PG */
final class C59009ad {

    /* renamed from: a */
    public static final C59011af f156901a = m91220a(C59011af.f156905d);

    /* renamed from: a */
    private static C59011af m91220a(String[] strArr) {
        C59011af afVar;
        try {
            afVar = C59012ag.m91238a();
        } catch (NoClassDefFoundError unused) {
            afVar = null;
        }
        if (afVar != null) {
            return afVar;
        }
        StringBuilder sb = new StringBuilder();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                return (C59011af) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(10);
                sb.append(str);
                sb.append(": ");
                sb.append(th);
                i++;
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
