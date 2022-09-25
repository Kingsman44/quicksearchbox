package androidx.media3.exoplayer;

/* renamed from: androidx.media3.exoplayer.cb */
/* compiled from: PG */
public final class C2873cb extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2873cb(int i) {
        super(i != 1 ? i != 2 ? "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
