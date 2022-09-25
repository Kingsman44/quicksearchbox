package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import com.google.android.apps.gsa.nga.engine.p5963au.C75049m;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.base.C58866cc;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.o */
/* compiled from: PG */
public final class C77338o {

    /* renamed from: a */
    public static final C58974d f213287a = C58974d.m91136j();

    /* renamed from: b */
    public final C91142g f213288b;

    /* renamed from: c */
    public final C75049m f213289c;

    public C77338o(C91142g gVar, C75049m mVar) {
        this.f213288b = gVar;
        this.f213289c = mVar;
    }

    /* renamed from: b */
    public static C58495hd m124110b(String str) {
        if (str.isEmpty()) {
            return C58729pv.f156485a;
        }
        try {
            return C58495hd.m89898l(C58866cc.m90931a(str, C58869cf.m90938d(";"), C58869cf.m90938d(",")));
        } catch (IllegalArgumentException unused) {
            ((C58970a) ((C58970a) f213287a.mo56226d()).mo56372aa(3878)).mo56389s("Failed to parse map: %s.", str);
            return C58729pv.f156485a;
        }
    }

    /* renamed from: c */
    public static boolean m124111c(String str, int i) {
        if (str.equals("*")) {
            return true;
        }
        if (!str.startsWith("<")) {
            ((C58970a) ((C58970a) f213287a.mo56226d()).mo56372aa(3879)).mo56389s("Failed to parse version condition: %s.", str);
            return true;
        } else if (i < Integer.decode(str.substring(1)).intValue()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final int mo72523a() {
        return this.f213289c.mo71415a().f209312a;
    }
}
