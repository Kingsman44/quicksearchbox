package com.google.android.libraries.p1963i.p1967c;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1963i.C23865bf;
import com.google.apps.tiktok.tracing.C47822fd;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import p3186j$.util.concurrent.ThreadLocalRandom;

/* renamed from: com.google.android.libraries.i.c.j */
/* compiled from: PG */
public final class C23881j {

    /* renamed from: c */
    private static final C59071e f65349c = C59071e.m91332i("com.google.android.libraries.i.c.j");

    /* renamed from: a */
    public final C58833ax f65350a;

    /* renamed from: b */
    public final C23886o f65351b;

    /* renamed from: d */
    private final boolean f65352d;

    /* renamed from: e */
    private final C60888db f65353e;

    public C23881j(C58833ax axVar, C23886o oVar, C58833ax axVar2, C60888db dbVar) {
        this.f65350a = axVar;
        this.f65351b = oVar;
        this.f65352d = ((Boolean) axVar2.mo56109e(false)).booleanValue();
        this.f65353e = dbVar;
    }

    /* renamed from: b */
    public static void m44440b(C23882k kVar, ArrayList arrayList, RuntimeException runtimeException) {
        if (arrayList.size() > 20) {
            for (int i = 0; i < 20; i++) {
                Collections.swap(arrayList, i, ThreadLocalRandom.current().nextInt(arrayList.size() - i) + i);
            }
        }
        int min = Math.min(arrayList.size(), 20);
        for (int i2 = 0; i2 < min; i2++) {
            Thread thread = (Thread) arrayList.get(i2);
            C23865bf bfVar = new C23865bf(thread);
            RuntimeException b = C47822fd.m84996b(thread);
            if (b.getStackTrace().length > 0) {
                bfVar.initCause(b);
            }
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(runtimeException, new Object[]{bfVar});
            } catch (Exception unused) {
            }
        }
        C23882k kVar2 = C23882k.LOG_ERROR;
        int ordinal = kVar.ordinal();
        if (ordinal == 0) {
            ((C59052c) ((C59052c) ((C59052c) f65349c.mo56225c()).mo56382g(runtimeException)).mo56372aa(47941)).mo56384n();
        } else if (ordinal == 1) {
            C19559g.m37302a().post(new C23873b(runtimeException));
        }
    }

    /* renamed from: c */
    public static boolean m44441c(int i) {
        return ThreadLocalRandom.current().nextInt(1000) < i;
    }

    /* renamed from: a */
    public final ExecutorService mo29280a(C23880i iVar, ExecutorService executorService, C23878g gVar) {
        return new C23876e((C23882k) this.f65350a.mo56107c(), this.f65351b, this.f65352d, this.f65353e, iVar, executorService, gVar);
    }
}
