package com.google.android.libraries.micore.learning.base;

/* compiled from: PG */
public final class ErrorStatusException extends Exception {

    /* renamed from: a */
    public final C29718j f80468a;

    public ErrorStatusException(int i, String str) {
        this((Throwable) null, new C29718j(i, str));
    }

    /* renamed from: a */
    public static ErrorStatusException m54792a(int i, Throwable th) {
        return new ErrorStatusException(th, new C29718j(i, (String) null));
    }

    /* renamed from: b */
    public static ErrorStatusException m54793b(int i, String str, Object... objArr) {
        return new ErrorStatusException((Throwable) null, C29718j.m54811a(i, str, objArr));
    }

    /* renamed from: c */
    public static ErrorStatusException m54794c(int i, Throwable th, String str, Object... objArr) {
        return new ErrorStatusException(th, C29718j.m54811a(i, str, objArr));
    }

    public ErrorStatusException(Throwable th, C29718j jVar) {
        super(jVar.toString(), th);
        this.f80468a = jVar;
    }
}
