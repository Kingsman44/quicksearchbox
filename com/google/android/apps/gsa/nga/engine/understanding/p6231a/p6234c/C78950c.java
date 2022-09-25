package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6234c;

import com.google.android.apps.gsa.nga.engine.p6140t.C77973m;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78954f;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78969u;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78971w;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78973y;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82362cj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82591kw;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82592kx;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.c.c */
/* compiled from: PG */
final class C78950c implements C78954f {

    /* renamed from: a */
    private static final Optional f217187a;

    /* renamed from: b */
    private final C77973m f217188b;

    /* renamed from: c */
    private final C91142g f217189c;

    /* renamed from: d */
    private final C83305i f217190d;

    static {
        C89849ae aeVar = C89849ae.NGA_GMAIL_SEARCH_ICING_IG_START;
        if (aeVar != null) {
            C89849ae aeVar2 = C89849ae.NGA_GMAIL_SEARCH_ICING_IG_SUCCESS_NEGATIVE;
            if (aeVar2 != null) {
                C89849ae aeVar3 = C89849ae.NGA_GMAIL_SEARCH_ICING_IG_SUCCESS_POSITIVE;
                if (aeVar3 != null) {
                    f217187a = Optional.m71637of(new C78973y(aeVar, aeVar3, aeVar2));
                    return;
                }
                throw new NullPointerException("Null positiveSuccessEvent");
            }
            throw new NullPointerException("Null negativeSuccessEvent");
        }
        throw new NullPointerException("Null startEvent");
    }

    public C78950c(C77973m mVar, C91142g gVar, C83305i iVar) {
        this.f217188b = mVar;
        this.f217189c = gVar;
        this.f217190d = iVar;
    }

    /* renamed from: a */
    public final C58528ij mo73695a() {
        return new C58759qy("com.google.android.gm");
    }

    /* renamed from: b */
    public final Optional mo73696b(String str, C58485gu guVar, String str2, Optional optional) {
        if (!str2.equals("com.google.android.gm")) {
            return Optional.empty();
        }
        if (!((Boolean) this.f217188b.mo72932b().map(C78948a.f217185a).map(new C78949b(str)).orElse(false)).booleanValue()) {
            return Optional.empty();
        }
        C83305i iVar = this.f217190d;
        C82591kw c = C82592kx.m131648c();
        ((C82362cj) c).f225000b = "appsearch_icing";
        iVar.mo75579d(c.mo75868a());
        if (!this.f217189c.mo85405j(C90126fx.f251235ew)) {
            return Optional.empty();
        }
        C78969u uVar = new C78969u();
        uVar.mo73686b(str);
        uVar.f217221a = new C78971w("com.google.android.gm");
        uVar.f217222b = "App_search_classifier_origin_gmail_icing";
        return Optional.m71637of(uVar.mo73685a());
    }

    /* renamed from: c */
    public final Optional mo73697c() {
        return f217187a;
    }

    /* renamed from: d */
    public final String mo73698d() {
        return "gmail-icing";
    }

    /* renamed from: e */
    public final boolean mo73699e() {
        return false;
    }
}
