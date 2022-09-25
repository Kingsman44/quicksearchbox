package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4575r.C60763t;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.cb */
/* compiled from: PG */
public final /* synthetic */ class C103956cb implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C103961cg f289329a;

    public /* synthetic */ C103956cb(C103961cg cgVar) {
        this.f289329a = cgVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C103961cg cgVar = this.f289329a;
        C58485gu a = ((C103960cf) obj).mo93895a();
        if (a.isEmpty()) {
            return true;
        }
        long longValue = ((Long) cgVar.f289334b.mo6453a()).longValue();
        int size = a.size();
        int i = 0;
        while (i < size) {
            String str = (String) a.get(i);
            try {
                i++;
                if (C60763t.m92766c(str, 16) == longValue) {
                    return true;
                }
            } catch (NumberFormatException e) {
                ((C58970a) ((C58970a) ((C58970a) C103961cg.f289333a.mo56225c()).mo56382g(e)).mo56372aa(21716)).mo56389s("Could not decode the model hash %s!", str);
            }
        }
        return false;
    }
}
