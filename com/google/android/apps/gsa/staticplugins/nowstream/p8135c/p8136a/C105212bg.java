package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6900j.C87348a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8138b.C105315e;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8144h.C105367a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8145i.C105380k;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105403k;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105437g;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23279c;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23284h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C8142xb;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.bg */
/* compiled from: PG */
public final class C105212bg extends C105209bd implements C105403k {

    /* renamed from: a */
    private final Context f293464a;

    public C105212bg(C23052c cVar, C105437g gVar, Context context, C22871g gVar2, C68214a aVar, C90479a aVar2, C86124t tVar, C23279c cVar2, C105367a aVar3, C105380k kVar, C105315e eVar, C87334q qVar) {
        super(cVar, gVar, gVar2, aVar, aVar2, cVar2, aVar3, kVar, tVar, C7642eo.PULL_TO_REFRESH_MINUS_ONE, eVar, qVar);
        this.f293464a = context;
        ((C23015k) cVar).f63315j.mo28430t(C87348a.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C8142xb mo94566e() {
        return C8142xb.ACETONE_OVERLAY_MOMO;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009c, code lost:
        if (true != (com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145461s(com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145447e(r5.f293464a)) || r5.f293464a.getPackageManager().hasSystemFeature("com.google.android.feature.ANDROID_ONE_EXPERIENCE") || com.google.common.base.C58890d.m90990e(android.os.Build.MANUFACTURER, "samsung"))) goto L_0x00a0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94568h(boolean r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            com.google.android.apps.gsa.sidekick.shared.monet.c.n r0 = com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91807n.f256041f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.sidekick.shared.monet.c.m r0 = (com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91806m) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.sidekick.shared.monet.c.n r1 = (com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91807n) r1
            int r2 = r1.f256043a
            r3 = 1
            r2 = r2 | r3
            r1.f256043a = r2
            r1.f256044b = r6
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.apps.gsa.sidekick.shared.monet.c.n r6 = (com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91807n) r6
            int r1 = r6.f256043a
            r2 = 2
            r1 = r1 | r2
            r6.f256043a = r1
            r6.f256045c = r7
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.apps.gsa.sidekick.shared.monet.c.n r6 = (com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91807n) r6
            int r1 = r6.f256043a
            r1 = r1 | 4
            r6.f256043a = r1
            r6.f256046d = r8
            com.google.android.apps.gsa.staticplugins.nowstream.shared.c.b r6 = r5.f293798h
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r6 = r6.mo94558w()
            java.lang.Object r6 = r6.f63720e
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.sidekick.shared.monet.c.n r1 = (com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91807n) r1
            int r4 = r1.f256043a
            r4 = r4 | 8
            r1.f256043a = r4
            r1.f256047e = r6
            com.google.protobuf.bv r6 = r0.build()
            com.google.android.apps.gsa.sidekick.shared.monet.c.n r6 = (com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91807n) r6
            com.google.android.libraries.gsa.monet.tools.recycling.b.b r0 = r5.f293799i
            r1 = 0
            java.lang.String r4 = "TYPE_ROUNDED_SEARCHBAR_MINUS_ONE_HEADER"
            if (r7 == 0) goto L_0x0060
            goto L_0x00a0
        L_0x0060:
            if (r8 == 0) goto L_0x0065
            java.lang.String r4 = "TYPE_ROUNDED_SEARCHBAR_SHARED_MINUS_ONE_HEADER"
            goto L_0x00a0
        L_0x0065:
            com.google.android.apps.gsa.search.core.i.t r7 = r5.f293802l
            com.google.android.apps.gsa.shared.m.f r8 = com.google.android.apps.gsa.shared.p7066m.C90010bp.f246966ai
            long r7 = r7.mo79743a(r8)
            int r8 = (int) r7
            java.lang.String r7 = "TYPE_NO_SEARCHBAR_MINUS_ONE_HEADER"
            if (r8 == r3) goto L_0x009f
            if (r8 == r2) goto L_0x00a0
            android.content.Context r8 = r5.f293464a
            android.content.pm.ResolveInfo r8 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145447e(r8)
            boolean r8 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145461s(r8)
            if (r8 != 0) goto L_0x009b
            android.content.Context r8 = r5.f293464a
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            java.lang.String r2 = "com.google.android.feature.ANDROID_ONE_EXPERIENCE"
            boolean r8 = r8.hasSystemFeature(r2)
            if (r8 != 0) goto L_0x009b
            java.lang.String r8 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "samsung"
            boolean r8 = com.google.common.base.C58890d.m90990e(r8, r2)
            if (r8 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r8 = 0
            goto L_0x009c
        L_0x009b:
            r8 = 1
        L_0x009c:
            if (r3 == r8) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r4 = r7
        L_0x00a0:
            com.google.android.libraries.gsa.monet.shared.y r7 = r5.mo28494O(r4)
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r6 = com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b.m43556a(r6)
            java.lang.String r8 = "MINUS_ONE_HEADER"
            r0.mo28754e(r8, r7, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105212bg.mo94568h(boolean, boolean, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo94570j(C23028x xVar) {
        if (this.f293799i.f63752b.f63757a.mo28646k(xVar, "MINUS_ONE_HEADER")) {
            this.f293799i.f63752b.mo28758b(xVar, "MINUS_ONE_HEADER", (C23284h) null);
        } else {
            mo94568h(((Boolean) ((C23251a) this.f293798h.mo94545j()).f63720e).booleanValue(), ((Boolean) ((C23251a) this.f293798h.mo94546k()).f63720e).booleanValue(), ((Boolean) this.f293798h.mo94557v().f63720e).booleanValue());
        }
    }
}
