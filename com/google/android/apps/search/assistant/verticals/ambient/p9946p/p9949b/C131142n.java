package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.n */
/* compiled from: PG */
public final class C131142n {

    /* renamed from: a */
    public final ByteBuffer f358646a;

    /* renamed from: b */
    public final int f358647b;

    /* renamed from: c */
    public final int f358648c;

    /* renamed from: d */
    public final int f358649d;

    /* renamed from: e */
    public final EnumMap f358650e;

    /* renamed from: f */
    private final int f358651f;

    public C131142n(ByteBuffer byteBuffer) {
        EnumMap enumMap = new EnumMap(C131143o.class);
        this.f358650e = enumMap;
        this.f358646a = byteBuffer;
        int remaining = byteBuffer.remaining();
        if (remaining != 0) {
            int i = byteBuffer.getInt();
            this.f358647b = i;
            if (i <= 0 || i > 3) {
                throw new IOException(String.format("Format version mismatch (found %d, supported versions are %d to %d). File not read.", new Object[]{Integer.valueOf(i), 1, 3}));
            }
            if (i >= 2) {
                int i2 = byteBuffer.getInt();
                C131143o oVar = C131143o.UNDEFINED;
                int i3 = -1;
                for (int i4 = 0; i4 < i2; i4++) {
                    Optional a = C131143o.m213670a(byteBuffer.getInt());
                    int i5 = byteBuffer.getInt();
                    if (!oVar.equals(C131143o.UNDEFINED)) {
                        EnumMap enumMap2 = this.f358650e;
                        C131130b bVar = new C131130b();
                        bVar.mo110092c(i3);
                        bVar.mo110091b(i5);
                        enumMap2.put(oVar, bVar.mo110090a());
                        oVar = C131143o.UNDEFINED;
                        i3 = -1;
                    }
                    if (a.isPresent()) {
                        oVar = (C131143o) a.get();
                        i3 = i5;
                    }
                }
                if (!oVar.equals(C131143o.UNDEFINED)) {
                    EnumMap enumMap3 = this.f358650e;
                    C131130b bVar2 = new C131130b();
                    bVar2.mo110092c(i3);
                    bVar2.mo110091b(remaining);
                    enumMap3.put(oVar, bVar2.mo110090a());
                }
                C131141m mVar = (C131141m) this.f358650e.get(C131143o.PLACES);
                if (mVar != null) {
                    byteBuffer.position(mVar.mo110094b());
                    this.f358649d = mVar.mo110094b();
                } else {
                    throw new IOException("File does not contain a places section");
                }
            } else {
                this.f358649d = 0;
                C131143o oVar2 = C131143o.PLACES;
                C131130b bVar3 = new C131130b();
                bVar3.mo110092c(byteBuffer.position());
                bVar3.mo110091b(remaining);
                enumMap.put(oVar2, bVar3.mo110090a());
            }
            this.f358648c = byteBuffer.getInt();
            this.f358651f = byteBuffer.position();
            return;
        }
        throw new IOException("File does not exist or is empty.");
    }

    /* renamed from: a */
    public final C131140l mo110098a(Predicate predicate, int i) {
        int i2 = this.f358648c;
        int a = ((C131141m) this.f358650e.get(C131143o.PLACES)).mo110093a();
        while (i < i2) {
            int i3 = (i + i2) / 2;
            this.f358646a.position(this.f358651f + (i3 * 12));
            if (!predicate.test(Long.valueOf(this.f358646a.getLong()))) {
                i = i3 + 1;
            } else {
                a = this.f358646a.getInt() + this.f358649d;
                i2 = i3;
            }
        }
        return new C131124a(i, a);
    }
}
