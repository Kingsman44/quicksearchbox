package com.google.android.gms.p10815k.p10816a;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.common.base.C58817ah;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.k.a.aj */
/* compiled from: PG */
public final class C144368aj {

    /* renamed from: a */
    private final List f390947a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private final C144367ai f390948b;

    /* renamed from: c */
    private Object f390949c;

    public C144368aj(C144367ai aiVar) {
        this.f390948b = aiVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo119875a(Object obj) {
        synchronized (this) {
            this.f390949c = obj;
        }
        for (Object a : this.f390947a) {
            this.f390948b.mo119873a(a, obj);
        }
    }

    /* renamed from: b */
    public final void mo119876b(Object obj, C58817ah ahVar) {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.f390947a.isEmpty();
            this.f390947a.add(obj);
        }
        if (isEmpty) {
            C146006ab abVar = (C146006ab) ahVar.apply(obj);
            return;
        }
        synchronized (this) {
            Object obj2 = this.f390949c;
            if (obj2 != null) {
                this.f390948b.mo119873a(obj, obj2);
            }
        }
        C146021aq.m237850d((Object) null);
    }

    /* renamed from: c */
    public final void mo119877c(Object obj, C58817ah ahVar) {
        synchronized (this) {
            this.f390947a.remove(obj);
            if (!this.f390947a.isEmpty()) {
                C146021aq.m237850d(true);
            } else {
                C146006ab abVar = (C146006ab) ahVar.apply((Object) null);
            }
        }
    }
}
