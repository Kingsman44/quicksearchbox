package com.google.android.libraries.p1969j.p1970a.p1974b;

import com.google.common.p4522b.C58466gb;
import com.google.common.p4522b.C58468gd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4184bj.p4193c.p4197c.C55948av;
import com.google.p4184bj.p4193c.p4197c.C55950ax;
import com.google.p4184bj.p4193c.p4197c.C55951ay;
import com.google.p4184bj.p4193c.p4197c.C55974j;
import p5304e.p5305a.p5306a.p5388m.p5389a.C68820a;

/* renamed from: com.google.android.libraries.j.a.b.ai */
/* compiled from: PG */
final class C23951ai {

    /* renamed from: a */
    public static final C58468gd f65500a;

    /* renamed from: b */
    private static final C59071e f65501b = C59071e.m91332i("com.google.android.libraries.j.a.b.ai");

    static {
        C58466gb gbVar = new C58466gb();
        gbVar.mo55364d(C23950ah.ALREADY_CONSENTED, C55974j.ALREADY_CONSENTED);
        gbVar.mo55364d(C23950ah.CAN_ASK_FOR_CONSENT, C55974j.CAN_ASK_FOR_CONSENT);
        gbVar.mo55364d(C23950ah.CANNOT_CONSENT, C55974j.CANNOT_CONSENT);
        gbVar.mo55364d(C23950ah.CONSENT_DEPRECATED, C55974j.CONSENT_DEPRECATED);
        f65500a = gbVar.mo55363c();
    }

    /* renamed from: a */
    static C23950ah m44540a(C55951ay ayVar) {
        C55950ax axVar;
        C55950ax axVar2;
        if (C68820a.f184897a.mo6453a().mo60510h()) {
            ((C59052c) ((C59052c) f65501b.mo56225c()).mo56372aa(47960)).mo56386p("Consent explicitly disabled; an app update may be required.");
            return C23950ah.CONSENT_DEPRECATED;
        }
        C55948av avVar = C55948av.SINGLE_SETTING_UI_DESCRIPTION;
        C55950ax axVar3 = C55950ax.UNKNOWN;
        int ordinal = C55948av.m87865a(ayVar.f148935b).ordinal();
        if (ordinal == 0) {
            return C23950ah.CAN_ASK_FOR_CONSENT;
        }
        if (ordinal != 1) {
            ((C59052c) ((C59052c) f65501b.mo56226d()).mo56372aa(47958)).mo56389s("FPOP returned unknown UI description: %s", C55948av.m87865a(ayVar.f148935b));
            return C23950ah.CANNOT_CONSENT;
        }
        if (ayVar.f148935b == 2) {
            axVar = C55950ax.m87866a(((Integer) ayVar.f148936c).intValue());
            if (axVar == null) {
                axVar = C55950ax.UNKNOWN;
            }
        } else {
            axVar = C55950ax.UNKNOWN;
        }
        if (axVar.ordinal() == 2) {
            return C23950ah.ALREADY_CONSENTED;
        }
        C59052c cVar = (C59052c) ((C59052c) f65501b.mo56226d()).mo56372aa(47959);
        if (ayVar.f148935b == 2) {
            axVar2 = C55950ax.m87866a(((Integer) ayVar.f148936c).intValue());
            if (axVar2 == null) {
                axVar2 = C55950ax.UNKNOWN;
            }
        } else {
            axVar2 = C55950ax.UNKNOWN;
        }
        cVar.mo56389s("FPOP returned unknown UI_NOT_AVAILABLE_REASON: %s", axVar2);
        return C23950ah.CANNOT_CONSENT;
    }
}
