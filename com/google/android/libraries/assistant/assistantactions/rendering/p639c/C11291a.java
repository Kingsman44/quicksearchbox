package com.google.android.libraries.assistant.assistantactions.rendering.p639c;

import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.c.a */
/* compiled from: PG */
public final class C11291a extends C11297e {

    /* renamed from: a */
    public C51953ff f36720a;

    /* renamed from: b */
    private C52507uh f36721b;

    /* renamed from: a */
    public final C11298f mo19695a() {
        C51953ff ffVar;
        C52507uh uhVar = this.f36721b;
        if (uhVar != null && (ffVar = this.f36720a) != null) {
            return new C11294b(uhVar, ffVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f36721b == null) {
            sb.append(" showNativeFormContent");
        }
        if (this.f36720a == null) {
            sb.append(" showNativeFormArgs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo19696b(C51953ff ffVar) {
        if (ffVar != null) {
            this.f36720a = ffVar;
            return;
        }
        throw new NullPointerException("Null showNativeFormArgs");
    }

    /* renamed from: c */
    public final void mo19697c(C52507uh uhVar) {
        if (uhVar != null) {
            this.f36721b = uhVar;
            return;
        }
        throw new NullPointerException("Null showNativeFormContent");
    }
}
