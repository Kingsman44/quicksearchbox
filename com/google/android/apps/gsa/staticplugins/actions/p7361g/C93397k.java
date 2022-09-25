package com.google.android.apps.gsa.staticplugins.actions.p7361g;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.gms.appdatasearch.Section;
import com.google.common.p4525e.C58956d;
import com.google.common.p4525e.C58957e;
import com.google.common.p4525e.C58958f;
import com.google.common.p4525e.C58959g;
import com.google.p4152bb.p4153a.C55040dq;
import com.google.p4152bb.p4153a.C55046dw;
import com.google.p4152bb.p4153a.C55047dx;
import com.google.p4152bb.p4153a.C55340ot;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.g.k */
/* compiled from: PG */
public final class C93397k {

    /* renamed from: a */
    public static final Section f260493a = new Section("body");

    /* renamed from: b */
    public static final Section f260494b = new Section("type");

    /* renamed from: c */
    static final Section f260495c = new Section("otherPartyAddress");

    /* renamed from: d */
    static final Section f260496d = new Section("receivedTime");

    /* renamed from: e */
    public static final Section f260497e = new Section("threadId");

    /* renamed from: f */
    public static final String f260498f = "1";

    /* renamed from: g */
    static final C58959g f260499g;

    /* renamed from: h */
    public final C86124t f260500h;

    static {
        C58958f fVar = new C58958f();
        fVar.mo56221b('\\', "\\\\");
        fVar.mo56221b('\"', "\\\"");
        f260499g = fVar.mo56220a();
    }

