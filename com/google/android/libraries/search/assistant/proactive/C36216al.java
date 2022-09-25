package com.google.android.libraries.search.assistant.proactive;

import com.google.assistant.p3803ag.p3809c.C49054et;
import com.google.assistant.p3803ag.p3809c.C49055eu;
import com.google.assistant.p3803ag.p3809c.C49092gd;
import com.google.assistant.p3803ag.p3809c.C49097gi;

/* renamed from: com.google.android.libraries.search.assistant.proactive.al */
/* compiled from: PG */
final class C36216al {

    /* renamed from: a */
    int f94607a = 0;

    /* renamed from: b */
    int f94608b = 0;

    /* renamed from: c */
    int f94609c = 0;

    /* renamed from: a */
    public final int mo40022a(C49097gi giVar) {
        int i = giVar.f126974c;
        int a = C49092gd.m85365a(i);
        if (a != 0 && a == 2) {
            return this.f94607a;
        }
        int a2 = C49092gd.m85365a(i);
        if (a2 != 0 && a2 == 3) {
            return this.f94608b;
        }
        int a3 = C49092gd.m85365a(i);
        if (a3 != 0 && a3 == 4) {
            return this.f94609c;
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo40023b(C49055eu euVar) {
        int i = euVar.f126891c;
        int a = C49054et.m85353a(i);
        if (a == 0 || a == 1) {
            this.f94607a++;
            return;
        }
        int a2 = C49054et.m85353a(i);
        if (a2 != 0 && a2 == 5) {
            this.f94608b++;
            return;
        }
        int a3 = C49054et.m85353a(i);
        if (a3 != 0 && a3 == 7) {
            this.f94609c++;
        }
    }
}
