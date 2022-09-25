package com.google.android.apps.gsa.speech.p7270c;

import android.util.Pair;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86247cc;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.speech.c.a */
/* compiled from: PG */
public final class C92218a implements C58881cr {

    /* renamed from: a */
    public C86232bo f257096a;

    /* renamed from: b */
    private final C21370a f257097b;

    /* renamed from: c */
    private final List f257098c = new ArrayList();

    public C92218a(C21370a aVar) {
        this.f257097b = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6453a() {
        ArrayList arrayList = new ArrayList();
        C86232bo boVar = this.f257096a;
        if (boVar != null && C90918bo.m148517d(boVar.mo79871G())) {
            C86247cc ccVar = (C86247cc) C90918bo.m148515b(boVar.mo79871G());
            if (ccVar.f233135d != null) {
                arrayList.addAll(ccVar.f233135d.f155543h);
            }
        }
        int size = this.f257098c.size();
        while (true) {
            size--;
            if (size < 0) {
                return arrayList;
            }
            if (((Long) ((Pair) this.f257098c.get(size)).second).longValue() <= this.f257097b.mo26871c()) {
                this.f257098c.remove(size);
            } else {
                C58976aa aaVar = C58975e.f156826a;
                Object obj = ((Pair) this.f257098c.get(size)).first;
                arrayList.add((String) ((Pair) this.f257098c.get(size)).first);
            }
        }
    }
}