    public C93397k(C86124t tVar) {
        this.f260500h = tVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.p4152bb.p4153a.C55047dx m153649a(com.google.p4152bb.p4153a.C55047dx r8) {
        /*
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.bb.a.dm r8 = (com.google.p4152bb.p4153a.C55036dm) r8
            com.google.protobuf.bv r0 = r8.instance
            com.google.bb.a.dx r0 = (com.google.p4152bb.p4153a.C55047dx) r0
            com.google.protobuf.cq r0 = r0.f144824b
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.bb.a.dx r1 = (com.google.p4152bb.p4153a.C55047dx) r1
            com.google.protobuf.cq r2 = com.google.p4152bb.p4153a.C55047dx.emptyProtobufList()
            r1.f144824b = r2
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.bb.a.dx r1 = (com.google.p4152bb.p4153a.C55047dx) r1
            com.google.protobuf.cq r2 = com.google.p4152bb.p4153a.C55047dx.emptyProtobufList()
            r1.f144830h = r2
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r1 = r0.next()
            com.google.bb.a.do r1 = (com.google.p4152bb.p4153a.C55038do) r1
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.bb.a.dn r1 = (com.google.p4152bb.p4153a.C55037dn) r1
            com.google.protobuf.bv r2 = r1.instance
            com.google.bb.a.do r2 = (com.google.p4152bb.p4153a.C55038do) r2
            java.lang.String r2 = r2.f144803c
            int r3 = r2.hashCode()
            r4 = 4
            r5 = 3
            r6 = 1
            r7 = 2
            switch(r3) {
                case -767961010: goto L_0x007a;
                case 3029410: goto L_0x0070;
                case 3575610: goto L_0x0066;
                case 98362718: goto L_0x005c;
                case 1473625285: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0084
        L_0x0052:
            java.lang.String r3 = "threadId"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0084
            r3 = 4
            goto L_0x0085
        L_0x005c:
            java.lang.String r3 = "otherPartyAddress"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0084
            r3 = 0
            goto L_0x0085
        L_0x0066:
            java.lang.String r3 = "type"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0084
            r3 = 2
            goto L_0x0085
        L_0x0070:
            java.lang.String r3 = "body"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0084
            r3 = 1
            goto L_0x0085
        L_0x007a:
            java.lang.String r3 = "receivedTime"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0084
            r3 = 3
            goto L_0x0085
        L_0x0084:
            r3 = -1
        L_0x0085:
            if (r3 == 0) goto L_0x009c
            if (r3 == r6) goto L_0x0099
            if (r3 == r7) goto L_0x0096
            if (r3 == r5) goto L_0x0093
            if (r3 == r4) goto L_0x0090
            goto L_0x009e
        L_0x0090:
            java.lang.String r2 = "isPartOf_id"
            goto L_0x009e
        L_0x0093:
            java.lang.String r2 = "dateReceived"
            goto L_0x009e
        L_0x0096:
            java.lang.String r2 = "labels"
            goto L_0x009e
        L_0x0099:
            java.lang.String r2 = "text"
            goto L_0x009e
        L_0x009c:
            java.lang.String r2 = "sender_telephone"
        L_0x009e:
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.bb.a.do r3 = (com.google.p4152bb.p4153a.C55038do) r3
            r2.getClass()
            int r4 = r3.f144801a
            r4 = r4 | r7
            r3.f144801a = r4
            r3.f144803c = r2
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.bb.a.do r2 = (com.google.p4152bb.p4153a.C55038do) r2
            int r3 = r2.f144801a
            r3 = r3 & -2
            r2.f144801a = r3
            com.google.bb.a.do r3 = com.google.p4152bb.p4153a.C55038do.f144799f
            java.lang.String r3 = r3.f144802b
            r2.f144802b = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.bb.a.do r1 = (com.google.p4152bb.p4153a.C55038do) r1
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.bb.a.dx r2 = (com.google.p4152bb.p4153a.C55047dx) r2
            r1.getClass()
            r2.mo54176a()
            com.google.protobuf.cq r2 = r2.f144824b
            r2.add(r1)
            goto L_0x002e
        L_0x00dc:
            com.google.protobuf.bv r8 = r8.build()
            com.google.bb.a.dx r8 = (com.google.p4152bb.p4153a.C55047dx) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7361g.C93397k.m153649a(com.google.bb.a.dx):com.google.bb.a.dx");
    }

    /* renamed from: b */
    public static String m153650b(C55047dx dxVar) {
        String str;
        Object obj;
        int a;
        Iterator it = dxVar.f144830h.iterator();
        while (true) {
            str = "(IS labels \"inbox\")";
            if (!it.hasNext()) {
                break;
            }
            C55040dq dqVar = (C55040dq) it.next();
            if ("unread".equals(dqVar.f144808a) && (a = C55046dw.m87567a(dqVar.f144809b)) != 0 && a == 2) {
                str = String.format("(AND %s %s)", new Object[]{str, "(IS labels \"unread\")"});
                break;
            }
        }
        C62940bt r0 = C62942bv.checkIsLite(C55340ot.f145800f);
        dxVar.mo58887l(r0);
        Object l = dxVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C55340ot otVar = (C55340ot) obj;
        if (otVar.f145803b.size() <= 0) {
            return str;
        }
        C58959g gVar = f260499g;
        String str2 = (String) otVar.f145803b.get(0);
        int length = str2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str2.charAt(i);
            char[][] cArr = ((C58957e) gVar).f156815a;
            if (charAt < cArr.length && cArr[charAt] != null) {
                str2 = ((C58956d) gVar).mo56219d(str2, i);
                break;
            }
            i++;
        }
        return String.format("(AND %s %s)", new Object[]{str, String.format("(QT \"%s\" sender_name)", new Object[]{str2})});
    }

    /* renamed from: c */
    public final String mo87661c() {
        if (this.f260500h.mo79746e(C90014bt.f247755nD)) {
            return "sender_telephone";
        }
        return f260495c.f387556a;
    }

    /* renamed from: d */
    public final String mo87662d() {
        if (this.f260500h.mo79746e(C90014bt.f247755nD)) {
            return "dateReceived";
        }
        return f260496d.f387556a;
    }
}
