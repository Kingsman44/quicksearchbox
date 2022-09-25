package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9439a.C125528f;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125649ab;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125666as;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125687t;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126323bd;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p5462h.C69613f;
import p5462h.C69685i;
import p5462h.C69747m;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;
import p5462h.p5483m.C69762k;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.x */
/* compiled from: PG */
public final class C125645x implements C125687t {

    /* renamed from: a */
    public static final C125633l f346295a = new C125633l();

    /* renamed from: b */
    public static final C69613f f346296b = new C69747m(C125631j.f346285a);

    /* renamed from: c */
    public static final C69613f f346297c = new C69747m(C125629h.f346283a);

    /* renamed from: d */
    public static final C69613f f346298d = new C69747m(C125615d.f346263a);

    /* renamed from: e */
    public static final C69613f f346299e = new C69747m(C125632k.f346286a);

    /* renamed from: f */
    public static final C69613f f346300f = new C69747m(C125627f.f346281a);

    /* renamed from: g */
    public static final C69613f f346301g = new C69747m(C125561b.f346184a);

    /* renamed from: h */
    public static final List f346302h = C69540x.m100947e("first", "second", "third", "fourth", "fifth", "sixth");

    /* renamed from: i */
    public static final Map f346303i;

    /* renamed from: j */
    public static final Map f346304j = C69505av.m100867i(new C69685i("bulleted", C125649ab.BULLETED), new C69685i("numbered", C125649ab.NUMBERED));

    /* renamed from: k */
    public static final C69613f f346305k = new C69747m(C125534a.f346149a);

    /* renamed from: l */
    public static final C69613f f346306l = new C69747m(C125588c.f346228a);

    /* renamed from: m */
    public static final C69613f f346307m = new C69747m(C125630i.f346284a);

    /* renamed from: n */
    public static final C69613f f346308n = new C69747m(C125626e.f346280a);

    /* renamed from: o */
    public static final C69613f f346309o = new C69747m(C125628g.f346282a);

    /* renamed from: p */
    public static final C69762k f346310p = new C69762k("( and|,)( a| an| the)? ");

    /* renamed from: q */
    private static final C126323bd f346311q = new C126323bd(Locale.ENGLISH);

    /* renamed from: r */
    private final C125528f f346312r;

    static {
        C125666as asVar = C125666as.RECIPIENT;
        C125666as asVar2 = C125666as.SUBJECT;
        C125666as asVar3 = C125666as.BODY;
        f346303i = C69505av.m100867i(new C69685i("recipient", C125666as.RECIPIENT), new C69685i("recipients", asVar), new C69685i("to", asVar), new C69685i("two", asVar), new C69685i("2", asVar), new C69685i("cc", C125666as.CC), new C69685i("bcc", C125666as.BCC), new C69685i("subject", asVar2), new C69685i("body", asVar3), new C69685i("message", asVar3), new C69685i("title", asVar2));
    }

