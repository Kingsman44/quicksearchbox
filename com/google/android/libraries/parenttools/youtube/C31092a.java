package com.google.android.libraries.parenttools.youtube;

/* renamed from: com.google.android.libraries.parenttools.youtube.a */
/* compiled from: PG */
final class C31092a extends C31095ac {

    /* renamed from: a */
    public byte[] f83756a;

    /* renamed from: b */
    private int f83757b;

    public C31092a() {
    }

    public C31092a(ParentToolsResult parentToolsResult) {
        AutoValue_ParentToolsResult autoValue_ParentToolsResult = (AutoValue_ParentToolsResult) parentToolsResult;
        this.f83756a = autoValue_ParentToolsResult.f83745a;
        this.f83757b = autoValue_ParentToolsResult.f83746b;
    }

    /* renamed from: a */
    public final ParentToolsResult mo36838a() {
        int i = this.f83757b;
        if (i != 0) {
            return new AutoValue_ParentToolsResult(this.f83756a, i);
        }
        throw new IllegalStateException("Missing required properties: exitStatus");
    }

    /* renamed from: b */
    public final void mo36839b(byte[] bArr) {
        this.f83756a = bArr;
    }

    /* renamed from: c */
    public final void mo36840c(int i) {
        if (i != 0) {
            this.f83757b = i;
            return;
        }
        throw new NullPointerException("Null exitStatus");
    }
}
