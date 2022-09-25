package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.assistant.shared.appactions.e.a;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.assistant.p3825an.p3830c.p3831a.C49299br;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.assistant.p3897e.p3921j.p3926e.C52030ib;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.bp */
/* compiled from: PG */
public class C108245bp extends C108229b {

    /* renamed from: b */
    private static final C59071e f301103b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.bp");

    /* renamed from: E */
    private final PackageManager f301104E;

    /* renamed from: F */
    private C58833ax f301105F = C58836b.f156633a;

    /* renamed from: a */
    public final C51992gr f301106a;

    public C108245bp(PackageManager packageManager, C51992gr grVar) {
        super(grVar.f136450d, grVar.f136451e);
        this.f301104E = packageManager;
        this.f301106a = grVar;
    }

    /* renamed from: a */
    public final Intent mo96600a() {
        C51058ev evVar;
        Object obj;
        C51098gh ghVar = this.f301106a.f136453g;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        if ((evVar.f132943a & 32) == 0) {
            C52030ib ibVar = this.f301106a.f136461o;
            if (ibVar == null) {
                ibVar = C52030ib.f136561a;
            }
            C62940bt r3 = C62942bv.checkIsLite(C49299br.f127414i);
            ibVar.mo58887l(r3);
            if (ibVar.f169962ag.mo58857o(r3.f169971d)) {
                if (!this.f301105F.mo56113h()) {
                    C52030ib ibVar2 = this.f301106a.f136461o;
                    if (ibVar2 == null) {
                        ibVar2 = C52030ib.f136561a;
                    }
                    C62940bt r1 = C62942bv.checkIsLite(C49299br.f127414i);
                    ibVar2.mo58887l(r1);
                    Object l = ibVar2.f169962ag.mo58854l(r1.f169971d);
                    if (l == null) {
                        obj = r1.f169969b;
                    } else {
                        obj = r1.mo58889c(l);
                    }
                    this.f301105F = C58833ax.m90834k(a.a(this.f301106a, (C49299br) obj, false));
                }
                return (Intent) this.f301105F.mo56107c();
            }
            Intent launchIntentForPackage = this.f301104E.getLaunchIntentForPackage(evVar.f132944b);
            if (launchIntentForPackage != null) {
                return launchIntentForPackage;
            }
            C59104x d = f301103b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ClientOpActionSuggest");
            ((C59052c) ((C59052c) d).mo56372aa(23946)).mo56389s("Failed to generate intent from package name %s.", evVar.f132944b);
        }
        Intent x = C87566i.m142325x(evVar.f132949g);
        if ((1 & evVar.f132943a) != 0) {
            x.setPackage(evVar.f132944b);
        }
        return x;
    }

    /* renamed from: b */
    public final String mo96697b() {
        C51992gr grVar = this.f301106a;
        if ((grVar.f136447a & 16) == 0) {
            return null;
        }
        C51012dc dcVar = grVar.f136452f;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        return dcVar.f132817c;
    }
}
