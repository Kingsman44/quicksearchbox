package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices;

import androidx.slice.widget.C4147c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.aoe;
import com.google.common.p4552o.aof;
import com.google.common.p4552o.aog;
import com.google.common.p4552o.aoh;
import com.google.common.p4552o.aow;
import com.google.common.p4552o.aox;
import com.google.common.p4552o.apd;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.e */
/* compiled from: PG */
final class C88675e extends C41641b implements C89203h, C89204i {

    /* renamed from: a */
    private static final C58528ij f239750a = C58528ij.m90011K(286, 298);

    /* renamed from: b */
    private final C21370a f239751b;

    /* renamed from: c */
    private final Map f239752c = new HashMap();

    /* renamed from: d */
    private final List f239753d = new ArrayList();

    /* renamed from: e */
    private C89205j f239754e;

    public C88675e(C21370a aVar) {
        this.f239751b = aVar;
    }

    /* renamed from: j */
    private static Integer m143432j(Suggestion suggestion) {
        for (Integer num : suggestion.f108925z) {
            if (f239750a.contains(num)) {
                return num;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final synchronized void mo82362a(Suggestion suggestion, C4147c cVar, String str, String str2) {
        List list = this.f239753d;
        aow aow = (aow) aox.f159532e.createBuilder();
        aoe aoe = (aoe) aof.f159472j.createBuilder();
        String i = C41670aj.m73076i(suggestion);
        aoe.copyOnWrite();
        aof aof = (aof) aoe.instance;
        i.getClass();
        aof.f159474a |= 1;
        aof.f159475b = i;
        String d = C41670aj.m73071d(suggestion);
        aoe.copyOnWrite();
        aof aof2 = (aof) aoe.instance;
        d.getClass();
        aof2.f159474a |= 256;
        aof2.f159482i = d;
        int intValue = m143432j(suggestion).intValue();
        aoe.copyOnWrite();
        aof aof3 = (aof) aoe.instance;
        aof3.f159474a |= 32;
        aof3.f159480g = intValue;
        aoe.copyOnWrite();
        aof aof4 = (aof) aoe.instance;
        str.getClass();
        aof4.f159474a |= 64;
        aof4.f159481h = str;
        boolean z = cVar.f13337a == 2;
        aoe.copyOnWrite();
        aof aof5 = (aof) aoe.instance;
        aof5.f159474a |= 2;
        aof5.f159476c = z;
        int i2 = cVar.f13338b;
        aoe.copyOnWrite();
        aof aof6 = (aof) aoe.instance;
        aof6.f159474a |= 4;
        aof6.f159477d = i2;
        int i3 = cVar.f13339c;
        aoe.copyOnWrite();
        aof aof7 = (aof) aoe.instance;
        aof7.f159474a |= 8;
        aof7.f159478e = i3;
        int i4 = cVar.f13340d;
        aoe.copyOnWrite();
        aof aof8 = (aof) aoe.instance;
        aof8.f159474a |= 16;
        aof8.f159479f = i4;
        aow.copyOnWrite();
        aox aox = (aox) aow.instance;
        aof aof9 = (aof) aoe.build();
        aof9.getClass();
        aox.f159536c = aof9;
        aox.f159535b = 1;
        aow.copyOnWrite();
        aox aox2 = (aox) aow.instance;
        str2.getClass();
        aox2.f159534a |= 2;
        aox2.f159537d = str2;
        list.add((aox) aow.build());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82363c(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.libraries.f.a r0 = r8.f239751b     // Catch:{ all -> 0x0057 }
            long r0 = r0.mo26871c()     // Catch:{ all -> 0x0057 }
            java.lang.String r9 = com.google.android.libraries.searchbox.shared.suggestion.C41670aj.m73080m(r9)     // Catch:{ all -> 0x0057 }
            java.util.Map r2 = r8.f239752c     // Catch:{ all -> 0x0057 }
            boolean r2 = r2.containsKey(r9)     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x0055
            java.util.Map r2 = r8.f239752c     // Catch:{ all -> 0x0057 }
            java.lang.Object r2 = r2.get(r9)     // Catch:{ all -> 0x0057 }
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.d r2 = (com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.C88674d) r2     // Catch:{ all -> 0x0057 }
            com.google.common.o.aog r3 = r2.mo82357b()     // Catch:{ all -> 0x0057 }
            r3.copyOnWrite()     // Catch:{ all -> 0x0057 }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x0057 }
            com.google.common.o.aoh r4 = (com.google.common.p4552o.aoh) r4     // Catch:{ all -> 0x0057 }
            com.google.common.o.aoh r5 = com.google.common.p4552o.aoh.f159483h     // Catch:{ all -> 0x0057 }
            r9.getClass()     // Catch:{ all -> 0x0057 }
            int r5 = r4.f159485a     // Catch:{ all -> 0x0057 }
            r5 = r5 | 8
            r4.f159485a = r5     // Catch:{ all -> 0x0057 }
            r4.f159489e = r9     // Catch:{ all -> 0x0057 }
            com.google.protobuf.bv r9 = r3.instance     // Catch:{ all -> 0x0057 }
            com.google.common.o.aoh r9 = (com.google.common.p4552o.aoh) r9     // Catch:{ all -> 0x0057 }
            long r4 = r9.f159488d     // Catch:{ all -> 0x0057 }
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0055
            long r4 = r2.mo82356a()     // Catch:{ all -> 0x0057 }
            r3.copyOnWrite()     // Catch:{ all -> 0x0057 }
            com.google.protobuf.bv r9 = r3.instance     // Catch:{ all -> 0x0057 }
            com.google.common.o.aoh r9 = (com.google.common.p4552o.aoh) r9     // Catch:{ all -> 0x0057 }
            int r2 = r9.f159485a     // Catch:{ all -> 0x0057 }
            r2 = r2 | 4
            r9.f159485a = r2     // Catch:{ all -> 0x0057 }
            long r0 = r0 - r4
            r9.f159488d = r0     // Catch:{ all -> 0x0057 }
            monitor-exit(r8)
            return
        L_0x0055:
            monitor-exit(r8)
            return
        L_0x0057:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.C88675e.mo82363c(com.google.android.libraries.searchbox.shared.suggestion.Suggestion):void");
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* renamed from: f */
    public final synchronized void mo44231f(amt amt) {
        ArrayList arrayList = new ArrayList();
        for (C88674d b : this.f239752c.values()) {
            aog b2 = b.mo82357b();
            if ((((aoh) b2.instance).f159485a & 4) != 0) {
                arrayList.add((aoh) b2.build());
            }
        }
        if (!arrayList.isEmpty()) {
            amt.copyOnWrite();
            apd apd = (apd) amt.instance;
            apd apd2 = apd.f159555aA;
            C62971cq cqVar = apd.f159603at;
            if (!cqVar.mo58948c()) {
                apd.f159603at = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) arrayList, (List) apd.f159603at);
        }
        if (!this.f239753d.isEmpty()) {
            List list = this.f239753d;
            amt.copyOnWrite();
            apd apd3 = (apd) amt.instance;
            apd apd4 = apd.f159555aA;
            C62971cq cqVar2 = apd3.f159602as;
            if (!cqVar2.mo58948c()) {
                apd3.f159602as = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) list, (List) apd3.f159602as);
        }
        super.mo44231f(amt);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo82364g(Suggestion suggestion) {
        String m = C41670aj.m73080m(suggestion);
        if (!this.f239752c.containsKey(m)) {
            aog aog = (aog) aoh.f159483h.createBuilder();
            String i = C41670aj.m73076i(suggestion);
            aog.copyOnWrite();
            aoh aoh = (aoh) aog.instance;
            i.getClass();
            aoh.f159485a |= 1;
            aoh.f159486b = i;
            int intValue = m143432j(suggestion).intValue();
            aog.copyOnWrite();
            aoh aoh2 = (aoh) aog.instance;
            aoh2.f159485a |= 2;
            aoh2.f159487c = intValue;
            this.f239752c.put(m, new C88671a(this.f239751b.mo26871c(), aog));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized void mo82365h(Suggestion suggestion) {
        String m = C41670aj.m73080m(suggestion);
        if (this.f239752c.containsKey(m)) {
            aog b = ((C88674d) this.f239752c.get(m)).mo82357b();
            b.copyOnWrite();
            aoh aoh = (aoh) b.instance;
            aoh aoh2 = aoh.f159483h;
            aoh.f159485a |= 64;
            aoh.f159491g = true;
        }
    }

    /* renamed from: hC */
    public final synchronized void mo78005hC(C89205j jVar) {
        this.f239754e = jVar;
    }

    /* renamed from: hE */
    public final synchronized void mo78006hE() {
        this.f239753d.clear();
        this.f239752c.clear();
        C89205j jVar = this.f239754e;
        if (jVar != null) {
            jVar.mo83168h();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82366i(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r8, androidx.slice.widget.SliceView r9, androidx.slice.Slice r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.libraries.f.a r0 = r7.f239751b     // Catch:{ all -> 0x0048 }
            long r0 = r0.mo26871c()     // Catch:{ all -> 0x0048 }
            r9.mo8671f(r10)     // Catch:{ all -> 0x0048 }
            com.google.android.libraries.f.a r9 = r7.f239751b     // Catch:{ all -> 0x0048 }
            long r9 = r9.mo26871c()     // Catch:{ all -> 0x0048 }
            java.lang.String r8 = com.google.android.libraries.searchbox.shared.suggestion.C41670aj.m73080m(r8)     // Catch:{ all -> 0x0048 }
            java.util.Map r2 = r7.f239752c     // Catch:{ all -> 0x0048 }
            boolean r2 = r2.containsKey(r8)     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x0046
            java.util.Map r2 = r7.f239752c     // Catch:{ all -> 0x0048 }
            java.lang.Object r8 = r2.get(r8)     // Catch:{ all -> 0x0048 }
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.slices.d r8 = (com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.C88674d) r8     // Catch:{ all -> 0x0048 }
            com.google.common.o.aog r8 = r8.mo82357b()     // Catch:{ all -> 0x0048 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ all -> 0x0048 }
            com.google.common.o.aoh r2 = (com.google.common.p4552o.aoh) r2     // Catch:{ all -> 0x0048 }
            long r2 = r2.f159490f     // Catch:{ all -> 0x0048 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0046
            r8.copyOnWrite()     // Catch:{ all -> 0x0048 }
            com.google.protobuf.bv r8 = r8.instance     // Catch:{ all -> 0x0048 }
            com.google.common.o.aoh r8 = (com.google.common.p4552o.aoh) r8     // Catch:{ all -> 0x0048 }
            int r2 = r8.f159485a     // Catch:{ all -> 0x0048 }
            r2 = r2 | 32
            r8.f159485a = r2     // Catch:{ all -> 0x0048 }
            long r9 = r9 - r0
            r8.f159490f = r9     // Catch:{ all -> 0x0048 }
            monitor-exit(r7)
            return
        L_0x0046:
            monitor-exit(r7)
            return
        L_0x0048:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.C88675e.mo82366i(com.google.android.libraries.searchbox.shared.suggestion.Suggestion, androidx.slice.widget.SliceView, androidx.slice.Slice):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44232l(com.google.android.libraries.searchbox.shared.p3200a.C41640a r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            monitor-enter(r17)
            com.google.android.apps.gsa.shared.an.a.j r2 = r1.f239754e     // Catch:{ all -> 0x006c }
            if (r2 != 0) goto L_0x000b
            monitor-exit(r17)
            return
        L_0x000b:
            java.lang.String r3 = "PRE_REGISTER_CALLBACK_TS"
            long r2 = r2.mo83162b(r3)     // Catch:{ all -> 0x006c }
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239754e     // Catch:{ all -> 0x006c }
            java.lang.String r5 = "POST_REGISTER_CALLBACK_TS"
            long r4 = r4.mo83162b(r5)     // Catch:{ all -> 0x006c }
            com.google.android.apps.gsa.shared.an.a.j r6 = r1.f239754e     // Catch:{ all -> 0x006c }
            java.lang.String r7 = "PRE_BIND_SLICE_TS"
            long r6 = r6.mo83162b(r7)     // Catch:{ all -> 0x006c }
            com.google.android.apps.gsa.shared.an.a.j r8 = r1.f239754e     // Catch:{ all -> 0x006c }
            java.lang.String r9 = "POST_BIND_SLICE_TS"
            long r8 = r8.mo83162b(r9)     // Catch:{ all -> 0x006c }
            com.google.android.apps.gsa.shared.an.a.j r10 = r1.f239754e     // Catch:{ all -> 0x006c }
            java.lang.String r11 = "PRE_SET_SLICE_TS"
            long r10 = r10.mo83162b(r11)     // Catch:{ all -> 0x006c }
            com.google.android.apps.gsa.shared.an.a.j r12 = r1.f239754e     // Catch:{ all -> 0x006c }
            java.lang.String r13 = "POST_SET_SLICE_TS"
            long r12 = r12.mo83162b(r13)     // Catch:{ all -> 0x006c }
            r14 = 0
            int r16 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x006a
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x006a
            int r16 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x006a
            int r16 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x006a
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x006a
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x006a
            com.google.common.o.ane r14 = com.google.common.p4552o.ane.SLICE_REGISTER_CALLBACK_MS     // Catch:{ all -> 0x006c }
            long r4 = r4 - r2
            int r2 = (int) r4     // Catch:{ all -> 0x006c }
            r0.mo44227b(r14, r2)     // Catch:{ all -> 0x006c }
            com.google.common.o.ane r2 = com.google.common.p4552o.ane.SLICE_BIND_SLICE_MS     // Catch:{ all -> 0x006c }
            long r8 = r8 - r6
            int r3 = (int) r8     // Catch:{ all -> 0x006c }
            r0.mo44227b(r2, r3)     // Catch:{ all -> 0x006c }
            com.google.common.o.ane r2 = com.google.common.p4552o.ane.SLICE_SET_SLICE_MS     // Catch:{ all -> 0x006c }
            long r12 = r12 - r10
            int r3 = (int) r12     // Catch:{ all -> 0x006c }
            r0.mo44227b(r2, r3)     // Catch:{ all -> 0x006c }
            monitor-exit(r17)
            return
        L_0x006a:
            monitor-exit(r17)
            return
        L_0x006c:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.slices.C88675e.mo44232l(com.google.android.libraries.searchbox.shared.a.a):void");
    }
}
