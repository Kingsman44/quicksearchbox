package com.google.android.libraries.elements.p1714d.p1718d;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.common.base.C58832aw;
import com.google.common.base.C58837ba;
import com.youtube.p5283a.p5284a.C68066bb;
import java.util.ArrayList;
import p5488io.grpc.Status;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5517i.C70101a;
import p5488io.p5490b.p5518j.C70111i;

/* renamed from: com.google.android.libraries.elements.d.d.x */
/* compiled from: PG */
public final class C20902x extends C20886h {

    /* renamed from: a */
    private final ArrayList f58601a;

    /* renamed from: b */
    private final C21313t f58602b;

    /* renamed from: c */
    private C21357r f58603c;

    /* renamed from: f */
    private C21357r f58604f;

    /* renamed from: g */
    private IntersectionCriteria f58605g;

    /* renamed from: h */
    private IntersectionCriteria f58606h;

    /* renamed from: i */
    private final String f58607i;

    /* renamed from: j */
    private boolean f58608j;

    public C20902x(C68066bb bbVar, C21313t tVar, C21311r rVar, C21359t tVar2) {
        super(rVar);
        this.f58602b = tVar;
        ArrayList arrayList = new ArrayList();
        this.f58601a = arrayList;
        if (!(bbVar.mo60151i() == null || bbVar.mo60149g() == null)) {
            IntersectionCriteria f = C21359t.m40381f(bbVar.mo60151i());
            this.f58605g = f;
            arrayList.add(f);
            this.f58603c = tVar2.mo26863g(bbVar.mo60149g(), this.f58578d.mo26734d());
        }
        if (!(bbVar.mo60152j() == null || bbVar.mo60150h() == null)) {
            IntersectionCriteria f2 = C21359t.m40381f(bbVar.mo60152j());
            this.f58606h = f2;
            arrayList.add(f2);
            this.f58604f = tVar2.mo26863g(bbVar.mo60150h(), this.f58578d.mo26734d());
        }
        int a = bbVar.mo16913a(12);
        this.f58607i = C58837ba.m90858g(a != 0 ? bbVar.mo16916d(a + bbVar.f24703a) : null);
    }

    public final Status criteriaMatched(ArrayList arrayList) {
        C21357r rVar;
        if (arrayList.isEmpty()) {
            return Status.f186906d;
        }
        C21311r a = mo26019a();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IntersectionCriteria intersectionCriteria = (IntersectionCriteria) arrayList.get(i);
            if (C58832aw.m90831a(intersectionCriteria, this.f58605g)) {
                if (!this.f58608j) {
                    this.f58608j = true;
                    C21357r rVar2 = this.f58603c;
                    if (rVar2 != null) {
                        C69794a a2 = this.f58602b.mo26124a(rVar2.mo26862a(), a);
                        C70128t tVar = C70111i.f186862c;
                        C69822d dVar = C70101a.f186841i;
                        a2.mo61451i(tVar).mo61453k();
                    }
                }
            } else if (C58832aw.m90831a(intersectionCriteria, this.f58606h)) {
                if (this.f58608j && (rVar = this.f58604f) != null) {
                    this.f58602b.mo26124a(rVar.mo26862a(), a).mo61453k();
                }
                this.f58608j = false;
            }
        }
        return Status.f186902OK;
    }

    public final ArrayList getCriteriaList() {
        return this.f58601a;
    }

    public final String getGroupId() {
        return this.f58607i;
    }
}
