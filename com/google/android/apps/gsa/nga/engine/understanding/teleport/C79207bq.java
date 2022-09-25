package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58835az;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.p4272br.C56442k;
import java.util.Collection;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.bq */
/* compiled from: PG */
public final class C79207bq {

    /* renamed from: a */
    public final C58485gu f217675a;

    /* renamed from: b */
    private final C56442k f217676b;

    /* renamed from: c */
    private final C79298f f217677c;

    /* renamed from: d */
    private final C58485gu f217678d;

    public C79207bq(C56442k kVar, C79298f fVar, Collection collection, List list) {
        this.f217676b = kVar;
        this.f217677c = fVar;
        this.f217675a = C58485gu.m89842j(collection);
        this.f217678d = C58485gu.m89842j(list);
    }

    /* renamed from: a */
    public final int mo73827a() {
        return this.f217678d.size() - 1;
    }

    /* renamed from: b */
    public final int mo73828b(int i) {
        C58485gu guVar = this.f217675a;
        int size = guVar.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            C58835az azVar = (C58835az) guVar.get(i3);
            C79309g gVar = (C79309g) azVar.f156631a;
            String str = (String) azVar.f156632b;
            if (i >= gVar.mo73868a()) {
                i2 += str.length() - (gVar.mo73868a() - gVar.mo73869b());
            }
        }
        return i2;
    }

    /* renamed from: c */
    public final C79298f mo73829c(int i) {
        int c = this.f217676b.mo54382c(((Integer) this.f217678d.get(i)).intValue());
        int a = this.f217676b.mo54380a(((Integer) this.f217678d.get(i)).intValue());
        String substring = (c < 0 || a < 0 || this.f217676b.mo54384e(((Integer) this.f217678d.get(i)).intValue()).isEmpty()) ? BuildConfig.FLAVOR : this.f217677c.mo73864j().substring(mo73828b(c), mo73828b(a));
        int b = mo73828b(this.f217676b.mo54382c(((Integer) this.f217678d.get(i)).intValue()));
        return C79298f.m127227c(substring, (C58485gu) Collection.EL.stream(this.f217677c.mo73862h()).filter(new C79205bo(b, mo73828b(this.f217676b.mo54380a(((Integer) this.f217678d.get(i)).intValue())))).map(new C79206bp(b)).collect(C58370cn.f155946a));
    }
}
