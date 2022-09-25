package com.google.android.libraries.search.p2904c.p2911c;

import com.google.android.libraries.search.p2904c.C37648h;
import com.google.android.libraries.search.p2904c.C37680i;
import com.google.android.libraries.search.p2904c.C37704j;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.android.libraries.search.p2904c.C38119v;
import com.google.android.libraries.search.p2904c.p2911c.p2912a.C37430g;
import com.google.android.libraries.search.p2904c.p2942m.p2948e.C37887a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.protobuf.C63088z;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.c.c.i */
/* compiled from: PG */
public final /* synthetic */ class C37439i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C37446p f99390a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f99391b;

    /* renamed from: c */
    public final /* synthetic */ int f99392c;

    public /* synthetic */ C37439i(C37446p pVar, byte[] bArr, int i) {
        this.f99390a = pVar;
        this.f99391b = bArr;
        this.f99392c = i;
    }

    public final void run() {
        int i;
        int i2;
        C37446p pVar = this.f99390a;
        byte[] bArr = this.f99391b;
        int i3 = this.f99392c;
        if (!pVar.f99412g) {
            for (C37430g b : pVar.f99414i) {
                b.mo40952b(bArr, i3);
            }
            int i4 = 0;
            while (i4 < i3) {
                int min = Math.min(pVar.f99409d, i3 - i4);
                C37445o oVar = pVar.f99413h;
                C58838bb.m90868c(min <= oVar.f99402a.length);
                byte[] bArr2 = oVar.f99402a;
                int length = bArr2.length;
                int i5 = oVar.f99403b;
                int i6 = length - i5;
                C58833ax axVar = C58836b.f156633a;
                if (i6 > min) {
                    System.arraycopy(bArr, i4, bArr2, i5, min);
                    i = i4;
                } else {
                    System.arraycopy(bArr, i4, bArr2, i5, i6);
                    C37704j jVar = (C37704j) C37819l.f100340e.createBuilder();
                    C37648h hVar = (C37648h) C37680i.f100071c.createBuilder();
                    C63088z A = C63088z.m96139A(oVar.f99402a);
                    hVar.copyOnWrite();
                    C37680i iVar = (C37680i) hVar.instance;
                    iVar.f100073a |= 1;
                    iVar.f100074b = A;
                    C37680i iVar2 = (C37680i) hVar.build();
                    jVar.copyOnWrite();
                    C37819l lVar = (C37819l) jVar.instance;
                    iVar2.getClass();
                    lVar.f100344c = iVar2;
                    lVar.f100343b = 1;
                    if (oVar.f99404c.mo56113h()) {
                        int i7 = oVar.f99405d;
                        long length2 = (long) oVar.f99402a.length;
                        i = i4;
                        i2 = i6;
                        C38119v a = ((C37887a) oVar.f99404c.mo56107c()).mo41127a(((long) i7) * length2, (((long) (i7 + 1)) * length2) - 1);
                        jVar.copyOnWrite();
                        C37819l lVar2 = (C37819l) jVar.instance;
                        a.getClass();
                        lVar2.f100345d = a;
                        lVar2.f100342a |= 4;
                    } else {
                        i = i4;
                        i2 = i6;
                    }
                    axVar = C58833ax.m90834k((C37819l) jVar.build());
                    oVar.f99405d++;
                    System.arraycopy(bArr, i2 + i, oVar.f99402a, 0, min - i2);
                }
                oVar.f99403b = (oVar.f99403b + min) % oVar.f99402a.length;
                if (axVar.mo56113h()) {
                    pVar.mo40969d((C37819l) axVar.mo56107c());
                }
                i4 = i + pVar.f99409d;
            }
            C58976aa aaVar = C58975e.f156826a;
            C59081b.m91349a(TimeUnit.MILLISECONDS, "time unit");
        }
    }
}
