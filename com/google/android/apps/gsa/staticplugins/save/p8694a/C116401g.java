package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.google.android.apps.gsa.search.core.p6519al.p6662co.C85166b;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116424c;
import com.google.android.apps.gsa.staticplugins.save.p8697b.p8698a.C116428g;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4541l.C59326i;
import com.google.common.p4541l.C59332o;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57567ak;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57607bx;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.g */
/* compiled from: PG */
public final /* synthetic */ class C116401g implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C116420z f322779a;

    /* renamed from: b */
    public final /* synthetic */ C116424c f322780b;

    /* renamed from: c */
    public final /* synthetic */ boolean f322781c;

    public /* synthetic */ C116401g(C116420z zVar, C116424c cVar, boolean z) {
        this.f322779a = zVar;
        this.f322780b = cVar;
        this.f322781c = z;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C116420z zVar = this.f322779a;
        C116424c cVar = this.f322780b;
        boolean z = this.f322781c;
        C85166b bVar = (C85166b) obj;
        if (bVar.mo78742c() != null) {
            ((C89911f) zVar.f322812c.mo27525b()).mo83756b(new C90452a(bVar.mo78742c(), 211, 720926)).mo83721a();
            return C60856cj.m92900i(C116428g.f322833d);
        } else if (bVar.mo78740a() != 200) {
            ((C89911f) zVar.f322812c.mo27525b()).mo83756b(new C90452a(211, 720926)).mo83721a();
            return C60856cj.m92900i(C116428g.f322833d);
        } else {
            try {
                InputStream b = bVar.mo78741b();
                b.getClass();
                byte[] d = C59332o.m92213d(b);
                String l = C59326i.f157517e.mo56837l(d, d.length);
                C57567ak akVar = (C57567ak) C57569am.f153797f.createBuilder();
                C57607bx bxVar = C57607bx.f153890a;
                akVar.copyOnWrite();
                C57569am amVar = (C57569am) akVar.instance;
                bxVar.getClass();
                amVar.f153800b = bxVar;
                amVar.f153799a = 25;
                return zVar.mo102687e((C57569am) akVar.build(), cVar, z, C58833ax.m90834k(l));
            } catch (IOException e) {
                ((C89911f) zVar.f322812c.mo27525b()).mo83756b(new C90452a(e, 211, 720926)).mo83721a();
                return C60856cj.m92900i(C116428g.f322833d);
            }
        }
    }
}
