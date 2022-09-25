package com.google.apps.tiktok.tracing;

import android.app.Service;
import android.content.Intent;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.apps.tiktok.tracing.bd */
/* compiled from: PG */
public final class C47552bd {

    /* renamed from: com.google.apps.tiktok.tracing.bd$a */
    /* compiled from: PG */
    public interface C47553a {
        /* renamed from: dy */
        C47770dh mo51415dy();
    }

    /* renamed from: a */
    public static C47573bx m84642a(Service service, Intent intent, String str, boolean z) {
        C47572bw bwVar;
        if (intent == null) {
            return m84643b(service, str);
        }
        long longExtra = intent.getLongExtra("tracing_intent_id", -1);
        synchronized (C47810es.f123821a) {
            if (z) {
                bwVar = (C47572bw) C47810es.f123821a.remove(Long.valueOf(longExtra));
            } else {
                bwVar = (C47572bw) C47810es.f123821a.get(Long.valueOf(longExtra));
            }
        }
        if (bwVar == null) {
            return m84643b(service, str);
        }
        C47831fm.m85013h(bwVar);
        return C47551bc.f123402a;
    }

    /* renamed from: b */
    private static C47573bx m84643b(Service service, String str) {
        C19559g.m37304c();
        return ((C47553a) C47266f.m84076a(service, C47553a.class)).mo51415dy().mo51613c(str);
    }
}
