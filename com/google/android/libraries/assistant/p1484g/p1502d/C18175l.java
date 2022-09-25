package com.google.android.libraries.assistant.p1484g.p1502d;

import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52799a;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52804f;

/* renamed from: com.google.android.libraries.assistant.g.d.l */
/* compiled from: PG */
public final class C18175l extends Exception {

    /* renamed from: a */
    public final int f51669a;

    public C18175l(int i, String str, Throwable th) {
        super(str, th);
        this.f51669a = i;
    }

    /* renamed from: a */
    public static C18175l m35383a(C52804f fVar) {
        C52799a aVar = (C52799a) fVar.f138531a;
        int i = aVar.f138526b - 1;
        if (i == 1) {
            return m35384b(9, "App failed while handling the operation: %s.", aVar.f138525a);
        } else if (i == 2) {
            return m35384b(7, "App did not handle the operation: %s.", aVar.f138525a);
        } else if (i == 3) {
            return m35384b(8, "App did not accept the parameters: %s.", aVar.f138525a);
        } else if (i == 4) {
            return m35384b(2, "The operation was cancelled: %s.", aVar.f138525a);
        } else if (i == 5) {
            return new C18175l(4, "Result Bundle is null", (Throwable) null);
        } else {
            throw new IllegalStateException("ErrorResponseException was thrown with status NO_ERROR", fVar);
        }
    }

    /* renamed from: b */
    public static C18175l m35384b(int i, String str, Object... objArr) {
        return new C18175l(i, String.format(str, objArr), (Throwable) null);
    }

    /* renamed from: c */
    public static C18175l m35385c(Throwable th, int i) {
        return new C18175l(i, C18174k.m35381a(i), th);
    }
}
