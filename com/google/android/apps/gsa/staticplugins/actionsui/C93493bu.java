package com.google.android.apps.gsa.staticplugins.actionsui;

import com.google.android.apps.gsa.search.shared.actions.core.HelpAction;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4522b.C58662ni;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.bu */
/* compiled from: PG */
public final class C93493bu {

    /* renamed from: g */
    private static final SimpleDateFormat f260935g = new SimpleDateFormat("EEEE");

    /* renamed from: h */
    private static final SimpleDateFormat f260936h = new SimpleDateFormat("MMMM");

    /* renamed from: i */
    private static final SimpleDateFormat f260937i = new SimpleDateFormat("dd");

    /* renamed from: j */
    private static final SimpleDateFormat f260938j = new SimpleDateFormat("HH");

    /* renamed from: k */
    private static final SimpleDateFormat f260939k = new SimpleDateFormat("KK");

    /* renamed from: l */
    private static final SimpleDateFormat f260940l = new SimpleDateFormat("mm");

    /* renamed from: a */
    public C93492bt f260941a;

    /* renamed from: b */
    public boolean f260942b;

    /* renamed from: c */
    public String f260943c;

    /* renamed from: d */
    public String f260944d;

    /* renamed from: e */
    public int f260945e = 0;

    /* renamed from: f */
    public List f260946f;

    /* renamed from: m */
    private final SimpleDateFormat f260947m;

    /* renamed from: n */
    private Map f260948n;

