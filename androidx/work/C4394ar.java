package androidx.work;

/* renamed from: androidx.work.ar */
/* compiled from: PG */
public enum C4394ar {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    /* renamed from: a */
    public final boolean mo9323a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
