package org.p5610a.p5611a.p5621c.p5622a;

import java.io.Writer;
import org.p5610a.p5611a.p5618b.C71993b;

/* renamed from: org.a.a.c.a.g */
/* compiled from: PG */
public final class C72006g extends C72002c {

    /* renamed from: b */
    private final C71993b f191740b;

    public C72006g() {
        this(0, Integer.MAX_VALUE);
    }

    /* renamed from: c */
    public final boolean mo63214c(int i, Writer writer) {
        C71993b bVar = this.f191740b;
        Integer valueOf = Integer.valueOf(i);
        if (bVar.f191713a.compare(valueOf, bVar.f191714b) < 0 || bVar.f191713a.compare(valueOf, bVar.f191715c) > 0) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }

    public C72006g(int i, int i2) {
        this.f191740b = new C71993b(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
