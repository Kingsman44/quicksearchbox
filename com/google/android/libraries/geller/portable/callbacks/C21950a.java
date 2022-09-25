package com.google.android.libraries.geller.portable.callbacks;

import com.google.android.libraries.geller.portable.p1821a.C21905ax;
import com.google.android.libraries.geller.portable.p1821a.C21907az;
import com.google.android.libraries.geller.portable.p1821a.C21910bb;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4874ap.p4875a.p4876a.C63663b;
import com.google.protos.p4874ap.p4875a.p4876a.C63665d;
import com.google.protos.p4874ap.p4875a.p4876a.C63669h;
import com.google.protos.p4985f.p5030q.p5032b.C65027al;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p4985f.p5030q.p5032b.C65061h;
import com.google.protos.p4985f.p5030q.p5032b.C65063j;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65137b;
import com.google.protos.p5129p.p5131b.C65746ad;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.geller.portable.callbacks.a */
/* compiled from: PG */
public final class C21950a implements GellerLoggingCallback {

    /* renamed from: a */
    private final C21907az f60553a;

    public C21950a(C21907az azVar) {
        this.f60553a = azVar;
    }

    /* renamed from: j */
    private static boolean m41099j(String str) {
        return str.equals(C62722b.OK.name());
    }

    /* renamed from: a */
    public final void mo27233a(C65753ak akVar, String str, long j) {
        C21907az azVar = this.f60553a;
        String name = akVar.name();
        boolean j2 = m41099j(str);
        C21910bb bbVar = (C21910bb) azVar;
        C21905ax axVar = bbVar.f60483a;
        String str2 = bbVar.f60484b;
        String str3 = bbVar.f60485c;
        Boolean valueOf = Boolean.valueOf(j2);
        ((C19567d) axVar.f60460o.mo6453a()).mo24822a(1, str2, str3, name, valueOf);
        C21905ax axVar2 = bbVar.f60483a;
        ((C19569f) axVar2.f60461p.mo6453a()).mo24824b((double) j, bbVar.f60484b, bbVar.f60485c, name, valueOf);
    }

    /* renamed from: b */
    public final void mo27234b(C63665d dVar) {
        String str;
        C63665d dVar2 = dVar;
        C21907az azVar = this.f60553a;
        char c = 1;
        char c2 = 0;
        boolean z = dVar2.f172149b.size() > 0;
        for (C63669h hVar : dVar2.f172149b) {
            boolean z2 = hVar.f172163d;
            C65753ak b = C65753ak.m96797b(hVar.f172160a);
            if (b == null) {
                b = C65753ak.UNKNOWN;
            }
            String name = b.name();
            int a = C63663b.m96271a(hVar.f172161b);
            if (a != 0) {
                switch (a) {
                    case 1:
                        break;
                    case 2:
                        str = "DELETION_REASON_WIPEOUT_DURATION";
                        continue;
                    case 3:
                        str = "DELETION_REASON_OUTDATED_DATA";
                        continue;
                    case 4:
                        str = "DELETION_REASON_GC_LIFE";
                        continue;
                    case 5:
                        str = "DELETION_REASON_GC_LIMIT";
                        continue;
                    case 6:
                        str = "DELETION_REASON_DATA_SIZE_LIMIT";
                        continue;
                    default:
                        str = "DELETION_REASON_NOT_IN_CONFIG";
                        continue;
                }
            }
            str = "DELETION_REASON_UNKNOWN";
            z &= z2;
            C21910bb bbVar = (C21910bb) azVar;
            C21905ax axVar = bbVar.f60483a;
            int i = hVar.f172162c;
            Object[] objArr = new Object[4];
            objArr[c2] = bbVar.f60484b;
            objArr[c] = name;
            objArr[2] = str;
            Boolean valueOf = Boolean.valueOf(z2);
            objArr[3] = valueOf;
            ((C19569f) axVar.f60438L.mo6453a()).mo24824b((double) i, objArr);
            ((C19569f) bbVar.f60483a.f60439M.mo6453a()).mo24824b((double) hVar.f172162c, bbVar.f60484b, bbVar.f60485c, str, valueOf);
            ((C19567d) bbVar.f60483a.f60436J.mo6453a()).mo24822a(1, bbVar.f60484b, bbVar.f60485c, name, valueOf);
            c = 1;
            c2 = 0;
        }
        C21910bb bbVar2 = (C21910bb) azVar;
        ((C19567d) bbVar2.f60483a.f60435I.mo6453a()).mo24822a(1, bbVar2.f60484b, bbVar2.f60485c, Boolean.valueOf(z));
        ((C19569f) bbVar2.f60483a.f60437K.mo6453a()).mo24824b((double) dVar2.f172150c, bbVar2.f60484b, bbVar2.f60485c);
    }

    /* renamed from: c */
    public final void mo27235c() {
        C21910bb bbVar = (C21910bb) this.f60553a;
        C21905ax axVar = bbVar.f60483a;
        ((C19567d) axVar.f60434H.mo6453a()).mo24822a(1, bbVar.f60484b, bbVar.f60485c);
    }

