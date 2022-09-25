package com.google.apps.tiktok.tracing.contrib.p3708i.p3712c;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.google.apps.tiktok.tracing.C47809er;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.c.i */
/* compiled from: PG */
public final class C47709i {
    /* renamed from: a */
    public static void m84861a(Fragment fragment, Intent intent) {
        Intent intent2 = new Intent(intent);
        C47809er y = C47810es.m84985y(intent2);
        try {
            fragment.startActivity(intent2);
            y.close();
            return;
        } catch (Throwable th) {
            C47708h.m84860a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public static void m84862b(Fragment fragment, Intent intent, int i) {
        Intent intent2 = new Intent(intent);
        C47809er y = C47810es.m84985y(intent2);
        try {
            fragment.startActivityForResult(intent2, i);
            y.close();
            return;
        } catch (Throwable th) {
            C47708h.m84860a(th, th);
        }
        throw th;
    }
}
