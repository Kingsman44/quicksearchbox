package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21236af;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.android.libraries.elements.p1714d.C20873cx;
import com.google.android.libraries.elements.p1714d.C20929dy;
import com.google.android.libraries.elements.p1714d.C21065ea;
import com.google.p370af.C7490c;
import com.google.protobuf.MessageLite;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64129n;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64131p;
import com.google.protos.youtube.elements.C66240f;
import com.google.protos.youtube.elements.C66250h;
import com.google.protos.youtube.elements.C66252j;
import com.google.protos.youtube.elements.C66254l;
import com.google.protos.youtube.elements.C66256n;
import com.google.protos.youtube.elements.C66258p;
import com.youtube.p5283a.p5284a.C68073bi;
import com.youtube.p5283a.p5284a.C68074bj;
import com.youtube.p5283a.p5284a.C68085g;
import java.util.List;
import java.util.Map;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.a.b.l */
/* compiled from: PG */
public final class C39925l implements C20873cx {

    /* renamed from: a */
    private final C21313t f104960a;

    /* renamed from: b */
    private final C21296cl f104961b;

    /* renamed from: c */
    private final C21259bb f104962c;

    /* renamed from: d */
    private final Map f104963d;

    /* renamed from: e */
    private final C21236af f104964e;

    /* renamed from: f */
    private final C39927n f104965f;

    public C39925l(C39927n nVar, C21313t tVar, C21296cl clVar, C21259bb bbVar, Map map, C21236af afVar) {
        this.f104960a = tVar;
        this.f104961b = clVar;
        this.f104962c = bbVar;
        this.f104963d = map;
        this.f104964e = afVar;
        this.f104965f = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C6405o mo25998a(C6411u uVar, C21319z zVar, MessageLite messageLite, String str, List list) {
        String str2;
        int i;
        int i2;
        float f;
        int i3;
        long j;
        long j2;
        int i4;
        int i5;
        int i6;
        C64131p pVar = (C64131p) messageLite;
        Instant ofEpochMilli = Instant.ofEpochMilli(pVar.f173392b);
        if ((pVar.f173391a & 2) != 0) {
            C39927n nVar = this.f104965f;
            Instant now = Instant.now();
            C64129n nVar2 = pVar.f173393c;
            if (nVar2 == null) {
                nVar2 = C64129n.f173378i;
            }
            str2 = nVar.mo42085b(now, ofEpochMilli, nVar2);
        } else {
            str2 = this.f104965f.mo42084a(Instant.now(), ofEpochMilli);
        }
        C66256n nVar3 = pVar.f173394d;
        if (nVar3 == null) {
            nVar3 = C66256n.f180148o;
        }
        C7490c cVar = new C7490c(1024);
        int i7 = pVar.f173395e;
        float f2 = pVar.f173396f;
        int a = C66258p.m96843a(pVar.f173397g);
        int i8 = a == 0 ? 1 : a;
        int a2 = C66252j.m96841a(pVar.f173398h);
        if (a2 == 0) {
            a2 = 1;
        }
        if (nVar3 != null) {
            long length = (long) str2.length();
            int b = (nVar3.f180150a & 4) != 0 ? cVar.mo16894b(nVar3.f180153d) : 0;
            float f3 = nVar3.f180155f;
            long j3 = (long) nVar3.f180156g;
            if ((nVar3.f180150a & 256) != 0) {
                int a3 = C66254l.m96842a(nVar3.f180157h);
                if (a3 == 0) {
                    a3 = 1;
                }
                i3 = a3 - 1;
            } else {
                i3 = 0;
            }
            float f4 = nVar3.f180159j;
            if (nVar3.f180151b == 7) {
                j = j3;
                j2 = (long) ((Integer) nVar3.f180152c).intValue();
            } else {
                j = j3;
                j2 = 0;
            }
            long j4 = j2;
            if (nVar3.f180151b == 8) {
                int a4 = C66250h.m96840a(((Integer) nVar3.f180152c).intValue());
                if (a4 == 0) {
                    a4 = 1;
                }
                i4 = a4 - 1;
            } else {
                i4 = 0;
            }
            boolean z = nVar3.f180158i;
            int i9 = nVar3.f180150a;
            if ((i9 & 16384) != 0) {
                int a5 = C66254l.m96842a(nVar3.f180160k);
                if (a5 == 0) {
                    a5 = 1;
                }
                i5 = a5 - 1;
            } else {
                i5 = 0;
            }
            if ((32768 & i9) != 0) {
                int a6 = C66240f.m96839a(nVar3.f180161l);
                if (a6 == 0) {
                    a6 = 1;
                }
                i6 = a6 - 1;
            } else {
                i6 = 0;
            }
            int b2 = (i9 & 8) != 0 ? cVar.mo16894b(nVar3.f180154e) : 0;
            int i10 = nVar3.f180162m;
            float f5 = nVar3.f180163n;
            f = f2;
            i = i7;
            int[] iArr = {C68073bi.m98348k(cVar, 0, length, b, f3, j, i3, 0, f4, j4, i4, z, i5, i6, b2, (long) i10, f5)};
            cVar = cVar;
            i2 = C68085g.m98392n(cVar, iArr);
        } else {
            f = f2;
            i = i7;
            i2 = 0;
        }
        C7490c cVar2 = cVar;
        cVar2.mo16911t(C68074bj.m98366l(cVar2, C21359t.m40380e(cVar, cVar.mo16894b(str2), f, i8 - 1, a2 - 1, 0, i2, 0, false, 0, 0, 0), (long) i, 0, 0));
        cVar2.mo16902j();
        C68074bj k = C68074bj.m98365k(cVar2.f24688a);
        C20929dy b3 = C21065ea.m39570b(uVar);
        b3.mo26059d(this.f104960a);
        b3.mo26061f(this.f104964e.mo26208a());
        b3.mo26057W(this.f104961b);
        b3.mo26063h(this.f104962c);
        b3.mo26060e(zVar);
        b3.mo26065j(k);
        b3.mo26064i(this.f104963d);
        return b3;
    }
}
