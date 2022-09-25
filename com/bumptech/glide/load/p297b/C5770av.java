package com.bumptech.glide.load.p297b;

import androidx.core.p097i.C1971f;
import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.C5960s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.b.av */
/* compiled from: PG */
final class C5770av implements C5764ap {

    /* renamed from: a */
    private final List f17360a;

    /* renamed from: b */
    private final C1971f f17361b;

    public C5770av(List list, C1971f fVar) {
        this.f17360a = list;
        this.f17361b = fVar;
    }

    /* renamed from: a */
    public final C5763ao mo11928a(Object obj, int i, int i2, C5960s sVar) {
        C5763ao a;
        int size = this.f17360a.size();
        ArrayList arrayList = new ArrayList(size);
        C5955n nVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C5764ap apVar = (C5764ap) this.f17360a.get(i3);
            if (apVar.mo11929b(obj) && (a = apVar.mo11928a(obj, i, i2, sVar)) != null) {
                nVar = a.f17346a;
                arrayList.add(a.f17348c);
            }
        }
        if (arrayList.isEmpty() || nVar == null) {
            return null;
        }
        return new C5763ao(nVar, Collections.emptyList(), new C5769au(arrayList, this.f17361b));
    }

    /* renamed from: b */
    public final boolean mo11929b(Object obj) {
        for (C5764ap b : this.f17360a) {
            if (b.mo11929b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f17360a.toArray());
        return "MultiModelLoader{modelLoaders=" + arrays + "}";
    }
}
