package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2017a.C24266a;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24271c;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24272d;
import com.google.android.libraries.lens.ondevice.p2026f.p2029b.C24473a;
import com.google.android.libraries.lens.ondevice.p2037n.C24790aw;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24796g;
import com.google.android.libraries.lens.ondevice.p2037n.C24797h;
import com.google.android.libraries.lens.ondevice.p2037n.C24800k;
import com.google.android.libraries.lens.ondevice.p2037n.C24801l;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4701g.C62334dc;
import com.google.lens.p4701g.C62335dd;
import com.google.lens.p4701g.C62350m;
import com.google.lens.p4701g.C62351n;
import java.util.Collections;
import java.util.Map;

@C24266a(mo29795a = "TranslateEngine")
/* renamed from: com.google.android.libraries.lens.ondevice.k.ha */
/* compiled from: PG */
public final class C24725ha implements C24650eg {

    /* renamed from: a */
    private static final C58974d f67587a = C58974d.m91135i("TranslateEngine");

    /* renamed from: b */
    private final C24555at f67588b;

    /* renamed from: c */
    private final C24735hk f67589c;

    public C24725ha(C24555at atVar, C24735hk hkVar) {
        this.f67588b = atVar;
        this.f67589c = hkVar;
    }

    /* renamed from: e */
    static C58833ax m45861e(C24790aw awVar) {
        String str = awVar.f67735b;
        String str2 = awVar.f67736c;
        try {
            C58833ax h = m45864h(awVar, str);
            C58833ax h2 = m45864h(awVar, str2);
            C24796g gVar = (C24796g) C24797h.f67760b.createBuilder();
            if (h.mo56113h()) {
                gVar.mo30004a(C24473a.m45550i((String) h.mo56107c(), str));
            }
            if (h2.mo56113h()) {
                gVar.mo30004a(C24473a.m45550i((String) h2.mo56107c(), str2));
            }
            C24800k kVar = (C24800k) C24801l.f67766c.createBuilder();
            kVar.copyOnWrite();
            C24801l lVar = (C24801l) kVar.instance;
            C24797h hVar = (C24797h) gVar.build();
            hVar.getClass();
            lVar.f67769b = hVar;
            lVar.f67768a |= 2;
            return C58833ax.m90834k((C24801l) kVar.build());
        } catch (IllegalStateException e) {
            ((C58970a) ((C58970a) ((C58970a) f67587a.mo56226d()).mo56382g(e)).mo56372aa(48855)).mo56386p("Illegal translate load configuration.");
            return C58836b.f156633a;
        }
    }

    /* renamed from: f */
    public static boolean m45862f(C24735hk hkVar, C24790aw awVar) {
        int i = awVar.f67734a;
        if ((i & 1) == 0 || (i & 2) == 0) {
            return false;
        }
        C58833ax axVar = hkVar.f67615a;
        if (!axVar.mo56113h()) {
            return true;
        }
        return !((C24790aw) axVar.mo56107c()).f67735b.equals(awVar.f67735b) || !((C24790aw) axVar.mo56107c()).f67736c.equals(awVar.f67736c) || ((C24790aw) axVar.mo56107c()).f67738e != awVar.f67738e;
    }