    /* renamed from: d */
    public final void mo27236d(C65063j jVar) {
        C21907az azVar = this.f60553a;
        for (C65061h hVar : jVar.f176195b) {
            String str = hVar.f176188b;
            C21910bb bbVar = (C21910bb) azVar;
            C21905ax axVar = bbVar.f60483a;
            int i = hVar.f176190d;
            ((C19569f) axVar.f60447b.mo6453a()).mo24824b((double) i, bbVar.f60484b, bbVar.f60485c, str);
            C21905ax axVar2 = bbVar.f60483a;
            int i2 = hVar.f176191e;
            ((C19569f) axVar2.f60448c.mo6453a()).mo24824b((double) i2, bbVar.f60484b, bbVar.f60485c, str);
            C21905ax axVar3 = bbVar.f60483a;
            long j = hVar.f176189c;
            ((C19569f) axVar3.f60449d.mo6453a()).mo24824b((double) j, bbVar.f60484b, bbVar.f60485c, str);
            C21905ax axVar4 = bbVar.f60483a;
            ((C19567d) axVar4.f60452g.mo6453a()).mo24822a(1, bbVar.f60484b, bbVar.f60485c, str);
        }
        C65027al alVar = jVar.f176196c;
        if (alVar == null) {
            alVar = C65027al.f176090d;
        }
        C21910bb bbVar2 = (C21910bb) azVar;
        C21905ax axVar5 = bbVar2.f60483a;
        long j2 = alVar.f176093b;
        ((C19569f) axVar5.f60453h.mo6453a()).mo24824b((double) j2, bbVar2.f60484b, bbVar2.f60485c);
        C21905ax axVar6 = bbVar2.f60483a;
        int i3 = alVar.f176094c;
        ((C19567d) axVar6.f60454i.mo6453a()).mo24822a((long) i3, bbVar2.f60484b, bbVar2.f60485c);
        long j3 = 0;
        for (C65061h hVar2 : jVar.f176195b) {
            j3 += hVar2.f176189c;
        }
        C21905ax axVar7 = bbVar2.f60483a;
        ((C19569f) axVar7.f60451f.mo6453a()).mo24824b((double) j3, bbVar2.f60484b, bbVar2.f60485c);
    }

    /* renamed from: e */
    public final void mo27237e(String str) {
        C21910bb bbVar = (C21910bb) this.f60553a;
        C21905ax axVar = bbVar.f60483a;
        ((C19567d) axVar.f60440N.mo6453a()).mo24822a(1, bbVar.f60484b, bbVar.f60485c, str);
    }

    /* renamed from: f */
    public final void mo27238f(C65753ak akVar, boolean z, long j) {
        C21907az azVar = this.f60553a;
        String name = akVar.name();
        C21910bb bbVar = (C21910bb) azVar;
        C21905ax axVar = bbVar.f60483a;
        String str = bbVar.f60484b;
        String str2 = bbVar.f60485c;
        Boolean valueOf = Boolean.valueOf(z);
        ((C19567d) axVar.f60463r.mo6453a()).mo24822a(1, str, str2, name, valueOf);
        C21905ax axVar2 = bbVar.f60483a;
        ((C19569f) axVar2.f60464s.mo6453a()).mo24824b((double) j, bbVar.f60484b, bbVar.f60485c, name, valueOf);
    }

    /* renamed from: g */
    public final void mo27239g(C65753ak akVar) {
        C21907az azVar = this.f60553a;
        String name = akVar.name();
        C21910bb bbVar = (C21910bb) azVar;
        C21905ax axVar = bbVar.f60483a;
        ((C19567d) axVar.f60462q.mo6453a()).mo24822a(1, bbVar.f60484b, bbVar.f60485c, name);
    }

    /* renamed from: h */
    public final void mo27240h(C65753ak akVar, String str, long j) {
        C21907az azVar = this.f60553a;
        String name = akVar.name();
        boolean j2 = m41099j(str);
        C21910bb bbVar = (C21910bb) azVar;
        C21905ax axVar = bbVar.f60483a;
        String str2 = bbVar.f60484b;
        String str3 = bbVar.f60485c;
        Boolean valueOf = Boolean.valueOf(j2);
        ((C19567d) axVar.f60455j.mo6453a()).mo24822a(1, str2, str3, name, valueOf);
        C21905ax axVar2 = bbVar.f60483a;
        ((C19569f) axVar2.f60456k.mo6453a()).mo24824b((double) j, bbVar.f60484b, bbVar.f60485c, name, valueOf);
    }

    /* renamed from: i */
    public final void mo27241i(C65753ak akVar, C65033ar arVar, long j) {
        C65137b bVar = arVar.f176114b;
        if (bVar == null) {
            bVar = C65137b.f176302b;
        }
        int a = C65746ad.m96794a(bVar.f176304a);
        boolean z = a != 0 && a == 2;
        C21907az azVar = this.f60553a;
        String name = akVar.name();
        C21910bb bbVar = (C21910bb) azVar;
        C21905ax axVar = bbVar.f60483a;
        String str = bbVar.f60484b;
        String str2 = bbVar.f60485c;
        Boolean valueOf = Boolean.valueOf(z);
        ((C19567d) axVar.f60458m.mo6453a()).mo24822a(1, str, str2, name, valueOf);
        C21907az azVar2 = this.f60553a;
        String name2 = akVar.name();
        C21910bb bbVar2 = (C21910bb) azVar2;
        ((C19569f) bbVar2.f60483a.f60457l.mo6453a()).mo24824b((double) j, bbVar2.f60484b, bbVar2.f60485c, name2, valueOf);
        C21907az azVar3 = this.f60553a;
        String name3 = akVar.name();
        int serializedSize = arVar.getSerializedSize();
        C21910bb bbVar3 = (C21910bb) azVar3;
        ((C19569f) bbVar3.f60483a.f60459n.mo6453a()).mo24824b((double) ((long) serializedSize), bbVar3.f60484b, bbVar3.f60485c, name3);
    }

    public final void logCorpusQuotaExceeded(String str) {
        C21910bb bbVar = (C21910bb) this.f60553a;
        C21905ax axVar = bbVar.f60483a;
        ((C19567d) axVar.f60450e.mo6453a()).mo24822a(1, bbVar.f60484b, bbVar.f60485c, str);
    }
}
