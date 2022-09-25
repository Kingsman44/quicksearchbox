package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.load.p293a.C5662ae;
import com.bumptech.glide.load.p293a.p294a.C5640b;
import com.bumptech.glide.p287f.C5593j;
import com.bumptech.glide.p287f.p288a.C5567i;
import com.bumptech.glide.p291h.C5623j;
import com.bumptech.glide.p291h.C5624k;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.l */
/* compiled from: PG */
public final class C5636l extends ContextWrapper {

    /* renamed from: a */
    static final C5515ae f16992a = new C5516b();

    /* renamed from: b */
    public final C5640b f16993b;

    /* renamed from: c */
    public final C5567i f16994c;

    /* renamed from: d */
    public final List f16995d;

    /* renamed from: e */
    public final Map f16996e;

    /* renamed from: f */
    public final C5662ae f16997f;

    /* renamed from: g */
    public final C5996o f16998g;

    /* renamed from: h */
    public final int f16999h = 4;

    /* renamed from: i */
    private final C5624k f17000i;

    /* renamed from: j */
    private final C5522c f17001j;

    /* renamed from: k */
    private C5593j f17002k;

    public C5636l(Context context, C5640b bVar, C5624k kVar, C5567i iVar, C5522c cVar, Map map, List list, C5662ae aeVar, C5996o oVar) {
        super(context.getApplicationContext());
        this.f16993b = bVar;
        this.f16994c = iVar;
        this.f17001j = cVar;
        this.f16995d = list;
        this.f16996e = map;
        this.f16997f = aeVar;
        this.f16998g = oVar;
        this.f17000i = new C5623j(kVar);
    }

    /* renamed from: a */
    public final C6003v mo12092a() {
        return (C6003v) this.f17000i.mo12074a();
    }

    /* renamed from: b */
    public final synchronized C5593j mo12093b() {
        if (this.f17002k == null) {
            C5593j a = this.f17001j.mo11903a();
            a.mo11976ad();
            this.f17002k = a;
        }
        return this.f17002k;
    }
}
