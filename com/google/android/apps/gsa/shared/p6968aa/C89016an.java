package com.google.android.apps.gsa.shared.p6968aa;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.apps.gsa.plugins.p6468a.C84054a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90745b;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.C21383f;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.google.android.apps.gsa.shared.aa.an */
/* compiled from: PG */
public final class C89016an implements C90991b {

    /* renamed from: a */
    public final Queue f241221a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final Object f241222b = new Object();

    /* renamed from: c */
    public final C21370a f241223c;

    /* renamed from: d */
    public final SparseIntArray f241224d = new SparseIntArray(32);

    /* renamed from: e */
    public final SparseArray f241225e = new SparseArray();

    /* renamed from: f */
    public final SparseArray f241226f = new SparseArray();

    /* renamed from: g */
    public final SparseArray f241227g = new SparseArray();

    /* renamed from: h */
    public final SparseArray f241228h = new SparseArray();

    /* renamed from: i */
    public final SparseArray f241229i = new SparseArray();

    /* renamed from: j */
    public boolean f241230j = false;

    /* renamed from: k */
    private final SparseArray f241231k = new SparseArray();

    public C89016an(C21370a aVar) {
        this.f241223c = aVar;
    }

    /* renamed from: a */
    static long m144744a(List list) {
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            C89014al alVar = (C89014al) it.next();
            j += (long) (alVar.f241218a.length() + alVar.f241219b.length() + 4);
        }
        return j;
    }

    /* renamed from: b */
    static long m144745b(String str, String str2, List list) {
        return m144744a(list) + ((long) (str2.length() + str.length() + 4));
    }

    /* renamed from: e */
    private final void m144746e(C89000a aVar, SparseIntArray sparseIntArray, SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3, SparseArray sparseArray4, SparseArray sparseArray5, SparseArray sparseArray6) {
        synchronized (this.f241222b) {
            int i = aVar.f241177b;
            sparseIntArray.put(i, sparseIntArray.get(i, 0) + 1);
            sparseArray3.put(i, Long.valueOf(aVar.f241181f + ((Long) sparseArray3.get(i, 0L)).longValue()));
            sparseArray.put(i, Long.valueOf(aVar.f241180e + ((Long) sparseArray.get(i, 0L)).longValue()));
            sparseArray4.put(i, Long.valueOf(aVar.mo82960c() + ((Long) sparseArray4.get(i, 0L)).longValue()));
            if (aVar.f241185j != null) {
                sparseArray2.put(i, Long.valueOf(m144744a(aVar.f241185j.f241281c) + ((Long) sparseArray2.get(i, 0L)).longValue()));
            }
            sparseArray5.put(i, Long.valueOf(aVar.f241182g + ((Long) sparseArray5.get(i, 0L)).longValue()));
            sparseArray6.put(i, Long.valueOf(aVar.f241183h + ((Long) sparseArray6.get(i, 0L)).longValue()));
        }
    }

    /* renamed from: c */
    public final void mo82988c(C89000a aVar) {
        synchronized (this.f241222b) {
            if (!this.f241230j) {
                while (this.f241221a.size() > 49) {
                    m144746e((C89000a) this.f241221a.remove(), this.f241224d, this.f241225e, this.f241227g, this.f241228h, this.f241229i, this.f241226f, this.f241231k);
                }
            }
            this.f241221a.add(aVar);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        SparseIntArray clone;
        SparseArray clone2;
        SparseArray clone3;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        SparseArray sparseArray4;
        C91006f fVar2 = fVar;
        fVar2.mo85291r("Recent HTTP requests");
        ArrayList arrayList = new ArrayList();
        synchronized (this.f241222b) {
            clone = this.f241224d.clone();
            clone2 = this.f241225e.clone();
            clone3 = this.f241227g.clone();
            SparseArray clone4 = this.f241228h.clone();
            SparseArray clone5 = this.f241229i.clone();
            SparseArray clone6 = this.f241226f.clone();
            SparseArray clone7 = this.f241231k.clone();
            for (C89000a aVar : this.f241221a) {
                arrayList.add(aVar);
                SparseArray sparseArray5 = clone7;
                SparseArray sparseArray6 = clone6;
                m144746e(aVar, clone, clone2, clone3, clone4, clone5, sparseArray6, sparseArray5);
                clone7 = sparseArray5;
                clone6 = sparseArray6;
                clone5 = clone5;
                clone4 = clone4;
            }
            sparseArray = clone7;
            sparseArray2 = clone6;
            sparseArray3 = clone5;
            sparseArray4 = clone4;
        }
        int size = arrayList.size();
        C59795fw fwVar = fVar2.f254236a;
        fwVar.copyOnWrite();
        C59796fx fxVar = C59796fx.f161580r;
        ((C59796fx) fwVar.instance).f161593l = C59796fx.emptyProtobufList();
        for (int i = 0; i < size; i++) {
            C89000a aVar2 = (C89000a) arrayList.get(i);
            aVar2.mo27451g(fVar2.mo85279c(C90745b.m148220a(new Date(C21383f.m40448a(this.f241223c, aVar2.f241176a)))));
            synchronized (this.f241222b) {
                if (!this.f241230j) {
                    fwVar.mo57058a(aVar2.mo82961d());
                } else {
                    fwVar.mo57058a(aVar2.mo82962e());
                }
            }
        }
        for (int i2 = 0; i2 < clone.size(); i2++) {
            int keyAt = clone.keyAt(i2);
            fVar2.mo85293t("tag %s; requests: %d; downloaded content bytes: %d; downloaded header bytes: %d; uploaded content bytes: %d; uploaded header bytes: %d; raw bytes received: %d; raw bytes sent: %d;", C90752i.m148229c(C84054a.m133949a(keyAt)), C90752i.m148230d(Integer.valueOf(clone.get(keyAt, 0))), C90752i.m148230d((Number) clone2.get(keyAt, 0L)), C90752i.m148230d((Number) clone3.get(keyAt, 0L)), C90752i.m148230d((Number) sparseArray4.get(keyAt, 0L)), C90752i.m148230d((Number) sparseArray3.get(keyAt, 0L)), C90752i.m148230d((Number) sparseArray2.get(keyAt, 0L)), C90752i.m148230d((Number) sparseArray.get(keyAt, 0L)));
        }
    }
}
