package com.google.android.apps.gsa.shared.logger;

import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.p395al.p408c.p414c.p416b.C8502l;
import com.google.p395al.p408c.p414c.p416b.C8503m;
import com.google.protobuf.C62963cj;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.logger.d */
/* compiled from: PG */
final class C89883d extends C89886e {

    /* renamed from: a */
    public final C68214a f246249a;

    /* renamed from: i */
    private final C68214a f246250i;

    /* renamed from: j */
    private final C89953u f246251j;

    public C89883d(C90456c cVar, C68214a aVar, C68214a aVar2, C89953u uVar) {
        super(cVar);
        this.f246251j = uVar;
        this.f246250i = aVar;
        this.f246249a = aVar2;
    }

    /* renamed from: a */
    public final void mo83721a() {
        boolean z;
        boolean z2;
        C8503m mVar;
        List list = this.f246251j.f246467a;
        list.size();
        Iterator it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            mVar = (C8503m) it.next();
            int i = mVar.f29506a;
            int i2 = mVar.f29507b;
            int i3 = mVar.f29508c;
            if ((i == 0 || i == this.f246281b.mo79844b()) && ((i2 == 0 || i2 == this.f246281b.mo79843a()) && ((i3 == 0 || i3 == this.f246282c) && !(i2 == 0 && i3 == 0)))) {
                z2 = false;
                boolean z3 = false;
            }
        }
        z2 = false;
        boolean z32 = false;
        for (C8502l lVar : new C62963cj(mVar.f29509d, C8503m.f29503e)) {
            boolean z4 = true;
            z32 |= lVar == C8502l.STACK_TRACE;
            if (lVar != C8502l.STATE_DUMP) {
                z4 = false;
            }
            z2 |= z4;
        }
        z = z32;
        mo83724c();
        if (z && !this.f246251j.mo83806b(C8502l.STACK_TRACE)) {
            this.f246286g = this.f246281b.mo79845c();
            this.f246251j.mo83805a(C8502l.STACK_TRACE);
        }
        if (!z2) {
            mo83723b();
        } else if (!this.f246251j.mo83806b(C8502l.STATE_DUMP)) {
            ((C22871g) this.f246250i.mo27525b()).mo28212l("Grab state dump", new C89877c(this));
            this.f246251j.mo83805a(C8502l.STATE_DUMP);
        } else {
            mo83723b();
        }
    }
}
