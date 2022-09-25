package com.bumptech.glide.load.p293a;

import androidx.core.p097i.C1971f;
import com.bumptech.glide.p291h.C5630q;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a.as */
/* compiled from: PG */
public final class C5676as {

    /* renamed from: a */
    public final C1971f f17121a;

    /* renamed from: b */
    public final List f17122b;

    /* renamed from: c */
    public final String f17123c;

    public C5676as(Class cls, Class cls2, Class cls3, List list, C1971f fVar) {
        this.f17121a = fVar;
        C5630q.m14606c(list);
        this.f17122b = list;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        this.f17123c = "Failed LoadPath{" + simpleName + "->" + simpleName2 + "->" + simpleName3 + "}";
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f17122b.toArray());
        return "LoadPath{decodePaths=" + arrays + "}";
    }
}
