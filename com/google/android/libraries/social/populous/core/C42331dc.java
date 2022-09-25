package com.google.android.libraries.social.populous.core;

import com.google.common.p4522b.C58336bg;
import com.google.common.p4522b.C58394dk;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4522b.C58702ov;
import com.google.common.p4522b.C58710pc;
import java.util.Iterator;
import p3186j$.util.Objects;
import p5602o.p5607c.C71924aa;

/* renamed from: com.google.android.libraries.social.populous.core.dc */
/* compiled from: PG */
public enum C42331dc {
    UNKNOWN_PROVENANCE(C71924aa.UNKNOWN_PROVENANCE, false),
    DEVICE(C71924aa.DEVICE, false),
    CLOUD(C71924aa.CLOUD, true),
    USER_ENTERED(C71924aa.USER_ENTERED, false),
    PAPI_AUTOCOMPLETE(C71924aa.PAPI_AUTOCOMPLETE, true),
    PAPI_TOPN(C71924aa.PAPI_TOPN, true),
    PAPI_LIST_PEOPLE_BY_KNOWN_ID(C71924aa.PAPI_LIST_PEOPLE_BY_KNOWN_ID, true),
    DIRECTORY(C71924aa.DIRECTORY, false),
    PREPOPULATED(C71924aa.PREPOPULATED, false),
    SMART_ADDRESS_EXPANSION(C71924aa.SMART_ADDRESS_EXPANSION, true),
    SMART_ADDRESS_REPLACEMENT(C71924aa.SMART_ADDRESS_REPLACEMENT, true),
    CUSTOM_RESULT_PROVIDER(C71924aa.CUSTOM_RESULT_PROVIDER, false);
    

    /* renamed from: m */
    public static final C58710pc f111025m = null;

    /* renamed from: n */
    public static final C58710pc f111026n = null;

    /* renamed from: o */
    public final C71924aa f111028o;

    /* renamed from: p */
    public final boolean f111029p;

    static {
        C58702ov ovVar = new C58702ov(new C58394dk(C58485gu.m89848p(new C58336bg(C42325cx.f111004a, C58701ou.f156429a), new C58336bg(C42326cy.f111005a, C58701ou.f156429a), new C58336bg(C42327cz.f111006a, C58701ou.f156429a))));
        f111025m = ovVar;
        C58336bg bgVar = new C58336bg(C42329da.f111011a, C58701ou.f156429a);
        Objects.requireNonNull(ovVar);
        f111026n = new C58702ov(new C58394dk(C58485gu.m89847o(bgVar, new C58336bg(new C42330db(ovVar), ovVar))));
    }

    private C42331dc(C71924aa aaVar, boolean z) {
        this.f111028o = aaVar;
        this.f111029p = z;
    }

    /* renamed from: a */
    public static C42331dc m74556a(C71924aa aaVar) {
        C71924aa aaVar2 = C71924aa.UNKNOWN_PROVENANCE;
        switch (aaVar.ordinal()) {
            case 1:
                return DEVICE;
            case 2:
                return CLOUD;
            case 3:
                return USER_ENTERED;
            case 4:
                return PAPI_AUTOCOMPLETE;
            case 5:
                return PAPI_TOPN;
            case 6:
                return PAPI_LIST_PEOPLE_BY_KNOWN_ID;
            case 8:
                return DIRECTORY;
            case 10:
                return PREPOPULATED;
            case 11:
                return SMART_ADDRESS_EXPANSION;
            case 12:
                return SMART_ADDRESS_REPLACEMENT;
            case 13:
                return CUSTOM_RESULT_PROVIDER;
            default:
                return UNKNOWN_PROVENANCE;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m74557b(java.lang.Iterable r2) {
        /*
            if (r2 == 0) goto L_0x001c
            java.util.Iterator r2 = r2.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r2.next()
            com.google.android.libraries.social.populous.core.dc r0 = (com.google.android.libraries.social.populous.core.C42331dc) r0
            com.google.android.libraries.social.populous.core.dc r1 = SMART_ADDRESS_EXPANSION
            if (r0 == r1) goto L_0x001a
            com.google.android.libraries.social.populous.core.dc r1 = SMART_ADDRESS_REPLACEMENT
            if (r0 != r1) goto L_0x0006
        L_0x001a:
            r2 = 1
            return r2
        L_0x001c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.C42331dc.m74557b(java.lang.Iterable):boolean");
    }

    /* renamed from: c */
    public static boolean m74558c(Iterable iterable) {
        if (iterable == null) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((C42331dc) it.next()).f111029p) {
                return true;
            }
        }
        return false;
    }
}
