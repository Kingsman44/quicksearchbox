package com.google.android.libraries.elements.p1714d;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.libraries.elements.interfaces.C21261bd;
import com.google.android.libraries.elements.interfaces.C21278bu;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21357r;
import com.google.protos.youtube.elements.C66190dd;
import com.google.protos.youtube.elements.C66192df;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.elements.d.l */
/* compiled from: PG */
final class C21122l extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C21357r f59218a;

    /* renamed from: b */
    final /* synthetic */ C21313t f59219b;

    /* renamed from: c */
    final /* synthetic */ C21310q f59220c;

    /* renamed from: d */
    final /* synthetic */ C21319z f59221d;

    /* renamed from: e */
    final /* synthetic */ AtomicReference f59222e;

    /* renamed from: f */
    final /* synthetic */ AtomicBoolean f59223f;

    /* renamed from: g */
    final /* synthetic */ C21357r f59224g;

    /* renamed from: h */
    final /* synthetic */ C21357r f59225h;

    /* renamed from: i */
    final /* synthetic */ int f59226i;

    public C21122l(C21357r rVar, C21313t tVar, C21310q qVar, C21319z zVar, AtomicReference atomicReference, AtomicBoolean atomicBoolean, C21357r rVar2, int i, C21357r rVar3) {
        this.f59218a = rVar;
        this.f59219b = tVar;
        this.f59220c = qVar;
        this.f59221d = zVar;
        this.f59222e = atomicReference;
        this.f59223f = atomicBoolean;
        this.f59224g = rVar2;
        this.f59226i = i;
        this.f59225h = rVar3;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C21357r rVar = this.f59218a;
        if (rVar != null) {
            C21124n.m39671b(recyclerView, this.f59219b, rVar.mo26862a(), this.f59220c, this.f59221d.mo26806h(), this.f59221d.mo26805g());
        }
        AtomicReference atomicReference = this.f59222e;
        if (atomicReference != null && atomicReference.get() != null) {
            ((C21278bu) this.f59222e.get()).mo26013c(recyclerView);
        }
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C21357r rVar;
        if (i != 0) {
            if (i == 1 && this.f59223f.compareAndSet(false, true) && (rVar = this.f59225h) != null) {
                C21124n.m39671b(recyclerView, this.f59219b, rVar.mo26862a(), this.f59220c, this.f59221d.mo26806h(), this.f59221d.mo26805g());
            }
        } else if (this.f59223f.compareAndSet(true, false)) {
            C21357r rVar2 = this.f59224g;
            if (rVar2 != null) {
                C21124n.m39671b(recyclerView, this.f59219b, rVar2.mo26862a(), this.f59220c, this.f59221d.mo26806h(), this.f59221d.mo26805g());
            }
            if (this.f59226i == 2) {
                C21319z zVar = this.f59221d;
                int i2 = C21124n.f59231a;
                C66192df E = zVar.mo26844E();
                C21261bd C = zVar.mo26842C();
                if (C != null && E != null) {
                    C.mo26745b(E, C66190dd.GESTURE_TYPE_SWIPE);
                }
            }
        }
    }
}
