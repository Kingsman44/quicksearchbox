package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9815a.p9816a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9815a.C129419b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9815a.C129420c;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.a.a.g */
/* compiled from: PG */
public final class C129418g implements C46851e {

    /* renamed from: a */
    public static final Duration f355362a = Duration.ofMillis(150);

    /* renamed from: b */
    private final Set f355363b;

    /* renamed from: c */
    private final C71422aw f355364c;

    /* renamed from: d */
    private final boolean f355365d;

    public C129418g(Set set, C71422aw awVar, boolean z) {
        C69664n.m101061g(set, "chipsContent");
        C69664n.m101061g(awVar, "backgroundScope");
        this.f355363b = set;
        this.f355364c = awVar;
        this.f355365d = z;
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        int i = C129420c.f355367a;
        C46690ah ahVar = C129419b.f355366a;
        C69664n.m101060f(ahVar, "InputChipsDataService.INPUT_CHIPS_CONTENT_KEY");
        return ahVar;
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C58976aa aaVar = C58975e.f156826a;
        return C71663i.m104692e(this.f355364c, (C71424ay) null, new C129417f(this, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo109030c(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9815a.p9816a.C129415d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.a.a.d r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9815a.p9816a.C129415d) r0
            int r1 = r0.f355358e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f355358e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.a.a.d r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.a.a.d
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f355356c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f355358e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r1 = r0.f355355b
            java.lang.Object r0 = r0.f355354a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0080
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0033:
            p5462h.C69714l.m101134b(r10)
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.q r10 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65559q.f178162b
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.j r10 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65552j) r10
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)
            java.util.Set r2 = r9.f355363b
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = p5462h.p5463a.C69540x.m100804k(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x0054:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0071
            java.lang.Object r5 = r2.next()
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.a.a r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9815a.C129411a) r5
            kotlinx.coroutines.aw r6 = r9.f355364c
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.a.a.c r7 = new com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.a.a.c
            r8 = 0
            r7.<init>(r5, r8)
            r5 = 3
            kotlinx.coroutines.be r5 = kotlinx.coroutines.C71803m.m105042c(r6, r8, r8, r7, r5)
            r4.add(r5)
            goto L_0x0054
        L_0x0071:
            r0.f355354a = r9
            r0.f355355b = r10
            r0.f355358e = r3
            java.lang.Object r0 = kotlinx.coroutines.C71760h.m104949a(r4, r0)
            if (r0 == r1) goto L_0x0118
            r1 = r10
            r10 = r0
            r0 = r9
        L_0x0080:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = p5462h.p5463a.C69540x.m100828J(r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x008f:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r10.next()
            r4 = r3
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.p r4 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65558p) r4
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.p r5 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65558p.f178153h
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r5)
            if (r5 != 0) goto L_0x008f
            int r4 = r4.f178155a
            r5 = r4 & 1
            if (r5 == 0) goto L_0x008f
            r5 = r4 & 2
            if (r5 == 0) goto L_0x00af
            goto L_0x00b3
        L_0x00af:
            r5 = r4 & 4
            if (r5 == 0) goto L_0x008f
        L_0x00b3:
            r4 = r4 & 16
            if (r4 == 0) goto L_0x008f
            r2.add(r3)
            goto L_0x008f
        L_0x00bb:
            int r10 = r2.size()
            r3 = 2
            if (r10 >= r3) goto L_0x00c8
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.a.a.g r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9815a.p9816a.C129418g) r0
            boolean r10 = r0.f355365d
            if (r10 == 0) goto L_0x010c
        L_0x00c8:
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00d6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00f7
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.p r4 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65558p) r4
            int r4 = r4.f178156b
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.o r4 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65557o.m96724a(r4)
            if (r4 != 0) goto L_0x00ed
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.o r4 = com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65557o.UNDEFINED
        L_0x00ed:
            boolean r4 = r10.add(r4)
            if (r4 == 0) goto L_0x00d6
            r0.add(r3)
            goto L_0x00d6
        L_0x00f7:
            j$.util.stream.Stream r10 = p3186j$.util.Collection.EL.stream(r0)
            r2 = 3
            j$.util.stream.Stream r10 = r10.limit(r2)
            com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.a.a.e r0 = new com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.a.a.e
            r2 = r1
            com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.j r2 = (com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65552j) r2
            r0.<init>(r2)
            r10.forEach(r0)
        L_0x010c:
            com.google.protobuf.bn r1 = (com.google.protobuf.C62934bn) r1
            com.google.protobuf.bv r10 = r1.build()
            java.lang.String r0 = "chipGroupBuilder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            return r10
        L_0x0118:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9815a.p9816a.C129418g.mo109030c(h.c.g):java.lang.Object");
    }
}
