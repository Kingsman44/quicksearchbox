package p5488io.grpc.p5527g;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import p5488io.grpc.p5525e.C70676lv;
import p5488io.grpc.p5527g.p5528a.p5529a.C70775d;

/* renamed from: io.grpc.g.an */
/* compiled from: PG */
public final class C70820an {
    static {
        Logger.getLogger(C70820an.class.getName());
    }

    private C70820an() {
    }

    /* renamed from: a */
    public static byte[][] m103615a(List list) {
        int size = list.size();
        byte[][] bArr = new byte[(size + size)][];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C70775d dVar = (C70775d) it.next();
            int i2 = i + 1;
            bArr[i] = dVar.f188724f.mo63104i();
            i = i2 + 1;
            bArr[i2] = dVar.f188725g.mo63104i();
        }
        return C70676lv.m103339b(bArr);
    }
}
