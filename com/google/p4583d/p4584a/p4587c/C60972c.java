package com.google.p4583d.p4584a.p4587c;

import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.d.a.c.c */
/* compiled from: PG */
public final class C60972c {

    /* renamed from: a */
    public C60971b f165094a;

    /* renamed from: b */
    public C60971b f165095b;

    /* renamed from: c */
    public final List f165096c;

    public C60972c() {
        this.f165094a = new C60971b(BuildConfig.FLAVOR, 0, (Map) null);
        this.f165095b = new C60971b(BuildConfig.FLAVOR, 0, (Map) null);
        this.f165096c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C60972c cVar = new C60972c(this.f165094a.clone());
        for (C60971b a : this.f165096c) {
            cVar.f165096c.add(a.clone());
        }
        return cVar;
    }

    public C60972c(C60971b bVar) {
        this.f165094a = bVar;
        this.f165095b = bVar.clone();
        this.f165096c = new ArrayList();
    }
}
