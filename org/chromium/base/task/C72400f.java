package org.chromium.base.task;

import android.os.AsyncTask;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: org.chromium.base.task.f */
/* compiled from: PG */
final class C72400f extends ThreadPoolExecutor {

    /* renamed from: a */
    private static final int f192552a;

    /* renamed from: b */
    private static final int f192553b;

    /* renamed from: c */
    private static final int f192554c;

    /* renamed from: d */
    private static final ThreadFactory f192555d = new C72399e();

    /* renamed from: e */
    private static final BlockingQueue f192556e = new ArrayBlockingQueue(128);

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f192552a = availableProcessors;
        f192553b = Math.max(2, Math.min(availableProcessors - 1, 4));
        f192554c = availableProcessors + availableProcessors + 1;
    }

    public C72400f() {
        super(f192553b, f192554c, 30, TimeUnit.SECONDS, f192556e, f192555d);
        allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    private static String m107054a(Runnable runnable) {
        Class<?> cls = runnable.getClass();
        if (cls != C72395a.class) {
            try {
                if (cls.getEnclosingClass() == AsyncTask.class) {
                    Field declaredField = cls.getDeclaredField("this$0");
                    declaredField.setAccessible(true);
                    cls = declaredField.get(runnable).getClass();
                }
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            return cls.getName();
        }
        C72395a aVar = (C72395a) runnable;
        throw null;
    }

    public final void execute(Runnable runnable) {
        String str;
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e) {
            HashMap hashMap = new HashMap();
            for (Runnable a : (Runnable[]) getQueue().toArray(new Runnable[0])) {
                String a2 = m107054a(a);
                hashMap.put(a2, Integer.valueOf((hashMap.containsKey(a2) ? ((Integer) hashMap.get(a2)).intValue() : 0) + 1));
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 32) {
                    sb.append((String) entry.getKey());
                    sb.append(' ');
                }
            }
            if (sb.length() == 0) {
                str = "NO CLASSES FOUND";
            } else {
                str = sb.toString();
            }
            throw new RejectedExecutionException("Prominent classes in AsyncTask: ".concat(str), e);
        }
    }
}
