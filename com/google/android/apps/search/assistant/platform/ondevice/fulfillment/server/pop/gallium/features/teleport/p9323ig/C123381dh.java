package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p4272br.C56442k;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.dh */
/* compiled from: PG */
public final class C123381dh {

    /* renamed from: a */
    public final C58485gu f341146a;

    /* renamed from: b */
    private final C56442k f341147b;

    /* renamed from: c */
    private final C123427f f341148c;

    /* renamed from: d */
    private final C58485gu f341149d;

    public C123381dh(C56442k kVar, C123427f fVar, C58485gu guVar, List list) {
        this.f341147b = kVar;
        this.f341148c = fVar;
        this.f341146a = guVar;
        this.f341149d = C58485gu.m89842j(list);
    }

    /* renamed from: a */
    public final int mo105993a() {
        return this.f341149d.size() - 1;
    }

    /* renamed from: b */
    public final int mo105994b(int i) {
        C58485gu guVar = this.f341146a;
        int i2 = ((C58724pq) guVar).f156474d;
        int i3 = i;
        for (int i4 = 0; i4 < i2; i4++) {
            C123380dg dgVar = (C123380dg) guVar.get(i4);
            C123454g a = dgVar.mo105963a();
            String b = dgVar.mo105964b();
            if (i >= a.mo105931a()) {
                i3 += b.length() - (a.mo105931a() - a.mo105932b());
            }
        }
        return i3;
    }

    /* renamed from: c */
    public final C123427f mo105995c(int i) {
        int c = this.f341147b.mo54382c(((Integer) this.f341149d.get(i)).intValue());
        int a = this.f341147b.mo54380a(((Integer) this.f341149d.get(i)).intValue());
        String substring = (c < 0 || a < 0 || this.f341147b.mo54384e(((Integer) this.f341149d.get(i)).intValue()).isEmpty()) ? BuildConfig.FLAVOR : this.f341148c.mo105929i().substring(mo105994b(c), mo105994b(a));
        int b = mo105994b(this.f341147b.mo54382c(((Integer) this.f341149d.get(i)).intValue()));
        return C123427f.m202785d(substring, (C58485gu) Collection.EL.stream(this.f341148c.mo105927h()).filter(new C123378de(b, mo105994b(this.f341147b.mo54380a(((Integer) this.f341149d.get(i)).intValue())))).map(new C123379df(b)).collect(C58370cn.f155946a));
    }
}