    /* renamed from: g */
    static void m45863g(Context context, C24555at atVar, C24735hk hkVar, C24803n nVar, C24790aw awVar) {
        C58833ax axVar;
        C24735hk hkVar2 = hkVar;
        C24803n nVar2 = nVar;
        C24790aw awVar2 = awVar;
        String str = awVar2.f67735b;
        String str2 = awVar2.f67736c;
        if (str.equals(str2)) {
            hkVar2.f67615a = C58833ax.m90834k(awVar);
            return;
        }
        C58833ax h = m45864h(awVar2, str);
        C58833ax h2 = m45864h(awVar2, str2);
        Class<C24725ha> cls = C24725ha.class;
        if (h.mo56113h() || h2.mo56113h()) {
            String str3 = (String) (h.mo56113h() ? h.mo56107c() : h2.mo56107c());
            String str4 = true != h.mo56113h() ? str2 : str;
            C58833ax axVar2 = C58836b.f156633a;
            if (!h.mo56113h() || !h2.mo56113h()) {
                h2 = axVar2;
            } else {
                axVar2 = C58833ax.m90834k(str2);
            }
            try {
                boolean h3 = h.mo56113h();
                String g = C24473a.m45548g(nVar2, str3, str4.concat("_trans"));
                if (!TextUtils.isEmpty(g)) {
                    String b = C24738hn.m45885b(g, str3);
                    C58833ax axVar3 = C58836b.f156633a;
                    String g2 = C24473a.m45548g(nVar2, str3, "trans_rr");
                    if (!TextUtils.isEmpty(g2)) {
                        axVar3 = C24738hn.m45884a(g2, str4, h3);
                    }
                    C58833ax axVar4 = C58836b.f156633a;
                    if (h2.mo56113h()) {
                        String g3 = C24473a.m45548g(nVar2, (String) h2.mo56107c(), ((String) axVar2.mo56107c()).concat("_trans"));
                        if (!TextUtils.isEmpty(g3)) {
                            C58833ax k = C58833ax.m90834k(C24738hn.m45885b(g3, (String) h2.mo56107c()));
                            String g4 = C24473a.m45548g(nVar2, (String) h2.mo56107c(), "trans_rr");
                            if (!TextUtils.isEmpty(g4)) {
                                axVar4 = C24738hn.m45884a(g4, (String) axVar2.mo56107c(), false);
                            }
                            axVar = axVar4;
                            axVar4 = k;
                        } else {
                            throw new C24272d((String) h2.mo56107c());
                        }
                    } else {
                        axVar = axVar4;
                    }
                    C62334dc dcVar = (C62334dc) C62335dd.f168280h.createBuilder();
                    dcVar.copyOnWrite();
                    C62335dd ddVar = (C62335dd) dcVar.instance;
                    b.getClass();
                    ddVar.f168282a |= 4;
                    ddVar.f168285d = b;
                    if (axVar3.mo56113h()) {
                        String str5 = (String) axVar3.mo56107c();
                        dcVar.copyOnWrite();
                        C62335dd ddVar2 = (C62335dd) dcVar.instance;
                        str5.getClass();
                        ddVar2.f168282a |= 16;
                        ddVar2.f168287f = str5;
                    }
                    if (axVar4.mo56113h()) {
                        String str6 = (String) axVar4.mo56107c();
                        dcVar.copyOnWrite();
                        C62335dd ddVar3 = (C62335dd) dcVar.instance;
                        str6.getClass();
                        ddVar3.f168282a |= 8;
                        ddVar3.f168286e = str6;
                    }
                    if (axVar.mo56113h()) {
                        String str7 = (String) axVar.mo56107c();
                        dcVar.copyOnWrite();
                        C62335dd ddVar4 = (C62335dd) dcVar.instance;
                        str7.getClass();
                        ddVar4.f168282a |= 32;
                        ddVar4.f168288g = str7;
                    }
                    C62335dd ddVar5 = (C62335dd) dcVar.build();
                    if (!awVar2.f67739f) {
                        C62334dc dcVar2 = (C62334dc) ddVar5.toBuilder();
                        dcVar2.copyOnWrite();
                        C62335dd ddVar6 = (C62335dd) dcVar2.instance;
                        ddVar6.f168282a &= -17;
                        ddVar6.f168287f = C62335dd.f168280h.f168287f;
                        dcVar2.copyOnWrite();
                        C62335dd ddVar7 = (C62335dd) dcVar2.instance;
                        ddVar7.f168282a &= -33;
                        ddVar7.f168288g = C62335dd.f168280h.f168288g;
                        ddVar5 = (C62335dd) dcVar2.build();
                    }
                    ((C58970a) ((C58970a) f67587a.mo56224b()).mo56372aa(48856)).mo56354G("Initializing translate with %s and %s", str, str2);
                    C62334dc dcVar3 = (C62334dc) ddVar5.toBuilder();
                    dcVar3.copyOnWrite();
                    C62335dd ddVar8 = (C62335dd) dcVar3.instance;
                    str.getClass();
                    ddVar8.f168282a |= 1;
                    ddVar8.f168283b = str;
                    dcVar3.copyOnWrite();
                    C62335dd ddVar9 = (C62335dd) dcVar3.instance;
                    str2.getClass();
                    ddVar9.f168282a |= 2;
                    ddVar9.f168284c = str2;
                    C62335dd ddVar10 = (C62335dd) dcVar3.build();
                    C62350m mVar = (C62350m) C62351n.f168321c.createBuilder();
                    mVar.copyOnWrite();
                    C62351n nVar3 = (C62351n) mVar.instance;
                    ddVar10.getClass();
                    nVar3.f168324b = ddVar10;
                    nVar3.f168323a = 6;
                    atVar.f67238a.mo30015f(context, (C62351n) mVar.build());
                    hkVar2.f67615a = C58833ax.m90834k(awVar);
                    return;
                }
                throw new C24272d(str3);
            } catch (IllegalStateException e) {
                throw new C24271c(C24657en.m45762b(cls), e);
            }
        } else {
            throw new C24271c(C24657en.m45762b(cls), new IllegalArgumentException(String.format("No models to load for %s and %s languages", new Object[]{str, str2})));
        }
    }

    /* renamed from: h */
    private static C58833ax m45864h(C24790aw awVar, String str) {
        if ("auto".equals(str) || "en".equals(str)) {
            return C58836b.f156633a;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(awVar.f67737d);
        if (unmodifiableMap.containsKey(str)) {
            return C58833ax.m90834k((String) unmodifiableMap.get(str));
        }
        throw new IllegalStateException(String.format("Model name for the language %s can't be determined.", new Object[]{str}));
    }

    /* renamed from: a */
    public final C58833ax mo29949a(C24795f fVar) {
        C24790aw awVar = fVar.f67755g;
        if (awVar == null) {
            awVar = C24790aw.f67732g;
        }
        return m45861e(awVar);
    }

    /* renamed from: b */
    public final void mo29950b(Context context, LodeResourceHolder lodeResourceHolder, C24803n nVar, C24795f fVar) {
        C24790aw awVar = fVar.f67755g;
        if (awVar == null) {
            awVar = C24790aw.f67732g;
        }
        if (awVar.f67738e) {
            C24735hk hkVar = this.f67589c;
            C24790aw awVar2 = fVar.f67755g;
            if (awVar2 == null) {
                awVar2 = C24790aw.f67732g;
            }
            hkVar.f67615a = C58833ax.m90834k(awVar2);
            return;
        }
        C24555at atVar = this.f67588b;
        C24735hk hkVar2 = this.f67589c;
        C24790aw awVar3 = fVar.f67755g;
        if (awVar3 == null) {
            awVar3 = C24790aw.f67732g;
        }
        m45863g(context, atVar, hkVar2, nVar, awVar3);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo29951c() {
    }

    /* renamed from: d */
    public final boolean mo29952d(C24795f fVar) {
        C24735hk hkVar = this.f67589c;
        C24790aw awVar = fVar.f67755g;
        if (awVar == null) {
            awVar = C24790aw.f67732g;
        }
        return m45862f(hkVar, awVar);
    }
}
