package com.google.android.libraries.lens.view;

import com.google.common.p4552o.C60707zw;
import com.google.common.p4552o.C60708zx;
import com.google.protobuf.C63088z;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.google.android.libraries.lens.view.y */
/* compiled from: PG */
abstract class C28222y {
    /* renamed from: a */
    public abstract int mo30185a();

    /* renamed from: b */
    public abstract UUID mo30186b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C60708zx mo33728c() {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(mo30186b().getMostSignificantBits());
        wrap.putLong(mo30186b().getLeastSignificantBits());
        wrap.rewind();
        C60707zw zwVar = (C60707zw) C60708zx.f164713d.createBuilder();
        C63088z z = C63088z.m96153z(wrap);
        zwVar.copyOnWrite();
        C60708zx zxVar = (C60708zx) zwVar.instance;
        zxVar.f164715a |= 1;
        zxVar.f164716b = z;
        int a = mo30185a();
        zwVar.copyOnWrite();
        C60708zx zxVar2 = (C60708zx) zwVar.instance;
        zxVar2.f164715a |= 2;
        zxVar2.f164717c = a;
        return (C60708zx) zwVar.build();
    }

    public final String toString() {
        return String.format(Locale.US, "{LensViewStartId: [%s:%d]}", new Object[]{mo30186b(), Integer.valueOf(mo30185a())});
    }
}
