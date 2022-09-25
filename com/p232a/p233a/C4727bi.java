package com.p232a.p233a;

import org.xml.sax.SAXException;

/* renamed from: com.a.a.bi */
/* compiled from: PG */
public class C4727bi extends C4709ar {
    protected C4727bi() {
    }

    /* renamed from: b */
    public final void mo9601b(C4715ax axVar) {
        if (axVar instanceof C4726bh) {
            this.f14813i.add(axVar);
            return;
        }
        String obj = axVar.toString();
        throw new SAXException("Text content elements cannot contain " + obj + " elements.");
    }
}
