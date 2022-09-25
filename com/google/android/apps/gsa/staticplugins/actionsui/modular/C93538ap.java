package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ap */
/* compiled from: PG */
public final class C93538ap implements Comparator {

    /* renamed from: a */
    private final ProviderArgument f261182a;

    /* renamed from: b */
    private List f261183b;

    public C93538ap(ProviderArgument providerArgument) {
        this.f261182a = providerArgument;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        if (com.google.android.apps.gsa.search.shared.contact.C87515c.PHONE_NUMBER.equals(r2) == false) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            com.google.android.apps.gsa.search.shared.contact.Contact r7 = (com.google.android.apps.gsa.search.shared.contact.Contact) r7
            com.google.android.apps.gsa.search.shared.contact.Contact r8 = (com.google.android.apps.gsa.search.shared.contact.Contact) r8
            java.util.List r0 = r6.f261183b
            r1 = 0
            if (r0 != 0) goto L_0x0065
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.ProviderArgument r0 = r6.f261182a
            java.util.List r0 = r0.mo81323g()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0017
            goto L_0x00c6
        L_0x0017:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r6.f261183b = r2
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0065
            java.lang.Object r2 = r0.next()
            com.google.bb.a.pn r2 = (com.google.p4152bb.p4153a.C55361pn) r2
            com.google.protobuf.bt r3 = com.google.p4152bb.p4153a.C55355ph.f145853f
            com.google.protobuf.bt r3 = com.google.protobuf.C62942bv.checkIsLite(r3)
            r2.mo58887l(r3)
            com.google.protobuf.bf r4 = r2.f169962ag
            com.google.protobuf.bs r3 = r3.f169971d
            boolean r3 = r4.mo58857o(r3)
            if (r3 == 0) goto L_0x0022
            java.util.List r3 = r6.f261183b
            com.google.protobuf.bt r4 = com.google.p4152bb.p4153a.C55355ph.f145853f
            com.google.protobuf.bt r4 = com.google.protobuf.C62942bv.checkIsLite(r4)
            r2.mo58887l(r4)
            com.google.protobuf.bf r2 = r2.f169962ag
            com.google.protobuf.bs r5 = r4.f169971d
            java.lang.Object r2 = r2.mo58854l(r5)
            if (r2 != 0) goto L_0x0059
            java.lang.Object r2 = r4.f169969b
            goto L_0x005d
        L_0x0059:
            java.lang.Object r2 = r4.mo58889c(r2)
        L_0x005d:
            com.google.bb.a.ph r2 = (com.google.p4152bb.p4153a.C55355ph) r2
            java.lang.String r2 = r2.f145856b
            r3.add(r2)
            goto L_0x0022
        L_0x0065:
            com.google.android.apps.gsa.search.shared.contact.c r0 = r7.f236350a
            com.google.android.apps.gsa.search.shared.contact.c r2 = r8.f236350a
            r3 = 1
            r4 = -1
            if (r0 == r2) goto L_0x0092
            com.google.android.apps.gsa.search.shared.contact.c r1 = com.google.android.apps.gsa.search.shared.contact.C87515c.PHONE_NUMBER
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0090
            com.google.android.apps.gsa.search.shared.contact.c r1 = com.google.android.apps.gsa.search.shared.contact.C87515c.EMAIL
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x007e
            goto L_0x0090
        L_0x007e:
            com.google.android.apps.gsa.search.shared.contact.c r1 = com.google.android.apps.gsa.search.shared.contact.C87515c.EMAIL
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008e
            com.google.android.apps.gsa.search.shared.contact.c r0 = com.google.android.apps.gsa.search.shared.contact.C87515c.PHONE_NUMBER
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00ab
        L_0x008e:
            r1 = 1
            goto L_0x00c6
        L_0x0090:
            r1 = -1
            goto L_0x00c6
        L_0x0092:
            com.google.android.apps.gsa.search.shared.contact.c r2 = com.google.android.apps.gsa.search.shared.contact.C87515c.EMAIL
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00c6
            com.google.android.apps.gsa.search.shared.contact.c r2 = com.google.android.apps.gsa.search.shared.contact.C87515c.PHONE_NUMBER
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L_0x00c6
            com.google.android.apps.gsa.search.shared.contact.c r2 = com.google.android.apps.gsa.search.shared.contact.C87515c.GAIA_ID
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00ab
            goto L_0x00c6
        L_0x00ab:
            java.util.List r0 = r6.f261183b
            java.lang.String r7 = r7.f236356g
            int r7 = r0.indexOf(r7)
            java.util.List r0 = r6.f261183b
            java.lang.String r8 = r8.f236356g
            int r8 = r0.indexOf(r8)
            if (r7 == r4) goto L_0x008e
            if (r8 == r4) goto L_0x00c2
            int r4 = r7 - r8
            goto L_0x00c5
        L_0x00c2:
            if (r7 != r4) goto L_0x00c5
            goto L_0x008e
        L_0x00c5:
            return r4
        L_0x00c6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.modular.C93538ap.compare(java.lang.Object, java.lang.Object):int");
    }
}
