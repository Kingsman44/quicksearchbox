package com.google.protobuf;

import java.util.NoSuchElementException;

/* renamed from: com.google.protobuf.ei */
/* compiled from: PG */
final class C63017ei extends C63081s {

    /* renamed from: a */
    final C63019ek f170100a;

    /* renamed from: b */
    C63083u f170101b = m95757b();

    /* renamed from: c */
    final /* synthetic */ C63021em f170102c;

    public C63017ei(C63021em emVar) {
        this.f170102c = emVar;
        this.f170100a = new C63019ek(emVar);
    }

    /* renamed from: b */
    private final C63083u m95757b() {
        C63019ek ekVar = this.f170100a;
        if (ekVar.hasNext()) {
            return ekVar.next().iterator();
        }
        return null;
    }

    /* renamed from: a */
    public final byte mo59020a() {
        C63083u uVar = this.f170101b;
        if (uVar != null) {
            byte a = uVar.mo59020a();
            if (!this.f170101b.hasNext()) {
                this.f170101b = m95757b();
            }
            return a;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f170101b != null;
    }
}
