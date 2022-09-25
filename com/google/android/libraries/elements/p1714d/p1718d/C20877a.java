package com.google.android.libraries.elements.p1714d.p1718d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.android.libraries.elements.internal.C21359t;
import com.youtube.p5283a.p5284a.C68044ag;
import com.youtube.p5283a.p5284a.C68054aq;
import com.youtube.p5283a.p5284a.C68095q;
import java.util.ArrayList;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.elements.d.d.a */
/* compiled from: PG */
public final class C20877a extends C20886h {

    /* renamed from: a */
    private final ArrayList f58546a;

    /* renamed from: b */
    private final C21313t f58547b;

    /* renamed from: c */
    private final C21357r f58548c;

    public C20877a(C68095q qVar, C21313t tVar, C21311r rVar, C21359t tVar2) {
        super(rVar);
        this.f58547b = tVar;
        C68054aq aqVar = new C68054aq();
        int a = qVar.mo16913a(4);
        C68044ag agVar = null;
        if (a != 0) {
            int i = a + qVar.f24703a;
            aqVar.mo16917e(i + qVar.f24704b.getInt(i), qVar.f24704b);
        } else {
            aqVar = null;
        }
        ArrayList arrayList = new ArrayList();
        this.f58546a = arrayList;
        if (aqVar == null) {
            this.f58548c = null;
            return;
        }
        arrayList.add(C21359t.m40381f(aqVar));
        C68044ag agVar2 = new C68044ag();
        int a2 = qVar.mo16913a(6);
        if (a2 != 0) {
            int i2 = a2 + qVar.f24703a;
            agVar2.mo16917e(i2 + qVar.f24704b.getInt(i2), qVar.f24704b);
            agVar = agVar2;
        }
        this.f58548c = tVar2.mo26863g(agVar, this.f58578d.mo26734d());
    }

    public final Status criteriaMatched(ArrayList arrayList) {
        C21357r rVar = this.f58548c;
        if (rVar != null) {
            this.f58547b.mo26124a(rVar.mo26862a(), mo26019a()).mo61453k();
        }
        return Status.f186902OK;
    }

    public final ArrayList getCriteriaList() {
        return this.f58546a;
    }

    public final String getGroupId() {
        return BuildConfig.FLAVOR;
    }
}
