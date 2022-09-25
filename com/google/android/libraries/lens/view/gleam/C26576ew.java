package com.google.android.libraries.lens.view.gleam;

import android.graphics.RectF;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import java.util.HashSet;
import java.util.Iterator;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.gleam.ew */
/* compiled from: PG */
public final class C26576ew {

    /* renamed from: a */
    private final int f72436a;

    public C26576ew(long j) {
        this.f72436a = (int) j;
    }

    /* renamed from: b */
    private static int m49064b(C26447af afVar, RectF rectF) {
        RectF rectF2 = afVar.f71967e;
        int i = rectF2.left > rectF.left + 0.01f ? 1 : 0;
        if (rectF2.right < rectF.right - 440.32f) {
            i++;
        }
        if (rectF2.top > rectF.top + 0.01f) {
            i++;
        }
        return rectF2.bottom < rectF.bottom + -0.01f ? i + 1 : i;
    }

    /* renamed from: c */
    private static C58833ax m49065c(C58528ij ijVar) {
        if (ijVar.isEmpty()) {
            return C58836b.f156633a;
        }
        C26447af afVar = (C26447af) ijVar.iterator().next();
        C58800sl lA = ijVar.iterator();
        float f = Float.POSITIVE_INFINITY;
        while (lA.hasNext()) {
            C26447af afVar2 = (C26447af) lA.next();
            RectF rectF = afVar2.f71967e;
            float height = rectF.height() * rectF.width();
            if (height < f) {
                afVar = afVar2;
            }
            if (height < f) {
                f = height;
            }
        }
        return C58833ax.m90834k(afVar);
    }

    /* renamed from: a */
    public final C58833ax mo31833a(C58528ij ijVar) {
        if (ijVar.isEmpty()) {
            return C58836b.f156633a;
        }
        int i = this.f72436a;
        if (i == 1) {
            HashSet hashSet = new HashSet(ijVar);
            while (hashSet.size() > 1) {
                RectF rectF = new RectF();
                Stream map = Collection.EL.stream(hashSet).map(C26573et.f72433a);
                Objects.requireNonNull(rectF);
                map.forEach(new C26574eu(rectF));
                if (hashSet.isEmpty()) {
                    return C58836b.f156633a;
                }
                C26447af afVar = (C26447af) hashSet.iterator().next();
                int b = m49064b(afVar, rectF);
                Iterator it = hashSet.iterator();
                int i2 = 5;
                boolean z = true;
                while (it.hasNext()) {
                    C26447af afVar2 = (C26447af) it.next();
                    int b2 = m49064b(afVar2, rectF);
                    if (b2 < i2) {
                        afVar = afVar2;
                    }
                    if (b2 < i2) {
                        i2 = b2;
                    }
                    z &= b2 == b;
                    b = b2;
                }
                if (z) {
                    break;
                }
                hashSet.remove(afVar);
            }
            return m49065c(C58528ij.m90006F(hashSet));
        } else if (i == 2) {
            return m49065c(ijVar);
        } else {
            throw new AssertionError("Invalid algorithm option selected. Please set flag to an int 1-2.");
        }
    }
}
