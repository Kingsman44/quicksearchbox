package com.google.android.apps.gsa.staticplugins.p7714cv.p7722f;

import android.util.Pair;
import com.google.android.apps.gsa.c.f.u;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118948b;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118949c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.C90768bl;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.speech.microdetection.C92528b;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92271h;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92276m;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98710b;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7719c.C98718a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.f.c */
/* compiled from: PG */
public final class C98748c implements C118949c {

    /* renamed from: a */
    private final C22871g f275836a;

    /* renamed from: b */
    private final C22871g f275837b;

    /* renamed from: c */
    private final C68214a f275838c;

    /* renamed from: d */
    private final C68214a f275839d;

    /* renamed from: e */
    private final C92271h f275840e;

    /* renamed from: f */
    private final C69464a f275841f;

    /* renamed from: g */
    private final C92528b f275842g;

    /* renamed from: h */
    private final C89859i f275843h;

    /* renamed from: i */
    private final u f275844i;

    /* renamed from: j */
    private C118948b f275845j;

    /* renamed from: k */
    private C118948b f275846k;

    /* renamed from: l */
    private C118948b f275847l;

    public C98748c(C22871g gVar, C22871g gVar2, C68214a aVar, C92271h hVar, C69464a aVar2, C92528b bVar, C68214a aVar3, C89859i iVar, u uVar) {
        this.f275836a = gVar;
        this.f275837b = gVar2;
        this.f275838c = aVar;
        this.f275840e = hVar;
        this.f275841f = aVar2;
        this.f275842g = bVar;
        this.f275839d = aVar3;
        this.f275843h = iVar;
        this.f275844i = uVar;
    }

    /* renamed from: a */
    public final List mo91287a(List list) {
        C58976aa aaVar = C58975e.f156826a;
        ArrayList e = C58597ky.m90214e(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue == 1) {
                Integer valueOf = Integer.valueOf(intValue);
                if (this.f275845j == null) {
                    C92271h hVar = this.f275840e;
                    this.f275845j = (C118948b) C90768bl.m148268a(hVar.f257283b, C118948b.class, new C98718a(hVar, new C98710b((C91123v) this.f275841f.mo17428b()), new C92276m(), this.f275838c, this.f275843h, this.f275844i));
                }
                e.add(Pair.create(valueOf, this.f275845j));
            } else if (intValue == 2) {
                Integer valueOf2 = Integer.valueOf(intValue);
                if (this.f275846k == null) {
                    this.f275846k = (C118948b) C90768bl.m148268a(this.f275836a, C118948b.class, (C118948b) this.f275839d.mo27525b());
                }
                e.add(Pair.create(valueOf2, this.f275846k));
            } else if (intValue == 4) {
                Integer valueOf3 = Integer.valueOf(intValue);
                if (this.f275847l == null) {
                    this.f275847l = (C118948b) C90768bl.m148268a(this.f275837b, C118948b.class, this.f275842g.mo87297a());
                }
                e.add(Pair.create(valueOf3, this.f275847l));
            }
        }
        return e;
    }
}
