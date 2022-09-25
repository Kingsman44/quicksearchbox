package com.google.protobuf.p4750c;

import com.google.protobuf.C63042fg;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.protobuf.c.d */
/* compiled from: PG */
enum C62952d implements Comparator, Serializable {
    ;

    private C62952d() {
    }

    /* renamed from: a */
    public final int compare(C63042fg fgVar, C63042fg fgVar2) {
        C62953e.m95492q(fgVar);
        C62953e.m95492q(fgVar2);
        long j = fgVar.f170154a;
        long j2 = fgVar2.f170154a;
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (j != j2) {
            return i;
        }
        int i2 = fgVar.f170155b;
        int i3 = fgVar2.f170155b;
        if (i2 == i3) {
            return 0;
        }
        return i2 >= i3 ? 1 : -1;
    }
}
