package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.ts */
/* compiled from: PG */
public final class C60541ts extends C62934bn implements C63001dt {
    public C60541ts() {
        super(C60544tv.f164021h);
    }

    /* renamed from: a */
    public final void mo57107a(int i, int i2) {
        copyOnWrite();
        C60544tv tvVar = (C60544tv) this.instance;
        C60544tv tvVar2 = C60544tv.f164021h;
        C62995dn dnVar = tvVar.f164028f;
        if (!dnVar.f170058b) {
            tvVar.f164028f = dnVar.mo58980a();
        }
        tvVar.f164028f.put(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: b */
    public final void mo57108b(int i, int i2) {
        copyOnWrite();
        C60544tv tvVar = (C60544tv) this.instance;
        C60544tv tvVar2 = C60544tv.f164021h;
        C62995dn dnVar = tvVar.f164029g;
        if (!dnVar.f170058b) {
            tvVar.f164029g = dnVar.mo58980a();
        }
        tvVar.f164029g.put(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