    /* renamed from: a */
    protected static String m153973a(String str, int i, String str2) {
        String replace = str2.replace("\\", "\\\\").replace("$", "\\$");
        return str.replaceAll("(?<!%)%" + (i + 1) + "(?![0-9])", replace);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r2 = (java.util.Iterator) (r4 = r13.f260948n).get(java.lang.Integer.valueOf(r2));
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0116  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87802b(com.google.p4152bb.p4153a.C54972bc r14) {
        /*
            r13 = this;
            java.lang.String r0 = r14.f144616g
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            int r2 = com.google.android.apps.gsa.search.shared.actions.core.HelpAction.m141541N(r14)
            r3 = 0
            if (r2 == 0) goto L_0x0025
            java.util.Map r4 = r13.f260948n
            if (r4 == 0) goto L_0x0025
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r4.get(r2)
            java.util.Iterator r2 = (java.util.Iterator) r2
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r2.next()
            com.google.android.apps.gsa.contacts.example.ExampleContact r2 = (com.google.android.apps.gsa.contacts.example.ExampleContact) r2
            goto L_0x0026
        L_0x0025:
            r2 = r3
        L_0x0026:
            int r4 = r14.f144611a
            r5 = r4 & 32
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L_0x0039
            com.google.android.apps.gsa.staticplugins.actionsui.bt r1 = r13.f260941a
            java.lang.String r4 = r14.f144619k
            r1.mo87756C(r4)
            goto L_0x012b
        L_0x0039:
            r5 = r4 & 16
            if (r5 == 0) goto L_0x0091
            com.google.bb.a.bq r1 = r14.f144618j
            if (r1 != 0) goto L_0x0043
            com.google.bb.a.bq r1 = com.google.p4152bb.p4153a.C54986bq.f144675d
        L_0x0043:
            int r1 = r1.f144677a
            r1 = r1 & r9
            if (r1 == 0) goto L_0x0077
            com.google.bb.a.bq r1 = r14.f144618j
            if (r1 != 0) goto L_0x004e
            com.google.bb.a.bq r1 = com.google.p4152bb.p4153a.C54986bq.f144675d
        L_0x004e:
            int r1 = r1.f144678b
            int r1 = com.google.p4152bb.p4153a.C54985bp.m87552a(r1)
            if (r1 != 0) goto L_0x0057
            r1 = 1
        L_0x0057:
            com.google.bb.a.bb r4 = com.google.p4152bb.p4153a.C54971bb.DATE_DAY
            r4 = -1
            int r1 = r1 + r4
            if (r1 == r9) goto L_0x006b
            if (r1 == r7) goto L_0x0067
            if (r1 == r6) goto L_0x0063
            r1 = -1
            goto L_0x006e
        L_0x0063:
            r1 = 2131235025(0x7f0810d1, float:1.8086232E38)
            goto L_0x006e
        L_0x0067:
            r1 = 2131232658(0x7f080792, float:1.8081431E38)
            goto L_0x006e
        L_0x006b:
            r1 = 2131233069(0x7f08092d, float:1.8082265E38)
        L_0x006e:
            if (r1 == r4) goto L_0x012b
            com.google.android.apps.gsa.staticplugins.actionsui.bt r4 = r13.f260941a
            r4.mo87754A(r1)
            goto L_0x012b
        L_0x0077:
            com.google.bb.a.bq r1 = r14.f144618j
            if (r1 != 0) goto L_0x007e
            com.google.bb.a.bq r4 = com.google.p4152bb.p4153a.C54986bq.f144675d
            goto L_0x007f
        L_0x007e:
            r4 = r1
        L_0x007f:
            int r4 = r4.f144677a
            r4 = r4 & r7
            if (r4 == 0) goto L_0x012b
            com.google.android.apps.gsa.staticplugins.actionsui.bt r4 = r13.f260941a
            if (r1 != 0) goto L_0x008a
            com.google.bb.a.bq r1 = com.google.p4152bb.p4153a.C54986bq.f144675d
        L_0x008a:
            java.lang.String r1 = r1.f144679c
            r4.mo87760x(r1)
            goto L_0x012b
        L_0x0091:
            if (r2 == 0) goto L_0x009a
            com.google.android.apps.gsa.staticplugins.actionsui.bt r1 = r13.f260941a
            r1.mo87761y(r2)
            goto L_0x012b
        L_0x009a:
            r5 = r4 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x009f
            goto L_0x00a9
        L_0x009f:
            r5 = r4 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x00a9
            r4 = r4 & 64
            if (r4 != 0) goto L_0x00a9
            goto L_0x012b
        L_0x00a9:
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r3.setTime(r1)
            int r4 = r14.f144611a
            r5 = r4 & 128(0x80, float:1.794E-43)
            r10 = 5
            if (r5 == 0) goto L_0x00c0
            r4 = 13
            int r5 = r14.f144621m
            r3.add(r4, r5)
        L_0x00be:
            r4 = 0
            goto L_0x00ca
        L_0x00c0:
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x00be
            int r4 = r14.f144622n
            r3.add(r10, r4)
            r4 = 1
        L_0x00ca:
            int r5 = r14.f144611a
            r5 = r5 & 64
            if (r5 == 0) goto L_0x00f8
            com.google.bb.a.r r5 = r14.f144620l
            if (r5 != 0) goto L_0x00d6
            com.google.bb.a.r r5 = com.google.p4152bb.p4153a.C55401r.f145976e
        L_0x00d6:
            r11 = 11
            int r12 = r5.f145979b
            r3.set(r11, r12)
            r11 = 12
            int r5 = r5.f145980c
            r3.set(r11, r5)
            int r5 = r14.f144611a
            r5 = r5 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x00eb
            goto L_0x00f8
        L_0x00eb:
            java.util.Date r5 = r3.getTime()
            boolean r1 = r5.before(r1)
            if (r1 == 0) goto L_0x00f8
            r3.add(r10, r9)
        L_0x00f8:
            if (r4 == 0) goto L_0x0116
            java.util.Date r1 = r3.getTime()
            com.google.android.apps.gsa.staticplugins.actionsui.bt r4 = r13.f260941a
            java.text.SimpleDateFormat r5 = f260935g
            java.lang.String r5 = r5.format(r1)
            java.text.SimpleDateFormat r10 = f260937i
            java.lang.String r10 = r10.format(r1)
            java.text.SimpleDateFormat r11 = f260936h
            java.lang.String r1 = r11.format(r1)
            r4.mo87762z(r5, r10, r1)
            goto L_0x012b
        L_0x0116:
            java.util.Date r1 = r3.getTime()
            com.google.android.apps.gsa.staticplugins.actionsui.bt r4 = r13.f260941a
            java.text.SimpleDateFormat r5 = r13.f260947m
            java.lang.String r5 = r5.format(r1)
            java.text.SimpleDateFormat r10 = f260940l
            java.lang.String r1 = r10.format(r1)
            r4.mo87755B(r5, r1)
        L_0x012b:
            com.google.protobuf.ch r1 = r14.f144617h
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x01aa
            com.google.android.apps.gsa.staticplugins.actionsui.bt r1 = r13.f260941a
            com.google.protobuf.cj r4 = new com.google.protobuf.cj
            com.google.protobuf.ch r14 = r14.f144617h
            com.google.protobuf.ci r5 = com.google.p4152bb.p4153a.C54972bc.f144607i
            r4.<init>(r14, r5)
            java.util.Iterator r14 = r4.iterator()
        L_0x0142:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x019e
            java.lang.Object r4 = r14.next()
            com.google.bb.a.bb r4 = (com.google.p4152bb.p4153a.C54971bb) r4
            com.google.bb.a.bb r5 = com.google.p4152bb.p4153a.C54971bb.DATE_DAY
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x018b
            if (r4 == r9) goto L_0x017a
            if (r4 == r7) goto L_0x0169
            if (r4 == r6) goto L_0x0160
            r5 = 4
            if (r4 == r5) goto L_0x0160
            goto L_0x019b
        L_0x0160:
            if (r2 == 0) goto L_0x019b
            java.lang.String r4 = r2.b
            java.lang.String r0 = m153973a(r0, r8, r4)
            goto L_0x019b
        L_0x0169:
            if (r3 == 0) goto L_0x019b
            java.text.SimpleDateFormat r4 = f260935g
            java.util.Date r5 = r3.getTime()
            java.lang.String r4 = r4.format(r5)
            java.lang.String r0 = m153973a(r0, r8, r4)
            goto L_0x019b
        L_0x017a:
            if (r3 == 0) goto L_0x019b
            java.text.SimpleDateFormat r4 = f260936h
            java.util.Date r5 = r3.getTime()
            java.lang.String r4 = r4.format(r5)
            java.lang.String r0 = m153973a(r0, r8, r4)
            goto L_0x019b
        L_0x018b:
            if (r3 == 0) goto L_0x019b
            java.text.SimpleDateFormat r4 = f260937i
            java.util.Date r5 = r3.getTime()
            java.lang.String r4 = r4.format(r5)
            java.lang.String r0 = m153973a(r0, r8, r4)
        L_0x019b:
            int r8 = r8 + 1
            goto L_0x0142
        L_0x019e:
            java.lang.String r14 = "%%"
            java.lang.String r2 = "%"
            java.lang.String r14 = r0.replaceAll(r14, r2)
            r1.mo87757a(r14)
            return
        L_0x01aa:
            com.google.android.apps.gsa.staticplugins.actionsui.bt r14 = r13.f260941a
            r14.mo87757a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actionsui.C93493bu.mo87802b(com.google.bb.a.bc):void");
    }

    public C93493bu(HelpAction helpAction, boolean z) {
        SimpleDateFormat simpleDateFormat;
        if (z) {
            simpleDateFormat = f260938j;
        } else {
            simpleDateFormat = f260939k;
        }
        this.f260947m = simpleDateFormat;
        List list = helpAction.f236046g;
        if (list == null) {
            String str = helpAction.f236045f;
            String str2 = helpAction.f236048i;
            str2.getClass();
            this.f260942b = true;
            this.f260943c = str;
            this.f260944d = str2;
            return;
        }
        String str3 = helpAction.f236045f;
        Map map = helpAction.f236047h;
        map.getClass();
        this.f260942b = false;
        this.f260943c = str3;
        this.f260946f = list;
        if (!map.isEmpty()) {
            HashMap j = C58662ni.m90351j(map.size());
            for (Integer num : map.keySet()) {
                j.put(num, C58570jy.m90159k((Iterable) map.get(num)));
            }
            this.f260948n = j;
        }
    }
}
