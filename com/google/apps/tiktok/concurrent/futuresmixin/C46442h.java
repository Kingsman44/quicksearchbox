package com.google.apps.tiktok.concurrent.futuresmixin;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.apps.tiktok.concurrent.futuresmixin.h */
/* compiled from: PG */
final class C46442h implements Runnable {

    /* renamed from: a */
    final List f121542a = new ArrayList();

    /* renamed from: b */
    Runnable f121543b;

    public final void run() {
        C19559g.m37304c();
        Runnable runnable = this.f121543b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
