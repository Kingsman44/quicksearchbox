package com.airbnb.lottie.p234a.p235a;

import android.graphics.Path;
import com.airbnb.lottie.p245f.C4954k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.c */
/* compiled from: PG */
public final class C4784c {

    /* renamed from: a */
    private final List f15179a = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9720a(C4801t tVar) {
        this.f15179a.add(tVar);
    }

    /* renamed from: b */
    public final void mo9721b(Path path) {
        int size = this.f15179a.size();
        while (true) {
            size--;
            if (size >= 0) {
                C4954k.m13724g(path, (C4801t) this.f15179a.get(size));
            } else {
                return;
            }
        }
    }
}
