package com.google.android.apps.gsa.speech.p7270c;

import android.util.Pair;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.speech.c.e */
/* compiled from: PG */
public final class C92222e implements C58881cr {

    /* renamed from: a */
    public final Object f257116a;

    /* renamed from: b */
    public final C21370a f257117b;

    /* renamed from: c */
    public final List f257118c;

    public C92222e(C21370a aVar) {
        Object obj = new Object();
        this.f257116a = obj;
        this.f257117b = aVar;
        synchronized (obj) {
            this.f257118c = new ArrayList();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6453a() {
        ArrayList e;
        synchronized (this.f257116a) {
            e = C58597ky.m90214e(this.f257118c.size());
            long c = this.f257117b.mo26871c();
            int size = this.f257118c.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((Long) ((Pair) this.f257118c.get(size)).second).longValue() <= c) {
                        this.f257118c.remove(size);
                    } else {
                        C58976aa aaVar = C58975e.f156826a;
                        Object obj = ((Pair) this.f257118c.get(size)).first;
                        e.add((String) ((Pair) this.f257118c.get(size)).first);
                    }
                }
            }
        }
        return e;
    }
}
