package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f;

import com.google.android.libraries.assistant.assistantactions.p620b.C11054a;
import com.google.android.libraries.assistant.assistantactions.p633d.C11259a;
import com.google.android.libraries.assistant.assistantactions.p633d.C11268e;
import com.google.android.libraries.assistant.assistantactions.p633d.C11269f;
import com.google.android.libraries.assistant.assistantactions.p633d.C11270g;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.f.g */
/* compiled from: PG */
public final class C11212g {
    /* renamed from: a */
    public static void m26597a(C11270g gVar, C11054a aVar, String str) {
        C11268e d = C11269f.m26752d();
        d.mo19678c(16);
        if (str != null) {
            ((C11259a) d).f36683a = str;
            d.mo19677b(aVar.mo19521b(6));
            gVar.mo19675a(d.mo19676a());
            return;
        }
        throw new NullPointerException("Null clientOpName");
    }

    /* renamed from: b */
    public static void m26598b(C11270g gVar, C11054a aVar, int i) {
        C11268e d = C11269f.m26752d();
        d.mo19678c(i);
        d.mo19677b(aVar.mo19521b(6));
        gVar.mo19675a(d.mo19676a());
    }
}