    public C125645x(C125528f fVar) {
        this.f346312r = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a2, code lost:
        if (r11 != r1) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107043a(java.lang.String r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125634m
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.m r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125634m) r0
            int r1 = r0.f346291e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346291e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.m r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.m
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f346289c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346291e
            r3 = 0
            java.lang.String r4 = "normalizedText"
            r5 = 3
            r6 = 1
            r7 = 2
            if (r2 == 0) goto L_0x0059
            if (r2 == r6) goto L_0x004d
            if (r2 == r7) goto L_0x0041
            if (r2 != r5) goto L_0x0039
            java.lang.Object r10 = r0.f346288b
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.z r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125693z) r10
            java.lang.Object r0 = r0.f346287a
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.z r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125693z) r0
            p5462h.C69714l.m101134b(r11)
            goto L_0x00b5
        L_0x0039:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0041:
            java.lang.Object r10 = r0.f346288b
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.f346287a
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.x r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125645x) r2
            p5462h.C69714l.m101134b(r11)
            goto L_0x00a4
        L_0x004d:
            java.lang.Object r10 = r0.f346288b
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.f346287a
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.x r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125645x) r2
            p5462h.C69714l.m101134b(r11)
            goto L_0x0072
        L_0x0059:
            p5462h.C69714l.m101134b(r11)
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.bd r11 = f346311q
            java.lang.String r10 = r11.mo107533a(r10)
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r4)
            r0.f346287a = r9
            r0.f346288b = r10
            r0.f346291e = r6
            java.lang.Object r11 = r9.mo107046b(r10, r0)
            if (r11 == r1) goto L_0x00bd
            r2 = r9
        L_0x0072:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.z r11 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125693z) r11
            if (r11 == 0) goto L_0x0077
            return r11
        L_0x0077:
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r4)
            char[] r11 = new char[r6]
            r4 = 32
            r8 = 0
            r11[r8] = r4
            java.util.List r10 = p5462h.p5483m.C69764m.m101189F(r10, r11, r7, r7)
            int r11 = r10.size()
            if (r11 >= r7) goto L_0x008c
            return r3
        L_0x008c:
            java.lang.Object r11 = r10.get(r8)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.get(r6)
            java.lang.String r10 = (java.lang.String) r10
            r0.f346287a = r2
            r0.f346288b = r10
            r0.f346291e = r7
            java.lang.Object r11 = r2.mo107046b(r11, r0)
            if (r11 == r1) goto L_0x00bd
        L_0x00a4:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.z r11 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125693z) r11
            r0.f346287a = r11
            r0.f346288b = r11
            r0.f346291e = r5
            java.lang.Object r10 = r2.mo107046b(r10, r0)
            if (r10 == r1) goto L_0x00bd
            r0 = r11
            r11 = r10
            r10 = r0
        L_0x00b5:
            boolean r10 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r11)
            if (r10 == 0) goto L_0x00bc
            return r0
        L_0x00bc:
            return r3
        L_0x00bd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125645x.mo107043a(java.lang.String, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0265, code lost:
        if (r5.equals("stop dictation") == false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x026e, code lost:
        if (r5.equals("stop dictating") != false) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0277, code lost:
        if (r5.equals("stop listening") == false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0280, code lost:
        if (r5.equals("stop") == false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125672e.f346350a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125656ai.f346326a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125657aj.f346327a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        return com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125663ap.f346334a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r5.equals("delete all") == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ae, code lost:
        if (r5.equals("delete everything") == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b7, code lost:
        if (r5.equals("clear all text") != false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c0, code lost:
        if (r5.equals("remove all text") == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c9, code lost:
        if (r5.equals("clear everything") == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d2, code lost:
        if (r5.equals("clear all") == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00db, code lost:
        if (r5.equals("delete all text") == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0127, code lost:
        if (r5.equals("delete last sentence") == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0130, code lost:
        if (r5.equals("clear the last sentence") != false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0139, code lost:
        if (r5.equals("clear last sentence") == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0142, code lost:
        if (r5.equals("delete the last sentence") == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014b, code lost:
        if (r5.equals("remove last sentence") == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0167, code lost:
        if (r5.equals("clear last word") == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0170, code lost:
        if (r5.equals("delete the last word") == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0179, code lost:
        if (r5.equals("delete last word") != false) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0182, code lost:
        if (r5.equals("clear the last word") == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x018b, code lost:
        if (r5.equals("remove last word") == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0194, code lost:
        if (r5.equals("delete") == false) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107046b(java.lang.String r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125636o
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.o r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125636o) r0
            int r1 = r0.f346294c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346294c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.o r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.o
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f346292a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346294c
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            p5462h.C69714l.m101134b(r6)
            goto L_0x02a2
        L_0x0028:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0030:
            p5462h.C69714l.m101134b(r6)
            int r6 = r5.hashCode()
            r2 = -1172166351(0xffffffffba222931, float:-6.1859476E-4)
            if (r6 == r2) goto L_0x005a
            r2 = 475818546(0x1c5c6a32, float:7.292915E-22)
            if (r6 == r2) goto L_0x0050
            r2 = 1080343541(0x4064bbf5, float:3.573972)
            if (r6 == r2) goto L_0x0047
            goto L_0x0062
        L_0x0047:
            java.lang.String r6 = "read it"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0343
            goto L_0x0062
        L_0x0050:
            java.lang.String r6 = "read it back"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0062
            goto L_0x0343
        L_0x005a:
            java.lang.String r6 = "read back"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0343
        L_0x0062:
            java.lang.String r6 = "read aloud"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x006c
            goto L_0x0343
        L_0x006c:
            java.lang.String r6 = "add"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x007d
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a
            h.a.am r6 = p5462h.p5463a.C69496am.f185918a
            r5.<init>(r6)
            goto L_0x0345
        L_0x007d:
            java.lang.String r6 = "clear"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x0087
            goto L_0x0340
        L_0x0087:
            java.lang.String r6 = "clear text"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x0340
            java.lang.String r6 = "clear the text"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x0340
            int r6 = r5.hashCode()
            switch(r6) {
                case -1485626591: goto L_0x00d5;
                case -1272459954: goto L_0x00cc;
                case -1044288922: goto L_0x00c3;
                case -156248984: goto L_0x00ba;
                case 616794303: goto L_0x00b1;
                case 1458828360: goto L_0x00a8;
                case 1763032492: goto L_0x009f;
                default: goto L_0x009e;
            }
        L_0x009e:
            goto L_0x00dd
        L_0x009f:
            java.lang.String r6 = "delete all"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x00e5
            goto L_0x00dd
        L_0x00a8:
            java.lang.String r6 = "delete everything"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x00e5
            goto L_0x00dd
        L_0x00b1:
            java.lang.String r6 = "clear all text"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x00dd
            goto L_0x00e5
        L_0x00ba:
            java.lang.String r6 = "remove all text"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x00e5
            goto L_0x00dd
        L_0x00c3:
            java.lang.String r6 = "clear everything"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x00e5
            goto L_0x00dd
        L_0x00cc:
            java.lang.String r6 = "clear all"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x00e5
            goto L_0x00dd
        L_0x00d5:
            java.lang.String r6 = "delete all text"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x00e5
        L_0x00dd:
            java.lang.String r6 = "clear all the text"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x00e9
        L_0x00e5:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.e r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125672e.f346350a
            goto L_0x0345
        L_0x00e9:
            java.lang.String r6 = "finish"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x00f5
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.i r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125676i.f346354a
            goto L_0x0345
        L_0x00f5:
            java.lang.String r6 = "next"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x00ff
            goto L_0x033d
        L_0x00ff:
            java.lang.String r6 = "next field"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x033d
            java.lang.String r6 = "previous field"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x0111
            goto L_0x033a
        L_0x0111:
            java.lang.String r6 = "previous"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x033a
            int r6 = r5.hashCode()
            switch(r6) {
                case -1879006703: goto L_0x0145;
                case -341091319: goto L_0x013c;
                case -225244134: goto L_0x0133;
                case 659580971: goto L_0x012a;
                case 919510776: goto L_0x0121;
                default: goto L_0x0120;
            }
        L_0x0120:
            goto L_0x014d
        L_0x0121:
            java.lang.String r6 = "delete last sentence"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0155
            goto L_0x014d
        L_0x012a:
            java.lang.String r6 = "clear the last sentence"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x014d
            goto L_0x0155
        L_0x0133:
            java.lang.String r6 = "clear last sentence"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0155
            goto L_0x014d
        L_0x013c:
            java.lang.String r6 = "delete the last sentence"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0155
            goto L_0x014d
        L_0x0145:
            java.lang.String r6 = "remove last sentence"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0155
        L_0x014d:
            java.lang.String r6 = "remove the last sentence"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x0159
        L_0x0155:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ai r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125656ai.f346326a
            goto L_0x0345
        L_0x0159:
            int r6 = r5.hashCode()
            switch(r6) {
                case -1335458389: goto L_0x018e;
                case -996566600: goto L_0x0185;
                case -257655598: goto L_0x017c;
                case 742400543: goto L_0x0173;
                case 887099312: goto L_0x016a;
                case 1492938817: goto L_0x0161;
                default: goto L_0x0160;
            }
        L_0x0160:
            goto L_0x0196
        L_0x0161:
            java.lang.String r6 = "clear last word"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x019e
            goto L_0x0196
        L_0x016a:
            java.lang.String r6 = "delete the last word"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x019e
            goto L_0x0196
        L_0x0173:
            java.lang.String r6 = "delete last word"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0196
            goto L_0x019e
        L_0x017c:
            java.lang.String r6 = "clear the last word"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x019e
            goto L_0x0196
        L_0x0185:
            java.lang.String r6 = "remove last word"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x019e
            goto L_0x0196
        L_0x018e:
            java.lang.String r6 = "delete"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x019e
        L_0x0196:
            java.lang.String r6 = "remove the last word"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x01a2
        L_0x019e:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.aj r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125657aj.f346327a
            goto L_0x0345
        L_0x01a2:
            java.lang.String r6 = "redo"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x01ac
            goto L_0x0337
        L_0x01ac:
            java.lang.String r6 = "redo it"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x0337
            java.lang.String r6 = "re do"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x0337
            java.lang.String r6 = "save"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x01c6
            goto L_0x0334
        L_0x01c6:
            java.lang.String r6 = "save it"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x0334
            java.lang.String r6 = "done"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x0334
            java.lang.String r6 = "search"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x01e0
            goto L_0x0331
        L_0x01e0:
            java.lang.String r6 = "search for it"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x0331
            int r6 = r5.hashCode()
            r2 = -31464394(0xfffffffffe1fe436, float:-5.313305E37)
            if (r6 == r2) goto L_0x020f
            r2 = 3526536(0x35cf88, float:4.94173E-39)
            if (r6 == r2) goto L_0x0205
            r2 = 1979852995(0x760228c3, float:6.599857E32)
            if (r6 == r2) goto L_0x01fc
            goto L_0x0217
        L_0x01fc:
            java.lang.String r6 = "send it"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x032e
            goto L_0x0217
        L_0x0205:
            java.lang.String r6 = "send"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0217
            goto L_0x032e
        L_0x020f:
            java.lang.String r6 = "send this"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x032e
        L_0x0217:
            java.lang.String r6 = "sent"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x0221
            goto L_0x032e
        L_0x0221:
            java.lang.String r6 = "new line"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x022b
            goto L_0x0326
        L_0x022b:
            java.lang.String r6 = "next line"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x0326
            java.lang.String r6 = "new paragraph"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x023d
            goto L_0x031e
        L_0x023d:
            java.lang.String r6 = "next paragraph"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x031e
            java.lang.String r6 = "discard"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x024f
            goto L_0x031b
        L_0x024f:
            java.lang.String r6 = "discard it"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x031b
            int r6 = r5.hashCode()
            switch(r6) {
                case 3540994: goto L_0x027a;
                case 1151300125: goto L_0x0271;
                case 1407361595: goto L_0x0268;
                case 1407361633: goto L_0x025f;
                default: goto L_0x025e;
            }
        L_0x025e:
            goto L_0x0282
        L_0x025f:
            java.lang.String r6 = "stop dictation"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x028a
            goto L_0x0282
        L_0x0268:
            java.lang.String r6 = "stop dictating"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0282
            goto L_0x028a
        L_0x0271:
            java.lang.String r6 = "stop listening"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x028a
            goto L_0x0282
        L_0x027a:
            java.lang.String r6 = "stop"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x028a
        L_0x0282:
            java.lang.String r6 = "cancel"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x028e
        L_0x028a:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ap r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125663ap.f346334a
            goto L_0x0345
        L_0x028e:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.f r6 = r4.f346312r
            java.lang.String r6 = r6.f346136a
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x02ac
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.a.f r5 = r4.f346312r
            r0.f346294c = r3
            java.lang.Object r6 = r5.mo107037a(r0)
            if (r6 == r1) goto L_0x02ab
        L_0x02a2:
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ar r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ar
            r5.<init>(r6)
            goto L_0x0345
        L_0x02ab:
            return r1
        L_0x02ac:
            java.lang.String r6 = "undo"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 == 0) goto L_0x02b5
            goto L_0x0318
        L_0x02b5:
            java.lang.String r6 = "undo it"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x0318
            java.lang.String r6 = "un do"
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r6)
            if (r6 != 0) goto L_0x0318
            r6 = 9
            h.f.a.l[] r6 = new p5462h.p5473f.p5474a.C69626l[r6]
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.p r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.p
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.l r1 = f346295a
            r0.<init>(r1)
            r2 = 0
            r6[r2] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.q r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.q
            r0.<init>(r1)
            r6[r3] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.r r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.r
            r0.<init>(r1)
            r2 = 2
            r6[r2] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.s r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.s
            r0.<init>(r1)
            r2 = 3
            r6[r2] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.t r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.t
            r0.<init>(r1)
            r2 = 4
            r6[r2] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.u r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.u
            r0.<init>(r1)
            r2 = 5
            r6[r2] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.v r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.v
            r0.<init>(r1)
            r2 = 6
            r6[r2] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.w r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.w
            r0.<init>(r1)
            r2 = 7
            r6[r2] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.n r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.n
            r0.<init>(r1)
            r1 = 8
            r6[r1] = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.z r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125692y.m205677a(r5, r6)
            goto L_0x0345
        L_0x0318:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.at r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125667at.f346343a
            goto L_0x0345
        L_0x031b:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.h r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125675h.f346353a
            goto L_0x0345
        L_0x031e:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.aa r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.aa
            java.lang.String r6 = "\n\n"
            r5.<init>(r6)
            goto L_0x0345
        L_0x0326:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.aa r5 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.aa
            java.lang.String r6 = "\n"
            r5.<init>(r6)
            goto L_0x0345
        L_0x032e:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.an r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125661an.f346331a
            goto L_0x0345
        L_0x0331:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.al r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125659al.f346329a
            goto L_0x0345
        L_0x0334:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ak r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125658ak.f346328a
            goto L_0x0345
        L_0x0337:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ag r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125654ag.f346324a
            goto L_0x0345
        L_0x033a:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ae r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125652ae.f346322a
            goto L_0x0345
        L_0x033d:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.ad r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125651ad.f346321a
            goto L_0x0345
        L_0x0340:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.b r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125669b.f346346a
            goto L_0x0345
        L_0x0343:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.af r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125653af.f346323a
        L_0x0345:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a.C125645x.mo107046b(java.lang.String, h.c.g):java.lang.Object");
    }
}
