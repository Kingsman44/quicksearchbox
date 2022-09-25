package com.google.android.libraries.onegoogle.account.disc;

import com.google.android.libraries.p1623at.p1632e.C19555c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.af */
/* compiled from: PG */
public final class C30178af {

    /* renamed from: a */
    public final CopyOnWriteArrayList f81608a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public C30175ac f81609b;

    public C30178af() {
    }

    /* renamed from: a */
    public final void mo35629a(C30175ac acVar) {
        if (!C19555c.m37297b(acVar, this.f81609b)) {
            this.f81609b = acVar;
            Iterator it = this.f81608a.iterator();
            while (it.hasNext()) {
                ((C30177ae) it.next()).mo35620a();
            }
        }
    }

    public C30178af(C30175ac acVar) {
        this.f81609b = acVar;
    }
}
