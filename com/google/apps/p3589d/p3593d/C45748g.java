package com.google.apps.p3589d.p3593d;

import com.evernote.android.state.BuildConfig;
import com.google.apps.p3589d.p3591b.C45720k;
import com.google.apps.p3589d.p3591b.C45721l;
import com.google.apps.p3589d.p3591b.C45724o;

/* renamed from: com.google.apps.d.d.g */
/* compiled from: PG */
public enum C45748g {
    NONE(BuildConfig.FLAVOR),
    BACKSLASH("\\"),
    FORWARD_SLASH("/"),
    SINGLE_VERT("|"),
    DOUBLE_VERT("‖"),
    SINGLE_UP_ARROW("↑"),
    DOUBLE_UP_ARROW("⇑"),
    SINGLE_DOWN_ARROW("↓"),
    DOUBLE_DOWN_ARROW("⇓"),
    SINGLE_UPDOWN_ARROW("↕"),
    DOUBLE_UPDOWN_ARROW("⇕"),
    L_ANGLE("⟨"),
    R_ANGLE("⟩"),
    L_BRACKET("["),
    R_BRACKET("]"),
    L_CEIL("⌈"),
    R_CEIL("⌉"),
    L_CURLY("{"),
    R_CURLY("}"),
    L_FLOOR("⌊"),
    R_FLOOR("⌋"),
    L_GROUP("⟮"),
    R_GROUP("⟯"),
    L_MOUSTACHE("⎰"),
    R_MOUSTACHE("⎱"),
    L_PAREN("("),
    R_PAREN(")");
    

    /* renamed from: B */
    public static final C45721l f120270B = null;

    /* renamed from: C */
    public static final C45721l f120271C = null;

    /* renamed from: D */
    public static final C45721l f120272D = null;

    /* renamed from: E */
    public static final C45747f f120273E = null;

    /* renamed from: F */
    public static final C45747f f120274F = null;

    /* renamed from: G */
    public static final C45747f f120275G = null;

    /* renamed from: H */
    public static final C45747f f120276H = null;

    /* renamed from: I */
    public static final C45747f f120277I = null;

    /* renamed from: J */
    public static final C45747f f120278J = null;

    /* renamed from: K */
    public static final C45747f f120279K = null;

    /* renamed from: M */
    private static final C45721l f120280M = null;

    /* renamed from: L */
    public final String f120308L;

    static {
        C45720k c = C45721l.m81490c();
        for (C45748g gVar : values()) {
            c.mo49825b(gVar.f120308L, gVar);
        }
        f120280M = c.f120223a.mo49834c();
        C45720k c2 = C45721l.m81490c();
        C45748g gVar2 = SINGLE_VERT;
        String str = gVar2.f120308L;
        c2.mo49825b(str, str);
        C45748g gVar3 = DOUBLE_VERT;
        String str2 = gVar3.f120308L;
        c2.mo49825b(str2, str2);
        c2.mo49825b(L_ANGLE.f120308L, R_ANGLE.f120308L);
        C45748g gVar4 = L_BRACKET;
        String str3 = gVar4.f120308L;
        C45748g gVar5 = R_BRACKET;
        c2.mo49825b(str3, gVar5.f120308L);
        C45748g gVar6 = L_CEIL;
        String str4 = gVar6.f120308L;
        C45748g gVar7 = R_CEIL;
        c2.mo49825b(str4, gVar7.f120308L);
        C45748g gVar8 = L_CURLY;
        String str5 = gVar8.f120308L;
        C45748g gVar9 = R_CURLY;
        c2.mo49825b(str5, gVar9.f120308L);
        C45748g gVar10 = L_FLOOR;
        String str6 = gVar10.f120308L;
        C45748g gVar11 = R_FLOOR;
        c2.mo49825b(str6, gVar11.f120308L);
        C45748g gVar12 = L_GROUP;
        String str7 = gVar12.f120308L;
        C45748g gVar13 = R_GROUP;
        c2.mo49825b(str7, gVar13.f120308L);
        c2.mo49825b(L_MOUSTACHE.f120308L, R_MOUSTACHE.f120308L);
        C45748g gVar14 = L_PAREN;
        String str8 = gVar14.f120308L;
        C45748g gVar15 = R_PAREN;
        C45748g gVar16 = gVar14;
        c2.mo49825b(str8, gVar15.f120308L);
        C45721l c3 = c2.f120223a.mo49834c();
        f120270B = c3;
        C45724o d = C45724o.m81498d();
        C45720k c4 = C45721l.m81490c();
        c3.mo49823b(new C45746e(c4, d));
        f120271C = c4.f120223a.mo49834c();
        f120272D = d.mo49834c();
        C45748g gVar17 = NONE;
        f120273E = new C45744c(gVar17, gVar17);
        f120274F = new C45744c(gVar2, gVar2);
        f120275G = new C45744c(gVar3, gVar3);
        f120276H = new C45744c(gVar4, gVar5);
        new C45744c(gVar6, gVar7);
        f120277I = new C45744c(gVar8, gVar9);
        new C45744c(gVar10, gVar11);
        new C45744c(gVar12, gVar13);
        f120278J = new C45744c(gVar16, gVar15);
        f120279K = new C45744c(gVar8, gVar17);
    }

    private C45748g(String str) {
        this.f120308L = str;
    }

    /* renamed from: a */
    public static C45747f m81553a(C45748g gVar, C45748g gVar2) {
        return new C45744c(gVar, gVar2);
    }

    /* renamed from: b */
    public static final C45748g m81554b(String str) {
        return (C45748g) f120280M.mo49822a(str);
    }

    /* renamed from: c */
    public static String m81555c(String str) {
        return (String) f120270B.f120221a.get(str);
    }

    /* renamed from: e */
    public static boolean m81556e(String str, String str2) {
        String c = m81555c(str);
        return c != null && str2.equals(c);
    }

    /* renamed from: d */
    public final String mo49880d() {
        return this.f120308L;
    }
}
