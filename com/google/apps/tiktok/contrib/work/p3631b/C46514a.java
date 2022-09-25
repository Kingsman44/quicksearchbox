package com.google.apps.tiktok.contrib.work.p3631b;

/* renamed from: com.google.apps.tiktok.contrib.work.b.a */
/* compiled from: PG */
final class C46514a extends RuntimeException {
    public C46514a() {
        super("Worker is not an account worker, or lost its tag!");
    }

    public C46514a(Throwable th) {
        super("Account was no longer valid when task executed.", th);
    }
}
