package com.google.android.libraries.elements;

import android.app.Application;
import android.content.Context;
import androidx.core.p095g.C1909g;
import androidx.emoji.p108a.C2198h;
import androidx.emoji.p108a.C2200j;
import androidx.emoji.p108a.C2206p;
import androidx.emoji.p108a.C2210t;
import androidx.emoji.p108a.C2212v;

/* renamed from: com.google.android.libraries.elements.j */
/* compiled from: PG */
public final class C21366j {

    /* renamed from: a */
    public static volatile boolean f59736a = false;

    /* renamed from: b */
    private static final Object f59737b = new Object();

    /* renamed from: a */
    public static void m40408a(Context context) {
        if (!f59736a) {
            synchronized (f59737b) {
                if (!f59736a) {
                    if (context.getApplicationContext() instanceof Application) {
                        C2212v vVar = new C2212v(context, new C1909g("Noto Color Emoji Compat"));
                        vVar.f6217b = true;
                        C2206p pVar = new C2206p();
                        C2198h hVar = vVar.f6216a;
                        synchronized (((C2210t) hVar).f6254a) {
                            ((C2210t) hVar).f6257d = pVar;
                        }
                        if (C2200j.f6222b == null) {
                            synchronized (C2200j.f6221a) {
                                if (C2200j.f6222b == null) {
                                    C2200j.f6222b = new C2200j(vVar);
                                }
                            }
                        }
                        C2200j jVar = C2200j.f6222b;
                        C2200j b = C2200j.m6088b();
                        b.mo5513c(new C21229i(b));
                    } else {
                        throw new IllegalArgumentException("The Context instance doesn't provide Application which is required by EmojiCompat init process");
                    }
                }
            }
        }
    }
}
