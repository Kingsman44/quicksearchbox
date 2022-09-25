package com.google.common.p4543n.p4546c;

import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60917ed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* renamed from: com.google.common.n.c.b */
/* compiled from: PG */
public final class C59394b {

    /* renamed from: a */
    public static final C59071e f157601a = C59071e.m91332i("com.google.common.n.c.b");

    /* renamed from: a */
    public static boolean m92295a(Future future) {
        if (future.isDone() && !future.isCancelled()) {
            try {
                C60917ed.m93034a(future);
                return true;
            } catch (RuntimeException | ExecutionException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m92296b(C60870cx cxVar, Level level, String str) {
        C60856cj.m92911t(cxVar, new C59393a(level, str), C60826bg.f164896a);
    }
}
